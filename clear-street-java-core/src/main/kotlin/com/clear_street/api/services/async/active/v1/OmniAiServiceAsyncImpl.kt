// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.omniai.FeedbackServiceAsync
import com.clear_street.api.services.async.active.v1.omniai.FeedbackServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.omniai.RunServiceAsync
import com.clear_street.api.services.async.active.v1.omniai.RunServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.omniai.ThreadServiceAsync
import com.clear_street.api.services.async.active.v1.omniai.ThreadServiceAsyncImpl
import java.util.function.Consumer

class OmniAiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OmniAiServiceAsync {

    private val withRawResponse: OmniAiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val feedback: FeedbackServiceAsync by lazy { FeedbackServiceAsyncImpl(clientOptions) }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val threads: ThreadServiceAsync by lazy { ThreadServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OmniAiServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniAiServiceAsync =
        OmniAiServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** AI assistant for conversational trading interactions. */
    override fun feedback(): FeedbackServiceAsync = feedback

    /** AI assistant for conversational trading interactions. */
    override fun runs(): RunServiceAsync = runs

    /** AI assistant for conversational trading interactions. */
    override fun threads(): ThreadServiceAsync = threads

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OmniAiServiceAsync.WithRawResponse {

        private val feedback: FeedbackServiceAsync.WithRawResponse by lazy {
            FeedbackServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val runs: RunServiceAsync.WithRawResponse by lazy {
            RunServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val threads: ThreadServiceAsync.WithRawResponse by lazy {
            ThreadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OmniAiServiceAsync.WithRawResponse =
            OmniAiServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** AI assistant for conversational trading interactions. */
        override fun feedback(): FeedbackServiceAsync.WithRawResponse = feedback

        /** AI assistant for conversational trading interactions. */
        override fun runs(): RunServiceAsync.WithRawResponse = runs

        /** AI assistant for conversational trading interactions. */
        override fun threads(): ThreadServiceAsync.WithRawResponse = threads
    }
}
