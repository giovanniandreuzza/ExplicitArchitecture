package io.github.giovanniandreuzza.explicitarchitecture.presentation.drivers

import io.github.giovanniandreuzza.explicitarchitecture.presentation.IsPresentation

/**
 * Is Presentation Driver.
 * A presentation driver is the component that handles the incoming interactions and invokes the
 * appropriate controller.
 *
 * @author Giovanni Andreuzza
 */
@IsPresentation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsPresentationDriver
