// File generated from our OpenAPI spec by Stainless.

package com.clearstreet.api.models.v1.privatemarkets

import com.clearstreet.api.core.JsonValue
import com.clearstreet.api.core.jsonMapper
import com.clearstreet.api.models.ApiError
import com.clearstreet.api.models.ResponseMetadata
import com.clearstreet.api.models.v1.privatemarkets.offerings.Currency
import com.clearstreet.api.models.v1.privatemarkets.offerings.SpvStatus
import com.clearstreet.api.models.v1.privatemarkets.offerings.ValuationBasis
import com.clearstreet.api.models.v1.privatemarkets.spvs.ChargedBy
import com.clearstreet.api.models.v1.privatemarkets.spvs.FeeFrequency
import com.clearstreet.api.models.v1.privatemarkets.spvs.FeeType
import com.clearstreet.api.models.v1.privatemarkets.spvs.SpvDetail
import com.clearstreet.api.models.v1.privatemarkets.spvs.SpvFeeTermResource
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateMarketGetSpvByIdResponseTest {

    @Test
    fun create() {
        val privateMarketGetSpvByIdResponse =
            PrivateMarketGetSpvByIdResponse.builder()
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
                    SpvDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currency(Currency.USD)
                        .name("name")
                        .status(SpvStatus.DRAFT)
                        .allInPricePerShare("102.5")
                        .custodianName("custodian_name")
                        .feePerShare("2.5")
                        .addFeeTerm(
                            SpvFeeTermResource.builder()
                                .chargedBy(ChargedBy.FUND_MANAGER)
                                .currency(Currency.USD)
                                .description("description")
                                .feeType(FeeType.MANAGEMENT)
                                .frequency(FeeFrequency.ONE_TIME)
                                .amount("25000")
                                .durationYears("10")
                                .hurdleRate("0.08")
                                .rate("0.02")
                                .build()
                        )
                        .fundedPercent("70")
                        .fundingDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .managerName("manager_name")
                        .minimumInvestmentAmount("25000")
                        .openedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .pricePerShare("100")
                        .remainingAllocationAmount("1500000")
                        .remainingShareAllocation("15000")
                        .shareClass("share_class")
                        .structureDescription("structure_description")
                        .totalAllocationAmount("5000000")
                        .totalShareAllocation("50000")
                        .valuation("5000000000")
                        .valuationBasis(ValuationBasis.PRE_MONEY)
                        .build()
                )
                .build()

        assertThat(privateMarketGetSpvByIdResponse.metadata())
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
        assertThat(privateMarketGetSpvByIdResponse.error())
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
        assertThat(privateMarketGetSpvByIdResponse.data())
            .isEqualTo(
                SpvDetail.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .currency(Currency.USD)
                    .name("name")
                    .status(SpvStatus.DRAFT)
                    .allInPricePerShare("102.5")
                    .custodianName("custodian_name")
                    .feePerShare("2.5")
                    .addFeeTerm(
                        SpvFeeTermResource.builder()
                            .chargedBy(ChargedBy.FUND_MANAGER)
                            .currency(Currency.USD)
                            .description("description")
                            .feeType(FeeType.MANAGEMENT)
                            .frequency(FeeFrequency.ONE_TIME)
                            .amount("25000")
                            .durationYears("10")
                            .hurdleRate("0.08")
                            .rate("0.02")
                            .build()
                    )
                    .fundedPercent("70")
                    .fundingDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .managerName("manager_name")
                    .minimumInvestmentAmount("25000")
                    .openedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .pricePerShare("100")
                    .remainingAllocationAmount("1500000")
                    .remainingShareAllocation("15000")
                    .shareClass("share_class")
                    .structureDescription("structure_description")
                    .totalAllocationAmount("5000000")
                    .totalShareAllocation("50000")
                    .valuation("5000000000")
                    .valuationBasis(ValuationBasis.PRE_MONEY)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val privateMarketGetSpvByIdResponse =
            PrivateMarketGetSpvByIdResponse.builder()
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
                    SpvDetail.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .companyId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .currency(Currency.USD)
                        .name("name")
                        .status(SpvStatus.DRAFT)
                        .allInPricePerShare("102.5")
                        .custodianName("custodian_name")
                        .feePerShare("2.5")
                        .addFeeTerm(
                            SpvFeeTermResource.builder()
                                .chargedBy(ChargedBy.FUND_MANAGER)
                                .currency(Currency.USD)
                                .description("description")
                                .feeType(FeeType.MANAGEMENT)
                                .frequency(FeeFrequency.ONE_TIME)
                                .amount("25000")
                                .durationYears("10")
                                .hurdleRate("0.08")
                                .rate("0.02")
                                .build()
                        )
                        .fundedPercent("70")
                        .fundingDeadline(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .managerName("manager_name")
                        .minimumInvestmentAmount("25000")
                        .openedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .pricePerShare("100")
                        .remainingAllocationAmount("1500000")
                        .remainingShareAllocation("15000")
                        .shareClass("share_class")
                        .structureDescription("structure_description")
                        .totalAllocationAmount("5000000")
                        .totalShareAllocation("50000")
                        .valuation("5000000000")
                        .valuationBasis(ValuationBasis.PRE_MONEY)
                        .build()
                )
                .build()

        val roundtrippedPrivateMarketGetSpvByIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(privateMarketGetSpvByIdResponse),
                jacksonTypeRef<PrivateMarketGetSpvByIdResponse>(),
            )

        assertThat(roundtrippedPrivateMarketGetSpvByIdResponse)
            .isEqualTo(privateMarketGetSpvByIdResponse)
    }
}
