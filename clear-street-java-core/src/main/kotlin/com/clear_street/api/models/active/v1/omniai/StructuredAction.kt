// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

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
import com.clear_street.api.models.active.v1.screener.ScreenerFilter
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
 * Structured actions that Omni AI can return to clients.
 *
 * These actions provide machine-readable instructions for the client to execute, such as prefilling
 * an order ticket, opening a chart, or navigating to a route.
 */
@JsonDeserialize(using = StructuredAction.Deserializer::class)
@JsonSerialize(using = StructuredAction.Serializer::class)
class StructuredAction
private constructor(
    private val prefillOrder: PrefillOrder? = null,
    private val openChart: OpenChart? = null,
    private val openScreener: OpenScreener? = null,
    private val _json: JsonValue? = null,
) {

    /** Prefill an order ticket for user confirmation */
    fun prefillOrder(): Optional<PrefillOrder> = Optional.ofNullable(prefillOrder)

    /** Open a chart for a symbol */
    fun openChart(): Optional<OpenChart> = Optional.ofNullable(openChart)

    /** Open a stock screener with filters */
    fun openScreener(): Optional<OpenScreener> = Optional.ofNullable(openScreener)

    fun isPrefillOrder(): Boolean = prefillOrder != null

    fun isOpenChart(): Boolean = openChart != null

    fun isOpenScreener(): Boolean = openScreener != null

    /** Prefill an order ticket for user confirmation */
    fun asPrefillOrder(): PrefillOrder = prefillOrder.getOrThrow("prefillOrder")

    /** Open a chart for a symbol */
    fun asOpenChart(): OpenChart = openChart.getOrThrow("openChart")

    /** Open a stock screener with filters */
    fun asOpenScreener(): OpenScreener = openScreener.getOrThrow("openScreener")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            prefillOrder != null -> visitor.visitPrefillOrder(prefillOrder)
            openChart != null -> visitor.visitOpenChart(openChart)
            openScreener != null -> visitor.visitOpenScreener(openScreener)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): StructuredAction = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitPrefillOrder(prefillOrder: PrefillOrder) {
                    prefillOrder.validate()
                }

                override fun visitOpenChart(openChart: OpenChart) {
                    openChart.validate()
                }

                override fun visitOpenScreener(openScreener: OpenScreener) {
                    openScreener.validate()
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
                override fun visitPrefillOrder(prefillOrder: PrefillOrder) = prefillOrder.validity()

                override fun visitOpenChart(openChart: OpenChart) = openChart.validity()

                override fun visitOpenScreener(openScreener: OpenScreener) = openScreener.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StructuredAction &&
            prefillOrder == other.prefillOrder &&
            openChart == other.openChart &&
            openScreener == other.openScreener
    }

    override fun hashCode(): Int = Objects.hash(prefillOrder, openChart, openScreener)

    override fun toString(): String =
        when {
            prefillOrder != null -> "StructuredAction{prefillOrder=$prefillOrder}"
            openChart != null -> "StructuredAction{openChart=$openChart}"
            openScreener != null -> "StructuredAction{openScreener=$openScreener}"
            _json != null -> "StructuredAction{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid StructuredAction")
        }

    companion object {

        /** Prefill an order ticket for user confirmation */
        @JvmStatic
        fun ofPrefillOrder(prefillOrder: PrefillOrder) =
            StructuredAction(prefillOrder = prefillOrder)

        /** Open a chart for a symbol */
        @JvmStatic fun ofOpenChart(openChart: OpenChart) = StructuredAction(openChart = openChart)

        /** Open a stock screener with filters */
        @JvmStatic
        fun ofOpenScreener(openScreener: OpenScreener) =
            StructuredAction(openScreener = openScreener)
    }

    /**
     * An interface that defines how to map each variant of [StructuredAction] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** Prefill an order ticket for user confirmation */
        fun visitPrefillOrder(prefillOrder: PrefillOrder): T

        /** Open a chart for a symbol */
        fun visitOpenChart(openChart: OpenChart): T

        /** Open a stock screener with filters */
        fun visitOpenScreener(openScreener: OpenScreener): T

        /**
         * Maps an unknown variant of [StructuredAction] to a value of type [T].
         *
         * An instance of [StructuredAction] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws ClearStreetInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw ClearStreetInvalidDataException("Unknown StructuredAction: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<StructuredAction>(StructuredAction::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): StructuredAction {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<PrefillOrder>())?.let {
                            StructuredAction(prefillOrder = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<OpenChart>())?.let {
                            StructuredAction(openChart = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<OpenScreener>())?.let {
                            StructuredAction(openScreener = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> StructuredAction(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<StructuredAction>(StructuredAction::class) {

        override fun serialize(
            value: StructuredAction,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.prefillOrder != null -> generator.writeObject(value.prefillOrder)
                value.openChart != null -> generator.writeObject(value.openChart)
                value.openScreener != null -> generator.writeObject(value.openScreener)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid StructuredAction")
            }
        }
    }

    /** Prefill an order ticket for user confirmation */
    class PrefillOrder
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val orders: JsonField<List<OrderPayload>>,
        private val accountId: JsonField<Long>,
        private val actionType: JsonField<ActionType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("orders")
            @ExcludeMissing
            orders: JsonField<List<OrderPayload>> = JsonMissing.of(),
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("action_type")
            @ExcludeMissing
            actionType: JsonField<ActionType> = JsonMissing.of(),
        ) : this(orders, accountId, actionType, mutableMapOf())

        fun toPrefillOrderAction(): PrefillOrderAction =
            PrefillOrderAction.builder().orders(orders).accountId(accountId).build()

        /**
         * The orders to prefill
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun orders(): List<OrderPayload> = orders.getRequired("orders")

        /**
         * Account to prefill for (if known from context)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountId(): Optional<Long> = accountId.getOptional("account_id")

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
        fun _orders(): JsonField<List<OrderPayload>> = orders

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<Long> = accountId

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
             * Returns a mutable builder for constructing an instance of [PrefillOrder].
             *
             * The following fields are required:
             * ```java
             * .orders()
             * .actionType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PrefillOrder]. */
        class Builder internal constructor() {

            private var orders: JsonField<MutableList<OrderPayload>>? = null
            private var accountId: JsonField<Long> = JsonMissing.of()
            private var actionType: JsonField<ActionType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(prefillOrder: PrefillOrder) = apply {
                orders = prefillOrder.orders.map { it.toMutableList() }
                accountId = prefillOrder.accountId
                actionType = prefillOrder.actionType
                additionalProperties = prefillOrder.additionalProperties.toMutableMap()
            }

            /** The orders to prefill */
            fun orders(orders: List<OrderPayload>) = orders(JsonField.of(orders))

            /**
             * Sets [Builder.orders] to an arbitrary JSON value.
             *
             * You should usually call [Builder.orders] with a well-typed `List<OrderPayload>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun orders(orders: JsonField<List<OrderPayload>>) = apply {
                this.orders = orders.map { it.toMutableList() }
            }

            /**
             * Adds a single [OrderPayload] to [orders].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOrder(order: OrderPayload) = apply {
                orders =
                    (orders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("orders", it).add(order)
                    }
            }

            /** Account to prefill for (if known from context) */
            fun accountId(accountId: Long?) = accountId(JsonField.ofNullable(accountId))

            /**
             * Alias for [Builder.accountId].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun accountId(accountId: Long) = accountId(accountId as Long?)

            /** Alias for calling [Builder.accountId] with `accountId.orElse(null)`. */
            fun accountId(accountId: Optional<Long>) = accountId(accountId.getOrNull())

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<Long>) = apply { this.accountId = accountId }

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
             * Returns an immutable instance of [PrefillOrder].
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
            fun build(): PrefillOrder =
                PrefillOrder(
                    checkRequired("orders", orders).map { it.toImmutable() },
                    accountId,
                    checkRequired("actionType", actionType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PrefillOrder = apply {
            if (validated) {
                return@apply
            }

            orders().forEach { it.validate() }
            accountId()
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
                (if (accountId.asKnown().isPresent) 1 else 0) +
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

                @JvmField val PREFILL_ORDER = of("prefill_order")

                @JvmStatic fun of(value: String) = ActionType(JsonField.of(value))
            }

            /** An enum containing [ActionType]'s known values. */
            enum class Known {
                PREFILL_ORDER
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
                PREFILL_ORDER,
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
                    PREFILL_ORDER -> Value.PREFILL_ORDER
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
                    PREFILL_ORDER -> Known.PREFILL_ORDER
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

            return other is PrefillOrder &&
                orders == other.orders &&
                accountId == other.accountId &&
                actionType == other.actionType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(orders, accountId, actionType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PrefillOrder{orders=$orders, accountId=$accountId, actionType=$actionType, additionalProperties=$additionalProperties}"
    }

    /** Open a chart for a symbol */
    class OpenChart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val symbol: JsonField<String>,
        private val extras: JsonValue,
        private val timeframe: JsonField<String>,
        private val actionType: JsonField<ActionType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("symbol") @ExcludeMissing symbol: JsonField<String> = JsonMissing.of(),
            @JsonProperty("extras") @ExcludeMissing extras: JsonValue = JsonMissing.of(),
            @JsonProperty("timeframe")
            @ExcludeMissing
            timeframe: JsonField<String> = JsonMissing.of(),
            @JsonProperty("action_type")
            @ExcludeMissing
            actionType: JsonField<ActionType> = JsonMissing.of(),
        ) : this(symbol, extras, timeframe, actionType, mutableMapOf())

        fun toOpenChartAction(): OpenChartAction =
            OpenChartAction.builder().symbol(symbol).extras(extras).timeframe(timeframe).build()

        /**
         * Trading symbol to chart
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun symbol(): String = symbol.getRequired("symbol")

        /**
         * Additional chart configuration (indicators, overlays, etc.)
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = openChart.extras().convert(MyClass.class);
         * ```
         */
        @JsonProperty("extras") @ExcludeMissing fun _extras(): JsonValue = extras

        /**
         * Chart timeframe (e.g., "1D", "1W", "1M", "3M", "1Y", "5Y")
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun timeframe(): Optional<String> = timeframe.getOptional("timeframe")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun actionType(): ActionType = actionType.getRequired("action_type")

        /**
         * Returns the raw JSON value of [symbol].
         *
         * Unlike [symbol], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("symbol") @ExcludeMissing fun _symbol(): JsonField<String> = symbol

        /**
         * Returns the raw JSON value of [timeframe].
         *
         * Unlike [timeframe], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timeframe") @ExcludeMissing fun _timeframe(): JsonField<String> = timeframe

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
             * Returns a mutable builder for constructing an instance of [OpenChart].
             *
             * The following fields are required:
             * ```java
             * .symbol()
             * .actionType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OpenChart]. */
        class Builder internal constructor() {

            private var symbol: JsonField<String>? = null
            private var extras: JsonValue = JsonMissing.of()
            private var timeframe: JsonField<String> = JsonMissing.of()
            private var actionType: JsonField<ActionType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(openChart: OpenChart) = apply {
                symbol = openChart.symbol
                extras = openChart.extras
                timeframe = openChart.timeframe
                actionType = openChart.actionType
                additionalProperties = openChart.additionalProperties.toMutableMap()
            }

            /** Trading symbol to chart */
            fun symbol(symbol: String) = symbol(JsonField.of(symbol))

            /**
             * Sets [Builder.symbol] to an arbitrary JSON value.
             *
             * You should usually call [Builder.symbol] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun symbol(symbol: JsonField<String>) = apply { this.symbol = symbol }

            /** Additional chart configuration (indicators, overlays, etc.) */
            fun extras(extras: JsonValue) = apply { this.extras = extras }

            /** Chart timeframe (e.g., "1D", "1W", "1M", "3M", "1Y", "5Y") */
            fun timeframe(timeframe: String?) = timeframe(JsonField.ofNullable(timeframe))

            /** Alias for calling [Builder.timeframe] with `timeframe.orElse(null)`. */
            fun timeframe(timeframe: Optional<String>) = timeframe(timeframe.getOrNull())

            /**
             * Sets [Builder.timeframe] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeframe] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timeframe(timeframe: JsonField<String>) = apply { this.timeframe = timeframe }

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
             * Returns an immutable instance of [OpenChart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .symbol()
             * .actionType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OpenChart =
                OpenChart(
                    checkRequired("symbol", symbol),
                    extras,
                    timeframe,
                    checkRequired("actionType", actionType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OpenChart = apply {
            if (validated) {
                return@apply
            }

            symbol()
            timeframe()
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
            (if (symbol.asKnown().isPresent) 1 else 0) +
                (if (timeframe.asKnown().isPresent) 1 else 0) +
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

                @JvmField val OPEN_CHART = of("open_chart")

                @JvmStatic fun of(value: String) = ActionType(JsonField.of(value))
            }

            /** An enum containing [ActionType]'s known values. */
            enum class Known {
                OPEN_CHART
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
                OPEN_CHART,
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
                    OPEN_CHART -> Value.OPEN_CHART
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
                    OPEN_CHART -> Known.OPEN_CHART
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

            return other is OpenChart &&
                symbol == other.symbol &&
                extras == other.extras &&
                timeframe == other.timeframe &&
                actionType == other.actionType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(symbol, extras, timeframe, actionType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OpenChart{symbol=$symbol, extras=$extras, timeframe=$timeframe, actionType=$actionType, additionalProperties=$additionalProperties}"
    }

    /** Open a stock screener with filters */
    class OpenScreener
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val filters: JsonField<List<ScreenerFilter>>,
        private val fieldFilter: JsonField<List<String>>,
        private val pageSize: JsonField<Int>,
        private val sortBy: JsonField<String>,
        private val sortDirection: JsonField<String>,
        private val actionType: JsonField<ActionType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<ScreenerFilter>> = JsonMissing.of(),
            @JsonProperty("field_filter")
            @ExcludeMissing
            fieldFilter: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("page_size") @ExcludeMissing pageSize: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("sort_by") @ExcludeMissing sortBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sort_direction")
            @ExcludeMissing
            sortDirection: JsonField<String> = JsonMissing.of(),
            @JsonProperty("action_type")
            @ExcludeMissing
            actionType: JsonField<ActionType> = JsonMissing.of(),
        ) : this(filters, fieldFilter, pageSize, sortBy, sortDirection, actionType, mutableMapOf())

        fun toOpenScreenerAction(): OpenScreenerAction =
            OpenScreenerAction.builder()
                .filters(filters)
                .fieldFilter(fieldFilter)
                .pageSize(pageSize)
                .sortBy(sortBy)
                .sortDirection(sortDirection)
                .build()

        /**
         * Filter criteria for the screener
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filters(): List<ScreenerFilter> = filters.getRequired("filters")

        /**
         * Optional field/column selection for screener results.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fieldFilter(): Optional<List<String>> = fieldFilter.getOptional("field_filter")

        /**
         * Optional page size.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pageSize(): Optional<Int> = pageSize.getOptional("page_size")

        /**
         * Optional sort field for screener rows.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sortBy(): Optional<String> = sortBy.getOptional("sort_by")

        /**
         * Optional sort direction (`ASC` or `DESC`).
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun sortDirection(): Optional<String> = sortDirection.getOptional("sort_direction")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun actionType(): ActionType = actionType.getRequired("action_type")

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters")
        @ExcludeMissing
        fun _filters(): JsonField<List<ScreenerFilter>> = filters

        /**
         * Returns the raw JSON value of [fieldFilter].
         *
         * Unlike [fieldFilter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field_filter")
        @ExcludeMissing
        fun _fieldFilter(): JsonField<List<String>> = fieldFilter

        /**
         * Returns the raw JSON value of [pageSize].
         *
         * Unlike [pageSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("page_size") @ExcludeMissing fun _pageSize(): JsonField<Int> = pageSize

        /**
         * Returns the raw JSON value of [sortBy].
         *
         * Unlike [sortBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sort_by") @ExcludeMissing fun _sortBy(): JsonField<String> = sortBy

        /**
         * Returns the raw JSON value of [sortDirection].
         *
         * Unlike [sortDirection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sort_direction")
        @ExcludeMissing
        fun _sortDirection(): JsonField<String> = sortDirection

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
             * Returns a mutable builder for constructing an instance of [OpenScreener].
             *
             * The following fields are required:
             * ```java
             * .filters()
             * .actionType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OpenScreener]. */
        class Builder internal constructor() {

            private var filters: JsonField<MutableList<ScreenerFilter>>? = null
            private var fieldFilter: JsonField<MutableList<String>>? = null
            private var pageSize: JsonField<Int> = JsonMissing.of()
            private var sortBy: JsonField<String> = JsonMissing.of()
            private var sortDirection: JsonField<String> = JsonMissing.of()
            private var actionType: JsonField<ActionType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(openScreener: OpenScreener) = apply {
                filters = openScreener.filters.map { it.toMutableList() }
                fieldFilter = openScreener.fieldFilter.map { it.toMutableList() }
                pageSize = openScreener.pageSize
                sortBy = openScreener.sortBy
                sortDirection = openScreener.sortDirection
                actionType = openScreener.actionType
                additionalProperties = openScreener.additionalProperties.toMutableMap()
            }

            /** Filter criteria for the screener */
            fun filters(filters: List<ScreenerFilter>) = filters(JsonField.of(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<ScreenerFilter>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun filters(filters: JsonField<List<ScreenerFilter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Adds a single [ScreenerFilter] to [filters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: ScreenerFilter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filters", it).add(filter)
                    }
            }

            /** Optional field/column selection for screener results. */
            fun fieldFilter(fieldFilter: List<String>?) =
                fieldFilter(JsonField.ofNullable(fieldFilter))

            /** Alias for calling [Builder.fieldFilter] with `fieldFilter.orElse(null)`. */
            fun fieldFilter(fieldFilter: Optional<List<String>>) =
                fieldFilter(fieldFilter.getOrNull())

            /**
             * Sets [Builder.fieldFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fieldFilter] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fieldFilter(fieldFilter: JsonField<List<String>>) = apply {
                this.fieldFilter = fieldFilter.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.fieldFilter].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFieldFilter(fieldFilter: String) = apply {
                this.fieldFilter =
                    (this.fieldFilter ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fieldFilter", it).add(fieldFilter)
                    }
            }

            /** Optional page size. */
            fun pageSize(pageSize: Int?) = pageSize(JsonField.ofNullable(pageSize))

            /**
             * Alias for [Builder.pageSize].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

            /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
            fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

            /**
             * Sets [Builder.pageSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pageSize] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pageSize(pageSize: JsonField<Int>) = apply { this.pageSize = pageSize }

            /** Optional sort field for screener rows. */
            fun sortBy(sortBy: String?) = sortBy(JsonField.ofNullable(sortBy))

            /** Alias for calling [Builder.sortBy] with `sortBy.orElse(null)`. */
            fun sortBy(sortBy: Optional<String>) = sortBy(sortBy.getOrNull())

            /**
             * Sets [Builder.sortBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortBy] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sortBy(sortBy: JsonField<String>) = apply { this.sortBy = sortBy }

            /** Optional sort direction (`ASC` or `DESC`). */
            fun sortDirection(sortDirection: String?) =
                sortDirection(JsonField.ofNullable(sortDirection))

            /** Alias for calling [Builder.sortDirection] with `sortDirection.orElse(null)`. */
            fun sortDirection(sortDirection: Optional<String>) =
                sortDirection(sortDirection.getOrNull())

            /**
             * Sets [Builder.sortDirection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortDirection] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sortDirection(sortDirection: JsonField<String>) = apply {
                this.sortDirection = sortDirection
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
             * Returns an immutable instance of [OpenScreener].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .filters()
             * .actionType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OpenScreener =
                OpenScreener(
                    checkRequired("filters", filters).map { it.toImmutable() },
                    (fieldFilter ?: JsonMissing.of()).map { it.toImmutable() },
                    pageSize,
                    sortBy,
                    sortDirection,
                    checkRequired("actionType", actionType),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OpenScreener = apply {
            if (validated) {
                return@apply
            }

            filters().forEach { it.validate() }
            fieldFilter()
            pageSize()
            sortBy()
            sortDirection()
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
            (filters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (fieldFilter.asKnown().getOrNull()?.size ?: 0) +
                (if (pageSize.asKnown().isPresent) 1 else 0) +
                (if (sortBy.asKnown().isPresent) 1 else 0) +
                (if (sortDirection.asKnown().isPresent) 1 else 0) +
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

                @JvmField val OPEN_SCREENER = of("open_screener")

                @JvmStatic fun of(value: String) = ActionType(JsonField.of(value))
            }

            /** An enum containing [ActionType]'s known values. */
            enum class Known {
                OPEN_SCREENER
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
                OPEN_SCREENER,
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
                    OPEN_SCREENER -> Value.OPEN_SCREENER
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
                    OPEN_SCREENER -> Known.OPEN_SCREENER
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

            return other is OpenScreener &&
                filters == other.filters &&
                fieldFilter == other.fieldFilter &&
                pageSize == other.pageSize &&
                sortBy == other.sortBy &&
                sortDirection == other.sortDirection &&
                actionType == other.actionType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                filters,
                fieldFilter,
                pageSize,
                sortBy,
                sortDirection,
                actionType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OpenScreener{filters=$filters, fieldFilter=$fieldFilter, pageSize=$pageSize, sortBy=$sortBy, sortDirection=$sortDirection, actionType=$actionType, additionalProperties=$additionalProperties}"
    }
}
