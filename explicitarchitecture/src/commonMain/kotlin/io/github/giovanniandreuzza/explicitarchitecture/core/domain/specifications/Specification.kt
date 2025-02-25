package io.github.giovanniandreuzza.explicitarchitecture.core.domain.specifications

/**
 * Specification.
 *
 * @param T the type of the object to be verified.
 * @author Giovanni Andreuzza
 */
@IsSpecification
public interface Specification<T> {

    public fun isSatisfiedBy(candidate: T): Boolean

    public infix fun and(other: Specification<T>): Specification<T> = object : Specification<T> {
        override fun isSatisfiedBy(candidate: T): Boolean =
            this@Specification.isSatisfiedBy(candidate) && other.isSatisfiedBy(candidate)
    }

    public infix fun or(other: Specification<T>): Specification<T> = object : Specification<T> {
        override fun isSatisfiedBy(candidate: T): Boolean =
            this@Specification.isSatisfiedBy(candidate) || other.isSatisfiedBy(candidate)
    }

    public fun not(): Specification<T> = object : Specification<T> {
        override fun isSatisfiedBy(candidate: T): Boolean =
            !this@Specification.isSatisfiedBy(candidate)
    }
}