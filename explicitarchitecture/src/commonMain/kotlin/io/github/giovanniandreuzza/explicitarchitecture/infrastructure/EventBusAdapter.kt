package io.github.giovanniandreuzza.explicitarchitecture.infrastructure

import io.github.giovanniandreuzza.explicitarchitecture.shared.events.Event
import io.github.giovanniandreuzza.explicitarchitecture.shared.events.EventBus
import io.github.giovanniandreuzza.explicitarchitecture.shared.events.EventHandler
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlin.reflect.KClass

/**
 * An adapter implementation of the [EventBus] interface that handles event publishing and subscription
 * using Kotlin coroutines and flows.
 *
 * @property eventBusScope The coroutine scope in which event handling operations will be executed
 * @author Giovanni Andreuzza
 */
public class EventBusAdapter(
    private val eventBusScope: CoroutineScope
) : EventBus<Event>, Infrastructure {

    private val _events = MutableStateFlow<List<Event>>(emptyList())
    private val handlerMap = mutableMapOf<KClass<out Event>, MutableList<EventHandler<out Event>>>()
    private var job: Job? = null

    override fun publish(event: Event) {
        _events.update {
            listOf(event)
        }
    }

    override fun publishAll(events: List<Event>) {
        _events.update {
            events
        }
    }

    override fun <E : Event> registerHandler(
        eventType: KClass<E>,
        handler: EventHandler<E>
    ) {
        handlerMap.getOrPut(eventType) { mutableListOf() }.add(handler)
    }

    override fun start(
        onError: (Throwable) -> Unit
    ) {
        if (job != null && job!!.isActive) {
            return
        }

        val exceptionHandler = CoroutineExceptionHandler { _, exception ->
            onError(exception)
        }

        job = eventBusScope.launch(exceptionHandler) {
            _events.collect { events ->
                events.forEach { event ->
                    handlerMap.filter {
                        it.key.isInstance(event)
                    }.forEach {
                        it.value.forEach { handler ->
                            @Suppress("UNCHECKED_CAST")
                            (handler as EventHandler<Event>).handle(event)
                        }
                    }
                }
            }
        }
    }

    override fun stop() {
        job?.cancel()
        job = null
    }
}