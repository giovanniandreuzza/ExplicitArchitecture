package io.github.giovanniandreuzza.explicitarchitecture.domain

/**
 * Entity Id.
 *
 * @author Giovanni Andreuzza
 */
public class EntityId<ID>(override val id: ID) : Identifier<ID>(id)