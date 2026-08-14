// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.services.blocking.v1.privatemarkets.OfferingService
import com.clearstreet.api.services.blocking.v1.privatemarkets.OfferingServiceImpl
import java.util.function.Consumer

class PrivateMarketServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PrivateMarketService {

    private val withRawResponse: PrivateMarketService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val offerings: OfferingService by lazy { OfferingServiceImpl(clientOptions) }

    override fun withRawResponse(): PrivateMarketService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrivateMarketService =
        PrivateMarketServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    override fun offerings(): OfferingService = offerings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PrivateMarketService.WithRawResponse {

        private val offerings: OfferingService.WithRawResponse by lazy {
            OfferingServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrivateMarketService.WithRawResponse =
            PrivateMarketServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        override fun offerings(): OfferingService.WithRawResponse = offerings
    }
}
