package com.clear_street.api.errors

class ClearStreetIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    ClearStreetException(message, cause)
