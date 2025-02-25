package io.github.giovanniandreuzza.explicitarchitecture.core.application.queries

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Query.
 * A Query defines an intent to query for domain's data.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsQuery
