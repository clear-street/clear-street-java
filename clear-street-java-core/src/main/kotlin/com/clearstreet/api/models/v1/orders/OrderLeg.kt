// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.v1.SecurityType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** One leg of a multileg strategy order. */
class OrderLeg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ratio: JsonField<String>,
    private val side: JsonField<Side>,
    private val averageFillPrice: JsonField<String>,
    private val instrumentId: JsonField<String>,
    private val instrumentType: JsonField<SecurityType>,
    private val positionEffect: JsonField<RequestPositionEffect>,
    private val symbol: JsonField<String>,
    private val underlyingInstrumentId: JsonField<String>,
    private val underlyingInstrumentType: JsonField<SecurityType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ratio") @ExcludeMissing ratio: JsonField<String> = JsonMissing.of(),
        @JsonProperty("side") @ExcludeMissing side: JsonField<Side> = JsonMissing.of(),
        @JsonProperty("average_fill_price")
        @ExcludeMissing
        averageFillPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instrument_type")
        @ExcludeMissing
        instrumentType: JsonField<SecurityType> = JsonMissing.of(),
        @JsonProperty("position_effect")
        @ExcludeMissing
        positionEffect: JsonField<RequestPositionEffect> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("underlying_instrument_id")
        @ExcludeMissing
        underlyingInstrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("underlying_instrument_type")
        @ExcludeMissing
        underlyingInstrumentType: JsonField<SecurityType> = JsonMissing.of(),
    ) : this(
        ratio,
        side,
        averageFillPrice,
        instrumentId,
        instrumentType,
        positionEffect,
        symbol,
        underlyingInstrumentId,
        underlyingInstrumentType,
        mutableMapOf(),
    )

    /**
     * This leg's ratio quantity within the strategy.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ratio(): String = ratio.getRequired("ratio")

    /**
     * Side of this leg (BUY or SELL).
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun side(): Side = side.getRequired("side")

    /**
     * Average fill price for this leg across its executions, as reported by the venue (FIX 6 on an
     * individual-leg 442=2 execution report). `null` when the leg has no fills (no data), not `0`.
     * When a null/undefined value is observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun averageFillPrice(): Optional<String> = averageFillPrice.getOptional("average_fill_price")

    /**
     * Instrument identifier for this leg. `null` when the leg's instrument could not be resolved.
     * When a null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentId(): Optional<String> = instrumentId.getOptional("instrument_id")

    /**
     * Type of security for this leg. `null` when the leg's instrument could not be resolved. When a
     * null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentType(): Optional<SecurityType> = instrumentType.getOptional("instrument_type")

    /**
     * Client-attested open/close intent for this leg. When a null/undefined value is observed, it
     * indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun positionEffect(): Optional<RequestPositionEffect> =
        positionEffect.getOptional("position_effect")

    /**
     * Trading symbol for this leg. `null` when the leg's instrument could not be resolved. When a
     * null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun symbol(): Optional<String> = symbol.getOptional("symbol")

    /**
     * Instrument ID of this leg's underlying instrument. Populated only for option legs. When a
     * null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun underlyingInstrumentId(): Optional<String> =
        underlyingInstrumentId.getOptional("underlying_instrument_id")

    /**
     * Type of this leg's underlying instrument, alongside `underlying_instrument_id`. When a
     * null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun underlyingInstrumentType(): Optional<SecurityType> =
        underlyingInstrumentType.getOptional("underlying_instrument_type")

    /**
     * Returns the raw JSON value of [ratio].
     *
     * Unlike [ratio], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ratio") @ExcludeMissing fun _ratio(): JsonField<String> = ratio

    /**
     * Returns the raw JSON value of [side].
     *
     * Unlike [side], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("side") @ExcludeMissing fun _side(): JsonField<Side> = side

    /**
     * Returns the raw JSON value of [averageFillPrice].
     *
     * Unlike [averageFillPrice], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("average_fill_price")
    @ExcludeMissing
    fun _averageFillPrice(): JsonField<String> = averageFillPrice

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [instrumentType].
     *
     * Unlike [instrumentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_type")
    @ExcludeMissing
    fun _instrumentType(): JsonField<SecurityType> = instrumentType

    /**
     * Returns the raw JSON value of [positionEffect].
     *
     * Unlike [positionEffect], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position_effect")
    @ExcludeMissing
    fun _positionEffect(): JsonField<RequestPositionEffect> = positionEffect

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [underlyingInstrumentId].
     *
     * Unlike [underlyingInstrumentId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("underlying_instrument_id")
    @ExcludeMissing
    fun _underlyingInstrumentId(): JsonField<String> = underlyingInstrumentId

    /**
     * Returns the raw JSON value of [underlyingInstrumentType].
     *
     * Unlike [underlyingInstrumentType], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("underlying_instrument_type")
    @ExcludeMissing
    fun _underlyingInstrumentType(): JsonField<SecurityType> = underlyingInstrumentType

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
         * Returns a mutable builder for constructing an instance of [OrderLeg].
         *
         * The following fields are required:
         * ```java
         * .ratio()
         * .side()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrderLeg]. */
    class Builder internal constructor() {

        private var ratio: JsonField<String>? = null
        private var side: JsonField<Side>? = null
        private var averageFillPrice: JsonField<String> = JsonMissing.of()
        private var instrumentId: JsonField<String> = JsonMissing.of()
        private var instrumentType: JsonField<SecurityType> = JsonMissing.of()
        private var positionEffect: JsonField<RequestPositionEffect> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var underlyingInstrumentId: JsonField<String> = JsonMissing.of()
        private var underlyingInstrumentType: JsonField<SecurityType> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orderLeg: OrderLeg) = apply {
            ratio = orderLeg.ratio
            side = orderLeg.side
            averageFillPrice = orderLeg.averageFillPrice
            instrumentId = orderLeg.instrumentId
            instrumentType = orderLeg.instrumentType
            positionEffect = orderLeg.positionEffect
            symbol = orderLeg.symbol
            underlyingInstrumentId = orderLeg.underlyingInstrumentId
            underlyingInstrumentType = orderLeg.underlyingInstrumentType
            additionalProperties = orderLeg.additionalProperties.toMutableMap()
        }

        /** This leg's ratio quantity within the strategy. */
        fun ratio(ratio: String) = ratio(JsonField.of(ratio))

        /**
         * Sets [Builder.ratio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ratio] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ratio(ratio: JsonField<String>) = apply { this.ratio = ratio }

        /** Side of this leg (BUY or SELL). */
        fun side(side: Side) = side(JsonField.of(side))

        /**
         * Sets [Builder.side] to an arbitrary JSON value.
         *
         * You should usually call [Builder.side] with a well-typed [Side] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun side(side: JsonField<Side>) = apply { this.side = side }

        /**
         * Average fill price for this leg across its executions, as reported by the venue (FIX 6 on
         * an individual-leg 442=2 execution report). `null` when the leg has no fills (no data),
         * not `0`. When a null/undefined value is observed, it indicates that there is no available
         * data.
         */
        fun averageFillPrice(averageFillPrice: String?) =
            averageFillPrice(JsonField.ofNullable(averageFillPrice))

        /** Alias for calling [Builder.averageFillPrice] with `averageFillPrice.orElse(null)`. */
        fun averageFillPrice(averageFillPrice: Optional<String>) =
            averageFillPrice(averageFillPrice.getOrNull())

        /**
         * Sets [Builder.averageFillPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.averageFillPrice] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun averageFillPrice(averageFillPrice: JsonField<String>) = apply {
            this.averageFillPrice = averageFillPrice
        }

        /**
         * Instrument identifier for this leg. `null` when the leg's instrument could not be
         * resolved. When a null/undefined value is observed, it indicates it does not apply.
         */
        fun instrumentId(instrumentId: String?) = instrumentId(JsonField.ofNullable(instrumentId))

        /** Alias for calling [Builder.instrumentId] with `instrumentId.orElse(null)`. */
        fun instrumentId(instrumentId: Optional<String>) = instrumentId(instrumentId.getOrNull())

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

        /**
         * Type of security for this leg. `null` when the leg's instrument could not be resolved.
         * When a null/undefined value is observed, it indicates it does not apply.
         */
        fun instrumentType(instrumentType: SecurityType?) =
            instrumentType(JsonField.ofNullable(instrumentType))

        /** Alias for calling [Builder.instrumentType] with `instrumentType.orElse(null)`. */
        fun instrumentType(instrumentType: Optional<SecurityType>) =
            instrumentType(instrumentType.getOrNull())

        /**
         * Sets [Builder.instrumentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentType] with a well-typed [SecurityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instrumentType(instrumentType: JsonField<SecurityType>) = apply {
            this.instrumentType = instrumentType
        }

        /**
         * Client-attested open/close intent for this leg. When a null/undefined value is observed,
         * it indicates it does not apply.
         */
        fun positionEffect(positionEffect: RequestPositionEffect?) =
            positionEffect(JsonField.ofNullable(positionEffect))

        /** Alias for calling [Builder.positionEffect] with `positionEffect.orElse(null)`. */
        fun positionEffect(positionEffect: Optional<RequestPositionEffect>) =
            positionEffect(positionEffect.getOrNull())

        /**
         * Sets [Builder.positionEffect] to an arbitrary JSON value.
         *
         * You should usually call [Builder.positionEffect] with a well-typed
         * [RequestPositionEffect] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun positionEffect(positionEffect: JsonField<RequestPositionEffect>) = apply {
            this.positionEffect = positionEffect
        }

        /**
         * Trading symbol for this leg. `null` when the leg's instrument could not be resolved. When
         * a null/undefined value is observed, it indicates it does not apply.
         */
        fun symbol(symbol: String?) = symbol(JsonField.ofNullable(symbol))

        /** Alias for calling [Builder.symbol] with `symbol.orElse(null)`. */
        fun symbol(symbol: Optional<String>) = symbol(symbol.getOrNull())

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /**
         * Instrument ID of this leg's underlying instrument. Populated only for option legs. When a
         * null/undefined value is observed, it indicates it does not apply.
         */
        fun underlyingInstrumentId(underlyingInstrumentId: String?) =
            underlyingInstrumentId(JsonField.ofNullable(underlyingInstrumentId))

        /**
         * Alias for calling [Builder.underlyingInstrumentId] with
         * `underlyingInstrumentId.orElse(null)`.
         */
        fun underlyingInstrumentId(underlyingInstrumentId: Optional<String>) =
            underlyingInstrumentId(underlyingInstrumentId.getOrNull())

        /**
         * Sets [Builder.underlyingInstrumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.underlyingInstrumentId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun underlyingInstrumentId(underlyingInstrumentId: JsonField<String>) = apply {
            this.underlyingInstrumentId = underlyingInstrumentId
        }

        /**
         * Type of this leg's underlying instrument, alongside `underlying_instrument_id`. When a
         * null/undefined value is observed, it indicates it does not apply.
         */
        fun underlyingInstrumentType(underlyingInstrumentType: SecurityType?) =
            underlyingInstrumentType(JsonField.ofNullable(underlyingInstrumentType))

        /**
         * Alias for calling [Builder.underlyingInstrumentType] with
         * `underlyingInstrumentType.orElse(null)`.
         */
        fun underlyingInstrumentType(underlyingInstrumentType: Optional<SecurityType>) =
            underlyingInstrumentType(underlyingInstrumentType.getOrNull())

        /**
         * Sets [Builder.underlyingInstrumentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.underlyingInstrumentType] with a well-typed
         * [SecurityType] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun underlyingInstrumentType(underlyingInstrumentType: JsonField<SecurityType>) = apply {
            this.underlyingInstrumentType = underlyingInstrumentType
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
         * Returns an immutable instance of [OrderLeg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .ratio()
         * .side()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrderLeg =
            OrderLeg(
                checkRequired("ratio", ratio),
                checkRequired("side", side),
                averageFillPrice,
                instrumentId,
                instrumentType,
                positionEffect,
                symbol,
                underlyingInstrumentId,
                underlyingInstrumentType,
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
    fun validate(): OrderLeg = apply {
        if (validated) {
            return@apply
        }

        ratio()
        side().validate()
        averageFillPrice()
        instrumentId()
        instrumentType().ifPresent { it.validate() }
        positionEffect().ifPresent { it.validate() }
        symbol()
        underlyingInstrumentId()
        underlyingInstrumentType().ifPresent { it.validate() }
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
        (if (ratio.asKnown().isPresent) 1 else 0) +
            (side.asKnown().getOrNull()?.validity() ?: 0) +
            (if (averageFillPrice.asKnown().isPresent) 1 else 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (instrumentType.asKnown().getOrNull()?.validity() ?: 0) +
            (positionEffect.asKnown().getOrNull()?.validity() ?: 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (underlyingInstrumentId.asKnown().isPresent) 1 else 0) +
            (underlyingInstrumentType.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderLeg &&
            ratio == other.ratio &&
            side == other.side &&
            averageFillPrice == other.averageFillPrice &&
            instrumentId == other.instrumentId &&
            instrumentType == other.instrumentType &&
            positionEffect == other.positionEffect &&
            symbol == other.symbol &&
            underlyingInstrumentId == other.underlyingInstrumentId &&
            underlyingInstrumentType == other.underlyingInstrumentType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            ratio,
            side,
            averageFillPrice,
            instrumentId,
            instrumentType,
            positionEffect,
            symbol,
            underlyingInstrumentId,
            underlyingInstrumentType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrderLeg{ratio=$ratio, side=$side, averageFillPrice=$averageFillPrice, instrumentId=$instrumentId, instrumentType=$instrumentType, positionEffect=$positionEffect, symbol=$symbol, underlyingInstrumentId=$underlyingInstrumentId, underlyingInstrumentType=$underlyingInstrumentType, additionalProperties=$additionalProperties}"
}
