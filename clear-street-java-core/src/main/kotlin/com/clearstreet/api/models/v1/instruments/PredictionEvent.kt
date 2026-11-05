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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A prediction market event: a set of related markets that resolve together. */
class PredictionEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val categories: JsonField<List<String>>,
    private val code: JsonField<String>,
    private val markets: JsonField<List<PredictionMarketSummary>>,
    private val title: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("markets")
        @ExcludeMissing
        markets: JsonField<List<PredictionMarketSummary>> = JsonMissing.of(),
        @JsonProperty("title") @ExcludeMissing title: JsonField<String> = JsonMissing.of(),
    ) : this(categories, code, markets, title, mutableMapOf())

    /**
     * Distinct categories of the event's listable markets, sorted alphabetically.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun categories(): List<String> = categories.getRequired("categories")

    /**
     * Event code.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = code.getRequired("code")

    /**
     * Every market of the event in any status, ordered by symbol. Present only when
     * `include_markets` is `true`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun markets(): Optional<List<PredictionMarketSummary>> = markets.getOptional("markets")

    /**
     * The question of the event's first listable market, by symbol.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun title(): Optional<String> = title.getOptional("title")

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<List<String>> = categories

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [markets].
     *
     * Unlike [markets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("markets")
    @ExcludeMissing
    fun _markets(): JsonField<List<PredictionMarketSummary>> = markets

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
         * Returns a mutable builder for constructing an instance of [PredictionEvent].
         *
         * The following fields are required:
         * ```java
         * .categories()
         * .code()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PredictionEvent]. */
    class Builder internal constructor() {

        private var categories: JsonField<MutableList<String>>? = null
        private var code: JsonField<String>? = null
        private var markets: JsonField<MutableList<PredictionMarketSummary>>? = null
        private var title: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(predictionEvent: PredictionEvent) = apply {
            categories = predictionEvent.categories.map { it.toMutableList() }
            code = predictionEvent.code
            markets = predictionEvent.markets.map { it.toMutableList() }
            title = predictionEvent.title
            additionalProperties = predictionEvent.additionalProperties.toMutableMap()
        }

        /** Distinct categories of the event's listable markets, sorted alphabetically. */
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

        /** Event code. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /**
         * Every market of the event in any status, ordered by symbol. Present only when
         * `include_markets` is `true`.
         */
        fun markets(markets: List<PredictionMarketSummary>?) =
            markets(JsonField.ofNullable(markets))

        /** Alias for calling [Builder.markets] with `markets.orElse(null)`. */
        fun markets(markets: Optional<List<PredictionMarketSummary>>) = markets(markets.getOrNull())

        /**
         * Sets [Builder.markets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markets] with a well-typed
         * `List<PredictionMarketSummary>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun markets(markets: JsonField<List<PredictionMarketSummary>>) = apply {
            this.markets = markets.map { it.toMutableList() }
        }

        /**
         * Adds a single [PredictionMarketSummary] to [markets].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMarket(market: PredictionMarketSummary) = apply {
            markets =
                (markets ?: JsonField.of(mutableListOf())).also {
                    checkKnown("markets", it).add(market)
                }
        }

        /** The question of the event's first listable market, by symbol. */
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
         * Returns an immutable instance of [PredictionEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .categories()
         * .code()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PredictionEvent =
            PredictionEvent(
                checkRequired("categories", categories).map { it.toImmutable() },
                checkRequired("code", code),
                (markets ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): PredictionEvent = apply {
        if (validated) {
            return@apply
        }

        categories()
        code()
        markets().ifPresent { it.forEach { it.validate() } }
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
        (categories.asKnown().getOrNull()?.size ?: 0) +
            (if (code.asKnown().isPresent) 1 else 0) +
            (markets.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (title.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PredictionEvent &&
            categories == other.categories &&
            code == other.code &&
            markets == other.markets &&
            title == other.title &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(categories, code, markets, title, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PredictionEvent{categories=$categories, code=$code, markets=$markets, title=$title, additionalProperties=$additionalProperties}"
}
