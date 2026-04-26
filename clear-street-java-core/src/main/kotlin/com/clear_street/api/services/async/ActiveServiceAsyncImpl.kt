// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.V1ServiceAsync
import com.clear_street.api.services.async.active.V1ServiceAsyncImpl
import java.util.function.Consumer

class ActiveServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ActiveServiceAsync {

    private val withRawResponse: ActiveServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): ActiveServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActiveServiceAsync =
        ActiveServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Active Websocket. */
    override fun v1(): V1ServiceAsync = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActiveServiceAsync.WithRawResponse {

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActiveServiceAsync.WithRawResponse =
            ActiveServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Active Websocket. */
        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
