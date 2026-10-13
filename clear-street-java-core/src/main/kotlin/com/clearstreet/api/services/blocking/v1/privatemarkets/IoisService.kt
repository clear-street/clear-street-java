// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.privatemarkets

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.RequestOptions
import com.clearstreet.api.core.http.HttpResponse
import com.clearstreet.api.core.http.HttpResponseFor
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisCreateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisCreateIoiResponse
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisDeleteIoiParams
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisGetIoisParams
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisGetIoisResponse
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisUpdateIoiParams
import com.clearstreet.api.models.v1.privatemarkets.iois.IoisUpdateIoiResponse
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

/**
 * Browse private-market offerings and their indicative terms. Access requires the account holder to
 * hold an accreditation attestation.
 */
interface IoisService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IoisService

    /** Create an IOI for a visible upcoming offering. */
    fun createIoi(params: IoisCreateIoiParams): IoisCreateIoiResponse =
        createIoi(params, RequestOptions.none())

    /** @see createIoi */
    fun createIoi(
        params: IoisCreateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IoisCreateIoiResponse

    /** Withdraw a live IOI. Repeating a withdrawal returns 404. */
    fun deleteIoi(ioiId: String, params: IoisDeleteIoiParams) =
        deleteIoi(ioiId, params, RequestOptions.none())

    /** @see deleteIoi */
    fun deleteIoi(
        ioiId: String,
        params: IoisDeleteIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

    /** @see deleteIoi */
    fun deleteIoi(params: IoisDeleteIoiParams) = deleteIoi(params, RequestOptions.none())

    /** @see deleteIoi */
    fun deleteIoi(
        params: IoisDeleteIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** List every live IOI for the caller's account-holder entity. */
    fun getIois(params: IoisGetIoisParams): IoisGetIoisResponse =
        getIois(params, RequestOptions.none())

    /** @see getIois */
    fun getIois(
        params: IoisGetIoisParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IoisGetIoisResponse

    /** Update an IOI's notional, accepting the current NDA revision when required. */
    fun updateIoi(ioiId: String, params: IoisUpdateIoiParams): IoisUpdateIoiResponse =
        updateIoi(ioiId, params, RequestOptions.none())

    /** @see updateIoi */
    fun updateIoi(
        ioiId: String,
        params: IoisUpdateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IoisUpdateIoiResponse = updateIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

    /** @see updateIoi */
    fun updateIoi(params: IoisUpdateIoiParams): IoisUpdateIoiResponse =
        updateIoi(params, RequestOptions.none())

    /** @see updateIoi */
    fun updateIoi(
        params: IoisUpdateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IoisUpdateIoiResponse

    /** A view of [IoisService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IoisService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/private-markets/iois`, but is otherwise the
         * same as [IoisService.createIoi].
         */
        @MustBeClosed
        fun createIoi(params: IoisCreateIoiParams): HttpResponseFor<IoisCreateIoiResponse> =
            createIoi(params, RequestOptions.none())

        /** @see createIoi */
        @MustBeClosed
        fun createIoi(
            params: IoisCreateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IoisCreateIoiResponse>

        /**
         * Returns a raw HTTP response for `delete /v1/private-markets/iois/{ioi_id}`, but is
         * otherwise the same as [IoisService.deleteIoi].
         */
        @MustBeClosed
        fun deleteIoi(ioiId: String, params: IoisDeleteIoiParams): HttpResponse =
            deleteIoi(ioiId, params, RequestOptions.none())

        /** @see deleteIoi */
        @MustBeClosed
        fun deleteIoi(
            ioiId: String,
            params: IoisDeleteIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

        /** @see deleteIoi */
        @MustBeClosed
        fun deleteIoi(params: IoisDeleteIoiParams): HttpResponse =
            deleteIoi(params, RequestOptions.none())

        /** @see deleteIoi */
        @MustBeClosed
        fun deleteIoi(
            params: IoisDeleteIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/private-markets/iois`, but is otherwise the same
         * as [IoisService.getIois].
         */
        @MustBeClosed
        fun getIois(params: IoisGetIoisParams): HttpResponseFor<IoisGetIoisResponse> =
            getIois(params, RequestOptions.none())

        /** @see getIois */
        @MustBeClosed
        fun getIois(
            params: IoisGetIoisParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IoisGetIoisResponse>

        /**
         * Returns a raw HTTP response for `patch /v1/private-markets/iois/{ioi_id}`, but is
         * otherwise the same as [IoisService.updateIoi].
         */
        @MustBeClosed
        fun updateIoi(
            ioiId: String,
            params: IoisUpdateIoiParams,
        ): HttpResponseFor<IoisUpdateIoiResponse> = updateIoi(ioiId, params, RequestOptions.none())

        /** @see updateIoi */
        @MustBeClosed
        fun updateIoi(
            ioiId: String,
            params: IoisUpdateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IoisUpdateIoiResponse> =
            updateIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

        /** @see updateIoi */
        @MustBeClosed
        fun updateIoi(params: IoisUpdateIoiParams): HttpResponseFor<IoisUpdateIoiResponse> =
            updateIoi(params, RequestOptions.none())

        /** @see updateIoi */
        @MustBeClosed
        fun updateIoi(
            params: IoisUpdateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IoisUpdateIoiResponse>
    }
}
