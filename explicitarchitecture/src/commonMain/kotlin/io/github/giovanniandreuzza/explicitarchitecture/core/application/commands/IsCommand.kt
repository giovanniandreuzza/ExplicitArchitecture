package io.github.giovanniandreuzza.explicitarchitecture.core.application.commands

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Command.
 * A command defines an intent to perform changes to the domain.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsCommand
