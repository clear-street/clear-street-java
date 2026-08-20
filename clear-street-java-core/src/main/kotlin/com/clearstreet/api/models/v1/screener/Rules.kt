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

/** Request-side semantics: how to turn the catalog data into a valid `POST /screener` call. */
class Rules
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val apiNameComposition: JsonField<String>,
    private val axes: JsonField<String>,
    private val defaults: JsonField<String>,
    private val modifiers: JsonField<String>,
    private val operators: JsonField<String>,
    private val variables: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("api_name_composition")
        @ExcludeMissing
        apiNameComposition: JsonField<String> = JsonMissing.of(),
        @JsonProperty("axes") @ExcludeMissing axes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("defaults") @ExcludeMissing defaults: JsonField<String> = JsonMissing.of(),
        @JsonProperty("modifiers") @ExcludeMissing modifiers: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operators") @ExcludeMissing operators: JsonField<String> = JsonMissing.of(),
        @JsonProperty("variables") @ExcludeMissing variables: JsonField<String> = JsonMissing.of(),
    ) : this(apiNameComposition, axes, defaults, modifiers, operators, variables, mutableMapOf())

    /**
     * Requests and response `field` objects use the same reference shape: base name plus at most
     * one of `period` / `lookback`; `default_response_fields` (the POST default column set when
     * `columns` is omitted) carries api_names, each decoding via `suffixes`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun apiNameComposition(): String = apiNameComposition.getRequired("api_name_composition")

    /**
     * At most one of `period` / `lookback`; the empty combination selects the field's current or
     * most recent value.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun axes(): String = axes.getRequired("axes")

    /**
     * Omitting both is always valid; it resolves to the field's current or most recent value when
     * the kind offers it, otherwise to `default_combination`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaults(): String = defaults.getRequired("defaults")

    /**
     * Where `modifier` is legal, its `args` forms, and unit semantics.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modifiers(): String = modifiers.getRequired("modifiers")

    /**
     * Filter operator value counts for the `right` array.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operators(): String = operators.getRequired("operators")

    /**
     * Built-in variables and field references in `right[].variable`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun variables(): String = variables.getRequired("variables")

    /**
     * Returns the raw JSON value of [apiNameComposition].
     *
     * Unlike [apiNameComposition], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("api_name_composition")
    @ExcludeMissing
    fun _apiNameComposition(): JsonField<String> = apiNameComposition

    /**
     * Returns the raw JSON value of [axes].
     *
     * Unlike [axes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("axes") @ExcludeMissing fun _axes(): JsonField<String> = axes

    /**
     * Returns the raw JSON value of [defaults].
     *
     * Unlike [defaults], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("defaults") @ExcludeMissing fun _defaults(): JsonField<String> = defaults

    /**
     * Returns the raw JSON value of [modifiers].
     *
     * Unlike [modifiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modifiers") @ExcludeMissing fun _modifiers(): JsonField<String> = modifiers

    /**
     * Returns the raw JSON value of [operators].
     *
     * Unlike [operators], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operators") @ExcludeMissing fun _operators(): JsonField<String> = operators

    /**
     * Returns the raw JSON value of [variables].
     *
     * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variables") @ExcludeMissing fun _variables(): JsonField<String> = variables

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
         * Returns a mutable builder for constructing an instance of [Rules].
         *
         * The following fields are required:
         * ```java
         * .apiNameComposition()
         * .axes()
         * .defaults()
         * .modifiers()
         * .operators()
         * .variables()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Rules]. */
    class Builder internal constructor() {

        private var apiNameComposition: JsonField<String>? = null
        private var axes: JsonField<String>? = null
        private var defaults: JsonField<String>? = null
        private var modifiers: JsonField<String>? = null
        private var operators: JsonField<String>? = null
        private var variables: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(rules: Rules) = apply {
            apiNameComposition = rules.apiNameComposition
            axes = rules.axes
            defaults = rules.defaults
            modifiers = rules.modifiers
            operators = rules.operators
            variables = rules.variables
            additionalProperties = rules.additionalProperties.toMutableMap()
        }

        /**
         * Requests and response `field` objects use the same reference shape: base name plus at
         * most one of `period` / `lookback`; `default_response_fields` (the POST default column set
         * when `columns` is omitted) carries api_names, each decoding via `suffixes`.
         */
        fun apiNameComposition(apiNameComposition: String) =
            apiNameComposition(JsonField.of(apiNameComposition))

        /**
         * Sets [Builder.apiNameComposition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.apiNameComposition] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun apiNameComposition(apiNameComposition: JsonField<String>) = apply {
            this.apiNameComposition = apiNameComposition
        }

        /**
         * At most one of `period` / `lookback`; the empty combination selects the field's current
         * or most recent value.
         */
        fun axes(axes: String) = axes(JsonField.of(axes))

        /**
         * Sets [Builder.axes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.axes] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun axes(axes: JsonField<String>) = apply { this.axes = axes }

        /**
         * Omitting both is always valid; it resolves to the field's current or most recent value
         * when the kind offers it, otherwise to `default_combination`.
         */
        fun defaults(defaults: String) = defaults(JsonField.of(defaults))

        /**
         * Sets [Builder.defaults] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaults] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun defaults(defaults: JsonField<String>) = apply { this.defaults = defaults }

        /** Where `modifier` is legal, its `args` forms, and unit semantics. */
        fun modifiers(modifiers: String) = modifiers(JsonField.of(modifiers))

        /**
         * Sets [Builder.modifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modifiers] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun modifiers(modifiers: JsonField<String>) = apply { this.modifiers = modifiers }

        /** Filter operator value counts for the `right` array. */
        fun operators(operators: String) = operators(JsonField.of(operators))

        /**
         * Sets [Builder.operators] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operators] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun operators(operators: JsonField<String>) = apply { this.operators = operators }

        /** Built-in variables and field references in `right[].variable`. */
        fun variables(variables: String) = variables(JsonField.of(variables))

        /**
         * Sets [Builder.variables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variables] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun variables(variables: JsonField<String>) = apply { this.variables = variables }

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
         * Returns an immutable instance of [Rules].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .apiNameComposition()
         * .axes()
         * .defaults()
         * .modifiers()
         * .operators()
         * .variables()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Rules =
            Rules(
                checkRequired("apiNameComposition", apiNameComposition),
                checkRequired("axes", axes),
                checkRequired("defaults", defaults),
                checkRequired("modifiers", modifiers),
                checkRequired("operators", operators),
                checkRequired("variables", variables),
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
    fun validate(): Rules = apply {
        if (validated) {
            return@apply
        }

        apiNameComposition()
        axes()
        defaults()
        modifiers()
        operators()
        variables()
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
        (if (apiNameComposition.asKnown().isPresent) 1 else 0) +
            (if (axes.asKnown().isPresent) 1 else 0) +
            (if (defaults.asKnown().isPresent) 1 else 0) +
            (if (modifiers.asKnown().isPresent) 1 else 0) +
            (if (operators.asKnown().isPresent) 1 else 0) +
            (if (variables.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Rules &&
            apiNameComposition == other.apiNameComposition &&
            axes == other.axes &&
            defaults == other.defaults &&
            modifiers == other.modifiers &&
            operators == other.operators &&
            variables == other.variables &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            apiNameComposition,
            axes,
            defaults,
            modifiers,
            operators,
            variables,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Rules{apiNameComposition=$apiNameComposition, axes=$axes, defaults=$defaults, modifiers=$modifiers, operators=$operators, variables=$variables, additionalProperties=$additionalProperties}"
}
