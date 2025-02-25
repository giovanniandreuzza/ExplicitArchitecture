package io.github.giovanniandreuzza.explicitarchitecture.shared

/**
 * Is Shared.
 * The shared layer is the place where the common code is implemented.
 * It is the kernel of the application.
 *
 * @author Giovanni Andreuzza
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsShared