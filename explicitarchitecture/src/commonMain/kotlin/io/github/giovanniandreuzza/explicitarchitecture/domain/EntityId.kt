package io.github.giovanniandreuzza.explicitarchitecture.domain

import io.github.giovanniandreuzza.explicitarchitecture.domain.annotations.IsEntityId

/**
 * Entity Id.
 *
 * @author Giovanni Andreuzza
 */
@IsEntityId
public class EntityId<ID>(override val id: ID) : Identifier<ID>(id)