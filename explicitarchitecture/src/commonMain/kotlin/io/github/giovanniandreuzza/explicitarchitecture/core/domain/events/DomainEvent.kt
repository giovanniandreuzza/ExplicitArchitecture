package io.github.giovanniandreuzza.explicitarchitecture.core.domain.events

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.entities.EntityId
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
