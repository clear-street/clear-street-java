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

/** Base parameters common to most algorithmic strategies */
class BaseStrategyParams
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val endAt: JsonField<OffsetDateTime>,
    private val startAt: JsonField<OffsetDateTime>,
    private val urgency: JsonField<Urgency>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("end_at") @ExcludeMissing endAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("start_at")
        @ExcludeMissing
        startAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("urgency") @ExcludeMissing urgency: JsonField<Urgency> = JsonMissing.of(),
    ) : this(endAt, startAt, urgency, mutableMapOf())

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

        /** Returns a mutable builder for constructing an instance of [BaseStrategyParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BaseStrategyParams]. */
    class Builder internal constructor() {

        private var endAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var startAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var urgency: JsonField<Urgency> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(baseStrategyParams: BaseStrategyParams) = apply {
            endAt = baseStrategyParams.endAt
            startAt = baseStrategyParams.startAt
            urgency = baseStrategyParams.urgency
            additionalProperties = baseStrategyParams.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [BaseStrategyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BaseStrategyParams =
            BaseStrategyParams(endAt, startAt, urgency, additionalProperties.toMutableMap())
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
    fun validate(): BaseStrategyParams = apply {
        if (validated) {
            return@apply
        }

        endAt()
        startAt()
        urgency().ifPresent { it.validate() }
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
            (urgency.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BaseStrategyParams &&
            endAt == other.endAt &&
            startAt == other.startAt &&
            urgency == other.urgency &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(endAt, startAt, urgency, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BaseStrategyParams{endAt=$endAt, startAt=$startAt, urgency=$urgency, additionalProperties=$additionalProperties}"
}
