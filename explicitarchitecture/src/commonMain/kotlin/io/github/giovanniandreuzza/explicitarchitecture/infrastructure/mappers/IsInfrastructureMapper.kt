package io.github.giovanniandreuzza.explicitarchitecture.infrastructure.mappers

import io.github.giovanniandreuzza.explicitarchitecture.infrastructure.IsInfrastructure

/**
 * Is Infrastructure Mapper.
 * An infrastructure mapper is a mechanism that maps data from application to
 * infrastructure and vice versa.
 *
 * @author Giovanni Andreuzza
 */
@IsInfrastructure
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsInfrastructureMapper
