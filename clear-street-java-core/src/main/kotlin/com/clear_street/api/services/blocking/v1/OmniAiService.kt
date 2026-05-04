// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.services.blocking.v1

import com.clear_street.api.core.ClientOptions
import com.clear_street.api.services.blocking.v1.omniai.EntitlementAgreementService
import com.clear_street.api.services.blocking.v1.omniai.EntitlementService
import com.clear_street.api.services.blocking.v1.omniai.MessageService
import com.clear_street.api.services.blocking.v1.omniai.ResponseService
import com.clear_street.api.services.blocking.v1.omniai.ThreadService
import java.util.function.Consumer

interface OmniAiService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniAiService

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    fun entitlementAgreements(): EntitlementAgreementService

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    fun entitlements(): EntitlementService

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    fun messages(): MessageService

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    fun responses(): ResponseService

    /**
     * Thread-centric AI assistant for conversational trading. Create threads to start
     * conversations, poll response objects for in-progress output, and read finalized messages from
     * thread history. Thread/message/response endpoints require an explicit account_id. Entitlement
     * endpoints are caller-scoped and use trading_account_ids.
     */
    fun threads(): ThreadService

    /** A view of [OmniAiService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OmniAiService.WithRawResponse

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        fun entitlementAgreements(): EntitlementAgreementService.WithRawResponse

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        fun entitlements(): EntitlementService.WithRawResponse

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        fun messages(): MessageService.WithRawResponse

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        fun responses(): ResponseService.WithRawResponse

        /**
         * Thread-centric AI assistant for conversational trading. Create threads to start
         * conversations, poll response objects for in-progress output, and read finalized messages
         * from thread history. Thread/message/response endpoints require an explicit account_id.
         * Entitlement endpoints are caller-scoped and use trading_account_ids.
         */
        fun threads(): ThreadService.WithRawResponse
    }
}
