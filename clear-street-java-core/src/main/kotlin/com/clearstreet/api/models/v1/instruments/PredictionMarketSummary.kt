// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Summary of a prediction market inside an event listing. Request the market by `id` or `symbol`
 * for its full detail.
 */
class PredictionMarketSummary
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val isLiquidationOnly: JsonField<Boolean>,
    private val isTradable: JsonField<Boolean>,
    private val status: JsonField<PredictionMarketStatus>,
    private val symbol: JsonField<String>,
    private val closeAt: JsonField<OffsetDateTime>,
    private val openAt: JsonField<OffsetDateTime>,
    private val outcome: JsonField<PredictionMarketOutcome>,
    private val settlementPrice: JsonField<String>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_liquidation_only")
        @ExcludeMissing
        isLiquidationOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_tradable")
        @ExcludeMissing
        isTradable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PredictionMarketStatus> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("close_at")
        @ExcludeMissing
        closeAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("open_at")
        @ExcludeMissing
        openAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("outcome")
        @ExcludeMissing
        outcome: JsonField<PredictionMarketOutcome> = JsonMissing.of(),
        @JsonProperty("settlement_price")
        @ExcludeMissing
        settlementPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        isLiquidationOnly,
        isTradable,
        status,
        symbol,
        closeAt,
        openAt,
        outcome,
        settlementPrice,
        title,
        mutableMapOf(),
    )

    /**
     * Instrument id of the market.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Whether only orders that reduce a position are accepted.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isLiquidationOnly(): Boolean = isLiquidationOnly.getRequired("is_liquidation_only")

    /**
     * Whether the market accepts orders now.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isTradable(): Boolean = isTradable.getRequired("is_tradable")

    /**
     * Current status of the market.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): PredictionMarketStatus = status.getRequired("status")

    /**
     * Market ticker.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * When trading is scheduled to close.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun closeAt(): Optional<OffsetDateTime> = closeAt.getOptional("close_at")

    /**
     * When trading opens.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun openAt(): Optional<OffsetDateTime> = openAt.getOptional("open_at")

    /**
     * Winning side. Set only when `status` is `SETTLED` and the market resolved `YES` or `NO`.
     * Absent otherwise, including for voided and scalar markets.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun outcome(): Optional<PredictionMarketOutcome> = outcome.getOptional("outcome")

    /**
     * Settlement value of the YES side, in dollars per contract. Set only when `status` is
     * `SETTLED`, and absent otherwise.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun settlementPrice(): Optional<String> = settlementPrice.getOptional("settlement_price")

    /**
     * Short title of the market, for example the name of the candidate.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [isLiquidationOnly].
     *
     * Unlike [isLiquidationOnly], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("is_liquidation_only")
    @ExcludeMissing
    fun _isLiquidationOnly(): JsonField<Boolean> = isLiquidationOnly

    /**
     * Returns the raw JSON value of [isTradable].
     *
     * Unlike [isTradable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_tradable") @ExcludeMissing fun _isTradable(): JsonField<Boolean> = isTradable

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<PredictionMarketStatus> = status

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

    /**
     * Returns the raw JSON value of [closeAt].
     *
     * Unlike [closeAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("close_at") @ExcludeMissing fun _closeAt(): JsonField<OffsetDateTime> = closeAt

    /**
     * Returns the raw JSON value of [openAt].
     *
     * Unlike [openAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open_at") @ExcludeMissing fun _openAt(): JsonField<OffsetDateTime> = openAt

    /**
     * Returns the raw JSON value of [outcome].
     *
     * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("outcome")
    @ExcludeMissing
    fun _outcome(): JsonField<PredictionMarketOutcome> = outcome

    /**
     * Returns the raw JSON value of [settlementPrice].
     *
     * Unlike [settlementPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settlement_price")
    @ExcludeMissing
    fun _settlementPrice(): JsonField<String> = settlementPrice

    /**
     * Returns the raw JSON value of [title].
     *
     * Unlike [title], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("title") @ExcludeMissing fun _title(): JsonField<String> = title

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
         * Returns a mutable builder for constructing an instance of [PredictionMarketSummary].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .isLiquidationOnly()
         * .isTradable()
         * .status()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PredictionMarketSummary]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var isLiquidationOnly: JsonField<Boolean>? = null
        private var isTradable: JsonField<Boolean>? = null
        private var status: JsonField<PredictionMarketStatus>? = null
        private var symbol: JsonField<String>? = null
        private var closeAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var openAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var outcome: JsonField<PredictionMarketOutcome> = JsonMissing.of()
        private var settlementPrice: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(predictionMarketSummary: PredictionMarketSummary) = apply {
            id = predictionMarketSummary.id
            isLiquidationOnly = predictionMarketSummary.isLiquidationOnly
            isTradable = predictionMarketSummary.isTradable
            status = predictionMarketSummary.status
            symbol = predictionMarketSummary.symbol
            closeAt = predictionMarketSummary.closeAt
            openAt = predictionMarketSummary.openAt
            outcome = predictionMarketSummary.outcome
            settlementPrice = predictionMarketSummary.settlementPrice
            title = predictionMarketSummary.title
            additionalProperties = predictionMarketSummary.additionalProperties.toMutableMap()
        }

        /** Instrument id of the market. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Whether only orders that reduce a position are accepted. */
        fun isLiquidationOnly(isLiquidationOnly: Boolean) =
            isLiquidationOnly(JsonField.of(isLiquidationOnly))

        /**
         * Sets [Builder.isLiquidationOnly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isLiquidationOnly] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isLiquidationOnly(isLiquidationOnly: JsonField<Boolean>) = apply {
            this.isLiquidationOnly = isLiquidationOnly
        }

        /** Whether the market accepts orders now. */
        fun isTradable(isTradable: Boolean) = isTradable(JsonField.of(isTradable))

        /**
         * Sets [Builder.isTradable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isTradable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isTradable(isTradable: JsonField<Boolean>) = apply { this.isTradable = isTradable }

        /** Current status of the market. */
        fun status(status: PredictionMarketStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PredictionMarketStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<PredictionMarketStatus>) = apply { this.status = status }

        /** Market ticker. */
        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        /** When trading is scheduled to close. */
        fun closeAt(closeAt: OffsetDateTime?) = closeAt(JsonField.ofNullable(closeAt))

        /** Alias for calling [Builder.closeAt] with `closeAt.orElse(null)`. */
        fun closeAt(closeAt: Optional<OffsetDateTime>) = closeAt(closeAt.getOrNull())

        /**
         * Sets [Builder.closeAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.closeAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun closeAt(closeAt: JsonField<OffsetDateTime>) = apply { this.closeAt = closeAt }

        /** When trading opens. */
        fun openAt(openAt: OffsetDateTime?) = openAt(JsonField.ofNullable(openAt))

        /** Alias for calling [Builder.openAt] with `openAt.orElse(null)`. */
        fun openAt(openAt: Optional<OffsetDateTime>) = openAt(openAt.getOrNull())

        /**
         * Sets [Builder.openAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.openAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun openAt(openAt: JsonField<OffsetDateTime>) = apply { this.openAt = openAt }

        /**
         * Winning side. Set only when `status` is `SETTLED` and the market resolved `YES` or `NO`.
         * Absent otherwise, including for voided and scalar markets.
         */
        fun outcome(outcome: PredictionMarketOutcome?) = outcome(JsonField.ofNullable(outcome))

        /** Alias for calling [Builder.outcome] with `outcome.orElse(null)`. */
        fun outcome(outcome: Optional<PredictionMarketOutcome>) = outcome(outcome.getOrNull())

        /**
         * Sets [Builder.outcome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.outcome] with a well-typed [PredictionMarketOutcome]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun outcome(outcome: JsonField<PredictionMarketOutcome>) = apply { this.outcome = outcome }

        /**
         * Settlement value of the YES side, in dollars per contract. Set only when `status` is
         * `SETTLED`, and absent otherwise.
         */
        fun settlementPrice(settlementPrice: String?) =
            settlementPrice(JsonField.ofNullable(settlementPrice))

        /** Alias for calling [Builder.settlementPrice] with `settlementPrice.orElse(null)`. */
        fun settlementPrice(settlementPrice: Optional<String>) =
            settlementPrice(settlementPrice.getOrNull())

        /**
         * Sets [Builder.settlementPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementPrice] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settlementPrice(settlementPrice: JsonField<String>) = apply {
            this.settlementPrice = settlementPrice
        }

        /** Short title of the market, for example the name of the candidate. */
        fun title(title: String?) = title(JsonField.ofNullable(title))

        /** Alias for calling [Builder.title] with `title.orElse(null)`. */
        fun title(title: Optional<String>) = title(title.getOrNull())

        /**
         * Sets [Builder.title] to an arbitrary JSON value.
         *
         * You should usually call [Builder.title] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun title(title: JsonField<String>) = apply { this.title = title }

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
         * Returns an immutable instance of [PredictionMarketSummary].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .isLiquidationOnly()
         * .isTradable()
         * .status()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PredictionMarketSummary =
            PredictionMarketSummary(
                checkRequired("id", id),
                checkRequired("isLiquidationOnly", isLiquidationOnly),
                checkRequired("isTradable", isTradable),
                checkRequired("status", status),
                checkRequired("symbol", symbol),
                closeAt,
                openAt,
                outcome,
                settlementPrice,
                title,
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
    fun validate(): PredictionMarketSummary = apply {
        if (validated) {
            return@apply
        }

        id()
        isLiquidationOnly()
        isTradable()
        status().validate()
        symbol()
        closeAt()
        openAt()
        outcome().ifPresent { it.validate() }
        settlementPrice()
        title()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (isLiquidationOnly.asKnown().isPresent) 1 else 0) +
            (if (isTradable.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (closeAt.asKnown().isPresent) 1 else 0) +
            (if (openAt.asKnown().isPresent) 1 else 0) +
            (outcome.asKnown().getOrNull()?.validity() ?: 0) +
            (if (settlementPrice.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PredictionMarketSummary &&
            id == other.id &&
            isLiquidationOnly == other.isLiquidationOnly &&
            isTradable == other.isTradable &&
            status == other.status &&
            symbol == other.symbol &&
            closeAt == other.closeAt &&
            openAt == other.openAt &&
            outcome == other.outcome &&
            settlementPrice == other.settlementPrice &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            isLiquidationOnly,
            isTradable,
            status,
            symbol,
            closeAt,
            openAt,
            outcome,
            settlementPrice,
            title,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PredictionMarketSummary{id=$id, isLiquidationOnly=$isLiquidationOnly, isTradable=$isTradable, status=$status, symbol=$symbol, closeAt=$closeAt, openAt=$openAt, outcome=$outcome, settlementPrice=$settlementPrice, title=$title, additionalProperties=$additionalProperties}"
}
