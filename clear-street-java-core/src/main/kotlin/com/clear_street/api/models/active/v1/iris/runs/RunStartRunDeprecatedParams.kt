// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.iris.runs

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.Params
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.active.v1.omniai.Capability
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** **Deprecated**: Use `POST /omni-ai/runs` instead. */
@Deprecated("deprecated")
class RunStartRunDeprecatedParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Account ID for the request
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = body.accountId()

    /**
     * The user's natural language command
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun commandText(): String = body.commandText()

    /**
     * Capabilities for structured actions
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun capabilities(): Optional<List<Capability>> = body.capabilities()

    /**
     * Optional thread ID to continue an existing conversation
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadId(): Optional<String> = body.threadId()

    /**
     * Optional title for new threads
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threadTitle(): Optional<String> = body.threadTitle()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * Returns the raw JSON value of [commandText].
     *
     * Unlike [commandText], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commandText(): JsonField<String> = body._commandText()

    /**
     * Returns the raw JSON value of [capabilities].
     *
     * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _capabilities(): JsonField<List<Capability>> = body._capabilities()

    /**
     * Returns the raw JSON value of [threadId].
     *
     * Unlike [threadId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _threadId(): JsonField<String> = body._threadId()

    /**
     * Returns the raw JSON value of [threadTitle].
     *
     * Unlike [threadTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _threadTitle(): JsonField<String> = body._threadTitle()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RunStartRunDeprecatedParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .commandText()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RunStartRunDeprecatedParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(runStartRunDeprecatedParams: RunStartRunDeprecatedParams) = apply {
            body = runStartRunDeprecatedParams.body.toBuilder()
            additionalHeaders = runStartRunDeprecatedParams.additionalHeaders.toBuilder()
            additionalQueryParams = runStartRunDeprecatedParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountId]
         * - [commandText]
         * - [capabilities]
         * - [threadId]
         * - [threadTitle]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Account ID for the request */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /** The user's natural language command */
        fun commandText(commandText: String) = apply { body.commandText(commandText) }

        /**
         * Sets [Builder.commandText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commandText] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commandText(commandText: JsonField<String>) = apply { body.commandText(commandText) }

        /** Capabilities for structured actions */
        fun capabilities(capabilities: List<Capability>) = apply { body.capabilities(capabilities) }

        /**
         * Sets [Builder.capabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capabilities] with a well-typed `List<Capability>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun capabilities(capabilities: JsonField<List<Capability>>) = apply {
            body.capabilities(capabilities)
        }

        /**
         * Adds a single [Capability] to [capabilities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCapability(capability: Capability) = apply { body.addCapability(capability) }

        /** Optional thread ID to continue an existing conversation */
        fun threadId(threadId: String?) = apply { body.threadId(threadId) }

        /** Alias for calling [Builder.threadId] with `threadId.orElse(null)`. */
        fun threadId(threadId: Optional<String>) = threadId(threadId.getOrNull())

        /**
         * Sets [Builder.threadId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun threadId(threadId: JsonField<String>) = apply { body.threadId(threadId) }

        /** Optional title for new threads */
        fun threadTitle(threadTitle: String?) = apply { body.threadTitle(threadTitle) }

        /** Alias for calling [Builder.threadTitle] with `threadTitle.orElse(null)`. */
        fun threadTitle(threadTitle: Optional<String>) = threadTitle(threadTitle.getOrNull())

        /**
         * Sets [Builder.threadTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threadTitle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun threadTitle(threadTitle: JsonField<String>) = apply { body.threadTitle(threadTitle) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [RunStartRunDeprecatedParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .commandText()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RunStartRunDeprecatedParams =
            RunStartRunDeprecatedParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val commandText: JsonField<String>,
        private val capabilities: JsonField<List<Capability>>,
        private val threadId: JsonField<String>,
        private val threadTitle: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("command_text")
            @ExcludeMissing
            commandText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("capabilities")
            @ExcludeMissing
            capabilities: JsonField<List<Capability>> = JsonMissing.of(),
            @JsonProperty("thread_id")
            @ExcludeMissing
            threadId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("thread_title")
            @ExcludeMissing
            threadTitle: JsonField<String> = JsonMissing.of(),
        ) : this(accountId, commandText, capabilities, threadId, threadTitle, mutableMapOf())

        /**
         * Account ID for the request
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The user's natural language command
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun commandText(): String = commandText.getRequired("command_text")

        /**
         * Capabilities for structured actions
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun capabilities(): Optional<List<Capability>> = capabilities.getOptional("capabilities")

        /**
         * Optional thread ID to continue an existing conversation
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun threadId(): Optional<String> = threadId.getOptional("thread_id")

        /**
         * Optional title for new threads
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun threadTitle(): Optional<String> = threadTitle.getOptional("thread_title")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [commandText].
         *
         * Unlike [commandText], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("command_text")
        @ExcludeMissing
        fun _commandText(): JsonField<String> = commandText

        /**
         * Returns the raw JSON value of [capabilities].
         *
         * Unlike [capabilities], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("capabilities")
        @ExcludeMissing
        fun _capabilities(): JsonField<List<Capability>> = capabilities

        /**
         * Returns the raw JSON value of [threadId].
         *
         * Unlike [threadId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thread_id") @ExcludeMissing fun _threadId(): JsonField<String> = threadId

        /**
         * Returns the raw JSON value of [threadTitle].
         *
         * Unlike [threadTitle], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("thread_title")
        @ExcludeMissing
        fun _threadTitle(): JsonField<String> = threadTitle

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .commandText()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var commandText: JsonField<String>? = null
            private var capabilities: JsonField<MutableList<Capability>>? = null
            private var threadId: JsonField<String> = JsonMissing.of()
            private var threadTitle: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                accountId = body.accountId
                commandText = body.commandText
                capabilities = body.capabilities.map { it.toMutableList() }
                threadId = body.threadId
                threadTitle = body.threadTitle
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Account ID for the request */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /** The user's natural language command */
            fun commandText(commandText: String) = commandText(JsonField.of(commandText))

            /**
             * Sets [Builder.commandText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commandText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commandText(commandText: JsonField<String>) = apply {
                this.commandText = commandText
            }

            /** Capabilities for structured actions */
            fun capabilities(capabilities: List<Capability>) =
                capabilities(JsonField.of(capabilities))

            /**
             * Sets [Builder.capabilities] to an arbitrary JSON value.
             *
             * You should usually call [Builder.capabilities] with a well-typed `List<Capability>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun capabilities(capabilities: JsonField<List<Capability>>) = apply {
                this.capabilities = capabilities.map { it.toMutableList() }
            }

            /**
             * Adds a single [Capability] to [capabilities].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCapability(capability: Capability) = apply {
                capabilities =
                    (capabilities ?: JsonField.of(mutableListOf())).also {
                        checkKnown("capabilities", it).add(capability)
                    }
            }

            /** Optional thread ID to continue an existing conversation */
            fun threadId(threadId: String?) = threadId(JsonField.ofNullable(threadId))

            /** Alias for calling [Builder.threadId] with `threadId.orElse(null)`. */
            fun threadId(threadId: Optional<String>) = threadId(threadId.getOrNull())

            /**
             * Sets [Builder.threadId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threadId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threadId(threadId: JsonField<String>) = apply { this.threadId = threadId }

            /** Optional title for new threads */
            fun threadTitle(threadTitle: String?) = threadTitle(JsonField.ofNullable(threadTitle))

            /** Alias for calling [Builder.threadTitle] with `threadTitle.orElse(null)`. */
            fun threadTitle(threadTitle: Optional<String>) = threadTitle(threadTitle.getOrNull())

            /**
             * Sets [Builder.threadTitle] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threadTitle] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threadTitle(threadTitle: JsonField<String>) = apply {
                this.threadTitle = threadTitle
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accountId()
             * .commandText()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("commandText", commandText),
                    (capabilities ?: JsonMissing.of()).map { it.toImmutable() },
                    threadId,
                    threadTitle,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            commandText()
            capabilities().ifPresent { it.forEach { it.validate() } }
            threadId()
            threadTitle()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: ClearStreetInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (accountId.asKnown().isPresent) 1 else 0) +
                (if (commandText.asKnown().isPresent) 1 else 0) +
                (capabilities.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (threadId.asKnown().isPresent) 1 else 0) +
                (if (threadTitle.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountId == other.accountId &&
                commandText == other.commandText &&
                capabilities == other.capabilities &&
                threadId == other.threadId &&
                threadTitle == other.threadTitle &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountId,
                commandText,
                capabilities,
                threadId,
                threadTitle,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, commandText=$commandText, capabilities=$capabilities, threadId=$threadId, threadTitle=$threadTitle, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RunStartRunDeprecatedParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "RunStartRunDeprecatedParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
