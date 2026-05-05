// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.marketdata.snapshot

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

/** Market data snapshot for a single security. */
class MarketDataSnapshot
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val instrumentId: JsonField<String>,
    private val symbol: JsonField<String>,
    private val lastQuote: JsonField<SnapshotQuote>,
    private val lastTrade: JsonField<SnapshotLastTrade>,
    private val name: JsonField<String>,
    private val session: JsonField<SnapshotSession>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last_quote")
        @ExcludeMissing
        lastQuote: JsonField<SnapshotQuote> = JsonMissing.of(),
        @JsonProperty("last_trade")
        @ExcludeMissing
        lastTrade: JsonField<SnapshotLastTrade> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session")
        @ExcludeMissing
        session: JsonField<SnapshotSession> = JsonMissing.of(),
    ) : this(instrumentId, symbol, lastQuote, lastTrade, name, session, mutableMapOf())

    /**
     * OEMS instrument identifier.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun instrumentId(): String = instrumentId.getRequired("instrument_id")

    /**
     * Display symbol for the security.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * Most recent quote if available.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastQuote(): Optional<SnapshotQuote> = lastQuote.getOptional("last_quote")

    /**
     * Most recent last-sale trade if available.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastTrade(): Optional<SnapshotLastTrade> = lastTrade.getOptional("last_trade")

    /**
     * Security name if available.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Session metrics computed from previous close and last trade, if available.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun session(): Optional<SnapshotSession> = session.getOptional("session")

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [lastQuote].
     *
     * Unlike [lastQuote], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_quote")
    @ExcludeMissing
    fun _lastQuote(): JsonField<SnapshotQuote> = lastQuote

    /**
     * Returns the raw JSON value of [lastTrade].
     *
     * Unlike [lastTrade], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last_trade")
    @ExcludeMissing
    fun _lastTrade(): JsonField<SnapshotLastTrade> = lastTrade

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [session].
     *
     * Unlike [session], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session") @ExcludeMissing fun _session(): JsonField<SnapshotSession> = session

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
         * Returns a mutable builder for constructing an instance of [MarketDataSnapshot].
         *
         * The following fields are required:
         * ```java
         * .instrumentId()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarketDataSnapshot]. */
    class Builder internal constructor() {

        private var instrumentId: JsonField<String>? = null
        private var symbol: JsonField<String>? = null
        private var lastQuote: JsonField<SnapshotQuote> = JsonMissing.of()
        private var lastTrade: JsonField<SnapshotLastTrade> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var session: JsonField<SnapshotSession> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marketDataSnapshot: MarketDataSnapshot) = apply {
            instrumentId = marketDataSnapshot.instrumentId
            symbol = marketDataSnapshot.symbol
            lastQuote = marketDataSnapshot.lastQuote
            lastTrade = marketDataSnapshot.lastTrade
            name = marketDataSnapshot.name
            session = marketDataSnapshot.session
            additionalProperties = marketDataSnapshot.additionalProperties.toMutableMap()
        }

        /** OEMS instrument identifier. */
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

        /** Display symbol for the security. */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** Most recent quote if available. */
        fun lastQuote(lastQuote: SnapshotQuote?) = lastQuote(JsonField.ofNullable(lastQuote))

        /** Alias for calling [Builder.lastQuote] with `lastQuote.orElse(null)`. */
        fun lastQuote(lastQuote: Optional<SnapshotQuote>) = lastQuote(lastQuote.getOrNull())

        /**
         * Sets [Builder.lastQuote] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastQuote] with a well-typed [SnapshotQuote] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastQuote(lastQuote: JsonField<SnapshotQuote>) = apply { this.lastQuote = lastQuote }

        /** Most recent last-sale trade if available. */
        fun lastTrade(lastTrade: SnapshotLastTrade?) = lastTrade(JsonField.ofNullable(lastTrade))

        /** Alias for calling [Builder.lastTrade] with `lastTrade.orElse(null)`. */
        fun lastTrade(lastTrade: Optional<SnapshotLastTrade>) = lastTrade(lastTrade.getOrNull())

        /**
         * Sets [Builder.lastTrade] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastTrade] with a well-typed [SnapshotLastTrade] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastTrade(lastTrade: JsonField<SnapshotLastTrade>) = apply {
            this.lastTrade = lastTrade
        }

        /** Security name if available. */
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

        /** Session metrics computed from previous close and last trade, if available. */
        fun session(session: SnapshotSession?) = session(JsonField.ofNullable(session))

        /** Alias for calling [Builder.session] with `session.orElse(null)`. */
        fun session(session: Optional<SnapshotSession>) = session(session.getOrNull())

        /**
         * Sets [Builder.session] to an arbitrary JSON value.
         *
         * You should usually call [Builder.session] with a well-typed [SnapshotSession] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun session(session: JsonField<SnapshotSession>) = apply { this.session = session }

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
         * Returns an immutable instance of [MarketDataSnapshot].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .instrumentId()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarketDataSnapshot =
            MarketDataSnapshot(
                checkRequired("instrumentId", instrumentId),
                checkRequired("symbol", symbol),
                lastQuote,
                lastTrade,
                name,
                session,
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
    fun validate(): MarketDataSnapshot = apply {
        if (validated) {
            return@apply
        }

        instrumentId()
        symbol()
        lastQuote().ifPresent { it.validate() }
        lastTrade().ifPresent { it.validate() }
        name()
        session().ifPresent { it.validate() }
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
        (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (lastQuote.asKnown().getOrNull()?.validity() ?: 0) +
            (lastTrade.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (session.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarketDataSnapshot &&
            instrumentId == other.instrumentId &&
            symbol == other.symbol &&
            lastQuote == other.lastQuote &&
            lastTrade == other.lastTrade &&
            name == other.name &&
            session == other.session &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            instrumentId,
            symbol,
            lastQuote,
            lastTrade,
            name,
            session,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarketDataSnapshot{instrumentId=$instrumentId, symbol=$symbol, lastQuote=$lastQuote, lastTrade=$lastTrade, name=$name, session=$session, additionalProperties=$additionalProperties}"
}
