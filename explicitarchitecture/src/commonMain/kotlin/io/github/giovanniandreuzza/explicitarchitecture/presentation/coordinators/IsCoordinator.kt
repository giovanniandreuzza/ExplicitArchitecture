package io.github.giovanniandreuzza.explicitarchitecture.presentation.coordinators

import io.github.giovanniandreuzza.explicitarchitecture.presentation.IsPresentation

/**
 * Is Coordinator.
 * A coordinator is responsible for handling controller requests and invokes the
 * appropriate application component to carry out the requested action.
 *
 * @author Giovanni Andreuzza
 */
@IsPresentation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsCoordinator
