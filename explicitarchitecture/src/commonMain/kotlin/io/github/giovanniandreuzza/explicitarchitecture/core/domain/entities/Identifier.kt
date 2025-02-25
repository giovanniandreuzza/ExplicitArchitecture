package io.github.giovanniandreuzza.explicitarchitecture.core.domain.entities

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.IsDomain

/**
 * Identifier.
 *
 * @author Giovanni Andreuzza
 */
@IsDomain
public abstract class Identifier<ID>(public open val id: ID) {

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (other !is Identifier<*>) return false
        if (other::class != this::class) return false
        return this.id == other.id
    }

    override fun toString(): String {
        return super.toString()
    }

    override fun hashCode(): Int {
        return id.hashCode()
    }

}