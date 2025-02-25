package io.github.giovanniandreuzza.explicitarchitecture.core.handlers

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Query Handler.
 * A query handler is a mechanism that listens to queries and reacts to them.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsQueryHandler
