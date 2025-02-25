package io.github.giovanniandreuzza.explicitarchitecture.presentation

/**
 * Is Controller.
 * A controller is responsible for handling the incoming User interactions
 * and invokes the appropriate Command/Query to process the User's request.
 *
 * @author Giovanni Andreuzza
 */
@IsPresentation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsController