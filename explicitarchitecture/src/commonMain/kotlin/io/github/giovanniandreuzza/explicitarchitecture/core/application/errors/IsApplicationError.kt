package io.github.giovanniandreuzza.explicitarchitecture.core.application.errors

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.IsDomain

/**
 * Is Application Error.
 * An application error defines an error that is thrown by the application layer.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsApplicationError
