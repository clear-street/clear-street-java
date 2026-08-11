// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.alerts

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.Params
import com.clearstreet.api.core.checkRequired
import com.clearstreet.api.core.http.Headers
import com.clearstreet.api.core.http.QueryParams
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Create an alert that watches a market or portfolio condition on the account and notifies when it
 * triggers.
 *
 * The alert starts evaluating immediately. A `once` alert triggers a single time and then
 * completes. Instrument references in the condition accept a ticker symbol or an OEMS instrument
 * id; they are stored and returned as instrument ids.
 *
 * `account_id` is optional: an alert without one may only watch market conditions, so a condition
 * that reads account data (an `account.*` signal or a holdings scope) is rejected without it.
 */
class AlertCreateAlertParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The boolean condition tree, in the condition grammar. `"instrument_id"` references accept a
     * ticker or an OEMS instrument id.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = alertCreateAlertParams.condition().convert(MyClass.class);
     * ```
     */
    fun _condition(): JsonValue = body._condition()

    /**
     * How often an alert's condition is evaluated.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun schedule(): Schedule = body.schedule()

    /**
     * How an alert triggers. `once` alerts complete after their first trigger.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trigger(): TriggerMode = body.trigger()

    /**
     * The account whose `account.*` signals and holdings scopes the condition reads. Optional: a
     * market-only alert needs no account.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountId(): Optional<Long> = body.accountId()

    /**
     * Returns the raw JSON value of [schedule].
     *
     * Unlike [schedule], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _schedule(): JsonField<Schedule> = body._schedule()

    /**
     * Returns the raw JSON value of [trigger].
     *
     * Unlike [trigger], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trigger(): JsonField<TriggerMode> = body._trigger()

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountId(): JsonField<Long> = body._accountId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AlertCreateAlertParams].
         *
         * The following fields are required:
         * ```java
         * .condition()
         * .schedule()
         * .trigger()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AlertCreateAlertParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(alertCreateAlertParams: AlertCreateAlertParams) = apply {
            body = alertCreateAlertParams.body.toBuilder()
            additionalHeaders = alertCreateAlertParams.additionalHeaders.toBuilder()
            additionalQueryParams = alertCreateAlertParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [condition]
         * - [schedule]
         * - [trigger]
         * - [accountId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The boolean condition tree, in the condition grammar. `"instrument_id"` references accept
         * a ticker or an OEMS instrument id.
         */
        fun condition(condition: JsonValue) = apply { body.condition(condition) }

        /** How often an alert's condition is evaluated. */
        fun schedule(schedule: Schedule) = apply { body.schedule(schedule) }

        /**
         * Sets [Builder.schedule] to an arbitrary JSON value.
         *
         * You should usually call [Builder.schedule] with a well-typed [Schedule] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun schedule(schedule: JsonField<Schedule>) = apply { body.schedule(schedule) }

        /** How an alert triggers. `once` alerts complete after their first trigger. */
        fun trigger(trigger: TriggerMode) = apply { body.trigger(trigger) }

        /**
         * Sets [Builder.trigger] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trigger] with a well-typed [TriggerMode] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trigger(trigger: JsonField<TriggerMode>) = apply { body.trigger(trigger) }

        /**
         * The account whose `account.*` signals and holdings scopes the condition reads. Optional:
         * a market-only alert needs no account.
         */
        fun accountId(accountId: Long?) = apply { body.accountId(accountId) }

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
        fun accountId(accountId: JsonField<Long>) = apply { body.accountId(accountId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [AlertCreateAlertParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .condition()
         * .schedule()
         * .trigger()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AlertCreateAlertParams =
            AlertCreateAlertParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Create-alert request body. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val condition: JsonValue,
        private val schedule: JsonField<Schedule>,
        private val trigger: JsonField<TriggerMode>,
        private val accountId: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("condition") @ExcludeMissing condition: JsonValue = JsonMissing.of(),
            @JsonProperty("schedule")
            @ExcludeMissing
            schedule: JsonField<Schedule> = JsonMissing.of(),
            @JsonProperty("trigger")
            @ExcludeMissing
            trigger: JsonField<TriggerMode> = JsonMissing.of(),
            @JsonProperty("account_id")
            @ExcludeMissing
            accountId: JsonField<Long> = JsonMissing.of(),
        ) : this(condition, schedule, trigger, accountId, mutableMapOf())

        /**
         * The boolean condition tree, in the condition grammar. `"instrument_id"` references accept
         * a ticker or an OEMS instrument id.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = body.condition().convert(MyClass.class);
         * ```
         */
        @JsonProperty("condition") @ExcludeMissing fun _condition(): JsonValue = condition

        /**
         * How often an alert's condition is evaluated.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun schedule(): Schedule = schedule.getRequired("schedule")

        /**
         * How an alert triggers. `once` alerts complete after their first trigger.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun trigger(): TriggerMode = trigger.getRequired("trigger")

        /**
         * The account whose `account.*` signals and holdings scopes the condition reads. Optional:
         * a market-only alert needs no account.
         *
         * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accountId(): Optional<Long> = accountId.getOptional("account_id")

        /**
         * Returns the raw JSON value of [schedule].
         *
         * Unlike [schedule], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("schedule") @ExcludeMissing fun _schedule(): JsonField<Schedule> = schedule

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .condition()
             * .schedule()
             * .trigger()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var condition: JsonValue? = null
            private var schedule: JsonField<Schedule>? = null
            private var trigger: JsonField<TriggerMode>? = null
            private var accountId: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                condition = body.condition
                schedule = body.schedule
                trigger = body.trigger
                accountId = body.accountId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The boolean condition tree, in the condition grammar. `"instrument_id"` references
             * accept a ticker or an OEMS instrument id.
             */
            fun condition(condition: JsonValue) = apply { this.condition = condition }

            /** How often an alert's condition is evaluated. */
            fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

            /**
             * Sets [Builder.schedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schedule] with a well-typed [Schedule] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

            /** How an alert triggers. `once` alerts complete after their first trigger. */
            fun trigger(trigger: TriggerMode) = trigger(JsonField.of(trigger))

            /**
             * Sets [Builder.trigger] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trigger] with a well-typed [TriggerMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trigger(trigger: JsonField<TriggerMode>) = apply { this.trigger = trigger }

            /**
             * The account whose `account.*` signals and holdings scopes the condition reads.
             * Optional: a market-only alert needs no account.
             */
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .condition()
             * .schedule()
             * .trigger()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("condition", condition),
                    checkRequired("schedule", schedule),
                    checkRequired("trigger", trigger),
                    accountId,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            schedule().validate()
            trigger().validate()
            accountId()
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
            (schedule.asKnown().getOrNull()?.validity() ?: 0) +
                (trigger.asKnown().getOrNull()?.validity() ?: 0) +
                (if (accountId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                condition == other.condition &&
                schedule == other.schedule &&
                trigger == other.trigger &&
                accountId == other.accountId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(condition, schedule, trigger, accountId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{condition=$condition, schedule=$schedule, trigger=$trigger, accountId=$accountId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AlertCreateAlertParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AlertCreateAlertParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
