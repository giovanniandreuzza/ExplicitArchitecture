package io.github.giovanniandreuzza.explicitarchitecture.shared.utilities

import io.github.giovanniandreuzza.explicitarchitecture.shared.IsShared
import io.github.giovanniandreuzza.explicitarchitecture.shared.errors.KError
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * KResult.
 *
 * @param T the success type
 * @param E the error type extending [KError]
 * @author Giovanni Andreuzza
 */
@IsShared
public sealed class KResult<out T, out E : KError> {

    override fun toString(): String {
        return when (this) {
            is Success -> "Success[value=$value]"
            is Failure -> "Failure[error=$error]"
        }
    }
}

/**
 * Success.
 *
 * @param value the success value
 * @return [KResult] with [value] as success value
 */
@IsShared
public class Success<T>(public val value: T) : KResult<T, Nothing>()

/**
 * Failure.
 *
 * @param error the error value
 * @return [KResult] with [error] as error value
 */
@IsShared
public class Failure<out E : KError>(public val error: E) : KResult<Nothing, E>()

/**
 * Check if [KResult] is [Success].
 *
 * @return true if [KResult] is [Success], false otherwise
 */
@OptIn(ExperimentalContracts::class)
@IsShared
public fun <T, E : KError> KResult<T, E>.isSuccess(): Boolean {
    contract {
        returns(true) implies (this@isSuccess is Success<T>)
        returns(false) implies (this@isSuccess is Failure<E>)
    }
    return this is Success<T>
}

/**
 * Check if [KResult] is [Failure].
 *
 * @return true if [KResult] is [Failure], false otherwise
 */
@OptIn(ExperimentalContracts::class)
@IsShared
public fun <T, E : KError> KResult<T, E>.isFailure(): Boolean {
    contract {
        returns(false) implies (this@isFailure is Success<T>)
        returns(true) implies (this@isFailure is Failure<E>)
    }
    return this is Failure<E>
}

/**
 * Force casts [KResult] to [Success].
 *
 * @throws ClassCastException if [KResult] is not [Success]
 */
@IsShared
public fun <T, E : KError> KResult<T, E>.asSuccess(): Success<T> {
    return this as Success<T>
}

/**
 * Force casts [KResult] to [Failure].
 *
 * @throws ClassCastException if [KResult] is not [Failure]
 */
@IsShared
public fun <T, E : KError> KResult<T, E>.asFailure(): Failure<E> {
    return this as Failure<E>
}

/**
 * Invoke [action] if [KResult] is [Success].
 *
 * @param action action to invoke
 * @return [KResult] value
 */
@OptIn(ExperimentalContracts::class)
@IsShared
public inline fun <T, E : KError> KResult<T, E>.onSuccess(action: (value: T) -> Unit): KResult<T, E> {
    contract {
        callsInPlace(action, InvocationKind.AT_MOST_ONCE)
    }
    if (this.isSuccess()) action(value)
    return this
}

/**
 * Invoke [action] if [KResult] is [Failure].
 *
 * @param action action to invoke
 * @return [KResult] value
 */
@OptIn(ExperimentalContracts::class)
@IsShared
public inline fun <T, E : KError> KResult<T, E>.onFailure(action: (error: E) -> Unit): KResult<T, E> {
    contract {
        callsInPlace(action, InvocationKind.AT_MOST_ONCE)
    }
    if (this.isFailure()) action(error)
    return this
}

/**
 * Fold [KResult].
 *
 * @param onSuccess action to invoke if [KResult] is [Success]
 * @param onFailure action to invoke if [KResult] is [Failure]
 * @return [KResult] value
 */
@OptIn(ExperimentalContracts::class)
@IsShared
public inline fun <T, E : KError> KResult<T, E>.fold(
    onSuccess: (T) -> Unit,
    onFailure: (E) -> Unit
): KResult<T, E> {
    contract {
        callsInPlace(onSuccess, InvocationKind.AT_MOST_ONCE)
        callsInPlace(onFailure, InvocationKind.AT_MOST_ONCE)
    }

    when (this) {
        is Success -> onSuccess(value)
        is Failure -> onFailure(error)
    }

    return this
}

/**
 * Map the given value to [KResult].
 *
 * @return [KResult] with [E] if this is a subclass of [E], [Success] otherwise
 */
@IsShared
public inline fun <T, reified E : KError> T.toResult(): KResult<T, E> {
    if (this is E) {
        return Failure(this)
    }
    return Success(this)
}

/**
 * Map the given nullable value to [KResult].
 *
 * @return [KResult] with [E] if this is a subclass of [E], [Success] otherwise
 */
@IsShared
public inline fun <T, reified E : KError> T?.toResultOrSuccess(value: () -> T): KResult<T, E> {
    if (this == null) {
        return Success(value())
    }
    if (this is E) {
        return Failure(this)
    }
    return Success(this)
}

/**
 * Map the given nullable value to [KResult].
 *
 * @return [KResult] with [E] if this is a subclass of [E] or if this is null, [Success] otherwise
 */
@IsShared
public inline fun <T, reified E : KError> T?.toResultOrFailure(error: () -> E): KResult<T, E> {
    if (this == null) {
        return Failure(error())
    }
    if (this is E) {
        return Failure(this)
    }
    return Success(this)
}
