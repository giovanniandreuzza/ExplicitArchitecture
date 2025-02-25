package io.github.giovanniandreuzza.explicitarchitecture.core.application.usecases

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Is Use case.
 * A use case is a list of actions that are executed to achieve a particular goal.
 * It manages the domain objects and orchestrates their business logic.
 *
 * @author Giovanni Andreuzza
 */
@IsApplication
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsUseCase
