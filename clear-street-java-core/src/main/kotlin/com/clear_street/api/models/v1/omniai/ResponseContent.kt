// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

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

        /** Alias for calling [addPart] with `ResponseContentPart.ofUnionMember0(unionMember0)`. */
        fun addPart(unionMember0: ResponseContentPart.UnionMember0) =
            addPart(ResponseContentPart.ofUnionMember0(unionMember0))

        /** Alias for calling [addPart] with `ResponseContentPart.ofUnionMember1(unionMember1)`. */
        fun addPart(unionMember1: ResponseContentPart.UnionMember1) =
            addPart(ResponseContentPart.ofUnionMember1(unionMember1))

        /** Alias for calling [addPart] with `ResponseContentPart.ofUnionMember2(unionMember2)`. */
        fun addPart(unionMember2: ResponseContentPart.UnionMember2) =
            addPart(ResponseContentPart.ofUnionMember2(unionMember2))

        /** Alias for calling [addPart] with `ResponseContentPart.ofUnionMember3(unionMember3)`. */
        fun addPart(unionMember3: ResponseContentPart.UnionMember3) =
            addPart(ResponseContentPart.ofUnionMember3(unionMember3))

        /** Alias for calling [addPart] with `ResponseContentPart.ofUnionMember4(unionMember4)`. */
        fun addPart(unionMember4: ResponseContentPart.UnionMember4) =
            addPart(ResponseContentPart.ofUnionMember4(unionMember4))

        /** Alias for calling [addPart] with `ResponseContentPart.ofUnionMember5(unionMember5)`. */
        fun addPart(unionMember5: ResponseContentPart.UnionMember5) =
            addPart(ResponseContentPart.ofUnionMember5(unionMember5))

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
