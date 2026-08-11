// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.alerts

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A stored alert: the spec it was created with plus its lifecycle facts. */
class Alert
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val condition: JsonValue,
    private val createdAt: JsonField<String>,
    private val schedule: JsonField<Schedule>,
    private val source: JsonField<AlertSource>,
    private val status: JsonField<AlertStatus>,
    private val trigger: JsonField<TriggerMode>,
    private val accountId: JsonField<Long>,
    private val expiresAt: JsonField<String>,
    private val omniText: JsonField<String>,
    private val triggeredAt: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("condition") @ExcludeMissing condition: JsonValue = JsonMissing.of(),
        @JsonProperty("created_at") @ExcludeMissing createdAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("schedule") @ExcludeMissing schedule: JsonField<Schedule> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<AlertSource> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<AlertStatus> = JsonMissing.of(),
        @JsonProperty("trigger") @ExcludeMissing trigger: JsonField<TriggerMode> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("expires_at") @ExcludeMissing expiresAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("omni_text") @ExcludeMissing omniText: JsonField<String> = JsonMissing.of(),
        @JsonProperty("triggered_at")
        @ExcludeMissing
        triggeredAt: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        condition,
        createdAt,
        schedule,
        source,
        status,
        trigger,
        accountId,
        expiresAt,
        omniText,
        triggeredAt,
        mutableMapOf(),
    )

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The boolean condition tree, with instrument references resolved to OEMS instrument ids.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = alert.condition().convert(MyClass.class);
     * ```
     */
    @JsonProperty("condition") @ExcludeMissing fun _condition(): JsonValue = condition

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): String = createdAt.getRequired("created_at")

    /**
     * How often an alert's condition is evaluated.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun schedule(): Schedule = schedule.getRequired("schedule")

    /**
     * Where an alert came from.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): AlertSource = source.getRequired("source")

    /**
     * Lifecycle status of an alert. Soft-deleted alerts are invisible on this API, so there is no
     * `deleted` value.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): AlertStatus = status.getRequired("status")

    /**
     * How an alert triggers. `once` alerts complete after their first trigger.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trigger(): TriggerMode = trigger.getRequired("trigger")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountId(): Optional<Long> = accountId.getOptional("account_id")

    /**
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<String> = expiresAt.getOptional("expires_at")

    /**
     * The originating natural-language text, for alerts compiled from one.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun omniText(): Optional<String> = omniText.getOptional("omni_text")

    /**
     * When the alert last triggered; absent if it never has.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun triggeredAt(): Optional<String> = triggeredAt.getOptional("triggered_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt(): JsonField<String> = createdAt

    /**
     * Returns the raw JSON value of [schedule].
     *
     * Unlike [schedule], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schedule") @ExcludeMissing fun _schedule(): JsonField<Schedule> = schedule

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<AlertSource> = source

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<AlertStatus> = status

    /**
     * Returns the raw JSON value of [trigger].
     *
     * Unlike [trigger], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trigger") @ExcludeMissing fun _trigger(): JsonField<TriggerMode> = trigger

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<Long> = accountId

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt(): JsonField<String> = expiresAt

    /**
     * Returns the raw JSON value of [omniText].
     *
     * Unlike [omniText], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("omni_text") @ExcludeMissing fun _omniText(): JsonField<String> = omniText

    /**
     * Returns the raw JSON value of [triggeredAt].
     *
     * Unlike [triggeredAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("triggered_at")
    @ExcludeMissing
    fun _triggeredAt(): JsonField<String> = triggeredAt

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
         * Returns a mutable builder for constructing an instance of [Alert].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .condition()
         * .createdAt()
         * .schedule()
         * .source()
         * .status()
         * .trigger()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Alert]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var condition: JsonValue? = null
        private var createdAt: JsonField<String>? = null
        private var schedule: JsonField<Schedule>? = null
        private var source: JsonField<AlertSource>? = null
        private var status: JsonField<AlertStatus>? = null
        private var trigger: JsonField<TriggerMode>? = null
        private var accountId: JsonField<Long> = JsonMissing.of()
        private var expiresAt: JsonField<String> = JsonMissing.of()
        private var omniText: JsonField<String> = JsonMissing.of()
        private var triggeredAt: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(alert: Alert) = apply {
            id = alert.id
            condition = alert.condition
            createdAt = alert.createdAt
            schedule = alert.schedule
            source = alert.source
            status = alert.status
            trigger = alert.trigger
            accountId = alert.accountId
            expiresAt = alert.expiresAt
            omniText = alert.omniText
            triggeredAt = alert.triggeredAt
            additionalProperties = alert.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The boolean condition tree, with instrument references resolved to OEMS instrument ids.
         */
        fun condition(condition: JsonValue) = apply { this.condition = condition }

        fun createdAt(createdAt: String) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdAt(createdAt: JsonField<String>) = apply { this.createdAt = createdAt }

        /** How often an alert's condition is evaluated. */
        fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

        /**
         * Sets [Builder.schedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schedule] with a well-typed [Schedule] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

        /** Where an alert came from. */
        fun source(source: AlertSource) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [AlertSource] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun source(source: JsonField<AlertSource>) = apply { this.source = source }

        /**
         * Lifecycle status of an alert. Soft-deleted alerts are invisible on this API, so there is
         * no `deleted` value.
         */
        fun status(status: AlertStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [AlertStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<AlertStatus>) = apply { this.status = status }

        /** How an alert triggers. `once` alerts complete after their first trigger. */
        fun trigger(trigger: TriggerMode) = trigger(JsonField.of(trigger))

        /**
         * Sets [Builder.trigger] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trigger] with a well-typed [TriggerMode] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trigger(trigger: JsonField<TriggerMode>) = apply { this.trigger = trigger }

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
         * You should usually call [Builder.accountId] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun accountId(accountId: JsonField<Long>) = apply { this.accountId = accountId }

        fun expiresAt(expiresAt: String?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<String>) = expiresAt(expiresAt.getOrNull())

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiresAt(expiresAt: JsonField<String>) = apply { this.expiresAt = expiresAt }

        /** The originating natural-language text, for alerts compiled from one. */
        fun omniText(omniText: String?) = omniText(JsonField.ofNullable(omniText))

        /** Alias for calling [Builder.omniText] with `omniText.orElse(null)`. */
        fun omniText(omniText: Optional<String>) = omniText(omniText.getOrNull())

        /**
         * Sets [Builder.omniText] to an arbitrary JSON value.
         *
         * You should usually call [Builder.omniText] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun omniText(omniText: JsonField<String>) = apply { this.omniText = omniText }

        /** When the alert last triggered; absent if it never has. */
        fun triggeredAt(triggeredAt: String?) = triggeredAt(JsonField.ofNullable(triggeredAt))

        /** Alias for calling [Builder.triggeredAt] with `triggeredAt.orElse(null)`. */
        fun triggeredAt(triggeredAt: Optional<String>) = triggeredAt(triggeredAt.getOrNull())

        /**
         * Sets [Builder.triggeredAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.triggeredAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun triggeredAt(triggeredAt: JsonField<String>) = apply { this.triggeredAt = triggeredAt }

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
         * Returns an immutable instance of [Alert].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .condition()
         * .createdAt()
         * .schedule()
         * .source()
         * .status()
         * .trigger()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Alert =
            Alert(
                checkRequired("id", id),
                checkRequired("condition", condition),
                checkRequired("createdAt", createdAt),
                checkRequired("schedule", schedule),
                checkRequired("source", source),
                checkRequired("status", status),
                checkRequired("trigger", trigger),
                accountId,
                expiresAt,
                omniText,
                triggeredAt,
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
    fun validate(): Alert = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        schedule().validate()
        source().validate()
        status().validate()
        trigger().validate()
        accountId()
        expiresAt()
        omniText()
        triggeredAt()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (schedule.asKnown().getOrNull()?.validity() ?: 0) +
            (source.asKnown().getOrNull()?.validity() ?: 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (trigger.asKnown().getOrNull()?.validity() ?: 0) +
            (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (omniText.asKnown().isPresent) 1 else 0) +
            (if (triggeredAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Alert &&
            id == other.id &&
            condition == other.condition &&
            createdAt == other.createdAt &&
            schedule == other.schedule &&
            source == other.source &&
            status == other.status &&
            trigger == other.trigger &&
            accountId == other.accountId &&
            expiresAt == other.expiresAt &&
            omniText == other.omniText &&
            triggeredAt == other.triggeredAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            condition,
            createdAt,
            schedule,
            source,
            status,
            trigger,
            accountId,
            expiresAt,
            omniText,
            triggeredAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Alert{id=$id, condition=$condition, createdAt=$createdAt, schedule=$schedule, source=$source, status=$status, trigger=$trigger, accountId=$accountId, expiresAt=$expiresAt, omniText=$omniText, triggeredAt=$triggeredAt, additionalProperties=$additionalProperties}"
}
