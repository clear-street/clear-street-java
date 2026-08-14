// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.services.blocking.v1.privatemarkets.OfferingService
import java.util.function.Consumer

interface PrivateMarketService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrivateMarketService

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    fun offerings(): OfferingService

    /**
     * A view of [PrivateMarketService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrivateMarketService.WithRawResponse

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        fun offerings(): OfferingService.WithRawResponse
    }
}
