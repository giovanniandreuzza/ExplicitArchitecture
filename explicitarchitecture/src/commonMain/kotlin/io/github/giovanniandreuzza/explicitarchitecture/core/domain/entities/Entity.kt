package io.github.giovanniandreuzza.explicitarchitecture.core.domain.entities

/**
 * Entity.
 *
 * @author Giovanni Andreuzza
 */
@IsEntity
public abstract class Entity<ID>(private val _id: ID) {

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
