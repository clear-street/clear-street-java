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

/** The enum universes every other section's values are drawn from. */
class Enums
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val builtinVariable: JsonField<List<String>>,
    private val category: JsonField<List<String>>,
    private val dateUnit: JsonField<List<String>>,
    private val format: JsonField<List<String>>,
    private val lookback: JsonField<List<String>>,
    private val modifierOp: JsonField<List<String>>,
    private val operator: JsonField<List<String>>,
    private val operatorArg: JsonField<List<String>>,
    private val period: JsonField<List<String>>,
    private val valueType: JsonField<List<String>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("builtin_variable")
        @ExcludeMissing
        builtinVariable: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        category: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("date_unit")
        @ExcludeMissing
        dateUnit: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("format") @ExcludeMissing format: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("lookback")
        @ExcludeMissing
        lookback: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("modifier_op")
        @ExcludeMissing
        modifierOp: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("operator")
        @ExcludeMissing
        operator: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("operator_arg")
        @ExcludeMissing
        operatorArg: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("value_type")
        @ExcludeMissing
        valueType: JsonField<List<String>> = JsonMissing.of(),
    ) : this(
        builtinVariable,
        category,
        dateUnit,
        format,
        lookback,
        modifierOp,
        operator,
        operatorArg,
        period,
        valueType,
        mutableMapOf(),
    )

    /**
     * The built-in variable names, e.g. `"today"`, `"start_of_year"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun builtinVariable(): List<String> = builtinVariable.getRequired("builtin_variable")

    /**
     * `FieldCategory` variants, e.g. `"PROFILE"`, `"VALUATION"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun category(): List<String> = category.getRequired("category")

    /**
     * The modifier date units, e.g. `"DAY"`, `"YEAR"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dateUnit(): List<String> = dateUnit.getRequired("date_unit")

    /**
     * `FieldFormat` variants, e.g. `"CURRENCY"`, `"PERCENT"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun format(): List<String> = format.getRequired("format")

    /**
     * `FieldLookback` variants, e.g. `"ONE_WEEK"`, `"YEAR_TO_DATE"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lookback(): List<String> = lookback.getRequired("lookback")

    /**
     * The modifier operation names, `"ADD"` and `"SUBTRACT"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun modifierOp(): List<String> = modifierOp.getRequired("modifier_op")

    /**
     * `FilterOperator` variants, e.g. `"BETWEEN"`, `"ONE_OF"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operator(): List<String> = operator.getRequired("operator")

    /**
     * The modifier arg forms, e.g. `"LEFT_INCLUSIVE"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun operatorArg(): List<String> = operatorArg.getRequired("operator_arg")

    /**
     * `FieldPeriod` variants, e.g. `"QUARTER"`, `"ANNUAL"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun period(): List<String> = period.getRequired("period")

    /**
     * `FieldValueType` variants, e.g. `"DECIMAL"`, `"DATE"`.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun valueType(): List<String> = valueType.getRequired("value_type")

    /**
     * Returns the raw JSON value of [builtinVariable].
     *
     * Unlike [builtinVariable], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("builtin_variable")
    @ExcludeMissing
    fun _builtinVariable(): JsonField<List<String>> = builtinVariable

    /**
     * Returns the raw JSON value of [category].
     *
     * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<List<String>> = category

    /**
     * Returns the raw JSON value of [dateUnit].
     *
     * Unlike [dateUnit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("date_unit") @ExcludeMissing fun _dateUnit(): JsonField<List<String>> = dateUnit

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<List<String>> = format

    /**
     * Returns the raw JSON value of [lookback].
     *
     * Unlike [lookback], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lookback") @ExcludeMissing fun _lookback(): JsonField<List<String>> = lookback

    /**
     * Returns the raw JSON value of [modifierOp].
     *
     * Unlike [modifierOp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("modifier_op")
    @ExcludeMissing
    fun _modifierOp(): JsonField<List<String>> = modifierOp

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<List<String>> = operator

    /**
     * Returns the raw JSON value of [operatorArg].
     *
     * Unlike [operatorArg], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator_arg")
    @ExcludeMissing
    fun _operatorArg(): JsonField<List<String>> = operatorArg

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<List<String>> = period

    /**
     * Returns the raw JSON value of [valueType].
     *
     * Unlike [valueType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value_type")
    @ExcludeMissing
    fun _valueType(): JsonField<List<String>> = valueType

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
         * Returns a mutable builder for constructing an instance of [Enums].
         *
         * The following fields are required:
         * ```java
         * .builtinVariable()
         * .category()
         * .dateUnit()
         * .format()
         * .lookback()
         * .modifierOp()
         * .operator()
         * .operatorArg()
         * .period()
         * .valueType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Enums]. */
    class Builder internal constructor() {

        private var builtinVariable: JsonField<MutableList<String>>? = null
        private var category: JsonField<MutableList<String>>? = null
        private var dateUnit: JsonField<MutableList<String>>? = null
        private var format: JsonField<MutableList<String>>? = null
        private var lookback: JsonField<MutableList<String>>? = null
        private var modifierOp: JsonField<MutableList<String>>? = null
        private var operator: JsonField<MutableList<String>>? = null
        private var operatorArg: JsonField<MutableList<String>>? = null
        private var period: JsonField<MutableList<String>>? = null
        private var valueType: JsonField<MutableList<String>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(enums: Enums) = apply {
            builtinVariable = enums.builtinVariable.map { it.toMutableList() }
            category = enums.category.map { it.toMutableList() }
            dateUnit = enums.dateUnit.map { it.toMutableList() }
            format = enums.format.map { it.toMutableList() }
            lookback = enums.lookback.map { it.toMutableList() }
            modifierOp = enums.modifierOp.map { it.toMutableList() }
            operator = enums.operator.map { it.toMutableList() }
            operatorArg = enums.operatorArg.map { it.toMutableList() }
            period = enums.period.map { it.toMutableList() }
            valueType = enums.valueType.map { it.toMutableList() }
            additionalProperties = enums.additionalProperties.toMutableMap()
        }

        /** The built-in variable names, e.g. `"today"`, `"start_of_year"`. */
        fun builtinVariable(builtinVariable: List<String>) =
            builtinVariable(JsonField.of(builtinVariable))

        /**
         * Sets [Builder.builtinVariable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.builtinVariable] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun builtinVariable(builtinVariable: JsonField<List<String>>) = apply {
            this.builtinVariable = builtinVariable.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.builtinVariable].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBuiltinVariable(builtinVariable: String) = apply {
            this.builtinVariable =
                (this.builtinVariable ?: JsonField.of(mutableListOf())).also {
                    checkKnown("builtinVariable", it).add(builtinVariable)
                }
        }

        /** `FieldCategory` variants, e.g. `"PROFILE"`, `"VALUATION"`. */
        fun category(category: List<String>) = category(JsonField.of(category))

        /**
         * Sets [Builder.category] to an arbitrary JSON value.
         *
         * You should usually call [Builder.category] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun category(category: JsonField<List<String>>) = apply {
            this.category = category.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.category].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCategory(category: String) = apply {
            this.category =
                (this.category ?: JsonField.of(mutableListOf())).also {
                    checkKnown("category", it).add(category)
                }
        }

        /** The modifier date units, e.g. `"DAY"`, `"YEAR"`. */
        fun dateUnit(dateUnit: List<String>) = dateUnit(JsonField.of(dateUnit))

        /**
         * Sets [Builder.dateUnit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dateUnit] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dateUnit(dateUnit: JsonField<List<String>>) = apply {
            this.dateUnit = dateUnit.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.dateUnit].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDateUnit(dateUnit: String) = apply {
            this.dateUnit =
                (this.dateUnit ?: JsonField.of(mutableListOf())).also {
                    checkKnown("dateUnit", it).add(dateUnit)
                }
        }

        /** `FieldFormat` variants, e.g. `"CURRENCY"`, `"PERCENT"`. */
        fun format(format: List<String>) = format(JsonField.of(format))

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun format(format: JsonField<List<String>>) = apply {
            this.format = format.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.format].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFormat(format: String) = apply {
            this.format =
                (this.format ?: JsonField.of(mutableListOf())).also {
                    checkKnown("format", it).add(format)
                }
        }

        /** `FieldLookback` variants, e.g. `"ONE_WEEK"`, `"YEAR_TO_DATE"`. */
        fun lookback(lookback: List<String>) = lookback(JsonField.of(lookback))

        /**
         * Sets [Builder.lookback] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lookback] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lookback(lookback: JsonField<List<String>>) = apply {
            this.lookback = lookback.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.lookback].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLookback(lookback: String) = apply {
            this.lookback =
                (this.lookback ?: JsonField.of(mutableListOf())).also {
                    checkKnown("lookback", it).add(lookback)
                }
        }

        /** The modifier operation names, `"ADD"` and `"SUBTRACT"`. */
        fun modifierOp(modifierOp: List<String>) = modifierOp(JsonField.of(modifierOp))

        /**
         * Sets [Builder.modifierOp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.modifierOp] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun modifierOp(modifierOp: JsonField<List<String>>) = apply {
            this.modifierOp = modifierOp.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.modifierOp].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addModifierOp(modifierOp: String) = apply {
            this.modifierOp =
                (this.modifierOp ?: JsonField.of(mutableListOf())).also {
                    checkKnown("modifierOp", it).add(modifierOp)
                }
        }

        /** `FilterOperator` variants, e.g. `"BETWEEN"`, `"ONE_OF"`. */
        fun operator(operator: List<String>) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operator(operator: JsonField<List<String>>) = apply {
            this.operator = operator.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.operator].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperator(operator: String) = apply {
            this.operator =
                (this.operator ?: JsonField.of(mutableListOf())).also {
                    checkKnown("operator", it).add(operator)
                }
        }

        /** The modifier arg forms, e.g. `"LEFT_INCLUSIVE"`. */
        fun operatorArg(operatorArg: List<String>) = operatorArg(JsonField.of(operatorArg))

        /**
         * Sets [Builder.operatorArg] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatorArg] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operatorArg(operatorArg: JsonField<List<String>>) = apply {
            this.operatorArg = operatorArg.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.operatorArg].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOperatorArg(operatorArg: String) = apply {
            this.operatorArg =
                (this.operatorArg ?: JsonField.of(mutableListOf())).also {
                    checkKnown("operatorArg", it).add(operatorArg)
                }
        }

        /** `FieldPeriod` variants, e.g. `"QUARTER"`, `"ANNUAL"`. */
        fun period(period: List<String>) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun period(period: JsonField<List<String>>) = apply {
            this.period = period.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.period].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPeriod(period: String) = apply {
            this.period =
                (this.period ?: JsonField.of(mutableListOf())).also {
                    checkKnown("period", it).add(period)
                }
        }

        /** `FieldValueType` variants, e.g. `"DECIMAL"`, `"DATE"`. */
        fun valueType(valueType: List<String>) = valueType(JsonField.of(valueType))

        /**
         * Sets [Builder.valueType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valueType] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun valueType(valueType: JsonField<List<String>>) = apply {
            this.valueType = valueType.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.valueType].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValueType(valueType: String) = apply {
            this.valueType =
                (this.valueType ?: JsonField.of(mutableListOf())).also {
                    checkKnown("valueType", it).add(valueType)
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
         * Returns an immutable instance of [Enums].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .builtinVariable()
         * .category()
         * .dateUnit()
         * .format()
         * .lookback()
         * .modifierOp()
         * .operator()
         * .operatorArg()
         * .period()
         * .valueType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Enums =
            Enums(
                checkRequired("builtinVariable", builtinVariable).map { it.toImmutable() },
                checkRequired("category", category).map { it.toImmutable() },
                checkRequired("dateUnit", dateUnit).map { it.toImmutable() },
                checkRequired("format", format).map { it.toImmutable() },
                checkRequired("lookback", lookback).map { it.toImmutable() },
                checkRequired("modifierOp", modifierOp).map { it.toImmutable() },
                checkRequired("operator", operator).map { it.toImmutable() },
                checkRequired("operatorArg", operatorArg).map { it.toImmutable() },
                checkRequired("period", period).map { it.toImmutable() },
                checkRequired("valueType", valueType).map { it.toImmutable() },
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
    fun validate(): Enums = apply {
        if (validated) {
            return@apply
        }

        builtinVariable()
        category()
        dateUnit()
        format()
        lookback()
        modifierOp()
        operator()
        operatorArg()
        period()
        valueType()
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
        (builtinVariable.asKnown().getOrNull()?.size ?: 0) +
            (category.asKnown().getOrNull()?.size ?: 0) +
            (dateUnit.asKnown().getOrNull()?.size ?: 0) +
            (format.asKnown().getOrNull()?.size ?: 0) +
            (lookback.asKnown().getOrNull()?.size ?: 0) +
            (modifierOp.asKnown().getOrNull()?.size ?: 0) +
            (operator.asKnown().getOrNull()?.size ?: 0) +
            (operatorArg.asKnown().getOrNull()?.size ?: 0) +
            (period.asKnown().getOrNull()?.size ?: 0) +
            (valueType.asKnown().getOrNull()?.size ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Enums &&
            builtinVariable == other.builtinVariable &&
            category == other.category &&
            dateUnit == other.dateUnit &&
            format == other.format &&
            lookback == other.lookback &&
            modifierOp == other.modifierOp &&
            operator == other.operator &&
            operatorArg == other.operatorArg &&
            period == other.period &&
            valueType == other.valueType &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            builtinVariable,
            category,
            dateUnit,
            format,
            lookback,
            modifierOp,
            operator,
            operatorArg,
            period,
            valueType,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Enums{builtinVariable=$builtinVariable, category=$category, dateUnit=$dateUnit, format=$format, lookback=$lookback, modifierOp=$modifierOp, operator=$operator, operatorArg=$operatorArg, period=$period, valueType=$valueType, additionalProperties=$additionalProperties}"
}
