// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SymbolChart
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val symbol: JsonField<String>,
    private val timeframe: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timeframe") @ExcludeMissing timeframe: JsonField<String> = JsonMissing.of(),
    ) : this(symbol, timeframe, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun symbol(): String = symbol.getRequired("symbol")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeframe(): Optional<String> = timeframe.getOptional("timeframe")

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
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SymbolChart]. */
    class Builder internal constructor() {

        private var symbol: JsonField<String>? = null
        private var timeframe: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(symbolChart: SymbolChart) = apply {
            symbol = symbolChart.symbol
            timeframe = symbolChart.timeframe
            additionalProperties = symbolChart.additionalProperties.toMutableMap()
        }

        fun symbol(symbol: String) = symbol(JsonField.of(symbol))

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

        fun timeframe(timeframe: String?) = timeframe(JsonField.ofNullable(timeframe))

        /** Alias for calling [Builder.timeframe] with `timeframe.orElse(null)`. */
        fun timeframe(timeframe: Optional<String>) = timeframe(timeframe.getOrNull())

        /**
         * Sets [Builder.timeframe] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeframe] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeframe(timeframe: JsonField<String>) = apply { this.timeframe = timeframe }

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
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SymbolChart =
            SymbolChart(
                checkRequired("symbol", symbol),
                timeframe,
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
        (if (symbol.asKnown().isPresent) 1 else 0) + (if (timeframe.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SymbolChart &&
            symbol == other.symbol &&
            timeframe == other.timeframe &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(symbol, timeframe, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SymbolChart{symbol=$symbol, timeframe=$timeframe, additionalProperties=$additionalProperties}"
}
