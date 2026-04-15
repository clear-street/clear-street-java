// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.calendars.mergersacquisitions

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Represents a merger or acquisition event */
class MergersAcquisitionsEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acquirerSymbol: JsonField<String>,
    private val targetSymbol: JsonField<String>,
    private val transactionDate: JsonField<LocalDate>,
    private val acceptedAt: JsonField<OffsetDateTime>,
    private val acquirerCik: JsonField<String>,
    private val acquirerName: JsonField<String>,
    private val link: JsonField<String>,
    private val targetCik: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("acquirer_symbol")
        @ExcludeMissing
        acquirerSymbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target_symbol")
        @ExcludeMissing
        targetSymbol: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_date")
        @ExcludeMissing
        transactionDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("accepted_at")
        @ExcludeMissing
        acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("acquirer_cik")
        @ExcludeMissing
        acquirerCik: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acquirer_name")
        @ExcludeMissing
        acquirerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("link") @ExcludeMissing link: JsonField<String> = JsonMissing.of(),
        @JsonProperty("target_cik") @ExcludeMissing targetCik: JsonField<String> = JsonMissing.of(),
    ) : this(
        acquirerSymbol,
        targetSymbol,
        transactionDate,
        acceptedAt,
        acquirerCik,
        acquirerName,
        link,
        targetCik,
        mutableMapOf(),
    )

    /**
     * The symbol of the acquiring company
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acquirerSymbol(): String = acquirerSymbol.getRequired("acquirer_symbol")

    /**
     * The symbol of the target company being acquired
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetSymbol(): String = targetSymbol.getRequired("target_symbol")

    /**
     * The date of the transaction
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun transactionDate(): LocalDate = transactionDate.getRequired("transaction_date")

    /**
     * The timestamp when the merger or acquisition was accepted in UTC
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acceptedAt(): Optional<OffsetDateTime> = acceptedAt.getOptional("accepted_at")

    /**
     * The CIK of the acquiring company
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acquirerCik(): Optional<String> = acquirerCik.getOptional("acquirer_cik")

    /**
     * The name of the acquiring company
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acquirerName(): Optional<String> = acquirerName.getOptional("acquirer_name")

    /**
     * A URL link to more details about the merger or acquisition
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun link(): Optional<String> = link.getOptional("link")

    /**
     * The CIK of the target company
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun targetCik(): Optional<String> = targetCik.getOptional("target_cik")

    /**
     * Returns the raw JSON value of [acquirerSymbol].
     *
     * Unlike [acquirerSymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acquirer_symbol")
    @ExcludeMissing
    fun _acquirerSymbol(): JsonField<String> = acquirerSymbol

    /**
     * Returns the raw JSON value of [targetSymbol].
     *
     * Unlike [targetSymbol], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_symbol")
    @ExcludeMissing
    fun _targetSymbol(): JsonField<String> = targetSymbol

    /**
     * Returns the raw JSON value of [transactionDate].
     *
     * Unlike [transactionDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transaction_date")
    @ExcludeMissing
    fun _transactionDate(): JsonField<LocalDate> = transactionDate

    /**
     * Returns the raw JSON value of [acceptedAt].
     *
     * Unlike [acceptedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accepted_at")
    @ExcludeMissing
    fun _acceptedAt(): JsonField<OffsetDateTime> = acceptedAt

    /**
     * Returns the raw JSON value of [acquirerCik].
     *
     * Unlike [acquirerCik], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acquirer_cik")
    @ExcludeMissing
    fun _acquirerCik(): JsonField<String> = acquirerCik

    /**
     * Returns the raw JSON value of [acquirerName].
     *
     * Unlike [acquirerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acquirer_name")
    @ExcludeMissing
    fun _acquirerName(): JsonField<String> = acquirerName

    /**
     * Returns the raw JSON value of [link].
     *
     * Unlike [link], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("link") @ExcludeMissing fun _link(): JsonField<String> = link

    /**
     * Returns the raw JSON value of [targetCik].
     *
     * Unlike [targetCik], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("target_cik") @ExcludeMissing fun _targetCik(): JsonField<String> = targetCik

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
         * Returns a mutable builder for constructing an instance of [MergersAcquisitionsEvent].
         *
         * The following fields are required:
         * ```java
         * .acquirerSymbol()
         * .targetSymbol()
         * .transactionDate()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MergersAcquisitionsEvent]. */
    class Builder internal constructor() {

        private var acquirerSymbol: JsonField<String>? = null
        private var targetSymbol: JsonField<String>? = null
        private var transactionDate: JsonField<LocalDate>? = null
        private var acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var acquirerCik: JsonField<String> = JsonMissing.of()
        private var acquirerName: JsonField<String> = JsonMissing.of()
        private var link: JsonField<String> = JsonMissing.of()
        private var targetCik: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(mergersAcquisitionsEvent: MergersAcquisitionsEvent) = apply {
            acquirerSymbol = mergersAcquisitionsEvent.acquirerSymbol
            targetSymbol = mergersAcquisitionsEvent.targetSymbol
            transactionDate = mergersAcquisitionsEvent.transactionDate
            acceptedAt = mergersAcquisitionsEvent.acceptedAt
            acquirerCik = mergersAcquisitionsEvent.acquirerCik
            acquirerName = mergersAcquisitionsEvent.acquirerName
            link = mergersAcquisitionsEvent.link
            targetCik = mergersAcquisitionsEvent.targetCik
            additionalProperties = mergersAcquisitionsEvent.additionalProperties.toMutableMap()
        }

        /** The symbol of the acquiring company */
        fun acquirerSymbol(acquirerSymbol: String) = acquirerSymbol(JsonField.of(acquirerSymbol))

        /**
         * Sets [Builder.acquirerSymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acquirerSymbol] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acquirerSymbol(acquirerSymbol: JsonField<String>) = apply {
            this.acquirerSymbol = acquirerSymbol
        }

        /** The symbol of the target company being acquired */
        fun targetSymbol(targetSymbol: String) = targetSymbol(JsonField.of(targetSymbol))

        /**
         * Sets [Builder.targetSymbol] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetSymbol] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetSymbol(targetSymbol: JsonField<String>) = apply {
            this.targetSymbol = targetSymbol
        }

        /** The date of the transaction */
        fun transactionDate(transactionDate: LocalDate) =
            transactionDate(JsonField.of(transactionDate))

        /**
         * Sets [Builder.transactionDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionDate(transactionDate: JsonField<LocalDate>) = apply {
            this.transactionDate = transactionDate
        }

        /** The timestamp when the merger or acquisition was accepted in UTC */
        fun acceptedAt(acceptedAt: OffsetDateTime?) = acceptedAt(JsonField.ofNullable(acceptedAt))

        /** Alias for calling [Builder.acceptedAt] with `acceptedAt.orElse(null)`. */
        fun acceptedAt(acceptedAt: Optional<OffsetDateTime>) = acceptedAt(acceptedAt.getOrNull())

        /**
         * Sets [Builder.acceptedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
            this.acceptedAt = acceptedAt
        }

        /** The CIK of the acquiring company */
        fun acquirerCik(acquirerCik: String?) = acquirerCik(JsonField.ofNullable(acquirerCik))

        /** Alias for calling [Builder.acquirerCik] with `acquirerCik.orElse(null)`. */
        fun acquirerCik(acquirerCik: Optional<String>) = acquirerCik(acquirerCik.getOrNull())

        /**
         * Sets [Builder.acquirerCik] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acquirerCik] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun acquirerCik(acquirerCik: JsonField<String>) = apply { this.acquirerCik = acquirerCik }

        /** The name of the acquiring company */
        fun acquirerName(acquirerName: String?) = acquirerName(JsonField.ofNullable(acquirerName))

        /** Alias for calling [Builder.acquirerName] with `acquirerName.orElse(null)`. */
        fun acquirerName(acquirerName: Optional<String>) = acquirerName(acquirerName.getOrNull())

        /**
         * Sets [Builder.acquirerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acquirerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun acquirerName(acquirerName: JsonField<String>) = apply {
            this.acquirerName = acquirerName
        }

        /** A URL link to more details about the merger or acquisition */
        fun link(link: String?) = link(JsonField.ofNullable(link))

        /** Alias for calling [Builder.link] with `link.orElse(null)`. */
        fun link(link: Optional<String>) = link(link.getOrNull())

        /**
         * Sets [Builder.link] to an arbitrary JSON value.
         *
         * You should usually call [Builder.link] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun link(link: JsonField<String>) = apply { this.link = link }

        /** The CIK of the target company */
        fun targetCik(targetCik: String?) = targetCik(JsonField.ofNullable(targetCik))

        /** Alias for calling [Builder.targetCik] with `targetCik.orElse(null)`. */
        fun targetCik(targetCik: Optional<String>) = targetCik(targetCik.getOrNull())

        /**
         * Sets [Builder.targetCik] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetCik] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun targetCik(targetCik: JsonField<String>) = apply { this.targetCik = targetCik }

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
         * Returns an immutable instance of [MergersAcquisitionsEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .acquirerSymbol()
         * .targetSymbol()
         * .transactionDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MergersAcquisitionsEvent =
            MergersAcquisitionsEvent(
                checkRequired("acquirerSymbol", acquirerSymbol),
                checkRequired("targetSymbol", targetSymbol),
                checkRequired("transactionDate", transactionDate),
                acceptedAt,
                acquirerCik,
                acquirerName,
                link,
                targetCik,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): MergersAcquisitionsEvent = apply {
        if (validated) {
            return@apply
        }

        acquirerSymbol()
        targetSymbol()
        transactionDate()
        acceptedAt()
        acquirerCik()
        acquirerName()
        link()
        targetCik()
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
        (if (acquirerSymbol.asKnown().isPresent) 1 else 0) +
            (if (targetSymbol.asKnown().isPresent) 1 else 0) +
            (if (transactionDate.asKnown().isPresent) 1 else 0) +
            (if (acceptedAt.asKnown().isPresent) 1 else 0) +
            (if (acquirerCik.asKnown().isPresent) 1 else 0) +
            (if (acquirerName.asKnown().isPresent) 1 else 0) +
            (if (link.asKnown().isPresent) 1 else 0) +
            (if (targetCik.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MergersAcquisitionsEvent &&
            acquirerSymbol == other.acquirerSymbol &&
            targetSymbol == other.targetSymbol &&
            transactionDate == other.transactionDate &&
            acceptedAt == other.acceptedAt &&
            acquirerCik == other.acquirerCik &&
            acquirerName == other.acquirerName &&
            link == other.link &&
            targetCik == other.targetCik &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            acquirerSymbol,
            targetSymbol,
            transactionDate,
            acceptedAt,
            acquirerCik,
            acquirerName,
            link,
            targetCik,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MergersAcquisitionsEvent{acquirerSymbol=$acquirerSymbol, targetSymbol=$targetSymbol, transactionDate=$transactionDate, acceptedAt=$acceptedAt, acquirerCik=$acquirerCik, acquirerName=$acquirerName, link=$link, targetCik=$targetCik, additionalProperties=$additionalProperties}"
}
