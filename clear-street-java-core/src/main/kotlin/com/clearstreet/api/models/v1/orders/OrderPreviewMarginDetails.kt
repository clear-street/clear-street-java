// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Margin requirements and excess before and after the previewed order. */
class OrderPreviewMarginDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val initialMarginExcess: JsonField<OrderPreviewDelta>,
    private val initialMarginRequirement: JsonField<OrderPreviewDelta>,
    private val maintenanceMarginExcess: JsonField<OrderPreviewDelta>,
    private val maintenanceMarginRequirement: JsonField<OrderPreviewDelta>,
    private val overnightMarginExcess: JsonField<OrderPreviewDelta>,
    private val overnightMarginRequirement: JsonField<OrderPreviewDelta>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("initial_margin_excess")
        @ExcludeMissing
        initialMarginExcess: JsonField<OrderPreviewDelta> = JsonMissing.of(),
        @JsonProperty("initial_margin_requirement")
        @ExcludeMissing
        initialMarginRequirement: JsonField<OrderPreviewDelta> = JsonMissing.of(),
        @JsonProperty("maintenance_margin_excess")
        @ExcludeMissing
        maintenanceMarginExcess: JsonField<OrderPreviewDelta> = JsonMissing.of(),
        @JsonProperty("maintenance_margin_requirement")
        @ExcludeMissing
        maintenanceMarginRequirement: JsonField<OrderPreviewDelta> = JsonMissing.of(),
        @JsonProperty("overnight_margin_excess")
        @ExcludeMissing
        overnightMarginExcess: JsonField<OrderPreviewDelta> = JsonMissing.of(),
        @JsonProperty("overnight_margin_requirement")
        @ExcludeMissing
        overnightMarginRequirement: JsonField<OrderPreviewDelta> = JsonMissing.of(),
    ) : this(
        initialMarginExcess,
        initialMarginRequirement,
        maintenanceMarginExcess,
        maintenanceMarginRequirement,
        overnightMarginExcess,
        overnightMarginRequirement,
        mutableMapOf(),
    )

    /**
     * Initial margin excess.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initialMarginExcess(): OrderPreviewDelta =
        initialMarginExcess.getRequired("initial_margin_excess")

    /**
     * Initial margin requirement.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initialMarginRequirement(): OrderPreviewDelta =
        initialMarginRequirement.getRequired("initial_margin_requirement")

    /**
     * Maintenance margin excess.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maintenanceMarginExcess(): OrderPreviewDelta =
        maintenanceMarginExcess.getRequired("maintenance_margin_excess")

    /**
     * Maintenance margin requirement.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun maintenanceMarginRequirement(): OrderPreviewDelta =
        maintenanceMarginRequirement.getRequired("maintenance_margin_requirement")

    /**
     * Overnight margin excess.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overnightMarginExcess(): OrderPreviewDelta =
        overnightMarginExcess.getRequired("overnight_margin_excess")

    /**
     * Overnight margin requirement.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun overnightMarginRequirement(): OrderPreviewDelta =
        overnightMarginRequirement.getRequired("overnight_margin_requirement")

    /**
     * Returns the raw JSON value of [initialMarginExcess].
     *
     * Unlike [initialMarginExcess], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("initial_margin_excess")
    @ExcludeMissing
    fun _initialMarginExcess(): JsonField<OrderPreviewDelta> = initialMarginExcess

    /**
     * Returns the raw JSON value of [initialMarginRequirement].
     *
     * Unlike [initialMarginRequirement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("initial_margin_requirement")
    @ExcludeMissing
    fun _initialMarginRequirement(): JsonField<OrderPreviewDelta> = initialMarginRequirement

    /**
     * Returns the raw JSON value of [maintenanceMarginExcess].
     *
     * Unlike [maintenanceMarginExcess], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("maintenance_margin_excess")
    @ExcludeMissing
    fun _maintenanceMarginExcess(): JsonField<OrderPreviewDelta> = maintenanceMarginExcess

    /**
     * Returns the raw JSON value of [maintenanceMarginRequirement].
     *
     * Unlike [maintenanceMarginRequirement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("maintenance_margin_requirement")
    @ExcludeMissing
    fun _maintenanceMarginRequirement(): JsonField<OrderPreviewDelta> = maintenanceMarginRequirement

    /**
     * Returns the raw JSON value of [overnightMarginExcess].
     *
     * Unlike [overnightMarginExcess], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("overnight_margin_excess")
    @ExcludeMissing
    fun _overnightMarginExcess(): JsonField<OrderPreviewDelta> = overnightMarginExcess

    /**
     * Returns the raw JSON value of [overnightMarginRequirement].
     *
     * Unlike [overnightMarginRequirement], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("overnight_margin_requirement")
    @ExcludeMissing
    fun _overnightMarginRequirement(): JsonField<OrderPreviewDelta> = overnightMarginRequirement

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
         * Returns a mutable builder for constructing an instance of [OrderPreviewMarginDetails].
         *
         * The following fields are required:
         * ```java
         * .initialMarginExcess()
         * .initialMarginRequirement()
         * .maintenanceMarginExcess()
         * .maintenanceMarginRequirement()
         * .overnightMarginExcess()
         * .overnightMarginRequirement()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrderPreviewMarginDetails]. */
    class Builder internal constructor() {

        private var initialMarginExcess: JsonField<OrderPreviewDelta>? = null
        private var initialMarginRequirement: JsonField<OrderPreviewDelta>? = null
        private var maintenanceMarginExcess: JsonField<OrderPreviewDelta>? = null
        private var maintenanceMarginRequirement: JsonField<OrderPreviewDelta>? = null
        private var overnightMarginExcess: JsonField<OrderPreviewDelta>? = null
        private var overnightMarginRequirement: JsonField<OrderPreviewDelta>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orderPreviewMarginDetails: OrderPreviewMarginDetails) = apply {
            initialMarginExcess = orderPreviewMarginDetails.initialMarginExcess
            initialMarginRequirement = orderPreviewMarginDetails.initialMarginRequirement
            maintenanceMarginExcess = orderPreviewMarginDetails.maintenanceMarginExcess
            maintenanceMarginRequirement = orderPreviewMarginDetails.maintenanceMarginRequirement
            overnightMarginExcess = orderPreviewMarginDetails.overnightMarginExcess
            overnightMarginRequirement = orderPreviewMarginDetails.overnightMarginRequirement
            additionalProperties = orderPreviewMarginDetails.additionalProperties.toMutableMap()
        }

        /** Initial margin excess. */
        fun initialMarginExcess(initialMarginExcess: OrderPreviewDelta) =
            initialMarginExcess(JsonField.of(initialMarginExcess))

        /**
         * Sets [Builder.initialMarginExcess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialMarginExcess] with a well-typed
         * [OrderPreviewDelta] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun initialMarginExcess(initialMarginExcess: JsonField<OrderPreviewDelta>) = apply {
            this.initialMarginExcess = initialMarginExcess
        }

        /** Initial margin requirement. */
        fun initialMarginRequirement(initialMarginRequirement: OrderPreviewDelta) =
            initialMarginRequirement(JsonField.of(initialMarginRequirement))

        /**
         * Sets [Builder.initialMarginRequirement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initialMarginRequirement] with a well-typed
         * [OrderPreviewDelta] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun initialMarginRequirement(initialMarginRequirement: JsonField<OrderPreviewDelta>) =
            apply {
                this.initialMarginRequirement = initialMarginRequirement
            }

        /** Maintenance margin excess. */
        fun maintenanceMarginExcess(maintenanceMarginExcess: OrderPreviewDelta) =
            maintenanceMarginExcess(JsonField.of(maintenanceMarginExcess))

        /**
         * Sets [Builder.maintenanceMarginExcess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maintenanceMarginExcess] with a well-typed
         * [OrderPreviewDelta] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun maintenanceMarginExcess(maintenanceMarginExcess: JsonField<OrderPreviewDelta>) = apply {
            this.maintenanceMarginExcess = maintenanceMarginExcess
        }

        /** Maintenance margin requirement. */
        fun maintenanceMarginRequirement(maintenanceMarginRequirement: OrderPreviewDelta) =
            maintenanceMarginRequirement(JsonField.of(maintenanceMarginRequirement))

        /**
         * Sets [Builder.maintenanceMarginRequirement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maintenanceMarginRequirement] with a well-typed
         * [OrderPreviewDelta] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun maintenanceMarginRequirement(
            maintenanceMarginRequirement: JsonField<OrderPreviewDelta>
        ) = apply { this.maintenanceMarginRequirement = maintenanceMarginRequirement }

        /** Overnight margin excess. */
        fun overnightMarginExcess(overnightMarginExcess: OrderPreviewDelta) =
            overnightMarginExcess(JsonField.of(overnightMarginExcess))

        /**
         * Sets [Builder.overnightMarginExcess] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overnightMarginExcess] with a well-typed
         * [OrderPreviewDelta] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun overnightMarginExcess(overnightMarginExcess: JsonField<OrderPreviewDelta>) = apply {
            this.overnightMarginExcess = overnightMarginExcess
        }

        /** Overnight margin requirement. */
        fun overnightMarginRequirement(overnightMarginRequirement: OrderPreviewDelta) =
            overnightMarginRequirement(JsonField.of(overnightMarginRequirement))

        /**
         * Sets [Builder.overnightMarginRequirement] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overnightMarginRequirement] with a well-typed
         * [OrderPreviewDelta] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun overnightMarginRequirement(overnightMarginRequirement: JsonField<OrderPreviewDelta>) =
            apply {
                this.overnightMarginRequirement = overnightMarginRequirement
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
         * Returns an immutable instance of [OrderPreviewMarginDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .initialMarginExcess()
         * .initialMarginRequirement()
         * .maintenanceMarginExcess()
         * .maintenanceMarginRequirement()
         * .overnightMarginExcess()
         * .overnightMarginRequirement()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrderPreviewMarginDetails =
            OrderPreviewMarginDetails(
                checkRequired("initialMarginExcess", initialMarginExcess),
                checkRequired("initialMarginRequirement", initialMarginRequirement),
                checkRequired("maintenanceMarginExcess", maintenanceMarginExcess),
                checkRequired("maintenanceMarginRequirement", maintenanceMarginRequirement),
                checkRequired("overnightMarginExcess", overnightMarginExcess),
                checkRequired("overnightMarginRequirement", overnightMarginRequirement),
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
    fun validate(): OrderPreviewMarginDetails = apply {
        if (validated) {
            return@apply
        }

        initialMarginExcess().validate()
        initialMarginRequirement().validate()
        maintenanceMarginExcess().validate()
        maintenanceMarginRequirement().validate()
        overnightMarginExcess().validate()
        overnightMarginRequirement().validate()
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
        (initialMarginExcess.asKnown().getOrNull()?.validity() ?: 0) +
            (initialMarginRequirement.asKnown().getOrNull()?.validity() ?: 0) +
            (maintenanceMarginExcess.asKnown().getOrNull()?.validity() ?: 0) +
            (maintenanceMarginRequirement.asKnown().getOrNull()?.validity() ?: 0) +
            (overnightMarginExcess.asKnown().getOrNull()?.validity() ?: 0) +
            (overnightMarginRequirement.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderPreviewMarginDetails &&
            initialMarginExcess == other.initialMarginExcess &&
            initialMarginRequirement == other.initialMarginRequirement &&
            maintenanceMarginExcess == other.maintenanceMarginExcess &&
            maintenanceMarginRequirement == other.maintenanceMarginRequirement &&
            overnightMarginExcess == other.overnightMarginExcess &&
            overnightMarginRequirement == other.overnightMarginRequirement &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            initialMarginExcess,
            initialMarginRequirement,
            maintenanceMarginExcess,
            maintenanceMarginRequirement,
            overnightMarginExcess,
            overnightMarginRequirement,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrderPreviewMarginDetails{initialMarginExcess=$initialMarginExcess, initialMarginRequirement=$initialMarginRequirement, maintenanceMarginExcess=$maintenanceMarginExcess, maintenanceMarginRequirement=$maintenanceMarginRequirement, overnightMarginExcess=$overnightMarginExcess, overnightMarginRequirement=$overnightMarginRequirement, additionalProperties=$additionalProperties}"
}
