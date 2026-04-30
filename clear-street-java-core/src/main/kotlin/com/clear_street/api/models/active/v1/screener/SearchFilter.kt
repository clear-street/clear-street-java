// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.screener

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * A single filter condition.
 *
 * When `op` and `right` are both absent, the filter is "unenabled": it persists a `left` field
 * reference without applying any predicate. Unenabled filters are skipped during search execution
 * but still round-trip through save/load so callers can preserve draft state.
 */
class SearchFilter
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val left: JsonField<FieldRef>,
    private val op: JsonField<FilterOpSpec>,
    private val right: JsonField<List<FilterValue>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("left") @ExcludeMissing left: JsonField<FieldRef> = JsonMissing.of(),
        @JsonProperty("op") @ExcludeMissing op: JsonField<FilterOpSpec> = JsonMissing.of(),
        @JsonProperty("right")
        @ExcludeMissing
        right: JsonField<List<FilterValue>> = JsonMissing.of(),
    ) : this(left, op, right, mutableMapOf())

    /**
     * The field to filter on.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun left(): FieldRef = left.getRequired("left")

    /**
     * The operator and optional arguments. Omit together with `right` for an unenabled filter.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun op(): Optional<FilterOpSpec> = op.getOptional("op")

    /**
     * The value(s) to compare against. Omit together with `op` for an unenabled filter.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun right(): Optional<List<FilterValue>> = right.getOptional("right")

    /**
     * Returns the raw JSON value of [left].
     *
     * Unlike [left], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("left") @ExcludeMissing fun _left(): JsonField<FieldRef> = left

    /**
     * Returns the raw JSON value of [op].
     *
     * Unlike [op], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("op") @ExcludeMissing fun _op(): JsonField<FilterOpSpec> = op

    /**
     * Returns the raw JSON value of [right].
     *
     * Unlike [right], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("right") @ExcludeMissing fun _right(): JsonField<List<FilterValue>> = right

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
         * Returns a mutable builder for constructing an instance of [SearchFilter].
         *
         * The following fields are required:
         * ```java
         * .left()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SearchFilter]. */
    class Builder internal constructor() {

        private var left: JsonField<FieldRef>? = null
        private var op: JsonField<FilterOpSpec> = JsonMissing.of()
        private var right: JsonField<MutableList<FilterValue>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(searchFilter: SearchFilter) = apply {
            left = searchFilter.left
            op = searchFilter.op
            right = searchFilter.right.map { it.toMutableList() }
            additionalProperties = searchFilter.additionalProperties.toMutableMap()
        }

        /** The field to filter on. */
        fun left(left: FieldRef) = left(JsonField.of(left))

        /**
         * Sets [Builder.left] to an arbitrary JSON value.
         *
         * You should usually call [Builder.left] with a well-typed [FieldRef] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun left(left: JsonField<FieldRef>) = apply { this.left = left }

        /**
         * The operator and optional arguments. Omit together with `right` for an unenabled filter.
         */
        fun op(op: FilterOpSpec?) = op(JsonField.ofNullable(op))

        /** Alias for calling [Builder.op] with `op.orElse(null)`. */
        fun op(op: Optional<FilterOpSpec>) = op(op.getOrNull())

        /**
         * Sets [Builder.op] to an arbitrary JSON value.
         *
         * You should usually call [Builder.op] with a well-typed [FilterOpSpec] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun op(op: JsonField<FilterOpSpec>) = apply { this.op = op }

        /** The value(s) to compare against. Omit together with `op` for an unenabled filter. */
        fun right(right: List<FilterValue>?) = right(JsonField.ofNullable(right))

        /** Alias for calling [Builder.right] with `right.orElse(null)`. */
        fun right(right: Optional<List<FilterValue>>) = right(right.getOrNull())

        /**
         * Sets [Builder.right] to an arbitrary JSON value.
         *
         * You should usually call [Builder.right] with a well-typed `List<FilterValue>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun right(right: JsonField<List<FilterValue>>) = apply {
            this.right = right.map { it.toMutableList() }
        }

        /**
         * Adds a single [FilterValue] to [Builder.right].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRight(right: FilterValue) = apply {
            this.right =
                (this.right ?: JsonField.of(mutableListOf())).also {
                    checkKnown("right", it).add(right)
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
         * Returns an immutable instance of [SearchFilter].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .left()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SearchFilter =
            SearchFilter(
                checkRequired("left", left),
                op,
                (right ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SearchFilter = apply {
        if (validated) {
            return@apply
        }

        left().validate()
        op().ifPresent { it.validate() }
        right().ifPresent { it.forEach { it.validate() } }
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
        (left.asKnown().getOrNull()?.validity() ?: 0) +
            (op.asKnown().getOrNull()?.validity() ?: 0) +
            (right.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SearchFilter &&
            left == other.left &&
            op == other.op &&
            right == other.right &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(left, op, right, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SearchFilter{left=$left, op=$op, right=$right, additionalProperties=$additionalProperties}"
}
