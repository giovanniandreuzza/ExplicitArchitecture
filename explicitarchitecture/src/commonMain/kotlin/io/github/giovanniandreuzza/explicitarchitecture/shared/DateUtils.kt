package io.github.giovanniandreuzza.explicitarchitecture.shared

import io.github.giovanniandreuzza.explicitarchitecture.shared.annotations.IsShared
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

/**
 * Date Utils.
 *
 * @author Giovanni Andreuzza
 */
@IsShared
public object DateUtils {

    /**
     * Get the current time.
     *
     * @return [LocalDateTime] current time.
     */
    public fun now(): LocalDateTime {
        val currentMoment: Instant = Clock.System.now()
        return currentMoment.toLocalDateTime(TimeZone.UTC)
    }
}