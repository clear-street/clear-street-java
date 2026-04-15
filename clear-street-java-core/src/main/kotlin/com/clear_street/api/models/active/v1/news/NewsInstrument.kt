// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.news

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.active.v1.SecurityIdSource
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Instrument associated with a news item. */
class NewsInstrument
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val securityId: JsonField<String>,
    private val securityIdSource: JsonField<SecurityIdSource>,
    private val instrumentId: JsonField<String>,
    private val name: JsonField<String>,
    private val symbol: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("security_id")
        @ExcludeMissing
        securityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("security_id_source")
        @ExcludeMissing
        securityIdSource: JsonField<SecurityIdSource> = JsonMissing.of(),
        @JsonProperty("instrument_id")
        @ExcludeMissing
        instrumentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
    ) : this(securityId, securityIdSource, instrumentId, name, symbol, mutableMapOf())

    /**
     * Security identifier value.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityId(): String = securityId.getRequired("security_id")

    /**
     * Security identifier source.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun securityIdSource(): SecurityIdSource = securityIdSource.getRequired("security_id_source")

    /**
     * OEMS instrument UUID, if available from instrument cache enrichment.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrumentId(): Optional<String> = instrumentId.getOptional("instrument_id")

    /**
     * Instrument name/description, if available from instrument cache enrichment.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Trading symbol, if available from instrument cache enrichment.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun symbol(): Optional<String> = symbol.getOptional("symbol")

    /**
     * Returns the raw JSON value of [securityId].
     *
     * Unlike [securityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("security_id") @ExcludeMissing fun _securityId(): JsonField<String> = securityId

    /**
     * Returns the raw JSON value of [securityIdSource].
     *
     * Unlike [securityIdSource], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("security_id_source")
    @ExcludeMissing
    fun _securityIdSource(): JsonField<SecurityIdSource> = securityIdSource

    /**
     * Returns the raw JSON value of [instrumentId].
     *
     * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument_id")
    @ExcludeMissing
    fun _instrumentId(): JsonField<String> = instrumentId

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [symbol].
     *
     * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

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
         * Returns a mutable builder for constructing an instance of [NewsInstrument].
         *
         * The following fields are required:
         * ```java
         * .securityId()
         * .securityIdSource()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NewsInstrument]. */
    class Builder internal constructor() {

        private var securityId: JsonField<String>? = null
        private var securityIdSource: JsonField<SecurityIdSource>? = null
        private var instrumentId: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var symbol: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(newsInstrument: NewsInstrument) = apply {
            securityId = newsInstrument.securityId
            securityIdSource = newsInstrument.securityIdSource
            instrumentId = newsInstrument.instrumentId
            name = newsInstrument.name
            symbol = newsInstrument.symbol
            additionalProperties = newsInstrument.additionalProperties.toMutableMap()
        }

        /** Security identifier value. */
        fun securityId(securityId: String) = securityId(JsonField.of(securityId))

        /**
         * Sets [Builder.securityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun securityId(securityId: JsonField<String>) = apply { this.securityId = securityId }

        /** Security identifier source. */
        fun securityIdSource(securityIdSource: SecurityIdSource) =
            securityIdSource(JsonField.of(securityIdSource))

        /**
         * Sets [Builder.securityIdSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.securityIdSource] with a well-typed [SecurityIdSource]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun securityIdSource(securityIdSource: JsonField<SecurityIdSource>) = apply {
            this.securityIdSource = securityIdSource
        }

        /** OEMS instrument UUID, if available from instrument cache enrichment. */
        fun instrumentId(instrumentId: String?) = instrumentId(JsonField.ofNullable(instrumentId))

        /** Alias for calling [Builder.instrumentId] with `instrumentId.orElse(null)`. */
        fun instrumentId(instrumentId: Optional<String>) = instrumentId(instrumentId.getOrNull())

        /**
         * Sets [Builder.instrumentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrumentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun instrumentId(instrumentId: JsonField<String>) = apply {
            this.instrumentId = instrumentId
        }

        /** Instrument name/description, if available from instrument cache enrichment. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Trading symbol, if available from instrument cache enrichment. */
        fun symbol(symbol: String?) = symbol(JsonField.ofNullable(symbol))

        /** Alias for calling [Builder.symbol] with `symbol.orElse(null)`. */
        fun symbol(symbol: Optional<String>) = symbol(symbol.getOrNull())

        /**
         * Sets [Builder.symbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.symbol] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

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
         * Returns an immutable instance of [NewsInstrument].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .securityId()
         * .securityIdSource()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NewsInstrument =
            NewsInstrument(
                checkRequired("securityId", securityId),
                checkRequired("securityIdSource", securityIdSource),
                instrumentId,
                name,
                symbol,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NewsInstrument = apply {
        if (validated) {
            return@apply
        }

        securityId()
        securityIdSource().validate()
        instrumentId()
        name()
        symbol()
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
        (if (securityId.asKnown().isPresent) 1 else 0) +
            (securityIdSource.asKnown().getOrNull()?.validity() ?: 0) +
            (if (instrumentId.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (symbol.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NewsInstrument &&
            securityId == other.securityId &&
            securityIdSource == other.securityIdSource &&
            instrumentId == other.instrumentId &&
            name == other.name &&
            symbol == other.symbol &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(securityId, securityIdSource, instrumentId, name, symbol, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewsInstrument{securityId=$securityId, securityIdSource=$securityIdSource, instrumentId=$instrumentId, name=$name, symbol=$symbol, additionalProperties=$additionalProperties}"
}
