package io.github.giovanniandreuzza.explicitarchitecture.events

/**
 * Event Handler.
 *
 * @author Giovanni Andreuzza
 */
public interface EventHandler<T : Event> {
    public fun handle(event: T)
}