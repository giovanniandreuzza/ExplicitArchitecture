package io.github.giovanniandreuzza.explicitarchitecture.domain.annotations

/**
 * Is Aggregate Root.
 * An aggregate root is an entity that is the root of an aggregate.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsAggregateRoot