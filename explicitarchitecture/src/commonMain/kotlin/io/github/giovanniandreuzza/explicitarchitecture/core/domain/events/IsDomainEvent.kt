package io.github.giovanniandreuzza.explicitarchitecture.core.domain.events

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.IsDomain

/**
 * Is Domain Event.
 * A domain event is an event that is relevant to the domain.
 * It is used to communicate changes that occurred in the domain.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsDomainEvent
