package io.github.giovanniandreuzza.explicitarchitecture.infrastructure.adapters

import io.github.giovanniandreuzza.explicitarchitecture.infrastructure.IsInfrastructure

/**
 * Is Adapter.
 * An adapter is the implementation of a core port.
 *
 * @author Giovanni Andreuzza
 */
@IsInfrastructure
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsAdapter