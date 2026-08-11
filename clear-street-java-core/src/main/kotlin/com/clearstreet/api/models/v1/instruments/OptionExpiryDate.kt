// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** An options expiry date, annotated with which settlement cycles have listed contracts on it. */
class OptionExpiryDate
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val date: JsonField<LocalDate>,
    private val hasSettlesOnClose: JsonField<Boolean>,
    private val hasSettlesOnOpen: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("has_settles_on_close")
        @ExcludeMissing
        hasSettlesOnClose: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("has_settles_on_open")
        @ExcludeMissing
        hasSettlesOnOpen: JsonField<Boolean> = JsonMissing.of(),
    ) : this(date, hasSettlesOnClose, hasSettlesOnOpen, mutableMapOf())

    /**
     * The expiration date.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * Whether this date has at least one listed contract that settles at the close (PM settlement)
     * -- the standard cycle.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasSettlesOnClose(): Boolean = hasSettlesOnClose.getRequired("has_settles_on_close")

    /**
     * Whether this date has at least one listed contract that settles on the opening print (AM
     * settlement).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun hasSettlesOnOpen(): Boolean = hasSettlesOnOpen.getRequired("has_settles_on_open")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [hasSettlesOnClose].
     *
     * Unlike [hasSettlesOnClose], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("has_settles_on_close")
    @ExcludeMissing
    fun _hasSettlesOnClose(): JsonField<Boolean> = hasSettlesOnClose

    /**
     * Returns the raw JSON value of [hasSettlesOnOpen].
     *
     * Unlike [hasSettlesOnOpen], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("has_settles_on_open")
    @ExcludeMissing
    fun _hasSettlesOnOpen(): JsonField<Boolean> = hasSettlesOnOpen

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
         * Returns a mutable builder for constructing an instance of [OptionExpiryDate].
         *
         * The following fields are required:
         * ```java
         * .date()
         * .hasSettlesOnClose()
         * .hasSettlesOnOpen()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OptionExpiryDate]. */
    class Builder internal constructor() {

        private var date: JsonField<LocalDate>? = null
        private var hasSettlesOnClose: JsonField<Boolean>? = null
        private var hasSettlesOnOpen: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(optionExpiryDate: OptionExpiryDate) = apply {
            date = optionExpiryDate.date
            hasSettlesOnClose = optionExpiryDate.hasSettlesOnClose
            hasSettlesOnOpen = optionExpiryDate.hasSettlesOnOpen
            additionalProperties = optionExpiryDate.additionalProperties.toMutableMap()
        }

        /** The expiration date. */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /**
         * Whether this date has at least one listed contract that settles at the close (PM
         * settlement) -- the standard cycle.
         */
        fun hasSettlesOnClose(hasSettlesOnClose: Boolean) =
            hasSettlesOnClose(JsonField.of(hasSettlesOnClose))

        /**
         * Sets [Builder.hasSettlesOnClose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasSettlesOnClose] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasSettlesOnClose(hasSettlesOnClose: JsonField<Boolean>) = apply {
            this.hasSettlesOnClose = hasSettlesOnClose
        }

        /**
         * Whether this date has at least one listed contract that settles on the opening print (AM
         * settlement).
         */
        fun hasSettlesOnOpen(hasSettlesOnOpen: Boolean) =
            hasSettlesOnOpen(JsonField.of(hasSettlesOnOpen))

        /**
         * Sets [Builder.hasSettlesOnOpen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hasSettlesOnOpen] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hasSettlesOnOpen(hasSettlesOnOpen: JsonField<Boolean>) = apply {
            this.hasSettlesOnOpen = hasSettlesOnOpen
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
         * Returns an immutable instance of [OptionExpiryDate].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .date()
         * .hasSettlesOnClose()
         * .hasSettlesOnOpen()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OptionExpiryDate =
            OptionExpiryDate(
                checkRequired("date", date),
                checkRequired("hasSettlesOnClose", hasSettlesOnClose),
                checkRequired("hasSettlesOnOpen", hasSettlesOnOpen),
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
    fun validate(): OptionExpiryDate = apply {
        if (validated) {
            return@apply
        }

        date()
        hasSettlesOnClose()
        hasSettlesOnOpen()
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
        (if (date.asKnown().isPresent) 1 else 0) +
            (if (hasSettlesOnClose.asKnown().isPresent) 1 else 0) +
            (if (hasSettlesOnOpen.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OptionExpiryDate &&
            date == other.date &&
            hasSettlesOnClose == other.hasSettlesOnClose &&
            hasSettlesOnOpen == other.hasSettlesOnOpen &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(date, hasSettlesOnClose, hasSettlesOnOpen, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OptionExpiryDate{date=$date, hasSettlesOnClose=$hasSettlesOnClose, hasSettlesOnOpen=$hasSettlesOnOpen, additionalProperties=$additionalProperties}"
}
