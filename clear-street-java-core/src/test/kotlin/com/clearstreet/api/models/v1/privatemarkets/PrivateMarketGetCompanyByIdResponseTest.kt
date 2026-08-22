// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyCategory
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyCitation
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyCustomer
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyDetail
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyDocumentPreview
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyDocumentRelation
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyDocumentResource
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyDocumentType
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyHeadquarters
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyLegalEntity
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyMetricPoint
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyMetricSeries
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyNarrativeSection
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyPerson
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyPersonRole
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanyProfileResource
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanySocialLink
import com.clearstreet.api.models.v1.privatemarkets.companies.CompanySocialType
import com.clearstreet.api.models.v1.privatemarkets.companies.MetricFrequency
import com.clearstreet.api.models.v1.privatemarkets.companies.MetricKey
import com.clearstreet.api.models.v1.privatemarkets.offerings.MetricUnit
import com.clearstreet.api.models.v1.privatemarkets.offerings.MetricValueType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateMarketGetCompanyByIdResponseTest {

    @Test
    fun create() {
        val privateMarketGetCompanyByIdResponse =
            PrivateMarketGetCompanyByIdResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
                    CompanyDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .profile(
                            CompanyProfileResource.builder()
                                .addCategory(
                                    CompanyCategory.builder().name("name").slug("slug").build()
                                )
                                .addCitation(
                                    CompanyCitation.builder()
                                        .id("id")
                                        .source("source")
                                        .title("title")
                                        .url("url")
                                        .publishedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .build()
                                )
                                .addCustomer(
                                    CompanyCustomer.builder()
                                        .name("name")
                                        .logoUrl("logo_url")
                                        .build()
                                )
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
                                        .publishedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .build()
                                )
                                .headquarters(
                                    CompanyHeadquarters.builder()
                                        .city("city")
                                        .country("country")
                                        .build()
                                )
                                .addLegalEntity(
                                    CompanyLegalEntity.builder()
                                        .country("country")
                                        .name("name")
                                        .build()
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
                                                .observedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .value("0.42")
                                                .valueType(MetricValueType.HISTORICAL)
                                                .addCitationId("string")
                                                .sourceEventId("source_event_id")
                                                .sourceMetadata(
                                                    CompanyMetricPoint.SourceMetadata.builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("string"),
                                                        )
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
                                    CompanySocialLink.builder()
                                        .type(CompanySocialType.WEBSITE)
                                        .url("url")
                                        .build()
                                )
                                .tagline("tagline")
                                .build()
                        )
                        .profileSchemaVersion(0)
                        .shortDescription("short_description")
                        .slug("slug")
                        .logoUrl("logo_url")
                        .primaryDomain("primary_domain")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(privateMarketGetCompanyByIdResponse.metadata())
            .isEqualTo(
                ResponseMetadata.builder()
                    .requestId("request_id")
                    .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .pageNumber(0)
                    .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                    .totalItems(0L)
                    .totalPages(0)
                    .build()
            )
        assertThat(privateMarketGetCompanyByIdResponse.error())
            .contains(
                ApiError.builder()
                    .code(400)
                    .message("Order quantity must be greater than zero")
                    .addDetail(
                        ApiError.Detail.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(privateMarketGetCompanyByIdResponse.data())
            .isEqualTo(
                CompanyDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .profile(
                        CompanyProfileResource.builder()
                            .addCategory(
                                CompanyCategory.builder().name("name").slug("slug").build()
                            )
                            .addCitation(
                                CompanyCitation.builder()
                                    .id("id")
                                    .source("source")
                                    .title("title")
                                    .url("url")
                                    .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .build()
                            )
                            .addCustomer(
                                CompanyCustomer.builder().name("name").logoUrl("logo_url").build()
                            )
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
                            .headquarters(
                                CompanyHeadquarters.builder()
                                    .city("city")
                                    .country("country")
                                    .build()
                            )
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
                                            .observedAt(
                                                OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                            )
                                            .value("0.42")
                                            .valueType(MetricValueType.HISTORICAL)
                                            .addCitationId("string")
                                            .sourceEventId("source_event_id")
                                            .sourceMetadata(
                                                CompanyMetricPoint.SourceMetadata.builder()
                                                    .putAdditionalProperty(
                                                        "foo",
                                                        JsonValue.from("string"),
                                                    )
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
                                CompanySocialLink.builder()
                                    .type(CompanySocialType.WEBSITE)
                                    .url("url")
                                    .build()
                            )
                            .tagline("tagline")
                            .build()
                    )
                    .profileSchemaVersion(0)
                    .shortDescription("short_description")
                    .slug("slug")
                    .logoUrl("logo_url")
                    .primaryDomain("primary_domain")
                    .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val privateMarketGetCompanyByIdResponse =
            PrivateMarketGetCompanyByIdResponse.builder()
                .metadata(
                    ResponseMetadata.builder()
                        .requestId("request_id")
                        .nextPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .pageNumber(0)
                        .previousPageToken("U3RhaW5sZXNzIHJvY2tz")
                        .totalItems(0L)
                        .totalPages(0)
                        .build()
                )
                .error(
                    ApiError.builder()
                        .code(400)
                        .message("Order quantity must be greater than zero")
                        .addDetail(
                            ApiError.Detail.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .data(
                    CompanyDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .profile(
                            CompanyProfileResource.builder()
                                .addCategory(
                                    CompanyCategory.builder().name("name").slug("slug").build()
                                )
                                .addCitation(
                                    CompanyCitation.builder()
                                        .id("id")
                                        .source("source")
                                        .title("title")
                                        .url("url")
                                        .publishedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .build()
                                )
                                .addCustomer(
                                    CompanyCustomer.builder()
                                        .name("name")
                                        .logoUrl("logo_url")
                                        .build()
                                )
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
                                        .publishedAt(
                                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                        )
                                        .build()
                                )
                                .headquarters(
                                    CompanyHeadquarters.builder()
                                        .city("city")
                                        .country("country")
                                        .build()
                                )
                                .addLegalEntity(
                                    CompanyLegalEntity.builder()
                                        .country("country")
                                        .name("name")
                                        .build()
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
                                                .observedAt(
                                                    OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                                                )
                                                .value("0.42")
                                                .valueType(MetricValueType.HISTORICAL)
                                                .addCitationId("string")
                                                .sourceEventId("source_event_id")
                                                .sourceMetadata(
                                                    CompanyMetricPoint.SourceMetadata.builder()
                                                        .putAdditionalProperty(
                                                            "foo",
                                                            JsonValue.from("string"),
                                                        )
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
                                    CompanySocialLink.builder()
                                        .type(CompanySocialType.WEBSITE)
                                        .url("url")
                                        .build()
                                )
                                .tagline("tagline")
                                .build()
                        )
                        .profileSchemaVersion(0)
                        .shortDescription("short_description")
                        .slug("slug")
                        .logoUrl("logo_url")
                        .primaryDomain("primary_domain")
                        .publishedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedPrivateMarketGetCompanyByIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(privateMarketGetCompanyByIdResponse),
                jacksonTypeRef<PrivateMarketGetCompanyByIdResponse>(),
            )

        assertThat(roundtrippedPrivateMarketGetCompanyByIdResponse)
            .isEqualTo(privateMarketGetCompanyByIdResponse)
    }
}
