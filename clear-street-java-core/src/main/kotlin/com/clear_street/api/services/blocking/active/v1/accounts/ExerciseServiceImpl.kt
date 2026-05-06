// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import java.util.function.Consumer

class ExerciseServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExerciseService {

    private val withRawResponse: ExerciseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExerciseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExerciseService =
        ExerciseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExerciseService.WithRawResponse {

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExerciseService.WithRawResponse =
            ExerciseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )
    }
}
