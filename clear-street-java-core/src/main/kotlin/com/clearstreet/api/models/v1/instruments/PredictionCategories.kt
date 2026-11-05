// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.instruments

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

/** Categories of the prediction market contracts that can currently be listed. */
class PredictionCategories
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val categories: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<List<String>> = JsonMissing.of()
    ) : this(categories, mutableMapOf())

    /**
     * Distinct categories, sorted alphabetically.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun categories(): List<String> = categories.getRequired("categories")

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<List<String>> = categories

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
         * Returns a mutable builder for constructing an instance of [PredictionCategories].
         *
         * The following fields are required:
         * ```java
         * .categories()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PredictionCategories]. */
    class Builder internal constructor() {

        private var categories: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(predictionCategories: PredictionCategories) = apply {
            categories = predictionCategories.categories.map { it.toMutableList() }
            additionalProperties = predictionCategories.additionalProperties.toMutableMap()
        }

        /** Distinct categories, sorted alphabetically. */
        fun categories(categories: List<String>) = categories(JsonField.of(categories))

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun categories(categories: JsonField<List<String>>) = apply {
            this.categories = categories.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [categories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCategory(category: String) = apply {
            categories =
                (categories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("categories", it).add(category)
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
         * Returns an immutable instance of [PredictionCategories].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .categories()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PredictionCategories =
            PredictionCategories(
                checkRequired("categories", categories).map { it.toImmutable() },
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
    fun validate(): PredictionCategories = apply {
        if (validated) {
            return@apply
        }

        categories()
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
    @JvmSynthetic internal fun validity(): Int = (categories.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PredictionCategories &&
            categories == other.categories &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(categories, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PredictionCategories{categories=$categories, additionalProperties=$additionalProperties}"
}
