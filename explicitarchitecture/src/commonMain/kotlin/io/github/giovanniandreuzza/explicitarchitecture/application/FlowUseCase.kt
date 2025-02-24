package io.github.giovanniandreuzza.explicitarchitecture.application

import kotlinx.coroutines.flow.Flow

/**
 * Flow Use Case.
 *
 * @param Params the parameters to execute the use case
 * @param Response the response of the use case
 * @author Giovanni Andreuzza
 */
public interface FlowUseCase<in Params : Application, out Response : Application> : Application {

    /**
     * Execute asynchronously the use case.
     *
     * @params the parameters [Params] to execute the use case
     * @return [Flow] with the response [Response]
     */
    public suspend fun execute(params: Params): Flow<Response>
}