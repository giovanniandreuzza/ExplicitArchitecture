package io.github.giovanniandreuzza.explicitarchitecture.core.domain.specifications

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.IsDomain

/**
 * Is Specification.
 * A specification is a predicate that determines if an object satisfies a certain criteria.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsSpecification
