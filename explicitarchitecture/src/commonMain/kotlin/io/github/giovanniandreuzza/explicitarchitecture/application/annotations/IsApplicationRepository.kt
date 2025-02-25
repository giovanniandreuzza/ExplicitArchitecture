package io.github.giovanniandreuzza.explicitarchitecture.application.annotations

/**
 * Is Application Repository.
 * An application repository is an interface that defines the operations that can be
 * performed on a DTO.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsApplicationRepository