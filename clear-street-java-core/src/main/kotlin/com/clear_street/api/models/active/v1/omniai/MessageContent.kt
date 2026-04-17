// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Message content containing text and structured action parts. */
class MessageContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val parts: JsonField<List<ContentPart>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("parts")
        @ExcludeMissing
        parts: JsonField<List<ContentPart>> = JsonMissing.of()
    ) : this(parts, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parts(): List<ContentPart> = parts.getRequired("parts")

    /**
     * Returns the raw JSON value of [parts].
     *
     * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parts") @ExcludeMissing fun _parts(): JsonField<List<ContentPart>> = parts

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
         * Returns a mutable builder for constructing an instance of [MessageContent].
         *
         * The following fields are required:
         * ```java
         * .parts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MessageContent]. */
    class Builder internal constructor() {

        private var parts: JsonField<MutableList<ContentPart>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageContent: MessageContent) = apply {
            parts = messageContent.parts.map { it.toMutableList() }
            additionalProperties = messageContent.additionalProperties.toMutableMap()
        }

        fun parts(parts: List<ContentPart>) = parts(JsonField.of(parts))

        /**
         * Sets [Builder.parts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parts] with a well-typed `List<ContentPart>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun parts(parts: JsonField<List<ContentPart>>) = apply {
            this.parts = parts.map { it.toMutableList() }
        }

        /**
         * Adds a single [ContentPart] to [parts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPart(part: ContentPart) = apply {
            parts =
                (parts ?: JsonField.of(mutableListOf())).also { checkKnown("parts", it).add(part) }
        }

        /** Alias for calling [addPart] with `ContentPart.ofText(text)`. */
        fun addPart(text: ContentPart.Text) = addPart(ContentPart.ofText(text))

        /** Alias for calling [addPart] with `ContentPart.ofStructuredAction(structuredAction)`. */
        fun addPart(structuredAction: ContentPart.StructuredAction) =
            addPart(ContentPart.ofStructuredAction(structuredAction))

        /** Alias for calling [addPart] with `ContentPart.ofThinking(thinking)`. */
        fun addPart(thinking: ContentPart.Thinking) = addPart(ContentPart.ofThinking(thinking))

        /** Alias for calling [addPart] with `ContentPart.ofChart(chart)`. */
        fun addPart(chart: ContentPart.Chart) = addPart(ContentPart.ofChart(chart))

        /** Alias for calling [addPart] with `ContentPart.ofSuggestedActions(suggestedActions)`. */
        fun addPart(suggestedActions: ContentPart.SuggestedActions) =
            addPart(ContentPart.ofSuggestedActions(suggestedActions))

        /** Alias for calling [addPart] with `ContentPart.ofType(type)`. */
        fun addPart(type: ContentPart.Type) = addPart(ContentPart.ofType(type))

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
         * Returns an immutable instance of [MessageContent].
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
        fun build(): MessageContent =
            MessageContent(
                checkRequired("parts", parts).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MessageContent = apply {
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

        return other is MessageContent &&
            parts == other.parts &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(parts, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MessageContent{parts=$parts, additionalProperties=$additionalProperties}"
}
