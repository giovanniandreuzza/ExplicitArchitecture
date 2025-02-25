package io.github.giovanniandreuzza.explicitarchitecture.presentation.controllers

import io.github.giovanniandreuzza.explicitarchitecture.presentation.IsPresentation

/**
 * Is Controller.
 * A controller is responsible for receiving requests from a presentation driver and invokes the
 * appropriate application component to carry out the requested action.
 *
 * @author Giovanni Andreuzza
 */
@IsPresentation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsController