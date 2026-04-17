// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.active.v1.iris.FeedbackServiceAsync
import com.clear_street.api.services.async.active.v1.iris.FeedbackServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.iris.RunServiceAsync
import com.clear_street.api.services.async.active.v1.iris.RunServiceAsyncImpl
import com.clear_street.api.services.async.active.v1.iris.ThreadServiceAsync
import com.clear_street.api.services.async.active.v1.iris.ThreadServiceAsyncImpl
import java.util.function.Consumer

class IrisServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IrisServiceAsync {

    private val withRawResponse: IrisServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val feedback: FeedbackServiceAsync by lazy { FeedbackServiceAsyncImpl(clientOptions) }

    private val runs: RunServiceAsync by lazy { RunServiceAsyncImpl(clientOptions) }

    private val threads: ThreadServiceAsync by lazy { ThreadServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): IrisServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrisServiceAsync =
        IrisServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    override fun feedback(): FeedbackServiceAsync = feedback

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    override fun runs(): RunServiceAsync = runs

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    override fun threads(): ThreadServiceAsync = threads

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IrisServiceAsync.WithRawResponse {

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
        ): IrisServiceAsync.WithRawResponse =
            IrisServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        override fun feedback(): FeedbackServiceAsync.WithRawResponse = feedback

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        override fun runs(): RunServiceAsync.WithRawResponse = runs

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        override fun threads(): ThreadServiceAsync.WithRawResponse = threads
    }
}
