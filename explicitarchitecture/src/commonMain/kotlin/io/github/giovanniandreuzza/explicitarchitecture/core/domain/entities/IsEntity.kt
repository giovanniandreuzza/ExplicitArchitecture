package io.github.giovanniandreuzza.explicitarchitecture.core.domain.entities

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.IsDomain

/**
 * Is Entity.
 * An entity is an object that is defined by its identity, not by its attributes.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsEntity
