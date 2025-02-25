package io.github.giovanniandreuzza.explicitarchitecture.core.domain.aggregates

import io.github.giovanniandreuzza.explicitarchitecture.core.domain.events.DomainEvent
import io.github.giovanniandreuzza.explicitarchitecture.core.domain.entities.Entity

/**
 * Aggregate Root.
 *
 * @author Giovanni Andreuzza
 */
@IsAggregateRoot
public abstract class AggregateRoot<ID>(id: ID, version: Int) : Entity<ID>(id) {

    public var version: Int = version
        private set

    private val _events = mutableListOf<DomainEvent<ID>>()

    protected fun enqueueEvent(event: DomainEvent<ID>) {
        ++version
        _events.add(event)
    }

    public fun dequeueEvents(): List<DomainEvent<ID>> {
        val events = _events.toList()
        _events.clear()
        return events
    }
}