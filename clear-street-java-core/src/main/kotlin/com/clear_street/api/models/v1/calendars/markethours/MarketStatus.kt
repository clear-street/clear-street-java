// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.calendars.markethours

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Market status information */
class MarketStatus
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dayType: JsonField<DayType>,
    private val isOpen: JsonField<Boolean>,
    private val currentSession: JsonField<MarketSessionType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("day_type") @ExcludeMissing dayType: JsonField<DayType> = JsonMissing.of(),
        @JsonProperty("is_open") @ExcludeMissing isOpen: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("current_session")
        @ExcludeMissing
        currentSession: JsonField<MarketSessionType> = JsonMissing.of(),
    ) : this(dayType, isOpen, currentSession, mutableMapOf())

    /**
     * The type of trading day
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dayType(): DayType = dayType.getRequired("day_type")

    /**
     * Whether the market is currently open (real-time)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isOpen(): Boolean = isOpen.getRequired("is_open")

    /**
     * Current session type if market is open, null if closed
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentSession(): Optional<MarketSessionType> =
        currentSession.getOptional("current_session")

    /**
     * Returns the raw JSON value of [dayType].
     *
     * Unlike [dayType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("day_type") @ExcludeMissing fun _dayType(): JsonField<DayType> = dayType

    /**
     * Returns the raw JSON value of [isOpen].
     *
     * Unlike [isOpen], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_open") @ExcludeMissing fun _isOpen(): JsonField<Boolean> = isOpen

    /**
     * Returns the raw JSON value of [currentSession].
     *
     * Unlike [currentSession], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("current_session")
    @ExcludeMissing
    fun _currentSession(): JsonField<MarketSessionType> = currentSession

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
         * Returns a mutable builder for constructing an instance of [MarketStatus].
         *
         * The following fields are required:
         * ```java
         * .dayType()
         * .isOpen()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketStatus]. */
    class Builder internal constructor() {

        private var dayType: JsonField<DayType>? = null
        private var isOpen: JsonField<Boolean>? = null
        private var currentSession: JsonField<MarketSessionType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marketStatus: MarketStatus) = apply {
            dayType = marketStatus.dayType
            isOpen = marketStatus.isOpen
            currentSession = marketStatus.currentSession
            additionalProperties = marketStatus.additionalProperties.toMutableMap()
        }

        /** The type of trading day */
        fun dayType(dayType: DayType) = dayType(JsonField.of(dayType))

        /**
         * Sets [Builder.dayType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayType] with a well-typed [DayType] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dayType(dayType: JsonField<DayType>) = apply { this.dayType = dayType }

        /** Whether the market is currently open (real-time) */
        fun isOpen(isOpen: Boolean) = isOpen(JsonField.of(isOpen))

        /**
         * Sets [Builder.isOpen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isOpen] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun isOpen(isOpen: JsonField<Boolean>) = apply { this.isOpen = isOpen }

        /** Current session type if market is open, null if closed */
        fun currentSession(currentSession: MarketSessionType?) =
            currentSession(JsonField.ofNullable(currentSession))

        /** Alias for calling [Builder.currentSession] with `currentSession.orElse(null)`. */
        fun currentSession(currentSession: Optional<MarketSessionType>) =
            currentSession(currentSession.getOrNull())

        /**
         * Sets [Builder.currentSession] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentSession] with a well-typed [MarketSessionType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun currentSession(currentSession: JsonField<MarketSessionType>) = apply {
            this.currentSession = currentSession
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
         * Returns an immutable instance of [MarketStatus].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dayType()
         * .isOpen()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketStatus =
            MarketStatus(
                checkRequired("dayType", dayType),
                checkRequired("isOpen", isOpen),
                currentSession,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MarketStatus = apply {
        if (validated) {
            return@apply
        }

        dayType().validate()
        isOpen()
        currentSession().ifPresent { it.validate() }
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
        (dayType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isOpen.asKnown().isPresent) 1 else 0) +
            (currentSession.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketStatus &&
            dayType == other.dayType &&
            isOpen == other.isOpen &&
            currentSession == other.currentSession &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(dayType, isOpen, currentSession, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketStatus{dayType=$dayType, isOpen=$isOpen, currentSession=$currentSession, additionalProperties=$additionalProperties}"
}
