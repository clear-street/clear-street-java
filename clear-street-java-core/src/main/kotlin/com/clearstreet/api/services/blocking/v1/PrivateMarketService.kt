// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketCreateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketCreateIoiResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketDeleteIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetIoisParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketGetIoisResponse
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketUpdateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.PrivateMarketUpdateIoiResponse
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

    fun iois(): IoisService

    /**
     * Browse private-market offerings and their indicative terms. Access requires the account
     * holder to hold an accreditation attestation.
     */
    fun offerings(): OfferingService

    /** Create an IOI for a visible upcoming offering. */
    fun createIoi(params: PrivateMarketCreateIoiParams): PrivateMarketCreateIoiResponse =
        createIoi(params, RequestOptions.none())

    /** @see createIoi */
    fun createIoi(
        params: PrivateMarketCreateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateMarketCreateIoiResponse

    /** Withdraw a live IOI. Repeating a withdrawal returns 404. */
    fun deleteIoi(ioiId: String, params: PrivateMarketDeleteIoiParams) =
        deleteIoi(ioiId, params, RequestOptions.none())

    /** @see deleteIoi */
    fun deleteIoi(
        ioiId: String,
        params: PrivateMarketDeleteIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

    /** @see deleteIoi */
    fun deleteIoi(params: PrivateMarketDeleteIoiParams) = deleteIoi(params, RequestOptions.none())

    /** @see deleteIoi */
    fun deleteIoi(
        params: PrivateMarketDeleteIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List every live IOI for the caller's account-holder entity. */
    fun getIois(params: PrivateMarketGetIoisParams): PrivateMarketGetIoisResponse =
        getIois(params, RequestOptions.none())

    /** @see getIois */
    fun getIois(
        params: PrivateMarketGetIoisParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateMarketGetIoisResponse

    /** Update an IOI's notional, accepting the current NDA revision when required. */
    fun updateIoi(
        ioiId: String,
        params: PrivateMarketUpdateIoiParams,
    ): PrivateMarketUpdateIoiResponse = updateIoi(ioiId, params, RequestOptions.none())

    /** @see updateIoi */
    fun updateIoi(
        ioiId: String,
        params: PrivateMarketUpdateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateMarketUpdateIoiResponse =
        updateIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

    /** @see updateIoi */
    fun updateIoi(params: PrivateMarketUpdateIoiParams): PrivateMarketUpdateIoiResponse =
        updateIoi(params, RequestOptions.none())

    /** @see updateIoi */
    fun updateIoi(
        params: PrivateMarketUpdateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrivateMarketUpdateIoiResponse

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

        fun iois(): IoisService.WithRawResponse

        /**
         * Browse private-market offerings and their indicative terms. Access requires the account
         * holder to hold an accreditation attestation.
         */
        fun offerings(): OfferingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/private-markets/iois`, but is otherwise the
         * same as [PrivateMarketService.createIoi].
         */
        @MustBeClosed
        fun createIoi(
            params: PrivateMarketCreateIoiParams
        ): HttpResponseFor<PrivateMarketCreateIoiResponse> =
            createIoi(params, RequestOptions.none())

        /** @see createIoi */
        @MustBeClosed
        fun createIoi(
            params: PrivateMarketCreateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateMarketCreateIoiResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/private-markets/iois/{ioi_id}`, but is
         * otherwise the same as [PrivateMarketService.deleteIoi].
         */
        @MustBeClosed
        fun deleteIoi(ioiId: String, params: PrivateMarketDeleteIoiParams): HttpResponse =
            deleteIoi(ioiId, params, RequestOptions.none())

        /** @see deleteIoi */
        @MustBeClosed
        fun deleteIoi(
            ioiId: String,
            params: PrivateMarketDeleteIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

        /** @see deleteIoi */
        @MustBeClosed
        fun deleteIoi(params: PrivateMarketDeleteIoiParams): HttpResponse =
            deleteIoi(params, RequestOptions.none())

        /** @see deleteIoi */
        @MustBeClosed
        fun deleteIoi(
            params: PrivateMarketDeleteIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/private-markets/iois`, but is otherwise the same
         * as [PrivateMarketService.getIois].
         */
        @MustBeClosed
        fun getIois(
            params: PrivateMarketGetIoisParams
        ): HttpResponseFor<PrivateMarketGetIoisResponse> = getIois(params, RequestOptions.none())

        /** @see getIois */
        @MustBeClosed
        fun getIois(
            params: PrivateMarketGetIoisParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateMarketGetIoisResponse>

        /**
         * Returns a raw HTTP response for `patch /v1/private-markets/iois/{ioi_id}`, but is
         * otherwise the same as [PrivateMarketService.updateIoi].
         */
        @MustBeClosed
        fun updateIoi(
            ioiId: String,
            params: PrivateMarketUpdateIoiParams,
        ): HttpResponseFor<PrivateMarketUpdateIoiResponse> =
            updateIoi(ioiId, params, RequestOptions.none())

        /** @see updateIoi */
        @MustBeClosed
        fun updateIoi(
            ioiId: String,
            params: PrivateMarketUpdateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateMarketUpdateIoiResponse> =
            updateIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

        /** @see updateIoi */
        @MustBeClosed
        fun updateIoi(
            params: PrivateMarketUpdateIoiParams
        ): HttpResponseFor<PrivateMarketUpdateIoiResponse> =
            updateIoi(params, RequestOptions.none())

        /** @see updateIoi */
        @MustBeClosed
        fun updateIoi(
            params: PrivateMarketUpdateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrivateMarketUpdateIoiResponse>
    }
}
