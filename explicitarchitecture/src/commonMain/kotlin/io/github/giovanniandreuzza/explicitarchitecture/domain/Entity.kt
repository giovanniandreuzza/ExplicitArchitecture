package io.github.giovanniandreuzza.explicitarchitecture.domain

/**
 * Entity.
 *
 * @author Giovanni Andreuzza
 */
public abstract class Entity<ID>(private val _id: ID) : Domain {

    public val entityId: EntityId<ID>
        get() = EntityId(_id)

    /**
     * Identity equality.
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Entity<*>) return false
        if (other::class != this::class) return false
        return entityId == other.entityId
    }

    override fun hashCode(): Int {
        return entityId.hashCode()
    }

}
