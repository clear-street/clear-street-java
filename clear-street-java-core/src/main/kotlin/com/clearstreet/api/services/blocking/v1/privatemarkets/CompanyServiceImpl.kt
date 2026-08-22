// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.services.blocking.v1.privatemarkets

import com.clearstreet.api.core.ClientOptions
import java.util.function.Consumer

class CompanyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CompanyService {

    private val withRawResponse: CompanyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CompanyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CompanyService =
        CompanyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CompanyService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CompanyService.WithRawResponse =
            CompanyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
