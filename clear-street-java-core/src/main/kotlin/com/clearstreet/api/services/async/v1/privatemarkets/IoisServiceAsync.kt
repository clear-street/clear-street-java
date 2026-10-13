// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.privatemarkets

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Browse private-market offerings and their indicative terms. Access requires the account holder to
 * hold an accreditation attestation.
 */
interface IoisServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IoisServiceAsync

    /** Create an IOI for a visible upcoming offering. */
    fun createIoi(params: IoisCreateIoiParams): CompletableFuture<IoisCreateIoiResponse> =
        createIoi(params, RequestOptions.none())

    /** @see createIoi */
    fun createIoi(
        params: IoisCreateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IoisCreateIoiResponse>

    /** Withdraw a live IOI. Repeating a withdrawal returns 404. */
    fun deleteIoi(ioiId: String, params: IoisDeleteIoiParams): CompletableFuture<Void?> =
        deleteIoi(ioiId, params, RequestOptions.none())

    /** @see deleteIoi */
    fun deleteIoi(
        ioiId: String,
        params: IoisDeleteIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = deleteIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

    /** @see deleteIoi */
    fun deleteIoi(params: IoisDeleteIoiParams): CompletableFuture<Void?> =
        deleteIoi(params, RequestOptions.none())

    /** @see deleteIoi */
    fun deleteIoi(
        params: IoisDeleteIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List every live IOI for the caller's account-holder entity. */
    fun getIois(params: IoisGetIoisParams): CompletableFuture<IoisGetIoisResponse> =
        getIois(params, RequestOptions.none())

    /** @see getIois */
    fun getIois(
        params: IoisGetIoisParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IoisGetIoisResponse>

    /** Update an IOI's notional, accepting the current NDA revision when required. */
    fun updateIoi(
        ioiId: String,
        params: IoisUpdateIoiParams,
    ): CompletableFuture<IoisUpdateIoiResponse> = updateIoi(ioiId, params, RequestOptions.none())

    /** @see updateIoi */
    fun updateIoi(
        ioiId: String,
        params: IoisUpdateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IoisUpdateIoiResponse> =
        updateIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

    /** @see updateIoi */
    fun updateIoi(params: IoisUpdateIoiParams): CompletableFuture<IoisUpdateIoiResponse> =
        updateIoi(params, RequestOptions.none())

    /** @see updateIoi */
    fun updateIoi(
        params: IoisUpdateIoiParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IoisUpdateIoiResponse>

    /** A view of [IoisServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): IoisServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/private-markets/iois`, but is otherwise the
         * same as [IoisServiceAsync.createIoi].
         */
        fun createIoi(
            params: IoisCreateIoiParams
        ): CompletableFuture<HttpResponseFor<IoisCreateIoiResponse>> =
            createIoi(params, RequestOptions.none())

        /** @see createIoi */
        fun createIoi(
            params: IoisCreateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IoisCreateIoiResponse>>

        /**
         * Returns a raw HTTP response for `delete /v1/private-markets/iois/{ioi_id}`, but is
         * otherwise the same as [IoisServiceAsync.deleteIoi].
         */
        fun deleteIoi(ioiId: String, params: IoisDeleteIoiParams): CompletableFuture<HttpResponse> =
            deleteIoi(ioiId, params, RequestOptions.none())

        /** @see deleteIoi */
        fun deleteIoi(
            ioiId: String,
            params: IoisDeleteIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

        /** @see deleteIoi */
        fun deleteIoi(params: IoisDeleteIoiParams): CompletableFuture<HttpResponse> =
            deleteIoi(params, RequestOptions.none())

        /** @see deleteIoi */
        fun deleteIoi(
            params: IoisDeleteIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /v1/private-markets/iois`, but is otherwise the same
         * as [IoisServiceAsync.getIois].
         */
        fun getIois(
            params: IoisGetIoisParams
        ): CompletableFuture<HttpResponseFor<IoisGetIoisResponse>> =
            getIois(params, RequestOptions.none())

        /** @see getIois */
        fun getIois(
            params: IoisGetIoisParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IoisGetIoisResponse>>

        /**
         * Returns a raw HTTP response for `patch /v1/private-markets/iois/{ioi_id}`, but is
         * otherwise the same as [IoisServiceAsync.updateIoi].
         */
        fun updateIoi(
            ioiId: String,
            params: IoisUpdateIoiParams,
        ): CompletableFuture<HttpResponseFor<IoisUpdateIoiResponse>> =
            updateIoi(ioiId, params, RequestOptions.none())

        /** @see updateIoi */
        fun updateIoi(
            ioiId: String,
            params: IoisUpdateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IoisUpdateIoiResponse>> =
            updateIoi(params.toBuilder().ioiId(ioiId).build(), requestOptions)

        /** @see updateIoi */
        fun updateIoi(
            params: IoisUpdateIoiParams
        ): CompletableFuture<HttpResponseFor<IoisUpdateIoiResponse>> =
            updateIoi(params, RequestOptions.none())

        /** @see updateIoi */
        fun updateIoi(
            params: IoisUpdateIoiParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IoisUpdateIoiResponse>>
    }
}
