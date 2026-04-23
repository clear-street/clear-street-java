// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.venues

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkKnown
import com.clear_street.api.core.checkRequired
import com.clear_street.api.core.toImmutable
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** A trading venue with its characteristics and capabilities */
class Venue
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val country: JsonField<String>,
    private val displayType: JsonField<DisplayType>,
    private val gtdAccepts: JsonField<GtdAccepts>,
    private val lotSize: JsonField<Long>,
    private val mic: JsonField<String>,
    private val name: JsonField<String>,
    private val sessions: JsonField<List<VenueSession>>,
    private val supportedOrderTypes: JsonField<List<String>>,
    private val supportedTifs: JsonField<List<String>>,
    private val tickSize: JsonField<String>,
    private val timezone: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("display_type")
        @ExcludeMissing
        displayType: JsonField<DisplayType> = JsonMissing.of(),
        @JsonProperty("gtd_accepts")
        @ExcludeMissing
        gtdAccepts: JsonField<GtdAccepts> = JsonMissing.of(),
        @JsonProperty("lot_size") @ExcludeMissing lotSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("mic") @ExcludeMissing mic: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sessions")
        @ExcludeMissing
        sessions: JsonField<List<VenueSession>> = JsonMissing.of(),
        @JsonProperty("supported_order_types")
        @ExcludeMissing
        supportedOrderTypes: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("supported_tifs")
        @ExcludeMissing
        supportedTifs: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("tick_size") @ExcludeMissing tickSize: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timezone") @ExcludeMissing timezone: JsonField<String> = JsonMissing.of(),
    ) : this(
        country,
        displayType,
        gtdAccepts,
        lotSize,
        mic,
        name,
        sessions,
        supportedOrderTypes,
        supportedTifs,
        tickSize,
        timezone,
        mutableMapOf(),
    )

    /**
     * The ISO country code where the venue operates
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun country(): String = country.getRequired("country")

    /**
     * The display characteristics of the venue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun displayType(): DisplayType = displayType.getRequired("display_type")

    /**
     * Indicates whether GOOD_TILL_DATE orders accept date-only or timestamp specifications
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun gtdAccepts(): GtdAccepts = gtdAccepts.getRequired("gtd_accepts")

    /**
     * The minimum quantity increment for orders at this venue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lotSize(): Long = lotSize.getRequired("lot_size")

    /**
     * The Market Identifier Code (MIC) for the venue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mic(): String = mic.getRequired("mic")

    /**
     * The display name of the venue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * Trading sessions available at this venue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessions(): List<VenueSession> = sessions.getRequired("sessions")

    /**
     * Order types supported by this venue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun supportedOrderTypes(): List<String> =
        supportedOrderTypes.getRequired("supported_order_types")

    /**
     * Time-in-force options supported by this venue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun supportedTifs(): List<String> = supportedTifs.getRequired("supported_tifs")

    /**
     * The minimum price increment for orders at this venue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tickSize(): String = tickSize.getRequired("tick_size")

    /**
     * IANA timezone identifier for the venue's local time
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timezone(): String = timezone.getRequired("timezone")

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [displayType].
     *
     * Unlike [displayType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("display_type")
    @ExcludeMissing
    fun _displayType(): JsonField<DisplayType> = displayType

    /**
     * Returns the raw JSON value of [gtdAccepts].
     *
     * Unlike [gtdAccepts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gtd_accepts")
    @ExcludeMissing
    fun _gtdAccepts(): JsonField<GtdAccepts> = gtdAccepts

    /**
     * Returns the raw JSON value of [lotSize].
     *
     * Unlike [lotSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lot_size") @ExcludeMissing fun _lotSize(): JsonField<Long> = lotSize

    /**
     * Returns the raw JSON value of [mic].
     *
     * Unlike [mic], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mic") @ExcludeMissing fun _mic(): JsonField<String> = mic

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [sessions].
     *
     * Unlike [sessions], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sessions")
    @ExcludeMissing
    fun _sessions(): JsonField<List<VenueSession>> = sessions

    /**
     * Returns the raw JSON value of [supportedOrderTypes].
     *
     * Unlike [supportedOrderTypes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supported_order_types")
    @ExcludeMissing
    fun _supportedOrderTypes(): JsonField<List<String>> = supportedOrderTypes

    /**
     * Returns the raw JSON value of [supportedTifs].
     *
     * Unlike [supportedTifs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("supported_tifs")
    @ExcludeMissing
    fun _supportedTifs(): JsonField<List<String>> = supportedTifs

    /**
     * Returns the raw JSON value of [tickSize].
     *
     * Unlike [tickSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tick_size") @ExcludeMissing fun _tickSize(): JsonField<String> = tickSize

    /**
     * Returns the raw JSON value of [timezone].
     *
     * Unlike [timezone], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

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
         * Returns a mutable builder for constructing an instance of [Venue].
         *
         * The following fields are required:
         * ```java
         * .country()
         * .displayType()
         * .gtdAccepts()
         * .lotSize()
         * .mic()
         * .name()
         * .sessions()
         * .supportedOrderTypes()
         * .supportedTifs()
         * .tickSize()
         * .timezone()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Venue]. */
    class Builder internal constructor() {

        private var country: JsonField<String>? = null
        private var displayType: JsonField<DisplayType>? = null
        private var gtdAccepts: JsonField<GtdAccepts>? = null
        private var lotSize: JsonField<Long>? = null
        private var mic: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var sessions: JsonField<MutableList<VenueSession>>? = null
        private var supportedOrderTypes: JsonField<MutableList<String>>? = null
        private var supportedTifs: JsonField<MutableList<String>>? = null
        private var tickSize: JsonField<String>? = null
        private var timezone: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(venue: Venue) = apply {
            country = venue.country
            displayType = venue.displayType
            gtdAccepts = venue.gtdAccepts
            lotSize = venue.lotSize
            mic = venue.mic
            name = venue.name
            sessions = venue.sessions.map { it.toMutableList() }
            supportedOrderTypes = venue.supportedOrderTypes.map { it.toMutableList() }
            supportedTifs = venue.supportedTifs.map { it.toMutableList() }
            tickSize = venue.tickSize
            timezone = venue.timezone
            additionalProperties = venue.additionalProperties.toMutableMap()
        }

        /** The ISO country code where the venue operates */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** The display characteristics of the venue */
        fun displayType(displayType: DisplayType) = displayType(JsonField.of(displayType))

        /**
         * Sets [Builder.displayType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.displayType] with a well-typed [DisplayType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun displayType(displayType: JsonField<DisplayType>) = apply {
            this.displayType = displayType
        }

        /** Indicates whether GOOD_TILL_DATE orders accept date-only or timestamp specifications */
        fun gtdAccepts(gtdAccepts: GtdAccepts) = gtdAccepts(JsonField.of(gtdAccepts))

        /**
         * Sets [Builder.gtdAccepts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.gtdAccepts] with a well-typed [GtdAccepts] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun gtdAccepts(gtdAccepts: JsonField<GtdAccepts>) = apply { this.gtdAccepts = gtdAccepts }

        /** The minimum quantity increment for orders at this venue */
        fun lotSize(lotSize: Long) = lotSize(JsonField.of(lotSize))

        /**
         * Sets [Builder.lotSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lotSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lotSize(lotSize: JsonField<Long>) = apply { this.lotSize = lotSize }

        /** The Market Identifier Code (MIC) for the venue */
        fun mic(mic: String) = mic(JsonField.of(mic))

        /**
         * Sets [Builder.mic] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mic] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mic(mic: JsonField<String>) = apply { this.mic = mic }

        /** The display name of the venue */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** Trading sessions available at this venue */
        fun sessions(sessions: List<VenueSession>) = sessions(JsonField.of(sessions))

        /**
         * Sets [Builder.sessions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessions] with a well-typed `List<VenueSession>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sessions(sessions: JsonField<List<VenueSession>>) = apply {
            this.sessions = sessions.map { it.toMutableList() }
        }

        /**
         * Adds a single [VenueSession] to [sessions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSession(session: VenueSession) = apply {
            sessions =
                (sessions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("sessions", it).add(session)
                }
        }

        /** Order types supported by this venue */
        fun supportedOrderTypes(supportedOrderTypes: List<String>) =
            supportedOrderTypes(JsonField.of(supportedOrderTypes))

        /**
         * Sets [Builder.supportedOrderTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedOrderTypes] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun supportedOrderTypes(supportedOrderTypes: JsonField<List<String>>) = apply {
            this.supportedOrderTypes = supportedOrderTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [supportedOrderTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupportedOrderType(supportedOrderType: String) = apply {
            supportedOrderTypes =
                (supportedOrderTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("supportedOrderTypes", it).add(supportedOrderType)
                }
        }

        /** Time-in-force options supported by this venue */
        fun supportedTifs(supportedTifs: List<String>) = supportedTifs(JsonField.of(supportedTifs))

        /**
         * Sets [Builder.supportedTifs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedTifs] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun supportedTifs(supportedTifs: JsonField<List<String>>) = apply {
            this.supportedTifs = supportedTifs.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [supportedTifs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupportedTif(supportedTif: String) = apply {
            supportedTifs =
                (supportedTifs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("supportedTifs", it).add(supportedTif)
                }
        }

        /** The minimum price increment for orders at this venue */
        fun tickSize(tickSize: String) = tickSize(JsonField.of(tickSize))

        /**
         * Sets [Builder.tickSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tickSize] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tickSize(tickSize: JsonField<String>) = apply { this.tickSize = tickSize }

        /** IANA timezone identifier for the venue's local time */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * Sets [Builder.timezone] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timezone] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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
         * Returns an immutable instance of [Venue].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .country()
         * .displayType()
         * .gtdAccepts()
         * .lotSize()
         * .mic()
         * .name()
         * .sessions()
         * .supportedOrderTypes()
         * .supportedTifs()
         * .tickSize()
         * .timezone()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Venue =
            Venue(
                checkRequired("country", country),
                checkRequired("displayType", displayType),
                checkRequired("gtdAccepts", gtdAccepts),
                checkRequired("lotSize", lotSize),
                checkRequired("mic", mic),
                checkRequired("name", name),
                checkRequired("sessions", sessions).map { it.toImmutable() },
                checkRequired("supportedOrderTypes", supportedOrderTypes).map { it.toImmutable() },
                checkRequired("supportedTifs", supportedTifs).map { it.toImmutable() },
                checkRequired("tickSize", tickSize),
                checkRequired("timezone", timezone),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Venue = apply {
        if (validated) {
            return@apply
        }

        country()
        displayType().validate()
        gtdAccepts().validate()
        lotSize()
        mic()
        name()
        sessions().forEach { it.validate() }
        supportedOrderTypes()
        supportedTifs()
        tickSize()
        timezone()
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
        (if (country.asKnown().isPresent) 1 else 0) +
            (displayType.asKnown().getOrNull()?.validity() ?: 0) +
            (gtdAccepts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (lotSize.asKnown().isPresent) 1 else 0) +
            (if (mic.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (sessions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (supportedOrderTypes.asKnown().getOrNull()?.size ?: 0) +
            (supportedTifs.asKnown().getOrNull()?.size ?: 0) +
            (if (tickSize.asKnown().isPresent) 1 else 0) +
            (if (timezone.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Venue &&
            country == other.country &&
            displayType == other.displayType &&
            gtdAccepts == other.gtdAccepts &&
            lotSize == other.lotSize &&
            mic == other.mic &&
            name == other.name &&
            sessions == other.sessions &&
            supportedOrderTypes == other.supportedOrderTypes &&
            supportedTifs == other.supportedTifs &&
            tickSize == other.tickSize &&
            timezone == other.timezone &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            country,
            displayType,
            gtdAccepts,
            lotSize,
            mic,
            name,
            sessions,
            supportedOrderTypes,
            supportedTifs,
            tickSize,
            timezone,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Venue{country=$country, displayType=$displayType, gtdAccepts=$gtdAccepts, lotSize=$lotSize, mic=$mic, name=$name, sessions=$sessions, supportedOrderTypes=$supportedOrderTypes, supportedTifs=$supportedTifs, tickSize=$tickSize, timezone=$timezone, additionalProperties=$additionalProperties}"
}
