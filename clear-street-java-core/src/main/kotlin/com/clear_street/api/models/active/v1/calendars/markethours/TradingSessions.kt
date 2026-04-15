// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.markethours

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Trading sessions for a market day with full timestamps */
class TradingSessions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val afterHours: JsonField<SessionSchedule>,
    private val preMarket: JsonField<SessionSchedule>,
    private val regular: JsonField<SessionSchedule>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("after_hours")
        @ExcludeMissing
        afterHours: JsonField<SessionSchedule> = JsonMissing.of(),
        @JsonProperty("pre_market")
        @ExcludeMissing
        preMarket: JsonField<SessionSchedule> = JsonMissing.of(),
        @JsonProperty("regular")
        @ExcludeMissing
        regular: JsonField<SessionSchedule> = JsonMissing.of(),
    ) : this(afterHours, preMarket, regular, mutableMapOf())

    /**
     * After-hours session schedule, null if not available
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun afterHours(): Optional<SessionSchedule> = afterHours.getOptional("after_hours")

    /**
     * Pre-market session schedule, null if not available
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preMarket(): Optional<SessionSchedule> = preMarket.getOptional("pre_market")

    /**
     * Regular trading session schedule, null if holiday/weekend
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regular(): Optional<SessionSchedule> = regular.getOptional("regular")

    /**
     * Returns the raw JSON value of [afterHours].
     *
     * Unlike [afterHours], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("after_hours")
    @ExcludeMissing
    fun _afterHours(): JsonField<SessionSchedule> = afterHours

    /**
     * Returns the raw JSON value of [preMarket].
     *
     * Unlike [preMarket], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pre_market")
    @ExcludeMissing
    fun _preMarket(): JsonField<SessionSchedule> = preMarket

    /**
     * Returns the raw JSON value of [regular].
     *
     * Unlike [regular], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("regular") @ExcludeMissing fun _regular(): JsonField<SessionSchedule> = regular

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

        /** Returns a mutable builder for constructing an instance of [TradingSessions]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TradingSessions]. */
    class Builder internal constructor() {

        private var afterHours: JsonField<SessionSchedule> = JsonMissing.of()
        private var preMarket: JsonField<SessionSchedule> = JsonMissing.of()
        private var regular: JsonField<SessionSchedule> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tradingSessions: TradingSessions) = apply {
            afterHours = tradingSessions.afterHours
            preMarket = tradingSessions.preMarket
            regular = tradingSessions.regular
            additionalProperties = tradingSessions.additionalProperties.toMutableMap()
        }

        /** After-hours session schedule, null if not available */
        fun afterHours(afterHours: SessionSchedule?) = afterHours(JsonField.ofNullable(afterHours))

        /** Alias for calling [Builder.afterHours] with `afterHours.orElse(null)`. */
        fun afterHours(afterHours: Optional<SessionSchedule>) = afterHours(afterHours.getOrNull())

        /**
         * Sets [Builder.afterHours] to an arbitrary JSON value.
         *
         * You should usually call [Builder.afterHours] with a well-typed [SessionSchedule] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun afterHours(afterHours: JsonField<SessionSchedule>) = apply {
            this.afterHours = afterHours
        }

        /** Pre-market session schedule, null if not available */
        fun preMarket(preMarket: SessionSchedule?) = preMarket(JsonField.ofNullable(preMarket))

        /** Alias for calling [Builder.preMarket] with `preMarket.orElse(null)`. */
        fun preMarket(preMarket: Optional<SessionSchedule>) = preMarket(preMarket.getOrNull())

        /**
         * Sets [Builder.preMarket] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preMarket] with a well-typed [SessionSchedule] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preMarket(preMarket: JsonField<SessionSchedule>) = apply { this.preMarket = preMarket }

        /** Regular trading session schedule, null if holiday/weekend */
        fun regular(regular: SessionSchedule?) = regular(JsonField.ofNullable(regular))

        /** Alias for calling [Builder.regular] with `regular.orElse(null)`. */
        fun regular(regular: Optional<SessionSchedule>) = regular(regular.getOrNull())

        /**
         * Sets [Builder.regular] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regular] with a well-typed [SessionSchedule] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun regular(regular: JsonField<SessionSchedule>) = apply { this.regular = regular }

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
         * Returns an immutable instance of [TradingSessions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): TradingSessions =
            TradingSessions(afterHours, preMarket, regular, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): TradingSessions = apply {
        if (validated) {
            return@apply
        }

        afterHours().ifPresent { it.validate() }
        preMarket().ifPresent { it.validate() }
        regular().ifPresent { it.validate() }
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
        (afterHours.asKnown().getOrNull()?.validity() ?: 0) +
            (preMarket.asKnown().getOrNull()?.validity() ?: 0) +
            (regular.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TradingSessions &&
            afterHours == other.afterHours &&
            preMarket == other.preMarket &&
            regular == other.regular &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(afterHours, preMarket, regular, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TradingSessions{afterHours=$afterHours, preMarket=$preMarket, regular=$regular, additionalProperties=$additionalProperties}"
}
