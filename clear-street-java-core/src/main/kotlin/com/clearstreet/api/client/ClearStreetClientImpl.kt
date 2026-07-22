// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.client

import com.clearstreet.api.core.ClientOptions
import com.clearstreet.api.core.getPackageVersion
import com.clearstreet.api.services.blocking.V1Service
import com.clearstreet.api.services.blocking.V1ServiceImpl
import java.util.function.Consumer

class ClearStreetClientImpl(private val clientOptions: ClientOptions) : ClearStreetClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: ClearStreetClientAsync by lazy { ClearStreetClientAsyncImpl(clientOptions) }

    private val withRawResponse: ClearStreetClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): ClearStreetClientAsync = async

    override fun withRawResponse(): ClearStreetClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClearStreetClient =
        ClearStreetClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v1(): V1Service = v1

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClearStreetClient.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClearStreetClient.WithRawResponse =
            ClearStreetClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v1(): V1Service.WithRawResponse = v1
    }
}
