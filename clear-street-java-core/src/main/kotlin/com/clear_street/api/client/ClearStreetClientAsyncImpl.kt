// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.client

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.getPackageVersion
import com.clear_street.api.services.async.V1ServiceAsync
import com.clear_street.api.services.async.V1ServiceAsyncImpl
import java.util.function.Consumer

class ClearStreetClientAsyncImpl(private val clientOptions: ClientOptions) :
    ClearStreetClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: ClearStreetClient by lazy { ClearStreetClientImpl(clientOptions) }

    private val withRawResponse: ClearStreetClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): ClearStreetClient = sync

    override fun withRawResponse(): ClearStreetClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClearStreetClientAsync =
        ClearStreetClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Active Websocket. */
    override fun v1(): V1ServiceAsync = v1

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClearStreetClientAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClearStreetClientAsync.WithRawResponse =
            ClearStreetClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Active Websocket. */
        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
