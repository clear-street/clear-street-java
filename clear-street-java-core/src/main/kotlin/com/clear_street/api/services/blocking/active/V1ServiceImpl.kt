// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.AccountService
import com.clear_street.api.services.blocking.active.v1.AccountServiceImpl
import java.util.function.Consumer

class V1ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V1Service {

    private val withRawResponse: V1Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    override fun withRawResponse(): V1Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V1Service =
        V1ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun accounts(): AccountService = accounts

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V1Service.WithRawResponse {

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V1Service.WithRawResponse =
            V1ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun accounts(): AccountService.WithRawResponse = accounts
    }
}
