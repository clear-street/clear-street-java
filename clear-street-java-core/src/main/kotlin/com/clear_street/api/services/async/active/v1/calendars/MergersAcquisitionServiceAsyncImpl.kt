// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.calendars

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.RequestOptions
import com.clear_street.api.core.handlers.errorBodyHandler
import com.clear_street.api.core.handlers.errorHandler
import com.clear_street.api.core.handlers.jsonHandler
import com.clear_street.api.core.http.HttpMethod
import com.clear_street.api.core.http.HttpRequest
import com.clear_street.api.core.http.HttpResponse
import com.clear_street.api.core.http.HttpResponse.Handler
import com.clear_street.api.core.http.HttpResponseFor
import com.clear_street.api.core.http.parseable
import com.clear_street.api.core.prepareAsync
import com.clear_street.api.models.active.v1.calendars.mergersacquisitions.MergersAcquisitionGetMergersAndAcquisitionsCalendarParams
import com.clear_street.api.models.active.v1.calendars.mergersacquisitions.MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Access financial calendars for events like earnings, dividends, and splits. */
class MergersAcquisitionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MergersAcquisitionServiceAsync {

    private val withRawResponse: MergersAcquisitionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MergersAcquisitionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MergersAcquisitionServiceAsync =
        MergersAcquisitionServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun getMergersAndAcquisitionsCalendar(
        params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse> =
        // get /active/v1/calendars/mergers-acquisitions
        withRawResponse().getMergersAndAcquisitionsCalendar(params, requestOptions).thenApply {
            it.parse()
        }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MergersAcquisitionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MergersAcquisitionServiceAsync.WithRawResponse =
            MergersAcquisitionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getMergersAndAcquisitionsCalendarHandler:
            Handler<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse> =
            jsonHandler<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse>(
                clientOptions.jsonMapper
            )

        override fun getMergersAndAcquisitionsCalendar(
            params: MergersAcquisitionGetMergersAndAcquisitionsCalendarParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<MergersAcquisitionGetMergersAndAcquisitionsCalendarResponse>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("active", "v1", "calendars", "mergers-acquisitions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getMergersAndAcquisitionsCalendarHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
