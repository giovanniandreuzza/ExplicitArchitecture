package io.github.giovanniandreuzza.explicitarchitecture.infrastructure.adapters

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
 * Event Bus Adapter.
 * An adapter for the [EventBus] port that handles event publishing and subscription
 * using Kotlin coroutines and flows.
 *
 * @param T The type of event that will be handled by the event bus
 * @property eventBusScope The coroutine scope in which event handling operations will be executed
 * @author Giovanni Andreuzza
 */
@IsAdapter
public class EventBusAdapter<T : Event>(
    private val eventBusScope: CoroutineScope
) : EventBus<T> {

    private val _events = MutableStateFlow<List<T>>(emptyList())
    private val handlerMap = mutableMapOf<KClass<out T>, MutableList<EventHandler<out T>>>()
    private var job: Job? = null

    override fun publish(event: T) {
        _events.update {
            listOf(event)
        }
    }

    override fun publishAll(events: List<T>) {
        _events.update {
            events
        }
    }

    override fun <E : T> registerHandler(
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
                            // We know that the handler is of the correct type because of the filter
                            @Suppress("UNCHECKED_CAST")
                            (handler as EventHandler<T>).handle(event)
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