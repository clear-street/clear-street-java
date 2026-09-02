// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.Params
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Create an IOI for a visible upcoming offering. */
class PrivateMarketCreateIoiParams
private constructor(
    private val accountId: Long,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountId(): Long = accountId

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun notionalAmount(): String = body.notionalAmount()

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun offeringId(): String = body.offeringId()

    /**
     * Required only when the offering's attached SPV has an NDA agreement.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ndaAcceptance(): Optional<NdaAcceptance> = body.ndaAcceptance()

    /**
     * Returns the raw JSON value of [notionalAmount].
     *
     * Unlike [notionalAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _notionalAmount(): JsonField<String> = body._notionalAmount()

    /**
     * Returns the raw JSON value of [offeringId].
     *
     * Unlike [offeringId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _offeringId(): JsonField<String> = body._offeringId()

    /**
     * Returns the raw JSON value of [ndaAcceptance].
     *
     * Unlike [ndaAcceptance], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ndaAcceptance(): JsonField<NdaAcceptance> = body._ndaAcceptance()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PrivateMarketCreateIoiParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .notionalAmount()
         * .offeringId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PrivateMarketCreateIoiParams]. */
    class Builder internal constructor() {

        private var accountId: Long? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(privateMarketCreateIoiParams: PrivateMarketCreateIoiParams) = apply {
            accountId = privateMarketCreateIoiParams.accountId
            body = privateMarketCreateIoiParams.body.toBuilder()
            additionalHeaders = privateMarketCreateIoiParams.additionalHeaders.toBuilder()
            additionalQueryParams = privateMarketCreateIoiParams.additionalQueryParams.toBuilder()
        }

        fun accountId(accountId: Long) = apply { this.accountId = accountId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [notionalAmount]
         * - [offeringId]
         * - [ndaAcceptance]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun notionalAmount(notionalAmount: String) = apply { body.notionalAmount(notionalAmount) }

        /**
         * Sets [Builder.notionalAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.notionalAmount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun notionalAmount(notionalAmount: JsonField<String>) = apply {
            body.notionalAmount(notionalAmount)
        }

        fun offeringId(offeringId: String) = apply { body.offeringId(offeringId) }

        /**
         * Sets [Builder.offeringId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.offeringId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun offeringId(offeringId: JsonField<String>) = apply { body.offeringId(offeringId) }

        /** Required only when the offering's attached SPV has an NDA agreement. */
        fun ndaAcceptance(ndaAcceptance: NdaAcceptance?) = apply {
            body.ndaAcceptance(ndaAcceptance)
        }

        /** Alias for calling [Builder.ndaAcceptance] with `ndaAcceptance.orElse(null)`. */
        fun ndaAcceptance(ndaAcceptance: Optional<NdaAcceptance>) =
            ndaAcceptance(ndaAcceptance.getOrNull())

        /**
         * Sets [Builder.ndaAcceptance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ndaAcceptance] with a well-typed [NdaAcceptance] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ndaAcceptance(ndaAcceptance: JsonField<NdaAcceptance>) = apply {
            body.ndaAcceptance(ndaAcceptance)
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
         * Returns an immutable instance of [PrivateMarketCreateIoiParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * .notionalAmount()
         * .offeringId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PrivateMarketCreateIoiParams =
            PrivateMarketCreateIoiParams(
                checkRequired("accountId", accountId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                put("account_id", accountId.toString())
                putAll(additionalQueryParams)
            }
            .build()

    /** Create an indication of interest. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val notionalAmount: JsonField<String>,
        private val offeringId: JsonField<String>,
        private val ndaAcceptance: JsonField<NdaAcceptance>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("notional_amount")
            @ExcludeMissing
            notionalAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("offering_id")
            @ExcludeMissing
            offeringId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nda_acceptance")
            @ExcludeMissing
            ndaAcceptance: JsonField<NdaAcceptance> = JsonMissing.of(),
        ) : this(notionalAmount, offeringId, ndaAcceptance, mutableMapOf())

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun notionalAmount(): String = notionalAmount.getRequired("notional_amount")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun offeringId(): String = offeringId.getRequired("offering_id")

        /**
         * Required only when the offering's attached SPV has an NDA agreement.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ndaAcceptance(): Optional<NdaAcceptance> = ndaAcceptance.getOptional("nda_acceptance")

        /**
         * Returns the raw JSON value of [notionalAmount].
         *
         * Unlike [notionalAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("notional_amount")
        @ExcludeMissing
        fun _notionalAmount(): JsonField<String> = notionalAmount

        /**
         * Returns the raw JSON value of [offeringId].
         *
         * Unlike [offeringId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("offering_id")
        @ExcludeMissing
        fun _offeringId(): JsonField<String> = offeringId

        /**
         * Returns the raw JSON value of [ndaAcceptance].
         *
         * Unlike [ndaAcceptance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("nda_acceptance")
        @ExcludeMissing
        fun _ndaAcceptance(): JsonField<NdaAcceptance> = ndaAcceptance

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
             * .notionalAmount()
             * .offeringId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var notionalAmount: JsonField<String>? = null
            private var offeringId: JsonField<String>? = null
            private var ndaAcceptance: JsonField<NdaAcceptance> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                notionalAmount = body.notionalAmount
                offeringId = body.offeringId
                ndaAcceptance = body.ndaAcceptance
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun notionalAmount(notionalAmount: String) =
                notionalAmount(JsonField.of(notionalAmount))

            /**
             * Sets [Builder.notionalAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.notionalAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun notionalAmount(notionalAmount: JsonField<String>) = apply {
                this.notionalAmount = notionalAmount
            }

            fun offeringId(offeringId: String) = offeringId(JsonField.of(offeringId))

            /**
             * Sets [Builder.offeringId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.offeringId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun offeringId(offeringId: JsonField<String>) = apply { this.offeringId = offeringId }

            /** Required only when the offering's attached SPV has an NDA agreement. */
            fun ndaAcceptance(ndaAcceptance: NdaAcceptance?) =
                ndaAcceptance(JsonField.ofNullable(ndaAcceptance))

            /** Alias for calling [Builder.ndaAcceptance] with `ndaAcceptance.orElse(null)`. */
            fun ndaAcceptance(ndaAcceptance: Optional<NdaAcceptance>) =
                ndaAcceptance(ndaAcceptance.getOrNull())

            /**
             * Sets [Builder.ndaAcceptance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ndaAcceptance] with a well-typed [NdaAcceptance]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ndaAcceptance(ndaAcceptance: JsonField<NdaAcceptance>) = apply {
                this.ndaAcceptance = ndaAcceptance
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
             * .notionalAmount()
             * .offeringId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("notionalAmount", notionalAmount),
                    checkRequired("offeringId", offeringId),
                    ndaAcceptance,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            notionalAmount()
            offeringId()
            ndaAcceptance().ifPresent { it.validate() }
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
            (if (notionalAmount.asKnown().isPresent) 1 else 0) +
                (if (offeringId.asKnown().isPresent) 1 else 0) +
                (ndaAcceptance.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                notionalAmount == other.notionalAmount &&
                offeringId == other.offeringId &&
                ndaAcceptance == other.ndaAcceptance &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(notionalAmount, offeringId, ndaAcceptance, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{notionalAmount=$notionalAmount, offeringId=$offeringId, ndaAcceptance=$ndaAcceptance, additionalProperties=$additionalProperties}"
    }

    /** Required only when the offering's attached SPV has an NDA agreement. */
    class NdaAcceptance
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accepted: JsonField<Boolean>,
        private val agreementId: JsonField<String>,
        private val authorityConfirmed: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accepted")
            @ExcludeMissing
            accepted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("agreement_id")
            @ExcludeMissing
            agreementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("authority_confirmed")
            @ExcludeMissing
            authorityConfirmed: JsonField<Boolean> = JsonMissing.of(),
        ) : this(accepted, agreementId, authorityConfirmed, mutableMapOf())

        /**
         * Must be true; confirms affirmative assent.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accepted(): Boolean = accepted.getRequired("accepted")

        /**
         * Exact agreement id returned by offering detail.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun agreementId(): String = agreementId.getRequired("agreement_id")

        /**
         * Must be true; confirms the signer may bind the account-holder entity.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun authorityConfirmed(): Boolean = authorityConfirmed.getRequired("authority_confirmed")

        /**
         * Returns the raw JSON value of [accepted].
         *
         * Unlike [accepted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accepted") @ExcludeMissing fun _accepted(): JsonField<Boolean> = accepted

        /**
         * Returns the raw JSON value of [agreementId].
         *
         * Unlike [agreementId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("agreement_id")
        @ExcludeMissing
        fun _agreementId(): JsonField<String> = agreementId

        /**
         * Returns the raw JSON value of [authorityConfirmed].
         *
         * Unlike [authorityConfirmed], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("authority_confirmed")
        @ExcludeMissing
        fun _authorityConfirmed(): JsonField<Boolean> = authorityConfirmed

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
             * Returns a mutable builder for constructing an instance of [NdaAcceptance].
             *
             * The following fields are required:
             * ```java
             * .accepted()
             * .agreementId()
             * .authorityConfirmed()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [NdaAcceptance]. */
        class Builder internal constructor() {

            private var accepted: JsonField<Boolean>? = null
            private var agreementId: JsonField<String>? = null
            private var authorityConfirmed: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ndaAcceptance: NdaAcceptance) = apply {
                accepted = ndaAcceptance.accepted
                agreementId = ndaAcceptance.agreementId
                authorityConfirmed = ndaAcceptance.authorityConfirmed
                additionalProperties = ndaAcceptance.additionalProperties.toMutableMap()
            }

            /** Must be true; confirms affirmative assent. */
            fun accepted(accepted: Boolean) = accepted(JsonField.of(accepted))

            /**
             * Sets [Builder.accepted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accepted] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accepted(accepted: JsonField<Boolean>) = apply { this.accepted = accepted }

            /** Exact agreement id returned by offering detail. */
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

            /** Must be true; confirms the signer may bind the account-holder entity. */
            fun authorityConfirmed(authorityConfirmed: Boolean) =
                authorityConfirmed(JsonField.of(authorityConfirmed))

            /**
             * Sets [Builder.authorityConfirmed] to an arbitrary JSON value.
             *
             * You should usually call [Builder.authorityConfirmed] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun authorityConfirmed(authorityConfirmed: JsonField<Boolean>) = apply {
                this.authorityConfirmed = authorityConfirmed
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
             * Returns an immutable instance of [NdaAcceptance].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accepted()
             * .agreementId()
             * .authorityConfirmed()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): NdaAcceptance =
                NdaAcceptance(
                    checkRequired("accepted", accepted),
                    checkRequired("agreementId", agreementId),
                    checkRequired("authorityConfirmed", authorityConfirmed),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): NdaAcceptance = apply {
            if (validated) {
                return@apply
            }

            accepted()
            agreementId()
            authorityConfirmed()
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
            (if (accepted.asKnown().isPresent) 1 else 0) +
                (if (agreementId.asKnown().isPresent) 1 else 0) +
                (if (authorityConfirmed.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NdaAcceptance &&
                accepted == other.accepted &&
                agreementId == other.agreementId &&
                authorityConfirmed == other.authorityConfirmed &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accepted, agreementId, authorityConfirmed, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NdaAcceptance{accepted=$accepted, agreementId=$agreementId, authorityConfirmed=$authorityConfirmed, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrivateMarketCreateIoiParams &&
            accountId == other.accountId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PrivateMarketCreateIoiParams{accountId=$accountId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
