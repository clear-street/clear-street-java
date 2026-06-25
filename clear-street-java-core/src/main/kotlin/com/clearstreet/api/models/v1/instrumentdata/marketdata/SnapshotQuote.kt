// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instrumentdata.marketdata

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** L1 quote fields for a market data snapshot. */
class SnapshotQuote
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val ask: JsonField<String>,
    private val askSize: JsonField<Int>,
    private val bid: JsonField<String>,
    private val bidSize: JsonField<Int>,
    private val midpoint: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("ask") @ExcludeMissing ask: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ask_size") @ExcludeMissing askSize: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("bid") @ExcludeMissing bid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bid_size") @ExcludeMissing bidSize: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("midpoint") @ExcludeMissing midpoint: JsonField<String> = JsonMissing.of(),
    ) : this(ask, askSize, bid, bidSize, midpoint, mutableMapOf())

    /**
     * Current best ask. Absent when no ask is available (one-sided quote). When a null/undefined
     * value is observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ask(): Optional<String> = ask.getOptional("ask")

    /**
     * Size at the best ask, in shares. When a null/undefined value is observed, it indicates that
     * there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun askSize(): Optional<Int> = askSize.getOptional("ask_size")

    /**
     * Current best bid. Absent when no bid is available (one-sided quote). When a null/undefined
     * value is observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bid(): Optional<String> = bid.getOptional("bid")

    /**
     * Size at the best bid, in shares. When a null/undefined value is observed, it indicates that
     * there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bidSize(): Optional<Int> = bidSize.getOptional("bid_size")

    /**
     * Midpoint of bid and ask. Absent when either side is missing. When a null/undefined value is
     * observed, it indicates that there is no available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun midpoint(): Optional<String> = midpoint.getOptional("midpoint")

    /**
     * Returns the raw JSON value of [ask].
     *
     * Unlike [ask], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ask") @ExcludeMissing fun _ask(): JsonField<String> = ask

    /**
     * Returns the raw JSON value of [askSize].
     *
     * Unlike [askSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ask_size") @ExcludeMissing fun _askSize(): JsonField<Int> = askSize

    /**
     * Returns the raw JSON value of [bid].
     *
     * Unlike [bid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bid") @ExcludeMissing fun _bid(): JsonField<String> = bid

    /**
     * Returns the raw JSON value of [bidSize].
     *
     * Unlike [bidSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bid_size") @ExcludeMissing fun _bidSize(): JsonField<Int> = bidSize

    /**
     * Returns the raw JSON value of [midpoint].
     *
     * Unlike [midpoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("midpoint") @ExcludeMissing fun _midpoint(): JsonField<String> = midpoint

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

        /** Returns a mutable builder for constructing an instance of [SnapshotQuote]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SnapshotQuote]. */
    class Builder internal constructor() {

        private var ask: JsonField<String> = JsonMissing.of()
        private var askSize: JsonField<Int> = JsonMissing.of()
        private var bid: JsonField<String> = JsonMissing.of()
        private var bidSize: JsonField<Int> = JsonMissing.of()
        private var midpoint: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(snapshotQuote: SnapshotQuote) = apply {
            ask = snapshotQuote.ask
            askSize = snapshotQuote.askSize
            bid = snapshotQuote.bid
            bidSize = snapshotQuote.bidSize
            midpoint = snapshotQuote.midpoint
            additionalProperties = snapshotQuote.additionalProperties.toMutableMap()
        }

        /**
         * Current best ask. Absent when no ask is available (one-sided quote). When a
         * null/undefined value is observed, it indicates that there is no available data.
         */
        fun ask(ask: String?) = ask(JsonField.ofNullable(ask))

        /** Alias for calling [Builder.ask] with `ask.orElse(null)`. */
        fun ask(ask: Optional<String>) = ask(ask.getOrNull())

        /**
         * Sets [Builder.ask] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ask] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ask(ask: JsonField<String>) = apply { this.ask = ask }

        /**
         * Size at the best ask, in shares. When a null/undefined value is observed, it indicates
         * that there is no available data.
         */
        fun askSize(askSize: Int?) = askSize(JsonField.ofNullable(askSize))

        /**
         * Alias for [Builder.askSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun askSize(askSize: Int) = askSize(askSize as Int?)

        /** Alias for calling [Builder.askSize] with `askSize.orElse(null)`. */
        fun askSize(askSize: Optional<Int>) = askSize(askSize.getOrNull())

        /**
         * Sets [Builder.askSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.askSize] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun askSize(askSize: JsonField<Int>) = apply { this.askSize = askSize }

        /**
         * Current best bid. Absent when no bid is available (one-sided quote). When a
         * null/undefined value is observed, it indicates that there is no available data.
         */
        fun bid(bid: String?) = bid(JsonField.ofNullable(bid))

        /** Alias for calling [Builder.bid] with `bid.orElse(null)`. */
        fun bid(bid: Optional<String>) = bid(bid.getOrNull())

        /**
         * Sets [Builder.bid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bid(bid: JsonField<String>) = apply { this.bid = bid }

        /**
         * Size at the best bid, in shares. When a null/undefined value is observed, it indicates
         * that there is no available data.
         */
        fun bidSize(bidSize: Int?) = bidSize(JsonField.ofNullable(bidSize))

        /**
         * Alias for [Builder.bidSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun bidSize(bidSize: Int) = bidSize(bidSize as Int?)

        /** Alias for calling [Builder.bidSize] with `bidSize.orElse(null)`. */
        fun bidSize(bidSize: Optional<Int>) = bidSize(bidSize.getOrNull())

        /**
         * Sets [Builder.bidSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bidSize] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bidSize(bidSize: JsonField<Int>) = apply { this.bidSize = bidSize }

        /**
         * Midpoint of bid and ask. Absent when either side is missing. When a null/undefined value
         * is observed, it indicates that there is no available data.
         */
        fun midpoint(midpoint: String?) = midpoint(JsonField.ofNullable(midpoint))

        /** Alias for calling [Builder.midpoint] with `midpoint.orElse(null)`. */
        fun midpoint(midpoint: Optional<String>) = midpoint(midpoint.getOrNull())

        /**
         * Sets [Builder.midpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.midpoint] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun midpoint(midpoint: JsonField<String>) = apply { this.midpoint = midpoint }

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
         * Returns an immutable instance of [SnapshotQuote].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SnapshotQuote =
            SnapshotQuote(ask, askSize, bid, bidSize, midpoint, additionalProperties.toMutableMap())
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
    fun validate(): SnapshotQuote = apply {
        if (validated) {
            return@apply
        }

        ask()
        askSize()
        bid()
        bidSize()
        midpoint()
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
        (if (ask.asKnown().isPresent) 1 else 0) +
            (if (askSize.asKnown().isPresent) 1 else 0) +
            (if (bid.asKnown().isPresent) 1 else 0) +
            (if (bidSize.asKnown().isPresent) 1 else 0) +
            (if (midpoint.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SnapshotQuote &&
            ask == other.ask &&
            askSize == other.askSize &&
            bid == other.bid &&
            bidSize == other.bidSize &&
            midpoint == other.midpoint &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(ask, askSize, bid, bidSize, midpoint, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SnapshotQuote{ask=$ask, askSize=$askSize, bid=$bid, bidSize=$bidSize, midpoint=$midpoint, additionalProperties=$additionalProperties}"
}
