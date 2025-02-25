package io.github.giovanniandreuzza.explicitarchitecture.domain.annotations

/**
 * Is Domain Repository.
 * A domain repository is an interface that defines the operations that can be
 * performed on a domain entity.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
public annotation class IsDomainRepository
