package com.clearstreet.api.errors

class ClearStreetInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    ClearStreetException(message, cause)
