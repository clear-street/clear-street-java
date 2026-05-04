// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.events

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** Represents a stock split event for an instrument */
class InstrumentSplitEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val date: JsonField<LocalDate>,
    private val denominator: JsonField<String>,
    private val numerator: JsonField<String>,
    private val splitType: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("denominator")
        @ExcludeMissing
        denominator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("numerator") @ExcludeMissing numerator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("split_type") @ExcludeMissing splitType: JsonField<String> = JsonMissing.of(),
    ) : this(date, denominator, numerator, splitType, mutableMapOf())

    /**
     * The date of the stock split
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * The denominator of the split ratio
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun denominator(): String = denominator.getRequired("denominator")

    /**
     * The numerator of the split ratio
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun numerator(): String = numerator.getRequired("numerator")

    /**
     * The type of stock split (e.g., "stock-split", "stock-dividend", "bonus-issue")
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun splitType(): String = splitType.getRequired("split_type")

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [denominator].
     *
     * Unlike [denominator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("denominator") @ExcludeMissing fun _denominator(): JsonField<String> = denominator

    /**
     * Returns the raw JSON value of [numerator].
     *
     * Unlike [numerator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("numerator") @ExcludeMissing fun _numerator(): JsonField<String> = numerator

    /**
     * Returns the raw JSON value of [splitType].
     *
     * Unlike [splitType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("split_type") @ExcludeMissing fun _splitType(): JsonField<String> = splitType

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
         * Returns a mutable builder for constructing an instance of [InstrumentSplitEvent].
         *
         * The following fields are required:
         * ```java
         * .date()
         * .denominator()
         * .numerator()
         * .splitType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentSplitEvent]. */
    class Builder internal constructor() {

        private var date: JsonField<LocalDate>? = null
        private var denominator: JsonField<String>? = null
        private var numerator: JsonField<String>? = null
        private var splitType: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentSplitEvent: InstrumentSplitEvent) = apply {
            date = instrumentSplitEvent.date
            denominator = instrumentSplitEvent.denominator
            numerator = instrumentSplitEvent.numerator
            splitType = instrumentSplitEvent.splitType
            additionalProperties = instrumentSplitEvent.additionalProperties.toMutableMap()
        }

        /** The date of the stock split */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** The denominator of the split ratio */
        fun denominator(denominator: String) = denominator(JsonField.of(denominator))

        /**
         * Sets [Builder.denominator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.denominator] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun denominator(denominator: JsonField<String>) = apply { this.denominator = denominator }

        /** The numerator of the split ratio */
        fun numerator(numerator: String) = numerator(JsonField.of(numerator))

        /**
         * Sets [Builder.numerator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.numerator] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun numerator(numerator: JsonField<String>) = apply { this.numerator = numerator }

        /** The type of stock split (e.g., "stock-split", "stock-dividend", "bonus-issue") */
        fun splitType(splitType: String) = splitType(JsonField.of(splitType))

        /**
         * Sets [Builder.splitType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.splitType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun splitType(splitType: JsonField<String>) = apply { this.splitType = splitType }

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
         * Returns an immutable instance of [InstrumentSplitEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .date()
         * .denominator()
         * .numerator()
         * .splitType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentSplitEvent =
            InstrumentSplitEvent(
                checkRequired("date", date),
                checkRequired("denominator", denominator),
                checkRequired("numerator", numerator),
                checkRequired("splitType", splitType),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InstrumentSplitEvent = apply {
        if (validated) {
            return@apply
        }

        date()
        denominator()
        numerator()
        splitType()
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
            (if (denominator.asKnown().isPresent) 1 else 0) +
            (if (numerator.asKnown().isPresent) 1 else 0) +
            (if (splitType.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentSplitEvent &&
            date == other.date &&
            denominator == other.denominator &&
            numerator == other.numerator &&
            splitType == other.splitType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(date, denominator, numerator, splitType, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentSplitEvent{date=$date, denominator=$denominator, numerator=$numerator, splitType=$splitType, additionalProperties=$additionalProperties}"
}
