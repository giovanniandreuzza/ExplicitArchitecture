package io.github.giovanniandreuzza.explicitarchitecture.application.annotations

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