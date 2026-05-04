// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

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

/** Suggested actions payload content part. */
class ContentPartSuggestedActionsPayload
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val payload: JsonField<SuggestedActionsPayload>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("payload")
        @ExcludeMissing
        payload: JsonField<SuggestedActionsPayload> = JsonMissing.of()
    ) : this(payload, mutableMapOf())

    /**
     * Suggested follow-up buttons rendered at the end of an assistant message.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payload(): SuggestedActionsPayload = payload.getRequired("payload")

    /**
     * Returns the raw JSON value of [payload].
     *
     * Unlike [payload], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payload")
    @ExcludeMissing
    fun _payload(): JsonField<SuggestedActionsPayload> = payload

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
         * Returns a mutable builder for constructing an instance of
         * [ContentPartSuggestedActionsPayload].
         *
         * The following fields are required:
         * ```java
         * .payload()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContentPartSuggestedActionsPayload]. */
    class Builder internal constructor() {

        private var payload: JsonField<SuggestedActionsPayload>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contentPartSuggestedActionsPayload: ContentPartSuggestedActionsPayload) =
            apply {
                payload = contentPartSuggestedActionsPayload.payload
                additionalProperties =
                    contentPartSuggestedActionsPayload.additionalProperties.toMutableMap()
            }

        /** Suggested follow-up buttons rendered at the end of an assistant message. */
        fun payload(payload: SuggestedActionsPayload) = payload(JsonField.of(payload))

        /**
         * Sets [Builder.payload] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payload] with a well-typed [SuggestedActionsPayload]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun payload(payload: JsonField<SuggestedActionsPayload>) = apply { this.payload = payload }

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
         * Returns an immutable instance of [ContentPartSuggestedActionsPayload].
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
        fun build(): ContentPartSuggestedActionsPayload =
            ContentPartSuggestedActionsPayload(
                checkRequired("payload", payload),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContentPartSuggestedActionsPayload = apply {
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

        return other is ContentPartSuggestedActionsPayload &&
            payload == other.payload &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(payload, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContentPartSuggestedActionsPayload{payload=$payload, additionalProperties=$additionalProperties}"
}
