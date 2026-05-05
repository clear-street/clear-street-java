// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.BaseDeserializer
import com.clear_street.api.core.BaseSerializer
import com.clear_street.api.core.Enum
import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.Params
import com.clear_street.api.core.allMaxBy
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.getOrThrow
import com.clear_street.api.core.http.Headers
import com.clear_street.api.core.http.QueryParams
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.SecurityType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Submit new orders */
class OrderSubmitOrdersParams
private constructor(
    private val accountId: Long?,
    private val orders: List<Order>,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun accountId(): Optional<Long> = Optional.ofNullable(accountId)

    fun orders(): List<Order> = orders

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OrderSubmitOrdersParams].
         *
         * The following fields are required:
         * ```java
         * .orders()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OrderSubmitOrdersParams]. */
    class Builder internal constructor() {

        private var accountId: Long? = null
        private var orders: MutableList<Order>? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(orderSubmitOrdersParams: OrderSubmitOrdersParams) = apply {
            accountId = orderSubmitOrdersParams.accountId
            orders = orderSubmitOrdersParams.orders.toMutableList()
            additionalHeaders = orderSubmitOrdersParams.additionalHeaders.toBuilder()
            additionalQueryParams = orderSubmitOrdersParams.additionalQueryParams.toBuilder()
        }

        fun accountId(accountId: Long?) = apply { this.accountId = accountId }

        /**
         * Alias for [Builder.accountId].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun accountId(accountId: Long) = accountId(accountId as Long?)

        /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
        fun accountId(accountId: Optional<Long>) = accountId(accountId.getOrNull())

        fun orders(orders: List<Order>) = apply { this.orders = orders.toMutableList() }

        /**
         * Adds a single [Order] to [orders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOrder(order: Order) = apply {
            orders = (orders ?: mutableListOf()).apply { add(order) }
        }

        /**
         * Alias for calling [addOrder] with
         * `Order.ofNewOrderMultilegRequest(newOrderMultilegRequest)`.
         */
        fun addOrder(newOrderMultilegRequest: Order.NewOrderMultilegRequest) =
            addOrder(Order.ofNewOrderMultilegRequest(newOrderMultilegRequest))

        /** Alias for calling [addOrder] with `Order.ofNewOrderRequest(newOrderRequest)`. */
        fun addOrder(newOrderRequest: Order.NewOrderRequest) =
            addOrder(Order.ofNewOrderRequest(newOrderRequest))

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
         * Returns an immutable instance of [OrderSubmitOrdersParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .orders()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OrderSubmitOrdersParams =
            OrderSubmitOrdersParams(
                accountId,
                checkRequired("orders", orders).toImmutable(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): List<Order> = orders

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> accountId?.toString() ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Request to submit a single-leg or multileg order.
     *
     * Existing single-leg payloads are still accepted as-is. Multileg payloads are identified by
     * the required `legs` field.
     */
    @JsonDeserialize(using = Order.Deserializer::class)
    @JsonSerialize(using = Order.Serializer::class)
    class Order
    private constructor(
        private val newOrderMultilegRequest: NewOrderMultilegRequest? = null,
        private val newOrderRequest: NewOrderRequest? = null,
        private val _json: JsonValue? = null,
    ) {

        /** Multileg strategy order request */
        fun newOrderMultilegRequest(): Optional<NewOrderMultilegRequest> =
            Optional.ofNullable(newOrderMultilegRequest)

        /** Single-leg order request */
        fun newOrderRequest(): Optional<NewOrderRequest> = Optional.ofNullable(newOrderRequest)

        fun isNewOrderMultilegRequest(): Boolean = newOrderMultilegRequest != null

        fun isNewOrderRequest(): Boolean = newOrderRequest != null

        /** Multileg strategy order request */
        fun asNewOrderMultilegRequest(): NewOrderMultilegRequest =
            newOrderMultilegRequest.getOrThrow("newOrderMultilegRequest")

        /** Single-leg order request */
        fun asNewOrderRequest(): NewOrderRequest = newOrderRequest.getOrThrow("newOrderRequest")

        fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```java
         * import com.clear_street.api.core.JsonValue;
         * import java.util.Optional;
         *
         * Optional<String> result = order.accept(new Order.Visitor<Optional<String>>() {
         *     @Override
         *     public Optional<String> visitNewOrderMultilegRequest(NewOrderMultilegRequest newOrderMultilegRequest) {
         *         return Optional.of(newOrderMultilegRequest.toString());
         *     }
         *
         *     // ...
         *
         *     @Override
         *     public Optional<String> unknown(JsonValue json) {
         *         // Or inspect the `json`.
         *         return Optional.empty();
         *     }
         * });
         * ```
         *
         * @throws ClearStreetInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                newOrderMultilegRequest != null ->
                    visitor.visitNewOrderMultilegRequest(newOrderMultilegRequest)
                newOrderRequest != null -> visitor.visitNewOrderRequest(newOrderRequest)
                else -> visitor.unknown(_json)
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
        fun validate(): Order = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitNewOrderMultilegRequest(
                        newOrderMultilegRequest: NewOrderMultilegRequest
                    ) {
                        newOrderMultilegRequest.validate()
                    }

                    override fun visitNewOrderRequest(newOrderRequest: NewOrderRequest) {
                        newOrderRequest.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitNewOrderMultilegRequest(
                        newOrderMultilegRequest: NewOrderMultilegRequest
                    ) = newOrderMultilegRequest.validity()

                    override fun visitNewOrderRequest(newOrderRequest: NewOrderRequest) =
                        newOrderRequest.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Order &&
                newOrderMultilegRequest == other.newOrderMultilegRequest &&
                newOrderRequest == other.newOrderRequest
        }

        override fun hashCode(): Int = Objects.hash(newOrderMultilegRequest, newOrderRequest)

        override fun toString(): String =
            when {
                newOrderMultilegRequest != null ->
                    "Order{newOrderMultilegRequest=$newOrderMultilegRequest}"
                newOrderRequest != null -> "Order{newOrderRequest=$newOrderRequest}"
                _json != null -> "Order{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Order")
            }

        companion object {

            /** Multileg strategy order request */
            @JvmStatic
            fun ofNewOrderMultilegRequest(newOrderMultilegRequest: NewOrderMultilegRequest) =
                Order(newOrderMultilegRequest = newOrderMultilegRequest)

            /** Single-leg order request */
            @JvmStatic
            fun ofNewOrderRequest(newOrderRequest: NewOrderRequest) =
                Order(newOrderRequest = newOrderRequest)
        }

        /** An interface that defines how to map each variant of [Order] to a value of type [T]. */
        interface Visitor<out T> {

            /** Multileg strategy order request */
            fun visitNewOrderMultilegRequest(newOrderMultilegRequest: NewOrderMultilegRequest): T

            /** Single-leg order request */
            fun visitNewOrderRequest(newOrderRequest: NewOrderRequest): T

            /**
             * Maps an unknown variant of [Order] to a value of type [T].
             *
             * An instance of [Order] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws ClearStreetInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw ClearStreetInvalidDataException("Unknown Order: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Order>(Order::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Order {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<NewOrderMultilegRequest>())?.let {
                                Order(newOrderMultilegRequest = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<NewOrderRequest>())?.let {
                                Order(newOrderRequest = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Order(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Order>(Order::class) {

            override fun serialize(
                value: Order,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.newOrderMultilegRequest != null ->
                        generator.writeObject(value.newOrderMultilegRequest)
                    value.newOrderRequest != null -> generator.writeObject(value.newOrderRequest)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Order")
                }
            }
        }

        /** Multileg strategy order request */
        class NewOrderMultilegRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val legs: JsonField<List<Leg>>,
            private val orderType: JsonField<OrderType>,
            private val timeInForce: JsonField<TimeInForce>,
            private val id: JsonField<String>,
            private val limitPrice: JsonField<String>,
            private val quantity: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("legs") @ExcludeMissing legs: JsonField<List<Leg>> = JsonMissing.of(),
                @JsonProperty("order_type")
                @ExcludeMissing
                orderType: JsonField<OrderType> = JsonMissing.of(),
                @JsonProperty("time_in_force")
                @ExcludeMissing
                timeInForce: JsonField<TimeInForce> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("limit_price")
                @ExcludeMissing
                limitPrice: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<String> = JsonMissing.of(),
            ) : this(legs, orderType, timeInForce, id, limitPrice, quantity, mutableMapOf())

            /**
             * Legs that compose the strategy.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun legs(): List<Leg> = legs.getRequired("legs")

            /**
             * Type of order (currently MARKET or LIMIT for multileg strategy submission)
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun orderType(): OrderType = orderType.getRequired("order_type")

            /**
             * Time in force
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timeInForce(): TimeInForce = timeInForce.getRequired("time_in_force")

            /**
             * Optional client-provided unique ID (idempotency). Required to be unique per account.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * Strategy price, required for LIMIT orders.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun limitPrice(): Optional<String> = limitPrice.getOptional("limit_price")

            /**
             * Optional strategy-level quantity. Multiplies leg quantities. Defaults to 1.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun quantity(): Optional<String> = quantity.getOptional("quantity")

            /**
             * Returns the raw JSON value of [legs].
             *
             * Unlike [legs], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("legs") @ExcludeMissing fun _legs(): JsonField<List<Leg>> = legs

            /**
             * Returns the raw JSON value of [orderType].
             *
             * Unlike [orderType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("order_type")
            @ExcludeMissing
            fun _orderType(): JsonField<OrderType> = orderType

            /**
             * Returns the raw JSON value of [timeInForce].
             *
             * Unlike [timeInForce], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("time_in_force")
            @ExcludeMissing
            fun _timeInForce(): JsonField<TimeInForce> = timeInForce

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [limitPrice].
             *
             * Unlike [limitPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("limit_price")
            @ExcludeMissing
            fun _limitPrice(): JsonField<String> = limitPrice

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<String> = quantity

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
                 * Returns a mutable builder for constructing an instance of
                 * [NewOrderMultilegRequest].
                 *
                 * The following fields are required:
                 * ```java
                 * .legs()
                 * .orderType()
                 * .timeInForce()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NewOrderMultilegRequest]. */
            class Builder internal constructor() {

                private var legs: JsonField<MutableList<Leg>>? = null
                private var orderType: JsonField<OrderType>? = null
                private var timeInForce: JsonField<TimeInForce>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var limitPrice: JsonField<String> = JsonMissing.of()
                private var quantity: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(newOrderMultilegRequest: NewOrderMultilegRequest) = apply {
                    legs = newOrderMultilegRequest.legs.map { it.toMutableList() }
                    orderType = newOrderMultilegRequest.orderType
                    timeInForce = newOrderMultilegRequest.timeInForce
                    id = newOrderMultilegRequest.id
                    limitPrice = newOrderMultilegRequest.limitPrice
                    quantity = newOrderMultilegRequest.quantity
                    additionalProperties =
                        newOrderMultilegRequest.additionalProperties.toMutableMap()
                }

                /** Legs that compose the strategy. */
                fun legs(legs: List<Leg>) = legs(JsonField.of(legs))

                /**
                 * Sets [Builder.legs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.legs] with a well-typed `List<Leg>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun legs(legs: JsonField<List<Leg>>) = apply {
                    this.legs = legs.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Leg] to [legs].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addLeg(leg: Leg) = apply {
                    legs =
                        (legs ?: JsonField.of(mutableListOf())).also {
                            checkKnown("legs", it).add(leg)
                        }
                }

                /** Type of order (currently MARKET or LIMIT for multileg strategy submission) */
                fun orderType(orderType: OrderType) = orderType(JsonField.of(orderType))

                /**
                 * Sets [Builder.orderType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orderType] with a well-typed [OrderType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun orderType(orderType: JsonField<OrderType>) = apply {
                    this.orderType = orderType
                }

                /** Time in force */
                fun timeInForce(timeInForce: TimeInForce) = timeInForce(JsonField.of(timeInForce))

                /**
                 * Sets [Builder.timeInForce] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeInForce] with a well-typed [TimeInForce]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timeInForce(timeInForce: JsonField<TimeInForce>) = apply {
                    this.timeInForce = timeInForce
                }

                /**
                 * Optional client-provided unique ID (idempotency). Required to be unique per
                 * account.
                 */
                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Strategy price, required for LIMIT orders. */
                fun limitPrice(limitPrice: String?) = limitPrice(JsonField.ofNullable(limitPrice))

                /** Alias for calling [Builder.limitPrice] with `limitPrice.orElse(null)`. */
                fun limitPrice(limitPrice: Optional<String>) = limitPrice(limitPrice.getOrNull())

                /**
                 * Sets [Builder.limitPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limitPrice] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun limitPrice(limitPrice: JsonField<String>) = apply {
                    this.limitPrice = limitPrice
                }

                /** Optional strategy-level quantity. Multiplies leg quantities. Defaults to 1. */
                fun quantity(quantity: String) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [NewOrderMultilegRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .legs()
                 * .orderType()
                 * .timeInForce()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NewOrderMultilegRequest =
                    NewOrderMultilegRequest(
                        checkRequired("legs", legs).map { it.toImmutable() },
                        checkRequired("orderType", orderType),
                        checkRequired("timeInForce", timeInForce),
                        id,
                        limitPrice,
                        quantity,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ClearStreetInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): NewOrderMultilegRequest = apply {
                if (validated) {
                    return@apply
                }

                legs().forEach { it.validate() }
                orderType().validate()
                timeInForce().validate()
                id()
                limitPrice()
                quantity()
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
                (legs.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (orderType.asKnown().getOrNull()?.validity() ?: 0) +
                    (timeInForce.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (if (limitPrice.asKnown().isPresent) 1 else 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0)

            /** A single leg in a multileg strategy request. */
            class Leg
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val instrumentType: JsonField<SecurityType>,
                private val ratio: JsonField<String>,
                private val security: JsonField<String>,
                private val side: JsonField<Side>,
                private val id: JsonField<String>,
                private val positionEffect: JsonField<PositionEffect>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("instrument_type")
                    @ExcludeMissing
                    instrumentType: JsonField<SecurityType> = JsonMissing.of(),
                    @JsonProperty("ratio")
                    @ExcludeMissing
                    ratio: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("security")
                    @ExcludeMissing
                    security: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("side") @ExcludeMissing side: JsonField<Side> = JsonMissing.of(),
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("position_effect")
                    @ExcludeMissing
                    positionEffect: JsonField<PositionEffect> = JsonMissing.of(),
                ) : this(instrumentType, ratio, security, side, id, positionEffect, mutableMapOf())

                /**
                 * Security type for the leg.
                 *
                 * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun instrumentType(): SecurityType = instrumentType.getRequired("instrument_type")

                /**
                 * Ratio for the leg.
                 *
                 * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun ratio(): String = ratio.getRequired("ratio")

                /**
                 * Trading symbol (e.g. "AAPL" or OSI symbol for options)
                 *
                 * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun security(): String = security.getRequired("security")

                /**
                 * Leg side.
                 *
                 * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun side(): Side = side.getRequired("side")

                /**
                 * Optional leg reference identifier.
                 *
                 * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun id(): Optional<String> = id.getOptional("id")

                /**
                 * Optional leg position effect.
                 *
                 * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun positionEffect(): Optional<PositionEffect> =
                    positionEffect.getOptional("position_effect")

                /**
                 * Returns the raw JSON value of [instrumentType].
                 *
                 * Unlike [instrumentType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("instrument_type")
                @ExcludeMissing
                fun _instrumentType(): JsonField<SecurityType> = instrumentType

                /**
                 * Returns the raw JSON value of [ratio].
                 *
                 * Unlike [ratio], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("ratio") @ExcludeMissing fun _ratio(): JsonField<String> = ratio

                /**
                 * Returns the raw JSON value of [security].
                 *
                 * Unlike [security], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("security")
                @ExcludeMissing
                fun _security(): JsonField<String> = security

                /**
                 * Returns the raw JSON value of [side].
                 *
                 * Unlike [side], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("side") @ExcludeMissing fun _side(): JsonField<Side> = side

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [positionEffect].
                 *
                 * Unlike [positionEffect], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("position_effect")
                @ExcludeMissing
                fun _positionEffect(): JsonField<PositionEffect> = positionEffect

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
                     * Returns a mutable builder for constructing an instance of [Leg].
                     *
                     * The following fields are required:
                     * ```java
                     * .instrumentType()
                     * .ratio()
                     * .security()
                     * .side()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Leg]. */
                class Builder internal constructor() {

                    private var instrumentType: JsonField<SecurityType>? = null
                    private var ratio: JsonField<String>? = null
                    private var security: JsonField<String>? = null
                    private var side: JsonField<Side>? = null
                    private var id: JsonField<String> = JsonMissing.of()
                    private var positionEffect: JsonField<PositionEffect> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(leg: Leg) = apply {
                        instrumentType = leg.instrumentType
                        ratio = leg.ratio
                        security = leg.security
                        side = leg.side
                        id = leg.id
                        positionEffect = leg.positionEffect
                        additionalProperties = leg.additionalProperties.toMutableMap()
                    }

                    /** Security type for the leg. */
                    fun instrumentType(instrumentType: SecurityType) =
                        instrumentType(JsonField.of(instrumentType))

                    /**
                     * Sets [Builder.instrumentType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.instrumentType] with a well-typed
                     * [SecurityType] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun instrumentType(instrumentType: JsonField<SecurityType>) = apply {
                        this.instrumentType = instrumentType
                    }

                    /** Ratio for the leg. */
                    fun ratio(ratio: String) = ratio(JsonField.of(ratio))

                    /**
                     * Sets [Builder.ratio] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ratio] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun ratio(ratio: JsonField<String>) = apply { this.ratio = ratio }

                    /** Trading symbol (e.g. "AAPL" or OSI symbol for options) */
                    fun security(security: String) = security(JsonField.of(security))

                    /**
                     * Sets [Builder.security] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.security] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun security(security: JsonField<String>) = apply { this.security = security }

                    /** Leg side. */
                    fun side(side: Side) = side(JsonField.of(side))

                    /**
                     * Sets [Builder.side] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.side] with a well-typed [Side] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun side(side: JsonField<Side>) = apply { this.side = side }

                    /** Optional leg reference identifier. */
                    fun id(id: String?) = id(JsonField.ofNullable(id))

                    /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                    fun id(id: Optional<String>) = id(id.getOrNull())

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /** Optional leg position effect. */
                    fun positionEffect(positionEffect: PositionEffect?) =
                        positionEffect(JsonField.ofNullable(positionEffect))

                    /**
                     * Alias for calling [Builder.positionEffect] with
                     * `positionEffect.orElse(null)`.
                     */
                    fun positionEffect(positionEffect: Optional<PositionEffect>) =
                        positionEffect(positionEffect.getOrNull())

                    /**
                     * Sets [Builder.positionEffect] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.positionEffect] with a well-typed
                     * [PositionEffect] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun positionEffect(positionEffect: JsonField<PositionEffect>) = apply {
                        this.positionEffect = positionEffect
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Leg].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .instrumentType()
                     * .ratio()
                     * .security()
                     * .side()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Leg =
                        Leg(
                            checkRequired("instrumentType", instrumentType),
                            checkRequired("ratio", ratio),
                            checkRequired("security", security),
                            checkRequired("side", side),
                            id,
                            positionEffect,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ClearStreetInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Leg = apply {
                    if (validated) {
                        return@apply
                    }

                    instrumentType().validate()
                    ratio()
                    security()
                    side().validate()
                    id()
                    positionEffect().ifPresent { it.validate() }
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
                    (instrumentType.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (ratio.asKnown().isPresent) 1 else 0) +
                        (if (security.asKnown().isPresent) 1 else 0) +
                        (side.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (id.asKnown().isPresent) 1 else 0) +
                        (positionEffect.asKnown().getOrNull()?.validity() ?: 0)

                /** Optional leg position effect. */
                class PositionEffect
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val OPEN = of("OPEN")

                        @JvmField val CLOSE = of("CLOSE")

                        @JvmStatic fun of(value: String) = PositionEffect(JsonField.of(value))
                    }

                    /** An enum containing [PositionEffect]'s known values. */
                    enum class Known {
                        OPEN,
                        CLOSE,
                    }

                    /**
                     * An enum containing [PositionEffect]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [PositionEffect] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        OPEN,
                        CLOSE,
                        /**
                         * An enum member indicating that [PositionEffect] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            OPEN -> Value.OPEN
                            CLOSE -> Value.CLOSE
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws ClearStreetInvalidDataException if this class instance's value is a
                     *   not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            OPEN -> Known.OPEN
                            CLOSE -> Known.CLOSE
                            else ->
                                throw ClearStreetInvalidDataException(
                                    "Unknown PositionEffect: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws ClearStreetInvalidDataException if this class instance's value does
                     *   not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            ClearStreetInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws ClearStreetInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): PositionEffect = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PositionEffect && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Leg &&
                        instrumentType == other.instrumentType &&
                        ratio == other.ratio &&
                        security == other.security &&
                        side == other.side &&
                        id == other.id &&
                        positionEffect == other.positionEffect &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        instrumentType,
                        ratio,
                        security,
                        side,
                        id,
                        positionEffect,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Leg{instrumentType=$instrumentType, ratio=$ratio, security=$security, side=$side, id=$id, positionEffect=$positionEffect, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NewOrderMultilegRequest &&
                    legs == other.legs &&
                    orderType == other.orderType &&
                    timeInForce == other.timeInForce &&
                    id == other.id &&
                    limitPrice == other.limitPrice &&
                    quantity == other.quantity &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    legs,
                    orderType,
                    timeInForce,
                    id,
                    limitPrice,
                    quantity,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewOrderMultilegRequest{legs=$legs, orderType=$orderType, timeInForce=$timeInForce, id=$id, limitPrice=$limitPrice, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        /** Single-leg order request */
        class NewOrderRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val instrumentType: JsonField<SecurityType>,
            private val orderType: JsonField<OrderType>,
            private val quantity: JsonField<String>,
            private val side: JsonField<Side>,
            private val timeInForce: JsonField<TimeInForce>,
            private val id: JsonField<String>,
            private val expiresAt: JsonField<OffsetDateTime>,
            private val extendedHours: JsonField<Boolean>,
            private val instrumentId: JsonField<String>,
            private val limitOffset: JsonField<String>,
            private val limitPrice: JsonField<String>,
            private val positionEffect: JsonField<PositionEffect>,
            private val stopPrice: JsonField<String>,
            private val strategy: JsonField<OrderStrategy>,
            private val symbol: JsonField<String>,
            private val trailingOffsetAmt: JsonField<String>,
            private val trailingOffsetAmtType: JsonField<TrailingOffsetType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("instrument_type")
                @ExcludeMissing
                instrumentType: JsonField<SecurityType> = JsonMissing.of(),
                @JsonProperty("order_type")
                @ExcludeMissing
                orderType: JsonField<OrderType> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<String> = JsonMissing.of(),
                @JsonProperty("side") @ExcludeMissing side: JsonField<Side> = JsonMissing.of(),
                @JsonProperty("time_in_force")
                @ExcludeMissing
                timeInForce: JsonField<TimeInForce> = JsonMissing.of(),
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("expires_at")
                @ExcludeMissing
                expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("extended_hours")
                @ExcludeMissing
                extendedHours: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("instrument_id")
                @ExcludeMissing
                instrumentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("limit_offset")
                @ExcludeMissing
                limitOffset: JsonField<String> = JsonMissing.of(),
                @JsonProperty("limit_price")
                @ExcludeMissing
                limitPrice: JsonField<String> = JsonMissing.of(),
                @JsonProperty("position_effect")
                @ExcludeMissing
                positionEffect: JsonField<PositionEffect> = JsonMissing.of(),
                @JsonProperty("stop_price")
                @ExcludeMissing
                stopPrice: JsonField<String> = JsonMissing.of(),
                @JsonProperty("strategy")
                @ExcludeMissing
                strategy: JsonField<OrderStrategy> = JsonMissing.of(),
                @JsonProperty("symbol")
                @ExcludeMissing
                symbol: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trailing_offset_amt")
                @ExcludeMissing
                trailingOffsetAmt: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trailing_offset_amt_type")
                @ExcludeMissing
                trailingOffsetAmtType: JsonField<TrailingOffsetType> = JsonMissing.of(),
            ) : this(
                instrumentType,
                orderType,
                quantity,
                side,
                timeInForce,
                id,
                expiresAt,
                extendedHours,
                instrumentId,
                limitOffset,
                limitPrice,
                positionEffect,
                stopPrice,
                strategy,
                symbol,
                trailingOffsetAmt,
                trailingOffsetAmtType,
                mutableMapOf(),
            )

            /**
             * Type of security
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun instrumentType(): SecurityType = instrumentType.getRequired("instrument_type")

            /**
             * Type of order
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun orderType(): OrderType = orderType.getRequired("order_type")

            /**
             * Quantity to trade. For COMMON_STOCK: shares (may be fractional if supported). For
             * OPTION (single-leg): contracts (must be an integer)
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): String = quantity.getRequired("quantity")

            /**
             * Side of the order
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun side(): Side = side.getRequired("side")

            /**
             * Time in force
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timeInForce(): TimeInForce = timeInForce.getRequired("time_in_force")

            /**
             * Optional client-provided unique ID (idempotency). Required to be unique per account.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun id(): Optional<String> = id.getOptional("id")

            /**
             * The timestamp when the order should expire (UTC). Required when time_in_force is
             * GOOD_TILL_DATE.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

            /**
             * Allow trading outside regular trading hours. Some brokers disallow options outside
             * RTH.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun extendedHours(): Optional<Boolean> = extendedHours.getOptional("extended_hours")

            /**
             * OEMS instrument UUID. Either `symbol` or `instrument_id` must be provided.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun instrumentId(): Optional<String> = instrumentId.getOptional("instrument_id")

            /**
             * Limit offset for trailing stop-limit orders (signed)
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun limitOffset(): Optional<String> = limitOffset.getOptional("limit_offset")

            /**
             * Limit price (required for LIMIT and STOP_LIMIT orders)
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun limitPrice(): Optional<String> = limitPrice.getOptional("limit_price")

            /**
             * Required when instrument_type is OPTION. Specifies whether the order opens or closes
             * a position.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun positionEffect(): Optional<PositionEffect> =
                positionEffect.getOptional("position_effect")

            /**
             * Stop price (required for STOP and STOP_LIMIT orders)
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun stopPrice(): Optional<String> = stopPrice.getOptional("stop_price")

            /**
             * Execution strategy/router. Defaults to SOR where applicable.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun strategy(): Optional<OrderStrategy> = strategy.getOptional("strategy")

            /**
             * Trading symbol. For equities, use the ticker symbol (e.g., "AAPL"). For options, use
             * the OSI symbol (e.g., "AAPL 250117C00190000"). Either `symbol` or `instrument_id`
             * must be provided.
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun symbol(): Optional<String> = symbol.getOptional("symbol")

            /**
             * Trailing offset amount (required for trailing orders)
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun trailingOffsetAmt(): Optional<String> =
                trailingOffsetAmt.getOptional("trailing_offset_amt")

            /**
             * Trailing offset type (PRICE or PERCENT_BPS)
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun trailingOffsetAmtType(): Optional<TrailingOffsetType> =
                trailingOffsetAmtType.getOptional("trailing_offset_amt_type")

            /**
             * Returns the raw JSON value of [instrumentType].
             *
             * Unlike [instrumentType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("instrument_type")
            @ExcludeMissing
            fun _instrumentType(): JsonField<SecurityType> = instrumentType

            /**
             * Returns the raw JSON value of [orderType].
             *
             * Unlike [orderType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("order_type")
            @ExcludeMissing
            fun _orderType(): JsonField<OrderType> = orderType

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<String> = quantity

            /**
             * Returns the raw JSON value of [side].
             *
             * Unlike [side], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("side") @ExcludeMissing fun _side(): JsonField<Side> = side

            /**
             * Returns the raw JSON value of [timeInForce].
             *
             * Unlike [timeInForce], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("time_in_force")
            @ExcludeMissing
            fun _timeInForce(): JsonField<TimeInForce> = timeInForce

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [expiresAt].
             *
             * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

            /**
             * Returns the raw JSON value of [extendedHours].
             *
             * Unlike [extendedHours], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("extended_hours")
            @ExcludeMissing
            fun _extendedHours(): JsonField<Boolean> = extendedHours

            /**
             * Returns the raw JSON value of [instrumentId].
             *
             * Unlike [instrumentId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("instrument_id")
            @ExcludeMissing
            fun _instrumentId(): JsonField<String> = instrumentId

            /**
             * Returns the raw JSON value of [limitOffset].
             *
             * Unlike [limitOffset], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("limit_offset")
            @ExcludeMissing
            fun _limitOffset(): JsonField<String> = limitOffset

            /**
             * Returns the raw JSON value of [limitPrice].
             *
             * Unlike [limitPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("limit_price")
            @ExcludeMissing
            fun _limitPrice(): JsonField<String> = limitPrice

            /**
             * Returns the raw JSON value of [positionEffect].
             *
             * Unlike [positionEffect], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("position_effect")
            @ExcludeMissing
            fun _positionEffect(): JsonField<PositionEffect> = positionEffect

            /**
             * Returns the raw JSON value of [stopPrice].
             *
             * Unlike [stopPrice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("stop_price")
            @ExcludeMissing
            fun _stopPrice(): JsonField<String> = stopPrice

            /**
             * Returns the raw JSON value of [strategy].
             *
             * Unlike [strategy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("strategy")
            @ExcludeMissing
            fun _strategy(): JsonField<OrderStrategy> = strategy

            /**
             * Returns the raw JSON value of [symbol].
             *
             * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

            /**
             * Returns the raw JSON value of [trailingOffsetAmt].
             *
             * Unlike [trailingOffsetAmt], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("trailing_offset_amt")
            @ExcludeMissing
            fun _trailingOffsetAmt(): JsonField<String> = trailingOffsetAmt

            /**
             * Returns the raw JSON value of [trailingOffsetAmtType].
             *
             * Unlike [trailingOffsetAmtType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("trailing_offset_amt_type")
            @ExcludeMissing
            fun _trailingOffsetAmtType(): JsonField<TrailingOffsetType> = trailingOffsetAmtType

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
                 * Returns a mutable builder for constructing an instance of [NewOrderRequest].
                 *
                 * The following fields are required:
                 * ```java
                 * .instrumentType()
                 * .orderType()
                 * .quantity()
                 * .side()
                 * .timeInForce()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NewOrderRequest]. */
            class Builder internal constructor() {

                private var instrumentType: JsonField<SecurityType>? = null
                private var orderType: JsonField<OrderType>? = null
                private var quantity: JsonField<String>? = null
                private var side: JsonField<Side>? = null
                private var timeInForce: JsonField<TimeInForce>? = null
                private var id: JsonField<String> = JsonMissing.of()
                private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var extendedHours: JsonField<Boolean> = JsonMissing.of()
                private var instrumentId: JsonField<String> = JsonMissing.of()
                private var limitOffset: JsonField<String> = JsonMissing.of()
                private var limitPrice: JsonField<String> = JsonMissing.of()
                private var positionEffect: JsonField<PositionEffect> = JsonMissing.of()
                private var stopPrice: JsonField<String> = JsonMissing.of()
                private var strategy: JsonField<OrderStrategy> = JsonMissing.of()
                private var symbol: JsonField<String> = JsonMissing.of()
                private var trailingOffsetAmt: JsonField<String> = JsonMissing.of()
                private var trailingOffsetAmtType: JsonField<TrailingOffsetType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(newOrderRequest: NewOrderRequest) = apply {
                    instrumentType = newOrderRequest.instrumentType
                    orderType = newOrderRequest.orderType
                    quantity = newOrderRequest.quantity
                    side = newOrderRequest.side
                    timeInForce = newOrderRequest.timeInForce
                    id = newOrderRequest.id
                    expiresAt = newOrderRequest.expiresAt
                    extendedHours = newOrderRequest.extendedHours
                    instrumentId = newOrderRequest.instrumentId
                    limitOffset = newOrderRequest.limitOffset
                    limitPrice = newOrderRequest.limitPrice
                    positionEffect = newOrderRequest.positionEffect
                    stopPrice = newOrderRequest.stopPrice
                    strategy = newOrderRequest.strategy
                    symbol = newOrderRequest.symbol
                    trailingOffsetAmt = newOrderRequest.trailingOffsetAmt
                    trailingOffsetAmtType = newOrderRequest.trailingOffsetAmtType
                    additionalProperties = newOrderRequest.additionalProperties.toMutableMap()
                }

                /** Type of security */
                fun instrumentType(instrumentType: SecurityType) =
                    instrumentType(JsonField.of(instrumentType))

                /**
                 * Sets [Builder.instrumentType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.instrumentType] with a well-typed [SecurityType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun instrumentType(instrumentType: JsonField<SecurityType>) = apply {
                    this.instrumentType = instrumentType
                }

                /** Type of order */
                fun orderType(orderType: OrderType) = orderType(JsonField.of(orderType))

                /**
                 * Sets [Builder.orderType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orderType] with a well-typed [OrderType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun orderType(orderType: JsonField<OrderType>) = apply {
                    this.orderType = orderType
                }

                /**
                 * Quantity to trade. For COMMON_STOCK: shares (may be fractional if supported). For
                 * OPTION (single-leg): contracts (must be an integer)
                 */
                fun quantity(quantity: String) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<String>) = apply { this.quantity = quantity }

                /** Side of the order */
                fun side(side: Side) = side(JsonField.of(side))

                /**
                 * Sets [Builder.side] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.side] with a well-typed [Side] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun side(side: JsonField<Side>) = apply { this.side = side }

                /** Time in force */
                fun timeInForce(timeInForce: TimeInForce) = timeInForce(JsonField.of(timeInForce))

                /**
                 * Sets [Builder.timeInForce] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeInForce] with a well-typed [TimeInForce]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun timeInForce(timeInForce: JsonField<TimeInForce>) = apply {
                    this.timeInForce = timeInForce
                }

                /**
                 * Optional client-provided unique ID (idempotency). Required to be unique per
                 * account.
                 */
                fun id(id: String?) = id(JsonField.ofNullable(id))

                /** Alias for calling [Builder.id] with `id.orElse(null)`. */
                fun id(id: Optional<String>) = id(id.getOrNull())

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The timestamp when the order should expire (UTC). Required when time_in_force is
                 * GOOD_TILL_DATE.
                 */
                fun expiresAt(expiresAt: OffsetDateTime?) =
                    expiresAt(JsonField.ofNullable(expiresAt))

                /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
                fun expiresAt(expiresAt: Optional<OffsetDateTime>) =
                    expiresAt(expiresAt.getOrNull())

                /**
                 * Sets [Builder.expiresAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /**
                 * Allow trading outside regular trading hours. Some brokers disallow options
                 * outside RTH.
                 */
                fun extendedHours(extendedHours: Boolean?) =
                    extendedHours(JsonField.ofNullable(extendedHours))

                /**
                 * Alias for [Builder.extendedHours].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun extendedHours(extendedHours: Boolean) = extendedHours(extendedHours as Boolean?)

                /** Alias for calling [Builder.extendedHours] with `extendedHours.orElse(null)`. */
                fun extendedHours(extendedHours: Optional<Boolean>) =
                    extendedHours(extendedHours.getOrNull())

                /**
                 * Sets [Builder.extendedHours] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.extendedHours] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun extendedHours(extendedHours: JsonField<Boolean>) = apply {
                    this.extendedHours = extendedHours
                }

                /** OEMS instrument UUID. Either `symbol` or `instrument_id` must be provided. */
                fun instrumentId(instrumentId: String?) =
                    instrumentId(JsonField.ofNullable(instrumentId))

                /** Alias for calling [Builder.instrumentId] with `instrumentId.orElse(null)`. */
                fun instrumentId(instrumentId: Optional<String>) =
                    instrumentId(instrumentId.getOrNull())

                /**
                 * Sets [Builder.instrumentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.instrumentId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun instrumentId(instrumentId: JsonField<String>) = apply {
                    this.instrumentId = instrumentId
                }

                /** Limit offset for trailing stop-limit orders (signed) */
                fun limitOffset(limitOffset: String?) =
                    limitOffset(JsonField.ofNullable(limitOffset))

                /** Alias for calling [Builder.limitOffset] with `limitOffset.orElse(null)`. */
                fun limitOffset(limitOffset: Optional<String>) =
                    limitOffset(limitOffset.getOrNull())

                /**
                 * Sets [Builder.limitOffset] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limitOffset] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun limitOffset(limitOffset: JsonField<String>) = apply {
                    this.limitOffset = limitOffset
                }

                /** Limit price (required for LIMIT and STOP_LIMIT orders) */
                fun limitPrice(limitPrice: String?) = limitPrice(JsonField.ofNullable(limitPrice))

                /** Alias for calling [Builder.limitPrice] with `limitPrice.orElse(null)`. */
                fun limitPrice(limitPrice: Optional<String>) = limitPrice(limitPrice.getOrNull())

                /**
                 * Sets [Builder.limitPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.limitPrice] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun limitPrice(limitPrice: JsonField<String>) = apply {
                    this.limitPrice = limitPrice
                }

                /**
                 * Required when instrument_type is OPTION. Specifies whether the order opens or
                 * closes a position.
                 */
                fun positionEffect(positionEffect: PositionEffect) =
                    positionEffect(JsonField.of(positionEffect))

                /**
                 * Sets [Builder.positionEffect] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.positionEffect] with a well-typed
                 * [PositionEffect] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun positionEffect(positionEffect: JsonField<PositionEffect>) = apply {
                    this.positionEffect = positionEffect
                }

                /** Stop price (required for STOP and STOP_LIMIT orders) */
                fun stopPrice(stopPrice: String?) = stopPrice(JsonField.ofNullable(stopPrice))

                /** Alias for calling [Builder.stopPrice] with `stopPrice.orElse(null)`. */
                fun stopPrice(stopPrice: Optional<String>) = stopPrice(stopPrice.getOrNull())

                /**
                 * Sets [Builder.stopPrice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stopPrice] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun stopPrice(stopPrice: JsonField<String>) = apply { this.stopPrice = stopPrice }

                /** Execution strategy/router. Defaults to SOR where applicable. */
                fun strategy(strategy: OrderStrategy?) = strategy(JsonField.ofNullable(strategy))

                /** Alias for calling [Builder.strategy] with `strategy.orElse(null)`. */
                fun strategy(strategy: Optional<OrderStrategy>) = strategy(strategy.getOrNull())

                /**
                 * Sets [Builder.strategy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.strategy] with a well-typed [OrderStrategy]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun strategy(strategy: JsonField<OrderStrategy>) = apply {
                    this.strategy = strategy
                }

                /** Alias for calling [strategy] with `OrderStrategy.ofSor(sor)`. */
                fun strategy(sor: OrderStrategy.Sor) = strategy(OrderStrategy.ofSor(sor))

                /** Alias for calling [strategy] with `OrderStrategy.ofVwap(vwap)`. */
                fun strategy(vwap: OrderStrategy.Vwap) = strategy(OrderStrategy.ofVwap(vwap))

                /** Alias for calling [strategy] with `OrderStrategy.ofTwap(twap)`. */
                fun strategy(twap: OrderStrategy.Twap) = strategy(OrderStrategy.ofTwap(twap))

                /** Alias for calling [strategy] with `OrderStrategy.ofAp(ap)`. */
                fun strategy(ap: OrderStrategy.Ap) = strategy(OrderStrategy.ofAp(ap))

                /** Alias for calling [strategy] with `OrderStrategy.ofPov(pov)`. */
                fun strategy(pov: OrderStrategy.Pov) = strategy(OrderStrategy.ofPov(pov))

                /** Alias for calling [strategy] with `OrderStrategy.ofDark(dark)`. */
                fun strategy(dark: OrderStrategy.Dark) = strategy(OrderStrategy.ofDark(dark))

                /** Alias for calling [strategy] with `OrderStrategy.ofDma(dma)`. */
                fun strategy(dma: OrderStrategy.Dma) = strategy(OrderStrategy.ofDma(dma))

                /**
                 * Trading symbol. For equities, use the ticker symbol (e.g., "AAPL"). For options,
                 * use the OSI symbol (e.g., "AAPL 250117C00190000"). Either `symbol` or
                 * `instrument_id` must be provided.
                 */
                fun symbol(symbol: String?) = symbol(JsonField.ofNullable(symbol))

                /** Alias for calling [Builder.symbol] with `symbol.orElse(null)`. */
                fun symbol(symbol: Optional<String>) = symbol(symbol.getOrNull())

                /**
                 * Sets [Builder.symbol] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.symbol] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

                /** Trailing offset amount (required for trailing orders) */
                fun trailingOffsetAmt(trailingOffsetAmt: String?) =
                    trailingOffsetAmt(JsonField.ofNullable(trailingOffsetAmt))

                /**
                 * Alias for calling [Builder.trailingOffsetAmt] with
                 * `trailingOffsetAmt.orElse(null)`.
                 */
                fun trailingOffsetAmt(trailingOffsetAmt: Optional<String>) =
                    trailingOffsetAmt(trailingOffsetAmt.getOrNull())

                /**
                 * Sets [Builder.trailingOffsetAmt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trailingOffsetAmt] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun trailingOffsetAmt(trailingOffsetAmt: JsonField<String>) = apply {
                    this.trailingOffsetAmt = trailingOffsetAmt
                }

                /** Trailing offset type (PRICE or PERCENT_BPS) */
                fun trailingOffsetAmtType(trailingOffsetAmtType: TrailingOffsetType?) =
                    trailingOffsetAmtType(JsonField.ofNullable(trailingOffsetAmtType))

                /**
                 * Alias for calling [Builder.trailingOffsetAmtType] with
                 * `trailingOffsetAmtType.orElse(null)`.
                 */
                fun trailingOffsetAmtType(trailingOffsetAmtType: Optional<TrailingOffsetType>) =
                    trailingOffsetAmtType(trailingOffsetAmtType.getOrNull())

                /**
                 * Sets [Builder.trailingOffsetAmtType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.trailingOffsetAmtType] with a well-typed
                 * [TrailingOffsetType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun trailingOffsetAmtType(trailingOffsetAmtType: JsonField<TrailingOffsetType>) =
                    apply {
                        this.trailingOffsetAmtType = trailingOffsetAmtType
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [NewOrderRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .instrumentType()
                 * .orderType()
                 * .quantity()
                 * .side()
                 * .timeInForce()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NewOrderRequest =
                    NewOrderRequest(
                        checkRequired("instrumentType", instrumentType),
                        checkRequired("orderType", orderType),
                        checkRequired("quantity", quantity),
                        checkRequired("side", side),
                        checkRequired("timeInForce", timeInForce),
                        id,
                        expiresAt,
                        extendedHours,
                        instrumentId,
                        limitOffset,
                        limitPrice,
                        positionEffect,
                        stopPrice,
                        strategy,
                        symbol,
                        trailingOffsetAmt,
                        trailingOffsetAmtType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws ClearStreetInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): NewOrderRequest = apply {
                if (validated) {
                    return@apply
                }

                instrumentType().validate()
                orderType().validate()
                quantity()
                side().validate()
                timeInForce().validate()
                id()
                expiresAt()
                extendedHours()
                instrumentId()
                limitOffset()
                limitPrice()
                positionEffect().ifPresent { it.validate() }
                stopPrice()
                strategy().ifPresent { it.validate() }
                symbol()
                trailingOffsetAmt()
                trailingOffsetAmtType().ifPresent { it.validate() }
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
                (instrumentType.asKnown().getOrNull()?.validity() ?: 0) +
                    (orderType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0) +
                    (side.asKnown().getOrNull()?.validity() ?: 0) +
                    (timeInForce.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (id.asKnown().isPresent) 1 else 0) +
                    (if (expiresAt.asKnown().isPresent) 1 else 0) +
                    (if (extendedHours.asKnown().isPresent) 1 else 0) +
                    (if (instrumentId.asKnown().isPresent) 1 else 0) +
                    (if (limitOffset.asKnown().isPresent) 1 else 0) +
                    (if (limitPrice.asKnown().isPresent) 1 else 0) +
                    (positionEffect.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (stopPrice.asKnown().isPresent) 1 else 0) +
                    (strategy.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (symbol.asKnown().isPresent) 1 else 0) +
                    (if (trailingOffsetAmt.asKnown().isPresent) 1 else 0) +
                    (trailingOffsetAmtType.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Required when instrument_type is OPTION. Specifies whether the order opens or closes
             * a position.
             */
            class PositionEffect
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val OPEN = of("OPEN")

                    @JvmField val CLOSE = of("CLOSE")

                    @JvmStatic fun of(value: String) = PositionEffect(JsonField.of(value))
                }

                /** An enum containing [PositionEffect]'s known values. */
                enum class Known {
                    OPEN,
                    CLOSE,
                }

                /**
                 * An enum containing [PositionEffect]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PositionEffect] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OPEN,
                    CLOSE,
                    /**
                     * An enum member indicating that [PositionEffect] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        OPEN -> Value.OPEN
                        CLOSE -> Value.CLOSE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws ClearStreetInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        OPEN -> Known.OPEN
                        CLOSE -> Known.CLOSE
                        else ->
                            throw ClearStreetInvalidDataException("Unknown PositionEffect: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws ClearStreetInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
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
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws ClearStreetInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PositionEffect = apply {
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

                    return other is PositionEffect && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NewOrderRequest &&
                    instrumentType == other.instrumentType &&
                    orderType == other.orderType &&
                    quantity == other.quantity &&
                    side == other.side &&
                    timeInForce == other.timeInForce &&
                    id == other.id &&
                    expiresAt == other.expiresAt &&
                    extendedHours == other.extendedHours &&
                    instrumentId == other.instrumentId &&
                    limitOffset == other.limitOffset &&
                    limitPrice == other.limitPrice &&
                    positionEffect == other.positionEffect &&
                    stopPrice == other.stopPrice &&
                    strategy == other.strategy &&
                    symbol == other.symbol &&
                    trailingOffsetAmt == other.trailingOffsetAmt &&
                    trailingOffsetAmtType == other.trailingOffsetAmtType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    instrumentType,
                    orderType,
                    quantity,
                    side,
                    timeInForce,
                    id,
                    expiresAt,
                    extendedHours,
                    instrumentId,
                    limitOffset,
                    limitPrice,
                    positionEffect,
                    stopPrice,
                    strategy,
                    symbol,
                    trailingOffsetAmt,
                    trailingOffsetAmtType,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewOrderRequest{instrumentType=$instrumentType, orderType=$orderType, quantity=$quantity, side=$side, timeInForce=$timeInForce, id=$id, expiresAt=$expiresAt, extendedHours=$extendedHours, instrumentId=$instrumentId, limitOffset=$limitOffset, limitPrice=$limitPrice, positionEffect=$positionEffect, stopPrice=$stopPrice, strategy=$strategy, symbol=$symbol, trailingOffsetAmt=$trailingOffsetAmt, trailingOffsetAmtType=$trailingOffsetAmtType, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderSubmitOrdersParams &&
            accountId == other.accountId &&
            orders == other.orders &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(accountId, orders, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "OrderSubmitOrdersParams{accountId=$accountId, orders=$orders, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
