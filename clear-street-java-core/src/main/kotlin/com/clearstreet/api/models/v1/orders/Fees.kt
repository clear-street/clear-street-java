// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Fees charged to the account, broken out by kind.
 *
 * Amounts are in the instrument's currency, at the full precision the venue reports. Statements
 * round each fill's fee to the cent, so they can differ by a fraction of a cent. A positive amount
 * is charged to the account; a negative amount is a rebate. New kinds of fee are added as new
 * optional fields, and `total` always includes them.
 */
class Fees
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val total: JsonField<String>,
    private val exchangeFee: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exchange_fee")
        @ExcludeMissing
        exchangeFee: JsonField<String> = JsonMissing.of(),
    ) : this(total, exchangeFee, mutableMapOf())

    /**
     * Sum of every fee component, including kinds this API version does not break out.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): String = total.getRequired("total")

    /**
     * Fee charged by the execution venue. When a null/undefined value is observed, it indicates it
     * does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exchangeFee(): Optional<String> = exchangeFee.getOptional("exchange_fee")

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

    /**
     * Returns the raw JSON value of [exchangeFee].
     *
     * Unlike [exchangeFee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exchange_fee")
    @ExcludeMissing
    fun _exchangeFee(): JsonField<String> = exchangeFee

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
         * Returns a mutable builder for constructing an instance of [Fees].
         *
         * The following fields are required:
         * ```java
         * .total()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Fees]. */
    class Builder internal constructor() {

        private var total: JsonField<String>? = null
        private var exchangeFee: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fees: Fees) = apply {
            total = fees.total
            exchangeFee = fees.exchangeFee
            additionalProperties = fees.additionalProperties.toMutableMap()
        }

        /** Sum of every fee component, including kinds this API version does not break out. */
        fun total(total: String) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<String>) = apply { this.total = total }

        /**
         * Fee charged by the execution venue. When a null/undefined value is observed, it indicates
         * it does not apply.
         */
        fun exchangeFee(exchangeFee: String?) = exchangeFee(JsonField.ofNullable(exchangeFee))

        /** Alias for calling [Builder.exchangeFee] with `exchangeFee.orElse(null)`. */
        fun exchangeFee(exchangeFee: Optional<String>) = exchangeFee(exchangeFee.getOrNull())

        /**
         * Sets [Builder.exchangeFee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exchangeFee] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun exchangeFee(exchangeFee: JsonField<String>) = apply { this.exchangeFee = exchangeFee }

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
         * Returns an immutable instance of [Fees].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .total()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Fees =
            Fees(checkRequired("total", total), exchangeFee, additionalProperties.toMutableMap())
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
    fun validate(): Fees = apply {
        if (validated) {
            return@apply
        }

        total()
        exchangeFee()
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
        (if (total.asKnown().isPresent) 1 else 0) + (if (exchangeFee.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Fees &&
            total == other.total &&
            exchangeFee == other.exchangeFee &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(total, exchangeFee, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Fees{total=$total, exchangeFee=$exchangeFee, additionalProperties=$additionalProperties}"
}
