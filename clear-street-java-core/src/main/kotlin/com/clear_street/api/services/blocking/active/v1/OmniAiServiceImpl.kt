// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.omniai.FeedbackService
import com.clear_street.api.services.blocking.active.v1.omniai.FeedbackServiceImpl
import com.clear_street.api.services.blocking.active.v1.omniai.RunService
import com.clear_street.api.services.blocking.active.v1.omniai.RunServiceImpl
import com.clear_street.api.services.blocking.active.v1.omniai.ThreadService
import com.clear_street.api.services.blocking.active.v1.omniai.ThreadServiceImpl
import java.util.function.Consumer

class OmniAiServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OmniAiService {

    private val withRawResponse: OmniAiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val feedback: FeedbackService by lazy { FeedbackServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val threads: ThreadService by lazy { ThreadServiceImpl(clientOptions) }

    override fun withRawResponse(): OmniAiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniAiService =
        OmniAiServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** AI assistant for conversational trading interactions. */
    override fun feedback(): FeedbackService = feedback

    /** AI assistant for conversational trading interactions. */
    override fun runs(): RunService = runs

    /** AI assistant for conversational trading interactions. */
    override fun threads(): ThreadService = threads

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OmniAiService.WithRawResponse {

        private val feedback: FeedbackService.WithRawResponse by lazy {
            FeedbackServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunService.WithRawResponse by lazy {
            RunServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val threads: ThreadService.WithRawResponse by lazy {
            ThreadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OmniAiService.WithRawResponse =
            OmniAiServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** AI assistant for conversational trading interactions. */
        override fun feedback(): FeedbackService.WithRawResponse = feedback

        /** AI assistant for conversational trading interactions. */
        override fun runs(): RunService.WithRawResponse = runs

        /** AI assistant for conversational trading interactions. */
        override fun threads(): ThreadService.WithRawResponse = threads
    }
}
