// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import java.util.function.Consumer

class ExerciseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ExerciseServiceAsync {

    private val withRawResponse: ExerciseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExerciseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExerciseServiceAsync =
        ExerciseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExerciseServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExerciseServiceAsync.WithRawResponse =
            ExerciseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
