// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Grouped instrument events by type */
class InstrumentEventsData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dividends: JsonField<List<InstrumentDividendEvent>>,
    private val earnings: JsonField<List<InstrumentEarnings>>,
    private val instrumentId: JsonField<String>,
    private val splits: JsonField<List<InstrumentSplitEvent>>,
    private val reportingCurrency: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("dividends")
        @ExcludeMissing
        dividends: JsonField<List<InstrumentDividendEvent>> = JsonMissing.of(),
        @JsonProperty("earnings")
        @ExcludeMissing
        earnings: JsonField<List<InstrumentEarnings>> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("splits")
        @ExcludeMissing
        splits: JsonField<List<InstrumentSplitEvent>> = JsonMissing.of(),
        @JsonProperty("reporting_currency")
        @ExcludeMissing
        reportingCurrency: JsonField<String> = JsonMissing.of(),
    ) : this(dividends, earnings, instrumentId, splits, reportingCurrency, mutableMapOf())

    /**
     * Dividend distribution events
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dividends(): List<InstrumentDividendEvent> = dividends.getRequired("dividends")

    /**
     * Earnings announcement events
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun earnings(): List<InstrumentEarnings> = earnings.getRequired("earnings")

    /**
     * OEMS instrument UUID from the request
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentId(): String = instrumentId.getRequired("instrument_id")

    /**
     * Stock split events
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun splits(): List<InstrumentSplitEvent> = splits.getRequired("splits")

    /**
     * The currency used for reporting financial data
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun reportingCurrency(): Optional<String> = reportingCurrency.getOptional("reporting_currency")

    /**
     * Returns the raw JSON value of [dividends].
     *
     * Unlike [dividends], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dividends")
    @ExcludeMissing
    fun _dividends(): JsonField<List<InstrumentDividendEvent>> = dividends

    /**
     * Returns the raw JSON value of [earnings].
     *
     * Unlike [earnings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("earnings")
    @ExcludeMissing
    fun _earnings(): JsonField<List<InstrumentEarnings>> = earnings

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [splits].
     *
     * Unlike [splits], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("splits")
    @ExcludeMissing
    fun _splits(): JsonField<List<InstrumentSplitEvent>> = splits

    /**
     * Returns the raw JSON value of [reportingCurrency].
     *
     * Unlike [reportingCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reporting_currency")
    @ExcludeMissing
    fun _reportingCurrency(): JsonField<String> = reportingCurrency

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
         * Returns a mutable builder for constructing an instance of [InstrumentEventsData].
         *
         * The following fields are required:
         * ```java
         * .dividends()
         * .earnings()
         * .instrumentId()
         * .splits()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentEventsData]. */
    class Builder internal constructor() {

        private var dividends: JsonField<MutableList<InstrumentDividendEvent>>? = null
        private var earnings: JsonField<MutableList<InstrumentEarnings>>? = null
        private var instrumentId: JsonField<String>? = null
        private var splits: JsonField<MutableList<InstrumentSplitEvent>>? = null
        private var reportingCurrency: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentEventsData: InstrumentEventsData) = apply {
            dividends = instrumentEventsData.dividends.map { it.toMutableList() }
            earnings = instrumentEventsData.earnings.map { it.toMutableList() }
            instrumentId = instrumentEventsData.instrumentId
            splits = instrumentEventsData.splits.map { it.toMutableList() }
            reportingCurrency = instrumentEventsData.reportingCurrency
            additionalProperties = instrumentEventsData.additionalProperties.toMutableMap()
        }

        /** Dividend distribution events */
        fun dividends(dividends: List<InstrumentDividendEvent>) = dividends(JsonField.of(dividends))

        /**
         * Sets [Builder.dividends] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dividends] with a well-typed
         * `List<InstrumentDividendEvent>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun dividends(dividends: JsonField<List<InstrumentDividendEvent>>) = apply {
            this.dividends = dividends.map { it.toMutableList() }
        }

        /**
         * Adds a single [InstrumentDividendEvent] to [dividends].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDividend(dividend: InstrumentDividendEvent) = apply {
            dividends =
                (dividends ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dividends", it).add(dividend)
                }
        }

        /** Earnings announcement events */
        fun earnings(earnings: List<InstrumentEarnings>) = earnings(JsonField.of(earnings))

        /**
         * Sets [Builder.earnings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earnings] with a well-typed `List<InstrumentEarnings>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun earnings(earnings: JsonField<List<InstrumentEarnings>>) = apply {
            this.earnings = earnings.map { it.toMutableList() }
        }

        /**
         * Adds a single [InstrumentEarnings] to [earnings].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEarning(earning: InstrumentEarnings) = apply {
            earnings =
                (earnings ?: JsonField.of(mutableListOf())).also {
                    checkKnown("earnings", it).add(earning)
                }
        }

        /** OEMS instrument UUID from the request */
        fun instrumentId(instrumentId: String) = instrumentId(JsonField.of(instrumentId))

        /**
         * Sets [Builder.instrumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instrumentId(instrumentId: JsonField<String>) = apply {
            this.instrumentId = instrumentId
        }

        /** Stock split events */
        fun splits(splits: List<InstrumentSplitEvent>) = splits(JsonField.of(splits))

        /**
         * Sets [Builder.splits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.splits] with a well-typed `List<InstrumentSplitEvent>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun splits(splits: JsonField<List<InstrumentSplitEvent>>) = apply {
            this.splits = splits.map { it.toMutableList() }
        }

        /**
         * Adds a single [InstrumentSplitEvent] to [splits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSplit(split: InstrumentSplitEvent) = apply {
            splits =
                (splits ?: JsonField.of(mutableListOf())).also {
                    checkKnown("splits", it).add(split)
                }
        }

        /** The currency used for reporting financial data */
        fun reportingCurrency(reportingCurrency: String?) =
            reportingCurrency(JsonField.ofNullable(reportingCurrency))

        /** Alias for calling [Builder.reportingCurrency] with `reportingCurrency.orElse(null)`. */
        fun reportingCurrency(reportingCurrency: Optional<String>) =
            reportingCurrency(reportingCurrency.getOrNull())

        /**
         * Sets [Builder.reportingCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportingCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportingCurrency(reportingCurrency: JsonField<String>) = apply {
            this.reportingCurrency = reportingCurrency
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
         * Returns an immutable instance of [InstrumentEventsData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dividends()
         * .earnings()
         * .instrumentId()
         * .splits()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentEventsData =
            InstrumentEventsData(
                checkRequired("dividends", dividends).map { it.toImmutable() },
                checkRequired("earnings", earnings).map { it.toImmutable() },
                checkRequired("instrumentId", instrumentId),
                checkRequired("splits", splits).map { it.toImmutable() },
                reportingCurrency,
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
    fun validate(): InstrumentEventsData = apply {
        if (validated) {
            return@apply
        }

        dividends().forEach { it.validate() }
        earnings().forEach { it.validate() }
        instrumentId()
        splits().forEach { it.validate() }
        reportingCurrency()
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
        (dividends.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (earnings.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (splits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (reportingCurrency.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentEventsData &&
            dividends == other.dividends &&
            earnings == other.earnings &&
            instrumentId == other.instrumentId &&
            splits == other.splits &&
            reportingCurrency == other.reportingCurrency &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dividends,
            earnings,
            instrumentId,
            splits,
            reportingCurrency,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentEventsData{dividends=$dividends, earnings=$earnings, instrumentId=$instrumentId, splits=$splits, reportingCurrency=$reportingCurrency, additionalProperties=$additionalProperties}"
}
