// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.Enum
import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.Params
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Replace an order with new parameters */
class OrderReplaceOrderParams
private constructor(
    private val accountId: Long,
    private val orderId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountId(): Long = accountId

    fun orderId(): Optional<String> = Optional.ofNullable(orderId)

    /**
     * New limit price for the order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun limitPrice(): Optional<String> = body.limitPrice()

    /**
     * New quantity for the order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantity(): Optional<String> = body.quantity()

    /**
     * New stop price for the order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stopPrice(): Optional<String> = body.stopPrice()

    /**
     * New time in force for the order
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeInForce(): Optional<TimeInForce> = body.timeInForce()

    /**
     * Returns the raw JSON value of [limitPrice].
     *
     * Unlike [limitPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _limitPrice(): JsonField<String> = body._limitPrice()

    /**
     * Returns the raw JSON value of [quantity].
     *
     * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _quantity(): JsonField<String> = body._quantity()

    /**
     * Returns the raw JSON value of [stopPrice].
     *
     * Unlike [stopPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _stopPrice(): JsonField<String> = body._stopPrice()

    /**
     * Returns the raw JSON value of [timeInForce].
     *
     * Unlike [timeInForce], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _timeInForce(): JsonField<TimeInForce> = body._timeInForce()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrderReplaceOrderParams].
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrderReplaceOrderParams]. */
    class Builder internal constructor() {

        private var accountId: Long? = null
        private var orderId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(orderReplaceOrderParams: OrderReplaceOrderParams) = apply {
            accountId = orderReplaceOrderParams.accountId
            orderId = orderReplaceOrderParams.orderId
            body = orderReplaceOrderParams.body.toBuilder()
            additionalHeaders = orderReplaceOrderParams.additionalHeaders.toBuilder()
            additionalQueryParams = orderReplaceOrderParams.additionalQueryParams.toBuilder()
        }

        fun accountId(accountId: Long) = apply { this.accountId = accountId }

        fun orderId(orderId: String?) = apply { this.orderId = orderId }

        /** Alias for calling [Builder.orderId] with `orderId.orElse(null)`. */
        fun orderId(orderId: Optional<String>) = orderId(orderId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [limitPrice]
         * - [quantity]
         * - [stopPrice]
         * - [timeInForce]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** New limit price for the order */
        fun limitPrice(limitPrice: String?) = apply { body.limitPrice(limitPrice) }

        /** Alias for calling [Builder.limitPrice] with `limitPrice.orElse(null)`. */
        fun limitPrice(limitPrice: Optional<String>) = limitPrice(limitPrice.getOrNull())

        /**
         * Sets [Builder.limitPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.limitPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun limitPrice(limitPrice: JsonField<String>) = apply { body.limitPrice(limitPrice) }

        /** New quantity for the order */
        fun quantity(quantity: String?) = apply { body.quantity(quantity) }

        /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
        fun quantity(quantity: Optional<String>) = quantity(quantity.getOrNull())

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<String>) = apply { body.quantity(quantity) }

        /** New stop price for the order */
        fun stopPrice(stopPrice: String?) = apply { body.stopPrice(stopPrice) }

        /** Alias for calling [Builder.stopPrice] with `stopPrice.orElse(null)`. */
        fun stopPrice(stopPrice: Optional<String>) = stopPrice(stopPrice.getOrNull())

        /**
         * Sets [Builder.stopPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stopPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun stopPrice(stopPrice: JsonField<String>) = apply { body.stopPrice(stopPrice) }

        /** New time in force for the order */
        fun timeInForce(timeInForce: TimeInForce) = apply { body.timeInForce(timeInForce) }

        /**
         * Sets [Builder.timeInForce] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeInForce] with a well-typed [TimeInForce] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeInForce(timeInForce: JsonField<TimeInForce>) = apply {
            body.timeInForce(timeInForce)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [OrderReplaceOrderParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .accountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrderReplaceOrderParams =
            OrderReplaceOrderParams(
                checkRequired("accountId", accountId),
                orderId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountId.toString()
            1 -> orderId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request to replace (modify) an existing order
     *
     * At least one field must be provided.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val limitPrice: JsonField<String>,
        private val quantity: JsonField<String>,
        private val stopPrice: JsonField<String>,
        private val timeInForce: JsonField<TimeInForce>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("limit_price")
            @ExcludeMissing
            limitPrice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stop_price")
            @ExcludeMissing
            stopPrice: JsonField<String> = JsonMissing.of(),
            @JsonProperty("time_in_force")
            @ExcludeMissing
            timeInForce: JsonField<TimeInForce> = JsonMissing.of(),
        ) : this(limitPrice, quantity, stopPrice, timeInForce, mutableMapOf())

        /**
         * New limit price for the order
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun limitPrice(): Optional<String> = limitPrice.getOptional("limit_price")

        /**
         * New quantity for the order
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantity(): Optional<String> = quantity.getOptional("quantity")

        /**
         * New stop price for the order
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun stopPrice(): Optional<String> = stopPrice.getOptional("stop_price")

        /**
         * New time in force for the order
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timeInForce(): Optional<TimeInForce> = timeInForce.getOptional("time_in_force")

        /**
         * Returns the raw JSON value of [limitPrice].
         *
         * Unlike [limitPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("limit_price")
        @ExcludeMissing
        fun _limitPrice(): JsonField<String> = limitPrice

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<String> = quantity

        /**
         * Returns the raw JSON value of [stopPrice].
         *
         * Unlike [stopPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stop_price") @ExcludeMissing fun _stopPrice(): JsonField<String> = stopPrice

        /**
         * Returns the raw JSON value of [timeInForce].
         *
         * Unlike [timeInForce], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("time_in_force")
        @ExcludeMissing
        fun _timeInForce(): JsonField<TimeInForce> = timeInForce

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var limitPrice: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<String> = JsonMissing.of()
            private var stopPrice: JsonField<String> = JsonMissing.of()
            private var timeInForce: JsonField<TimeInForce> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                limitPrice = body.limitPrice
                quantity = body.quantity
                stopPrice = body.stopPrice
                timeInForce = body.timeInForce
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** New limit price for the order */
            fun limitPrice(limitPrice: String?) = limitPrice(JsonField.ofNullable(limitPrice))

            /** Alias for calling [Builder.limitPrice] with `limitPrice.orElse(null)`. */
            fun limitPrice(limitPrice: Optional<String>) = limitPrice(limitPrice.getOrNull())

            /**
             * Sets [Builder.limitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.limitPrice] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun limitPrice(limitPrice: JsonField<String>) = apply { this.limitPrice = limitPrice }

            /** New quantity for the order */
            fun quantity(quantity: String?) = quantity(JsonField.ofNullable(quantity))

            /** Alias for calling [Builder.quantity] with `quantity.orElse(null)`. */
            fun quantity(quantity: Optional<String>) = quantity(quantity.getOrNull())

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

            /** New stop price for the order */
            fun stopPrice(stopPrice: String?) = stopPrice(JsonField.ofNullable(stopPrice))

            /** Alias for calling [Builder.stopPrice] with `stopPrice.orElse(null)`. */
            fun stopPrice(stopPrice: Optional<String>) = stopPrice(stopPrice.getOrNull())

            /**
             * Sets [Builder.stopPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopPrice] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stopPrice(stopPrice: JsonField<String>) = apply { this.stopPrice = stopPrice }

            /** New time in force for the order */
            fun timeInForce(timeInForce: TimeInForce) = timeInForce(JsonField.of(timeInForce))

            /**
             * Sets [Builder.timeInForce] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeInForce] with a well-typed [TimeInForce] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeInForce(timeInForce: JsonField<TimeInForce>) = apply {
                this.timeInForce = timeInForce
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    limitPrice,
                    quantity,
                    stopPrice,
                    timeInForce,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            limitPrice()
            quantity()
            stopPrice()
            timeInForce().ifPresent { it.validate() }
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
            (if (limitPrice.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (stopPrice.asKnown().isPresent) 1 else 0) +
                (timeInForce.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                limitPrice == other.limitPrice &&
                quantity == other.quantity &&
                stopPrice == other.stopPrice &&
                timeInForce == other.timeInForce &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(limitPrice, quantity, stopPrice, timeInForce, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{limitPrice=$limitPrice, quantity=$quantity, stopPrice=$stopPrice, timeInForce=$timeInForce, additionalProperties=$additionalProperties}"
    }

    /** New time in force for the order */
    class TimeInForce @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DAY = of("DAY")

            @JvmField val GOOD_TILL_CANCEL = of("GOOD_TILL_CANCEL")

            @JvmField val IMMEDIATE_OR_CANCEL = of("IMMEDIATE_OR_CANCEL")

            @JvmField val FILL_OR_KILL = of("FILL_OR_KILL")

            @JvmField val GOOD_TILL_DATE = of("GOOD_TILL_DATE")

            @JvmField val AT_THE_OPENING = of("AT_THE_OPENING")

            @JvmField val AT_THE_CLOSE = of("AT_THE_CLOSE")

            @JvmField val GOOD_TILL_CROSSING = of("GOOD_TILL_CROSSING")

            @JvmField val GOOD_THROUGH_CROSSING = of("GOOD_THROUGH_CROSSING")

            @JvmField val AT_CROSSING = of("AT_CROSSING")

            @JvmStatic fun of(value: String) = TimeInForce(JsonField.of(value))
        }

        /** An enum containing [TimeInForce]'s known values. */
        enum class Known {
            DAY,
            GOOD_TILL_CANCEL,
            IMMEDIATE_OR_CANCEL,
            FILL_OR_KILL,
            GOOD_TILL_DATE,
            AT_THE_OPENING,
            AT_THE_CLOSE,
            GOOD_TILL_CROSSING,
            GOOD_THROUGH_CROSSING,
            AT_CROSSING,
        }

        /**
         * An enum containing [TimeInForce]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TimeInForce] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DAY,
            GOOD_TILL_CANCEL,
            IMMEDIATE_OR_CANCEL,
            FILL_OR_KILL,
            GOOD_TILL_DATE,
            AT_THE_OPENING,
            AT_THE_CLOSE,
            GOOD_TILL_CROSSING,
            GOOD_THROUGH_CROSSING,
            AT_CROSSING,
            /**
             * An enum member indicating that [TimeInForce] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DAY -> Value.DAY
                GOOD_TILL_CANCEL -> Value.GOOD_TILL_CANCEL
                IMMEDIATE_OR_CANCEL -> Value.IMMEDIATE_OR_CANCEL
                FILL_OR_KILL -> Value.FILL_OR_KILL
                GOOD_TILL_DATE -> Value.GOOD_TILL_DATE
                AT_THE_OPENING -> Value.AT_THE_OPENING
                AT_THE_CLOSE -> Value.AT_THE_CLOSE
                GOOD_TILL_CROSSING -> Value.GOOD_TILL_CROSSING
                GOOD_THROUGH_CROSSING -> Value.GOOD_THROUGH_CROSSING
                AT_CROSSING -> Value.AT_CROSSING
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                DAY -> Known.DAY
                GOOD_TILL_CANCEL -> Known.GOOD_TILL_CANCEL
                IMMEDIATE_OR_CANCEL -> Known.IMMEDIATE_OR_CANCEL
                FILL_OR_KILL -> Known.FILL_OR_KILL
                GOOD_TILL_DATE -> Known.GOOD_TILL_DATE
                AT_THE_OPENING -> Known.AT_THE_OPENING
                AT_THE_CLOSE -> Known.AT_THE_CLOSE
                GOOD_TILL_CROSSING -> Known.GOOD_TILL_CROSSING
                GOOD_THROUGH_CROSSING -> Known.GOOD_THROUGH_CROSSING
                AT_CROSSING -> Known.AT_CROSSING
                else -> throw ClearStreetInvalidDataException("Unknown TimeInForce: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws ClearStreetInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                ClearStreetInvalidDataException("Value is not a String")
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
        fun validate(): TimeInForce = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TimeInForce && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderReplaceOrderParams &&
            accountId == other.accountId &&
            orderId == other.orderId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountId, orderId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OrderReplaceOrderParams{accountId=$accountId, orderId=$orderId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
