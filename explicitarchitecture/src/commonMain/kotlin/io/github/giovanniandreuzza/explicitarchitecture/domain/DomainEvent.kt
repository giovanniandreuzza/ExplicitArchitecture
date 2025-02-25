package io.github.giovanniandreuzza.explicitarchitecture.domain

import io.github.giovanniandreuzza.explicitarchitecture.domain.annotations.IsDomainEvent
import io.github.giovanniandreuzza.explicitarchitecture.shared.events.Event

/**
 * Domain Event.
 *
 * @author Giovanni Andreuzza
 */
@IsDomainEvent
public interface DomainEvent<ID> : Event {

    /**
     * The aggregate id.
     */
    public val aggregateId: EntityId<ID>

    /**
     * The version.
     */
    public val version: Int
}
