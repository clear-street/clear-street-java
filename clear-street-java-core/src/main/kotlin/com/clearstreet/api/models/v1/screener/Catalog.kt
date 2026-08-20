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

/**
 * The complete screener field catalog, serialized as the `data` payload of `GET /screener/catalog`.
 */
class Catalog
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val defaultResponseFields: JsonField<List<String>>,
    private val enums: JsonField<Enums>,
    private val fields: JsonField<FieldColumns>,
    private val kinds: JsonField<List<FieldKind>>,
    private val modifiers: JsonField<List<ModifierDef>>,
    private val operatorsByValueType: JsonField<OperatorsByValueType>,
    private val rules: JsonField<Rules>,
    private val suffixes: JsonField<Suffixes>,
    private val variables: JsonField<List<VariableDef>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("default_response_fields")
        @ExcludeMissing
        defaultResponseFields: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("enums") @ExcludeMissing enums: JsonField<Enums> = JsonMissing.of(),
        @JsonProperty("fields") @ExcludeMissing fields: JsonField<FieldColumns> = JsonMissing.of(),
        @JsonProperty("kinds") @ExcludeMissing kinds: JsonField<List<FieldKind>> = JsonMissing.of(),
        @JsonProperty("modifiers")
        @ExcludeMissing
        modifiers: JsonField<List<ModifierDef>> = JsonMissing.of(),
        @JsonProperty("operators_by_value_type")
        @ExcludeMissing
        operatorsByValueType: JsonField<OperatorsByValueType> = JsonMissing.of(),
        @JsonProperty("rules") @ExcludeMissing rules: JsonField<Rules> = JsonMissing.of(),
        @JsonProperty("suffixes") @ExcludeMissing suffixes: JsonField<Suffixes> = JsonMissing.of(),
        @JsonProperty("variables")
        @ExcludeMissing
        variables: JsonField<List<VariableDef>> = JsonMissing.of(),
    ) : this(
        defaultResponseFields,
        enums,
        fields,
        kinds,
        modifiers,
        operatorsByValueType,
        rules,
        suffixes,
        variables,
        mutableMapOf(),
    )

    /**
     * The `api_name`s that resolve to the POST default column set when `columns` is omitted.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun defaultResponseFields(): List<String> =
        defaultResponseFields.getRequired("default_response_fields")

    /**
     * The enum universes every other section's values are drawn from.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun enums(): Enums = enums.getRequired("enums")

    /**
     * Struct-of-arrays of the remaining per-field scalars.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fields(): FieldColumns = fields.getRequired("fields")

    /**
     * The deduplicated `(category, format, value_type, combinations, default combination)` tuples;
     * `fields.kind[i]` indexes into this.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kinds(): List<FieldKind> = kinds.getRequired("kinds")

    /**
     * The modifier operations and their legal `args` forms.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modifiers(): List<ModifierDef> = modifiers.getRequired("modifiers")

    /**
     * `value_type` -> canonically-ordered valid operators.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operatorsByValueType(): OperatorsByValueType =
        operatorsByValueType.getRequired("operators_by_value_type")

    /**
     * Request-side semantics for turning the data into a valid call.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun rules(): Rules = rules.getRequired("rules")

    /**
     * Axis token -> abbreviation, for every token in use in `kinds`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun suffixes(): Suffixes = suffixes.getRequired("suffixes")

    /**
     * The built-in variables accepted in `filters[].right[].variable`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun variables(): List<VariableDef> = variables.getRequired("variables")

    /**
     * Returns the raw JSON value of [defaultResponseFields].
     *
     * Unlike [defaultResponseFields], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("default_response_fields")
    @ExcludeMissing
    fun _defaultResponseFields(): JsonField<List<String>> = defaultResponseFields

    /**
     * Returns the raw JSON value of [enums].
     *
     * Unlike [enums], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("enums") @ExcludeMissing fun _enums(): JsonField<Enums> = enums

    /**
     * Returns the raw JSON value of [fields].
     *
     * Unlike [fields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fields") @ExcludeMissing fun _fields(): JsonField<FieldColumns> = fields

    /**
     * Returns the raw JSON value of [kinds].
     *
     * Unlike [kinds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kinds") @ExcludeMissing fun _kinds(): JsonField<List<FieldKind>> = kinds

    /**
     * Returns the raw JSON value of [modifiers].
     *
     * Unlike [modifiers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modifiers")
    @ExcludeMissing
    fun _modifiers(): JsonField<List<ModifierDef>> = modifiers

    /**
     * Returns the raw JSON value of [operatorsByValueType].
     *
     * Unlike [operatorsByValueType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("operators_by_value_type")
    @ExcludeMissing
    fun _operatorsByValueType(): JsonField<OperatorsByValueType> = operatorsByValueType

    /**
     * Returns the raw JSON value of [rules].
     *
     * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<Rules> = rules

    /**
     * Returns the raw JSON value of [suffixes].
     *
     * Unlike [suffixes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("suffixes") @ExcludeMissing fun _suffixes(): JsonField<Suffixes> = suffixes

    /**
     * Returns the raw JSON value of [variables].
     *
     * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variables")
    @ExcludeMissing
    fun _variables(): JsonField<List<VariableDef>> = variables

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
         * Returns a mutable builder for constructing an instance of [Catalog].
         *
         * The following fields are required:
         * ```java
         * .defaultResponseFields()
         * .enums()
         * .fields()
         * .kinds()
         * .modifiers()
         * .operatorsByValueType()
         * .rules()
         * .suffixes()
         * .variables()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Catalog]. */
    class Builder internal constructor() {

        private var defaultResponseFields: JsonField<MutableList<String>>? = null
        private var enums: JsonField<Enums>? = null
        private var fields: JsonField<FieldColumns>? = null
        private var kinds: JsonField<MutableList<FieldKind>>? = null
        private var modifiers: JsonField<MutableList<ModifierDef>>? = null
        private var operatorsByValueType: JsonField<OperatorsByValueType>? = null
        private var rules: JsonField<Rules>? = null
        private var suffixes: JsonField<Suffixes>? = null
        private var variables: JsonField<MutableList<VariableDef>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(catalog: Catalog) = apply {
            defaultResponseFields = catalog.defaultResponseFields.map { it.toMutableList() }
            enums = catalog.enums
            fields = catalog.fields
            kinds = catalog.kinds.map { it.toMutableList() }
            modifiers = catalog.modifiers.map { it.toMutableList() }
            operatorsByValueType = catalog.operatorsByValueType
            rules = catalog.rules
            suffixes = catalog.suffixes
            variables = catalog.variables.map { it.toMutableList() }
            additionalProperties = catalog.additionalProperties.toMutableMap()
        }

        /**
         * The `api_name`s that resolve to the POST default column set when `columns` is omitted.
         */
        fun defaultResponseFields(defaultResponseFields: List<String>) =
            defaultResponseFields(JsonField.of(defaultResponseFields))

        /**
         * Sets [Builder.defaultResponseFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultResponseFields] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun defaultResponseFields(defaultResponseFields: JsonField<List<String>>) = apply {
            this.defaultResponseFields = defaultResponseFields.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [defaultResponseFields].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDefaultResponseField(defaultResponseField: String) = apply {
            defaultResponseFields =
                (defaultResponseFields ?: JsonField.of(mutableListOf())).also {
                    checkKnown("defaultResponseFields", it).add(defaultResponseField)
                }
        }

        /** The enum universes every other section's values are drawn from. */
        fun enums(enums: Enums) = enums(JsonField.of(enums))

        /**
         * Sets [Builder.enums] to an arbitrary JSON value.
         *
         * You should usually call [Builder.enums] with a well-typed [Enums] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun enums(enums: JsonField<Enums>) = apply { this.enums = enums }

        /** Struct-of-arrays of the remaining per-field scalars. */
        fun fields(fields: FieldColumns) = fields(JsonField.of(fields))

        /**
         * Sets [Builder.fields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fields] with a well-typed [FieldColumns] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fields(fields: JsonField<FieldColumns>) = apply { this.fields = fields }

        /**
         * The deduplicated `(category, format, value_type, combinations, default combination)`
         * tuples; `fields.kind[i]` indexes into this.
         */
        fun kinds(kinds: List<FieldKind>) = kinds(JsonField.of(kinds))

        /**
         * Sets [Builder.kinds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kinds] with a well-typed `List<FieldKind>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun kinds(kinds: JsonField<List<FieldKind>>) = apply {
            this.kinds = kinds.map { it.toMutableList() }
        }

        /**
         * Adds a single [FieldKind] to [kinds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addKind(kind: FieldKind) = apply {
            kinds =
                (kinds ?: JsonField.of(mutableListOf())).also { checkKnown("kinds", it).add(kind) }
        }

        /** The modifier operations and their legal `args` forms. */
        fun modifiers(modifiers: List<ModifierDef>) = modifiers(JsonField.of(modifiers))

        /**
         * Sets [Builder.modifiers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modifiers] with a well-typed `List<ModifierDef>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modifiers(modifiers: JsonField<List<ModifierDef>>) = apply {
            this.modifiers = modifiers.map { it.toMutableList() }
        }

        /**
         * Adds a single [ModifierDef] to [modifiers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModifier(modifier: ModifierDef) = apply {
            modifiers =
                (modifiers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("modifiers", it).add(modifier)
                }
        }

        /** `value_type` -> canonically-ordered valid operators. */
        fun operatorsByValueType(operatorsByValueType: OperatorsByValueType) =
            operatorsByValueType(JsonField.of(operatorsByValueType))

        /**
         * Sets [Builder.operatorsByValueType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatorsByValueType] with a well-typed
         * [OperatorsByValueType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun operatorsByValueType(operatorsByValueType: JsonField<OperatorsByValueType>) = apply {
            this.operatorsByValueType = operatorsByValueType
        }

        /** Request-side semantics for turning the data into a valid call. */
        fun rules(rules: Rules) = rules(JsonField.of(rules))

        /**
         * Sets [Builder.rules] to an arbitrary JSON value.
         *
         * You should usually call [Builder.rules] with a well-typed [Rules] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun rules(rules: JsonField<Rules>) = apply { this.rules = rules }

        /** Axis token -> abbreviation, for every token in use in `kinds`. */
        fun suffixes(suffixes: Suffixes) = suffixes(JsonField.of(suffixes))

        /**
         * Sets [Builder.suffixes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.suffixes] with a well-typed [Suffixes] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun suffixes(suffixes: JsonField<Suffixes>) = apply { this.suffixes = suffixes }

        /** The built-in variables accepted in `filters[].right[].variable`. */
        fun variables(variables: List<VariableDef>) = variables(JsonField.of(variables))

        /**
         * Sets [Builder.variables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variables] with a well-typed `List<VariableDef>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun variables(variables: JsonField<List<VariableDef>>) = apply {
            this.variables = variables.map { it.toMutableList() }
        }

        /**
         * Adds a single [VariableDef] to [variables].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVariable(variable: VariableDef) = apply {
            variables =
                (variables ?: JsonField.of(mutableListOf())).also {
                    checkKnown("variables", it).add(variable)
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
         * Returns an immutable instance of [Catalog].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .defaultResponseFields()
         * .enums()
         * .fields()
         * .kinds()
         * .modifiers()
         * .operatorsByValueType()
         * .rules()
         * .suffixes()
         * .variables()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Catalog =
            Catalog(
                checkRequired("defaultResponseFields", defaultResponseFields).map {
                    it.toImmutable()
                },
                checkRequired("enums", enums),
                checkRequired("fields", fields),
                checkRequired("kinds", kinds).map { it.toImmutable() },
                checkRequired("modifiers", modifiers).map { it.toImmutable() },
                checkRequired("operatorsByValueType", operatorsByValueType),
                checkRequired("rules", rules),
                checkRequired("suffixes", suffixes),
                checkRequired("variables", variables).map { it.toImmutable() },
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
    fun validate(): Catalog = apply {
        if (validated) {
            return@apply
        }

        defaultResponseFields()
        enums().validate()
        fields().validate()
        kinds().forEach { it.validate() }
        modifiers().forEach { it.validate() }
        operatorsByValueType().validate()
        rules().validate()
        suffixes().validate()
        variables().forEach { it.validate() }
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
        (defaultResponseFields.asKnown().getOrNull()?.size ?: 0) +
            (enums.asKnown().getOrNull()?.validity() ?: 0) +
            (fields.asKnown().getOrNull()?.validity() ?: 0) +
            (kinds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (modifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (operatorsByValueType.asKnown().getOrNull()?.validity() ?: 0) +
            (rules.asKnown().getOrNull()?.validity() ?: 0) +
            (suffixes.asKnown().getOrNull()?.validity() ?: 0) +
            (variables.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** `value_type` -> canonically-ordered valid operators. */
    class OperatorsByValueType
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [OperatorsByValueType]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OperatorsByValueType]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(operatorsByValueType: OperatorsByValueType) = apply {
                additionalProperties = operatorsByValueType.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [OperatorsByValueType].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OperatorsByValueType =
                OperatorsByValueType(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): OperatorsByValueType = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OperatorsByValueType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "OperatorsByValueType{additionalProperties=$additionalProperties}"
    }

    /** Axis token -> abbreviation, for every token in use in `kinds`. */
    class Suffixes
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Suffixes]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Suffixes]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(suffixes: Suffixes) = apply {
                additionalProperties = suffixes.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Suffixes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Suffixes = Suffixes(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws ClearStreetInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Suffixes = apply {
            if (validated) {
                return@apply
            }

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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Suffixes && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Suffixes{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Catalog &&
            defaultResponseFields == other.defaultResponseFields &&
            enums == other.enums &&
            fields == other.fields &&
            kinds == other.kinds &&
            modifiers == other.modifiers &&
            operatorsByValueType == other.operatorsByValueType &&
            rules == other.rules &&
            suffixes == other.suffixes &&
            variables == other.variables &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            defaultResponseFields,
            enums,
            fields,
            kinds,
            modifiers,
            operatorsByValueType,
            rules,
            suffixes,
            variables,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Catalog{defaultResponseFields=$defaultResponseFields, enums=$enums, fields=$fields, kinds=$kinds, modifiers=$modifiers, operatorsByValueType=$operatorsByValueType, rules=$rules, suffixes=$suffixes, variables=$variables, additionalProperties=$additionalProperties}"
}
