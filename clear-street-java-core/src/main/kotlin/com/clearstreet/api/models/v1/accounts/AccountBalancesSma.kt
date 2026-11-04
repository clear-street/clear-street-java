// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * The intraday special memorandum account (SMA) of an account holder.
 *
 * The SMA belongs to the account holder, not to one account. The API returns it only when the
 * account holder has a single open account.
 */
class AccountBalancesSma
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val asof: JsonField<OffsetDateTime>,
    private val value: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("asof") @ExcludeMissing asof: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
    ) : this(asof, value, mutableMapOf())

    /**
     * The time the SMA was calculated as of (UTC). During a trade date the API returns the last
     * published value, so use this time to judge how current the value is.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun asof(): OffsetDateTime = asof.getRequired("asof")

    /**
     * The SMA amount in the account currency. The value can be negative.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * Returns the raw JSON value of [asof].
     *
     * Unlike [asof], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("asof") @ExcludeMissing fun _asof(): JsonField<OffsetDateTime> = asof

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
         * Returns a mutable builder for constructing an instance of [AccountBalancesSma].
         *
         * The following fields are required:
         * ```java
         * .asof()
         * .value()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountBalancesSma]. */
    class Builder internal constructor() {

        private var asof: JsonField<OffsetDateTime>? = null
        private var value: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(accountBalancesSma: AccountBalancesSma) = apply {
            asof = accountBalancesSma.asof
            value = accountBalancesSma.value
            additionalProperties = accountBalancesSma.additionalProperties.toMutableMap()
        }

        /**
         * The time the SMA was calculated as of (UTC). During a trade date the API returns the last
         * published value, so use this time to judge how current the value is.
         */
        fun asof(asof: OffsetDateTime) = asof(JsonField.of(asof))

        /**
         * Sets [Builder.asof] to an arbitrary JSON value.
         *
         * You should usually call [Builder.asof] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun asof(asof: JsonField<OffsetDateTime>) = apply { this.asof = asof }

        /** The SMA amount in the account currency. The value can be negative. */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

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
         * Returns an immutable instance of [AccountBalancesSma].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .asof()
         * .value()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountBalancesSma =
            AccountBalancesSma(
                checkRequired("asof", asof),
                checkRequired("value", value),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ClearStreetInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): AccountBalancesSma = apply {
        if (validated) {
            return@apply
        }

        asof()
        value()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (asof.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountBalancesSma &&
            asof == other.asof &&
            value == other.value &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(asof, value, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountBalancesSma{asof=$asof, value=$value, additionalProperties=$additionalProperties}"
}
