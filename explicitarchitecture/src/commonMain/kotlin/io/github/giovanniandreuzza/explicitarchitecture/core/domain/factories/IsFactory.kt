package io.github.giovanniandreuzza.explicitarchitecture.core.domain.factories

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.IsDomain

/**
 * Is Factory.
 * A factory is responsible for creating domain objects.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsFactory
