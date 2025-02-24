package io.github.giovanniandreuzza.explicitarchitecture.application

import io.github.giovanniandreuzza.explicitarchitecture.shared.KError
import io.github.giovanniandreuzza.explicitarchitecture.shared.KResult

/**
 * Use Case.
 *
 * @param Params the parameters to execute the use case
 * @param Response the response of the use case
 * @param Error the error of the use case
 * @author Giovanni Andreuzza
 */
public interface UseCase<in Params : Application, out Response : Application, out Error : KError> :
    Application {

    /**
     * Executes synchronously the use case.
     *
     * @params the parameters [Params] to execute the use case
     * @return [KResult] with the response [Response] or the error [Error]
     */
    public suspend fun execute(params: Params): KResult<Response, Error>
}