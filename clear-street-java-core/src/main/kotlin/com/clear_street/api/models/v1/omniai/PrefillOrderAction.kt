// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.omniai

import com.clear_street.api.core.BaseDeserializer
import com.clear_street.api.core.BaseSerializer
import com.clear_street.api.core.Enum
import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.allMaxBy
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.getOrThrow
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.v1.orders.CancelOrderRequest
import com.clear_street.api.models.v1.orders.NewOrderRequest
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

/**
 * Action to prefill order details for user confirmation.
 *
 * The user must review and authorize the order before submission to the trading API. This action
 * provides parsed order data that can be used to prefill an order ticket UI or submitted directly
 * via the orders API after user confirmation.
 */
@JsonDeserialize(using = PrefillOrderAction.Deserializer::class)
@JsonSerialize(using = PrefillOrderAction.Serializer::class)
class PrefillOrderAction
private constructor(
    private val prefillNewOrderAction: PrefillNewOrderAction? = null,
    private val cancel: PrefillCancelOrderAction? = null,
    private val _json: JsonValue? = null,
) {

    /** Create one or more new orders. */
    fun prefillNewOrderAction(): Optional<PrefillNewOrderAction> =
        Optional.ofNullable(prefillNewOrderAction)

    /** Cancel one or more existing orders. */
    fun cancel(): Optional<PrefillCancelOrderAction> = Optional.ofNullable(cancel)

    fun isPrefillNewOrderAction(): Boolean = prefillNewOrderAction != null

    fun isCancel(): Boolean = cancel != null

    /** Create one or more new orders. */
    fun asPrefillNewOrderAction(): PrefillNewOrderAction =
        prefillNewOrderAction.getOrThrow("prefillNewOrderAction")

    /** Cancel one or more existing orders. */
    fun asCancel(): PrefillCancelOrderAction = cancel.getOrThrow("cancel")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```java
     * import com.clear_street.api.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = prefillOrderAction.accept(new PrefillOrderAction.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitPrefillNewOrderAction(PrefillNewOrderAction prefillNewOrderAction) {
     *         return Optional.of(prefillNewOrderAction.toString());
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
     * @throws ClearStreetInvalidDataException if [Visitor.unknown] is not overridden in [visitor]
     *   and the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            prefillNewOrderAction != null ->
                visitor.visitPrefillNewOrderAction(prefillNewOrderAction)
            cancel != null -> visitor.visitCancel(cancel)
            else -> visitor.unknown(_json)
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
    fun validate(): PrefillOrderAction = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPrefillNewOrderAction(
                    prefillNewOrderAction: PrefillNewOrderAction
                ) {
                    prefillNewOrderAction.validate()
                }

                override fun visitCancel(cancel: PrefillCancelOrderAction) {
                    cancel.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitPrefillNewOrderAction(
                    prefillNewOrderAction: PrefillNewOrderAction
                ) = prefillNewOrderAction.validity()

                override fun visitCancel(cancel: PrefillCancelOrderAction) = cancel.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PrefillOrderAction &&
            prefillNewOrderAction == other.prefillNewOrderAction &&
            cancel == other.cancel
    }

    override fun hashCode(): Int = Objects.hash(prefillNewOrderAction, cancel)

    override fun toString(): String =
        when {
            prefillNewOrderAction != null ->
                "PrefillOrderAction{prefillNewOrderAction=$prefillNewOrderAction}"
            cancel != null -> "PrefillOrderAction{cancel=$cancel}"
            _json != null -> "PrefillOrderAction{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid PrefillOrderAction")
        }

    companion object {

        /** Create one or more new orders. */
        @JvmStatic
        fun ofPrefillNewOrderAction(prefillNewOrderAction: PrefillNewOrderAction) =
            PrefillOrderAction(prefillNewOrderAction = prefillNewOrderAction)

        /** Cancel one or more existing orders. */
        @JvmStatic
        fun ofCancel(cancel: PrefillCancelOrderAction) = PrefillOrderAction(cancel = cancel)
    }

    /**
     * An interface that defines how to map each variant of [PrefillOrderAction] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** Create one or more new orders. */
        fun visitPrefillNewOrderAction(prefillNewOrderAction: PrefillNewOrderAction): T

        /** Cancel one or more existing orders. */
        fun visitCancel(cancel: PrefillCancelOrderAction): T

        /**
         * Maps an unknown variant of [PrefillOrderAction] to a value of type [T].
         *
         * An instance of [PrefillOrderAction] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws ClearStreetInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw ClearStreetInvalidDataException("Unknown PrefillOrderAction: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<PrefillOrderAction>(PrefillOrderAction::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): PrefillOrderAction {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<PrefillNewOrderAction>())?.let {
                            PrefillOrderAction(prefillNewOrderAction = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PrefillCancelOrderAction>())?.let {
                            PrefillOrderAction(cancel = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> PrefillOrderAction(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<PrefillOrderAction>(PrefillOrderAction::class) {

        override fun serialize(
            value: PrefillOrderAction,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.prefillNewOrderAction != null ->
                    generator.writeObject(value.prefillNewOrderAction)
                value.cancel != null -> generator.writeObject(value.cancel)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid PrefillOrderAction")
            }
        }
    }

    /** Create one or more new orders. */
    class PrefillNewOrderAction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val orders: JsonField<List<NewOrderRequest>>,
        private val actionType: JsonField<ActionType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("orders")
            @ExcludeMissing
            orders: JsonField<List<NewOrderRequest>> = JsonMissing.of(),
            @JsonProperty("action_type")
            @ExcludeMissing
            actionType: JsonField<ActionType> = JsonMissing.of(),
        ) : this(orders, actionType, mutableMapOf())

        fun toPrefillNewOrderAction(): PrefillNewOrderAction =
            PrefillNewOrderAction.builder().orders(orders).build()

        /**
         * Orders to prefill using the same shape accepted by the orders API.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun orders(): List<NewOrderRequest> = orders.getRequired("orders")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun actionType(): ActionType = actionType.getRequired("action_type")

        /**
         * Returns the raw JSON value of [orders].
         *
         * Unlike [orders], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orders")
        @ExcludeMissing
        fun _orders(): JsonField<List<NewOrderRequest>> = orders

        /**
         * Returns the raw JSON value of [actionType].
         *
         * Unlike [actionType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action_type")
        @ExcludeMissing
        fun _actionType(): JsonField<ActionType> = actionType

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
             * Returns a mutable builder for constructing an instance of [PrefillNewOrderAction].
             *
             * The following fields are required:
             * ```java
             * .orders()
             * .actionType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PrefillNewOrderAction]. */
        class Builder internal constructor() {

            private var orders: JsonField<MutableList<NewOrderRequest>>? = null
            private var actionType: JsonField<ActionType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(prefillNewOrderAction: PrefillNewOrderAction) = apply {
                orders = prefillNewOrderAction.orders.map { it.toMutableList() }
                actionType = prefillNewOrderAction.actionType
                additionalProperties = prefillNewOrderAction.additionalProperties.toMutableMap()
            }

            /** Orders to prefill using the same shape accepted by the orders API. */
            fun orders(orders: List<NewOrderRequest>) = orders(JsonField.of(orders))

            /**
             * Sets [Builder.orders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orders] with a well-typed `List<NewOrderRequest>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun orders(orders: JsonField<List<NewOrderRequest>>) = apply {
                this.orders = orders.map { it.toMutableList() }
            }

            /**
             * Adds a single [NewOrderRequest] to [orders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOrder(order: NewOrderRequest) = apply {
                orders =
                    (orders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("orders", it).add(order)
                    }
            }

            fun actionType(actionType: ActionType) = actionType(JsonField.of(actionType))

            /**
             * Sets [Builder.actionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionType] with a well-typed [ActionType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionType(actionType: JsonField<ActionType>) = apply {
                this.actionType = actionType
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
             * Returns an immutable instance of [PrefillNewOrderAction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .orders()
             * .actionType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PrefillNewOrderAction =
                PrefillNewOrderAction(
                    checkRequired("orders", orders).map { it.toImmutable() },
                    checkRequired("actionType", actionType),
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
        fun validate(): PrefillNewOrderAction = apply {
            if (validated) {
                return@apply
            }

            orders().forEach { it.validate() }
            actionType().validate()
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
            (orders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (actionType.asKnown().getOrNull()?.validity() ?: 0)

        class ActionType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val NEW = of("NEW")

                @JvmStatic fun of(value: String) = ActionType(JsonField.of(value))
            }

            /** An enum containing [ActionType]'s known values. */
            enum class Known {
                NEW
            }

            /**
             * An enum containing [ActionType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ActionType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NEW,
                /**
                 * An enum member indicating that [ActionType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    NEW -> Value.NEW
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
                    NEW -> Known.NEW
                    else -> throw ClearStreetInvalidDataException("Unknown ActionType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
            fun validate(): ActionType = apply {
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

                return other is ActionType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PrefillNewOrderAction &&
                orders == other.orders &&
                actionType == other.actionType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(orders, actionType, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PrefillNewOrderAction{orders=$orders, actionType=$actionType, additionalProperties=$additionalProperties}"
    }

    /** Cancel one or more existing orders. */
    class PrefillCancelOrderAction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val orders: JsonField<List<CancelOrderRequest>>,
        private val actionType: JsonField<ActionType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("orders")
            @ExcludeMissing
            orders: JsonField<List<CancelOrderRequest>> = JsonMissing.of(),
            @JsonProperty("action_type")
            @ExcludeMissing
            actionType: JsonField<ActionType> = JsonMissing.of(),
        ) : this(orders, actionType, mutableMapOf())

        fun toPrefillCancelOrderAction(): PrefillCancelOrderAction =
            PrefillCancelOrderAction.builder().orders(orders).build()

        /**
         * Orders to cancel using the same identifiers required by the cancel-order API.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun orders(): List<CancelOrderRequest> = orders.getRequired("orders")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun actionType(): ActionType = actionType.getRequired("action_type")

        /**
         * Returns the raw JSON value of [orders].
         *
         * Unlike [orders], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("orders")
        @ExcludeMissing
        fun _orders(): JsonField<List<CancelOrderRequest>> = orders

        /**
         * Returns the raw JSON value of [actionType].
         *
         * Unlike [actionType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action_type")
        @ExcludeMissing
        fun _actionType(): JsonField<ActionType> = actionType

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
             * Returns a mutable builder for constructing an instance of [PrefillCancelOrderAction].
             *
             * The following fields are required:
             * ```java
             * .orders()
             * .actionType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PrefillCancelOrderAction]. */
        class Builder internal constructor() {

            private var orders: JsonField<MutableList<CancelOrderRequest>>? = null
            private var actionType: JsonField<ActionType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(prefillCancelOrderAction: PrefillCancelOrderAction) = apply {
                orders = prefillCancelOrderAction.orders.map { it.toMutableList() }
                actionType = prefillCancelOrderAction.actionType
                additionalProperties = prefillCancelOrderAction.additionalProperties.toMutableMap()
            }

            /** Orders to cancel using the same identifiers required by the cancel-order API. */
            fun orders(orders: List<CancelOrderRequest>) = orders(JsonField.of(orders))

            /**
             * Sets [Builder.orders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orders] with a well-typed `List<CancelOrderRequest>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun orders(orders: JsonField<List<CancelOrderRequest>>) = apply {
                this.orders = orders.map { it.toMutableList() }
            }

            /**
             * Adds a single [CancelOrderRequest] to [orders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOrder(order: CancelOrderRequest) = apply {
                orders =
                    (orders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("orders", it).add(order)
                    }
            }

            fun actionType(actionType: ActionType) = actionType(JsonField.of(actionType))

            /**
             * Sets [Builder.actionType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.actionType] with a well-typed [ActionType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun actionType(actionType: JsonField<ActionType>) = apply {
                this.actionType = actionType
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
             * Returns an immutable instance of [PrefillCancelOrderAction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .orders()
             * .actionType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PrefillCancelOrderAction =
                PrefillCancelOrderAction(
                    checkRequired("orders", orders).map { it.toImmutable() },
                    checkRequired("actionType", actionType),
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
        fun validate(): PrefillCancelOrderAction = apply {
            if (validated) {
                return@apply
            }

            orders().forEach { it.validate() }
            actionType().validate()
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
            (orders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (actionType.asKnown().getOrNull()?.validity() ?: 0)

        class ActionType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CANCEL = of("CANCEL")

                @JvmStatic fun of(value: String) = ActionType(JsonField.of(value))
            }

            /** An enum containing [ActionType]'s known values. */
            enum class Known {
                CANCEL
            }

            /**
             * An enum containing [ActionType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ActionType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CANCEL,
                /**
                 * An enum member indicating that [ActionType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CANCEL -> Value.CANCEL
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
                    CANCEL -> Known.CANCEL
                    else -> throw ClearStreetInvalidDataException("Unknown ActionType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws ClearStreetInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
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
            fun validate(): ActionType = apply {
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

                return other is ActionType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PrefillCancelOrderAction &&
                orders == other.orders &&
                actionType == other.actionType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(orders, actionType, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PrefillCancelOrderAction{orders=$orders, actionType=$actionType, additionalProperties=$additionalProperties}"
    }
}
