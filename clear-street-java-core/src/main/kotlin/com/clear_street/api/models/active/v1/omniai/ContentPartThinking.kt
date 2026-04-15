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

class ContentPartThinking
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val thoughts: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("thoughts")
        @ExcludeMissing
        thoughts: JsonField<List<String>> = JsonMissing.of()
    ) : this(thoughts, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun thoughts(): List<String> = thoughts.getRequired("thoughts")

    /**
     * Returns the raw JSON value of [thoughts].
     *
     * Unlike [thoughts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("thoughts") @ExcludeMissing fun _thoughts(): JsonField<List<String>> = thoughts

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
         * Returns a mutable builder for constructing an instance of [ContentPartThinking].
         *
         * The following fields are required:
         * ```java
         * .thoughts()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContentPartThinking]. */
    class Builder internal constructor() {

        private var thoughts: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contentPartThinking: ContentPartThinking) = apply {
            thoughts = contentPartThinking.thoughts.map { it.toMutableList() }
            additionalProperties = contentPartThinking.additionalProperties.toMutableMap()
        }

        fun thoughts(thoughts: List<String>) = thoughts(JsonField.of(thoughts))

        /**
         * Sets [Builder.thoughts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thoughts] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thoughts(thoughts: JsonField<List<String>>) = apply {
            this.thoughts = thoughts.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [thoughts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addThought(thought: String) = apply {
            thoughts =
                (thoughts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("thoughts", it).add(thought)
                }
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
         * Returns an immutable instance of [ContentPartThinking].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .thoughts()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContentPartThinking =
            ContentPartThinking(
                checkRequired("thoughts", thoughts).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ContentPartThinking = apply {
        if (validated) {
            return@apply
        }

        thoughts()
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
    @JvmSynthetic internal fun validity(): Int = (thoughts.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContentPartThinking &&
            thoughts == other.thoughts &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(thoughts, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContentPartThinking{thoughts=$thoughts, additionalProperties=$additionalProperties}"
}
