package io.github.giovanniandreuzza.explicitarchitecture.presentation.controllers.messaging

import io.github.giovanniandreuzza.explicitarchitecture.presentation.IsPresentation

/**
 * Is Messaging Controller.
 * A messaging controller is responsible for handling the incoming messages.
 *
 * @author Giovanni Andreuzza
 */
@IsPresentation
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsMessagingController
