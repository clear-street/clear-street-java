// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.calendar

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A single economic calendar event.
 *
 * Coverage spans roughly 365 days back to 90 days forward. `estimate` and `actual` are frequently
 * absent for minor releases, speeches, and holidays. The calendar refreshes daily (around 7am ET),
 * so `actual` can trail the real-world print by up to a day; a null `actual` before the print is
 * expected, not missing data.
 */
class EconomicEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val country: JsonField<String>,
    private val name: JsonField<String>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val actual: JsonField<String>,
    private val change: JsonField<String>,
    private val changePercentage: JsonField<String>,
    private val currency: JsonField<String>,
    private val estimate: JsonField<String>,
    private val impact: JsonField<EconomicEventImpact>,
    private val previous: JsonField<String>,
    private val unit: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("actual") @ExcludeMissing actual: JsonField<String> = JsonMissing.of(),
        @JsonProperty("change") @ExcludeMissing change: JsonField<String> = JsonMissing.of(),
        @JsonProperty("change_percentage")
        @ExcludeMissing
        changePercentage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("estimate") @ExcludeMissing estimate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("impact")
        @ExcludeMissing
        impact: JsonField<EconomicEventImpact> = JsonMissing.of(),
        @JsonProperty("previous") @ExcludeMissing previous: JsonField<String> = JsonMissing.of(),
        @JsonProperty("unit") @ExcludeMissing unit: JsonField<String> = JsonMissing.of(),
    ) : this(
        country,
        name,
        timestamp,
        actual,
        change,
        changePercentage,
        currency,
        estimate,
        impact,
        previous,
        unit,
        mutableMapOf(),
    )

    /**
     * ISO 3166-1 alpha-2 country code, or `EU`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * Event name as reported by the provider.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * UTC instant of the event.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * Actual reported value. Null before the print, or if the provider never reports one for this
     * event. When a null/undefined value is observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actual(): Optional<String> = actual.getOptional("actual")

    /**
     * Change from the previous value. When a null/undefined value is observed, it indicates that
     * there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun change(): Optional<String> = change.getOptional("change")

    /**
     * Change from the previous value, as a percentage. When a null/undefined value is observed, it
     * indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun changePercentage(): Optional<String> = changePercentage.getOptional("change_percentage")

    /**
     * Currency associated with the event, if applicable. When a null/undefined value is observed,
     * it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currency(): Optional<String> = currency.getOptional("currency")

    /**
     * Analyst-estimated value. When a null/undefined value is observed, it indicates that there is
     * no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun estimate(): Optional<String> = estimate.getOptional("estimate")

    /**
     * Expected market impact, if known. When a null/undefined value is observed, it indicates that
     * there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun impact(): Optional<EconomicEventImpact> = impact.getOptional("impact")

    /**
     * Previous period's reported value. When a null/undefined value is observed, it indicates that
     * there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previous(): Optional<String> = previous.getOptional("previous")

    /**
     * Unit of the numeric value fields, if known. When a null/undefined value is observed, it
     * indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun unit(): Optional<String> = unit.getOptional("unit")

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [actual].
     *
     * Unlike [actual], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actual") @ExcludeMissing fun _actual(): JsonField<String> = actual

    /**
     * Returns the raw JSON value of [change].
     *
     * Unlike [change], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("change") @ExcludeMissing fun _change(): JsonField<String> = change

    /**
     * Returns the raw JSON value of [changePercentage].
     *
     * Unlike [changePercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("change_percentage")
    @ExcludeMissing
    fun _changePercentage(): JsonField<String> = changePercentage

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [estimate].
     *
     * Unlike [estimate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("estimate") @ExcludeMissing fun _estimate(): JsonField<String> = estimate

    /**
     * Returns the raw JSON value of [impact].
     *
     * Unlike [impact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impact") @ExcludeMissing fun _impact(): JsonField<EconomicEventImpact> = impact

    /**
     * Returns the raw JSON value of [previous].
     *
     * Unlike [previous], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous") @ExcludeMissing fun _previous(): JsonField<String> = previous

    /**
     * Returns the raw JSON value of [unit].
     *
     * Unlike [unit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<String> = unit

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
         * Returns a mutable builder for constructing an instance of [EconomicEvent].
         *
         * The following fields are required:
         * ```java
         * .country()
         * .name()
         * .timestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EconomicEvent]. */
    class Builder internal constructor() {

        private var country: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var actual: JsonField<String> = JsonMissing.of()
        private var change: JsonField<String> = JsonMissing.of()
        private var changePercentage: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var estimate: JsonField<String> = JsonMissing.of()
        private var impact: JsonField<EconomicEventImpact> = JsonMissing.of()
        private var previous: JsonField<String> = JsonMissing.of()
        private var unit: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(economicEvent: EconomicEvent) = apply {
            country = economicEvent.country
            name = economicEvent.name
            timestamp = economicEvent.timestamp
            actual = economicEvent.actual
            change = economicEvent.change
            changePercentage = economicEvent.changePercentage
            currency = economicEvent.currency
            estimate = economicEvent.estimate
            impact = economicEvent.impact
            previous = economicEvent.previous
            unit = economicEvent.unit
            additionalProperties = economicEvent.additionalProperties.toMutableMap()
        }

        /** ISO 3166-1 alpha-2 country code, or `EU`. */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Event name as reported by the provider. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** UTC instant of the event. */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /**
         * Actual reported value. Null before the print, or if the provider never reports one for
         * this event. When a null/undefined value is observed, it indicates that there is no
         * available data.
         */
        fun actual(actual: String?) = actual(JsonField.ofNullable(actual))

        /** Alias for calling [Builder.actual] with `actual.orElse(null)`. */
        fun actual(actual: Optional<String>) = actual(actual.getOrNull())

        /**
         * Sets [Builder.actual] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actual] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actual(actual: JsonField<String>) = apply { this.actual = actual }

        /**
         * Change from the previous value. When a null/undefined value is observed, it indicates
         * that there is no available data.
         */
        fun change(change: String?) = change(JsonField.ofNullable(change))

        /** Alias for calling [Builder.change] with `change.orElse(null)`. */
        fun change(change: Optional<String>) = change(change.getOrNull())

        /**
         * Sets [Builder.change] to an arbitrary JSON value.
         *
         * You should usually call [Builder.change] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun change(change: JsonField<String>) = apply { this.change = change }

        /**
         * Change from the previous value, as a percentage. When a null/undefined value is observed,
         * it indicates that there is no available data.
         */
        fun changePercentage(changePercentage: String?) =
            changePercentage(JsonField.ofNullable(changePercentage))

        /** Alias for calling [Builder.changePercentage] with `changePercentage.orElse(null)`. */
        fun changePercentage(changePercentage: Optional<String>) =
            changePercentage(changePercentage.getOrNull())

        /**
         * Sets [Builder.changePercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changePercentage] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun changePercentage(changePercentage: JsonField<String>) = apply {
            this.changePercentage = changePercentage
        }

        /**
         * Currency associated with the event, if applicable. When a null/undefined value is
         * observed, it indicates that there is no available data.
         */
        fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<String>) = currency(currency.getOrNull())

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * Analyst-estimated value. When a null/undefined value is observed, it indicates that there
         * is no available data.
         */
        fun estimate(estimate: String?) = estimate(JsonField.ofNullable(estimate))

        /** Alias for calling [Builder.estimate] with `estimate.orElse(null)`. */
        fun estimate(estimate: Optional<String>) = estimate(estimate.getOrNull())

        /**
         * Sets [Builder.estimate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estimate] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun estimate(estimate: JsonField<String>) = apply { this.estimate = estimate }

        /**
         * Expected market impact, if known. When a null/undefined value is observed, it indicates
         * that there is no available data.
         */
        fun impact(impact: EconomicEventImpact?) = impact(JsonField.ofNullable(impact))

        /** Alias for calling [Builder.impact] with `impact.orElse(null)`. */
        fun impact(impact: Optional<EconomicEventImpact>) = impact(impact.getOrNull())

        /**
         * Sets [Builder.impact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impact] with a well-typed [EconomicEventImpact] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun impact(impact: JsonField<EconomicEventImpact>) = apply { this.impact = impact }

        /**
         * Previous period's reported value. When a null/undefined value is observed, it indicates
         * that there is no available data.
         */
        fun previous(previous: String?) = previous(JsonField.ofNullable(previous))

        /** Alias for calling [Builder.previous] with `previous.orElse(null)`. */
        fun previous(previous: Optional<String>) = previous(previous.getOrNull())

        /**
         * Sets [Builder.previous] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previous] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun previous(previous: JsonField<String>) = apply { this.previous = previous }

        /**
         * Unit of the numeric value fields, if known. When a null/undefined value is observed, it
         * indicates that there is no available data.
         */
        fun unit(unit: String?) = unit(JsonField.ofNullable(unit))

        /** Alias for calling [Builder.unit] with `unit.orElse(null)`. */
        fun unit(unit: Optional<String>) = unit(unit.getOrNull())

        /**
         * Sets [Builder.unit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.unit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun unit(unit: JsonField<String>) = apply { this.unit = unit }

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
         * Returns an immutable instance of [EconomicEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .country()
         * .name()
         * .timestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EconomicEvent =
            EconomicEvent(
                checkRequired("country", country),
                checkRequired("name", name),
                checkRequired("timestamp", timestamp),
                actual,
                change,
                changePercentage,
                currency,
                estimate,
                impact,
                previous,
                unit,
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
    fun validate(): EconomicEvent = apply {
        if (validated) {
            return@apply
        }

        country()
        name()
        timestamp()
        actual()
        change()
        changePercentage()
        currency()
        estimate()
        impact().ifPresent { it.validate() }
        previous()
        unit()
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
        (if (country.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (if (actual.asKnown().isPresent) 1 else 0) +
            (if (change.asKnown().isPresent) 1 else 0) +
            (if (changePercentage.asKnown().isPresent) 1 else 0) +
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (estimate.asKnown().isPresent) 1 else 0) +
            (impact.asKnown().getOrNull()?.validity() ?: 0) +
            (if (previous.asKnown().isPresent) 1 else 0) +
            (if (unit.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EconomicEvent &&
            country == other.country &&
            name == other.name &&
            timestamp == other.timestamp &&
            actual == other.actual &&
            change == other.change &&
            changePercentage == other.changePercentage &&
            currency == other.currency &&
            estimate == other.estimate &&
            impact == other.impact &&
            previous == other.previous &&
            unit == other.unit &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            country,
            name,
            timestamp,
            actual,
            change,
            changePercentage,
            currency,
            estimate,
            impact,
            previous,
            unit,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EconomicEvent{country=$country, name=$name, timestamp=$timestamp, actual=$actual, change=$change, changePercentage=$changePercentage, currency=$currency, estimate=$estimate, impact=$impact, previous=$previous, unit=$unit, additionalProperties=$additionalProperties}"
}
