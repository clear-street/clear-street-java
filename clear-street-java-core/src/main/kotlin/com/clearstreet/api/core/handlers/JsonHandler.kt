@file:JvmName("JsonHandler")

package com.clearstreet.api.core.handlers

import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponse.Handler
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw ClearStreetInvalidDataException("Error reading response", e)
            }
    }
