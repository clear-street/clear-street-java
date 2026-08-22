// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkKnown
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.clearstreet.api.models.v1.privatemarkets.offerings.MetricValueType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** One metric observation. */
class CompanyMetricPoint
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val observedAt: JsonField<OffsetDateTime>,
    private val value: JsonField<String>,
    private val valueType: JsonField<MetricValueType>,
    private val citationIds: JsonField<List<String>>,
    private val sourceEventId: JsonField<String>,
    private val sourceMetadata: JsonField<SourceMetadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("observed_at")
        @ExcludeMissing
        observedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value_type")
        @ExcludeMissing
        valueType: JsonField<MetricValueType> = JsonMissing.of(),
        @JsonProperty("citation_ids")
        @ExcludeMissing
        citationIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("source_event_id")
        @ExcludeMissing
        sourceEventId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_metadata")
        @ExcludeMissing
        sourceMetadata: JsonField<SourceMetadata> = JsonMissing.of(),
    ) : this(
        observedAt,
        value,
        valueType,
        citationIds,
        sourceEventId,
        sourceMetadata,
        mutableMapOf(),
    )

    /**
     * Observation time.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun observedAt(): OffsetDateTime = observedAt.getRequired("observed_at")

    /**
     * Exact decimal value, serialized as a string.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun value(): String = value.getRequired("value")

    /**
     * Historical or estimated classification.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun valueType(): MetricValueType = valueType.getRequired("value_type")

    /**
     * Profile-local citation ids supporting this point.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun citationIds(): Optional<List<String>> = citationIds.getOptional("citation_ids")

    /**
     * Optional source event identifier.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceEventId(): Optional<String> = sourceEventId.getOptional("source_event_id")

    /**
     * Optional provider reconciliation metadata.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceMetadata(): Optional<SourceMetadata> = sourceMetadata.getOptional("source_metadata")

    /**
     * Returns the raw JSON value of [observedAt].
     *
     * Unlike [observedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("observed_at")
    @ExcludeMissing
    fun _observedAt(): JsonField<OffsetDateTime> = observedAt

    /**
     * Returns the raw JSON value of [value].
     *
     * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

    /**
     * Returns the raw JSON value of [valueType].
     *
     * Unlike [valueType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("value_type")
    @ExcludeMissing
    fun _valueType(): JsonField<MetricValueType> = valueType

    /**
     * Returns the raw JSON value of [citationIds].
     *
     * Unlike [citationIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("citation_ids")
    @ExcludeMissing
    fun _citationIds(): JsonField<List<String>> = citationIds

    /**
     * Returns the raw JSON value of [sourceEventId].
     *
     * Unlike [sourceEventId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_event_id")
    @ExcludeMissing
    fun _sourceEventId(): JsonField<String> = sourceEventId

    /**
     * Returns the raw JSON value of [sourceMetadata].
     *
     * Unlike [sourceMetadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source_metadata")
    @ExcludeMissing
    fun _sourceMetadata(): JsonField<SourceMetadata> = sourceMetadata

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
         * Returns a mutable builder for constructing an instance of [CompanyMetricPoint].
         *
         * The following fields are required:
         * ```java
         * .observedAt()
         * .value()
         * .valueType()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyMetricPoint]. */
    class Builder internal constructor() {

        private var observedAt: JsonField<OffsetDateTime>? = null
        private var value: JsonField<String>? = null
        private var valueType: JsonField<MetricValueType>? = null
        private var citationIds: JsonField<MutableList<String>>? = null
        private var sourceEventId: JsonField<String> = JsonMissing.of()
        private var sourceMetadata: JsonField<SourceMetadata> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(companyMetricPoint: CompanyMetricPoint) = apply {
            observedAt = companyMetricPoint.observedAt
            value = companyMetricPoint.value
            valueType = companyMetricPoint.valueType
            citationIds = companyMetricPoint.citationIds.map { it.toMutableList() }
            sourceEventId = companyMetricPoint.sourceEventId
            sourceMetadata = companyMetricPoint.sourceMetadata
            additionalProperties = companyMetricPoint.additionalProperties.toMutableMap()
        }

        /** Observation time. */
        fun observedAt(observedAt: OffsetDateTime) = observedAt(JsonField.of(observedAt))

        /**
         * Sets [Builder.observedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.observedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun observedAt(observedAt: JsonField<OffsetDateTime>) = apply {
            this.observedAt = observedAt
        }

        /** Exact decimal value, serialized as a string. */
        fun value(value: String) = value(JsonField.of(value))

        /**
         * Sets [Builder.value] to an arbitrary JSON value.
         *
         * You should usually call [Builder.value] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun value(value: JsonField<String>) = apply { this.value = value }

        /** Historical or estimated classification. */
        fun valueType(valueType: MetricValueType) = valueType(JsonField.of(valueType))

        /**
         * Sets [Builder.valueType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.valueType] with a well-typed [MetricValueType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun valueType(valueType: JsonField<MetricValueType>) = apply { this.valueType = valueType }

        /** Profile-local citation ids supporting this point. */
        fun citationIds(citationIds: List<String>) = citationIds(JsonField.of(citationIds))

        /**
         * Sets [Builder.citationIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citationIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun citationIds(citationIds: JsonField<List<String>>) = apply {
            this.citationIds = citationIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [citationIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCitationId(citationId: String) = apply {
            citationIds =
                (citationIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("citationIds", it).add(citationId)
                }
        }

        /** Optional source event identifier. */
        fun sourceEventId(sourceEventId: String?) =
            sourceEventId(JsonField.ofNullable(sourceEventId))

        /** Alias for calling [Builder.sourceEventId] with `sourceEventId.orElse(null)`. */
        fun sourceEventId(sourceEventId: Optional<String>) =
            sourceEventId(sourceEventId.getOrNull())

        /**
         * Sets [Builder.sourceEventId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceEventId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceEventId(sourceEventId: JsonField<String>) = apply {
            this.sourceEventId = sourceEventId
        }

        /** Optional provider reconciliation metadata. */
        fun sourceMetadata(sourceMetadata: SourceMetadata?) =
            sourceMetadata(JsonField.ofNullable(sourceMetadata))

        /** Alias for calling [Builder.sourceMetadata] with `sourceMetadata.orElse(null)`. */
        fun sourceMetadata(sourceMetadata: Optional<SourceMetadata>) =
            sourceMetadata(sourceMetadata.getOrNull())

        /**
         * Sets [Builder.sourceMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceMetadata] with a well-typed [SourceMetadata] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceMetadata(sourceMetadata: JsonField<SourceMetadata>) = apply {
            this.sourceMetadata = sourceMetadata
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
         * Returns an immutable instance of [CompanyMetricPoint].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .observedAt()
         * .value()
         * .valueType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompanyMetricPoint =
            CompanyMetricPoint(
                checkRequired("observedAt", observedAt),
                checkRequired("value", value),
                checkRequired("valueType", valueType),
                (citationIds ?: JsonMissing.of()).map { it.toImmutable() },
                sourceEventId,
                sourceMetadata,
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
    fun validate(): CompanyMetricPoint = apply {
        if (validated) {
            return@apply
        }

        observedAt()
        value()
        valueType().validate()
        citationIds()
        sourceEventId()
        sourceMetadata().ifPresent { it.validate() }
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
        (if (observedAt.asKnown().isPresent) 1 else 0) +
            (if (value.asKnown().isPresent) 1 else 0) +
            (valueType.asKnown().getOrNull()?.validity() ?: 0) +
            (citationIds.asKnown().getOrNull()?.size ?: 0) +
            (if (sourceEventId.asKnown().isPresent) 1 else 0) +
            (sourceMetadata.asKnown().getOrNull()?.validity() ?: 0)

    /** Optional provider reconciliation metadata. */
    class SourceMetadata
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

            /** Returns a mutable builder for constructing an instance of [SourceMetadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SourceMetadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(sourceMetadata: SourceMetadata) = apply {
                additionalProperties = sourceMetadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SourceMetadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SourceMetadata = SourceMetadata(additionalProperties.toImmutable())
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
        fun validate(): SourceMetadata = apply {
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

            return other is SourceMetadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "SourceMetadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyMetricPoint &&
            observedAt == other.observedAt &&
            value == other.value &&
            valueType == other.valueType &&
            citationIds == other.citationIds &&
            sourceEventId == other.sourceEventId &&
            sourceMetadata == other.sourceMetadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            observedAt,
            value,
            valueType,
            citationIds,
            sourceEventId,
            sourceMetadata,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyMetricPoint{observedAt=$observedAt, value=$value, valueType=$valueType, citationIds=$citationIds, sourceEventId=$sourceEventId, sourceMetadata=$sourceMetadata, additionalProperties=$additionalProperties}"
}
