// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Percentage of Volume strategy */
class PovStrategy
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endAt: JsonField<OffsetDateTime>,
    private val startAt: JsonField<OffsetDateTime>,
    private val urgency: JsonField<Urgency>,
    private val targetPercent: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("end_at") @ExcludeMissing endAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start_at")
        @ExcludeMissing
        startAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("urgency") @ExcludeMissing urgency: JsonField<Urgency> = JsonMissing.of(),
        @JsonProperty("target_percent")
        @ExcludeMissing
        targetPercent: JsonField<String> = JsonMissing.of(),
    ) : this(endAt, startAt, urgency, targetPercent, mutableMapOf())

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
     * Target percentage of market volume to participate in (0-100)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetPercent(): String = targetPercent.getRequired("target_percent")

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
     * Returns the raw JSON value of [targetPercent].
     *
     * Unlike [targetPercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_percent")
    @ExcludeMissing
    fun _targetPercent(): JsonField<String> = targetPercent

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
         * Returns a mutable builder for constructing an instance of [PovStrategy].
         *
         * The following fields are required:
         * ```java
         * .targetPercent()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PovStrategy]. */
    class Builder internal constructor() {

        private var endAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var urgency: JsonField<Urgency> = JsonMissing.of()
        private var targetPercent: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(povStrategy: PovStrategy) = apply {
            endAt = povStrategy.endAt
            startAt = povStrategy.startAt
            urgency = povStrategy.urgency
            targetPercent = povStrategy.targetPercent
            additionalProperties = povStrategy.additionalProperties.toMutableMap()
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

        /** Target percentage of market volume to participate in (0-100) */
        fun targetPercent(targetPercent: String) = targetPercent(JsonField.of(targetPercent))

        /**
         * Sets [Builder.targetPercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetPercent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetPercent(targetPercent: JsonField<String>) = apply {
            this.targetPercent = targetPercent
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
         * Returns an immutable instance of [PovStrategy].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .targetPercent()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PovStrategy =
            PovStrategy(
                endAt,
                startAt,
                urgency,
                checkRequired("targetPercent", targetPercent),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PovStrategy = apply {
        if (validated) {
            return@apply
        }

        endAt()
        startAt()
        urgency().ifPresent { it.validate() }
        targetPercent()
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
            (if (targetPercent.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PovStrategy &&
            endAt == other.endAt &&
            startAt == other.startAt &&
            urgency == other.urgency &&
            targetPercent == other.targetPercent &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(endAt, startAt, urgency, targetPercent, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PovStrategy{endAt=$endAt, startAt=$startAt, urgency=$urgency, targetPercent=$targetPercent, additionalProperties=$additionalProperties}"
}
