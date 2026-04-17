// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.iris.FeedbackService
import com.clear_street.api.services.blocking.active.v1.iris.FeedbackServiceImpl
import com.clear_street.api.services.blocking.active.v1.iris.RunService
import com.clear_street.api.services.blocking.active.v1.iris.RunServiceImpl
import com.clear_street.api.services.blocking.active.v1.iris.ThreadService
import com.clear_street.api.services.blocking.active.v1.iris.ThreadServiceImpl
import java.util.function.Consumer

class IrisServiceImpl internal constructor(private val clientOptions: ClientOptions) : IrisService {

    private val withRawResponse: IrisService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val feedback: FeedbackService by lazy { FeedbackServiceImpl(clientOptions) }

    private val runs: RunService by lazy { RunServiceImpl(clientOptions) }

    private val threads: ThreadService by lazy { ThreadServiceImpl(clientOptions) }

    override fun withRawResponse(): IrisService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IrisService =
        IrisServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    override fun feedback(): FeedbackService = feedback

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    override fun runs(): RunService = runs

    /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
    override fun threads(): ThreadService = threads

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IrisService.WithRawResponse {

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
        ): IrisService.WithRawResponse =
            IrisServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        override fun feedback(): FeedbackService.WithRawResponse = feedback

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        override fun runs(): RunService.WithRawResponse = runs

        /** Deprecated /iris&#47;* routes. Use /omni-ai&#47;* instead. */
        override fun threads(): ThreadService.WithRawResponse = threads
    }
}
