// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.instruments.options.ContractServiceAsync
import com.clear_street.api.services.async.active.v1.instruments.options.ContractServiceAsyncImpl
import java.util.function.Consumer

class OptionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OptionServiceAsync {

    private val withRawResponse: OptionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val contracts: ContractServiceAsync by lazy { ContractServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OptionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionServiceAsync =
        OptionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Retrieve details and lists of tradable instruments. */
    override fun contracts(): ContractServiceAsync = contracts

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OptionServiceAsync.WithRawResponse {

        private val contracts: ContractServiceAsync.WithRawResponse by lazy {
            ContractServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OptionServiceAsync.WithRawResponse =
            OptionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Retrieve details and lists of tradable instruments. */
        override fun contracts(): ContractServiceAsync.WithRawResponse = contracts
    }
}
