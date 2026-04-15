// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.instruments

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.instruments.options.ContractService
import com.clear_street.api.services.blocking.active.v1.instruments.options.ContractServiceImpl
import java.util.function.Consumer

class OptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OptionService {

    private val withRawResponse: OptionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val contracts: ContractService by lazy { ContractServiceImpl(clientOptions) }

    override fun withRawResponse(): OptionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OptionService =
        OptionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Retrieve details and lists of tradable instruments. */
    override fun contracts(): ContractService = contracts

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OptionService.WithRawResponse {

        private val contracts: ContractService.WithRawResponse by lazy {
            ContractServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OptionService.WithRawResponse =
            OptionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Retrieve details and lists of tradable instruments. */
        override fun contracts(): ContractService.WithRawResponse = contracts
    }
}
