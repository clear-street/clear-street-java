// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.accounts.orders

import com.clear_street.api.core.BaseDeserializer
import com.clear_street.api.core.BaseSerializer
import com.clear_street.api.core.Enum
import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.allMaxBy
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.getOrThrow
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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Execution strategy for an order
 *
 * Defines advanced routing and execution logic beyond simple order types. The strategy type
 * determines which parameters are available and required.
 */
@JsonDeserialize(using = OrderStrategy.Deserializer::class)
@JsonSerialize(using = OrderStrategy.Serializer::class)
class OrderStrategy
private constructor(
    private val sor: Sor? = null,
    private val vwap: Vwap? = null,
    private val twap: Twap? = null,
    private val ap: Ap? = null,
    private val pov: Pov? = null,
    private val dark: Dark? = null,
    private val dma: Dma? = null,
    private val _json: JsonValue? = null,
) {

    /** Smart Order Router (default) - routes to best available venue */
    fun sor(): Optional<Sor> = Optional.ofNullable(sor)

    /** Volume Weighted Average Price - matches VWAP over a period */
    fun vwap(): Optional<Vwap> = Optional.ofNullable(vwap)

    /** Time Weighted Average Price - spreads execution evenly over time */
    fun twap(): Optional<Twap> = Optional.ofNullable(twap)

    /** Arrival Price - aims to match price at order placement time */
    fun ap(): Optional<Ap> = Optional.ofNullable(ap)

    /** Percentage of Volume - participates as a percentage of market volume */
    fun pov(): Optional<Pov> = Optional.ofNullable(pov)

    /** Dark Pool - routes to dark pool venues */
    fun dark(): Optional<Dark> = Optional.ofNullable(dark)

    /** Direct Market Access - sends directly to a specified exchange */
    fun dma(): Optional<Dma> = Optional.ofNullable(dma)

    fun isSor(): Boolean = sor != null

    fun isVwap(): Boolean = vwap != null

    fun isTwap(): Boolean = twap != null

    fun isAp(): Boolean = ap != null

    fun isPov(): Boolean = pov != null

    fun isDark(): Boolean = dark != null

    fun isDma(): Boolean = dma != null

    /** Smart Order Router (default) - routes to best available venue */
    fun asSor(): Sor = sor.getOrThrow("sor")

    /** Volume Weighted Average Price - matches VWAP over a period */
    fun asVwap(): Vwap = vwap.getOrThrow("vwap")

    /** Time Weighted Average Price - spreads execution evenly over time */
    fun asTwap(): Twap = twap.getOrThrow("twap")

    /** Arrival Price - aims to match price at order placement time */
    fun asAp(): Ap = ap.getOrThrow("ap")

    /** Percentage of Volume - participates as a percentage of market volume */
    fun asPov(): Pov = pov.getOrThrow("pov")

    /** Dark Pool - routes to dark pool venues */
    fun asDark(): Dark = dark.getOrThrow("dark")

    /** Direct Market Access - sends directly to a specified exchange */
    fun asDma(): Dma = dma.getOrThrow("dma")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            sor != null -> visitor.visitSor(sor)
            vwap != null -> visitor.visitVwap(vwap)
            twap != null -> visitor.visitTwap(twap)
            ap != null -> visitor.visitAp(ap)
            pov != null -> visitor.visitPov(pov)
            dark != null -> visitor.visitDark(dark)
            dma != null -> visitor.visitDma(dma)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): OrderStrategy = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitSor(sor: Sor) {
                    sor.validate()
                }

                override fun visitVwap(vwap: Vwap) {
                    vwap.validate()
                }

                override fun visitTwap(twap: Twap) {
                    twap.validate()
                }

                override fun visitAp(ap: Ap) {
                    ap.validate()
                }

                override fun visitPov(pov: Pov) {
                    pov.validate()
                }

                override fun visitDark(dark: Dark) {
                    dark.validate()
                }

                override fun visitDma(dma: Dma) {
                    dma.validate()
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
                override fun visitSor(sor: Sor) = sor.validity()

                override fun visitVwap(vwap: Vwap) = vwap.validity()

                override fun visitTwap(twap: Twap) = twap.validity()

                override fun visitAp(ap: Ap) = ap.validity()

                override fun visitPov(pov: Pov) = pov.validity()

                override fun visitDark(dark: Dark) = dark.validity()

                override fun visitDma(dma: Dma) = dma.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OrderStrategy &&
            sor == other.sor &&
            vwap == other.vwap &&
            twap == other.twap &&
            ap == other.ap &&
            pov == other.pov &&
            dark == other.dark &&
            dma == other.dma
    }

    override fun hashCode(): Int = Objects.hash(sor, vwap, twap, ap, pov, dark, dma)

    override fun toString(): String =
        when {
            sor != null -> "OrderStrategy{sor=$sor}"
            vwap != null -> "OrderStrategy{vwap=$vwap}"
            twap != null -> "OrderStrategy{twap=$twap}"
            ap != null -> "OrderStrategy{ap=$ap}"
            pov != null -> "OrderStrategy{pov=$pov}"
            dark != null -> "OrderStrategy{dark=$dark}"
            dma != null -> "OrderStrategy{dma=$dma}"
            _json != null -> "OrderStrategy{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid OrderStrategy")
        }

    companion object {

        /** Smart Order Router (default) - routes to best available venue */
        @JvmStatic fun ofSor(sor: Sor) = OrderStrategy(sor = sor)

        /** Volume Weighted Average Price - matches VWAP over a period */
        @JvmStatic fun ofVwap(vwap: Vwap) = OrderStrategy(vwap = vwap)

        /** Time Weighted Average Price - spreads execution evenly over time */
        @JvmStatic fun ofTwap(twap: Twap) = OrderStrategy(twap = twap)

        /** Arrival Price - aims to match price at order placement time */
        @JvmStatic fun ofAp(ap: Ap) = OrderStrategy(ap = ap)

        /** Percentage of Volume - participates as a percentage of market volume */
        @JvmStatic fun ofPov(pov: Pov) = OrderStrategy(pov = pov)

        /** Dark Pool - routes to dark pool venues */
        @JvmStatic fun ofDark(dark: Dark) = OrderStrategy(dark = dark)

        /** Direct Market Access - sends directly to a specified exchange */
        @JvmStatic fun ofDma(dma: Dma) = OrderStrategy(dma = dma)
    }

    /**
     * An interface that defines how to map each variant of [OrderStrategy] to a value of type [T].
     */
    interface Visitor<out T> {

        /** Smart Order Router (default) - routes to best available venue */
        fun visitSor(sor: Sor): T

        /** Volume Weighted Average Price - matches VWAP over a period */
        fun visitVwap(vwap: Vwap): T

        /** Time Weighted Average Price - spreads execution evenly over time */
        fun visitTwap(twap: Twap): T

        /** Arrival Price - aims to match price at order placement time */
        fun visitAp(ap: Ap): T

        /** Percentage of Volume - participates as a percentage of market volume */
        fun visitPov(pov: Pov): T

        /** Dark Pool - routes to dark pool venues */
        fun visitDark(dark: Dark): T

        /** Direct Market Access - sends directly to a specified exchange */
        fun visitDma(dma: Dma): T

        /**
         * Maps an unknown variant of [OrderStrategy] to a value of type [T].
         *
         * An instance of [OrderStrategy] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws ClearStreetInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw ClearStreetInvalidDataException("Unknown OrderStrategy: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<OrderStrategy>(OrderStrategy::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): OrderStrategy {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<Sor>())?.let {
                            OrderStrategy(sor = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Vwap>())?.let {
                            OrderStrategy(vwap = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Twap>())?.let {
                            OrderStrategy(twap = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Ap>())?.let {
                            OrderStrategy(ap = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Pov>())?.let {
                            OrderStrategy(pov = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Dark>())?.let {
                            OrderStrategy(dark = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Dma>())?.let {
                            OrderStrategy(dma = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> OrderStrategy(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<OrderStrategy>(OrderStrategy::class) {

        override fun serialize(
            value: OrderStrategy,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.sor != null -> generator.writeObject(value.sor)
                value.vwap != null -> generator.writeObject(value.vwap)
                value.twap != null -> generator.writeObject(value.twap)
                value.ap != null -> generator.writeObject(value.ap)
                value.pov != null -> generator.writeObject(value.pov)
                value.dark != null -> generator.writeObject(value.dark)
                value.dma != null -> generator.writeObject(value.dma)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid OrderStrategy")
            }
        }
    }

    /** Smart Order Router (default) - routes to best available venue */
    class Sor
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<OffsetDateTime>,
        private val startAt: JsonField<OffsetDateTime>,
        private val urgency: JsonField<Urgency>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at")
            @ExcludeMissing
            endAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_at")
            @ExcludeMissing
            startAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("urgency") @ExcludeMissing urgency: JsonField<Urgency> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(endAt, startAt, urgency, type, mutableMapOf())

        fun toBaseStrategyParams(): BaseStrategyParams =
            BaseStrategyParams.builder().endAt(endAt).startAt(startAt).urgency(urgency).build()

        /**
         * UTC timestamp to end execution (defaults to market close)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endAt(): Optional<OffsetDateTime> = endAt.getOptional("end_at")

        /**
         * UTC timestamp to start execution (defaults to order placement time)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startAt(): Optional<OffsetDateTime> = startAt.getOptional("start_at")

        /**
         * Urgency level for execution aggressiveness
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun urgency(): Optional<Urgency> = urgency.getOptional("urgency")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<OffsetDateTime> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at")
        @ExcludeMissing
        fun _startAt(): JsonField<OffsetDateTime> = startAt

        /**
         * Returns the raw JSON value of [urgency].
         *
         * Unlike [urgency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urgency") @ExcludeMissing fun _urgency(): JsonField<Urgency> = urgency

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Sor].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Sor]. */
        class Builder internal constructor() {

            private var endAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var urgency: JsonField<Urgency> = JsonMissing.of()
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sor: Sor) = apply {
                endAt = sor.endAt
                startAt = sor.startAt
                urgency = sor.urgency
                type = sor.type
                additionalProperties = sor.additionalProperties.toMutableMap()
            }

            /** UTC timestamp to end execution (defaults to market close) */
            fun endAt(endAt: OffsetDateTime?) = endAt(JsonField.ofNullable(endAt))

            /** Alias for calling [Builder.endAt] with `endAt.orElse(null)`. */
            fun endAt(endAt: Optional<OffsetDateTime>) = endAt(endAt.getOrNull())

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endAt(endAt: JsonField<OffsetDateTime>) = apply { this.endAt = endAt }

            /** UTC timestamp to start execution (defaults to order placement time) */
            fun startAt(startAt: OffsetDateTime?) = startAt(JsonField.ofNullable(startAt))

            /** Alias for calling [Builder.startAt] with `startAt.orElse(null)`. */
            fun startAt(startAt: Optional<OffsetDateTime>) = startAt(startAt.getOrNull())

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<OffsetDateTime>) = apply { this.startAt = startAt }

            /** Urgency level for execution aggressiveness */
            fun urgency(urgency: Urgency) = urgency(JsonField.of(urgency))

            /**
             * Sets [Builder.urgency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urgency] with a well-typed [Urgency] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urgency(urgency: JsonField<Urgency>) = apply { this.urgency = urgency }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Sor].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Sor =
                Sor(
                    endAt,
                    startAt,
                    urgency,
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Sor = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
            urgency().ifPresent { it.validate() }
            type().validate()
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
            (if (endAt.asKnown().isPresent) 1 else 0) +
                (if (startAt.asKnown().isPresent) 1 else 0) +
                (urgency.asKnown().getOrNull()?.validity() ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val SOR = of("SOR")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                SOR
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SOR,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    SOR -> Value.SOR
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
                    SOR -> Known.SOR
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Sor &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                urgency == other.urgency &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(endAt, startAt, urgency, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Sor{endAt=$endAt, startAt=$startAt, urgency=$urgency, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Volume Weighted Average Price - matches VWAP over a period */
    class Vwap
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<OffsetDateTime>,
        private val startAt: JsonField<OffsetDateTime>,
        private val urgency: JsonField<Urgency>,
        private val maxPercent: JsonField<String>,
        private val minPercent: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at")
            @ExcludeMissing
            endAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_at")
            @ExcludeMissing
            startAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("urgency") @ExcludeMissing urgency: JsonField<Urgency> = JsonMissing.of(),
            @JsonProperty("max_percent")
            @ExcludeMissing
            maxPercent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("min_percent")
            @ExcludeMissing
            minPercent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(endAt, startAt, urgency, maxPercent, minPercent, type, mutableMapOf())

        fun toVwapStrategy(): VwapStrategy =
            VwapStrategy.builder()
                .endAt(endAt)
                .startAt(startAt)
                .urgency(urgency)
                .maxPercent(maxPercent)
                .minPercent(minPercent)
                .build()

        /**
         * UTC timestamp to end execution (defaults to market close)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endAt(): Optional<OffsetDateTime> = endAt.getOptional("end_at")

        /**
         * UTC timestamp to start execution (defaults to order placement time)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startAt(): Optional<OffsetDateTime> = startAt.getOptional("start_at")

        /**
         * Urgency level for execution aggressiveness
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun urgency(): Optional<Urgency> = urgency.getOptional("urgency")

        /**
         * Maximum percentage of market volume to participate in (0-50)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxPercent(): Optional<String> = maxPercent.getOptional("max_percent")

        /**
         * Minimum percentage of market volume to participate in (0-100)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun minPercent(): Optional<String> = minPercent.getOptional("min_percent")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<OffsetDateTime> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at")
        @ExcludeMissing
        fun _startAt(): JsonField<OffsetDateTime> = startAt

        /**
         * Returns the raw JSON value of [urgency].
         *
         * Unlike [urgency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urgency") @ExcludeMissing fun _urgency(): JsonField<Urgency> = urgency

        /**
         * Returns the raw JSON value of [maxPercent].
         *
         * Unlike [maxPercent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_percent")
        @ExcludeMissing
        fun _maxPercent(): JsonField<String> = maxPercent

        /**
         * Returns the raw JSON value of [minPercent].
         *
         * Unlike [minPercent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("min_percent")
        @ExcludeMissing
        fun _minPercent(): JsonField<String> = minPercent

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Vwap].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Vwap]. */
        class Builder internal constructor() {

            private var endAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var urgency: JsonField<Urgency> = JsonMissing.of()
            private var maxPercent: JsonField<String> = JsonMissing.of()
            private var minPercent: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(vwap: Vwap) = apply {
                endAt = vwap.endAt
                startAt = vwap.startAt
                urgency = vwap.urgency
                maxPercent = vwap.maxPercent
                minPercent = vwap.minPercent
                type = vwap.type
                additionalProperties = vwap.additionalProperties.toMutableMap()
            }

            /** UTC timestamp to end execution (defaults to market close) */
            fun endAt(endAt: OffsetDateTime?) = endAt(JsonField.ofNullable(endAt))

            /** Alias for calling [Builder.endAt] with `endAt.orElse(null)`. */
            fun endAt(endAt: Optional<OffsetDateTime>) = endAt(endAt.getOrNull())

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endAt(endAt: JsonField<OffsetDateTime>) = apply { this.endAt = endAt }

            /** UTC timestamp to start execution (defaults to order placement time) */
            fun startAt(startAt: OffsetDateTime?) = startAt(JsonField.ofNullable(startAt))

            /** Alias for calling [Builder.startAt] with `startAt.orElse(null)`. */
            fun startAt(startAt: Optional<OffsetDateTime>) = startAt(startAt.getOrNull())

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<OffsetDateTime>) = apply { this.startAt = startAt }

            /** Urgency level for execution aggressiveness */
            fun urgency(urgency: Urgency) = urgency(JsonField.of(urgency))

            /**
             * Sets [Builder.urgency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urgency] with a well-typed [Urgency] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urgency(urgency: JsonField<Urgency>) = apply { this.urgency = urgency }

            /** Maximum percentage of market volume to participate in (0-50) */
            fun maxPercent(maxPercent: String?) = maxPercent(JsonField.ofNullable(maxPercent))

            /** Alias for calling [Builder.maxPercent] with `maxPercent.orElse(null)`. */
            fun maxPercent(maxPercent: Optional<String>) = maxPercent(maxPercent.getOrNull())

            /**
             * Sets [Builder.maxPercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxPercent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxPercent(maxPercent: JsonField<String>) = apply { this.maxPercent = maxPercent }

            /** Minimum percentage of market volume to participate in (0-100) */
            fun minPercent(minPercent: String?) = minPercent(JsonField.ofNullable(minPercent))

            /** Alias for calling [Builder.minPercent] with `minPercent.orElse(null)`. */
            fun minPercent(minPercent: Optional<String>) = minPercent(minPercent.getOrNull())

            /**
             * Sets [Builder.minPercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minPercent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minPercent(minPercent: JsonField<String>) = apply { this.minPercent = minPercent }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Vwap].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Vwap =
                Vwap(
                    endAt,
                    startAt,
                    urgency,
                    maxPercent,
                    minPercent,
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Vwap = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
            urgency().ifPresent { it.validate() }
            maxPercent()
            minPercent()
            type().validate()
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
            (if (endAt.asKnown().isPresent) 1 else 0) +
                (if (startAt.asKnown().isPresent) 1 else 0) +
                (urgency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maxPercent.asKnown().isPresent) 1 else 0) +
                (if (minPercent.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val VWAP = of("VWAP")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                VWAP
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VWAP,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    VWAP -> Value.VWAP
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
                    VWAP -> Known.VWAP
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Vwap &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                urgency == other.urgency &&
                maxPercent == other.maxPercent &&
                minPercent == other.minPercent &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                endAt,
                startAt,
                urgency,
                maxPercent,
                minPercent,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Vwap{endAt=$endAt, startAt=$startAt, urgency=$urgency, maxPercent=$maxPercent, minPercent=$minPercent, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Time Weighted Average Price - spreads execution evenly over time */
    class Twap
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<OffsetDateTime>,
        private val startAt: JsonField<OffsetDateTime>,
        private val urgency: JsonField<Urgency>,
        private val maxPercent: JsonField<String>,
        private val minPercent: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at")
            @ExcludeMissing
            endAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_at")
            @ExcludeMissing
            startAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("urgency") @ExcludeMissing urgency: JsonField<Urgency> = JsonMissing.of(),
            @JsonProperty("max_percent")
            @ExcludeMissing
            maxPercent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("min_percent")
            @ExcludeMissing
            minPercent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(endAt, startAt, urgency, maxPercent, minPercent, type, mutableMapOf())

        fun toTwapStrategy(): TwapStrategy =
            TwapStrategy.builder()
                .endAt(endAt)
                .startAt(startAt)
                .urgency(urgency)
                .maxPercent(maxPercent)
                .minPercent(minPercent)
                .build()

        /**
         * UTC timestamp to end execution (defaults to market close)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endAt(): Optional<OffsetDateTime> = endAt.getOptional("end_at")

        /**
         * UTC timestamp to start execution (defaults to order placement time)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startAt(): Optional<OffsetDateTime> = startAt.getOptional("start_at")

        /**
         * Urgency level for execution aggressiveness
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun urgency(): Optional<Urgency> = urgency.getOptional("urgency")

        /**
         * Maximum percentage of market volume to participate in (0-50)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxPercent(): Optional<String> = maxPercent.getOptional("max_percent")

        /**
         * Minimum percentage of market volume to participate in (0-100)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun minPercent(): Optional<String> = minPercent.getOptional("min_percent")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<OffsetDateTime> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at")
        @ExcludeMissing
        fun _startAt(): JsonField<OffsetDateTime> = startAt

        /**
         * Returns the raw JSON value of [urgency].
         *
         * Unlike [urgency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urgency") @ExcludeMissing fun _urgency(): JsonField<Urgency> = urgency

        /**
         * Returns the raw JSON value of [maxPercent].
         *
         * Unlike [maxPercent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_percent")
        @ExcludeMissing
        fun _maxPercent(): JsonField<String> = maxPercent

        /**
         * Returns the raw JSON value of [minPercent].
         *
         * Unlike [minPercent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("min_percent")
        @ExcludeMissing
        fun _minPercent(): JsonField<String> = minPercent

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Twap].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Twap]. */
        class Builder internal constructor() {

            private var endAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var urgency: JsonField<Urgency> = JsonMissing.of()
            private var maxPercent: JsonField<String> = JsonMissing.of()
            private var minPercent: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(twap: Twap) = apply {
                endAt = twap.endAt
                startAt = twap.startAt
                urgency = twap.urgency
                maxPercent = twap.maxPercent
                minPercent = twap.minPercent
                type = twap.type
                additionalProperties = twap.additionalProperties.toMutableMap()
            }

            /** UTC timestamp to end execution (defaults to market close) */
            fun endAt(endAt: OffsetDateTime?) = endAt(JsonField.ofNullable(endAt))

            /** Alias for calling [Builder.endAt] with `endAt.orElse(null)`. */
            fun endAt(endAt: Optional<OffsetDateTime>) = endAt(endAt.getOrNull())

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endAt(endAt: JsonField<OffsetDateTime>) = apply { this.endAt = endAt }

            /** UTC timestamp to start execution (defaults to order placement time) */
            fun startAt(startAt: OffsetDateTime?) = startAt(JsonField.ofNullable(startAt))

            /** Alias for calling [Builder.startAt] with `startAt.orElse(null)`. */
            fun startAt(startAt: Optional<OffsetDateTime>) = startAt(startAt.getOrNull())

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<OffsetDateTime>) = apply { this.startAt = startAt }

            /** Urgency level for execution aggressiveness */
            fun urgency(urgency: Urgency) = urgency(JsonField.of(urgency))

            /**
             * Sets [Builder.urgency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urgency] with a well-typed [Urgency] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urgency(urgency: JsonField<Urgency>) = apply { this.urgency = urgency }

            /** Maximum percentage of market volume to participate in (0-50) */
            fun maxPercent(maxPercent: String?) = maxPercent(JsonField.ofNullable(maxPercent))

            /** Alias for calling [Builder.maxPercent] with `maxPercent.orElse(null)`. */
            fun maxPercent(maxPercent: Optional<String>) = maxPercent(maxPercent.getOrNull())

            /**
             * Sets [Builder.maxPercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxPercent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxPercent(maxPercent: JsonField<String>) = apply { this.maxPercent = maxPercent }

            /** Minimum percentage of market volume to participate in (0-100) */
            fun minPercent(minPercent: String?) = minPercent(JsonField.ofNullable(minPercent))

            /** Alias for calling [Builder.minPercent] with `minPercent.orElse(null)`. */
            fun minPercent(minPercent: Optional<String>) = minPercent(minPercent.getOrNull())

            /**
             * Sets [Builder.minPercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minPercent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minPercent(minPercent: JsonField<String>) = apply { this.minPercent = minPercent }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Twap].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Twap =
                Twap(
                    endAt,
                    startAt,
                    urgency,
                    maxPercent,
                    minPercent,
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Twap = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
            urgency().ifPresent { it.validate() }
            maxPercent()
            minPercent()
            type().validate()
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
            (if (endAt.asKnown().isPresent) 1 else 0) +
                (if (startAt.asKnown().isPresent) 1 else 0) +
                (urgency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maxPercent.asKnown().isPresent) 1 else 0) +
                (if (minPercent.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val TWAP = of("TWAP")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                TWAP
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TWAP,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    TWAP -> Value.TWAP
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
                    TWAP -> Known.TWAP
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Twap &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                urgency == other.urgency &&
                maxPercent == other.maxPercent &&
                minPercent == other.minPercent &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                endAt,
                startAt,
                urgency,
                maxPercent,
                minPercent,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Twap{endAt=$endAt, startAt=$startAt, urgency=$urgency, maxPercent=$maxPercent, minPercent=$minPercent, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Arrival Price - aims to match price at order placement time */
    class Ap
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<OffsetDateTime>,
        private val startAt: JsonField<OffsetDateTime>,
        private val urgency: JsonField<Urgency>,
        private val maxPercent: JsonField<String>,
        private val minPercent: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at")
            @ExcludeMissing
            endAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_at")
            @ExcludeMissing
            startAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("urgency") @ExcludeMissing urgency: JsonField<Urgency> = JsonMissing.of(),
            @JsonProperty("max_percent")
            @ExcludeMissing
            maxPercent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("min_percent")
            @ExcludeMissing
            minPercent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(endAt, startAt, urgency, maxPercent, minPercent, type, mutableMapOf())

        fun toApStrategy(): ApStrategy =
            ApStrategy.builder()
                .endAt(endAt)
                .startAt(startAt)
                .urgency(urgency)
                .maxPercent(maxPercent)
                .minPercent(minPercent)
                .build()

        /**
         * UTC timestamp to end execution (defaults to market close)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endAt(): Optional<OffsetDateTime> = endAt.getOptional("end_at")

        /**
         * UTC timestamp to start execution (defaults to order placement time)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startAt(): Optional<OffsetDateTime> = startAt.getOptional("start_at")

        /**
         * Urgency level for execution aggressiveness
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun urgency(): Optional<Urgency> = urgency.getOptional("urgency")

        /**
         * Maximum percentage of market volume to participate in (0-100)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxPercent(): Optional<String> = maxPercent.getOptional("max_percent")

        /**
         * Minimum percentage of market volume to participate in (0-100)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun minPercent(): Optional<String> = minPercent.getOptional("min_percent")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<OffsetDateTime> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at")
        @ExcludeMissing
        fun _startAt(): JsonField<OffsetDateTime> = startAt

        /**
         * Returns the raw JSON value of [urgency].
         *
         * Unlike [urgency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urgency") @ExcludeMissing fun _urgency(): JsonField<Urgency> = urgency

        /**
         * Returns the raw JSON value of [maxPercent].
         *
         * Unlike [maxPercent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_percent")
        @ExcludeMissing
        fun _maxPercent(): JsonField<String> = maxPercent

        /**
         * Returns the raw JSON value of [minPercent].
         *
         * Unlike [minPercent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("min_percent")
        @ExcludeMissing
        fun _minPercent(): JsonField<String> = minPercent

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Ap].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Ap]. */
        class Builder internal constructor() {

            private var endAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var urgency: JsonField<Urgency> = JsonMissing.of()
            private var maxPercent: JsonField<String> = JsonMissing.of()
            private var minPercent: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(ap: Ap) = apply {
                endAt = ap.endAt
                startAt = ap.startAt
                urgency = ap.urgency
                maxPercent = ap.maxPercent
                minPercent = ap.minPercent
                type = ap.type
                additionalProperties = ap.additionalProperties.toMutableMap()
            }

            /** UTC timestamp to end execution (defaults to market close) */
            fun endAt(endAt: OffsetDateTime?) = endAt(JsonField.ofNullable(endAt))

            /** Alias for calling [Builder.endAt] with `endAt.orElse(null)`. */
            fun endAt(endAt: Optional<OffsetDateTime>) = endAt(endAt.getOrNull())

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endAt(endAt: JsonField<OffsetDateTime>) = apply { this.endAt = endAt }

            /** UTC timestamp to start execution (defaults to order placement time) */
            fun startAt(startAt: OffsetDateTime?) = startAt(JsonField.ofNullable(startAt))

            /** Alias for calling [Builder.startAt] with `startAt.orElse(null)`. */
            fun startAt(startAt: Optional<OffsetDateTime>) = startAt(startAt.getOrNull())

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<OffsetDateTime>) = apply { this.startAt = startAt }

            /** Urgency level for execution aggressiveness */
            fun urgency(urgency: Urgency) = urgency(JsonField.of(urgency))

            /**
             * Sets [Builder.urgency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urgency] with a well-typed [Urgency] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urgency(urgency: JsonField<Urgency>) = apply { this.urgency = urgency }

            /** Maximum percentage of market volume to participate in (0-100) */
            fun maxPercent(maxPercent: String?) = maxPercent(JsonField.ofNullable(maxPercent))

            /** Alias for calling [Builder.maxPercent] with `maxPercent.orElse(null)`. */
            fun maxPercent(maxPercent: Optional<String>) = maxPercent(maxPercent.getOrNull())

            /**
             * Sets [Builder.maxPercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxPercent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxPercent(maxPercent: JsonField<String>) = apply { this.maxPercent = maxPercent }

            /** Minimum percentage of market volume to participate in (0-100) */
            fun minPercent(minPercent: String?) = minPercent(JsonField.ofNullable(minPercent))

            /** Alias for calling [Builder.minPercent] with `minPercent.orElse(null)`. */
            fun minPercent(minPercent: Optional<String>) = minPercent(minPercent.getOrNull())

            /**
             * Sets [Builder.minPercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minPercent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minPercent(minPercent: JsonField<String>) = apply { this.minPercent = minPercent }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Ap].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Ap =
                Ap(
                    endAt,
                    startAt,
                    urgency,
                    maxPercent,
                    minPercent,
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Ap = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
            urgency().ifPresent { it.validate() }
            maxPercent()
            minPercent()
            type().validate()
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
            (if (endAt.asKnown().isPresent) 1 else 0) +
                (if (startAt.asKnown().isPresent) 1 else 0) +
                (urgency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maxPercent.asKnown().isPresent) 1 else 0) +
                (if (minPercent.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val AP = of("AP")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                AP
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AP,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    AP -> Value.AP
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
                    AP -> Known.AP
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Ap &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                urgency == other.urgency &&
                maxPercent == other.maxPercent &&
                minPercent == other.minPercent &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                endAt,
                startAt,
                urgency,
                maxPercent,
                minPercent,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Ap{endAt=$endAt, startAt=$startAt, urgency=$urgency, maxPercent=$maxPercent, minPercent=$minPercent, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Percentage of Volume - participates as a percentage of market volume */
    class Pov
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<OffsetDateTime>,
        private val startAt: JsonField<OffsetDateTime>,
        private val urgency: JsonField<Urgency>,
        private val targetPercent: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at")
            @ExcludeMissing
            endAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_at")
            @ExcludeMissing
            startAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("urgency") @ExcludeMissing urgency: JsonField<Urgency> = JsonMissing.of(),
            @JsonProperty("target_percent")
            @ExcludeMissing
            targetPercent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(endAt, startAt, urgency, targetPercent, type, mutableMapOf())

        fun toPovStrategy(): PovStrategy =
            PovStrategy.builder()
                .endAt(endAt)
                .startAt(startAt)
                .urgency(urgency)
                .targetPercent(targetPercent)
                .build()

        /**
         * UTC timestamp to end execution (defaults to market close)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endAt(): Optional<OffsetDateTime> = endAt.getOptional("end_at")

        /**
         * UTC timestamp to start execution (defaults to order placement time)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startAt(): Optional<OffsetDateTime> = startAt.getOptional("start_at")

        /**
         * Urgency level for execution aggressiveness
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun urgency(): Optional<Urgency> = urgency.getOptional("urgency")

        /**
         * Target percentage of market volume to participate in (0-100)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetPercent(): String = targetPercent.getRequired("target_percent")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<OffsetDateTime> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at")
        @ExcludeMissing
        fun _startAt(): JsonField<OffsetDateTime> = startAt

        /**
         * Returns the raw JSON value of [urgency].
         *
         * Unlike [urgency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urgency") @ExcludeMissing fun _urgency(): JsonField<Urgency> = urgency

        /**
         * Returns the raw JSON value of [targetPercent].
         *
         * Unlike [targetPercent], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("target_percent")
        @ExcludeMissing
        fun _targetPercent(): JsonField<String> = targetPercent

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Pov].
             *
             * The following fields are required:
             * ```java
             * .targetPercent()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pov]. */
        class Builder internal constructor() {

            private var endAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var urgency: JsonField<Urgency> = JsonMissing.of()
            private var targetPercent: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pov: Pov) = apply {
                endAt = pov.endAt
                startAt = pov.startAt
                urgency = pov.urgency
                targetPercent = pov.targetPercent
                type = pov.type
                additionalProperties = pov.additionalProperties.toMutableMap()
            }

            /** UTC timestamp to end execution (defaults to market close) */
            fun endAt(endAt: OffsetDateTime?) = endAt(JsonField.ofNullable(endAt))

            /** Alias for calling [Builder.endAt] with `endAt.orElse(null)`. */
            fun endAt(endAt: Optional<OffsetDateTime>) = endAt(endAt.getOrNull())

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endAt(endAt: JsonField<OffsetDateTime>) = apply { this.endAt = endAt }

            /** UTC timestamp to start execution (defaults to order placement time) */
            fun startAt(startAt: OffsetDateTime?) = startAt(JsonField.ofNullable(startAt))

            /** Alias for calling [Builder.startAt] with `startAt.orElse(null)`. */
            fun startAt(startAt: Optional<OffsetDateTime>) = startAt(startAt.getOrNull())

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<OffsetDateTime>) = apply { this.startAt = startAt }

            /** Urgency level for execution aggressiveness */
            fun urgency(urgency: Urgency) = urgency(JsonField.of(urgency))

            /**
             * Sets [Builder.urgency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urgency] with a well-typed [Urgency] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urgency(urgency: JsonField<Urgency>) = apply { this.urgency = urgency }

            /** Target percentage of market volume to participate in (0-100) */
            fun targetPercent(targetPercent: String) = targetPercent(JsonField.of(targetPercent))

            /**
             * Sets [Builder.targetPercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetPercent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun targetPercent(targetPercent: JsonField<String>) = apply {
                this.targetPercent = targetPercent
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Pov].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .targetPercent()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Pov =
                Pov(
                    endAt,
                    startAt,
                    urgency,
                    checkRequired("targetPercent", targetPercent),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Pov = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
            urgency().ifPresent { it.validate() }
            targetPercent()
            type().validate()
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
            (if (endAt.asKnown().isPresent) 1 else 0) +
                (if (startAt.asKnown().isPresent) 1 else 0) +
                (urgency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (targetPercent.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val POV = of("POV")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                POV
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                POV,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    POV -> Value.POV
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
                    POV -> Known.POV
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pov &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                urgency == other.urgency &&
                targetPercent == other.targetPercent &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(endAt, startAt, urgency, targetPercent, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pov{endAt=$endAt, startAt=$startAt, urgency=$urgency, targetPercent=$targetPercent, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Dark Pool - routes to dark pool venues */
    class Dark
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val endAt: JsonField<OffsetDateTime>,
        private val startAt: JsonField<OffsetDateTime>,
        private val urgency: JsonField<Urgency>,
        private val maxPercent: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("end_at")
            @ExcludeMissing
            endAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("start_at")
            @ExcludeMissing
            startAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("urgency") @ExcludeMissing urgency: JsonField<Urgency> = JsonMissing.of(),
            @JsonProperty("max_percent")
            @ExcludeMissing
            maxPercent: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(endAt, startAt, urgency, maxPercent, type, mutableMapOf())

        fun toDarkStrategy(): DarkStrategy =
            DarkStrategy.builder()
                .endAt(endAt)
                .startAt(startAt)
                .urgency(urgency)
                .maxPercent(maxPercent)
                .build()

        /**
         * UTC timestamp to end execution (defaults to market close)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endAt(): Optional<OffsetDateTime> = endAt.getOptional("end_at")

        /**
         * UTC timestamp to start execution (defaults to order placement time)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startAt(): Optional<OffsetDateTime> = startAt.getOptional("start_at")

        /**
         * Urgency level for execution aggressiveness
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun urgency(): Optional<Urgency> = urgency.getOptional("urgency")

        /**
         * Maximum percentage of market volume to participate in (0-100)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxPercent(): Optional<String> = maxPercent.getOptional("max_percent")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [endAt].
         *
         * Unlike [endAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_at") @ExcludeMissing fun _endAt(): JsonField<OffsetDateTime> = endAt

        /**
         * Returns the raw JSON value of [startAt].
         *
         * Unlike [startAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_at")
        @ExcludeMissing
        fun _startAt(): JsonField<OffsetDateTime> = startAt

        /**
         * Returns the raw JSON value of [urgency].
         *
         * Unlike [urgency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("urgency") @ExcludeMissing fun _urgency(): JsonField<Urgency> = urgency

        /**
         * Returns the raw JSON value of [maxPercent].
         *
         * Unlike [maxPercent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_percent")
        @ExcludeMissing
        fun _maxPercent(): JsonField<String> = maxPercent

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Dark].
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Dark]. */
        class Builder internal constructor() {

            private var endAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var urgency: JsonField<Urgency> = JsonMissing.of()
            private var maxPercent: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dark: Dark) = apply {
                endAt = dark.endAt
                startAt = dark.startAt
                urgency = dark.urgency
                maxPercent = dark.maxPercent
                type = dark.type
                additionalProperties = dark.additionalProperties.toMutableMap()
            }

            /** UTC timestamp to end execution (defaults to market close) */
            fun endAt(endAt: OffsetDateTime?) = endAt(JsonField.ofNullable(endAt))

            /** Alias for calling [Builder.endAt] with `endAt.orElse(null)`. */
            fun endAt(endAt: Optional<OffsetDateTime>) = endAt(endAt.getOrNull())

            /**
             * Sets [Builder.endAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endAt(endAt: JsonField<OffsetDateTime>) = apply { this.endAt = endAt }

            /** UTC timestamp to start execution (defaults to order placement time) */
            fun startAt(startAt: OffsetDateTime?) = startAt(JsonField.ofNullable(startAt))

            /** Alias for calling [Builder.startAt] with `startAt.orElse(null)`. */
            fun startAt(startAt: Optional<OffsetDateTime>) = startAt(startAt.getOrNull())

            /**
             * Sets [Builder.startAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startAt(startAt: JsonField<OffsetDateTime>) = apply { this.startAt = startAt }

            /** Urgency level for execution aggressiveness */
            fun urgency(urgency: Urgency) = urgency(JsonField.of(urgency))

            /**
             * Sets [Builder.urgency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.urgency] with a well-typed [Urgency] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun urgency(urgency: JsonField<Urgency>) = apply { this.urgency = urgency }

            /** Maximum percentage of market volume to participate in (0-100) */
            fun maxPercent(maxPercent: String?) = maxPercent(JsonField.ofNullable(maxPercent))

            /** Alias for calling [Builder.maxPercent] with `maxPercent.orElse(null)`. */
            fun maxPercent(maxPercent: Optional<String>) = maxPercent(maxPercent.getOrNull())

            /**
             * Sets [Builder.maxPercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxPercent] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxPercent(maxPercent: JsonField<String>) = apply { this.maxPercent = maxPercent }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Dark].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Dark =
                Dark(
                    endAt,
                    startAt,
                    urgency,
                    maxPercent,
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Dark = apply {
            if (validated) {
                return@apply
            }

            endAt()
            startAt()
            urgency().ifPresent { it.validate() }
            maxPercent()
            type().validate()
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
            (if (endAt.asKnown().isPresent) 1 else 0) +
                (if (startAt.asKnown().isPresent) 1 else 0) +
                (urgency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (maxPercent.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DARK = of("DARK")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                DARK
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DARK,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    DARK -> Value.DARK
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
                    DARK -> Known.DARK
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Dark &&
                endAt == other.endAt &&
                startAt == other.startAt &&
                urgency == other.urgency &&
                maxPercent == other.maxPercent &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(endAt, startAt, urgency, maxPercent, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Dark{endAt=$endAt, startAt=$startAt, urgency=$urgency, maxPercent=$maxPercent, type=$type, additionalProperties=$additionalProperties}"
    }

    /** Direct Market Access - sends directly to a specified exchange */
    class Dma
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val destination: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("destination")
            @ExcludeMissing
            destination: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(destination, type, mutableMapOf())

        fun toDmaStrategy(): DmaStrategy = DmaStrategy.builder().destination(destination).build()

        /**
         * Destination exchange (MIC code)
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destination(): String = destination.getRequired("destination")

        /**
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [destination].
         *
         * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("destination")
        @ExcludeMissing
        fun _destination(): JsonField<String> = destination

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [Dma].
             *
             * The following fields are required:
             * ```java
             * .destination()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Dma]. */
        class Builder internal constructor() {

            private var destination: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dma: Dma) = apply {
                destination = dma.destination
                type = dma.type
                additionalProperties = dma.additionalProperties.toMutableMap()
            }

            /** Destination exchange (MIC code) */
            fun destination(destination: String) = destination(JsonField.of(destination))

            /**
             * Sets [Builder.destination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destination] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destination(destination: JsonField<String>) = apply {
                this.destination = destination
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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
             * Returns an immutable instance of [Dma].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .destination()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Dma =
                Dma(
                    checkRequired("destination", destination),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Dma = apply {
            if (validated) {
                return@apply
            }

            destination()
            type().validate()
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
            (if (destination.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DMA = of("DMA")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                DMA
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DMA,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    DMA -> Value.DMA
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
                    DMA -> Known.DMA
                    else -> throw ClearStreetInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Dma &&
                destination == other.destination &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(destination, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Dma{destination=$destination, type=$type, additionalProperties=$additionalProperties}"
    }
}
