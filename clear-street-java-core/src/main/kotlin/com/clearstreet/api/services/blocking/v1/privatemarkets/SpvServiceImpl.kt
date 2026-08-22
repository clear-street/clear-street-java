// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.privatemarkets

import com.clearstreet.api.core.ClientOptions
import java.util.function.Consumer

class SpvServiceImpl internal constructor(private val clientOptions: ClientOptions) : SpvService {

    private val withRawResponse: SpvService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SpvService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SpvService =
        SpvServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SpvService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SpvService.WithRawResponse =
            SpvServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
