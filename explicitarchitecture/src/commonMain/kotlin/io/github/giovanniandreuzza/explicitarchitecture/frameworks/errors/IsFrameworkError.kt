package io.github.giovanniandreuzza.explicitarchitecture.frameworks.errors

import io.github.giovanniandreuzza.explicitarchitecture.frameworks.IsFramework

/**
 * Is Framework Error.
 * A framework error is an object that represents an error of the relative framework.
 *
 * @author Giovanni Andreuzza
 */
@IsFramework
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsFrameworkError
