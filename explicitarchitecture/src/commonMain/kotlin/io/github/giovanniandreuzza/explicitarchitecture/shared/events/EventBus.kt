package io.github.giovanniandreuzza.explicitarchitecture.shared.events

import io.github.giovanniandreuzza.explicitarchitecture.shared.IsShared
import kotlin.reflect.KClass

/**
 * Event Bus.
 *
 * @author Giovanni Andreuzza
 */
@IsShared
public interface EventBus<T : Event> {

    /**
     * Publish the given event.
     *
     * @param event the event [T]
     */
    public fun publish(event: T)

    /**
     * Publish all the given events.
     *
     * @param events [List] of events [T]
     */
    public fun publishAll(events: List<T>)

    /**
     * Register an handler for the given event.
     *
     * @param eventType the event type [KClass] of [E]
     * @param handler the event handler [EventHandler] of [E]
     */
    public fun <E : Event> registerHandler(eventType: KClass<E>, handler: EventHandler<E>)

    /**
     * Start the event bus.
     *
     * @param onError callback for error handling
     */
    public fun start(onError: (Throwable) -> Unit)

    /**
     * Stop the event bus.
     */
    public fun stop()

}