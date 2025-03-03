package io.github.giovanniandreuzza.explicitarchitecture.core.domain.aggregates

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.events.DomainEvent
import io.github.giovanniandreuzza.explicitarchitecture.core.domain.entities.Entity

/**
 * Aggregate Root.
 *
 * @author Giovanni Andreuzza
 */
@IsAggregateRoot
public abstract class AggregateRoot<ID, AggregateEvent : DomainEvent<ID>>(id: ID, version: Int) :
    Entity<ID>(id) {

    public var version: Int = version
        private set

    private val _events = mutableListOf<AggregateEvent>()

    protected fun enqueueEvent(event: AggregateEvent) {
        ++version
        _events.add(event)
    }

    public fun dequeueEvents(): List<AggregateEvent> {
        val events = _events.toList()
        _events.clear()
        return events
    }
}