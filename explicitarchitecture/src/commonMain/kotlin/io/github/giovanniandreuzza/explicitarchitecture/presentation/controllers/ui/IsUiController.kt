package io.github.giovanniandreuzza.explicitarchitecture.presentation.controllers.ui

import io.github.giovanniandreuzza.explicitarchitecture.presentation.IsPresentation

/**
 * Is Ui Controller.
 * A UI controller is responsible for handling the incoming User interactions with the UI.
 *
 * @author Giovanni Andreuzza
 */
@IsPresentation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsUiController
