// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts.positions

import com.clear_street.api.core.ClientOptions
import java.util.function.Consumer

class InstructionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    InstructionServiceAsync {

    private val withRawResponse: InstructionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InstructionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstructionServiceAsync =
        InstructionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstructionServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstructionServiceAsync.WithRawResponse =
            InstructionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
