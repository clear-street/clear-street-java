// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdResponse
import com.clearstreet.api.services.blocking.v1.privatemarkets.IoisService
import com.clearstreet.api.services.blocking.v1.privatemarkets.OfferingService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Browse private-market offerings and their indicative terms. Access requires the account holder to
 * hold an accreditation attestation.
 */
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
    fun iois(): IoisService

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    fun offerings(): OfferingService

    /**
     * Fetch one published private-market company with its complete versioned profile. Requires the
     * account holder to have attested. Returns `404` when the company does not exist or is not yet
     * published.
     */
    fun getCompanyById(
        companyId: String,
        params: PrivateMarketGetCompanyByIdParams,
    ): PrivateMarketGetCompanyByIdResponse =
        getCompanyById(companyId, params, RequestOptions.none())

    /** @see getCompanyById */
    fun getCompanyById(
        companyId: String,
        params: PrivateMarketGetCompanyByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateMarketGetCompanyByIdResponse =
        getCompanyById(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see getCompanyById */
    fun getCompanyById(
        params: PrivateMarketGetCompanyByIdParams
    ): PrivateMarketGetCompanyByIdResponse = getCompanyById(params, RequestOptions.none())

    /** @see getCompanyById */
    fun getCompanyById(
        params: PrivateMarketGetCompanyByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateMarketGetCompanyByIdResponse

    /**
     * Fetch one private-market SPV's complete economics and fee schedule. Requires the account
     * holder to have attested. Returns `404` unless the SPV is `OPEN` and attached to a currently
     * visible `ACTIVE` offering.
     */
    fun getSpvById(
        spvId: String,
        params: PrivateMarketGetSpvByIdParams,
    ): PrivateMarketGetSpvByIdResponse = getSpvById(spvId, params, RequestOptions.none())

    /** @see getSpvById */
    fun getSpvById(
        spvId: String,
        params: PrivateMarketGetSpvByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateMarketGetSpvByIdResponse =
        getSpvById(params.toBuilder().spvId(spvId).build(), requestOptions)

    /** @see getSpvById */
    fun getSpvById(params: PrivateMarketGetSpvByIdParams): PrivateMarketGetSpvByIdResponse =
        getSpvById(params, RequestOptions.none())

    /** @see getSpvById */
    fun getSpvById(
        params: PrivateMarketGetSpvByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateMarketGetSpvByIdResponse

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
        fun iois(): IoisService.WithRawResponse

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        fun offerings(): OfferingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/private-markets/companies/{company_id}`, but is
         * otherwise the same as [PrivateMarketService.getCompanyById].
         */
        @MustBeClosed
        fun getCompanyById(
            companyId: String,
            params: PrivateMarketGetCompanyByIdParams,
        ): HttpResponseFor<PrivateMarketGetCompanyByIdResponse> =
            getCompanyById(companyId, params, RequestOptions.none())

        /** @see getCompanyById */
        @MustBeClosed
        fun getCompanyById(
            companyId: String,
            params: PrivateMarketGetCompanyByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateMarketGetCompanyByIdResponse> =
            getCompanyById(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see getCompanyById */
        @MustBeClosed
        fun getCompanyById(
            params: PrivateMarketGetCompanyByIdParams
        ): HttpResponseFor<PrivateMarketGetCompanyByIdResponse> =
            getCompanyById(params, RequestOptions.none())

        /** @see getCompanyById */
        @MustBeClosed
        fun getCompanyById(
            params: PrivateMarketGetCompanyByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateMarketGetCompanyByIdResponse>

        /**
         * Returns a raw HTTP response for `get /v1/private-markets/spvs/{spv_id}`, but is otherwise
         * the same as [PrivateMarketService.getSpvById].
         */
        @MustBeClosed
        fun getSpvById(
            spvId: String,
            params: PrivateMarketGetSpvByIdParams,
        ): HttpResponseFor<PrivateMarketGetSpvByIdResponse> =
            getSpvById(spvId, params, RequestOptions.none())

        /** @see getSpvById */
        @MustBeClosed
        fun getSpvById(
            spvId: String,
            params: PrivateMarketGetSpvByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateMarketGetSpvByIdResponse> =
            getSpvById(params.toBuilder().spvId(spvId).build(), requestOptions)

        /** @see getSpvById */
        @MustBeClosed
        fun getSpvById(
            params: PrivateMarketGetSpvByIdParams
        ): HttpResponseFor<PrivateMarketGetSpvByIdResponse> =
            getSpvById(params, RequestOptions.none())

        /** @see getSpvById */
        @MustBeClosed
        fun getSpvById(
            params: PrivateMarketGetSpvByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateMarketGetSpvByIdResponse>
    }
}
