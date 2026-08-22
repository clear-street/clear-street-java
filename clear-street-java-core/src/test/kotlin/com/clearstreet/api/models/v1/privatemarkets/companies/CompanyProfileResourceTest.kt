// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets.companies

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.v1.privatemarkets.offerings.MetricUnit
import com.clearstreet.api.models.v1.privatemarkets.offerings.MetricValueType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CompanyProfileResourceTest {

    @Test
    fun create() {
        val companyProfileResource =
            CompanyProfileResource.builder()
                .addCategory(CompanyCategory.builder().name("name").slug("slug").build())
                .addCitation(
                    CompanyCitation.builder()
                        .id("id")
                        .source("source")
                        .title("title")
                        .url("url")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .addCustomer(CompanyCustomer.builder().name("name").logoUrl("logo_url").build())
                .addDocument(
                    CompanyDocumentResource.builder()
                        .documentType(CompanyDocumentType.COMPANY_PROFILE)
                        .relation(CompanyDocumentRelation.SUBJECT)
                        .title("title")
                        .url("url")
                        .externalId("external_id")
                        .preview(
                            CompanyDocumentPreview.builder()
                                .description("description")
                                .imageUrl("image_url")
                                .build()
                        )
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .headquarters(CompanyHeadquarters.builder().city("city").country("country").build())
                .addLegalEntity(
                    CompanyLegalEntity.builder().country("country").name("name").build()
                )
                .addMetricSeries(
                    CompanyMetricSeries.builder()
                        .frequency(MetricFrequency.YEAR)
                        .label("label")
                        .metricKey(MetricKey.ANNUALIZED_REVENUE)
                        .source("source")
                        .unit(MetricUnit.USD)
                        .externalId("external_id")
                        .addPoint(
                            CompanyMetricPoint.builder()
                                .observedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .value("0.42")
                                .valueType(MetricValueType.HISTORICAL)
                                .addCitationId("string")
                                .sourceEventId("source_event_id")
                                .sourceMetadata(
                                    CompanyMetricPoint.SourceMetadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .sourceUrl("source_url")
                        .build()
                )
                .addNarrativeSection(
                    CompanyNarrativeSection.builder()
                        .body("body")
                        .displayOrder(0)
                        .title("title")
                        .addCitationId("string")
                        .build()
                )
                .overview("overview")
                .addPerson(
                    CompanyPerson.builder()
                        .name("name")
                        .externalId("external_id")
                        .addRole(CompanyPersonRole.FOUNDER)
                        .build()
                )
                .addSocial(
                    CompanySocialLink.builder().type(CompanySocialType.WEBSITE).url("url").build()
                )
                .tagline("tagline")
                .build()

        assertThat(companyProfileResource.categories().getOrNull())
            .containsExactly(CompanyCategory.builder().name("name").slug("slug").build())
        assertThat(companyProfileResource.citations().getOrNull())
            .containsExactly(
                CompanyCitation.builder()
                    .id("id")
                    .source("source")
                    .title("title")
                    .url("url")
                    .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(companyProfileResource.customers().getOrNull())
            .containsExactly(CompanyCustomer.builder().name("name").logoUrl("logo_url").build())
        assertThat(companyProfileResource.documents().getOrNull())
            .containsExactly(
                CompanyDocumentResource.builder()
                    .documentType(CompanyDocumentType.COMPANY_PROFILE)
                    .relation(CompanyDocumentRelation.SUBJECT)
                    .title("title")
                    .url("url")
                    .externalId("external_id")
                    .preview(
                        CompanyDocumentPreview.builder()
                            .description("description")
                            .imageUrl("image_url")
                            .build()
                    )
                    .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(companyProfileResource.headquarters())
            .contains(CompanyHeadquarters.builder().city("city").country("country").build())
        assertThat(companyProfileResource.legalEntities().getOrNull())
            .containsExactly(CompanyLegalEntity.builder().country("country").name("name").build())
        assertThat(companyProfileResource.metricSeries().getOrNull())
            .containsExactly(
                CompanyMetricSeries.builder()
                    .frequency(MetricFrequency.YEAR)
                    .label("label")
                    .metricKey(MetricKey.ANNUALIZED_REVENUE)
                    .source("source")
                    .unit(MetricUnit.USD)
                    .externalId("external_id")
                    .addPoint(
                        CompanyMetricPoint.builder()
                            .observedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .value("0.42")
                            .valueType(MetricValueType.HISTORICAL)
                            .addCitationId("string")
                            .sourceEventId("source_event_id")
                            .sourceMetadata(
                                CompanyMetricPoint.SourceMetadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .build()
                    )
                    .sourceUrl("source_url")
                    .build()
            )
        assertThat(companyProfileResource.narrativeSections().getOrNull())
            .containsExactly(
                CompanyNarrativeSection.builder()
                    .body("body")
                    .displayOrder(0)
                    .title("title")
                    .addCitationId("string")
                    .build()
            )
        assertThat(companyProfileResource.overview()).contains("overview")
        assertThat(companyProfileResource.people().getOrNull())
            .containsExactly(
                CompanyPerson.builder()
                    .name("name")
                    .externalId("external_id")
                    .addRole(CompanyPersonRole.FOUNDER)
                    .build()
            )
        assertThat(companyProfileResource.social().getOrNull())
            .containsExactly(
                CompanySocialLink.builder().type(CompanySocialType.WEBSITE).url("url").build()
            )
        assertThat(companyProfileResource.tagline()).contains("tagline")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val companyProfileResource =
            CompanyProfileResource.builder()
                .addCategory(CompanyCategory.builder().name("name").slug("slug").build())
                .addCitation(
                    CompanyCitation.builder()
                        .id("id")
                        .source("source")
                        .title("title")
                        .url("url")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .addCustomer(CompanyCustomer.builder().name("name").logoUrl("logo_url").build())
                .addDocument(
                    CompanyDocumentResource.builder()
                        .documentType(CompanyDocumentType.COMPANY_PROFILE)
                        .relation(CompanyDocumentRelation.SUBJECT)
                        .title("title")
                        .url("url")
                        .externalId("external_id")
                        .preview(
                            CompanyDocumentPreview.builder()
                                .description("description")
                                .imageUrl("image_url")
                                .build()
                        )
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .headquarters(CompanyHeadquarters.builder().city("city").country("country").build())
                .addLegalEntity(
                    CompanyLegalEntity.builder().country("country").name("name").build()
                )
                .addMetricSeries(
                    CompanyMetricSeries.builder()
                        .frequency(MetricFrequency.YEAR)
                        .label("label")
                        .metricKey(MetricKey.ANNUALIZED_REVENUE)
                        .source("source")
                        .unit(MetricUnit.USD)
                        .externalId("external_id")
                        .addPoint(
                            CompanyMetricPoint.builder()
                                .observedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .value("0.42")
                                .valueType(MetricValueType.HISTORICAL)
                                .addCitationId("string")
                                .sourceEventId("source_event_id")
                                .sourceMetadata(
                                    CompanyMetricPoint.SourceMetadata.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("string"))
                                        .build()
                                )
                                .build()
                        )
                        .sourceUrl("source_url")
                        .build()
                )
                .addNarrativeSection(
                    CompanyNarrativeSection.builder()
                        .body("body")
                        .displayOrder(0)
                        .title("title")
                        .addCitationId("string")
                        .build()
                )
                .overview("overview")
                .addPerson(
                    CompanyPerson.builder()
                        .name("name")
                        .externalId("external_id")
                        .addRole(CompanyPersonRole.FOUNDER)
                        .build()
                )
                .addSocial(
                    CompanySocialLink.builder().type(CompanySocialType.WEBSITE).url("url").build()
                )
                .tagline("tagline")
                .build()

        val roundtrippedCompanyProfileResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(companyProfileResource),
                jacksonTypeRef<CompanyProfileResource>(),
            )

        assertThat(roundtrippedCompanyProfileResource).isEqualTo(companyProfileResource)
    }
}
