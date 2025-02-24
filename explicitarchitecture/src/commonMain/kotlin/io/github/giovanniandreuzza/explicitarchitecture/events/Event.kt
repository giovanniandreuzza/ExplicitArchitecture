package io.github.giovanniandreuzza.explicitarchitecture.events

import kotlinx.datetime.LocalDateTime

/**
 * Event.
 *
 * @author Giovanni Andreuzza
 */
public interface Event {
    public val occurredOn: LocalDateTime
}