// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketCreateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketCreateIoiResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketDeleteIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetCompanyByIdResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetIoisParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetIoisResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetSpvByIdResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketUpdateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketUpdateIoiResponse
import com.clearstreet.api.services.async.v1.privatemarkets.CompanyServiceAsync
import com.clearstreet.api.services.async.v1.privatemarkets.IoisServiceAsync
import com.clearstreet.api.services.async.v1.privatemarkets.OfferingServiceAsync
import com.clearstreet.api.services.async.v1.privatemarkets.SpvServiceAsync
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

    fun companies(): CompanyServiceAsync

    fun iois(): IoisServiceAsync

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    fun offerings(): OfferingServiceAsync

    fun spvs(): SpvServiceAsync

    /** Create an IOI for a visible upcoming offering. */
    fun createIoi(
        params: PrivateMarketCreateIoiParams
    ): CompletableFuture<PrivateMarketCreateIoiResponse> = createIoi(params, RequestOptions.none())

    /** @see createIoi */
    fun createIoi(
        params: PrivateMarketCreateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateMarketCreateIoiResponse>

    /** Withdraw a live IOI. Repeating a withdrawal returns 404. */
    fun deleteIoi(ioiId: String, params: PrivateMarketDeleteIoiParams): CompletableFuture<Void?> =
        deleteIoi(ioiId, params, RequestOptions.none())

    /** @see deleteIoi */
    fun deleteIoi(
        ioiId: String,
        params: PrivateMarketDeleteIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = deleteIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

    /** @see deleteIoi */
    fun deleteIoi(params: PrivateMarketDeleteIoiParams): CompletableFuture<Void?> =
        deleteIoi(params, RequestOptions.none())

    /** @see deleteIoi */
    fun deleteIoi(
        params: PrivateMarketDeleteIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

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

    /** List every live IOI for the caller's account-holder entity. */
    fun getIois(
        params: PrivateMarketGetIoisParams
    ): CompletableFuture<PrivateMarketGetIoisResponse> = getIois(params, RequestOptions.none())

    /** @see getIois */
    fun getIois(
        params: PrivateMarketGetIoisParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateMarketGetIoisResponse>

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

    /** Update an IOI's notional, accepting the current NDA revision when required. */
    fun updateIoi(
        ioiId: String,
        params: PrivateMarketUpdateIoiParams,
    ): CompletableFuture<PrivateMarketUpdateIoiResponse> =
        updateIoi(ioiId, params, RequestOptions.none())

    /** @see updateIoi */
    fun updateIoi(
        ioiId: String,
        params: PrivateMarketUpdateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateMarketUpdateIoiResponse> =
        updateIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

    /** @see updateIoi */
    fun updateIoi(
        params: PrivateMarketUpdateIoiParams
    ): CompletableFuture<PrivateMarketUpdateIoiResponse> = updateIoi(params, RequestOptions.none())

    /** @see updateIoi */
    fun updateIoi(
        params: PrivateMarketUpdateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrivateMarketUpdateIoiResponse>

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

        fun companies(): CompanyServiceAsync.WithRawResponse

        fun iois(): IoisServiceAsync.WithRawResponse

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        fun offerings(): OfferingServiceAsync.WithRawResponse

        fun spvs(): SpvServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/private-markets/iois`, but is otherwise the
         * same as [PrivateMarketServiceAsync.createIoi].
         */
        fun createIoi(
            params: PrivateMarketCreateIoiParams
        ): CompletableFuture<HttpResponseFor<PrivateMarketCreateIoiResponse>> =
            createIoi(params, RequestOptions.none())

        /** @see createIoi */
        fun createIoi(
            params: PrivateMarketCreateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateMarketCreateIoiResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/private-markets/iois/{ioi_id}`, but is
         * otherwise the same as [PrivateMarketServiceAsync.deleteIoi].
         */
        fun deleteIoi(
            ioiId: String,
            params: PrivateMarketDeleteIoiParams,
        ): CompletableFuture<HttpResponse> = deleteIoi(ioiId, params, RequestOptions.none())

        /** @see deleteIoi */
        fun deleteIoi(
            ioiId: String,
            params: PrivateMarketDeleteIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

        /** @see deleteIoi */
        fun deleteIoi(params: PrivateMarketDeleteIoiParams): CompletableFuture<HttpResponse> =
            deleteIoi(params, RequestOptions.none())

        /** @see deleteIoi */
        fun deleteIoi(
            params: PrivateMarketDeleteIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

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
         * Returns a raw HTTP response for `get /v1/private-markets/iois`, but is otherwise the same
         * as [PrivateMarketServiceAsync.getIois].
         */
        fun getIois(
            params: PrivateMarketGetIoisParams
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetIoisResponse>> =
            getIois(params, RequestOptions.none())

        /** @see getIois */
        fun getIois(
            params: PrivateMarketGetIoisParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateMarketGetIoisResponse>>

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

        /**
         * Returns a raw HTTP response for `patch /v1/private-markets/iois/{ioi_id}`, but is
         * otherwise the same as [PrivateMarketServiceAsync.updateIoi].
         */
        fun updateIoi(
            ioiId: String,
            params: PrivateMarketUpdateIoiParams,
        ): CompletableFuture<HttpResponseFor<PrivateMarketUpdateIoiResponse>> =
            updateIoi(ioiId, params, RequestOptions.none())

        /** @see updateIoi */
        fun updateIoi(
            ioiId: String,
            params: PrivateMarketUpdateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateMarketUpdateIoiResponse>> =
            updateIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

        /** @see updateIoi */
        fun updateIoi(
            params: PrivateMarketUpdateIoiParams
        ): CompletableFuture<HttpResponseFor<PrivateMarketUpdateIoiResponse>> =
            updateIoi(params, RequestOptions.none())

        /** @see updateIoi */
        fun updateIoi(
            params: PrivateMarketUpdateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrivateMarketUpdateIoiResponse>>
    }
}
