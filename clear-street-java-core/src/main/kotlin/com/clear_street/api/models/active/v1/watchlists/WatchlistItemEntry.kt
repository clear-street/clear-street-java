// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.watchlists

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.active.v1.instruments.Instrument
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A single item in a watchlist */
class WatchlistItemEntry
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val addedAt: JsonField<OffsetDateTime>,
    private val addedPrice: JsonField<String>,
    private val instrument: JsonField<Instrument>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("added_at")
        @ExcludeMissing
        addedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("added_price")
        @ExcludeMissing
        addedPrice: JsonField<String> = JsonMissing.of(),
        @JsonProperty("instrument")
        @ExcludeMissing
        instrument: JsonField<Instrument> = JsonMissing.of(),
    ) : this(id, addedAt, addedPrice, instrument, mutableMapOf())

    /**
     * Item ID
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * When the item was added
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addedAt(): OffsetDateTime = addedAt.getRequired("added_at")

    /**
     * Price when the item was added
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addedPrice(): Optional<String> = addedPrice.getOptional("added_price")

    /**
     * Instrument details
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun instrument(): Optional<Instrument> = instrument.getOptional("instrument")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [addedAt].
     *
     * Unlike [addedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("added_at") @ExcludeMissing fun _addedAt(): JsonField<OffsetDateTime> = addedAt

    /**
     * Returns the raw JSON value of [addedPrice].
     *
     * Unlike [addedPrice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("added_price") @ExcludeMissing fun _addedPrice(): JsonField<String> = addedPrice

    /**
     * Returns the raw JSON value of [instrument].
     *
     * Unlike [instrument], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("instrument")
    @ExcludeMissing
    fun _instrument(): JsonField<Instrument> = instrument

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
         * Returns a mutable builder for constructing an instance of [WatchlistItemEntry].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .addedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WatchlistItemEntry]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var addedAt: JsonField<OffsetDateTime>? = null
        private var addedPrice: JsonField<String> = JsonMissing.of()
        private var instrument: JsonField<Instrument> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(watchlistItemEntry: WatchlistItemEntry) = apply {
            id = watchlistItemEntry.id
            addedAt = watchlistItemEntry.addedAt
            addedPrice = watchlistItemEntry.addedPrice
            instrument = watchlistItemEntry.instrument
            additionalProperties = watchlistItemEntry.additionalProperties.toMutableMap()
        }

        /** Item ID */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** When the item was added */
        fun addedAt(addedAt: OffsetDateTime) = addedAt(JsonField.of(addedAt))

        /**
         * Sets [Builder.addedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addedAt(addedAt: JsonField<OffsetDateTime>) = apply { this.addedAt = addedAt }

        /** Price when the item was added */
        fun addedPrice(addedPrice: String?) = addedPrice(JsonField.ofNullable(addedPrice))

        /** Alias for calling [Builder.addedPrice] with `addedPrice.orElse(null)`. */
        fun addedPrice(addedPrice: Optional<String>) = addedPrice(addedPrice.getOrNull())

        /**
         * Sets [Builder.addedPrice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addedPrice] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addedPrice(addedPrice: JsonField<String>) = apply { this.addedPrice = addedPrice }

        /** Instrument details */
        fun instrument(instrument: Instrument?) = instrument(JsonField.ofNullable(instrument))

        /** Alias for calling [Builder.instrument] with `instrument.orElse(null)`. */
        fun instrument(instrument: Optional<Instrument>) = instrument(instrument.getOrNull())

        /**
         * Sets [Builder.instrument] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instrument] with a well-typed [Instrument] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instrument(instrument: JsonField<Instrument>) = apply { this.instrument = instrument }

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
         * Returns an immutable instance of [WatchlistItemEntry].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .addedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WatchlistItemEntry =
            WatchlistItemEntry(
                checkRequired("id", id),
                checkRequired("addedAt", addedAt),
                addedPrice,
                instrument,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WatchlistItemEntry = apply {
        if (validated) {
            return@apply
        }

        id()
        addedAt()
        addedPrice()
        instrument().ifPresent { it.validate() }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (addedAt.asKnown().isPresent) 1 else 0) +
            (if (addedPrice.asKnown().isPresent) 1 else 0) +
            (instrument.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WatchlistItemEntry &&
            id == other.id &&
            addedAt == other.addedAt &&
            addedPrice == other.addedPrice &&
            instrument == other.instrument &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, addedAt, addedPrice, instrument, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WatchlistItemEntry{id=$id, addedAt=$addedAt, addedPrice=$addedPrice, instrument=$instrument, additionalProperties=$additionalProperties}"
}
