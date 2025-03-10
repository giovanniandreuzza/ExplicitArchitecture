package io.github.giovanniandreuzza.explicitarchitecture.core.domain.valueobjects

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.IsDomain

/**
 * Is Value Object.
 * A value object is an object that is defined by its attributes, not by its identity.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsValueObject
