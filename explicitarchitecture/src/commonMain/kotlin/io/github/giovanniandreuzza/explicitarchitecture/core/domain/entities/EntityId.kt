package io.github.giovanniandreuzza.explicitarchitecture.core.domain.entities

/**
 * Entity Id.
 *
 * @author Giovanni Andreuzza
 */
@IsEntityId
public class EntityId<ID>(id: ID) : Identifier<ID>(id)