// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A company's identity and its complete published profile. */
class CompanyDetail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val profile: JsonField<CompanyProfileResource>,
    private val profileSchemaVersion: JsonField<Int>,
    private val shortDescription: JsonField<String>,
    private val slug: JsonField<String>,
    private val logoUrl: JsonField<String>,
    private val primaryDomain: JsonField<String>,
    private val publishedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("profile")
        @ExcludeMissing
        profile: JsonField<CompanyProfileResource> = JsonMissing.of(),
        @JsonProperty("profile_schema_version")
        @ExcludeMissing
        profileSchemaVersion: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("short_description")
        @ExcludeMissing
        shortDescription: JsonField<String> = JsonMissing.of(),
        @JsonProperty("slug") @ExcludeMissing slug: JsonField<String> = JsonMissing.of(),
        @JsonProperty("logo_url") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("primary_domain")
        @ExcludeMissing
        primaryDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("published_at")
        @ExcludeMissing
        publishedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        name,
        profile,
        profileSchemaVersion,
        shortDescription,
        slug,
        logoUrl,
        primaryDomain,
        publishedAt,
        mutableMapOf(),
    )

    /**
     * Stable company identifier.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Display name.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The complete versioned company profile.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun profile(): CompanyProfileResource = profile.getRequired("profile")

    /**
     * Profile schema version discriminator.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun profileSchemaVersion(): Int = profileSchemaVersion.getRequired("profile_schema_version")

    /**
     * Short card/search description.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun shortDescription(): String = shortDescription.getRequired("short_description")

    /**
     * Lowercase URL slug.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun slug(): String = slug.getRequired("slug")

    /**
     * Company logo URL, when known.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun logoUrl(): Optional<String> = logoUrl.getOptional("logo_url")

    /**
     * Canonical lowercase domain, when known.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun primaryDomain(): Optional<String> = primaryDomain.getOptional("primary_domain")

    /**
     * Publication time.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publishedAt(): Optional<OffsetDateTime> = publishedAt.getOptional("published_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [profile].
     *
     * Unlike [profile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("profile")
    @ExcludeMissing
    fun _profile(): JsonField<CompanyProfileResource> = profile

    /**
     * Returns the raw JSON value of [profileSchemaVersion].
     *
     * Unlike [profileSchemaVersion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("profile_schema_version")
    @ExcludeMissing
    fun _profileSchemaVersion(): JsonField<Int> = profileSchemaVersion

    /**
     * Returns the raw JSON value of [shortDescription].
     *
     * Unlike [shortDescription], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("short_description")
    @ExcludeMissing
    fun _shortDescription(): JsonField<String> = shortDescription

    /**
     * Returns the raw JSON value of [slug].
     *
     * Unlike [slug], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("slug") @ExcludeMissing fun _slug(): JsonField<String> = slug

    /**
     * Returns the raw JSON value of [logoUrl].
     *
     * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("logo_url") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

    /**
     * Returns the raw JSON value of [primaryDomain].
     *
     * Unlike [primaryDomain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("primary_domain")
    @ExcludeMissing
    fun _primaryDomain(): JsonField<String> = primaryDomain

    /**
     * Returns the raw JSON value of [publishedAt].
     *
     * Unlike [publishedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("published_at")
    @ExcludeMissing
    fun _publishedAt(): JsonField<OffsetDateTime> = publishedAt

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
         * Returns a mutable builder for constructing an instance of [CompanyDetail].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .profile()
         * .profileSchemaVersion()
         * .shortDescription()
         * .slug()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyDetail]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var profile: JsonField<CompanyProfileResource>? = null
        private var profileSchemaVersion: JsonField<Int>? = null
        private var shortDescription: JsonField<String>? = null
        private var slug: JsonField<String>? = null
        private var logoUrl: JsonField<String> = JsonMissing.of()
        private var primaryDomain: JsonField<String> = JsonMissing.of()
        private var publishedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(companyDetail: CompanyDetail) = apply {
            id = companyDetail.id
            name = companyDetail.name
            profile = companyDetail.profile
            profileSchemaVersion = companyDetail.profileSchemaVersion
            shortDescription = companyDetail.shortDescription
            slug = companyDetail.slug
            logoUrl = companyDetail.logoUrl
            primaryDomain = companyDetail.primaryDomain
            publishedAt = companyDetail.publishedAt
            additionalProperties = companyDetail.additionalProperties.toMutableMap()
        }

        /** Stable company identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Display name. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The complete versioned company profile. */
        fun profile(profile: CompanyProfileResource) = profile(JsonField.of(profile))

        /**
         * Sets [Builder.profile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profile] with a well-typed [CompanyProfileResource]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun profile(profile: JsonField<CompanyProfileResource>) = apply { this.profile = profile }

        /** Profile schema version discriminator. */
        fun profileSchemaVersion(profileSchemaVersion: Int) =
            profileSchemaVersion(JsonField.of(profileSchemaVersion))

        /**
         * Sets [Builder.profileSchemaVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.profileSchemaVersion] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun profileSchemaVersion(profileSchemaVersion: JsonField<Int>) = apply {
            this.profileSchemaVersion = profileSchemaVersion
        }

        /** Short card/search description. */
        fun shortDescription(shortDescription: String) =
            shortDescription(JsonField.of(shortDescription))

        /**
         * Sets [Builder.shortDescription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortDescription] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shortDescription(shortDescription: JsonField<String>) = apply {
            this.shortDescription = shortDescription
        }

        /** Lowercase URL slug. */
        fun slug(slug: String) = slug(JsonField.of(slug))

        /**
         * Sets [Builder.slug] to an arbitrary JSON value.
         *
         * You should usually call [Builder.slug] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun slug(slug: JsonField<String>) = apply { this.slug = slug }

        /** Company logo URL, when known. */
        fun logoUrl(logoUrl: String?) = logoUrl(JsonField.ofNullable(logoUrl))

        /** Alias for calling [Builder.logoUrl] with `logoUrl.orElse(null)`. */
        fun logoUrl(logoUrl: Optional<String>) = logoUrl(logoUrl.getOrNull())

        /**
         * Sets [Builder.logoUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.logoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

        /** Canonical lowercase domain, when known. */
        fun primaryDomain(primaryDomain: String?) =
            primaryDomain(JsonField.ofNullable(primaryDomain))

        /** Alias for calling [Builder.primaryDomain] with `primaryDomain.orElse(null)`. */
        fun primaryDomain(primaryDomain: Optional<String>) =
            primaryDomain(primaryDomain.getOrNull())

        /**
         * Sets [Builder.primaryDomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.primaryDomain] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun primaryDomain(primaryDomain: JsonField<String>) = apply {
            this.primaryDomain = primaryDomain
        }

        /** Publication time. */
        fun publishedAt(publishedAt: OffsetDateTime?) =
            publishedAt(JsonField.ofNullable(publishedAt))

        /** Alias for calling [Builder.publishedAt] with `publishedAt.orElse(null)`. */
        fun publishedAt(publishedAt: Optional<OffsetDateTime>) =
            publishedAt(publishedAt.getOrNull())

        /**
         * Sets [Builder.publishedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publishedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun publishedAt(publishedAt: JsonField<OffsetDateTime>) = apply {
            this.publishedAt = publishedAt
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
         * Returns an immutable instance of [CompanyDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .name()
         * .profile()
         * .profileSchemaVersion()
         * .shortDescription()
         * .slug()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CompanyDetail =
            CompanyDetail(
                checkRequired("id", id),
                checkRequired("name", name),
                checkRequired("profile", profile),
                checkRequired("profileSchemaVersion", profileSchemaVersion),
                checkRequired("shortDescription", shortDescription),
                checkRequired("slug", slug),
                logoUrl,
                primaryDomain,
                publishedAt,
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
    fun validate(): CompanyDetail = apply {
        if (validated) {
            return@apply
        }

        id()
        name()
        profile().validate()
        profileSchemaVersion()
        shortDescription()
        slug()
        logoUrl()
        primaryDomain()
        publishedAt()
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
            (if (name.asKnown().isPresent) 1 else 0) +
            (profile.asKnown().getOrNull()?.validity() ?: 0) +
            (if (profileSchemaVersion.asKnown().isPresent) 1 else 0) +
            (if (shortDescription.asKnown().isPresent) 1 else 0) +
            (if (slug.asKnown().isPresent) 1 else 0) +
            (if (logoUrl.asKnown().isPresent) 1 else 0) +
            (if (primaryDomain.asKnown().isPresent) 1 else 0) +
            (if (publishedAt.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyDetail &&
            id == other.id &&
            name == other.name &&
            profile == other.profile &&
            profileSchemaVersion == other.profileSchemaVersion &&
            shortDescription == other.shortDescription &&
            slug == other.slug &&
            logoUrl == other.logoUrl &&
            primaryDomain == other.primaryDomain &&
            publishedAt == other.publishedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            name,
            profile,
            profileSchemaVersion,
            shortDescription,
            slug,
            logoUrl,
            primaryDomain,
            publishedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyDetail{id=$id, name=$name, profile=$profile, profileSchemaVersion=$profileSchemaVersion, shortDescription=$shortDescription, slug=$slug, logoUrl=$logoUrl, primaryDomain=$primaryDomain, publishedAt=$publishedAt, additionalProperties=$additionalProperties}"
}
