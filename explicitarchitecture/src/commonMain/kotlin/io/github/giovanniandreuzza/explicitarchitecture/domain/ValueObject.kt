package io.github.giovanniandreuzza.explicitarchitecture.domain

/**
 * Value Object.
 *
 * @author Giovanni Andreuzza
 */
public abstract class ValueObject : Domain {

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