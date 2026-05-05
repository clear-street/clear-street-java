// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.events

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
import kotlin.jvm.optionals.getOrNull

/** All-events payload grouped by date. */
class InstrumentAllEventsData
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val eventDates: JsonField<List<InstrumentEventsByDate>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("event_dates")
        @ExcludeMissing
        eventDates: JsonField<List<InstrumentEventsByDate>> = JsonMissing.of()
    ) : this(eventDates, mutableMapOf())

    /**
     * Events grouped by date in descending order.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventDates(): List<InstrumentEventsByDate> = eventDates.getRequired("event_dates")

    /**
     * Returns the raw JSON value of [eventDates].
     *
     * Unlike [eventDates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_dates")
    @ExcludeMissing
    fun _eventDates(): JsonField<List<InstrumentEventsByDate>> = eventDates

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
         * Returns a mutable builder for constructing an instance of [InstrumentAllEventsData].
         *
         * The following fields are required:
         * ```java
         * .eventDates()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentAllEventsData]. */
    class Builder internal constructor() {

        private var eventDates: JsonField<MutableList<InstrumentEventsByDate>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentAllEventsData: InstrumentAllEventsData) = apply {
            eventDates = instrumentAllEventsData.eventDates.map { it.toMutableList() }
            additionalProperties = instrumentAllEventsData.additionalProperties.toMutableMap()
        }

        /** Events grouped by date in descending order. */
        fun eventDates(eventDates: List<InstrumentEventsByDate>) =
            eventDates(JsonField.of(eventDates))

        /**
         * Sets [Builder.eventDates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventDates] with a well-typed
         * `List<InstrumentEventsByDate>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun eventDates(eventDates: JsonField<List<InstrumentEventsByDate>>) = apply {
            this.eventDates = eventDates.map { it.toMutableList() }
        }

        /**
         * Adds a single [InstrumentEventsByDate] to [eventDates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEventDate(eventDate: InstrumentEventsByDate) = apply {
            eventDates =
                (eventDates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("eventDates", it).add(eventDate)
                }
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
         * Returns an immutable instance of [InstrumentAllEventsData].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .eventDates()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentAllEventsData =
            InstrumentAllEventsData(
                checkRequired("eventDates", eventDates).map { it.toImmutable() },
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
    fun validate(): InstrumentAllEventsData = apply {
        if (validated) {
            return@apply
        }

        eventDates().forEach { it.validate() }
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
        (eventDates.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentAllEventsData &&
            eventDates == other.eventDates &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(eventDates, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentAllEventsData{eventDates=$eventDates, additionalProperties=$additionalProperties}"
}
