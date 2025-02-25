package io.github.giovanniandreuzza.explicitarchitecture.core.ports

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Driven Port.
 * A driven port provides an abstraction for retrieving and persisting aggregates or entities,
 * hiding the details of the data store.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsDrivenPort
