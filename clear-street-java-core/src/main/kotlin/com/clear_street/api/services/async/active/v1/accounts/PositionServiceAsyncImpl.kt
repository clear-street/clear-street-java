// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.accounts.positions.InstructionServiceAsync
import com.clear_street.api.services.async.active.v1.accounts.positions.InstructionServiceAsyncImpl
import java.util.function.Consumer

class PositionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PositionServiceAsync {

    private val withRawResponse: PositionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val instructions: InstructionServiceAsync by lazy {
        InstructionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): PositionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionServiceAsync =
        PositionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun instructions(): InstructionServiceAsync = instructions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PositionServiceAsync.WithRawResponse {

        private val instructions: InstructionServiceAsync.WithRawResponse by lazy {
            InstructionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PositionServiceAsync.WithRawResponse =
            PositionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun instructions(): InstructionServiceAsync.WithRawResponse = instructions
    }
}
