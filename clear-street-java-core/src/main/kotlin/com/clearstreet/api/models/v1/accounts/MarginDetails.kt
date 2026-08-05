// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.accounts

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
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class MarginDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val initialMarginExcess: JsonField<String>,
    private val initialMarginRequirement: JsonField<String>,
    private val intradayDetails: JsonField<MarginSessionDetails>,
    private val maintenanceMarginExcess: JsonField<String>,
    private val maintenanceMarginRequirement: JsonField<String>,
    private val overnightDetails: JsonField<MarginSessionDetails>,
    private val topContributors: JsonField<List<MarginTopContributor>>,
    private val usage: JsonField<MarginDetailsUsage>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("initial_margin_excess")
        @ExcludeMissing
        initialMarginExcess: JsonField<String> = JsonMissing.of(),
        @JsonProperty("initial_margin_requirement")
        @ExcludeMissing
        initialMarginRequirement: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intraday_details")
        @ExcludeMissing
        intradayDetails: JsonField<MarginSessionDetails> = JsonMissing.of(),
        @JsonProperty("maintenance_margin_excess")
        @ExcludeMissing
        maintenanceMarginExcess: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maintenance_margin_requirement")
        @ExcludeMissing
        maintenanceMarginRequirement: JsonField<String> = JsonMissing.of(),
        @JsonProperty("overnight_details")
        @ExcludeMissing
        overnightDetails: JsonField<MarginSessionDetails> = JsonMissing.of(),
        @JsonProperty("top_contributors")
        @ExcludeMissing
        topContributors: JsonField<List<MarginTopContributor>> = JsonMissing.of(),
        @JsonProperty("usage")
        @ExcludeMissing
        usage: JsonField<MarginDetailsUsage> = JsonMissing.of(),
    ) : this(
        initialMarginExcess,
        initialMarginRequirement,
        intradayDetails,
        maintenanceMarginExcess,
        maintenanceMarginRequirement,
        overnightDetails,
        topContributors,
        usage,
        mutableMapOf(),
    )

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
     * Intraday session margin calculation details.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun intradayDetails(): MarginSessionDetails = intradayDetails.getRequired("intraday_details")

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
     * Overnight session margin calculation details.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overnightDetails(): MarginSessionDetails = overnightDetails.getRequired("overnight_details")

    /**
     * Optional top margin contributors, returned only when explicitly requested.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun topContributors(): Optional<List<MarginTopContributor>> =
        topContributors.getOptional("top_contributors")

    /**
     * Current usage totals. When a null/undefined value is observed, it indicates that there is no
     * available data.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun usage(): Optional<MarginDetailsUsage> = usage.getOptional("usage")

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
     * Returns the raw JSON value of [intradayDetails].
     *
     * Unlike [intradayDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("intraday_details")
    @ExcludeMissing
    fun _intradayDetails(): JsonField<MarginSessionDetails> = intradayDetails

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
     * Returns the raw JSON value of [overnightDetails].
     *
     * Unlike [overnightDetails], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("overnight_details")
    @ExcludeMissing
    fun _overnightDetails(): JsonField<MarginSessionDetails> = overnightDetails

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
         * .initialMarginExcess()
         * .initialMarginRequirement()
         * .intradayDetails()
         * .maintenanceMarginExcess()
         * .maintenanceMarginRequirement()
         * .overnightDetails()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MarginDetails]. */
    class Builder internal constructor() {

        private var initialMarginExcess: JsonField<String>? = null
        private var initialMarginRequirement: JsonField<String>? = null
        private var intradayDetails: JsonField<MarginSessionDetails>? = null
        private var maintenanceMarginExcess: JsonField<String>? = null
        private var maintenanceMarginRequirement: JsonField<String>? = null
        private var overnightDetails: JsonField<MarginSessionDetails>? = null
        private var topContributors: JsonField<MutableList<MarginTopContributor>>? = null
        private var usage: JsonField<MarginDetailsUsage> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(marginDetails: MarginDetails) = apply {
            initialMarginExcess = marginDetails.initialMarginExcess
            initialMarginRequirement = marginDetails.initialMarginRequirement
            intradayDetails = marginDetails.intradayDetails
            maintenanceMarginExcess = marginDetails.maintenanceMarginExcess
            maintenanceMarginRequirement = marginDetails.maintenanceMarginRequirement
            overnightDetails = marginDetails.overnightDetails
            topContributors = marginDetails.topContributors.map { it.toMutableList() }
            usage = marginDetails.usage
            additionalProperties = marginDetails.additionalProperties.toMutableMap()
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

        /** Intraday session margin calculation details. */
        fun intradayDetails(intradayDetails: MarginSessionDetails) =
            intradayDetails(JsonField.of(intradayDetails))

        /**
         * Sets [Builder.intradayDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intradayDetails] with a well-typed
         * [MarginSessionDetails] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun intradayDetails(intradayDetails: JsonField<MarginSessionDetails>) = apply {
            this.intradayDetails = intradayDetails
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

        /** Overnight session margin calculation details. */
        fun overnightDetails(overnightDetails: MarginSessionDetails) =
            overnightDetails(JsonField.of(overnightDetails))

        /**
         * Sets [Builder.overnightDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overnightDetails] with a well-typed
         * [MarginSessionDetails] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun overnightDetails(overnightDetails: JsonField<MarginSessionDetails>) = apply {
            this.overnightDetails = overnightDetails
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

        /**
         * Current usage totals. When a null/undefined value is observed, it indicates that there is
         * no available data.
         */
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
         * .initialMarginExcess()
         * .initialMarginRequirement()
         * .intradayDetails()
         * .maintenanceMarginExcess()
         * .maintenanceMarginRequirement()
         * .overnightDetails()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MarginDetails =
            MarginDetails(
                checkRequired("initialMarginExcess", initialMarginExcess),
                checkRequired("initialMarginRequirement", initialMarginRequirement),
                checkRequired("intradayDetails", intradayDetails),
                checkRequired("maintenanceMarginExcess", maintenanceMarginExcess),
                checkRequired("maintenanceMarginRequirement", maintenanceMarginRequirement),
                checkRequired("overnightDetails", overnightDetails),
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

        initialMarginExcess()
        initialMarginRequirement()
        intradayDetails().validate()
        maintenanceMarginExcess()
        maintenanceMarginRequirement()
        overnightDetails().validate()
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
        (if (initialMarginExcess.asKnown().isPresent) 1 else 0) +
            (if (initialMarginRequirement.asKnown().isPresent) 1 else 0) +
            (intradayDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maintenanceMarginExcess.asKnown().isPresent) 1 else 0) +
            (if (maintenanceMarginRequirement.asKnown().isPresent) 1 else 0) +
            (overnightDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (topContributors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (usage.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MarginDetails &&
            initialMarginExcess == other.initialMarginExcess &&
            initialMarginRequirement == other.initialMarginRequirement &&
            intradayDetails == other.intradayDetails &&
            maintenanceMarginExcess == other.maintenanceMarginExcess &&
            maintenanceMarginRequirement == other.maintenanceMarginRequirement &&
            overnightDetails == other.overnightDetails &&
            topContributors == other.topContributors &&
            usage == other.usage &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            initialMarginExcess,
            initialMarginRequirement,
            intradayDetails,
            maintenanceMarginExcess,
            maintenanceMarginRequirement,
            overnightDetails,
            topContributors,
            usage,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MarginDetails{initialMarginExcess=$initialMarginExcess, initialMarginRequirement=$initialMarginRequirement, intradayDetails=$intradayDetails, maintenanceMarginExcess=$maintenanceMarginExcess, maintenanceMarginRequirement=$maintenanceMarginRequirement, overnightDetails=$overnightDetails, topContributors=$topContributors, usage=$usage, additionalProperties=$additionalProperties}"
}
