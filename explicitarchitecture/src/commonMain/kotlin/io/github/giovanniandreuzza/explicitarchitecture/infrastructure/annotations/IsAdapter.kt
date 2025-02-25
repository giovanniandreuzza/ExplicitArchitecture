package io.github.giovanniandreuzza.explicitarchitecture.infrastructure.annotations

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