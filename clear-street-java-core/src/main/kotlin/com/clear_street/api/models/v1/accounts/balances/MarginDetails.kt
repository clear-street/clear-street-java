// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.balances

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MarginDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val dayTradeCount: JsonField<Int>,
    private val initialMarginExcess: JsonField<String>,
    private val initialMarginRequirement: JsonField<String>,
    private val maintenanceMarginExcess: JsonField<String>,
    private val maintenanceMarginRequirement: JsonField<String>,
    private val patternDayTrader: JsonField<Boolean>,
    private val dayTradeBuyingPowerUsage: JsonField<String>,
    private val topContributors: JsonField<List<MarginTopContributor>>,
    private val usage: JsonField<MarginDetailsUsage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("day_trade_count")
        @ExcludeMissing
        dayTradeCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("initial_margin_excess")
        @ExcludeMissing
        initialMarginExcess: JsonField<String> = JsonMissing.of(),
        @JsonProperty("initial_margin_requirement")
        @ExcludeMissing
        initialMarginRequirement: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maintenance_margin_excess")
        @ExcludeMissing
        maintenanceMarginExcess: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maintenance_margin_requirement")
        @ExcludeMissing
        maintenanceMarginRequirement: JsonField<String> = JsonMissing.of(),
        @JsonProperty("pattern_day_trader")
        @ExcludeMissing
        patternDayTrader: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("day_trade_buying_power_usage")
        @ExcludeMissing
        dayTradeBuyingPowerUsage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("top_contributors")
        @ExcludeMissing
        topContributors: JsonField<List<MarginTopContributor>> = JsonMissing.of(),
        @JsonProperty("usage")
        @ExcludeMissing
        usage: JsonField<MarginDetailsUsage> = JsonMissing.of(),
    ) : this(
        dayTradeCount,
        initialMarginExcess,
        initialMarginRequirement,
        maintenanceMarginExcess,
        maintenanceMarginRequirement,
        patternDayTrader,
        dayTradeBuyingPowerUsage,
        topContributors,
        usage,
        mutableMapOf(),
    )

    /**
     * The number of day trades executed over the 5 most recent trading days.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dayTradeCount(): Int = dayTradeCount.getRequired("day_trade_count")

    /**
     * Initial margin excess for trade-date balances.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initialMarginExcess(): String = initialMarginExcess.getRequired("initial_margin_excess")

    /**
     * Initial margin requirement for trade-date balances.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initialMarginRequirement(): String =
        initialMarginRequirement.getRequired("initial_margin_requirement")

    /**
     * Maintenance margin excess for trade-date balances.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maintenanceMarginExcess(): String =
        maintenanceMarginExcess.getRequired("maintenance_margin_excess")

    /**
     * Maintenance margin requirement for trade-date balances.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maintenanceMarginRequirement(): String =
        maintenanceMarginRequirement.getRequired("maintenance_margin_requirement")

    /**
     * `true` if the account is currently flagged as a PDT, otherwise `false`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun patternDayTrader(): Boolean = patternDayTrader.getRequired("pattern_day_trader")

    /**
     * The amount of day-trade buying power used during the current trading day.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dayTradeBuyingPowerUsage(): Optional<String> =
        dayTradeBuyingPowerUsage.getOptional("day_trade_buying_power_usage")

    /**
     * Optional top margin contributors, returned only when explicitly requested.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topContributors(): Optional<List<MarginTopContributor>> =
        topContributors.getOptional("top_contributors")

    /**
     * Current usage totals.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usage(): Optional<MarginDetailsUsage> = usage.getOptional("usage")

    /**
     * Returns the raw JSON value of [dayTradeCount].
     *
     * Unlike [dayTradeCount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("day_trade_count")
    @ExcludeMissing
    fun _dayTradeCount(): JsonField<Int> = dayTradeCount

    /**
     * Returns the raw JSON value of [initialMarginExcess].
     *
     * Unlike [initialMarginExcess], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("initial_margin_excess")
    @ExcludeMissing
    fun _initialMarginExcess(): JsonField<String> = initialMarginExcess

    /**
     * Returns the raw JSON value of [initialMarginRequirement].
     *
     * Unlike [initialMarginRequirement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("initial_margin_requirement")
    @ExcludeMissing
    fun _initialMarginRequirement(): JsonField<String> = initialMarginRequirement

    /**
     * Returns the raw JSON value of [maintenanceMarginExcess].
     *
     * Unlike [maintenanceMarginExcess], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("maintenance_margin_excess")
    @ExcludeMissing
    fun _maintenanceMarginExcess(): JsonField<String> = maintenanceMarginExcess

    /**
     * Returns the raw JSON value of [maintenanceMarginRequirement].
     *
     * Unlike [maintenanceMarginRequirement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("maintenance_margin_requirement")
    @ExcludeMissing
    fun _maintenanceMarginRequirement(): JsonField<String> = maintenanceMarginRequirement

    /**
     * Returns the raw JSON value of [patternDayTrader].
     *
     * Unlike [patternDayTrader], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pattern_day_trader")
    @ExcludeMissing
    fun _patternDayTrader(): JsonField<Boolean> = patternDayTrader

    /**
     * Returns the raw JSON value of [dayTradeBuyingPowerUsage].
     *
     * Unlike [dayTradeBuyingPowerUsage], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("day_trade_buying_power_usage")
    @ExcludeMissing
    fun _dayTradeBuyingPowerUsage(): JsonField<String> = dayTradeBuyingPowerUsage

    /**
     * Returns the raw JSON value of [topContributors].
     *
     * Unlike [topContributors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("top_contributors")
    @ExcludeMissing
    fun _topContributors(): JsonField<List<MarginTopContributor>> = topContributors

    /**
     * Returns the raw JSON value of [usage].
     *
     * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<MarginDetailsUsage> = usage

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
         * Returns a mutable builder for constructing an instance of [MarginDetails].
         *
         * The following fields are required:
         * ```java
         * .dayTradeCount()
         * .initialMarginExcess()
         * .initialMarginRequirement()
         * .maintenanceMarginExcess()
         * .maintenanceMarginRequirement()
         * .patternDayTrader()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarginDetails]. */
    class Builder internal constructor() {

        private var dayTradeCount: JsonField<Int>? = null
        private var initialMarginExcess: JsonField<String>? = null
        private var initialMarginRequirement: JsonField<String>? = null
        private var maintenanceMarginExcess: JsonField<String>? = null
        private var maintenanceMarginRequirement: JsonField<String>? = null
        private var patternDayTrader: JsonField<Boolean>? = null
        private var dayTradeBuyingPowerUsage: JsonField<String> = JsonMissing.of()
        private var topContributors: JsonField<MutableList<MarginTopContributor>>? = null
        private var usage: JsonField<MarginDetailsUsage> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marginDetails: MarginDetails) = apply {
            dayTradeCount = marginDetails.dayTradeCount
            initialMarginExcess = marginDetails.initialMarginExcess
            initialMarginRequirement = marginDetails.initialMarginRequirement
            maintenanceMarginExcess = marginDetails.maintenanceMarginExcess
            maintenanceMarginRequirement = marginDetails.maintenanceMarginRequirement
            patternDayTrader = marginDetails.patternDayTrader
            dayTradeBuyingPowerUsage = marginDetails.dayTradeBuyingPowerUsage
            topContributors = marginDetails.topContributors.map { it.toMutableList() }
            usage = marginDetails.usage
            additionalProperties = marginDetails.additionalProperties.toMutableMap()
        }

        /** The number of day trades executed over the 5 most recent trading days. */
        fun dayTradeCount(dayTradeCount: Int) = dayTradeCount(JsonField.of(dayTradeCount))

        /**
         * Sets [Builder.dayTradeCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayTradeCount] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dayTradeCount(dayTradeCount: JsonField<Int>) = apply {
            this.dayTradeCount = dayTradeCount
        }

        /** Initial margin excess for trade-date balances. */
        fun initialMarginExcess(initialMarginExcess: String) =
            initialMarginExcess(JsonField.of(initialMarginExcess))

        /**
         * Sets [Builder.initialMarginExcess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialMarginExcess] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun initialMarginExcess(initialMarginExcess: JsonField<String>) = apply {
            this.initialMarginExcess = initialMarginExcess
        }

        /** Initial margin requirement for trade-date balances. */
        fun initialMarginRequirement(initialMarginRequirement: String) =
            initialMarginRequirement(JsonField.of(initialMarginRequirement))

        /**
         * Sets [Builder.initialMarginRequirement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialMarginRequirement] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun initialMarginRequirement(initialMarginRequirement: JsonField<String>) = apply {
            this.initialMarginRequirement = initialMarginRequirement
        }

        /** Maintenance margin excess for trade-date balances. */
        fun maintenanceMarginExcess(maintenanceMarginExcess: String) =
            maintenanceMarginExcess(JsonField.of(maintenanceMarginExcess))

        /**
         * Sets [Builder.maintenanceMarginExcess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maintenanceMarginExcess] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun maintenanceMarginExcess(maintenanceMarginExcess: JsonField<String>) = apply {
            this.maintenanceMarginExcess = maintenanceMarginExcess
        }

        /** Maintenance margin requirement for trade-date balances. */
        fun maintenanceMarginRequirement(maintenanceMarginRequirement: String) =
            maintenanceMarginRequirement(JsonField.of(maintenanceMarginRequirement))

        /**
         * Sets [Builder.maintenanceMarginRequirement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maintenanceMarginRequirement] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun maintenanceMarginRequirement(maintenanceMarginRequirement: JsonField<String>) = apply {
            this.maintenanceMarginRequirement = maintenanceMarginRequirement
        }

        /** `true` if the account is currently flagged as a PDT, otherwise `false`. */
        fun patternDayTrader(patternDayTrader: Boolean) =
            patternDayTrader(JsonField.of(patternDayTrader))

        /**
         * Sets [Builder.patternDayTrader] to an arbitrary JSON value.
         *
         * You should usually call [Builder.patternDayTrader] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun patternDayTrader(patternDayTrader: JsonField<Boolean>) = apply {
            this.patternDayTrader = patternDayTrader
        }

        /** The amount of day-trade buying power used during the current trading day. */
        fun dayTradeBuyingPowerUsage(dayTradeBuyingPowerUsage: String?) =
            dayTradeBuyingPowerUsage(JsonField.ofNullable(dayTradeBuyingPowerUsage))

        /**
         * Alias for calling [Builder.dayTradeBuyingPowerUsage] with
         * `dayTradeBuyingPowerUsage.orElse(null)`.
         */
        fun dayTradeBuyingPowerUsage(dayTradeBuyingPowerUsage: Optional<String>) =
            dayTradeBuyingPowerUsage(dayTradeBuyingPowerUsage.getOrNull())

        /**
         * Sets [Builder.dayTradeBuyingPowerUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dayTradeBuyingPowerUsage] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun dayTradeBuyingPowerUsage(dayTradeBuyingPowerUsage: JsonField<String>) = apply {
            this.dayTradeBuyingPowerUsage = dayTradeBuyingPowerUsage
        }

        /** Optional top margin contributors, returned only when explicitly requested. */
        fun topContributors(topContributors: List<MarginTopContributor>) =
            topContributors(JsonField.of(topContributors))

        /**
         * Sets [Builder.topContributors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.topContributors] with a well-typed
         * `List<MarginTopContributor>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun topContributors(topContributors: JsonField<List<MarginTopContributor>>) = apply {
            this.topContributors = topContributors.map { it.toMutableList() }
        }

        /**
         * Adds a single [MarginTopContributor] to [topContributors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTopContributor(topContributor: MarginTopContributor) = apply {
            topContributors =
                (topContributors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("topContributors", it).add(topContributor)
                }
        }

        /** Current usage totals. */
        fun usage(usage: MarginDetailsUsage?) = usage(JsonField.ofNullable(usage))

        /** Alias for calling [Builder.usage] with `usage.orElse(null)`. */
        fun usage(usage: Optional<MarginDetailsUsage>) = usage(usage.getOrNull())

        /**
         * Sets [Builder.usage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.usage] with a well-typed [MarginDetailsUsage] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun usage(usage: JsonField<MarginDetailsUsage>) = apply { this.usage = usage }

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
         * Returns an immutable instance of [MarginDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .dayTradeCount()
         * .initialMarginExcess()
         * .initialMarginRequirement()
         * .maintenanceMarginExcess()
         * .maintenanceMarginRequirement()
         * .patternDayTrader()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarginDetails =
            MarginDetails(
                checkRequired("dayTradeCount", dayTradeCount),
                checkRequired("initialMarginExcess", initialMarginExcess),
                checkRequired("initialMarginRequirement", initialMarginRequirement),
                checkRequired("maintenanceMarginExcess", maintenanceMarginExcess),
                checkRequired("maintenanceMarginRequirement", maintenanceMarginRequirement),
                checkRequired("patternDayTrader", patternDayTrader),
                dayTradeBuyingPowerUsage,
                (topContributors ?: JsonMissing.of()).map { it.toImmutable() },
                usage,
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
    fun validate(): MarginDetails = apply {
        if (validated) {
            return@apply
        }

        dayTradeCount()
        initialMarginExcess()
        initialMarginRequirement()
        maintenanceMarginExcess()
        maintenanceMarginRequirement()
        patternDayTrader()
        dayTradeBuyingPowerUsage()
        topContributors().ifPresent { it.forEach { it.validate() } }
        usage().ifPresent { it.validate() }
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
        (if (dayTradeCount.asKnown().isPresent) 1 else 0) +
            (if (initialMarginExcess.asKnown().isPresent) 1 else 0) +
            (if (initialMarginRequirement.asKnown().isPresent) 1 else 0) +
            (if (maintenanceMarginExcess.asKnown().isPresent) 1 else 0) +
            (if (maintenanceMarginRequirement.asKnown().isPresent) 1 else 0) +
            (if (patternDayTrader.asKnown().isPresent) 1 else 0) +
            (if (dayTradeBuyingPowerUsage.asKnown().isPresent) 1 else 0) +
            (topContributors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarginDetails &&
            dayTradeCount == other.dayTradeCount &&
            initialMarginExcess == other.initialMarginExcess &&
            initialMarginRequirement == other.initialMarginRequirement &&
            maintenanceMarginExcess == other.maintenanceMarginExcess &&
            maintenanceMarginRequirement == other.maintenanceMarginRequirement &&
            patternDayTrader == other.patternDayTrader &&
            dayTradeBuyingPowerUsage == other.dayTradeBuyingPowerUsage &&
            topContributors == other.topContributors &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            dayTradeCount,
            initialMarginExcess,
            initialMarginRequirement,
            maintenanceMarginExcess,
            maintenanceMarginRequirement,
            patternDayTrader,
            dayTradeBuyingPowerUsage,
            topContributors,
            usage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarginDetails{dayTradeCount=$dayTradeCount, initialMarginExcess=$initialMarginExcess, initialMarginRequirement=$initialMarginRequirement, maintenanceMarginExcess=$maintenanceMarginExcess, maintenanceMarginRequirement=$maintenanceMarginRequirement, patternDayTrader=$patternDayTrader, dayTradeBuyingPowerUsage=$dayTradeBuyingPowerUsage, topContributors=$topContributors, usage=$usage, additionalProperties=$additionalProperties}"
}
