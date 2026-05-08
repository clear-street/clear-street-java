// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai.threads

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

/** Finalized immutable message content container. Never includes thinking parts. */
class MessageContent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val parts: JsonField<List<MessageContentPart>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("parts")
        @ExcludeMissing
        parts: JsonField<List<MessageContentPart>> = JsonMissing.of()
    ) : this(parts, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parts(): List<MessageContentPart> = parts.getRequired("parts")

    /**
     * Returns the raw JSON value of [parts].
     *
     * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parts") @ExcludeMissing fun _parts(): JsonField<List<MessageContentPart>> = parts

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

        private var parts: JsonField<MutableList<MessageContentPart>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(messageContent: MessageContent) = apply {
            parts = messageContent.parts.map { it.toMutableList() }
            additionalProperties = messageContent.additionalProperties.toMutableMap()
        }

        fun parts(parts: List<MessageContentPart>) = parts(JsonField.of(parts))

        /**
         * Sets [Builder.parts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parts] with a well-typed `List<MessageContentPart>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun parts(parts: JsonField<List<MessageContentPart>>) = apply {
            this.parts = parts.map { it.toMutableList() }
        }

        /**
         * Adds a single [MessageContentPart] to [parts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPart(part: MessageContentPart) = apply {
            parts =
                (parts ?: JsonField.of(mutableListOf())).also { checkKnown("parts", it).add(part) }
        }

        /** Alias for calling [addPart] with `MessageContentPart.ofUnionMember0(unionMember0)`. */
        fun addPart(unionMember0: MessageContentPart.UnionMember0) =
            addPart(MessageContentPart.ofUnionMember0(unionMember0))

        /** Alias for calling [addPart] with `MessageContentPart.ofUnionMember1(unionMember1)`. */
        fun addPart(unionMember1: MessageContentPart.UnionMember1) =
            addPart(MessageContentPart.ofUnionMember1(unionMember1))

        /** Alias for calling [addPart] with `MessageContentPart.ofUnionMember2(unionMember2)`. */
        fun addPart(unionMember2: MessageContentPart.UnionMember2) =
            addPart(MessageContentPart.ofUnionMember2(unionMember2))

        /** Alias for calling [addPart] with `MessageContentPart.ofUnionMember3(unionMember3)`. */
        fun addPart(unionMember3: MessageContentPart.UnionMember3) =
            addPart(MessageContentPart.ofUnionMember3(unionMember3))

        /** Alias for calling [addPart] with `MessageContentPart.ofUnionMember4(unionMember4)`. */
        fun addPart(unionMember4: MessageContentPart.UnionMember4) =
            addPart(MessageContentPart.ofUnionMember4(unionMember4))

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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws ClearStreetInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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
