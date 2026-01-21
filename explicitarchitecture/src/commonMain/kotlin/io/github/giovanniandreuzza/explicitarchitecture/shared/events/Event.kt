package io.github.giovanniandreuzza.explicitarchitecture.shared.events

import kotlin.time.ExperimentalTime
import kotlin.time.Instant

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
    @OptIn(ExperimentalTime::class)
    public val occurredOn: Instant
}