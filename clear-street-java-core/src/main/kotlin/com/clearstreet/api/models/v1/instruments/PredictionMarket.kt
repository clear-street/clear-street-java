// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkKnown
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.toImmutable
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

/** A prediction market. */
class PredictionMarket
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val canCloseEarly: JsonField<Boolean>,
    private val categories: JsonField<List<String>>,
    private val eventCode: JsonField<String>,
    private val isLiquidationOnly: JsonField<Boolean>,
    private val isTradable: JsonField<Boolean>,
    private val restrictions: JsonField<List<String>>,
    private val seriesCode: JsonField<String>,
    private val status: JsonField<PredictionMarketStatus>,
    private val symbol: JsonField<String>,
    private val closeAt: JsonField<OffsetDateTime>,
    private val contractTermsUrl: JsonField<String>,
    private val earlyCloseCondition: JsonField<String>,
    private val expectedSettlementAt: JsonField<OffsetDateTime>,
    private val fullTitle: JsonField<String>,
    private val openAt: JsonField<OffsetDateTime>,
    private val outcome: JsonField<PredictionMarketOutcome>,
    private val predicate: JsonField<String>,
    private val rulesPrimary: JsonField<String>,
    private val rulesSecondary: JsonField<String>,
    private val settlementPrice: JsonField<String>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("can_close_early")
        @ExcludeMissing
        canCloseEarly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("event_code") @ExcludeMissing eventCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_liquidation_only")
        @ExcludeMissing
        isLiquidationOnly: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_tradable")
        @ExcludeMissing
        isTradable: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("restrictions")
        @ExcludeMissing
        restrictions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("series_code")
        @ExcludeMissing
        seriesCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PredictionMarketStatus> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("close_at")
        @ExcludeMissing
        closeAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("contract_terms_url")
        @ExcludeMissing
        contractTermsUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("early_close_condition")
        @ExcludeMissing
        earlyCloseCondition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expected_settlement_at")
        @ExcludeMissing
        expectedSettlementAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("full_title") @ExcludeMissing fullTitle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("open_at")
        @ExcludeMissing
        openAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("outcome")
        @ExcludeMissing
        outcome: JsonField<PredictionMarketOutcome> = JsonMissing.of(),
        @JsonProperty("predicate") @ExcludeMissing predicate: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rules_primary")
        @ExcludeMissing
        rulesPrimary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rules_secondary")
        @ExcludeMissing
        rulesSecondary: JsonField<String> = JsonMissing.of(),
        @JsonProperty("settlement_price")
        @ExcludeMissing
        settlementPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        canCloseEarly,
        categories,
        eventCode,
        isLiquidationOnly,
        isTradable,
        restrictions,
        seriesCode,
        status,
        symbol,
        closeAt,
        contractTermsUrl,
        earlyCloseCondition,
        expectedSettlementAt,
        fullTitle,
        openAt,
        outcome,
        predicate,
        rulesPrimary,
        rulesSecondary,
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
     * Whether the market may close before `close_at`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canCloseEarly(): Boolean = canCloseEarly.getRequired("can_close_early")

    /**
     * Categories of the market.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun categories(): List<String> = categories.getRequired("categories")

    /**
     * Code of the event the market belongs to.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventCode(): String = eventCode.getRequired("event_code")

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
     * Trading restrictions of the market.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun restrictions(): List<String> = restrictions.getRequired("restrictions")

    /**
     * Code of the series the market belongs to.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun seriesCode(): String = seriesCode.getRequired("series_code")

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
     * Link to the contract terms document.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractTermsUrl(): Optional<String> = contractTermsUrl.getOptional("contract_terms_url")

    /**
     * Condition under which the market closes early.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun earlyCloseCondition(): Optional<String> =
        earlyCloseCondition.getOptional("early_close_condition")

    /**
     * When settlement is expected after the market closes.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expectedSettlementAt(): Optional<OffsetDateTime> =
        expectedSettlementAt.getOptional("expected_settlement_at")

    /**
     * Full title of the market, event and market together.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fullTitle(): Optional<String> = fullTitle.getOptional("full_title")

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
     * The question the market resolves.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun predicate(): Optional<String> = predicate.getOptional("predicate")

    /**
     * Primary rules of the market.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rulesPrimary(): Optional<String> = rulesPrimary.getOptional("rules_primary")

    /**
     * Secondary rules of the market.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun rulesSecondary(): Optional<String> = rulesSecondary.getOptional("rules_secondary")

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
     * Returns the raw JSON value of [canCloseEarly].
     *
     * Unlike [canCloseEarly], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("can_close_early")
    @ExcludeMissing
    fun _canCloseEarly(): JsonField<Boolean> = canCloseEarly

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<List<String>> = categories

    /**
     * Returns the raw JSON value of [eventCode].
     *
     * Unlike [eventCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_code") @ExcludeMissing fun _eventCode(): JsonField<String> = eventCode

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
     * Returns the raw JSON value of [restrictions].
     *
     * Unlike [restrictions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("restrictions")
    @ExcludeMissing
    fun _restrictions(): JsonField<List<String>> = restrictions

    /**
     * Returns the raw JSON value of [seriesCode].
     *
     * Unlike [seriesCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("series_code") @ExcludeMissing fun _seriesCode(): JsonField<String> = seriesCode

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
     * Returns the raw JSON value of [contractTermsUrl].
     *
     * Unlike [contractTermsUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("contract_terms_url")
    @ExcludeMissing
    fun _contractTermsUrl(): JsonField<String> = contractTermsUrl

    /**
     * Returns the raw JSON value of [earlyCloseCondition].
     *
     * Unlike [earlyCloseCondition], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("early_close_condition")
    @ExcludeMissing
    fun _earlyCloseCondition(): JsonField<String> = earlyCloseCondition

    /**
     * Returns the raw JSON value of [expectedSettlementAt].
     *
     * Unlike [expectedSettlementAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("expected_settlement_at")
    @ExcludeMissing
    fun _expectedSettlementAt(): JsonField<OffsetDateTime> = expectedSettlementAt

    /**
     * Returns the raw JSON value of [fullTitle].
     *
     * Unlike [fullTitle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("full_title") @ExcludeMissing fun _fullTitle(): JsonField<String> = fullTitle

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
     * Returns the raw JSON value of [predicate].
     *
     * Unlike [predicate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("predicate") @ExcludeMissing fun _predicate(): JsonField<String> = predicate

    /**
     * Returns the raw JSON value of [rulesPrimary].
     *
     * Unlike [rulesPrimary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rules_primary")
    @ExcludeMissing
    fun _rulesPrimary(): JsonField<String> = rulesPrimary

    /**
     * Returns the raw JSON value of [rulesSecondary].
     *
     * Unlike [rulesSecondary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rules_secondary")
    @ExcludeMissing
    fun _rulesSecondary(): JsonField<String> = rulesSecondary

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
         * Returns a mutable builder for constructing an instance of [PredictionMarket].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .canCloseEarly()
         * .categories()
         * .eventCode()
         * .isLiquidationOnly()
         * .isTradable()
         * .restrictions()
         * .seriesCode()
         * .status()
         * .symbol()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PredictionMarket]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var canCloseEarly: JsonField<Boolean>? = null
        private var categories: JsonField<MutableList<String>>? = null
        private var eventCode: JsonField<String>? = null
        private var isLiquidationOnly: JsonField<Boolean>? = null
        private var isTradable: JsonField<Boolean>? = null
        private var restrictions: JsonField<MutableList<String>>? = null
        private var seriesCode: JsonField<String>? = null
        private var status: JsonField<PredictionMarketStatus>? = null
        private var symbol: JsonField<String>? = null
        private var closeAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var contractTermsUrl: JsonField<String> = JsonMissing.of()
        private var earlyCloseCondition: JsonField<String> = JsonMissing.of()
        private var expectedSettlementAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var fullTitle: JsonField<String> = JsonMissing.of()
        private var openAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var outcome: JsonField<PredictionMarketOutcome> = JsonMissing.of()
        private var predicate: JsonField<String> = JsonMissing.of()
        private var rulesPrimary: JsonField<String> = JsonMissing.of()
        private var rulesSecondary: JsonField<String> = JsonMissing.of()
        private var settlementPrice: JsonField<String> = JsonMissing.of()
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(predictionMarket: PredictionMarket) = apply {
            id = predictionMarket.id
            canCloseEarly = predictionMarket.canCloseEarly
            categories = predictionMarket.categories.map { it.toMutableList() }
            eventCode = predictionMarket.eventCode
            isLiquidationOnly = predictionMarket.isLiquidationOnly
            isTradable = predictionMarket.isTradable
            restrictions = predictionMarket.restrictions.map { it.toMutableList() }
            seriesCode = predictionMarket.seriesCode
            status = predictionMarket.status
            symbol = predictionMarket.symbol
            closeAt = predictionMarket.closeAt
            contractTermsUrl = predictionMarket.contractTermsUrl
            earlyCloseCondition = predictionMarket.earlyCloseCondition
            expectedSettlementAt = predictionMarket.expectedSettlementAt
            fullTitle = predictionMarket.fullTitle
            openAt = predictionMarket.openAt
            outcome = predictionMarket.outcome
            predicate = predictionMarket.predicate
            rulesPrimary = predictionMarket.rulesPrimary
            rulesSecondary = predictionMarket.rulesSecondary
            settlementPrice = predictionMarket.settlementPrice
            title = predictionMarket.title
            additionalProperties = predictionMarket.additionalProperties.toMutableMap()
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

        /** Whether the market may close before `close_at`. */
        fun canCloseEarly(canCloseEarly: Boolean) = canCloseEarly(JsonField.of(canCloseEarly))

        /**
         * Sets [Builder.canCloseEarly] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canCloseEarly] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canCloseEarly(canCloseEarly: JsonField<Boolean>) = apply {
            this.canCloseEarly = canCloseEarly
        }

        /** Categories of the market. */
        fun categories(categories: List<String>) = categories(JsonField.of(categories))

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun categories(categories: JsonField<List<String>>) = apply {
            this.categories = categories.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [categories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCategory(category: String) = apply {
            categories =
                (categories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("categories", it).add(category)
                }
        }

        /** Code of the event the market belongs to. */
        fun eventCode(eventCode: String) = eventCode(JsonField.of(eventCode))

        /**
         * Sets [Builder.eventCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventCode(eventCode: JsonField<String>) = apply { this.eventCode = eventCode }

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

        /** Trading restrictions of the market. */
        fun restrictions(restrictions: List<String>) = restrictions(JsonField.of(restrictions))

        /**
         * Sets [Builder.restrictions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.restrictions] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun restrictions(restrictions: JsonField<List<String>>) = apply {
            this.restrictions = restrictions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [restrictions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRestriction(restriction: String) = apply {
            restrictions =
                (restrictions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("restrictions", it).add(restriction)
                }
        }

        /** Code of the series the market belongs to. */
        fun seriesCode(seriesCode: String) = seriesCode(JsonField.of(seriesCode))

        /**
         * Sets [Builder.seriesCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.seriesCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun seriesCode(seriesCode: JsonField<String>) = apply { this.seriesCode = seriesCode }

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

        /** Link to the contract terms document. */
        fun contractTermsUrl(contractTermsUrl: String?) =
            contractTermsUrl(JsonField.ofNullable(contractTermsUrl))

        /** Alias for calling [Builder.contractTermsUrl] with `contractTermsUrl.orElse(null)`. */
        fun contractTermsUrl(contractTermsUrl: Optional<String>) =
            contractTermsUrl(contractTermsUrl.getOrNull())

        /**
         * Sets [Builder.contractTermsUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractTermsUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun contractTermsUrl(contractTermsUrl: JsonField<String>) = apply {
            this.contractTermsUrl = contractTermsUrl
        }

        /** Condition under which the market closes early. */
        fun earlyCloseCondition(earlyCloseCondition: String?) =
            earlyCloseCondition(JsonField.ofNullable(earlyCloseCondition))

        /**
         * Alias for calling [Builder.earlyCloseCondition] with `earlyCloseCondition.orElse(null)`.
         */
        fun earlyCloseCondition(earlyCloseCondition: Optional<String>) =
            earlyCloseCondition(earlyCloseCondition.getOrNull())

        /**
         * Sets [Builder.earlyCloseCondition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.earlyCloseCondition] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun earlyCloseCondition(earlyCloseCondition: JsonField<String>) = apply {
            this.earlyCloseCondition = earlyCloseCondition
        }

        /** When settlement is expected after the market closes. */
        fun expectedSettlementAt(expectedSettlementAt: OffsetDateTime?) =
            expectedSettlementAt(JsonField.ofNullable(expectedSettlementAt))

        /**
         * Alias for calling [Builder.expectedSettlementAt] with
         * `expectedSettlementAt.orElse(null)`.
         */
        fun expectedSettlementAt(expectedSettlementAt: Optional<OffsetDateTime>) =
            expectedSettlementAt(expectedSettlementAt.getOrNull())

        /**
         * Sets [Builder.expectedSettlementAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedSettlementAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun expectedSettlementAt(expectedSettlementAt: JsonField<OffsetDateTime>) = apply {
            this.expectedSettlementAt = expectedSettlementAt
        }

        /** Full title of the market, event and market together. */
        fun fullTitle(fullTitle: String?) = fullTitle(JsonField.ofNullable(fullTitle))

        /** Alias for calling [Builder.fullTitle] with `fullTitle.orElse(null)`. */
        fun fullTitle(fullTitle: Optional<String>) = fullTitle(fullTitle.getOrNull())

        /**
         * Sets [Builder.fullTitle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fullTitle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fullTitle(fullTitle: JsonField<String>) = apply { this.fullTitle = fullTitle }

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

        /** The question the market resolves. */
        fun predicate(predicate: String?) = predicate(JsonField.ofNullable(predicate))

        /** Alias for calling [Builder.predicate] with `predicate.orElse(null)`. */
        fun predicate(predicate: Optional<String>) = predicate(predicate.getOrNull())

        /**
         * Sets [Builder.predicate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.predicate] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun predicate(predicate: JsonField<String>) = apply { this.predicate = predicate }

        /** Primary rules of the market. */
        fun rulesPrimary(rulesPrimary: String?) = rulesPrimary(JsonField.ofNullable(rulesPrimary))

        /** Alias for calling [Builder.rulesPrimary] with `rulesPrimary.orElse(null)`. */
        fun rulesPrimary(rulesPrimary: Optional<String>) = rulesPrimary(rulesPrimary.getOrNull())

        /**
         * Sets [Builder.rulesPrimary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rulesPrimary] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun rulesPrimary(rulesPrimary: JsonField<String>) = apply {
            this.rulesPrimary = rulesPrimary
        }

        /** Secondary rules of the market. */
        fun rulesSecondary(rulesSecondary: String?) =
            rulesSecondary(JsonField.ofNullable(rulesSecondary))

        /** Alias for calling [Builder.rulesSecondary] with `rulesSecondary.orElse(null)`. */
        fun rulesSecondary(rulesSecondary: Optional<String>) =
            rulesSecondary(rulesSecondary.getOrNull())

        /**
         * Sets [Builder.rulesSecondary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rulesSecondary] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun rulesSecondary(rulesSecondary: JsonField<String>) = apply {
            this.rulesSecondary = rulesSecondary
        }

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
         * Returns an immutable instance of [PredictionMarket].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .canCloseEarly()
         * .categories()
         * .eventCode()
         * .isLiquidationOnly()
         * .isTradable()
         * .restrictions()
         * .seriesCode()
         * .status()
         * .symbol()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PredictionMarket =
            PredictionMarket(
                checkRequired("id", id),
                checkRequired("canCloseEarly", canCloseEarly),
                checkRequired("categories", categories).map { it.toImmutable() },
                checkRequired("eventCode", eventCode),
                checkRequired("isLiquidationOnly", isLiquidationOnly),
                checkRequired("isTradable", isTradable),
                checkRequired("restrictions", restrictions).map { it.toImmutable() },
                checkRequired("seriesCode", seriesCode),
                checkRequired("status", status),
                checkRequired("symbol", symbol),
                closeAt,
                contractTermsUrl,
                earlyCloseCondition,
                expectedSettlementAt,
                fullTitle,
                openAt,
                outcome,
                predicate,
                rulesPrimary,
                rulesSecondary,
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
    fun validate(): PredictionMarket = apply {
        if (validated) {
            return@apply
        }

        id()
        canCloseEarly()
        categories()
        eventCode()
        isLiquidationOnly()
        isTradable()
        restrictions()
        seriesCode()
        status().validate()
        symbol()
        closeAt()
        contractTermsUrl()
        earlyCloseCondition()
        expectedSettlementAt()
        fullTitle()
        openAt()
        outcome().ifPresent { it.validate() }
        predicate()
        rulesPrimary()
        rulesSecondary()
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
            (if (canCloseEarly.asKnown().isPresent) 1 else 0) +
            (categories.asKnown().getOrNull()?.size ?: 0) +
            (if (eventCode.asKnown().isPresent) 1 else 0) +
            (if (isLiquidationOnly.asKnown().isPresent) 1 else 0) +
            (if (isTradable.asKnown().isPresent) 1 else 0) +
            (restrictions.asKnown().getOrNull()?.size ?: 0) +
            (if (seriesCode.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (symbol.asKnown().isPresent) 1 else 0) +
            (if (closeAt.asKnown().isPresent) 1 else 0) +
            (if (contractTermsUrl.asKnown().isPresent) 1 else 0) +
            (if (earlyCloseCondition.asKnown().isPresent) 1 else 0) +
            (if (expectedSettlementAt.asKnown().isPresent) 1 else 0) +
            (if (fullTitle.asKnown().isPresent) 1 else 0) +
            (if (openAt.asKnown().isPresent) 1 else 0) +
            (outcome.asKnown().getOrNull()?.validity() ?: 0) +
            (if (predicate.asKnown().isPresent) 1 else 0) +
            (if (rulesPrimary.asKnown().isPresent) 1 else 0) +
            (if (rulesSecondary.asKnown().isPresent) 1 else 0) +
            (if (settlementPrice.asKnown().isPresent) 1 else 0) +
            (if (title.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PredictionMarket &&
            id == other.id &&
            canCloseEarly == other.canCloseEarly &&
            categories == other.categories &&
            eventCode == other.eventCode &&
            isLiquidationOnly == other.isLiquidationOnly &&
            isTradable == other.isTradable &&
            restrictions == other.restrictions &&
            seriesCode == other.seriesCode &&
            status == other.status &&
            symbol == other.symbol &&
            closeAt == other.closeAt &&
            contractTermsUrl == other.contractTermsUrl &&
            earlyCloseCondition == other.earlyCloseCondition &&
            expectedSettlementAt == other.expectedSettlementAt &&
            fullTitle == other.fullTitle &&
            openAt == other.openAt &&
            outcome == other.outcome &&
            predicate == other.predicate &&
            rulesPrimary == other.rulesPrimary &&
            rulesSecondary == other.rulesSecondary &&
            settlementPrice == other.settlementPrice &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            canCloseEarly,
            categories,
            eventCode,
            isLiquidationOnly,
            isTradable,
            restrictions,
            seriesCode,
            status,
            symbol,
            closeAt,
            contractTermsUrl,
            earlyCloseCondition,
            expectedSettlementAt,
            fullTitle,
            openAt,
            outcome,
            predicate,
            rulesPrimary,
            rulesSecondary,
            settlementPrice,
            title,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PredictionMarket{id=$id, canCloseEarly=$canCloseEarly, categories=$categories, eventCode=$eventCode, isLiquidationOnly=$isLiquidationOnly, isTradable=$isTradable, restrictions=$restrictions, seriesCode=$seriesCode, status=$status, symbol=$symbol, closeAt=$closeAt, contractTermsUrl=$contractTermsUrl, earlyCloseCondition=$earlyCloseCondition, expectedSettlementAt=$expectedSettlementAt, fullTitle=$fullTitle, openAt=$openAt, outcome=$outcome, predicate=$predicate, rulesPrimary=$rulesPrimary, rulesSecondary=$rulesSecondary, settlementPrice=$settlementPrice, title=$title, additionalProperties=$additionalProperties}"
}
