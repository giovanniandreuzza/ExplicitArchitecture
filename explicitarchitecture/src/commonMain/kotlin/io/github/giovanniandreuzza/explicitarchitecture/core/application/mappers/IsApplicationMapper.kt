package io.github.giovanniandreuzza.explicitarchitecture.core.application.mappers

import io.github.giovanniandreuzza.explicitarchitecture.presentation.IsPresentation

/**
 * Is Application Mapper.
 * An application mapper is a mechanism that maps data from application to
 * domain and vice versa.
 *
 * @author Giovanni Andreuzza
 */
@IsPresentation
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsApplicationMapper
