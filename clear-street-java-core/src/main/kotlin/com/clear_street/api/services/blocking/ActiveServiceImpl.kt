// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.V1Service
import com.clear_street.api.services.blocking.active.V1ServiceImpl
import java.util.function.Consumer

class ActiveServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ActiveService {

    private val withRawResponse: ActiveService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptions) }

    override fun withRawResponse(): ActiveService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ActiveService =
        ActiveServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Active Websocket. */
    override fun v1(): V1Service = v1

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ActiveService.WithRawResponse {

        private val v1: V1Service.WithRawResponse by lazy {
            V1ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ActiveService.WithRawResponse =
            ActiveServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Active Websocket. */
        override fun v1(): V1Service.WithRawResponse = v1
    }
}
