// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.omniai.responses

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

/** Dynamic response content container. May include thinking parts. */
class ResponseContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val parts: JsonField<List<ResponseContentPart>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("parts")
        @ExcludeMissing
        parts: JsonField<List<ResponseContentPart>> = JsonMissing.of()
    ) : this(parts, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parts(): List<ResponseContentPart> = parts.getRequired("parts")

    /**
     * Returns the raw JSON value of [parts].
     *
     * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parts")
    @ExcludeMissing
    fun _parts(): JsonField<List<ResponseContentPart>> = parts

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
         * Returns a mutable builder for constructing an instance of [ResponseContent].
         *
         * The following fields are required:
         * ```java
         * .parts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ResponseContent]. */
    class Builder internal constructor() {

        private var parts: JsonField<MutableList<ResponseContentPart>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(responseContent: ResponseContent) = apply {
            parts = responseContent.parts.map { it.toMutableList() }
            additionalProperties = responseContent.additionalProperties.toMutableMap()
        }

        fun parts(parts: List<ResponseContentPart>) = parts(JsonField.of(parts))

        /**
         * Sets [Builder.parts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parts] with a well-typed `List<ResponseContentPart>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun parts(parts: JsonField<List<ResponseContentPart>>) = apply {
            this.parts = parts.map { it.toMutableList() }
        }

        /**
         * Adds a single [ResponseContentPart] to [parts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPart(part: ResponseContentPart) = apply {
            parts =
                (parts ?: JsonField.of(mutableListOf())).also { checkKnown("parts", it).add(part) }
        }

        /**
         * Alias for calling [addPart] with
         * `ResponseContentPart.ofContentPartText(contentPartText)`.
         */
        fun addPart(contentPartText: ResponseContentPart.ContentPartText) =
            addPart(ResponseContentPart.ofContentPartText(contentPartText))

        /**
         * Alias for calling [addPart] with
         * `ResponseContentPart.ofContentPartThinking(contentPartThinking)`.
         */
        fun addPart(contentPartThinking: ResponseContentPart.ContentPartThinking) =
            addPart(ResponseContentPart.ofContentPartThinking(contentPartThinking))

        /**
         * Alias for calling [addPart] with
         * `ResponseContentPart.ofContentPartStructuredAction(contentPartStructuredAction)`.
         */
        fun addPart(contentPartStructuredAction: ResponseContentPart.ContentPartStructuredAction) =
            addPart(ResponseContentPart.ofContentPartStructuredAction(contentPartStructuredAction))

        /**
         * Alias for calling [addPart] with
         * `ResponseContentPart.ofContentPartChart(contentPartChart)`.
         */
        fun addPart(contentPartChart: ResponseContentPart.ContentPartChart) =
            addPart(ResponseContentPart.ofContentPartChart(contentPartChart))

        /**
         * Alias for calling [addPart] with
         * `ResponseContentPart.ofContentPartSuggestedActions(contentPartSuggestedActions)`.
         */
        fun addPart(contentPartSuggestedActions: ResponseContentPart.ContentPartSuggestedActions) =
            addPart(ResponseContentPart.ofContentPartSuggestedActions(contentPartSuggestedActions))

        /**
         * Alias for calling [addPart] with
         * `ResponseContentPart.ofContentPartCustom(contentPartCustom)`.
         */
        fun addPart(contentPartCustom: ResponseContentPart.ContentPartCustom) =
            addPart(ResponseContentPart.ofContentPartCustom(contentPartCustom))

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
         * Returns an immutable instance of [ResponseContent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .parts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ResponseContent =
            ResponseContent(
                checkRequired("parts", parts).map { it.toImmutable() },
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
    fun validate(): ResponseContent = apply {
        if (validated) {
            return@apply
        }

        parts().forEach { it.validate() }
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
        (parts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ResponseContent &&
            parts == other.parts &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(parts, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ResponseContent{parts=$parts, additionalProperties=$additionalProperties}"
}
