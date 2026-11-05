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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Prediction markets matching the request. */
class PredictionMarkets
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val markets: JsonField<List<PredictionMarket>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("markets")
        @ExcludeMissing
        markets: JsonField<List<PredictionMarket>> = JsonMissing.of()
    ) : this(markets, mutableMapOf())

    /**
     * Markets ordered by symbol.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun markets(): List<PredictionMarket> = markets.getRequired("markets")

    /**
     * Returns the raw JSON value of [markets].
     *
     * Unlike [markets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("markets")
    @ExcludeMissing
    fun _markets(): JsonField<List<PredictionMarket>> = markets

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
         * Returns a mutable builder for constructing an instance of [PredictionMarkets].
         *
         * The following fields are required:
         * ```java
         * .markets()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PredictionMarkets]. */
    class Builder internal constructor() {

        private var markets: JsonField<MutableList<PredictionMarket>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(predictionMarkets: PredictionMarkets) = apply {
            markets = predictionMarkets.markets.map { it.toMutableList() }
            additionalProperties = predictionMarkets.additionalProperties.toMutableMap()
        }

        /** Markets ordered by symbol. */
        fun markets(markets: List<PredictionMarket>) = markets(JsonField.of(markets))

        /**
         * Sets [Builder.markets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markets] with a well-typed `List<PredictionMarket>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun markets(markets: JsonField<List<PredictionMarket>>) = apply {
            this.markets = markets.map { it.toMutableList() }
        }

        /**
         * Adds a single [PredictionMarket] to [markets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMarket(market: PredictionMarket) = apply {
            markets =
                (markets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("markets", it).add(market)
                }
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
         * Returns an immutable instance of [PredictionMarkets].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .markets()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PredictionMarkets =
            PredictionMarkets(
                checkRequired("markets", markets).map { it.toImmutable() },
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
    fun validate(): PredictionMarkets = apply {
        if (validated) {
            return@apply
        }

        markets().forEach { it.validate() }
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
        (markets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PredictionMarkets &&
            markets == other.markets &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(markets, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PredictionMarkets{markets=$markets, additionalProperties=$additionalProperties}"
}
