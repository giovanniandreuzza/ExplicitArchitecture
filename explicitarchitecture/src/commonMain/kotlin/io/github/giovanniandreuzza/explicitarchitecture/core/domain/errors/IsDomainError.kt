package io.github.giovanniandreuzza.explicitarchitecture.core.domain.errors

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.IsDomain

/**
 * Is Domain Error.
 * A domain error defines an error that is thrown by the domain layer.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsDomainError
