// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.BaseDeserializer
import com.clear_street.api.core.BaseSerializer
import com.clear_street.api.core.Enum
import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.allMaxBy
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.getOrThrow
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Chart for a specific ticker symbol */
@JsonDeserialize(using = ChartKind.Deserializer::class)
@JsonSerialize(using = ChartKind.Serializer::class)
class ChartKind
private constructor(
    private val symbolChart: SymbolChart? = null,
    private val dataChart: DataChart? = null,
    private val _json: JsonValue? = null,
) {

    /** Chart for a specific ticker symbol */
    fun symbolChart(): Optional<SymbolChart> = Optional.ofNullable(symbolChart)

    /** Chart built from explicit data series */
    fun dataChart(): Optional<DataChart> = Optional.ofNullable(dataChart)

    fun isSymbolChart(): Boolean = symbolChart != null

    fun isDataChart(): Boolean = dataChart != null

    /** Chart for a specific ticker symbol */
    fun asSymbolChart(): SymbolChart = symbolChart.getOrThrow("symbolChart")

    /** Chart built from explicit data series */
    fun asDataChart(): DataChart = dataChart.getOrThrow("dataChart")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            symbolChart != null -> visitor.visitSymbolChart(symbolChart)
            dataChart != null -> visitor.visitDataChart(dataChart)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ChartKind = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitSymbolChart(symbolChart: SymbolChart) {
                    symbolChart.validate()
                }

                override fun visitDataChart(dataChart: DataChart) {
                    dataChart.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitSymbolChart(symbolChart: SymbolChart) = symbolChart.validity()

                override fun visitDataChart(dataChart: DataChart) = dataChart.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ChartKind &&
            symbolChart == other.symbolChart &&
            dataChart == other.dataChart
    }

    override fun hashCode(): Int = Objects.hash(symbolChart, dataChart)

    override fun toString(): String =
        when {
            symbolChart != null -> "ChartKind{symbolChart=$symbolChart}"
            dataChart != null -> "ChartKind{dataChart=$dataChart}"
            _json != null -> "ChartKind{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ChartKind")
        }

    companion object {

        /** Chart for a specific ticker symbol */
        @JvmStatic
        fun ofSymbolChart(symbolChart: SymbolChart) = ChartKind(symbolChart = symbolChart)

        /** Chart built from explicit data series */
        @JvmStatic fun ofDataChart(dataChart: DataChart) = ChartKind(dataChart = dataChart)
    }

    /** An interface that defines how to map each variant of [ChartKind] to a value of type [T]. */
    interface Visitor<out T> {

        /** Chart for a specific ticker symbol */
        fun visitSymbolChart(symbolChart: SymbolChart): T

        /** Chart built from explicit data series */
        fun visitDataChart(dataChart: DataChart): T

        /**
         * Maps an unknown variant of [ChartKind] to a value of type [T].
         *
         * An instance of [ChartKind] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws ClearStreetInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw ClearStreetInvalidDataException("Unknown ChartKind: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<ChartKind>(ChartKind::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ChartKind {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<SymbolChart>())?.let {
                            ChartKind(symbolChart = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DataChart>())?.let {
                            ChartKind(dataChart = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ChartKind(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<ChartKind>(ChartKind::class) {

        override fun serialize(
            value: ChartKind,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.symbolChart != null -> generator.writeObject(value.symbolChart)
                value.dataChart != null -> generator.writeObject(value.dataChart)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ChartKind")
            }
        }
    }

    /** Chart for a specific ticker symbol */
    class SymbolChart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val symbol: JsonField<String>,
        private val timeframe: JsonField<String>,
        private val chartType: JsonField<ChartType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
            @JsonProperty("timeframe")
            @ExcludeMissing
            timeframe: JsonField<String> = JsonMissing.of(),
            @JsonProperty("chart_type")
            @ExcludeMissing
            chartType: JsonField<ChartType> = JsonMissing.of(),
        ) : this(symbol, timeframe, chartType, mutableMapOf())

        fun toSymbolChart(): SymbolChart =
            SymbolChart.builder().symbol(symbol).timeframe(timeframe).build()

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun symbol(): String = symbol.getRequired("symbol")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timeframe(): Optional<String> = timeframe.getOptional("timeframe")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chartType(): ChartType = chartType.getRequired("chart_type")

        /**
         * Returns the raw JSON value of [symbol].
         *
         * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

        /**
         * Returns the raw JSON value of [timeframe].
         *
         * Unlike [timeframe], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeframe") @ExcludeMissing fun _timeframe(): JsonField<String> = timeframe

        /**
         * Returns the raw JSON value of [chartType].
         *
         * Unlike [chartType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chart_type")
        @ExcludeMissing
        fun _chartType(): JsonField<ChartType> = chartType

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
             * Returns a mutable builder for constructing an instance of [SymbolChart].
             *
             * The following fields are required:
             * ```java
             * .symbol()
             * .chartType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SymbolChart]. */
        class Builder internal constructor() {

            private var symbol: JsonField<String>? = null
            private var timeframe: JsonField<String> = JsonMissing.of()
            private var chartType: JsonField<ChartType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(symbolChart: SymbolChart) = apply {
                symbol = symbolChart.symbol
                timeframe = symbolChart.timeframe
                chartType = symbolChart.chartType
                additionalProperties = symbolChart.additionalProperties.toMutableMap()
            }

            fun symbol(symbol: String) = symbol(JsonField.of(symbol))

            /**
             * Sets [Builder.symbol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.symbol] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

            fun timeframe(timeframe: String?) = timeframe(JsonField.ofNullable(timeframe))

            /** Alias for calling [Builder.timeframe] with `timeframe.orElse(null)`. */
            fun timeframe(timeframe: Optional<String>) = timeframe(timeframe.getOrNull())

            /**
             * Sets [Builder.timeframe] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeframe] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeframe(timeframe: JsonField<String>) = apply { this.timeframe = timeframe }

            fun chartType(chartType: ChartType) = chartType(JsonField.of(chartType))

            /**
             * Sets [Builder.chartType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chartType] with a well-typed [ChartType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chartType(chartType: JsonField<ChartType>) = apply { this.chartType = chartType }

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
             * Returns an immutable instance of [SymbolChart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .symbol()
             * .chartType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SymbolChart =
                SymbolChart(
                    checkRequired("symbol", symbol),
                    timeframe,
                    checkRequired("chartType", chartType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SymbolChart = apply {
            if (validated) {
                return@apply
            }

            symbol()
            timeframe()
            chartType().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (symbol.asKnown().isPresent) 1 else 0) +
                (if (timeframe.asKnown().isPresent) 1 else 0) +
                (chartType.asKnown().getOrNull()?.validity() ?: 0)

        class ChartType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val SYMBOL_CHART = of("symbol_chart")

                @JvmStatic fun of(value: String) = ChartType(JsonField.of(value))
            }

            /** An enum containing [ChartType]'s known values. */
            enum class Known {
                SYMBOL_CHART
            }

            /**
             * An enum containing [ChartType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ChartType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SYMBOL_CHART,
                /**
                 * An enum member indicating that [ChartType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SYMBOL_CHART -> Value.SYMBOL_CHART
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    SYMBOL_CHART -> Known.SYMBOL_CHART
                    else -> throw ClearStreetInvalidDataException("Unknown ChartType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ClearStreetInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ChartType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChartType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SymbolChart &&
                symbol == other.symbol &&
                timeframe == other.timeframe &&
                chartType == other.chartType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(symbol, timeframe, chartType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SymbolChart{symbol=$symbol, timeframe=$timeframe, chartType=$chartType, additionalProperties=$additionalProperties}"
    }

    /** Chart built from explicit data series */
    class DataChart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val series: JsonField<List<ChartSeries>>,
        private val chartType: JsonField<ChartType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("series")
            @ExcludeMissing
            series: JsonField<List<ChartSeries>> = JsonMissing.of(),
            @JsonProperty("chart_type")
            @ExcludeMissing
            chartType: JsonField<ChartType> = JsonMissing.of(),
        ) : this(series, chartType, mutableMapOf())

        fun toDataChart(): DataChart = DataChart.builder().series(series).build()

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun series(): List<ChartSeries> = series.getRequired("series")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun chartType(): ChartType = chartType.getRequired("chart_type")

        /**
         * Returns the raw JSON value of [series].
         *
         * Unlike [series], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("series") @ExcludeMissing fun _series(): JsonField<List<ChartSeries>> = series

        /**
         * Returns the raw JSON value of [chartType].
         *
         * Unlike [chartType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("chart_type")
        @ExcludeMissing
        fun _chartType(): JsonField<ChartType> = chartType

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
             * Returns a mutable builder for constructing an instance of [DataChart].
             *
             * The following fields are required:
             * ```java
             * .series()
             * .chartType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DataChart]. */
        class Builder internal constructor() {

            private var series: JsonField<MutableList<ChartSeries>>? = null
            private var chartType: JsonField<ChartType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dataChart: DataChart) = apply {
                series = dataChart.series.map { it.toMutableList() }
                chartType = dataChart.chartType
                additionalProperties = dataChart.additionalProperties.toMutableMap()
            }

            fun series(series: List<ChartSeries>) = series(JsonField.of(series))

            /**
             * Sets [Builder.series] to an arbitrary JSON value.
             *
             * You should usually call [Builder.series] with a well-typed `List<ChartSeries>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun series(series: JsonField<List<ChartSeries>>) = apply {
                this.series = series.map { it.toMutableList() }
            }

            /**
             * Adds a single [ChartSeries] to [Builder.series].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSeries(series: ChartSeries) = apply {
                this.series =
                    (this.series ?: JsonField.of(mutableListOf())).also {
                        checkKnown("series", it).add(series)
                    }
            }

            fun chartType(chartType: ChartType) = chartType(JsonField.of(chartType))

            /**
             * Sets [Builder.chartType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.chartType] with a well-typed [ChartType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun chartType(chartType: JsonField<ChartType>) = apply { this.chartType = chartType }

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
             * Returns an immutable instance of [DataChart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .series()
             * .chartType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DataChart =
                DataChart(
                    checkRequired("series", series).map { it.toImmutable() },
                    checkRequired("chartType", chartType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DataChart = apply {
            if (validated) {
                return@apply
            }

            series().forEach { it.validate() }
            chartType().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (series.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (chartType.asKnown().getOrNull()?.validity() ?: 0)

        class ChartType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DATA_CHART = of("data_chart")

                @JvmStatic fun of(value: String) = ChartType(JsonField.of(value))
            }

            /** An enum containing [ChartType]'s known values. */
            enum class Known {
                DATA_CHART
            }

            /**
             * An enum containing [ChartType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ChartType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DATA_CHART,
                /**
                 * An enum member indicating that [ChartType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DATA_CHART -> Value.DATA_CHART
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    DATA_CHART -> Known.DATA_CHART
                    else -> throw ClearStreetInvalidDataException("Unknown ChartType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    ClearStreetInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): ChartType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ChartType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DataChart &&
                series == other.series &&
                chartType == other.chartType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(series, chartType, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DataChart{series=$series, chartType=$chartType, additionalProperties=$additionalProperties}"
    }
}
