package io.github.giovanniandreuzza.explicitarchitecture.presentation.controllers

import io.github.giovanniandreuzza.explicitarchitecture.presentation.IsPresentation

/**
 * Is Controller.
 * A controller is responsible for handling the incoming interactions and asks the coordinator
 * to invoke the appropriate application component.
 *
 * @author Giovanni Andreuzza
 */
@IsPresentation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsController