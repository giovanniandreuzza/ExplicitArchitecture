package io.github.giovanniandreuzza.explicitarchitecture.core.application.dtos

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Dto.
 * A DTO is an object that carries data between layers.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsDto