// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.clock

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

/** Current server time and market clock information */
class ClockDetail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clock: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clock") @ExcludeMissing clock: JsonField<OffsetDateTime> = JsonMissing.of()
    ) : this(clock, mutableMapOf())

    /**
     * Current server time in UTC
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clock(): OffsetDateTime = clock.getRequired("clock")

    /**
     * Returns the raw JSON value of [clock].
     *
     * Unlike [clock], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clock") @ExcludeMissing fun _clock(): JsonField<OffsetDateTime> = clock

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
         * Returns a mutable builder for constructing an instance of [ClockDetail].
         *
         * The following fields are required:
         * ```java
         * .clock()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ClockDetail]. */
    class Builder internal constructor() {

        private var clock: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(clockDetail: ClockDetail) = apply {
            clock = clockDetail.clock
            additionalProperties = clockDetail.additionalProperties.toMutableMap()
        }

        /** Current server time in UTC */
        fun clock(clock: OffsetDateTime) = clock(JsonField.of(clock))

        /**
         * Sets [Builder.clock] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clock] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clock(clock: JsonField<OffsetDateTime>) = apply { this.clock = clock }

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
         * Returns an immutable instance of [ClockDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .clock()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClockDetail =
            ClockDetail(checkRequired("clock", clock), additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ClockDetail = apply {
        if (validated) {
            return@apply
        }

        clock()
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
    @JvmSynthetic internal fun validity(): Int = (if (clock.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ClockDetail &&
            clock == other.clock &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(clock, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClockDetail{clock=$clock, additionalProperties=$additionalProperties}"
}
