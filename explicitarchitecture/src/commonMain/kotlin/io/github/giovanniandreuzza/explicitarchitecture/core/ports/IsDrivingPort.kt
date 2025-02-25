package io.github.giovanniandreuzza.explicitarchitecture.core.ports

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Driving Port.
 * A driving port provides the set of actions that can be performed on the application,
 * hiding the details of the application.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsDrivingPort
