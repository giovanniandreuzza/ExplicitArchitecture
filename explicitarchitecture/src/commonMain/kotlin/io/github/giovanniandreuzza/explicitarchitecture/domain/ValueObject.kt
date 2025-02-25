package io.github.giovanniandreuzza.explicitarchitecture.domain

import io.github.giovanniandreuzza.explicitarchitecture.domain.annotations.IsValueObject

/**
 * Value Object.
 *
 * @author Giovanni Andreuzza
 */
@IsValueObject
public abstract class ValueObject {

    /**
     * Structural equality.
     */
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is ValueObject) {
            return false
        }

        if (this === other) {
            return true
        }

        return toString() == other.toString()
    }

    override fun hashCode(): Int {
        return this::class.hashCode()
    }

}