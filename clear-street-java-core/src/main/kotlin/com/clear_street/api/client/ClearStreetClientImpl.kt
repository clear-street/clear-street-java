// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.client

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.core.getPackageVersion
import com.clear_street.api.services.blocking.ActiveService
import com.clear_street.api.services.blocking.ActiveServiceImpl
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

    private val active: ActiveService by lazy { ActiveServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): ClearStreetClientAsync = async

    override fun withRawResponse(): ClearStreetClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ClearStreetClient =
        ClearStreetClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun active(): ActiveService = active

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ClearStreetClient.WithRawResponse {

        private val active: ActiveService.WithRawResponse by lazy {
            ActiveServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ClearStreetClient.WithRawResponse =
            ClearStreetClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun active(): ActiveService.WithRawResponse = active
    }
}
