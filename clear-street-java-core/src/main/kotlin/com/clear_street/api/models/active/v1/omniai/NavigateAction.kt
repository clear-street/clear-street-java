// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.omniai

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

/** Action to navigate to a client route. */
class NavigateAction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val route: JsonField<String>,
    private val params: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("route") @ExcludeMissing route: JsonField<String> = JsonMissing.of(),
        @JsonProperty("params") @ExcludeMissing params: JsonValue = JsonMissing.of(),
    ) : this(route, params, mutableMapOf())

    /**
     * Route path or key
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun route(): String = route.getRequired("route")

    /**
     * Route parameters
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = navigateAction.params().convert(MyClass.class);
     * ```
     */
    @JsonProperty("params") @ExcludeMissing fun _params(): JsonValue = params

    /**
     * Returns the raw JSON value of [route].
     *
     * Unlike [route], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("route") @ExcludeMissing fun _route(): JsonField<String> = route

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
         * Returns a mutable builder for constructing an instance of [NavigateAction].
         *
         * The following fields are required:
         * ```java
         * .route()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NavigateAction]. */
    class Builder internal constructor() {

        private var route: JsonField<String>? = null
        private var params: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(navigateAction: NavigateAction) = apply {
            route = navigateAction.route
            params = navigateAction.params
            additionalProperties = navigateAction.additionalProperties.toMutableMap()
        }

        /** Route path or key */
        fun route(route: String) = route(JsonField.of(route))

        /**
         * Sets [Builder.route] to an arbitrary JSON value.
         *
         * You should usually call [Builder.route] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun route(route: JsonField<String>) = apply { this.route = route }

        /** Route parameters */
        fun params(params: JsonValue) = apply { this.params = params }

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
         * Returns an immutable instance of [NavigateAction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .route()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NavigateAction =
            NavigateAction(
                checkRequired("route", route),
                params,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NavigateAction = apply {
        if (validated) {
            return@apply
        }

        route()
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
    @JvmSynthetic internal fun validity(): Int = (if (route.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NavigateAction &&
            route == other.route &&
            params == other.params &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(route, params, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NavigateAction{route=$route, params=$params, additionalProperties=$additionalProperties}"
}
