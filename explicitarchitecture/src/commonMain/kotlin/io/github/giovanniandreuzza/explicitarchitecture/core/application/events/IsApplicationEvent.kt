package io.github.giovanniandreuzza.explicitarchitecture.core.application.events

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Application Event.
 * An application event is a message that is sent to notify the occurrence of an event
 * in the application.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsApplicationEvent