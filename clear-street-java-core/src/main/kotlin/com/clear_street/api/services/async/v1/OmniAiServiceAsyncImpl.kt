// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.async.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.async.v1.omniai.EntitlementServiceAsync
import com.clear_street.api.services.async.v1.omniai.EntitlementServiceAsyncImpl
import com.clear_street.api.services.async.v1.omniai.MessageServiceAsync
import com.clear_street.api.services.async.v1.omniai.MessageServiceAsyncImpl
import com.clear_street.api.services.async.v1.omniai.ResponseServiceAsync
import com.clear_street.api.services.async.v1.omniai.ResponseServiceAsyncImpl
import com.clear_street.api.services.async.v1.omniai.ThreadServiceAsync
import com.clear_street.api.services.async.v1.omniai.ThreadServiceAsyncImpl
import java.util.function.Consumer

class OmniAiServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OmniAiServiceAsync {

    private val withRawResponse: OmniAiServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val entitlements: EntitlementServiceAsync by lazy {
        EntitlementServiceAsyncImpl(clientOptions)
    }

    private val messages: MessageServiceAsync by lazy { MessageServiceAsyncImpl(clientOptions) }

    private val responses: ResponseServiceAsync by lazy { ResponseServiceAsyncImpl(clientOptions) }

    private val threads: ThreadServiceAsync by lazy { ThreadServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): OmniAiServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniAiServiceAsync =
        OmniAiServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use account_ids.
     */
    override fun entitlements(): EntitlementServiceAsync = entitlements

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use account_ids.
     */
    override fun messages(): MessageServiceAsync = messages

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use account_ids.
     */
    override fun responses(): ResponseServiceAsync = responses

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use account_ids.
     */
    override fun threads(): ThreadServiceAsync = threads

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OmniAiServiceAsync.WithRawResponse {

        private val entitlements: EntitlementServiceAsync.WithRawResponse by lazy {
            EntitlementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageServiceAsync.WithRawResponse by lazy {
            MessageServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val responses: ResponseServiceAsync.WithRawResponse by lazy {
            ResponseServiceAsyncImpl.WithRawResponseImpl(clientOptions)
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

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use account_ids.
         */
        override fun entitlements(): EntitlementServiceAsync.WithRawResponse = entitlements

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use account_ids.
         */
        override fun messages(): MessageServiceAsync.WithRawResponse = messages

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use account_ids.
         */
        override fun responses(): ResponseServiceAsync.WithRawResponse = responses

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use account_ids.
         */
        override fun threads(): ThreadServiceAsync.WithRawResponse = threads
    }
}
