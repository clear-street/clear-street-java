// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.events

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
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

/** IPO event in the all-events date grouping response. */
class InstrumentEventIpoItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val actions: JsonField<String>,
    private val announcedAt: JsonField<OffsetDateTime>,
    private val company: JsonField<String>,
    private val exchange: JsonField<String>,
    private val marketCap: JsonField<String>,
    private val priceRange: JsonField<String>,
    private val shares: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("actions") @ExcludeMissing actions: JsonField<String> = JsonMissing.of(),
        @JsonProperty("announced_at")
        @ExcludeMissing
        announcedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("company") @ExcludeMissing company: JsonField<String> = JsonMissing.of(),
        @JsonProperty("exchange") @ExcludeMissing exchange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("market_cap") @ExcludeMissing marketCap: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price_range")
        @ExcludeMissing
        priceRange: JsonField<String> = JsonMissing.of(),
        @JsonProperty("shares") @ExcludeMissing shares: JsonField<String> = JsonMissing.of(),
    ) : this(actions, announcedAt, company, exchange, marketCap, priceRange, shares, mutableMapOf())

    /**
     * IPO action.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actions(): Optional<String> = actions.getOptional("actions")

    /**
     * IPO announced timestamp.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun announcedAt(): Optional<OffsetDateTime> = announcedAt.getOptional("announced_at")

    /**
     * IPO company name.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun company(): Optional<String> = company.getOptional("company")

    /**
     * IPO exchange.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun exchange(): Optional<String> = exchange.getOptional("exchange")

    /**
     * IPO market cap.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun marketCap(): Optional<String> = marketCap.getOptional("market_cap")

    /**
     * IPO price range.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun priceRange(): Optional<String> = priceRange.getOptional("price_range")

    /**
     * IPO shares offered.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shares(): Optional<String> = shares.getOptional("shares")

    /**
     * Returns the raw JSON value of [actions].
     *
     * Unlike [actions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actions") @ExcludeMissing fun _actions(): JsonField<String> = actions

    /**
     * Returns the raw JSON value of [announcedAt].
     *
     * Unlike [announcedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("announced_at")
    @ExcludeMissing
    fun _announcedAt(): JsonField<OffsetDateTime> = announcedAt

    /**
     * Returns the raw JSON value of [company].
     *
     * Unlike [company], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("company") @ExcludeMissing fun _company(): JsonField<String> = company

    /**
     * Returns the raw JSON value of [exchange].
     *
     * Unlike [exchange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("exchange") @ExcludeMissing fun _exchange(): JsonField<String> = exchange

    /**
     * Returns the raw JSON value of [marketCap].
     *
     * Unlike [marketCap], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("market_cap") @ExcludeMissing fun _marketCap(): JsonField<String> = marketCap

    /**
     * Returns the raw JSON value of [priceRange].
     *
     * Unlike [priceRange], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_range") @ExcludeMissing fun _priceRange(): JsonField<String> = priceRange

    /**
     * Returns the raw JSON value of [shares].
     *
     * Unlike [shares], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shares") @ExcludeMissing fun _shares(): JsonField<String> = shares

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

        /** Returns a mutable builder for constructing an instance of [InstrumentEventIpoItem]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentEventIpoItem]. */
    class Builder internal constructor() {

        private var actions: JsonField<String> = JsonMissing.of()
        private var announcedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var company: JsonField<String> = JsonMissing.of()
        private var exchange: JsonField<String> = JsonMissing.of()
        private var marketCap: JsonField<String> = JsonMissing.of()
        private var priceRange: JsonField<String> = JsonMissing.of()
        private var shares: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentEventIpoItem: InstrumentEventIpoItem) = apply {
            actions = instrumentEventIpoItem.actions
            announcedAt = instrumentEventIpoItem.announcedAt
            company = instrumentEventIpoItem.company
            exchange = instrumentEventIpoItem.exchange
            marketCap = instrumentEventIpoItem.marketCap
            priceRange = instrumentEventIpoItem.priceRange
            shares = instrumentEventIpoItem.shares
            additionalProperties = instrumentEventIpoItem.additionalProperties.toMutableMap()
        }

        /** IPO action. */
        fun actions(actions: String?) = actions(JsonField.ofNullable(actions))

        /** Alias for calling [Builder.actions] with `actions.orElse(null)`. */
        fun actions(actions: Optional<String>) = actions(actions.getOrNull())

        /**
         * Sets [Builder.actions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actions] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun actions(actions: JsonField<String>) = apply { this.actions = actions }

        /** IPO announced timestamp. */
        fun announcedAt(announcedAt: OffsetDateTime?) =
            announcedAt(JsonField.ofNullable(announcedAt))

        /** Alias for calling [Builder.announcedAt] with `announcedAt.orElse(null)`. */
        fun announcedAt(announcedAt: Optional<OffsetDateTime>) =
            announcedAt(announcedAt.getOrNull())

        /**
         * Sets [Builder.announcedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.announcedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun announcedAt(announcedAt: JsonField<OffsetDateTime>) = apply {
            this.announcedAt = announcedAt
        }

        /** IPO company name. */
        fun company(company: String?) = company(JsonField.ofNullable(company))

        /** Alias for calling [Builder.company] with `company.orElse(null)`. */
        fun company(company: Optional<String>) = company(company.getOrNull())

        /**
         * Sets [Builder.company] to an arbitrary JSON value.
         *
         * You should usually call [Builder.company] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun company(company: JsonField<String>) = apply { this.company = company }

        /** IPO exchange. */
        fun exchange(exchange: String?) = exchange(JsonField.ofNullable(exchange))

        /** Alias for calling [Builder.exchange] with `exchange.orElse(null)`. */
        fun exchange(exchange: Optional<String>) = exchange(exchange.getOrNull())

        /**
         * Sets [Builder.exchange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.exchange] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun exchange(exchange: JsonField<String>) = apply { this.exchange = exchange }

        /** IPO market cap. */
        fun marketCap(marketCap: String?) = marketCap(JsonField.ofNullable(marketCap))

        /** Alias for calling [Builder.marketCap] with `marketCap.orElse(null)`. */
        fun marketCap(marketCap: Optional<String>) = marketCap(marketCap.getOrNull())

        /**
         * Sets [Builder.marketCap] to an arbitrary JSON value.
         *
         * You should usually call [Builder.marketCap] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun marketCap(marketCap: JsonField<String>) = apply { this.marketCap = marketCap }

        /** IPO price range. */
        fun priceRange(priceRange: String?) = priceRange(JsonField.ofNullable(priceRange))

        /** Alias for calling [Builder.priceRange] with `priceRange.orElse(null)`. */
        fun priceRange(priceRange: Optional<String>) = priceRange(priceRange.getOrNull())

        /**
         * Sets [Builder.priceRange] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceRange] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun priceRange(priceRange: JsonField<String>) = apply { this.priceRange = priceRange }

        /** IPO shares offered. */
        fun shares(shares: String?) = shares(JsonField.ofNullable(shares))

        /** Alias for calling [Builder.shares] with `shares.orElse(null)`. */
        fun shares(shares: Optional<String>) = shares(shares.getOrNull())

        /**
         * Sets [Builder.shares] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shares] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shares(shares: JsonField<String>) = apply { this.shares = shares }

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
         * Returns an immutable instance of [InstrumentEventIpoItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InstrumentEventIpoItem =
            InstrumentEventIpoItem(
                actions,
                announcedAt,
                company,
                exchange,
                marketCap,
                priceRange,
                shares,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InstrumentEventIpoItem = apply {
        if (validated) {
            return@apply
        }

        actions()
        announcedAt()
        company()
        exchange()
        marketCap()
        priceRange()
        shares()
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
        (if (actions.asKnown().isPresent) 1 else 0) +
            (if (announcedAt.asKnown().isPresent) 1 else 0) +
            (if (company.asKnown().isPresent) 1 else 0) +
            (if (exchange.asKnown().isPresent) 1 else 0) +
            (if (marketCap.asKnown().isPresent) 1 else 0) +
            (if (priceRange.asKnown().isPresent) 1 else 0) +
            (if (shares.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentEventIpoItem &&
            actions == other.actions &&
            announcedAt == other.announcedAt &&
            company == other.company &&
            exchange == other.exchange &&
            marketCap == other.marketCap &&
            priceRange == other.priceRange &&
            shares == other.shares &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            actions,
            announcedAt,
            company,
            exchange,
            marketCap,
            priceRange,
            shares,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentEventIpoItem{actions=$actions, announcedAt=$announcedAt, company=$company, exchange=$exchange, marketCap=$marketCap, priceRange=$priceRange, shares=$shares, additionalProperties=$additionalProperties}"
}
