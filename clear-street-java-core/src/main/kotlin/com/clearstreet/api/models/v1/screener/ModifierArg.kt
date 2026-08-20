// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.screener

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
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** One positional `modifier.args` slot. */
class ModifierArg
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val kind: JsonField<String>,
    private val note: JsonField<String>,
    private val position: JsonField<Int>,
    private val required: JsonField<Boolean>,
    private val default_: JsonField<String>,
    private val ref: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("kind") @ExcludeMissing kind: JsonField<String> = JsonMissing.of(),
        @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
        @JsonProperty("position") @ExcludeMissing position: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("required") @ExcludeMissing required: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("default") @ExcludeMissing default_: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ref") @ExcludeMissing ref: JsonField<String> = JsonMissing.of(),
    ) : this(kind, note, position, required, default_, ref, mutableMapOf())

    /**
     * `"NUMBER"` or `"ENUM"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kind(): String = kind.getRequired("kind")

    /**
     * The arg's meaning and constraints.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun note(): String = note.getRequired("note")

    /**
     * Zero-based position in the `args` array.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun position(): Int = position.getRequired("position")

    /**
     * Whether the arg must be present in every modifier use.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun required(): Boolean = required.getRequired("required")

    /**
     * For optional args: the value used when the arg is omitted.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun default_(): Optional<String> = default_.getOptional("default")

    /**
     * For `"ENUM"` args: the `enums` list the value must be a member of.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ref(): Optional<String> = ref.getOptional("ref")

    /**
     * Returns the raw JSON value of [kind].
     *
     * Unlike [kind], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kind") @ExcludeMissing fun _kind(): JsonField<String> = kind

    /**
     * Returns the raw JSON value of [note].
     *
     * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

    /**
     * Returns the raw JSON value of [position].
     *
     * Unlike [position], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("position") @ExcludeMissing fun _position(): JsonField<Int> = position

    /**
     * Returns the raw JSON value of [required].
     *
     * Unlike [required], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("required") @ExcludeMissing fun _required(): JsonField<Boolean> = required

    /**
     * Returns the raw JSON value of [default_].
     *
     * Unlike [default_], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("default") @ExcludeMissing fun _default_(): JsonField<String> = default_

    /**
     * Returns the raw JSON value of [ref].
     *
     * Unlike [ref], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ref") @ExcludeMissing fun _ref(): JsonField<String> = ref

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
         * Returns a mutable builder for constructing an instance of [ModifierArg].
         *
         * The following fields are required:
         * ```java
         * .kind()
         * .note()
         * .position()
         * .required()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ModifierArg]. */
    class Builder internal constructor() {

        private var kind: JsonField<String>? = null
        private var note: JsonField<String>? = null
        private var position: JsonField<Int>? = null
        private var required: JsonField<Boolean>? = null
        private var default_: JsonField<String> = JsonMissing.of()
        private var ref: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(modifierArg: ModifierArg) = apply {
            kind = modifierArg.kind
            note = modifierArg.note
            position = modifierArg.position
            required = modifierArg.required
            default_ = modifierArg.default_
            ref = modifierArg.ref
            additionalProperties = modifierArg.additionalProperties.toMutableMap()
        }

        /** `"NUMBER"` or `"ENUM"`. */
        fun kind(kind: String) = kind(JsonField.of(kind))

        /**
         * Sets [Builder.kind] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kind] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kind(kind: JsonField<String>) = apply { this.kind = kind }

        /** The arg's meaning and constraints. */
        fun note(note: String) = note(JsonField.of(note))

        /**
         * Sets [Builder.note] to an arbitrary JSON value.
         *
         * You should usually call [Builder.note] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun note(note: JsonField<String>) = apply { this.note = note }

        /** Zero-based position in the `args` array. */
        fun position(position: Int) = position(JsonField.of(position))

        /**
         * Sets [Builder.position] to an arbitrary JSON value.
         *
         * You should usually call [Builder.position] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun position(position: JsonField<Int>) = apply { this.position = position }

        /** Whether the arg must be present in every modifier use. */
        fun required(required: Boolean) = required(JsonField.of(required))

        /**
         * Sets [Builder.required] to an arbitrary JSON value.
         *
         * You should usually call [Builder.required] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun required(required: JsonField<Boolean>) = apply { this.required = required }

        /** For optional args: the value used when the arg is omitted. */
        fun default_(default_: String?) = default_(JsonField.ofNullable(default_))

        /** Alias for calling [Builder.default_] with `default_.orElse(null)`. */
        fun default_(default_: Optional<String>) = default_(default_.getOrNull())

        /**
         * Sets [Builder.default_] to an arbitrary JSON value.
         *
         * You should usually call [Builder.default_] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun default_(default_: JsonField<String>) = apply { this.default_ = default_ }

        /** For `"ENUM"` args: the `enums` list the value must be a member of. */
        fun ref(ref: String?) = ref(JsonField.ofNullable(ref))

        /** Alias for calling [Builder.ref] with `ref.orElse(null)`. */
        fun ref(ref: Optional<String>) = ref(ref.getOrNull())

        /**
         * Sets [Builder.ref] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ref] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ref(ref: JsonField<String>) = apply { this.ref = ref }

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
         * Returns an immutable instance of [ModifierArg].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .kind()
         * .note()
         * .position()
         * .required()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ModifierArg =
            ModifierArg(
                checkRequired("kind", kind),
                checkRequired("note", note),
                checkRequired("position", position),
                checkRequired("required", required),
                default_,
                ref,
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
    fun validate(): ModifierArg = apply {
        if (validated) {
            return@apply
        }

        kind()
        note()
        position()
        required()
        default_()
        ref()
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
        (if (kind.asKnown().isPresent) 1 else 0) +
            (if (note.asKnown().isPresent) 1 else 0) +
            (if (position.asKnown().isPresent) 1 else 0) +
            (if (required.asKnown().isPresent) 1 else 0) +
            (if (default_.asKnown().isPresent) 1 else 0) +
            (if (ref.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ModifierArg &&
            kind == other.kind &&
            note == other.note &&
            position == other.position &&
            required == other.required &&
            default_ == other.default_ &&
            ref == other.ref &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(kind, note, position, required, default_, ref, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ModifierArg{kind=$kind, note=$note, position=$position, required=$required, default_=$default_, ref=$ref, additionalProperties=$additionalProperties}"
}
