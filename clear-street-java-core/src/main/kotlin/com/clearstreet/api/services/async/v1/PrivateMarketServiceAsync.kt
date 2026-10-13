// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdResponse
import com.clearstreet.api.services.async.v1.privatemarkets.IoisServiceAsync
import com.clearstreet.api.services.async.v1.privatemarkets.OfferingServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Browse private-market offerings and their indicative terms. Access requires the account holder to
 * hold an accreditation attestation.
 */
interface PrivateMarketServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrivateMarketServiceAsync

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    fun iois(): IoisServiceAsync

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    fun offerings(): OfferingServiceAsync

    /**
     * Fetch one published private-market company with its complete versioned profile. Requires the
     * account holder to have attested. Returns `404` when the company does not exist or is not yet
     * published.
     */
    fun getCompanyById(
        companyId: String,
        params: PrivateMarketGetCompanyByIdParams,
    ): CompletableFuture<PrivateMarketGetCompanyByIdResponse> =
        getCompanyById(companyId, params, RequestOptions.none())

    /** @see getCompanyById */
    fun getCompanyById(
        companyId: String,
        params: PrivateMarketGetCompanyByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateMarketGetCompanyByIdResponse> =
        getCompanyById(params.toBuilder().companyId(companyId).build(), requestOptions)

    /** @see getCompanyById */
    fun getCompanyById(
        params: PrivateMarketGetCompanyByIdParams
    ): CompletableFuture<PrivateMarketGetCompanyByIdResponse> =
        getCompanyById(params, RequestOptions.none())

    /** @see getCompanyById */
    fun getCompanyById(
        params: PrivateMarketGetCompanyByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateMarketGetCompanyByIdResponse>

    /**
     * Fetch one private-market SPV's complete economics and fee schedule. Requires the account
     * holder to have attested. Returns `404` unless the SPV is `OPEN` and attached to a currently
     * visible `ACTIVE` offering.
     */
    fun getSpvById(
        spvId: String,
        params: PrivateMarketGetSpvByIdParams,
    ): CompletableFuture<PrivateMarketGetSpvByIdResponse> =
        getSpvById(spvId, params, RequestOptions.none())

    /** @see getSpvById */
    fun getSpvById(
        spvId: String,
        params: PrivateMarketGetSpvByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateMarketGetSpvByIdResponse> =
        getSpvById(params.toBuilder().spvId(spvId).build(), requestOptions)

    /** @see getSpvById */
    fun getSpvById(
        params: PrivateMarketGetSpvByIdParams
    ): CompletableFuture<PrivateMarketGetSpvByIdResponse> =
        getSpvById(params, RequestOptions.none())

    /** @see getSpvById */
    fun getSpvById(
        params: PrivateMarketGetSpvByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateMarketGetSpvByIdResponse>

    /**
     * A view of [PrivateMarketServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PrivateMarketServiceAsync.WithRawResponse

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        fun iois(): IoisServiceAsync.WithRawResponse

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        fun offerings(): OfferingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/private-markets/companies/{company_id}`, but is
         * otherwise the same as [PrivateMarketServiceAsync.getCompanyById].
         */
        fun getCompanyById(
            companyId: String,
            params: PrivateMarketGetCompanyByIdParams,
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetCompanyByIdResponse>> =
            getCompanyById(companyId, params, RequestOptions.none())

        /** @see getCompanyById */
        fun getCompanyById(
            companyId: String,
            params: PrivateMarketGetCompanyByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetCompanyByIdResponse>> =
            getCompanyById(params.toBuilder().companyId(companyId).build(), requestOptions)

        /** @see getCompanyById */
        fun getCompanyById(
            params: PrivateMarketGetCompanyByIdParams
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetCompanyByIdResponse>> =
            getCompanyById(params, RequestOptions.none())

        /** @see getCompanyById */
        fun getCompanyById(
            params: PrivateMarketGetCompanyByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetCompanyByIdResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/private-markets/spvs/{spv_id}`, but is otherwise
         * the same as [PrivateMarketServiceAsync.getSpvById].
         */
        fun getSpvById(
            spvId: String,
            params: PrivateMarketGetSpvByIdParams,
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetSpvByIdResponse>> =
            getSpvById(spvId, params, RequestOptions.none())

        /** @see getSpvById */
        fun getSpvById(
            spvId: String,
            params: PrivateMarketGetSpvByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetSpvByIdResponse>> =
            getSpvById(params.toBuilder().spvId(spvId).build(), requestOptions)

        /** @see getSpvById */
        fun getSpvById(
            params: PrivateMarketGetSpvByIdParams
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetSpvByIdResponse>> =
            getSpvById(params, RequestOptions.none())

        /** @see getSpvById */
        fun getSpvById(
            params: PrivateMarketGetSpvByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetSpvByIdResponse>>
    }
}
