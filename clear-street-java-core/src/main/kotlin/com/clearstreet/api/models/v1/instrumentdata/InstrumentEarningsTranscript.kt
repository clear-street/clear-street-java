// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata

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
import kotlin.jvm.optionals.getOrNull

/** An earnings call transcript for one fiscal quarter. */
class InstrumentEarningsTranscript
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val content: JsonField<String>,
    private val date: JsonField<LocalDate>,
    private val period: JsonField<FiscalQuarter>,
    private val periodType: JsonField<FiscalPeriodType>,
    private val year: JsonField<Int>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("content") @ExcludeMissing content: JsonField<String> = JsonMissing.of(),
        @JsonProperty("date") @ExcludeMissing date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<FiscalQuarter> = JsonMissing.of(),
        @JsonProperty("period_type")
        @ExcludeMissing
        periodType: JsonField<FiscalPeriodType> = JsonMissing.of(),
        @JsonProperty("year") @ExcludeMissing year: JsonField<Int> = JsonMissing.of(),
    ) : this(content, date, period, periodType, year, mutableMapOf())

    /**
     * The full text of the transcript
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun content(): String = content.getRequired("content")

    /**
     * The date of the earnings call
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun date(): LocalDate = date.getRequired("date")

    /**
     * The fiscal quarter of the call
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun period(): FiscalQuarter = period.getRequired("period")

    /**
     * The type of fiscal period. Always `QUARTERLY`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodType(): FiscalPeriodType = periodType.getRequired("period_type")

    /**
     * The fiscal year of the call
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun year(): Int = year.getRequired("year")

    /**
     * Returns the raw JSON value of [content].
     *
     * Unlike [content], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

    /**
     * Returns the raw JSON value of [date].
     *
     * Unlike [date], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<FiscalQuarter> = period

    /**
     * Returns the raw JSON value of [periodType].
     *
     * Unlike [periodType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_type")
    @ExcludeMissing
    fun _periodType(): JsonField<FiscalPeriodType> = periodType

    /**
     * Returns the raw JSON value of [year].
     *
     * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Int> = year

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
         * Returns a mutable builder for constructing an instance of [InstrumentEarningsTranscript].
         *
         * The following fields are required:
         * ```java
         * .content()
         * .date()
         * .period()
         * .periodType()
         * .year()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentEarningsTranscript]. */
    class Builder internal constructor() {

        private var content: JsonField<String>? = null
        private var date: JsonField<LocalDate>? = null
        private var period: JsonField<FiscalQuarter>? = null
        private var periodType: JsonField<FiscalPeriodType>? = null
        private var year: JsonField<Int>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentEarningsTranscript: InstrumentEarningsTranscript) = apply {
            content = instrumentEarningsTranscript.content
            date = instrumentEarningsTranscript.date
            period = instrumentEarningsTranscript.period
            periodType = instrumentEarningsTranscript.periodType
            year = instrumentEarningsTranscript.year
            additionalProperties = instrumentEarningsTranscript.additionalProperties.toMutableMap()
        }

        /** The full text of the transcript */
        fun content(content: String) = content(JsonField.of(content))

        /**
         * Sets [Builder.content] to an arbitrary JSON value.
         *
         * You should usually call [Builder.content] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun content(content: JsonField<String>) = apply { this.content = content }

        /** The date of the earnings call */
        fun date(date: LocalDate) = date(JsonField.of(date))

        /**
         * Sets [Builder.date] to an arbitrary JSON value.
         *
         * You should usually call [Builder.date] with a well-typed [LocalDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun date(date: JsonField<LocalDate>) = apply { this.date = date }

        /** The fiscal quarter of the call */
        fun period(period: FiscalQuarter) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [FiscalQuarter] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun period(period: JsonField<FiscalQuarter>) = apply { this.period = period }

        /** The type of fiscal period. Always `QUARTERLY`. */
        fun periodType(periodType: FiscalPeriodType) = periodType(JsonField.of(periodType))

        /**
         * Sets [Builder.periodType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodType] with a well-typed [FiscalPeriodType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodType(periodType: JsonField<FiscalPeriodType>) = apply {
            this.periodType = periodType
        }

        /** The fiscal year of the call */
        fun year(year: Int) = year(JsonField.of(year))

        /**
         * Sets [Builder.year] to an arbitrary JSON value.
         *
         * You should usually call [Builder.year] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun year(year: JsonField<Int>) = apply { this.year = year }

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
         * Returns an immutable instance of [InstrumentEarningsTranscript].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .content()
         * .date()
         * .period()
         * .periodType()
         * .year()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentEarningsTranscript =
            InstrumentEarningsTranscript(
                checkRequired("content", content),
                checkRequired("date", date),
                checkRequired("period", period),
                checkRequired("periodType", periodType),
                checkRequired("year", year),
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
    fun validate(): InstrumentEarningsTranscript = apply {
        if (validated) {
            return@apply
        }

        content()
        date()
        period().validate()
        periodType().validate()
        year()
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
        (if (content.asKnown().isPresent) 1 else 0) +
            (if (date.asKnown().isPresent) 1 else 0) +
            (period.asKnown().getOrNull()?.validity() ?: 0) +
            (periodType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (year.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentEarningsTranscript &&
            content == other.content &&
            date == other.date &&
            period == other.period &&
            periodType == other.periodType &&
            year == other.year &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(content, date, period, periodType, year, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentEarningsTranscript{content=$content, date=$date, period=$period, periodType=$periodType, year=$year, additionalProperties=$additionalProperties}"
}
