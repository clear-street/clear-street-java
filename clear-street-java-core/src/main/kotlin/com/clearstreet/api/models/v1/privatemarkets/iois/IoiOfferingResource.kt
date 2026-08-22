// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.iois

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects

/** Offering identity embedded in an IOI list item. */
class IoiOfferingResource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val headline: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("headline") @ExcludeMissing headline: JsonField<String> = JsonMissing.of(),
    ) : this(id, headline, mutableMapOf())

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun headline(): String = headline.getRequired("headline")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [headline].
     *
     * Unlike [headline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headline") @ExcludeMissing fun _headline(): JsonField<String> = headline

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
         * Returns a mutable builder for constructing an instance of [IoiOfferingResource].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .headline()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IoiOfferingResource]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var headline: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(ioiOfferingResource: IoiOfferingResource) = apply {
            id = ioiOfferingResource.id
            headline = ioiOfferingResource.headline
            additionalProperties = ioiOfferingResource.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun headline(headline: String) = headline(JsonField.of(headline))

        /**
         * Sets [Builder.headline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headline] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun headline(headline: JsonField<String>) = apply { this.headline = headline }

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
         * Returns an immutable instance of [IoiOfferingResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .headline()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): IoiOfferingResource =
            IoiOfferingResource(
                checkRequired("id", id),
                checkRequired("headline", headline),
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
    fun validate(): IoiOfferingResource = apply {
        if (validated) {
            return@apply
        }

        id()
        headline()
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
        (if (id.asKnown().isPresent) 1 else 0) + (if (headline.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IoiOfferingResource &&
            id == other.id &&
            headline == other.headline &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(id, headline, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IoiOfferingResource{id=$id, headline=$headline, additionalProperties=$additionalProperties}"
}
