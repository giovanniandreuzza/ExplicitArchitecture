package io.github.giovanniandreuzza.explicitarchitecture.domain

import io.github.giovanniandreuzza.explicitarchitecture.shared.events.Event

/**
 * Domain Event.
 *
 * @author Giovanni Andreuzza
 */
public interface DomainEvent<ID> : Event, Domain {

    /**
     * The aggregate id.
     */
    public val aggregateId: EntityId<ID>

    /**
     * The version.
     */
    public val version: Int
}
