package io.github.giovanniandreuzza.explicitarchitecture.core.domain

/**
 * Is Domain.
 * The domain layer is the place where the business logic resides.
 * It contains the aggregate roots, entities, value objects, domain services,
 * domain repositories and the domain events.
 *
 * @author Giovanni Andreuzza
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsDomain