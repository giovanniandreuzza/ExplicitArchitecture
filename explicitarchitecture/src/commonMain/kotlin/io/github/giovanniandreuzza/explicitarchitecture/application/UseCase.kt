package io.github.giovanniandreuzza.explicitarchitecture.application

import io.github.giovanniandreuzza.explicitarchitecture.application.annotations.IsApplication
import io.github.giovanniandreuzza.explicitarchitecture.shared.KError
import io.github.giovanniandreuzza.explicitarchitecture.shared.KResult

/**
 * Use Case.
 *
 * @param Request the request to execute the use case
 * @param Response the response of the use case
 * @param Error the error of the use case
 * @author Giovanni Andreuzza
 */
@IsApplication
public interface UseCase<in Request : Dto, out Response : Dto, out Error : KError> {

    /**
     * Executes synchronously the use case.
     *
     * @params the request [Request] to execute the use case
     * @return [KResult] with the response [Response] or the error [Error]
     */
    public suspend fun execute(request: Request): KResult<Response, Error>
}
