package io.github.giovanniandreuzza.explicitarchitecture.di

/**
 * Is DI.
 * Dependency Injection is a technique in which an object receives other objects that it depends on.
 *
 * @author Giovanni Andreuzza
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsDi
