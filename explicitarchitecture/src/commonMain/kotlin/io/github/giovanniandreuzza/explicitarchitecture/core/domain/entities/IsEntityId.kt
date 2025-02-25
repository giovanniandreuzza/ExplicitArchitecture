package io.github.giovanniandreuzza.explicitarchitecture.core.domain.entities

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.IsDomain

/**
 * Is Entity Id.
 * An entity id is a value object that represents the identity of an entity.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsEntityId
