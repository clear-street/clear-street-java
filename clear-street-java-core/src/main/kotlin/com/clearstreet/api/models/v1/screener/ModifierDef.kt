// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

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

/** A modifier operation and the positional `args` each context accepts. */
class ModifierDef
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val args: JsonField<List<ModifierArg>>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("args") @ExcludeMissing args: JsonField<List<ModifierArg>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(args, name, mutableMapOf())

    /**
     * The positional `args` slots, in order.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun args(): List<ModifierArg> = args.getRequired("args")

    /**
     * The modifier operation name: one of `"ADD"` or `"SUBTRACT"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Returns the raw JSON value of [args].
     *
     * Unlike [args], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("args") @ExcludeMissing fun _args(): JsonField<List<ModifierArg>> = args

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
         * Returns a mutable builder for constructing an instance of [ModifierDef].
         *
         * The following fields are required:
         * ```java
         * .args()
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModifierDef]. */
    class Builder internal constructor() {

        private var args: JsonField<MutableList<ModifierArg>>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modifierDef: ModifierDef) = apply {
            args = modifierDef.args.map { it.toMutableList() }
            name = modifierDef.name
            additionalProperties = modifierDef.additionalProperties.toMutableMap()
        }

        /** The positional `args` slots, in order. */
        fun args(args: List<ModifierArg>) = args(JsonField.of(args))

        /**
         * Sets [Builder.args] to an arbitrary JSON value.
         *
         * You should usually call [Builder.args] with a well-typed `List<ModifierArg>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun args(args: JsonField<List<ModifierArg>>) = apply {
            this.args = args.map { it.toMutableList() }
        }

        /**
         * Adds a single [ModifierArg] to [args].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addArg(arg: ModifierArg) = apply {
            args = (args ?: JsonField.of(mutableListOf())).also { checkKnown("args", it).add(arg) }
        }

        /** The modifier operation name: one of `"ADD"` or `"SUBTRACT"`. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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
         * Returns an immutable instance of [ModifierDef].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .args()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModifierDef =
            ModifierDef(
                checkRequired("args", args).map { it.toImmutable() },
                checkRequired("name", name),
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
    fun validate(): ModifierDef = apply {
        if (validated) {
            return@apply
        }

        args().forEach { it.validate() }
        name()
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
        (args.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModifierDef &&
            args == other.args &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(args, name, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModifierDef{args=$args, name=$name, additionalProperties=$additionalProperties}"
}
