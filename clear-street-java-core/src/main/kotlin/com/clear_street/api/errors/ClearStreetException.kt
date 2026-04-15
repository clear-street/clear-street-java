package com.clear_street.api.errors

open class ClearStreetException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
