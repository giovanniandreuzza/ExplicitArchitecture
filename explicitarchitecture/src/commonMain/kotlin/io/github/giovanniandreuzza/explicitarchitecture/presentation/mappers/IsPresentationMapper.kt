package io.github.giovanniandreuzza.explicitarchitecture.presentation.mappers

import io.github.giovanniandreuzza.explicitarchitecture.presentation.IsPresentation

/**
 * Is Presentation Mapper.
 * A presentation mapper is a mechanism that maps data from presentation to
 * application and vice versa.
 *
 * @author Giovanni Andreuzza
 */
@IsPresentation
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsPresentationMapper
