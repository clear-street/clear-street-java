// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.calendars.markethours

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Session schedule with open and close timestamps */
class SessionSchedule
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val close: JsonField<OffsetDateTime>,
    private val open: JsonField<OffsetDateTime>,
    private val timeUntilClose: JsonField<String>,
    private val timeUntilOpen: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("close") @ExcludeMissing close: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("open") @ExcludeMissing open: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("time_until_close")
        @ExcludeMissing
        timeUntilClose: JsonField<String> = JsonMissing.of(),
        @JsonProperty("time_until_open")
        @ExcludeMissing
        timeUntilOpen: JsonField<String> = JsonMissing.of(),
    ) : this(close, open, timeUntilClose, timeUntilOpen, mutableMapOf())

    /**
     * Session close timestamp with timezone offset
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun close(): OffsetDateTime = close.getRequired("close")

    /**
     * Session open timestamp with timezone offset
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun open(): OffsetDateTime = open.getRequired("open")

    /**
     * ISO 8601 duration until session closes. Null if session is not currently open.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeUntilClose(): Optional<String> = timeUntilClose.getOptional("time_until_close")

    /**
     * ISO 8601 duration until session opens. Null if session has already started or closed.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun timeUntilOpen(): Optional<String> = timeUntilOpen.getOptional("time_until_open")

    /**
     * Returns the raw JSON value of [close].
     *
     * Unlike [close], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("close") @ExcludeMissing fun _close(): JsonField<OffsetDateTime> = close

    /**
     * Returns the raw JSON value of [open].
     *
     * Unlike [open], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("open") @ExcludeMissing fun _open(): JsonField<OffsetDateTime> = open

    /**
     * Returns the raw JSON value of [timeUntilClose].
     *
     * Unlike [timeUntilClose], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("time_until_close")
    @ExcludeMissing
    fun _timeUntilClose(): JsonField<String> = timeUntilClose

    /**
     * Returns the raw JSON value of [timeUntilOpen].
     *
     * Unlike [timeUntilOpen], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("time_until_open")
    @ExcludeMissing
    fun _timeUntilOpen(): JsonField<String> = timeUntilOpen

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
         * Returns a mutable builder for constructing an instance of [SessionSchedule].
         *
         * The following fields are required:
         * ```java
         * .close()
         * .open()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SessionSchedule]. */
    class Builder internal constructor() {

        private var close: JsonField<OffsetDateTime>? = null
        private var open: JsonField<OffsetDateTime>? = null
        private var timeUntilClose: JsonField<String> = JsonMissing.of()
        private var timeUntilOpen: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(sessionSchedule: SessionSchedule) = apply {
            close = sessionSchedule.close
            open = sessionSchedule.open
            timeUntilClose = sessionSchedule.timeUntilClose
            timeUntilOpen = sessionSchedule.timeUntilOpen
            additionalProperties = sessionSchedule.additionalProperties.toMutableMap()
        }

        /** Session close timestamp with timezone offset */
        fun close(close: OffsetDateTime) = close(JsonField.of(close))

        /**
         * Sets [Builder.close] to an arbitrary JSON value.
         *
         * You should usually call [Builder.close] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun close(close: JsonField<OffsetDateTime>) = apply { this.close = close }

        /** Session open timestamp with timezone offset */
        fun open(open: OffsetDateTime) = open(JsonField.of(open))

        /**
         * Sets [Builder.open] to an arbitrary JSON value.
         *
         * You should usually call [Builder.open] with a well-typed [OffsetDateTime] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun open(open: JsonField<OffsetDateTime>) = apply { this.open = open }

        /** ISO 8601 duration until session closes. Null if session is not currently open. */
        fun timeUntilClose(timeUntilClose: String?) =
            timeUntilClose(JsonField.ofNullable(timeUntilClose))

        /** Alias for calling [Builder.timeUntilClose] with `timeUntilClose.orElse(null)`. */
        fun timeUntilClose(timeUntilClose: Optional<String>) =
            timeUntilClose(timeUntilClose.getOrNull())

        /**
         * Sets [Builder.timeUntilClose] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeUntilClose] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timeUntilClose(timeUntilClose: JsonField<String>) = apply {
            this.timeUntilClose = timeUntilClose
        }

        /** ISO 8601 duration until session opens. Null if session has already started or closed. */
        fun timeUntilOpen(timeUntilOpen: String?) =
            timeUntilOpen(JsonField.ofNullable(timeUntilOpen))

        /** Alias for calling [Builder.timeUntilOpen] with `timeUntilOpen.orElse(null)`. */
        fun timeUntilOpen(timeUntilOpen: Optional<String>) =
            timeUntilOpen(timeUntilOpen.getOrNull())

        /**
         * Sets [Builder.timeUntilOpen] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timeUntilOpen] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun timeUntilOpen(timeUntilOpen: JsonField<String>) = apply {
            this.timeUntilOpen = timeUntilOpen
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
         * Returns an immutable instance of [SessionSchedule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .close()
         * .open()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionSchedule =
            SessionSchedule(
                checkRequired("close", close),
                checkRequired("open", open),
                timeUntilClose,
                timeUntilOpen,
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
    fun validate(): SessionSchedule = apply {
        if (validated) {
            return@apply
        }

        close()
        open()
        timeUntilClose()
        timeUntilOpen()
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
        (if (close.asKnown().isPresent) 1 else 0) +
            (if (open.asKnown().isPresent) 1 else 0) +
            (if (timeUntilClose.asKnown().isPresent) 1 else 0) +
            (if (timeUntilOpen.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionSchedule &&
            close == other.close &&
            open == other.open &&
            timeUntilClose == other.timeUntilClose &&
            timeUntilOpen == other.timeUntilOpen &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(close, open, timeUntilClose, timeUntilOpen, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionSchedule{close=$close, open=$open, timeUntilClose=$timeUntilClose, timeUntilOpen=$timeUntilOpen, additionalProperties=$additionalProperties}"
}
