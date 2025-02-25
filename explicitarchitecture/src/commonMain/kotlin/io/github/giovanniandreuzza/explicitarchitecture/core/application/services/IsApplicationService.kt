package io.github.giovanniandreuzza.explicitarchitecture.core.application.services

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Application Service.
 * An application service is responsible for orchestrating the business logic in
 * a more complex way than a use case.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsApplicationService
