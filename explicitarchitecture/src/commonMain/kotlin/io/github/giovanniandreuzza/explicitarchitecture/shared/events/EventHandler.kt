package io.github.giovanniandreuzza.explicitarchitecture.shared.events

import io.github.giovanniandreuzza.explicitarchitecture.shared.IsShared

/**
 * Event Handler.
 *
 * @param T the event type
 * @author Giovanni Andreuzza
 */
@IsShared
public interface EventHandler<T : Event> {

    /**
     * Handle the event.
     *
     * @param event the event
     */
    public suspend fun handle(event: T)

}