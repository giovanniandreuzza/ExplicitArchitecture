package io.github.giovanniandreuzza.explicitarchitecture.core.domain.valueobjects

/**
 * Value Object.
 *
 * @author Giovanni Andreuzza
 */
@IsValueObject
public abstract class ValueObject<T>(public val value: T) {

    /**
     * Structural equality.
     */
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is ValueObject<T>) {
            return false
        }

        if (this === other) {
            return true
        }

        return value == other.value
    }

    override fun hashCode(): Int {
        return this::class.hashCode()
    }

}