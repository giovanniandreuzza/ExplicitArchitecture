package io.github.giovanniandreuzza.explicitarchitecture.domain

/**
 * Identifier.
 *
 * @author Giovanni Andreuzza
 */
public abstract class Identifier<ID>(public open val id: ID) : Domain {

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
        var result = id.hashCode()
        result = 31 * result + id.hashCode()
        return result
    }

}