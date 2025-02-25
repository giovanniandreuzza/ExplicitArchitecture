package io.github.giovanniandreuzza.explicitarchitecture.core.listeners

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Event Listener.
 * An event listener is a mechanism that listens to events and reacts to them.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsEventListener