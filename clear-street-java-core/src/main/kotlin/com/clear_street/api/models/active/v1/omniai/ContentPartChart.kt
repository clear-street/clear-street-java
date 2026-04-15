// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

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

class ContentPartChart
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chartId: JsonField<String>,
    private val actionButtons: JsonField<List<ActionButton>>,
    private val chartKind: JsonField<ChartKind>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chart_id") @ExcludeMissing chartId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("action_buttons")
        @ExcludeMissing
        actionButtons: JsonField<List<ActionButton>> = JsonMissing.of(),
        @JsonProperty("chart_kind")
        @ExcludeMissing
        chartKind: JsonField<ChartKind> = JsonMissing.of(),
    ) : this(chartId, actionButtons, chartKind, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chartId(): String = chartId.getRequired("chart_id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actionButtons(): Optional<List<ActionButton>> = actionButtons.getOptional("action_buttons")

    /**
     * Chart for a specific ticker symbol
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun chartKind(): Optional<ChartKind> = chartKind.getOptional("chart_kind")

    /**
     * Returns the raw JSON value of [chartId].
     *
     * Unlike [chartId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chart_id") @ExcludeMissing fun _chartId(): JsonField<String> = chartId

    /**
     * Returns the raw JSON value of [actionButtons].
     *
     * Unlike [actionButtons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action_buttons")
    @ExcludeMissing
    fun _actionButtons(): JsonField<List<ActionButton>> = actionButtons

    /**
     * Returns the raw JSON value of [chartKind].
     *
     * Unlike [chartKind], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chart_kind") @ExcludeMissing fun _chartKind(): JsonField<ChartKind> = chartKind

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
         * Returns a mutable builder for constructing an instance of [ContentPartChart].
         *
         * The following fields are required:
         * ```java
         * .chartId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContentPartChart]. */
    class Builder internal constructor() {

        private var chartId: JsonField<String>? = null
        private var actionButtons: JsonField<MutableList<ActionButton>>? = null
        private var chartKind: JsonField<ChartKind> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contentPartChart: ContentPartChart) = apply {
            chartId = contentPartChart.chartId
            actionButtons = contentPartChart.actionButtons.map { it.toMutableList() }
            chartKind = contentPartChart.chartKind
            additionalProperties = contentPartChart.additionalProperties.toMutableMap()
        }

        fun chartId(chartId: String) = chartId(JsonField.of(chartId))

        /**
         * Sets [Builder.chartId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chartId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chartId(chartId: JsonField<String>) = apply { this.chartId = chartId }

        fun actionButtons(actionButtons: List<ActionButton>) =
            actionButtons(JsonField.of(actionButtons))

        /**
         * Sets [Builder.actionButtons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.actionButtons] with a well-typed `List<ActionButton>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun actionButtons(actionButtons: JsonField<List<ActionButton>>) = apply {
            this.actionButtons = actionButtons.map { it.toMutableList() }
        }

        /**
         * Adds a single [ActionButton] to [actionButtons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addActionButton(actionButton: ActionButton) = apply {
            actionButtons =
                (actionButtons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("actionButtons", it).add(actionButton)
                }
        }

        /** Chart for a specific ticker symbol */
        fun chartKind(chartKind: ChartKind?) = chartKind(JsonField.ofNullable(chartKind))

        /** Alias for calling [Builder.chartKind] with `chartKind.orElse(null)`. */
        fun chartKind(chartKind: Optional<ChartKind>) = chartKind(chartKind.getOrNull())

        /**
         * Sets [Builder.chartKind] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chartKind] with a well-typed [ChartKind] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun chartKind(chartKind: JsonField<ChartKind>) = apply { this.chartKind = chartKind }

        /** Alias for calling [chartKind] with `ChartKind.ofSymbolChart(symbolChart)`. */
        fun chartKind(symbolChart: ChartKind.SymbolChart) =
            chartKind(ChartKind.ofSymbolChart(symbolChart))

        /** Alias for calling [chartKind] with `ChartKind.ofDataChart(dataChart)`. */
        fun chartKind(dataChart: ChartKind.DataChart) = chartKind(ChartKind.ofDataChart(dataChart))

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
         * Returns an immutable instance of [ContentPartChart].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .chartId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContentPartChart =
            ContentPartChart(
                checkRequired("chartId", chartId),
                (actionButtons ?: JsonMissing.of()).map { it.toImmutable() },
                chartKind,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContentPartChart = apply {
        if (validated) {
            return@apply
        }

        chartId()
        actionButtons().ifPresent { it.forEach { it.validate() } }
        chartKind().ifPresent { it.validate() }
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
        (if (chartId.asKnown().isPresent) 1 else 0) +
            (actionButtons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (chartKind.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContentPartChart &&
            chartId == other.chartId &&
            actionButtons == other.actionButtons &&
            chartKind == other.chartKind &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chartId, actionButtons, chartKind, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContentPartChart{chartId=$chartId, actionButtons=$actionButtons, chartKind=$chartKind, additionalProperties=$additionalProperties}"
}
