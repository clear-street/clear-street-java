// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.errors

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.http.Headers

abstract class ClearStreetServiceException
protected constructor(message: String, cause: Throwable? = null) :
    ClearStreetException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
