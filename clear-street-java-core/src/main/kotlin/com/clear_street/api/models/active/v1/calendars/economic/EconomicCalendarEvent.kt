// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.economic

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a single economic calendar event */
class EconomicCalendarEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val country: JsonField<String>,
    private val currency: JsonField<String>,
    private val eventName: JsonField<String>,
    private val eventTimestamp: JsonField<OffsetDateTime>,
    private val impact: JsonField<EconomicEventImpact>,
    private val actualValue: JsonField<String>,
    private val changePercent: JsonField<String>,
    private val estimatedValue: JsonField<String>,
    private val previousValue: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_name") @ExcludeMissing eventName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_timestamp")
        @ExcludeMissing
        eventTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("impact")
        @ExcludeMissing
        impact: JsonField<EconomicEventImpact> = JsonMissing.of(),
        @JsonProperty("actual_value")
        @ExcludeMissing
        actualValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("change_percent")
        @ExcludeMissing
        changePercent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("estimated_value")
        @ExcludeMissing
        estimatedValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_value")
        @ExcludeMissing
        previousValue: JsonField<String> = JsonMissing.of(),
    ) : this(
        country,
        currency,
        eventName,
        eventTimestamp,
        impact,
        actualValue,
        changePercent,
        estimatedValue,
        previousValue,
        mutableMapOf(),
    )

    /**
     * The ISO 3166-1 alpha-2 country code
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * The ISO 4217 currency code
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The name of the economic event
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventName(): String = eventName.getRequired("event_name")

    /**
     * The date and time of the event in UTC
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventTimestamp(): OffsetDateTime = eventTimestamp.getRequired("event_timestamp")

    /**
     * The expected market impact of the event
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun impact(): EconomicEventImpact = impact.getRequired("impact")

    /**
     * The actual value reported for the event
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actualValue(): Optional<String> = actualValue.getOptional("actual_value")

    /**
     * The percentage change between the actual and previous values
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun changePercent(): Optional<String> = changePercent.getOptional("change_percent")

    /**
     * The market consensus estimate for the event's value
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun estimatedValue(): Optional<String> = estimatedValue.getOptional("estimated_value")

    /**
     * The previous value for this event
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun previousValue(): Optional<String> = previousValue.getOptional("previous_value")

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [eventName].
     *
     * Unlike [eventName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_name") @ExcludeMissing fun _eventName(): JsonField<String> = eventName

    /**
     * Returns the raw JSON value of [eventTimestamp].
     *
     * Unlike [eventTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_timestamp")
    @ExcludeMissing
    fun _eventTimestamp(): JsonField<OffsetDateTime> = eventTimestamp

    /**
     * Returns the raw JSON value of [impact].
     *
     * Unlike [impact], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("impact") @ExcludeMissing fun _impact(): JsonField<EconomicEventImpact> = impact

    /**
     * Returns the raw JSON value of [actualValue].
     *
     * Unlike [actualValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actual_value")
    @ExcludeMissing
    fun _actualValue(): JsonField<String> = actualValue

    /**
     * Returns the raw JSON value of [changePercent].
     *
     * Unlike [changePercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("change_percent")
    @ExcludeMissing
    fun _changePercent(): JsonField<String> = changePercent

    /**
     * Returns the raw JSON value of [estimatedValue].
     *
     * Unlike [estimatedValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("estimated_value")
    @ExcludeMissing
    fun _estimatedValue(): JsonField<String> = estimatedValue

    /**
     * Returns the raw JSON value of [previousValue].
     *
     * Unlike [previousValue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous_value")
    @ExcludeMissing
    fun _previousValue(): JsonField<String> = previousValue

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
         * Returns a mutable builder for constructing an instance of [EconomicCalendarEvent].
         *
         * The following fields are required:
         * ```java
         * .country()
         * .currency()
         * .eventName()
         * .eventTimestamp()
         * .impact()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EconomicCalendarEvent]. */
    class Builder internal constructor() {

        private var country: JsonField<String>? = null
        private var currency: JsonField<String>? = null
        private var eventName: JsonField<String>? = null
        private var eventTimestamp: JsonField<OffsetDateTime>? = null
        private var impact: JsonField<EconomicEventImpact>? = null
        private var actualValue: JsonField<String> = JsonMissing.of()
        private var changePercent: JsonField<String> = JsonMissing.of()
        private var estimatedValue: JsonField<String> = JsonMissing.of()
        private var previousValue: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(economicCalendarEvent: EconomicCalendarEvent) = apply {
            country = economicCalendarEvent.country
            currency = economicCalendarEvent.currency
            eventName = economicCalendarEvent.eventName
            eventTimestamp = economicCalendarEvent.eventTimestamp
            impact = economicCalendarEvent.impact
            actualValue = economicCalendarEvent.actualValue
            changePercent = economicCalendarEvent.changePercent
            estimatedValue = economicCalendarEvent.estimatedValue
            previousValue = economicCalendarEvent.previousValue
            additionalProperties = economicCalendarEvent.additionalProperties.toMutableMap()
        }

        /** The ISO 3166-1 alpha-2 country code */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** The ISO 4217 currency code */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The name of the economic event */
        fun eventName(eventName: String) = eventName(JsonField.of(eventName))

        /**
         * Sets [Builder.eventName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventName(eventName: JsonField<String>) = apply { this.eventName = eventName }

        /** The date and time of the event in UTC */
        fun eventTimestamp(eventTimestamp: OffsetDateTime) =
            eventTimestamp(JsonField.of(eventTimestamp))

        /**
         * Sets [Builder.eventTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventTimestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun eventTimestamp(eventTimestamp: JsonField<OffsetDateTime>) = apply {
            this.eventTimestamp = eventTimestamp
        }

        /** The expected market impact of the event */
        fun impact(impact: EconomicEventImpact) = impact(JsonField.of(impact))

        /**
         * Sets [Builder.impact] to an arbitrary JSON value.
         *
         * You should usually call [Builder.impact] with a well-typed [EconomicEventImpact] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun impact(impact: JsonField<EconomicEventImpact>) = apply { this.impact = impact }

        /** The actual value reported for the event */
        fun actualValue(actualValue: String?) = actualValue(JsonField.ofNullable(actualValue))

        /** Alias for calling [Builder.actualValue] with `actualValue.orElse(null)`. */
        fun actualValue(actualValue: Optional<String>) = actualValue(actualValue.getOrNull())

        /**
         * Sets [Builder.actualValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actualValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun actualValue(actualValue: JsonField<String>) = apply { this.actualValue = actualValue }

        /** The percentage change between the actual and previous values */
        fun changePercent(changePercent: String?) =
            changePercent(JsonField.ofNullable(changePercent))

        /** Alias for calling [Builder.changePercent] with `changePercent.orElse(null)`. */
        fun changePercent(changePercent: Optional<String>) =
            changePercent(changePercent.getOrNull())

        /**
         * Sets [Builder.changePercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changePercent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun changePercent(changePercent: JsonField<String>) = apply {
            this.changePercent = changePercent
        }

        /** The market consensus estimate for the event's value */
        fun estimatedValue(estimatedValue: String?) =
            estimatedValue(JsonField.ofNullable(estimatedValue))

        /** Alias for calling [Builder.estimatedValue] with `estimatedValue.orElse(null)`. */
        fun estimatedValue(estimatedValue: Optional<String>) =
            estimatedValue(estimatedValue.getOrNull())

        /**
         * Sets [Builder.estimatedValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estimatedValue] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun estimatedValue(estimatedValue: JsonField<String>) = apply {
            this.estimatedValue = estimatedValue
        }

        /** The previous value for this event */
        fun previousValue(previousValue: String?) =
            previousValue(JsonField.ofNullable(previousValue))

        /** Alias for calling [Builder.previousValue] with `previousValue.orElse(null)`. */
        fun previousValue(previousValue: Optional<String>) =
            previousValue(previousValue.getOrNull())

        /**
         * Sets [Builder.previousValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousValue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun previousValue(previousValue: JsonField<String>) = apply {
            this.previousValue = previousValue
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
         * Returns an immutable instance of [EconomicCalendarEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .country()
         * .currency()
         * .eventName()
         * .eventTimestamp()
         * .impact()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EconomicCalendarEvent =
            EconomicCalendarEvent(
                checkRequired("country", country),
                checkRequired("currency", currency),
                checkRequired("eventName", eventName),
                checkRequired("eventTimestamp", eventTimestamp),
                checkRequired("impact", impact),
                actualValue,
                changePercent,
                estimatedValue,
                previousValue,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): EconomicCalendarEvent = apply {
        if (validated) {
            return@apply
        }

        country()
        currency()
        eventName()
        eventTimestamp()
        impact().validate()
        actualValue()
        changePercent()
        estimatedValue()
        previousValue()
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
            (if (currency.asKnown().isPresent) 1 else 0) +
            (if (eventName.asKnown().isPresent) 1 else 0) +
            (if (eventTimestamp.asKnown().isPresent) 1 else 0) +
            (impact.asKnown().getOrNull()?.validity() ?: 0) +
            (if (actualValue.asKnown().isPresent) 1 else 0) +
            (if (changePercent.asKnown().isPresent) 1 else 0) +
            (if (estimatedValue.asKnown().isPresent) 1 else 0) +
            (if (previousValue.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EconomicCalendarEvent &&
            country == other.country &&
            currency == other.currency &&
            eventName == other.eventName &&
            eventTimestamp == other.eventTimestamp &&
            impact == other.impact &&
            actualValue == other.actualValue &&
            changePercent == other.changePercent &&
            estimatedValue == other.estimatedValue &&
            previousValue == other.previousValue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            country,
            currency,
            eventName,
            eventTimestamp,
            impact,
            actualValue,
            changePercent,
            estimatedValue,
            previousValue,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EconomicCalendarEvent{country=$country, currency=$currency, eventName=$eventName, eventTimestamp=$eventTimestamp, impact=$impact, actualValue=$actualValue, changePercent=$changePercent, estimatedValue=$estimatedValue, previousValue=$previousValue, additionalProperties=$additionalProperties}"
}
