package io.github.giovanniandreuzza.explicitarchitecture.core.handlers

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Command Handler.
 * A command handler is a mechanism that listens to commands and reacts to them.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsCommandHandler
