package io.github.giovanniandreuzza.explicitarchitecture.core.domain.entities

/**
 * Entity Id.
 *
 * @author Giovanni Andreuzza
 */
@IsEntityId
public class EntityId<ID>(override val id: ID) : Identifier<ID>(id)