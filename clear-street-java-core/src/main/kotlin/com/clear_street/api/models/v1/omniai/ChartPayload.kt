// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

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

/** Typed chart payload rendered inline in assistant content. */
class ChartPayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val chartId: JsonField<String>,
    private val actionButtons: JsonField<List<ActionButton>>,
    private val dataChart: JsonField<DataChart>,
    private val symbolChart: JsonField<SymbolChart>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("chartId") @ExcludeMissing chartId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("actionButtons")
        @ExcludeMissing
        actionButtons: JsonField<List<ActionButton>> = JsonMissing.of(),
        @JsonProperty("dataChart")
        @ExcludeMissing
        dataChart: JsonField<DataChart> = JsonMissing.of(),
        @JsonProperty("symbolChart")
        @ExcludeMissing
        symbolChart: JsonField<SymbolChart> = JsonMissing.of(),
    ) : this(chartId, actionButtons, dataChart, symbolChart, mutableMapOf())

    /**
     * Stable chart identifier scoped to the content part.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun chartId(): String = chartId.getRequired("chartId")

    /**
     * Buttons associated with this chart.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun actionButtons(): Optional<List<ActionButton>> = actionButtons.getOptional("actionButtons")

    /**
     * Explicit series-driven chart definition.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dataChart(): Optional<DataChart> = dataChart.getOptional("dataChart")

    /**
     * Symbol-driven chart definition.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun symbolChart(): Optional<SymbolChart> = symbolChart.getOptional("symbolChart")

    /**
     * Returns the raw JSON value of [chartId].
     *
     * Unlike [chartId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("chartId") @ExcludeMissing fun _chartId(): JsonField<String> = chartId

    /**
     * Returns the raw JSON value of [actionButtons].
     *
     * Unlike [actionButtons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("actionButtons")
    @ExcludeMissing
    fun _actionButtons(): JsonField<List<ActionButton>> = actionButtons

    /**
     * Returns the raw JSON value of [dataChart].
     *
     * Unlike [dataChart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("dataChart") @ExcludeMissing fun _dataChart(): JsonField<DataChart> = dataChart

    /**
     * Returns the raw JSON value of [symbolChart].
     *
     * Unlike [symbolChart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbolChart")
    @ExcludeMissing
    fun _symbolChart(): JsonField<SymbolChart> = symbolChart

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
         * Returns a mutable builder for constructing an instance of [ChartPayload].
         *
         * The following fields are required:
         * ```java
         * .chartId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ChartPayload]. */
    class Builder internal constructor() {

        private var chartId: JsonField<String>? = null
        private var actionButtons: JsonField<MutableList<ActionButton>>? = null
        private var dataChart: JsonField<DataChart> = JsonMissing.of()
        private var symbolChart: JsonField<SymbolChart> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(chartPayload: ChartPayload) = apply {
            chartId = chartPayload.chartId
            actionButtons = chartPayload.actionButtons.map { it.toMutableList() }
            dataChart = chartPayload.dataChart
            symbolChart = chartPayload.symbolChart
            additionalProperties = chartPayload.additionalProperties.toMutableMap()
        }

        /** Stable chart identifier scoped to the content part. */
        fun chartId(chartId: String) = chartId(JsonField.of(chartId))

        /**
         * Sets [Builder.chartId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.chartId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun chartId(chartId: JsonField<String>) = apply { this.chartId = chartId }

        /** Buttons associated with this chart. */
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

        /** Explicit series-driven chart definition. */
        fun dataChart(dataChart: DataChart?) = dataChart(JsonField.ofNullable(dataChart))

        /** Alias for calling [Builder.dataChart] with `dataChart.orElse(null)`. */
        fun dataChart(dataChart: Optional<DataChart>) = dataChart(dataChart.getOrNull())

        /**
         * Sets [Builder.dataChart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dataChart] with a well-typed [DataChart] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dataChart(dataChart: JsonField<DataChart>) = apply { this.dataChart = dataChart }

        /** Symbol-driven chart definition. */
        fun symbolChart(symbolChart: SymbolChart?) = symbolChart(JsonField.ofNullable(symbolChart))

        /** Alias for calling [Builder.symbolChart] with `symbolChart.orElse(null)`. */
        fun symbolChart(symbolChart: Optional<SymbolChart>) = symbolChart(symbolChart.getOrNull())

        /**
         * Sets [Builder.symbolChart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbolChart] with a well-typed [SymbolChart] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun symbolChart(symbolChart: JsonField<SymbolChart>) = apply {
            this.symbolChart = symbolChart
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
         * Returns an immutable instance of [ChartPayload].
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
        fun build(): ChartPayload =
            ChartPayload(
                checkRequired("chartId", chartId),
                (actionButtons ?: JsonMissing.of()).map { it.toImmutable() },
                dataChart,
                symbolChart,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChartPayload = apply {
        if (validated) {
            return@apply
        }

        chartId()
        actionButtons().ifPresent { it.forEach { it.validate() } }
        dataChart().ifPresent { it.validate() }
        symbolChart().ifPresent { it.validate() }
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
            (dataChart.asKnown().getOrNull()?.validity() ?: 0) +
            (symbolChart.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChartPayload &&
            chartId == other.chartId &&
            actionButtons == other.actionButtons &&
            dataChart == other.dataChart &&
            symbolChart == other.symbolChart &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(chartId, actionButtons, dataChart, symbolChart, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChartPayload{chartId=$chartId, actionButtons=$actionButtons, dataChart=$dataChart, symbolChart=$symbolChart, additionalProperties=$additionalProperties}"
}
