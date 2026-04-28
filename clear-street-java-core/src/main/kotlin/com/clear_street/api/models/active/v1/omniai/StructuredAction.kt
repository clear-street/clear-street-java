// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

import com.clear_street.api.core.BaseDeserializer
import com.clear_street.api.core.BaseSerializer
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
    private val openEntitlementConsent: OpenEntitlementConsent? = null,
    private val _json: JsonValue? = null,
) {

    /** Prefill an order ticket for user confirmation */
    fun prefillOrder(): Optional<PrefillOrder> = Optional.ofNullable(prefillOrder)

    /** Open a chart for a symbol */
    fun openChart(): Optional<OpenChart> = Optional.ofNullable(openChart)

    /** Open a stock screener with filters */
    fun openScreener(): Optional<OpenScreener> = Optional.ofNullable(openScreener)

    /** Open entitlement consent flow */
    fun openEntitlementConsent(): Optional<OpenEntitlementConsent> =
        Optional.ofNullable(openEntitlementConsent)

    fun isPrefillOrder(): Boolean = prefillOrder != null

    fun isOpenChart(): Boolean = openChart != null

    fun isOpenScreener(): Boolean = openScreener != null

    fun isOpenEntitlementConsent(): Boolean = openEntitlementConsent != null

    /** Prefill an order ticket for user confirmation */
    fun asPrefillOrder(): PrefillOrder = prefillOrder.getOrThrow("prefillOrder")

    /** Open a chart for a symbol */
    fun asOpenChart(): OpenChart = openChart.getOrThrow("openChart")

    /** Open a stock screener with filters */
    fun asOpenScreener(): OpenScreener = openScreener.getOrThrow("openScreener")

    /** Open entitlement consent flow */
    fun asOpenEntitlementConsent(): OpenEntitlementConsent =
        openEntitlementConsent.getOrThrow("openEntitlementConsent")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            prefillOrder != null -> visitor.visitPrefillOrder(prefillOrder)
            openChart != null -> visitor.visitOpenChart(openChart)
            openScreener != null -> visitor.visitOpenScreener(openScreener)
            openEntitlementConsent != null ->
                visitor.visitOpenEntitlementConsent(openEntitlementConsent)
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

                override fun visitOpenEntitlementConsent(
                    openEntitlementConsent: OpenEntitlementConsent
                ) {
                    openEntitlementConsent.validate()
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

                override fun visitOpenEntitlementConsent(
                    openEntitlementConsent: OpenEntitlementConsent
                ) = openEntitlementConsent.validity()

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
            openScreener == other.openScreener &&
            openEntitlementConsent == other.openEntitlementConsent
    }

    override fun hashCode(): Int =
        Objects.hash(prefillOrder, openChart, openScreener, openEntitlementConsent)

    override fun toString(): String =
        when {
            prefillOrder != null -> "StructuredAction{prefillOrder=$prefillOrder}"
            openChart != null -> "StructuredAction{openChart=$openChart}"
            openScreener != null -> "StructuredAction{openScreener=$openScreener}"
            openEntitlementConsent != null ->
                "StructuredAction{openEntitlementConsent=$openEntitlementConsent}"
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

        /** Open entitlement consent flow */
        @JvmStatic
        fun ofOpenEntitlementConsent(openEntitlementConsent: OpenEntitlementConsent) =
            StructuredAction(openEntitlementConsent = openEntitlementConsent)
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

        /** Open entitlement consent flow */
        fun visitOpenEntitlementConsent(openEntitlementConsent: OpenEntitlementConsent): T

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
                        tryDeserialize(node, jacksonTypeRef<OpenEntitlementConsent>())?.let {
                            StructuredAction(openEntitlementConsent = it, _json = json)
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
                value.openEntitlementConsent != null ->
                    generator.writeObject(value.openEntitlementConsent)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid StructuredAction")
            }
        }
    }

    /** Prefill an order ticket for user confirmation */
    class PrefillOrder
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val prefillOrder: JsonField<PrefillOrderAction>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("prefill_order")
            @ExcludeMissing
            prefillOrder: JsonField<PrefillOrderAction> = JsonMissing.of()
        ) : this(prefillOrder, mutableMapOf())

        /**
         * Prefill an order ticket for user confirmation
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun prefillOrder(): PrefillOrderAction = prefillOrder.getRequired("prefill_order")

        /**
         * Returns the raw JSON value of [prefillOrder].
         *
         * Unlike [prefillOrder], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("prefill_order")
        @ExcludeMissing
        fun _prefillOrder(): JsonField<PrefillOrderAction> = prefillOrder

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
             * .prefillOrder()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PrefillOrder]. */
        class Builder internal constructor() {

            private var prefillOrder: JsonField<PrefillOrderAction>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(prefillOrder: PrefillOrder) = apply {
                this.prefillOrder = prefillOrder.prefillOrder
                additionalProperties = prefillOrder.additionalProperties.toMutableMap()
            }

            /** Prefill an order ticket for user confirmation */
            fun prefillOrder(prefillOrder: PrefillOrderAction) =
                prefillOrder(JsonField.of(prefillOrder))

            /**
             * Sets [Builder.prefillOrder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.prefillOrder] with a well-typed [PrefillOrderAction]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun prefillOrder(prefillOrder: JsonField<PrefillOrderAction>) = apply {
                this.prefillOrder = prefillOrder
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
             * .prefillOrder()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PrefillOrder =
                PrefillOrder(
                    checkRequired("prefillOrder", prefillOrder),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PrefillOrder = apply {
            if (validated) {
                return@apply
            }

            prefillOrder().validate()
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
        internal fun validity(): Int = (prefillOrder.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PrefillOrder &&
                prefillOrder == other.prefillOrder &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(prefillOrder, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PrefillOrder{prefillOrder=$prefillOrder, additionalProperties=$additionalProperties}"
    }

    /** Open a chart for a symbol */
    class OpenChart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val openChart: JsonField<OpenChartAction>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("open_chart")
            @ExcludeMissing
            openChart: JsonField<OpenChartAction> = JsonMissing.of()
        ) : this(openChart, mutableMapOf())

        /**
         * Open a chart for a symbol
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun openChart(): OpenChartAction = openChart.getRequired("open_chart")

        /**
         * Returns the raw JSON value of [openChart].
         *
         * Unlike [openChart], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("open_chart")
        @ExcludeMissing
        fun _openChart(): JsonField<OpenChartAction> = openChart

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
             * .openChart()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OpenChart]. */
        class Builder internal constructor() {

            private var openChart: JsonField<OpenChartAction>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(openChart: OpenChart) = apply {
                this.openChart = openChart.openChart
                additionalProperties = openChart.additionalProperties.toMutableMap()
            }

            /** Open a chart for a symbol */
            fun openChart(openChart: OpenChartAction) = openChart(JsonField.of(openChart))

            /**
             * Sets [Builder.openChart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openChart] with a well-typed [OpenChartAction] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun openChart(openChart: JsonField<OpenChartAction>) = apply {
                this.openChart = openChart
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
             * .openChart()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OpenChart =
                OpenChart(
                    checkRequired("openChart", openChart),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OpenChart = apply {
            if (validated) {
                return@apply
            }

            openChart().validate()
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
        internal fun validity(): Int = (openChart.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OpenChart &&
                openChart == other.openChart &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(openChart, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OpenChart{openChart=$openChart, additionalProperties=$additionalProperties}"
    }

    /** Open a stock screener with filters */
    class OpenScreener
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val openScreener: JsonField<OpenScreenerAction>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("open_screener")
            @ExcludeMissing
            openScreener: JsonField<OpenScreenerAction> = JsonMissing.of()
        ) : this(openScreener, mutableMapOf())

        /**
         * Open a stock screener with filters
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun openScreener(): OpenScreenerAction = openScreener.getRequired("open_screener")

        /**
         * Returns the raw JSON value of [openScreener].
         *
         * Unlike [openScreener], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("open_screener")
        @ExcludeMissing
        fun _openScreener(): JsonField<OpenScreenerAction> = openScreener

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
             * .openScreener()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OpenScreener]. */
        class Builder internal constructor() {

            private var openScreener: JsonField<OpenScreenerAction>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(openScreener: OpenScreener) = apply {
                this.openScreener = openScreener.openScreener
                additionalProperties = openScreener.additionalProperties.toMutableMap()
            }

            /** Open a stock screener with filters */
            fun openScreener(openScreener: OpenScreenerAction) =
                openScreener(JsonField.of(openScreener))

            /**
             * Sets [Builder.openScreener] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openScreener] with a well-typed [OpenScreenerAction]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun openScreener(openScreener: JsonField<OpenScreenerAction>) = apply {
                this.openScreener = openScreener
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
             * .openScreener()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OpenScreener =
                OpenScreener(
                    checkRequired("openScreener", openScreener),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OpenScreener = apply {
            if (validated) {
                return@apply
            }

            openScreener().validate()
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
        internal fun validity(): Int = (openScreener.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OpenScreener &&
                openScreener == other.openScreener &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(openScreener, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OpenScreener{openScreener=$openScreener, additionalProperties=$additionalProperties}"
    }

    /** Open entitlement consent flow */
    class OpenEntitlementConsent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val openEntitlementConsent: JsonField<OpenEntitlementConsentAction>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("open_entitlement_consent")
            @ExcludeMissing
            openEntitlementConsent: JsonField<OpenEntitlementConsentAction> = JsonMissing.of()
        ) : this(openEntitlementConsent, mutableMapOf())

        /**
         * Open entitlement consent flow
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun openEntitlementConsent(): OpenEntitlementConsentAction =
            openEntitlementConsent.getRequired("open_entitlement_consent")

        /**
         * Returns the raw JSON value of [openEntitlementConsent].
         *
         * Unlike [openEntitlementConsent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("open_entitlement_consent")
        @ExcludeMissing
        fun _openEntitlementConsent(): JsonField<OpenEntitlementConsentAction> =
            openEntitlementConsent

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
             * Returns a mutable builder for constructing an instance of [OpenEntitlementConsent].
             *
             * The following fields are required:
             * ```java
             * .openEntitlementConsent()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OpenEntitlementConsent]. */
        class Builder internal constructor() {

            private var openEntitlementConsent: JsonField<OpenEntitlementConsentAction>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(openEntitlementConsent: OpenEntitlementConsent) = apply {
                this.openEntitlementConsent = openEntitlementConsent.openEntitlementConsent
                additionalProperties = openEntitlementConsent.additionalProperties.toMutableMap()
            }

            /** Open entitlement consent flow */
            fun openEntitlementConsent(openEntitlementConsent: OpenEntitlementConsentAction) =
                openEntitlementConsent(JsonField.of(openEntitlementConsent))

            /**
             * Sets [Builder.openEntitlementConsent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.openEntitlementConsent] with a well-typed
             * [OpenEntitlementConsentAction] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun openEntitlementConsent(
                openEntitlementConsent: JsonField<OpenEntitlementConsentAction>
            ) = apply { this.openEntitlementConsent = openEntitlementConsent }

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
             * Returns an immutable instance of [OpenEntitlementConsent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .openEntitlementConsent()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): OpenEntitlementConsent =
                OpenEntitlementConsent(
                    checkRequired("openEntitlementConsent", openEntitlementConsent),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): OpenEntitlementConsent = apply {
            if (validated) {
                return@apply
            }

            openEntitlementConsent().validate()
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
            (openEntitlementConsent.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is OpenEntitlementConsent &&
                openEntitlementConsent == other.openEntitlementConsent &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(openEntitlementConsent, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OpenEntitlementConsent{openEntitlementConsent=$openEntitlementConsent, additionalProperties=$additionalProperties}"
    }
}
