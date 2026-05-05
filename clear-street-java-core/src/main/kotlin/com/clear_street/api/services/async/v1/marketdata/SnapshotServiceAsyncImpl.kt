// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1.marketdata

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
import com.clear_street.api.models.v1.marketdata.snapshot.SnapshotGetSnapshotsParams
import com.clear_street.api.models.v1.marketdata.snapshot.SnapshotGetSnapshotsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Real-time market data snapshots. */
class SnapshotServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SnapshotServiceAsync {

    private val withRawResponse: SnapshotServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SnapshotServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SnapshotServiceAsync =
        SnapshotServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getSnapshots(
        params: SnapshotGetSnapshotsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SnapshotGetSnapshotsResponse> =
        // get /v1/market-data/snapshot
        withRawResponse().getSnapshots(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SnapshotServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SnapshotServiceAsync.WithRawResponse =
            SnapshotServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getSnapshotsHandler: Handler<SnapshotGetSnapshotsResponse> =
            jsonHandler<SnapshotGetSnapshotsResponse>(clientOptions.jsonMapper)

        override fun getSnapshots(
            params: SnapshotGetSnapshotsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SnapshotGetSnapshotsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "market-data", "snapshot")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSnapshotsHandler.handle(it) }
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
