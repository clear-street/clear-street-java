// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.orders

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

/** Before/after values for one metric, as if the previewed order fully filled. */
class OrderPreviewDelta
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val after: JsonField<String>,
    private val before: JsonField<String>,
    private val change: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("after") @ExcludeMissing after: JsonField<String> = JsonMissing.of(),
        @JsonProperty("before") @ExcludeMissing before: JsonField<String> = JsonMissing.of(),
        @JsonProperty("change") @ExcludeMissing change: JsonField<String> = JsonMissing.of(),
    ) : this(after, before, change, mutableMapOf())

    /**
     * The value with the previewed order also fully filled.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun after(): String = after.getRequired("after")

    /**
     * The value before the order, as the risk engine evaluates it: the account's open orders are
     * projected as filled.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun before(): String = before.getRequired("before")

    /**
     * The previewed order's isolated impact: `after - before`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun change(): String = change.getRequired("change")

    /**
     * Returns the raw JSON value of [after].
     *
     * Unlike [after], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("after") @ExcludeMissing fun _after(): JsonField<String> = after

    /**
     * Returns the raw JSON value of [before].
     *
     * Unlike [before], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("before") @ExcludeMissing fun _before(): JsonField<String> = before

    /**
     * Returns the raw JSON value of [change].
     *
     * Unlike [change], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("change") @ExcludeMissing fun _change(): JsonField<String> = change

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
         * Returns a mutable builder for constructing an instance of [OrderPreviewDelta].
         *
         * The following fields are required:
         * ```java
         * .after()
         * .before()
         * .change()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrderPreviewDelta]. */
    class Builder internal constructor() {

        private var after: JsonField<String>? = null
        private var before: JsonField<String>? = null
        private var change: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(orderPreviewDelta: OrderPreviewDelta) = apply {
            after = orderPreviewDelta.after
            before = orderPreviewDelta.before
            change = orderPreviewDelta.change
            additionalProperties = orderPreviewDelta.additionalProperties.toMutableMap()
        }

        /** The value with the previewed order also fully filled. */
        fun after(after: String) = after(JsonField.of(after))

        /**
         * Sets [Builder.after] to an arbitrary JSON value.
         *
         * You should usually call [Builder.after] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun after(after: JsonField<String>) = apply { this.after = after }

        /**
         * The value before the order, as the risk engine evaluates it: the account's open orders
         * are projected as filled.
         */
        fun before(before: String) = before(JsonField.of(before))

        /**
         * Sets [Builder.before] to an arbitrary JSON value.
         *
         * You should usually call [Builder.before] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun before(before: JsonField<String>) = apply { this.before = before }

        /** The previewed order's isolated impact: `after - before`. */
        fun change(change: String) = change(JsonField.of(change))

        /**
         * Sets [Builder.change] to an arbitrary JSON value.
         *
         * You should usually call [Builder.change] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun change(change: JsonField<String>) = apply { this.change = change }

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
         * Returns an immutable instance of [OrderPreviewDelta].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .after()
         * .before()
         * .change()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrderPreviewDelta =
            OrderPreviewDelta(
                checkRequired("after", after),
                checkRequired("before", before),
                checkRequired("change", change),
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
    fun validate(): OrderPreviewDelta = apply {
        if (validated) {
            return@apply
        }

        after()
        before()
        change()
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
        (if (after.asKnown().isPresent) 1 else 0) +
            (if (before.asKnown().isPresent) 1 else 0) +
            (if (change.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderPreviewDelta &&
            after == other.after &&
            before == other.before &&
            change == other.change &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(after, before, change, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OrderPreviewDelta{after=$after, before=$before, change=$change, additionalProperties=$additionalProperties}"
}
