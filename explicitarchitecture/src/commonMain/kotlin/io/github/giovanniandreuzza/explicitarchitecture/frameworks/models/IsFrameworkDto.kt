package io.github.giovanniandreuzza.explicitarchitecture.frameworks.models

import io.github.giovanniandreuzza.explicitarchitecture.frameworks.IsFramework

/**
 * Is Framework DTO.
 * A framework DTO is an object that represents a structure of the relative framework.
 *
 * @author Giovanni Andreuzza
 */
@IsFramework
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsFrameworkDto
