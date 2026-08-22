// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.async.v1.privatemarkets

import com.clearstreet.api.core.ClientOptions
import java.util.function.Consumer

class CompanyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CompanyServiceAsync {

    private val withRawResponse: CompanyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CompanyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyServiceAsync =
        CompanyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompanyServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CompanyServiceAsync.WithRawResponse =
            CompanyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
