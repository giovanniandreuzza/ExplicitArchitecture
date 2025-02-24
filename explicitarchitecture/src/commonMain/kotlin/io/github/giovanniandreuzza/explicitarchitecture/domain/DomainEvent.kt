package io.github.giovanniandreuzza.explicitarchitecture.domain

import io.github.giovanniandreuzza.explicitarchitecture.events.Event

/**
 * Domain Event.
 *
 * @author Giovanni Andreuzza
 */
public interface DomainEvent<ID> : Domain, Event {
    public val aggregateId: EntityId<ID>
    public val version: Int
}
