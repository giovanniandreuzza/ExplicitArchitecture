package io.github.giovanniandreuzza.explicitarchitecture.infrastructure.annotations

/**
 * Is Infrastructure.
 * The infrastructure is the place where the adapters are implemented.
 * It is the driven force of the application.
 *
 * @author Giovanni Andreuzza
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsInfrastructure