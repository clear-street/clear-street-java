// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.accounts.ExerciseService
import com.clear_street.api.services.blocking.active.v1.accounts.ExerciseServiceImpl
import java.util.function.Consumer

class AccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountService {

    private val withRawResponse: AccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val exercises: ExerciseService by lazy { ExerciseServiceImpl(clientOptions) }

    override fun withRawResponse(): AccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService =
        AccountServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun exercises(): ExerciseService = exercises

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountService.WithRawResponse {

        private val exercises: ExerciseService.WithRawResponse by lazy {
            ExerciseServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountService.WithRawResponse =
            AccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun exercises(): ExerciseService.WithRawResponse = exercises
    }
}
