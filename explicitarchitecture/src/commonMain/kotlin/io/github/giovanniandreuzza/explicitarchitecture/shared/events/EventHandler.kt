package io.github.giovanniandreuzza.explicitarchitecture.shared.events

/**
 * Event Handler.
 *
 * @param T the event type
 * @author Giovanni Andreuzza
 */
public interface EventHandler<T : Event> {

    /**
     * Handle the event.
     *
     * @param event the event
     */
    public fun handle(event: T)

}