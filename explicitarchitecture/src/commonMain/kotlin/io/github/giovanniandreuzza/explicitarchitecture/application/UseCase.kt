package io.github.giovanniandreuzza.explicitarchitecture.application

import io.github.giovanniandreuzza.explicitarchitecture.utils.KError
import io.github.giovanniandreuzza.explicitarchitecture.utils.KResult

/**
 * Use Case.
 *
 * @author Giovanni Andreuzza
 */
public interface UseCase<in Params, T, out E : KError> : Application {

    /***
     * Execute synchronously an api call.
     *
     * @params the parameters of the call
     * @return the response after launching the call
     */
    public suspend fun execute(params: Params): KResult<T, E>
}