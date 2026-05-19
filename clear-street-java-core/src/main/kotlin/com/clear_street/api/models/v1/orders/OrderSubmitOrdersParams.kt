// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.orders

import com.clear_street.api.core.BaseDeserializer
import com.clear_street.api.core.BaseSerializer
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
        fun addOrder(newOrderRequest: NewOrderRequest) =
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
            private val orderType: JsonField<RequestOrderType>,
            private val timeInForce: JsonField<RequestTimeInForce>,
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
                orderType: JsonField<RequestOrderType> = JsonMissing.of(),
                @JsonProperty("time_in_force")
                @ExcludeMissing
                timeInForce: JsonField<RequestTimeInForce> = JsonMissing.of(),
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
            fun orderType(): RequestOrderType = orderType.getRequired("order_type")

            /**
             * Time in force
             *
             * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or
             *   is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun timeInForce(): RequestTimeInForce = timeInForce.getRequired("time_in_force")

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
            fun _orderType(): JsonField<RequestOrderType> = orderType

            /**
             * Returns the raw JSON value of [timeInForce].
             *
             * Unlike [timeInForce], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("time_in_force")
            @ExcludeMissing
            fun _timeInForce(): JsonField<RequestTimeInForce> = timeInForce

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
                private var orderType: JsonField<RequestOrderType>? = null
                private var timeInForce: JsonField<RequestTimeInForce>? = null
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
                fun orderType(orderType: RequestOrderType) = orderType(JsonField.of(orderType))

                /**
                 * Sets [Builder.orderType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.orderType] with a well-typed [RequestOrderType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun orderType(orderType: JsonField<RequestOrderType>) = apply {
                    this.orderType = orderType
                }

                /** Time in force */
                fun timeInForce(timeInForce: RequestTimeInForce) =
                    timeInForce(JsonField.of(timeInForce))

                /**
                 * Sets [Builder.timeInForce] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.timeInForce] with a well-typed
                 * [RequestTimeInForce] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun timeInForce(timeInForce: JsonField<RequestTimeInForce>) = apply {
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
                private val ratio: JsonField<String>,
                private val security: JsonField<String>,
                private val side: JsonField<Side>,
                private val id: JsonField<String>,
                private val positionEffect: JsonField<PositionEffect>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
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
                ) : this(ratio, security, side, id, positionEffect, mutableMapOf())

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
                     * .ratio()
                     * .security()
                     * .side()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Leg]. */
                class Builder internal constructor() {

                    private var ratio: JsonField<String>? = null
                    private var security: JsonField<String>? = null
                    private var side: JsonField<Side>? = null
                    private var id: JsonField<String> = JsonMissing.of()
                    private var positionEffect: JsonField<PositionEffect> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(leg: Leg) = apply {
                        ratio = leg.ratio
                        security = leg.security
                        side = leg.side
                        id = leg.id
                        positionEffect = leg.positionEffect
                        additionalProperties = leg.additionalProperties.toMutableMap()
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
                     * .ratio()
                     * .security()
                     * .side()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Leg =
                        Leg(
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
                    (if (ratio.asKnown().isPresent) 1 else 0) +
                        (if (security.asKnown().isPresent) 1 else 0) +
                        (side.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (id.asKnown().isPresent) 1 else 0) +
                        (positionEffect.asKnown().getOrNull()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Leg &&
                        ratio == other.ratio &&
                        security == other.security &&
                        side == other.side &&
                        id == other.id &&
                        positionEffect == other.positionEffect &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(ratio, security, side, id, positionEffect, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Leg{ratio=$ratio, security=$security, side=$side, id=$id, positionEffect=$positionEffect, additionalProperties=$additionalProperties}"
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
