// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.active.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.active.v1.omniai.EntitlementAgreementService
import com.clear_street.api.services.blocking.active.v1.omniai.EntitlementAgreementServiceImpl
import com.clear_street.api.services.blocking.active.v1.omniai.EntitlementService
import com.clear_street.api.services.blocking.active.v1.omniai.EntitlementServiceImpl
import com.clear_street.api.services.blocking.active.v1.omniai.MessageService
import com.clear_street.api.services.blocking.active.v1.omniai.MessageServiceImpl
import com.clear_street.api.services.blocking.active.v1.omniai.ResponseService
import com.clear_street.api.services.blocking.active.v1.omniai.ResponseServiceImpl
import com.clear_street.api.services.blocking.active.v1.omniai.ThreadService
import com.clear_street.api.services.blocking.active.v1.omniai.ThreadServiceImpl
import java.util.function.Consumer

class OmniAiServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OmniAiService {

    private val withRawResponse: OmniAiService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val entitlementAgreements: EntitlementAgreementService by lazy {
        EntitlementAgreementServiceImpl(clientOptions)
    }

    private val entitlements: EntitlementService by lazy { EntitlementServiceImpl(clientOptions) }

    private val messages: MessageService by lazy { MessageServiceImpl(clientOptions) }

    private val responses: ResponseService by lazy { ResponseServiceImpl(clientOptions) }

    private val threads: ThreadService by lazy { ThreadServiceImpl(clientOptions) }

    override fun withRawResponse(): OmniAiService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniAiService =
        OmniAiServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    override fun entitlementAgreements(): EntitlementAgreementService = entitlementAgreements

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    override fun entitlements(): EntitlementService = entitlements

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    override fun messages(): MessageService = messages

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    override fun responses(): ResponseService = responses

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    override fun threads(): ThreadService = threads

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OmniAiService.WithRawResponse {

        private val entitlementAgreements: EntitlementAgreementService.WithRawResponse by lazy {
            EntitlementAgreementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val entitlements: EntitlementService.WithRawResponse by lazy {
            EntitlementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val messages: MessageService.WithRawResponse by lazy {
            MessageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val responses: ResponseService.WithRawResponse by lazy {
            ResponseServiceImpl.WithRawResponseImpl(clientOptions)
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

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        override fun entitlementAgreements(): EntitlementAgreementService.WithRawResponse =
            entitlementAgreements

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        override fun entitlements(): EntitlementService.WithRawResponse = entitlements

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        override fun messages(): MessageService.WithRawResponse = messages

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        override fun responses(): ResponseService.WithRawResponse = responses

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        override fun threads(): ThreadService.WithRawResponse = threads
    }
}
