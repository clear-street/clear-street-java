// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Volume Weighted Average Price strategy */
class VwapStrategy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endAt: JsonField<OffsetDateTime>,
    private val startAt: JsonField<OffsetDateTime>,
    private val urgency: JsonField<Urgency>,
    private val maxPercent: JsonField<String>,
    private val minPercent: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("end_at") @ExcludeMissing endAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start_at")
        @ExcludeMissing
        startAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("urgency") @ExcludeMissing urgency: JsonField<Urgency> = JsonMissing.of(),
        @JsonProperty("max_percent")
        @ExcludeMissing
        maxPercent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("min_percent")
        @ExcludeMissing
        minPercent: JsonField<String> = JsonMissing.of(),
    ) : this(endAt, startAt, urgency, maxPercent, minPercent, mutableMapOf())

    fun toBaseStrategyParams(): BaseStrategyParams =
        BaseStrategyParams.builder().endAt(endAt).startAt(startAt).urgency(urgency).build()

    /**
     * UTC timestamp to end execution (defaults to market close)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endAt(): Optional<OffsetDateTime> = endAt.getOptional("end_at")

    /**
     * UTC timestamp to start execution (defaults to order placement time)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startAt(): Optional<OffsetDateTime> = startAt.getOptional("start_at")

    /**
     * Urgency level for execution aggressiveness
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun urgency(): Optional<Urgency> = urgency.getOptional("urgency")

    /**
     * Maximum percentage of market volume to participate in (0-50)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxPercent(): Optional<String> = maxPercent.getOptional("max_percent")

    /**
     * Minimum percentage of market volume to participate in (0-100)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minPercent(): Optional<String> = minPercent.getOptional("min_percent")

    /**
     * Returns the raw JSON value of [endAt].
     *
     * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<OffsetDateTime> = endAt

    /**
     * Returns the raw JSON value of [startAt].
     *
     * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_at") @ExcludeMissing fun _startAt(): JsonField<OffsetDateTime> = startAt

    /**
     * Returns the raw JSON value of [urgency].
     *
     * Unlike [urgency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("urgency") @ExcludeMissing fun _urgency(): JsonField<Urgency> = urgency

    /**
     * Returns the raw JSON value of [maxPercent].
     *
     * Unlike [maxPercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("max_percent") @ExcludeMissing fun _maxPercent(): JsonField<String> = maxPercent

    /**
     * Returns the raw JSON value of [minPercent].
     *
     * Unlike [minPercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("min_percent") @ExcludeMissing fun _minPercent(): JsonField<String> = minPercent

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

        /** Returns a mutable builder for constructing an instance of [VwapStrategy]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VwapStrategy]. */
    class Builder internal constructor() {

        private var endAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var urgency: JsonField<Urgency> = JsonMissing.of()
        private var maxPercent: JsonField<String> = JsonMissing.of()
        private var minPercent: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(vwapStrategy: VwapStrategy) = apply {
            endAt = vwapStrategy.endAt
            startAt = vwapStrategy.startAt
            urgency = vwapStrategy.urgency
            maxPercent = vwapStrategy.maxPercent
            minPercent = vwapStrategy.minPercent
            additionalProperties = vwapStrategy.additionalProperties.toMutableMap()
        }

        /** UTC timestamp to end execution (defaults to market close) */
        fun endAt(endAt: OffsetDateTime?) = endAt(JsonField.ofNullable(endAt))

        /** Alias for calling [Builder.endAt] with `endAt.orElse(null)`. */
        fun endAt(endAt: Optional<OffsetDateTime>) = endAt(endAt.getOrNull())

        /**
         * Sets [Builder.endAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endAt] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun endAt(endAt: JsonField<OffsetDateTime>) = apply { this.endAt = endAt }

        /** UTC timestamp to start execution (defaults to order placement time) */
        fun startAt(startAt: OffsetDateTime?) = startAt(JsonField.ofNullable(startAt))

        /** Alias for calling [Builder.startAt] with `startAt.orElse(null)`. */
        fun startAt(startAt: Optional<OffsetDateTime>) = startAt(startAt.getOrNull())

        /**
         * Sets [Builder.startAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startAt(startAt: JsonField<OffsetDateTime>) = apply { this.startAt = startAt }

        /** Urgency level for execution aggressiveness */
        fun urgency(urgency: Urgency) = urgency(JsonField.of(urgency))

        /**
         * Sets [Builder.urgency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.urgency] with a well-typed [Urgency] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun urgency(urgency: JsonField<Urgency>) = apply { this.urgency = urgency }

        /** Maximum percentage of market volume to participate in (0-50) */
        fun maxPercent(maxPercent: String?) = maxPercent(JsonField.ofNullable(maxPercent))

        /** Alias for calling [Builder.maxPercent] with `maxPercent.orElse(null)`. */
        fun maxPercent(maxPercent: Optional<String>) = maxPercent(maxPercent.getOrNull())

        /**
         * Sets [Builder.maxPercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxPercent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxPercent(maxPercent: JsonField<String>) = apply { this.maxPercent = maxPercent }

        /** Minimum percentage of market volume to participate in (0-100) */
        fun minPercent(minPercent: String?) = minPercent(JsonField.ofNullable(minPercent))

        /** Alias for calling [Builder.minPercent] with `minPercent.orElse(null)`. */
        fun minPercent(minPercent: Optional<String>) = minPercent(minPercent.getOrNull())

        /**
         * Sets [Builder.minPercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minPercent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minPercent(minPercent: JsonField<String>) = apply { this.minPercent = minPercent }

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
         * Returns an immutable instance of [VwapStrategy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VwapStrategy =
            VwapStrategy(
                endAt,
                startAt,
                urgency,
                maxPercent,
                minPercent,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VwapStrategy = apply {
        if (validated) {
            return@apply
        }

        endAt()
        startAt()
        urgency().ifPresent { it.validate() }
        maxPercent()
        minPercent()
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
        (if (endAt.asKnown().isPresent) 1 else 0) +
            (if (startAt.asKnown().isPresent) 1 else 0) +
            (urgency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (maxPercent.asKnown().isPresent) 1 else 0) +
            (if (minPercent.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VwapStrategy &&
            endAt == other.endAt &&
            startAt == other.startAt &&
            urgency == other.urgency &&
            maxPercent == other.maxPercent &&
            minPercent == other.minPercent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(endAt, startAt, urgency, maxPercent, minPercent, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VwapStrategy{endAt=$endAt, startAt=$startAt, urgency=$urgency, maxPercent=$maxPercent, minPercent=$minPercent, additionalProperties=$additionalProperties}"
}
