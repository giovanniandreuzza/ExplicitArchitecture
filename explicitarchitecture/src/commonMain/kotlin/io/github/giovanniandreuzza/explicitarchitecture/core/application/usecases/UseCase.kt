package io.github.giovanniandreuzza.explicitarchitecture.core.application.usecases

import io.github.giovanniandreuzza.explicitarchitecture.core.application.IsApplication

/**
 * Use Case.
 *
 * @param Request the request to execute the use case
 * @param Response the response of the use case
 * @author Giovanni Andreuzza
 */
@IsApplication
public interface UseCase<in Request, out Response> {

    /**
     * Executes synchronously the use case.
     *
     * @params the request [Request] to execute the use case
     * @return the response [Response]
     */
    public suspend operator fun invoke(request: Request): Response
}