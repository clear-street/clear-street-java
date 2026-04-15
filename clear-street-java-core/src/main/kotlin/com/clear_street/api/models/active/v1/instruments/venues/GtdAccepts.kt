// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.venues

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Good-till-date order acceptance capabilities */
class GtdAccepts
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val date: JsonField<Boolean>,
    private val timestamp: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("timestamp") @ExcludeMissing timestamp: JsonField<Boolean> = JsonMissing.of(),
    ) : this(date, timestamp, mutableMapOf())

    /**
     * Whether the venue accepts date-only expiration (YYYY-MM-DD)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): Boolean = date.getRequired("date")

    /**
     * Whether the venue accepts precise timestamp expiration
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): Boolean = timestamp.getRequired("timestamp")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<Boolean> = date

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp(): JsonField<Boolean> = timestamp

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
         * Returns a mutable builder for constructing an instance of [GtdAccepts].
         *
         * The following fields are required:
         * ```java
         * .date()
         * .timestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [GtdAccepts]. */
    class Builder internal constructor() {

        private var date: JsonField<Boolean>? = null
        private var timestamp: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(gtdAccepts: GtdAccepts) = apply {
            date = gtdAccepts.date
            timestamp = gtdAccepts.timestamp
            additionalProperties = gtdAccepts.additionalProperties.toMutableMap()
        }

        /** Whether the venue accepts date-only expiration (YYYY-MM-DD) */
        fun date(date: Boolean) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<Boolean>) = apply { this.date = date }

        /** Whether the venue accepts precise timestamp expiration */
        fun timestamp(timestamp: Boolean) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timestamp(timestamp: JsonField<Boolean>) = apply { this.timestamp = timestamp }

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
         * Returns an immutable instance of [GtdAccepts].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .date()
         * .timestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): GtdAccepts =
            GtdAccepts(
                checkRequired("date", date),
                checkRequired("timestamp", timestamp),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): GtdAccepts = apply {
        if (validated) {
            return@apply
        }

        date()
        timestamp()
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
        (if (date.asKnown().isPresent) 1 else 0) + (if (timestamp.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is GtdAccepts &&
            date == other.date &&
            timestamp == other.timestamp &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(date, timestamp, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "GtdAccepts{date=$date, timestamp=$timestamp, additionalProperties=$additionalProperties}"
}
