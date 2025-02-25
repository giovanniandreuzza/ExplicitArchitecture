package io.github.giovanniandreuzza.explicitarchitecture.shared.events

import io.github.giovanniandreuzza.explicitarchitecture.shared.annotations.IsEvent
import kotlinx.datetime.LocalDateTime

/**
 * Event.
 *
 * @author Giovanni Andreuzza
 */
@IsEvent
public interface Event {

    /**
     * Get the time when the event occurred.
     */
    public val occurredOn: LocalDateTime
}