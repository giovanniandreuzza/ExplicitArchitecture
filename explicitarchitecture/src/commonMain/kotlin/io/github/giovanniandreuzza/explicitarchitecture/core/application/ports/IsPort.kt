package io.github.giovanniandreuzza.explicitarchitecture.core.application.ports

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Port.
 * A port provides an abstraction for retrieving and persisting aggregates or entities,
 * hiding the details of the data store.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsPort
