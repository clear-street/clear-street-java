// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata.marketdata

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
import java.util.Collections
import java.util.Objects

/** Session-level pricing metrics for a market data snapshot. */
class SnapshotSession
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val change: JsonField<String>,
    private val changePercent: JsonField<String>,
    private val previousClose: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("change") @ExcludeMissing change: JsonField<String> = JsonMissing.of(),
        @JsonProperty("change_percent")
        @ExcludeMissing
        changePercent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("previous_close")
        @ExcludeMissing
        previousClose: JsonField<String> = JsonMissing.of(),
    ) : this(change, changePercent, previousClose, mutableMapOf())

    /**
     * Absolute change from previous close to last trade.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun change(): String = change.getRequired("change")

    /**
     * Percent change from previous close to last trade.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun changePercent(): String = changePercent.getRequired("change_percent")

    /**
     * Previous session close price.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun previousClose(): String = previousClose.getRequired("previous_close")

    /**
     * Returns the raw JSON value of [change].
     *
     * Unlike [change], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("change") @ExcludeMissing fun _change(): JsonField<String> = change

    /**
     * Returns the raw JSON value of [changePercent].
     *
     * Unlike [changePercent], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("change_percent")
    @ExcludeMissing
    fun _changePercent(): JsonField<String> = changePercent

    /**
     * Returns the raw JSON value of [previousClose].
     *
     * Unlike [previousClose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("previous_close")
    @ExcludeMissing
    fun _previousClose(): JsonField<String> = previousClose

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
         * Returns a mutable builder for constructing an instance of [SnapshotSession].
         *
         * The following fields are required:
         * ```java
         * .change()
         * .changePercent()
         * .previousClose()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SnapshotSession]. */
    class Builder internal constructor() {

        private var change: JsonField<String>? = null
        private var changePercent: JsonField<String>? = null
        private var previousClose: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(snapshotSession: SnapshotSession) = apply {
            change = snapshotSession.change
            changePercent = snapshotSession.changePercent
            previousClose = snapshotSession.previousClose
            additionalProperties = snapshotSession.additionalProperties.toMutableMap()
        }

        /** Absolute change from previous close to last trade. */
        fun change(change: String) = change(JsonField.of(change))

        /**
         * Sets [Builder.change] to an arbitrary JSON value.
         *
         * You should usually call [Builder.change] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun change(change: JsonField<String>) = apply { this.change = change }

        /** Percent change from previous close to last trade. */
        fun changePercent(changePercent: String) = changePercent(JsonField.of(changePercent))

        /**
         * Sets [Builder.changePercent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changePercent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun changePercent(changePercent: JsonField<String>) = apply {
            this.changePercent = changePercent
        }

        /** Previous session close price. */
        fun previousClose(previousClose: String) = previousClose(JsonField.of(previousClose))

        /**
         * Sets [Builder.previousClose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousClose] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun previousClose(previousClose: JsonField<String>) = apply {
            this.previousClose = previousClose
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
         * Returns an immutable instance of [SnapshotSession].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .change()
         * .changePercent()
         * .previousClose()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SnapshotSession =
            SnapshotSession(
                checkRequired("change", change),
                checkRequired("changePercent", changePercent),
                checkRequired("previousClose", previousClose),
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
    fun validate(): SnapshotSession = apply {
        if (validated) {
            return@apply
        }

        change()
        changePercent()
        previousClose()
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
        (if (change.asKnown().isPresent) 1 else 0) +
            (if (changePercent.asKnown().isPresent) 1 else 0) +
            (if (previousClose.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SnapshotSession &&
            change == other.change &&
            changePercent == other.changePercent &&
            previousClose == other.previousClose &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(change, changePercent, previousClose, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SnapshotSession{change=$change, changePercent=$changePercent, previousClose=$previousClose, additionalProperties=$additionalProperties}"
}
