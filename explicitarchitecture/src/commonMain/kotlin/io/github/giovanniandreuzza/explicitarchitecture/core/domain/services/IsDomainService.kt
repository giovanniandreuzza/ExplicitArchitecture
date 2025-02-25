package io.github.giovanniandreuzza.explicitarchitecture.core.domain.services

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.IsDomain

/**
 * Is Domain Service.
 * A domain service is responsible for handling the business logic that
 * doesn't fit into a single entity.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsDomainService
