// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.services.async.v1.privatemarkets.OfferingServiceAsync
import com.clearstreet.api.services.async.v1.privatemarkets.OfferingServiceAsyncImpl
import java.util.function.Consumer

class PrivateMarketServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PrivateMarketServiceAsync {

    private val withRawResponse: PrivateMarketServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val offerings: OfferingServiceAsync by lazy { OfferingServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PrivateMarketServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrivateMarketServiceAsync =
        PrivateMarketServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    override fun offerings(): OfferingServiceAsync = offerings

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PrivateMarketServiceAsync.WithRawResponse {

        private val offerings: OfferingServiceAsync.WithRawResponse by lazy {
            OfferingServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrivateMarketServiceAsync.WithRawResponse =
            PrivateMarketServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        override fun offerings(): OfferingServiceAsync.WithRawResponse = offerings
    }
}
