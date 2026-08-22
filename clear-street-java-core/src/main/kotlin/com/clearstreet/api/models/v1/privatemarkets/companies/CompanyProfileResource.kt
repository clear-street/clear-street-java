// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.ExcludeMissing
import com.clearstreet.api.core.JsonField
import com.clearstreet.api.core.JsonMissing
import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.checkKnown
import com.clearstreet.api.core.toImmutable
import com.clearstreet.api.errors.ClearStreetInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** The complete versioned company profile (schema version one). */
class CompanyProfileResource
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val categories: JsonField<List<CompanyCategory>>,
    private val citations: JsonField<List<CompanyCitation>>,
    private val customers: JsonField<List<CompanyCustomer>>,
    private val documents: JsonField<List<CompanyDocumentResource>>,
    private val headquarters: JsonField<CompanyHeadquarters>,
    private val legalEntities: JsonField<List<CompanyLegalEntity>>,
    private val metricSeries: JsonField<List<CompanyMetricSeries>>,
    private val narrativeSections: JsonField<List<CompanyNarrativeSection>>,
    private val overview: JsonField<String>,
    private val people: JsonField<List<CompanyPerson>>,
    private val social: JsonField<List<CompanySocialLink>>,
    private val tagline: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("categories")
        @ExcludeMissing
        categories: JsonField<List<CompanyCategory>> = JsonMissing.of(),
        @JsonProperty("citations")
        @ExcludeMissing
        citations: JsonField<List<CompanyCitation>> = JsonMissing.of(),
        @JsonProperty("customers")
        @ExcludeMissing
        customers: JsonField<List<CompanyCustomer>> = JsonMissing.of(),
        @JsonProperty("documents")
        @ExcludeMissing
        documents: JsonField<List<CompanyDocumentResource>> = JsonMissing.of(),
        @JsonProperty("headquarters")
        @ExcludeMissing
        headquarters: JsonField<CompanyHeadquarters> = JsonMissing.of(),
        @JsonProperty("legal_entities")
        @ExcludeMissing
        legalEntities: JsonField<List<CompanyLegalEntity>> = JsonMissing.of(),
        @JsonProperty("metric_series")
        @ExcludeMissing
        metricSeries: JsonField<List<CompanyMetricSeries>> = JsonMissing.of(),
        @JsonProperty("narrative_sections")
        @ExcludeMissing
        narrativeSections: JsonField<List<CompanyNarrativeSection>> = JsonMissing.of(),
        @JsonProperty("overview") @ExcludeMissing overview: JsonField<String> = JsonMissing.of(),
        @JsonProperty("people")
        @ExcludeMissing
        people: JsonField<List<CompanyPerson>> = JsonMissing.of(),
        @JsonProperty("social")
        @ExcludeMissing
        social: JsonField<List<CompanySocialLink>> = JsonMissing.of(),
        @JsonProperty("tagline") @ExcludeMissing tagline: JsonField<String> = JsonMissing.of(),
    ) : this(
        categories,
        citations,
        customers,
        documents,
        headquarters,
        legalEntities,
        metricSeries,
        narrativeSections,
        overview,
        people,
        social,
        tagline,
        mutableMapOf(),
    )

    /**
     * Company categories.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun categories(): Optional<List<CompanyCategory>> = categories.getOptional("categories")

    /**
     * Sources referenced by narrative sections and metrics.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun citations(): Optional<List<CompanyCitation>> = citations.getOptional("citations")

    /**
     * Named customers evidenced by the source material.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customers(): Optional<List<CompanyCustomer>> = customers.getOptional("customers")

    /**
     * Company-level research and source documents.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun documents(): Optional<List<CompanyDocumentResource>> = documents.getOptional("documents")

    /**
     * Company headquarters, when known.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun headquarters(): Optional<CompanyHeadquarters> = headquarters.getOptional("headquarters")

    /**
     * Known legal entities associated with the company.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun legalEntities(): Optional<List<CompanyLegalEntity>> =
        legalEntities.getOptional("legal_entities")

    /**
     * Historical and estimated metric series.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metricSeries(): Optional<List<CompanyMetricSeries>> =
        metricSeries.getOptional("metric_series")

    /**
     * Ordered durable company fact and thesis blocks.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun narrativeSections(): Optional<List<CompanyNarrativeSection>> =
        narrativeSections.getOptional("narrative_sections")

    /**
     * Long company overview.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overview(): Optional<String> = overview.getOptional("overview")

    /**
     * Key people and their roles.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun people(): Optional<List<CompanyPerson>> = people.getOptional("people")

    /**
     * Social/profile links.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun social(): Optional<List<CompanySocialLink>> = social.getOptional("social")

    /**
     * Short durable positioning line used with the company name.
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tagline(): Optional<String> = tagline.getOptional("tagline")

    /**
     * Returns the raw JSON value of [categories].
     *
     * Unlike [categories], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("categories")
    @ExcludeMissing
    fun _categories(): JsonField<List<CompanyCategory>> = categories

    /**
     * Returns the raw JSON value of [citations].
     *
     * Unlike [citations], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("citations")
    @ExcludeMissing
    fun _citations(): JsonField<List<CompanyCitation>> = citations

    /**
     * Returns the raw JSON value of [customers].
     *
     * Unlike [customers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customers")
    @ExcludeMissing
    fun _customers(): JsonField<List<CompanyCustomer>> = customers

    /**
     * Returns the raw JSON value of [documents].
     *
     * Unlike [documents], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documents")
    @ExcludeMissing
    fun _documents(): JsonField<List<CompanyDocumentResource>> = documents

    /**
     * Returns the raw JSON value of [headquarters].
     *
     * Unlike [headquarters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("headquarters")
    @ExcludeMissing
    fun _headquarters(): JsonField<CompanyHeadquarters> = headquarters

    /**
     * Returns the raw JSON value of [legalEntities].
     *
     * Unlike [legalEntities], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legal_entities")
    @ExcludeMissing
    fun _legalEntities(): JsonField<List<CompanyLegalEntity>> = legalEntities

    /**
     * Returns the raw JSON value of [metricSeries].
     *
     * Unlike [metricSeries], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metric_series")
    @ExcludeMissing
    fun _metricSeries(): JsonField<List<CompanyMetricSeries>> = metricSeries

    /**
     * Returns the raw JSON value of [narrativeSections].
     *
     * Unlike [narrativeSections], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("narrative_sections")
    @ExcludeMissing
    fun _narrativeSections(): JsonField<List<CompanyNarrativeSection>> = narrativeSections

    /**
     * Returns the raw JSON value of [overview].
     *
     * Unlike [overview], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("overview") @ExcludeMissing fun _overview(): JsonField<String> = overview

    /**
     * Returns the raw JSON value of [people].
     *
     * Unlike [people], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("people") @ExcludeMissing fun _people(): JsonField<List<CompanyPerson>> = people

    /**
     * Returns the raw JSON value of [social].
     *
     * Unlike [social], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("social")
    @ExcludeMissing
    fun _social(): JsonField<List<CompanySocialLink>> = social

    /**
     * Returns the raw JSON value of [tagline].
     *
     * Unlike [tagline], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tagline") @ExcludeMissing fun _tagline(): JsonField<String> = tagline

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

        /** Returns a mutable builder for constructing an instance of [CompanyProfileResource]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CompanyProfileResource]. */
    class Builder internal constructor() {

        private var categories: JsonField<MutableList<CompanyCategory>>? = null
        private var citations: JsonField<MutableList<CompanyCitation>>? = null
        private var customers: JsonField<MutableList<CompanyCustomer>>? = null
        private var documents: JsonField<MutableList<CompanyDocumentResource>>? = null
        private var headquarters: JsonField<CompanyHeadquarters> = JsonMissing.of()
        private var legalEntities: JsonField<MutableList<CompanyLegalEntity>>? = null
        private var metricSeries: JsonField<MutableList<CompanyMetricSeries>>? = null
        private var narrativeSections: JsonField<MutableList<CompanyNarrativeSection>>? = null
        private var overview: JsonField<String> = JsonMissing.of()
        private var people: JsonField<MutableList<CompanyPerson>>? = null
        private var social: JsonField<MutableList<CompanySocialLink>>? = null
        private var tagline: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(companyProfileResource: CompanyProfileResource) = apply {
            categories = companyProfileResource.categories.map { it.toMutableList() }
            citations = companyProfileResource.citations.map { it.toMutableList() }
            customers = companyProfileResource.customers.map { it.toMutableList() }
            documents = companyProfileResource.documents.map { it.toMutableList() }
            headquarters = companyProfileResource.headquarters
            legalEntities = companyProfileResource.legalEntities.map { it.toMutableList() }
            metricSeries = companyProfileResource.metricSeries.map { it.toMutableList() }
            narrativeSections = companyProfileResource.narrativeSections.map { it.toMutableList() }
            overview = companyProfileResource.overview
            people = companyProfileResource.people.map { it.toMutableList() }
            social = companyProfileResource.social.map { it.toMutableList() }
            tagline = companyProfileResource.tagline
            additionalProperties = companyProfileResource.additionalProperties.toMutableMap()
        }

        /** Company categories. */
        fun categories(categories: List<CompanyCategory>) = categories(JsonField.of(categories))

        /**
         * Sets [Builder.categories] to an arbitrary JSON value.
         *
         * You should usually call [Builder.categories] with a well-typed `List<CompanyCategory>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun categories(categories: JsonField<List<CompanyCategory>>) = apply {
            this.categories = categories.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompanyCategory] to [categories].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCategory(category: CompanyCategory) = apply {
            categories =
                (categories ?: JsonField.of(mutableListOf())).also {
                    checkKnown("categories", it).add(category)
                }
        }

        /** Sources referenced by narrative sections and metrics. */
        fun citations(citations: List<CompanyCitation>) = citations(JsonField.of(citations))

        /**
         * Sets [Builder.citations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.citations] with a well-typed `List<CompanyCitation>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun citations(citations: JsonField<List<CompanyCitation>>) = apply {
            this.citations = citations.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompanyCitation] to [citations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCitation(citation: CompanyCitation) = apply {
            citations =
                (citations ?: JsonField.of(mutableListOf())).also {
                    checkKnown("citations", it).add(citation)
                }
        }

        /** Named customers evidenced by the source material. */
        fun customers(customers: List<CompanyCustomer>) = customers(JsonField.of(customers))

        /**
         * Sets [Builder.customers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customers] with a well-typed `List<CompanyCustomer>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customers(customers: JsonField<List<CompanyCustomer>>) = apply {
            this.customers = customers.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompanyCustomer] to [customers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomer(customer: CompanyCustomer) = apply {
            customers =
                (customers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("customers", it).add(customer)
                }
        }

        /** Company-level research and source documents. */
        fun documents(documents: List<CompanyDocumentResource>) = documents(JsonField.of(documents))

        /**
         * Sets [Builder.documents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documents] with a well-typed
         * `List<CompanyDocumentResource>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun documents(documents: JsonField<List<CompanyDocumentResource>>) = apply {
            this.documents = documents.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompanyDocumentResource] to [documents].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocument(document: CompanyDocumentResource) = apply {
            documents =
                (documents ?: JsonField.of(mutableListOf())).also {
                    checkKnown("documents", it).add(document)
                }
        }

        /** Company headquarters, when known. */
        fun headquarters(headquarters: CompanyHeadquarters?) =
            headquarters(JsonField.ofNullable(headquarters))

        /** Alias for calling [Builder.headquarters] with `headquarters.orElse(null)`. */
        fun headquarters(headquarters: Optional<CompanyHeadquarters>) =
            headquarters(headquarters.getOrNull())

        /**
         * Sets [Builder.headquarters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.headquarters] with a well-typed [CompanyHeadquarters]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun headquarters(headquarters: JsonField<CompanyHeadquarters>) = apply {
            this.headquarters = headquarters
        }

        /** Known legal entities associated with the company. */
        fun legalEntities(legalEntities: List<CompanyLegalEntity>) =
            legalEntities(JsonField.of(legalEntities))

        /**
         * Sets [Builder.legalEntities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalEntities] with a well-typed
         * `List<CompanyLegalEntity>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun legalEntities(legalEntities: JsonField<List<CompanyLegalEntity>>) = apply {
            this.legalEntities = legalEntities.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompanyLegalEntity] to [legalEntities].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLegalEntity(legalEntity: CompanyLegalEntity) = apply {
            legalEntities =
                (legalEntities ?: JsonField.of(mutableListOf())).also {
                    checkKnown("legalEntities", it).add(legalEntity)
                }
        }

        /** Historical and estimated metric series. */
        fun metricSeries(metricSeries: List<CompanyMetricSeries>) =
            metricSeries(JsonField.of(metricSeries))

        /**
         * Sets [Builder.metricSeries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metricSeries] with a well-typed
         * `List<CompanyMetricSeries>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun metricSeries(metricSeries: JsonField<List<CompanyMetricSeries>>) = apply {
            this.metricSeries = metricSeries.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompanyMetricSeries] to [Builder.metricSeries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMetricSeries(metricSeries: CompanyMetricSeries) = apply {
            this.metricSeries =
                (this.metricSeries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("metricSeries", it).add(metricSeries)
                }
        }

        /** Ordered durable company fact and thesis blocks. */
        fun narrativeSections(narrativeSections: List<CompanyNarrativeSection>) =
            narrativeSections(JsonField.of(narrativeSections))

        /**
         * Sets [Builder.narrativeSections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.narrativeSections] with a well-typed
         * `List<CompanyNarrativeSection>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun narrativeSections(narrativeSections: JsonField<List<CompanyNarrativeSection>>) = apply {
            this.narrativeSections = narrativeSections.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompanyNarrativeSection] to [narrativeSections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addNarrativeSection(narrativeSection: CompanyNarrativeSection) = apply {
            narrativeSections =
                (narrativeSections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("narrativeSections", it).add(narrativeSection)
                }
        }

        /** Long company overview. */
        fun overview(overview: String?) = overview(JsonField.ofNullable(overview))

        /** Alias for calling [Builder.overview] with `overview.orElse(null)`. */
        fun overview(overview: Optional<String>) = overview(overview.getOrNull())

        /**
         * Sets [Builder.overview] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overview] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun overview(overview: JsonField<String>) = apply { this.overview = overview }

        /** Key people and their roles. */
        fun people(people: List<CompanyPerson>) = people(JsonField.of(people))

        /**
         * Sets [Builder.people] to an arbitrary JSON value.
         *
         * You should usually call [Builder.people] with a well-typed `List<CompanyPerson>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun people(people: JsonField<List<CompanyPerson>>) = apply {
            this.people = people.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompanyPerson] to [people].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPerson(person: CompanyPerson) = apply {
            people =
                (people ?: JsonField.of(mutableListOf())).also {
                    checkKnown("people", it).add(person)
                }
        }

        /** Social/profile links. */
        fun social(social: List<CompanySocialLink>) = social(JsonField.of(social))

        /**
         * Sets [Builder.social] to an arbitrary JSON value.
         *
         * You should usually call [Builder.social] with a well-typed `List<CompanySocialLink>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun social(social: JsonField<List<CompanySocialLink>>) = apply {
            this.social = social.map { it.toMutableList() }
        }

        /**
         * Adds a single [CompanySocialLink] to [Builder.social].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSocial(social: CompanySocialLink) = apply {
            this.social =
                (this.social ?: JsonField.of(mutableListOf())).also {
                    checkKnown("social", it).add(social)
                }
        }

        /** Short durable positioning line used with the company name. */
        fun tagline(tagline: String?) = tagline(JsonField.ofNullable(tagline))

        /** Alias for calling [Builder.tagline] with `tagline.orElse(null)`. */
        fun tagline(tagline: Optional<String>) = tagline(tagline.getOrNull())

        /**
         * Sets [Builder.tagline] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tagline] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tagline(tagline: JsonField<String>) = apply { this.tagline = tagline }

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
         * Returns an immutable instance of [CompanyProfileResource].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CompanyProfileResource =
            CompanyProfileResource(
                (categories ?: JsonMissing.of()).map { it.toImmutable() },
                (citations ?: JsonMissing.of()).map { it.toImmutable() },
                (customers ?: JsonMissing.of()).map { it.toImmutable() },
                (documents ?: JsonMissing.of()).map { it.toImmutable() },
                headquarters,
                (legalEntities ?: JsonMissing.of()).map { it.toImmutable() },
                (metricSeries ?: JsonMissing.of()).map { it.toImmutable() },
                (narrativeSections ?: JsonMissing.of()).map { it.toImmutable() },
                overview,
                (people ?: JsonMissing.of()).map { it.toImmutable() },
                (social ?: JsonMissing.of()).map { it.toImmutable() },
                tagline,
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
    fun validate(): CompanyProfileResource = apply {
        if (validated) {
            return@apply
        }

        categories().ifPresent { it.forEach { it.validate() } }
        citations().ifPresent { it.forEach { it.validate() } }
        customers().ifPresent { it.forEach { it.validate() } }
        documents().ifPresent { it.forEach { it.validate() } }
        headquarters().ifPresent { it.validate() }
        legalEntities().ifPresent { it.forEach { it.validate() } }
        metricSeries().ifPresent { it.forEach { it.validate() } }
        narrativeSections().ifPresent { it.forEach { it.validate() } }
        overview()
        people().ifPresent { it.forEach { it.validate() } }
        social().ifPresent { it.forEach { it.validate() } }
        tagline()
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
        (categories.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (citations.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (customers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (documents.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (headquarters.asKnown().getOrNull()?.validity() ?: 0) +
            (legalEntities.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (metricSeries.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (narrativeSections.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (overview.asKnown().isPresent) 1 else 0) +
            (people.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (social.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (tagline.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CompanyProfileResource &&
            categories == other.categories &&
            citations == other.citations &&
            customers == other.customers &&
            documents == other.documents &&
            headquarters == other.headquarters &&
            legalEntities == other.legalEntities &&
            metricSeries == other.metricSeries &&
            narrativeSections == other.narrativeSections &&
            overview == other.overview &&
            people == other.people &&
            social == other.social &&
            tagline == other.tagline &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            categories,
            citations,
            customers,
            documents,
            headquarters,
            legalEntities,
            metricSeries,
            narrativeSections,
            overview,
            people,
            social,
            tagline,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CompanyProfileResource{categories=$categories, citations=$citations, customers=$customers, documents=$documents, headquarters=$headquarters, legalEntities=$legalEntities, metricSeries=$metricSeries, narrativeSections=$narrativeSections, overview=$overview, people=$people, social=$social, tagline=$tagline, additionalProperties=$additionalProperties}"
}
