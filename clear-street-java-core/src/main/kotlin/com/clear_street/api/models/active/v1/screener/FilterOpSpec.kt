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

/** Operator specification with optional behavioral arguments. */
class FilterOpSpec
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val name: JsonField<FilterOperator>,
    private val args: JsonField<List<OperatorArg>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing name: JsonField<FilterOperator> = JsonMissing.of(),
        @JsonProperty("args") @ExcludeMissing args: JsonField<List<OperatorArg>> = JsonMissing.of(),
    ) : this(name, args, mutableMapOf())

    /**
     * The operator to apply.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): FilterOperator = name.getRequired("name")

    /**
     * Optional arguments that modify operator behavior.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun args(): Optional<List<OperatorArg>> = args.getOptional("args")

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<FilterOperator> = name

    /**
     * Returns the raw JSON value of [args].
     *
     * Unlike [args], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<List<OperatorArg>> = args

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
         * Returns a mutable builder for constructing an instance of [FilterOpSpec].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FilterOpSpec]. */
    class Builder internal constructor() {

        private var name: JsonField<FilterOperator>? = null
        private var args: JsonField<MutableList<OperatorArg>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(filterOpSpec: FilterOpSpec) = apply {
            name = filterOpSpec.name
            args = filterOpSpec.args.map { it.toMutableList() }
            additionalProperties = filterOpSpec.additionalProperties.toMutableMap()
        }

        /** The operator to apply. */
        fun name(name: FilterOperator) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [FilterOperator] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun name(name: JsonField<FilterOperator>) = apply { this.name = name }

        /** Optional arguments that modify operator behavior. */
        fun args(args: List<OperatorArg>) = args(JsonField.of(args))

        /**
         * Sets [Builder.args] to an arbitrary JSON value.
         *
         * You should usually call [Builder.args] with a well-typed `List<OperatorArg>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun args(args: JsonField<List<OperatorArg>>) = apply {
            this.args = args.map { it.toMutableList() }
        }

        /**
         * Adds a single [OperatorArg] to [args].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addArg(arg: OperatorArg) = apply {
            args = (args ?: JsonField.of(mutableListOf())).also { checkKnown("args", it).add(arg) }
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
         * Returns an immutable instance of [FilterOpSpec].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FilterOpSpec =
            FilterOpSpec(
                checkRequired("name", name),
                (args ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FilterOpSpec = apply {
        if (validated) {
            return@apply
        }

        name().validate()
        args().ifPresent { it.forEach { it.validate() } }
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
        (name.asKnown().getOrNull()?.validity() ?: 0) +
            (args.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FilterOpSpec &&
            name == other.name &&
            args == other.args &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(name, args, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FilterOpSpec{name=$name, args=$args, additionalProperties=$additionalProperties}"
}
