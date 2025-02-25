package io.github.giovanniandreuzza.explicitarchitecture.shared.annotations

/**
 * Is Event.
 * An event represents something that happened in the past.
 *
 * @author Giovanni Andreuzza
 */
@IsShared
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsEvent