// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai.entitlements

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
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Record consent and upsert one-or-more active grants. */
class EntitlementCreateEntitlementsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agreementId(): String = body.agreementId()

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestedEntitlementCodes(): List<String> = body.requestedEntitlementCodes()

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tradingAccountIds(): List<Long> = body.tradingAccountIds()

    /**
     * Returns the raw JSON value of [agreementId].
     *
     * Unlike [agreementId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _agreementId(): JsonField<String> = body._agreementId()

    /**
     * Returns the raw JSON value of [requestedEntitlementCodes].
     *
     * Unlike [requestedEntitlementCodes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _requestedEntitlementCodes(): JsonField<List<String>> = body._requestedEntitlementCodes()

    /**
     * Returns the raw JSON value of [tradingAccountIds].
     *
     * Unlike [tradingAccountIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _tradingAccountIds(): JsonField<List<Long>> = body._tradingAccountIds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EntitlementCreateEntitlementsParams].
         *
         * The following fields are required:
         * ```java
         * .agreementId()
         * .requestedEntitlementCodes()
         * .tradingAccountIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EntitlementCreateEntitlementsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            entitlementCreateEntitlementsParams: EntitlementCreateEntitlementsParams
        ) = apply {
            body = entitlementCreateEntitlementsParams.body.toBuilder()
            additionalHeaders = entitlementCreateEntitlementsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                entitlementCreateEntitlementsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [agreementId]
         * - [requestedEntitlementCodes]
         * - [tradingAccountIds]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun agreementId(agreementId: String) = apply { body.agreementId(agreementId) }

        /**
         * Sets [Builder.agreementId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agreementId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun agreementId(agreementId: JsonField<String>) = apply { body.agreementId(agreementId) }

        fun requestedEntitlementCodes(requestedEntitlementCodes: List<String>) = apply {
            body.requestedEntitlementCodes(requestedEntitlementCodes)
        }

        /**
         * Sets [Builder.requestedEntitlementCodes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestedEntitlementCodes] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun requestedEntitlementCodes(requestedEntitlementCodes: JsonField<List<String>>) = apply {
            body.requestedEntitlementCodes(requestedEntitlementCodes)
        }

        /**
         * Adds a single [String] to [requestedEntitlementCodes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRequestedEntitlementCode(requestedEntitlementCode: String) = apply {
            body.addRequestedEntitlementCode(requestedEntitlementCode)
        }

        fun tradingAccountIds(tradingAccountIds: List<Long>) = apply {
            body.tradingAccountIds(tradingAccountIds)
        }

        /**
         * Sets [Builder.tradingAccountIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tradingAccountIds] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tradingAccountIds(tradingAccountIds: JsonField<List<Long>>) = apply {
            body.tradingAccountIds(tradingAccountIds)
        }

        /**
         * Adds a single [Long] to [tradingAccountIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTradingAccountId(tradingAccountId: Long) = apply {
            body.addTradingAccountId(tradingAccountId)
        }

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
         * Returns an immutable instance of [EntitlementCreateEntitlementsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .agreementId()
         * .requestedEntitlementCodes()
         * .tradingAccountIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntitlementCreateEntitlementsParams =
            EntitlementCreateEntitlementsParams(
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
        private val agreementId: JsonField<String>,
        private val requestedEntitlementCodes: JsonField<List<String>>,
        private val tradingAccountIds: JsonField<List<Long>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("agreement_id")
            @ExcludeMissing
            agreementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requested_entitlement_codes")
            @ExcludeMissing
            requestedEntitlementCodes: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("trading_account_ids")
            @ExcludeMissing
            tradingAccountIds: JsonField<List<Long>> = JsonMissing.of(),
        ) : this(agreementId, requestedEntitlementCodes, tradingAccountIds, mutableMapOf())

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun agreementId(): String = agreementId.getRequired("agreement_id")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requestedEntitlementCodes(): List<String> =
            requestedEntitlementCodes.getRequired("requested_entitlement_codes")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun tradingAccountIds(): List<Long> = tradingAccountIds.getRequired("trading_account_ids")

        /**
         * Returns the raw JSON value of [agreementId].
         *
         * Unlike [agreementId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agreement_id")
        @ExcludeMissing
        fun _agreementId(): JsonField<String> = agreementId

        /**
         * Returns the raw JSON value of [requestedEntitlementCodes].
         *
         * Unlike [requestedEntitlementCodes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("requested_entitlement_codes")
        @ExcludeMissing
        fun _requestedEntitlementCodes(): JsonField<List<String>> = requestedEntitlementCodes

        /**
         * Returns the raw JSON value of [tradingAccountIds].
         *
         * Unlike [tradingAccountIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trading_account_ids")
        @ExcludeMissing
        fun _tradingAccountIds(): JsonField<List<Long>> = tradingAccountIds

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
             * .agreementId()
             * .requestedEntitlementCodes()
             * .tradingAccountIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var agreementId: JsonField<String>? = null
            private var requestedEntitlementCodes: JsonField<MutableList<String>>? = null
            private var tradingAccountIds: JsonField<MutableList<Long>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                agreementId = body.agreementId
                requestedEntitlementCodes =
                    body.requestedEntitlementCodes.map { it.toMutableList() }
                tradingAccountIds = body.tradingAccountIds.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun agreementId(agreementId: String) = agreementId(JsonField.of(agreementId))

            /**
             * Sets [Builder.agreementId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.agreementId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun agreementId(agreementId: JsonField<String>) = apply {
                this.agreementId = agreementId
            }

            fun requestedEntitlementCodes(requestedEntitlementCodes: List<String>) =
                requestedEntitlementCodes(JsonField.of(requestedEntitlementCodes))

            /**
             * Sets [Builder.requestedEntitlementCodes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestedEntitlementCodes] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun requestedEntitlementCodes(requestedEntitlementCodes: JsonField<List<String>>) =
                apply {
                    this.requestedEntitlementCodes =
                        requestedEntitlementCodes.map { it.toMutableList() }
                }

            /**
             * Adds a single [String] to [requestedEntitlementCodes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRequestedEntitlementCode(requestedEntitlementCode: String) = apply {
                requestedEntitlementCodes =
                    (requestedEntitlementCodes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("requestedEntitlementCodes", it).add(requestedEntitlementCode)
                    }
            }

            fun tradingAccountIds(tradingAccountIds: List<Long>) =
                tradingAccountIds(JsonField.of(tradingAccountIds))

            /**
             * Sets [Builder.tradingAccountIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tradingAccountIds] with a well-typed `List<Long>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun tradingAccountIds(tradingAccountIds: JsonField<List<Long>>) = apply {
                this.tradingAccountIds = tradingAccountIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [tradingAccountIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTradingAccountId(tradingAccountId: Long) = apply {
                tradingAccountIds =
                    (tradingAccountIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tradingAccountIds", it).add(tradingAccountId)
                    }
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
             * .agreementId()
             * .requestedEntitlementCodes()
             * .tradingAccountIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("agreementId", agreementId),
                    checkRequired("requestedEntitlementCodes", requestedEntitlementCodes).map {
                        it.toImmutable()
                    },
                    checkRequired("tradingAccountIds", tradingAccountIds).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            agreementId()
            requestedEntitlementCodes()
            tradingAccountIds()
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
            (if (agreementId.asKnown().isPresent) 1 else 0) +
                (requestedEntitlementCodes.asKnown().getOrNull()?.size ?: 0) +
                (tradingAccountIds.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                agreementId == other.agreementId &&
                requestedEntitlementCodes == other.requestedEntitlementCodes &&
                tradingAccountIds == other.tradingAccountIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                agreementId,
                requestedEntitlementCodes,
                tradingAccountIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{agreementId=$agreementId, requestedEntitlementCodes=$requestedEntitlementCodes, tradingAccountIds=$tradingAccountIds, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EntitlementCreateEntitlementsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "EntitlementCreateEntitlementsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
