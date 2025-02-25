package io.github.giovanniandreuzza.explicitarchitecture.presentation.controllers.api

import io.github.giovanniandreuzza.explicitarchitecture.presentation.IsPresentation

/**
 * Is Api Controller.
 * An Api Controller is responsible for handling the incoming User interactions
 * associated with client-facing endpoints.
 *
 * @author Giovanni Andreuzza
 */
@IsPresentation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsApiController
