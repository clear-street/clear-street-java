// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.accounts.PositionServiceAsync
import com.clear_street.api.services.async.active.v1.accounts.PositionServiceAsyncImpl
import java.util.function.Consumer

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val positions: PositionServiceAsync by lazy { PositionServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync =
        AccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun positions(): PositionServiceAsync = positions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val positions: PositionServiceAsync.WithRawResponse by lazy {
            PositionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse =
            AccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun positions(): PositionServiceAsync.WithRawResponse = positions
    }
}
