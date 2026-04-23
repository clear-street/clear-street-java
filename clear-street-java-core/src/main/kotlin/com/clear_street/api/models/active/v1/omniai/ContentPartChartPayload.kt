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
import kotlin.jvm.optionals.getOrNull

/** Chart payload content part. */
class ContentPartChartPayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val payload: JsonField<ChartPayload>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("payload") @ExcludeMissing payload: JsonField<ChartPayload> = JsonMissing.of()
    ) : this(payload, mutableMapOf())

    /**
     * Typed chart payload rendered inline in assistant content.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payload(): ChartPayload = payload.getRequired("payload")

    /**
     * Returns the raw JSON value of [payload].
     *
     * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payload") @ExcludeMissing fun _payload(): JsonField<ChartPayload> = payload

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
         * Returns a mutable builder for constructing an instance of [ContentPartChartPayload].
         *
         * The following fields are required:
         * ```java
         * .payload()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContentPartChartPayload]. */
    class Builder internal constructor() {

        private var payload: JsonField<ChartPayload>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contentPartChartPayload: ContentPartChartPayload) = apply {
            payload = contentPartChartPayload.payload
            additionalProperties = contentPartChartPayload.additionalProperties.toMutableMap()
        }

        /** Typed chart payload rendered inline in assistant content. */
        fun payload(payload: ChartPayload) = payload(JsonField.of(payload))

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [ChartPayload] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payload(payload: JsonField<ChartPayload>) = apply { this.payload = payload }

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
         * Returns an immutable instance of [ContentPartChartPayload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .payload()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContentPartChartPayload =
            ContentPartChartPayload(
                checkRequired("payload", payload),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContentPartChartPayload = apply {
        if (validated) {
            return@apply
        }

        payload().validate()
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
    @JvmSynthetic internal fun validity(): Int = (payload.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContentPartChartPayload &&
            payload == other.payload &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(payload, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContentPartChartPayload{payload=$payload, additionalProperties=$additionalProperties}"
}
