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

/** One leg of a strategy-level multileg execution. */
class ExecutionLeg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val price: JsonField<String>,
    private val ratio: JsonField<String>,
    private val side: JsonField<Side>,
    private val symbol: JsonField<String>,
    private val instrumentId: JsonField<String>,
    private val instrumentType: JsonField<SecurityType>,
    private val underlyingInstrumentId: JsonField<String>,
    private val underlyingInstrumentType: JsonField<SecurityType>,
    private val venue: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("price") @ExcludeMissing price: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ratio") @ExcludeMissing ratio: JsonField<String> = JsonMissing.of(),
        @JsonProperty("side") @ExcludeMissing side: JsonField<Side> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instrument_type")
        @ExcludeMissing
        instrumentType: JsonField<SecurityType> = JsonMissing.of(),
        @JsonProperty("underlying_instrument_id")
        @ExcludeMissing
        underlyingInstrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("underlying_instrument_type")
        @ExcludeMissing
        underlyingInstrumentType: JsonField<SecurityType> = JsonMissing.of(),
        @JsonProperty("venue") @ExcludeMissing venue: JsonField<String> = JsonMissing.of(),
    ) : this(
        price,
        ratio,
        side,
        symbol,
        instrumentId,
        instrumentType,
        underlyingInstrumentId,
        underlyingInstrumentType,
        venue,
        mutableMapOf(),
    )

    /**
     * Fill price for this leg.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun price(): String = price.getRequired("price")

    /**
     * This leg's ratio quantity within the strategy.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ratio(): String = ratio.getRequired("ratio")

    /**
     * Side of this leg's fill.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun side(): Side = side.getRequired("side")

    /**
     * Trading symbol for this leg.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * Instrument identifier for this leg. `null` when the leg's instrument could not be resolved
     * from its reported symbol. When a null/undefined value is observed, it indicates it does not
     * apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentId(): Optional<String> = instrumentId.getOptional("instrument_id")

    /**
     * Type of security for this leg. `null` when the leg's instrument could not be resolved from
     * its reported symbol. When a null/undefined value is observed, it indicates it does not apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentType(): Optional<SecurityType> = instrumentType.getOptional("instrument_type")

    /**
     * Underlying instrument identifier for this leg. `null` when the leg is not an option, or its
     * underlier could not be resolved. When a null/undefined value is observed, it indicates it
     * does not apply.
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
     * Venue where this leg's fill occurred, as reported by that venue. Lives per-leg rather than
     * only at the top level (see [`Execution::venue`]) because a strategy's legs can each fill on a
     * different venue. When a null/undefined value is observed, it indicates that there is no
     * available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun venue(): Optional<String> = venue.getOptional("venue")

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<String> = price

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
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

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

    /**
     * Returns the raw JSON value of [venue].
     *
     * Unlike [venue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("venue") @ExcludeMissing fun _venue(): JsonField<String> = venue

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
         * Returns a mutable builder for constructing an instance of [ExecutionLeg].
         *
         * The following fields are required:
         * ```java
         * .price()
         * .ratio()
         * .side()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExecutionLeg]. */
    class Builder internal constructor() {

        private var price: JsonField<String>? = null
        private var ratio: JsonField<String>? = null
        private var side: JsonField<Side>? = null
        private var symbol: JsonField<String>? = null
        private var instrumentId: JsonField<String> = JsonMissing.of()
        private var instrumentType: JsonField<SecurityType> = JsonMissing.of()
        private var underlyingInstrumentId: JsonField<String> = JsonMissing.of()
        private var underlyingInstrumentType: JsonField<SecurityType> = JsonMissing.of()
        private var venue: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(executionLeg: ExecutionLeg) = apply {
            price = executionLeg.price
            ratio = executionLeg.ratio
            side = executionLeg.side
            symbol = executionLeg.symbol
            instrumentId = executionLeg.instrumentId
            instrumentType = executionLeg.instrumentType
            underlyingInstrumentId = executionLeg.underlyingInstrumentId
            underlyingInstrumentType = executionLeg.underlyingInstrumentType
            venue = executionLeg.venue
            additionalProperties = executionLeg.additionalProperties.toMutableMap()
        }

        /** Fill price for this leg. */
        fun price(price: String) = price(JsonField.of(price))

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<String>) = apply { this.price = price }

        /** This leg's ratio quantity within the strategy. */
        fun ratio(ratio: String) = ratio(JsonField.of(ratio))

        /**
         * Sets [Builder.ratio] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ratio] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ratio(ratio: JsonField<String>) = apply { this.ratio = ratio }

        /** Side of this leg's fill. */
        fun side(side: Side) = side(JsonField.of(side))

        /**
         * Sets [Builder.side] to an arbitrary JSON value.
         *
         * You should usually call [Builder.side] with a well-typed [Side] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun side(side: JsonField<Side>) = apply { this.side = side }

        /** Trading symbol for this leg. */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /**
         * Instrument identifier for this leg. `null` when the leg's instrument could not be
         * resolved from its reported symbol. When a null/undefined value is observed, it indicates
         * it does not apply.
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
         * Type of security for this leg. `null` when the leg's instrument could not be resolved
         * from its reported symbol. When a null/undefined value is observed, it indicates it does
         * not apply.
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
         * Underlying instrument identifier for this leg. `null` when the leg is not an option, or
         * its underlier could not be resolved. When a null/undefined value is observed, it
         * indicates it does not apply.
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

        /**
         * Venue where this leg's fill occurred, as reported by that venue. Lives per-leg rather
         * than only at the top level (see [`Execution::venue`]) because a strategy's legs can each
         * fill on a different venue. When a null/undefined value is observed, it indicates that
         * there is no available data.
         */
        fun venue(venue: String?) = venue(JsonField.ofNullable(venue))

        /** Alias for calling [Builder.venue] with `venue.orElse(null)`. */
        fun venue(venue: Optional<String>) = venue(venue.getOrNull())

        /**
         * Sets [Builder.venue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.venue] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun venue(venue: JsonField<String>) = apply { this.venue = venue }

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
         * Returns an immutable instance of [ExecutionLeg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .price()
         * .ratio()
         * .side()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExecutionLeg =
            ExecutionLeg(
                checkRequired("price", price),
                checkRequired("ratio", ratio),
                checkRequired("side", side),
                checkRequired("symbol", symbol),
                instrumentId,
                instrumentType,
                underlyingInstrumentId,
                underlyingInstrumentType,
                venue,
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
    fun validate(): ExecutionLeg = apply {
        if (validated) {
            return@apply
        }

        price()
        ratio()
        side().validate()
        symbol()
        instrumentId()
        instrumentType().ifPresent { it.validate() }
        underlyingInstrumentId()
        underlyingInstrumentType().ifPresent { it.validate() }
        venue()
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
        (if (price.asKnown().isPresent) 1 else 0) +
            (if (ratio.asKnown().isPresent) 1 else 0) +
            (side.asKnown().getOrNull()?.validity() ?: 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (instrumentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (underlyingInstrumentId.asKnown().isPresent) 1 else 0) +
            (underlyingInstrumentType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (venue.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExecutionLeg &&
            price == other.price &&
            ratio == other.ratio &&
            side == other.side &&
            symbol == other.symbol &&
            instrumentId == other.instrumentId &&
            instrumentType == other.instrumentType &&
            underlyingInstrumentId == other.underlyingInstrumentId &&
            underlyingInstrumentType == other.underlyingInstrumentType &&
            venue == other.venue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            price,
            ratio,
            side,
            symbol,
            instrumentId,
            instrumentType,
            underlyingInstrumentId,
            underlyingInstrumentType,
            venue,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ExecutionLeg{price=$price, ratio=$ratio, side=$side, symbol=$symbol, instrumentId=$instrumentId, instrumentType=$instrumentType, underlyingInstrumentId=$underlyingInstrumentId, underlyingInstrumentType=$underlyingInstrumentType, venue=$venue, additionalProperties=$additionalProperties}"
}
