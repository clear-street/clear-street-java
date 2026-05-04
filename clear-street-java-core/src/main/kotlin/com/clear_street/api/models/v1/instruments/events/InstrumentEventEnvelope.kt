// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.events

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.instruments.InstrumentEarnings
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Unified envelope for the all-events response. */
class InstrumentEventEnvelope
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val symbol: JsonField<String>,
    private val type: JsonField<AllEventsEventType>,
    private val dividendEventData: JsonField<InstrumentDividendEvent>,
    private val earningsEventData: JsonField<InstrumentEarnings>,
    private val instrumentId: JsonField<String>,
    private val ipoEventData: JsonField<InstrumentEventIpoItem>,
    private val name: JsonField<String>,
    private val stockSplitEventData: JsonField<InstrumentSplitEvent>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        type: JsonField<AllEventsEventType> = JsonMissing.of(),
        @JsonProperty("dividend_event_data")
        @ExcludeMissing
        dividendEventData: JsonField<InstrumentDividendEvent> = JsonMissing.of(),
        @JsonProperty("earnings_event_data")
        @ExcludeMissing
        earningsEventData: JsonField<InstrumentEarnings> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ipo_event_data")
        @ExcludeMissing
        ipoEventData: JsonField<InstrumentEventIpoItem> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stock_split_event_data")
        @ExcludeMissing
        stockSplitEventData: JsonField<InstrumentSplitEvent> = JsonMissing.of(),
    ) : this(
        symbol,
        type,
        dividendEventData,
        earningsEventData,
        instrumentId,
        ipoEventData,
        name,
        stockSplitEventData,
        mutableMapOf(),
    )

    /**
     * Symbol associated with the event.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * Event type discriminator.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): AllEventsEventType = type.getRequired("type")

    /**
     * Dividend payload when type is DIVIDEND.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dividendEventData(): Optional<InstrumentDividendEvent> =
        dividendEventData.getOptional("dividend_event_data")

    /**
     * Earnings payload when type is EARNINGS.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun earningsEventData(): Optional<InstrumentEarnings> =
        earningsEventData.getOptional("earnings_event_data")

    /**
     * OEMS instrument identifier, when the instrument is found in the instrument cache.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentId(): Optional<String> = instrumentId.getOptional("instrument_id")

    /**
     * IPO payload when type is IPO.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipoEventData(): Optional<InstrumentEventIpoItem> =
        ipoEventData.getOptional("ipo_event_data")

    /**
     * Instrument name associated with the event, when available.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Stock split payload when type is STOCK_SPLIT.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stockSplitEventData(): Optional<InstrumentSplitEvent> =
        stockSplitEventData.getOptional("stock_split_event_data")

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AllEventsEventType> = type

    /**
     * Returns the raw JSON value of [dividendEventData].
     *
     * Unlike [dividendEventData], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("dividend_event_data")
    @ExcludeMissing
    fun _dividendEventData(): JsonField<InstrumentDividendEvent> = dividendEventData

    /**
     * Returns the raw JSON value of [earningsEventData].
     *
     * Unlike [earningsEventData], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("earnings_event_data")
    @ExcludeMissing
    fun _earningsEventData(): JsonField<InstrumentEarnings> = earningsEventData

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [ipoEventData].
     *
     * Unlike [ipoEventData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ipo_event_data")
    @ExcludeMissing
    fun _ipoEventData(): JsonField<InstrumentEventIpoItem> = ipoEventData

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [stockSplitEventData].
     *
     * Unlike [stockSplitEventData], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("stock_split_event_data")
    @ExcludeMissing
    fun _stockSplitEventData(): JsonField<InstrumentSplitEvent> = stockSplitEventData

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
         * Returns a mutable builder for constructing an instance of [InstrumentEventEnvelope].
         *
         * The following fields are required:
         * ```java
         * .symbol()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentEventEnvelope]. */
    class Builder internal constructor() {

        private var symbol: JsonField<String>? = null
        private var type: JsonField<AllEventsEventType>? = null
        private var dividendEventData: JsonField<InstrumentDividendEvent> = JsonMissing.of()
        private var earningsEventData: JsonField<InstrumentEarnings> = JsonMissing.of()
        private var instrumentId: JsonField<String> = JsonMissing.of()
        private var ipoEventData: JsonField<InstrumentEventIpoItem> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var stockSplitEventData: JsonField<InstrumentSplitEvent> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentEventEnvelope: InstrumentEventEnvelope) = apply {
            symbol = instrumentEventEnvelope.symbol
            type = instrumentEventEnvelope.type
            dividendEventData = instrumentEventEnvelope.dividendEventData
            earningsEventData = instrumentEventEnvelope.earningsEventData
            instrumentId = instrumentEventEnvelope.instrumentId
            ipoEventData = instrumentEventEnvelope.ipoEventData
            name = instrumentEventEnvelope.name
            stockSplitEventData = instrumentEventEnvelope.stockSplitEventData
            additionalProperties = instrumentEventEnvelope.additionalProperties.toMutableMap()
        }

        /** Symbol associated with the event. */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** Event type discriminator. */
        fun type(type: AllEventsEventType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [AllEventsEventType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun type(type: JsonField<AllEventsEventType>) = apply { this.type = type }

        /** Dividend payload when type is DIVIDEND. */
        fun dividendEventData(dividendEventData: InstrumentDividendEvent?) =
            dividendEventData(JsonField.ofNullable(dividendEventData))

        /** Alias for calling [Builder.dividendEventData] with `dividendEventData.orElse(null)`. */
        fun dividendEventData(dividendEventData: Optional<InstrumentDividendEvent>) =
            dividendEventData(dividendEventData.getOrNull())

        /**
         * Sets [Builder.dividendEventData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dividendEventData] with a well-typed
         * [InstrumentDividendEvent] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun dividendEventData(dividendEventData: JsonField<InstrumentDividendEvent>) = apply {
            this.dividendEventData = dividendEventData
        }

        /** Earnings payload when type is EARNINGS. */
        fun earningsEventData(earningsEventData: InstrumentEarnings?) =
            earningsEventData(JsonField.ofNullable(earningsEventData))

        /** Alias for calling [Builder.earningsEventData] with `earningsEventData.orElse(null)`. */
        fun earningsEventData(earningsEventData: Optional<InstrumentEarnings>) =
            earningsEventData(earningsEventData.getOrNull())

        /**
         * Sets [Builder.earningsEventData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earningsEventData] with a well-typed
         * [InstrumentEarnings] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun earningsEventData(earningsEventData: JsonField<InstrumentEarnings>) = apply {
            this.earningsEventData = earningsEventData
        }

        /** OEMS instrument identifier, when the instrument is found in the instrument cache. */
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

        /** IPO payload when type is IPO. */
        fun ipoEventData(ipoEventData: InstrumentEventIpoItem?) =
            ipoEventData(JsonField.ofNullable(ipoEventData))

        /** Alias for calling [Builder.ipoEventData] with `ipoEventData.orElse(null)`. */
        fun ipoEventData(ipoEventData: Optional<InstrumentEventIpoItem>) =
            ipoEventData(ipoEventData.getOrNull())

        /**
         * Sets [Builder.ipoEventData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipoEventData] with a well-typed [InstrumentEventIpoItem]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun ipoEventData(ipoEventData: JsonField<InstrumentEventIpoItem>) = apply {
            this.ipoEventData = ipoEventData
        }

        /** Instrument name associated with the event, when available. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Stock split payload when type is STOCK_SPLIT. */
        fun stockSplitEventData(stockSplitEventData: InstrumentSplitEvent?) =
            stockSplitEventData(JsonField.ofNullable(stockSplitEventData))

        /**
         * Alias for calling [Builder.stockSplitEventData] with `stockSplitEventData.orElse(null)`.
         */
        fun stockSplitEventData(stockSplitEventData: Optional<InstrumentSplitEvent>) =
            stockSplitEventData(stockSplitEventData.getOrNull())

        /**
         * Sets [Builder.stockSplitEventData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stockSplitEventData] with a well-typed
         * [InstrumentSplitEvent] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun stockSplitEventData(stockSplitEventData: JsonField<InstrumentSplitEvent>) = apply {
            this.stockSplitEventData = stockSplitEventData
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
         * Returns an immutable instance of [InstrumentEventEnvelope].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .symbol()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentEventEnvelope =
            InstrumentEventEnvelope(
                checkRequired("symbol", symbol),
                checkRequired("type", type),
                dividendEventData,
                earningsEventData,
                instrumentId,
                ipoEventData,
                name,
                stockSplitEventData,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InstrumentEventEnvelope = apply {
        if (validated) {
            return@apply
        }

        symbol()
        type().validate()
        dividendEventData().ifPresent { it.validate() }
        earningsEventData().ifPresent { it.validate() }
        instrumentId()
        ipoEventData().ifPresent { it.validate() }
        name()
        stockSplitEventData().ifPresent { it.validate() }
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
        (if (symbol.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0) +
            (dividendEventData.asKnown().getOrNull()?.validity() ?: 0) +
            (earningsEventData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (ipoEventData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (stockSplitEventData.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentEventEnvelope &&
            symbol == other.symbol &&
            type == other.type &&
            dividendEventData == other.dividendEventData &&
            earningsEventData == other.earningsEventData &&
            instrumentId == other.instrumentId &&
            ipoEventData == other.ipoEventData &&
            name == other.name &&
            stockSplitEventData == other.stockSplitEventData &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            symbol,
            type,
            dividendEventData,
            earningsEventData,
            instrumentId,
            ipoEventData,
            name,
            stockSplitEventData,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentEventEnvelope{symbol=$symbol, type=$type, dividendEventData=$dividendEventData, earningsEventData=$earningsEventData, instrumentId=$instrumentId, ipoEventData=$ipoEventData, name=$name, stockSplitEventData=$stockSplitEventData, additionalProperties=$additionalProperties}"
}
