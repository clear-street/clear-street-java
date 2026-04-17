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

class CancelResponsePayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val canceled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("canceled") @ExcludeMissing canceled: JsonField<Boolean> = JsonMissing.of()
    ) : this(canceled, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun canceled(): Boolean = canceled.getRequired("canceled")

    /**
     * Returns the raw JSON value of [canceled].
     *
     * Unlike [canceled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("canceled") @ExcludeMissing fun _canceled(): JsonField<Boolean> = canceled

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
         * Returns a mutable builder for constructing an instance of [CancelResponsePayload].
         *
         * The following fields are required:
         * ```java
         * .canceled()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CancelResponsePayload]. */
    class Builder internal constructor() {

        private var canceled: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cancelResponsePayload: CancelResponsePayload) = apply {
            canceled = cancelResponsePayload.canceled
            additionalProperties = cancelResponsePayload.additionalProperties.toMutableMap()
        }

        fun canceled(canceled: Boolean) = canceled(JsonField.of(canceled))

        /**
         * Sets [Builder.canceled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canceled] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun canceled(canceled: JsonField<Boolean>) = apply { this.canceled = canceled }

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
         * Returns an immutable instance of [CancelResponsePayload].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .canceled()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CancelResponsePayload =
            CancelResponsePayload(
                checkRequired("canceled", canceled),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CancelResponsePayload = apply {
        if (validated) {
            return@apply
        }

        canceled()
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
    @JvmSynthetic internal fun validity(): Int = (if (canceled.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CancelResponsePayload &&
            canceled == other.canceled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(canceled, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CancelResponsePayload{canceled=$canceled, additionalProperties=$additionalProperties}"
}
