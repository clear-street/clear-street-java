// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.errors

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.http.Headers

abstract class ClearStreetServiceException
protected constructor(message: String, cause: Throwable? = null) :
    ClearStreetException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
