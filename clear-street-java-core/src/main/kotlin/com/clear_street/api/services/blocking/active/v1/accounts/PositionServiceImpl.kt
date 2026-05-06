// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1.accounts

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.accounts.positions.InstructionService
import com.clear_street.api.services.blocking.active.v1.accounts.positions.InstructionServiceImpl
import java.util.function.Consumer

class PositionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PositionService {

    private val withRawResponse: PositionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val instructions: InstructionService by lazy { InstructionServiceImpl(clientOptions) }

    override fun withRawResponse(): PositionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PositionService =
        PositionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun instructions(): InstructionService = instructions

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PositionService.WithRawResponse {

        private val instructions: InstructionService.WithRawResponse by lazy {
            InstructionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PositionService.WithRawResponse =
            PositionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun instructions(): InstructionService.WithRawResponse = instructions
    }
}
