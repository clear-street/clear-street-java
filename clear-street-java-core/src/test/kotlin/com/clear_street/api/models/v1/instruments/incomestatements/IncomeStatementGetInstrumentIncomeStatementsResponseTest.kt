// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.incomestatements

import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.ApiError
import com.clear_street.api.models.ResponseMetadata
import com.clear_street.api.models.v1.instruments.FiscalPeriodType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IncomeStatementGetInstrumentIncomeStatementsResponseTest {

    @Test
    fun create() {
        val incomeStatementGetInstrumentIncomeStatementsResponse =
            IncomeStatementGetInstrumentIncomeStatementsResponse.builder()
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
                .addData(
                    InstrumentIncomeStatement.builder()
                        .acceptedDate(OffsetDateTime.parse("2025-05-02T14:30:00Z"))
                        .filingDate(LocalDate.parse("2025-05-01"))
                        .period("Q1")
                        .periodType(FiscalPeriodType.QUARTERLY)
                        .reportedCurrency("USD")
                        .year(2025)
                        .bottomLineNetIncome("22200000000")
                        .costAndExpenses("68380000000")
                        .costOfRevenue("52080000000")
                        .depreciationAndAmortization("2800000000")
                        .ebit("26550000000")
                        .ebitda("29350000000")
                        .eps("1.40")
                        .epsDiluted("1.38")
                        .generalAndAdministrativeExpenses("2500000000")
                        .grossProfit("42850000000")
                        .incomeBeforeTax("26400000000")
                        .incomeTaxExpense("4200000000")
                        .interestExpense("1450000000")
                        .interestIncome("1200000000")
                        .netIncome("22200000000")
                        .netIncomeDeductions(null)
                        .netIncomeFromContinuingOperations("22200000000")
                        .netIncomeFromDiscontinuedOperations(null)
                        .netInterestIncome("-250000000")
                        .nonOperatingIncomeExcludingInterest("100000000")
                        .operatingExpenses("16300000000")
                        .operatingIncome("26550000000")
                        .otherAdjustmentsToNetIncome(null)
                        .otherExpenses("0")
                        .researchAndDevelopmentExpenses("7700000000")
                        .revenue("94930000000")
                        .sellingAndMarketingExpenses("6100000000")
                        .sellingGeneralAndAdministrativeExpenses("8600000000")
                        .totalOtherIncomeExpensesNet("-150000000")
                        .weightedAverageShsOut("15800000000")
                        .weightedAverageShsOutDil("16000000000")
                        .build()
                )
                .build()

        assertThat(incomeStatementGetInstrumentIncomeStatementsResponse.metadata())
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
        assertThat(incomeStatementGetInstrumentIncomeStatementsResponse.error())
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
        assertThat(incomeStatementGetInstrumentIncomeStatementsResponse.data())
            .containsExactly(
                InstrumentIncomeStatement.builder()
                    .acceptedDate(OffsetDateTime.parse("2025-05-02T14:30:00Z"))
                    .filingDate(LocalDate.parse("2025-05-01"))
                    .period("Q1")
                    .periodType(FiscalPeriodType.QUARTERLY)
                    .reportedCurrency("USD")
                    .year(2025)
                    .bottomLineNetIncome("22200000000")
                    .costAndExpenses("68380000000")
                    .costOfRevenue("52080000000")
                    .depreciationAndAmortization("2800000000")
                    .ebit("26550000000")
                    .ebitda("29350000000")
                    .eps("1.40")
                    .epsDiluted("1.38")
                    .generalAndAdministrativeExpenses("2500000000")
                    .grossProfit("42850000000")
                    .incomeBeforeTax("26400000000")
                    .incomeTaxExpense("4200000000")
                    .interestExpense("1450000000")
                    .interestIncome("1200000000")
                    .netIncome("22200000000")
                    .netIncomeDeductions(null)
                    .netIncomeFromContinuingOperations("22200000000")
                    .netIncomeFromDiscontinuedOperations(null)
                    .netInterestIncome("-250000000")
                    .nonOperatingIncomeExcludingInterest("100000000")
                    .operatingExpenses("16300000000")
                    .operatingIncome("26550000000")
                    .otherAdjustmentsToNetIncome(null)
                    .otherExpenses("0")
                    .researchAndDevelopmentExpenses("7700000000")
                    .revenue("94930000000")
                    .sellingAndMarketingExpenses("6100000000")
                    .sellingGeneralAndAdministrativeExpenses("8600000000")
                    .totalOtherIncomeExpensesNet("-150000000")
                    .weightedAverageShsOut("15800000000")
                    .weightedAverageShsOutDil("16000000000")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val incomeStatementGetInstrumentIncomeStatementsResponse =
            IncomeStatementGetInstrumentIncomeStatementsResponse.builder()
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
                .addData(
                    InstrumentIncomeStatement.builder()
                        .acceptedDate(OffsetDateTime.parse("2025-05-02T14:30:00Z"))
                        .filingDate(LocalDate.parse("2025-05-01"))
                        .period("Q1")
                        .periodType(FiscalPeriodType.QUARTERLY)
                        .reportedCurrency("USD")
                        .year(2025)
                        .bottomLineNetIncome("22200000000")
                        .costAndExpenses("68380000000")
                        .costOfRevenue("52080000000")
                        .depreciationAndAmortization("2800000000")
                        .ebit("26550000000")
                        .ebitda("29350000000")
                        .eps("1.40")
                        .epsDiluted("1.38")
                        .generalAndAdministrativeExpenses("2500000000")
                        .grossProfit("42850000000")
                        .incomeBeforeTax("26400000000")
                        .incomeTaxExpense("4200000000")
                        .interestExpense("1450000000")
                        .interestIncome("1200000000")
                        .netIncome("22200000000")
                        .netIncomeDeductions(null)
                        .netIncomeFromContinuingOperations("22200000000")
                        .netIncomeFromDiscontinuedOperations(null)
                        .netInterestIncome("-250000000")
                        .nonOperatingIncomeExcludingInterest("100000000")
                        .operatingExpenses("16300000000")
                        .operatingIncome("26550000000")
                        .otherAdjustmentsToNetIncome(null)
                        .otherExpenses("0")
                        .researchAndDevelopmentExpenses("7700000000")
                        .revenue("94930000000")
                        .sellingAndMarketingExpenses("6100000000")
                        .sellingGeneralAndAdministrativeExpenses("8600000000")
                        .totalOtherIncomeExpensesNet("-150000000")
                        .weightedAverageShsOut("15800000000")
                        .weightedAverageShsOutDil("16000000000")
                        .build()
                )
                .build()

        val roundtrippedIncomeStatementGetInstrumentIncomeStatementsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(incomeStatementGetInstrumentIncomeStatementsResponse),
                jacksonTypeRef<IncomeStatementGetInstrumentIncomeStatementsResponse>(),
            )

        assertThat(roundtrippedIncomeStatementGetInstrumentIncomeStatementsResponse)
            .isEqualTo(incomeStatementGetInstrumentIncomeStatementsResponse)
    }
}
