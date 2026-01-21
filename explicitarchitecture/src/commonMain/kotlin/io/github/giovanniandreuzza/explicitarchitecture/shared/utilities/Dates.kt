package io.github.giovanniandreuzza.explicitarchitecture.shared.utilities

import io.github.giovanniandreuzza.explicitarchitecture.shared.IsShared
import kotlin.time.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

/**
 * Dates.
 *
 * @author Giovanni Andreuzza
 */
@IsShared
public object Dates {

    /**
     * Get the current time.
     *
     * @return [Instant] current time.
     */
    @OptIn(ExperimentalTime::class)
    public fun now(): Instant {
        return Clock.System.now()
    }
}