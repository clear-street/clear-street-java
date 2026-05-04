// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments.incomestatements

import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.instruments.FiscalPeriodType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstrumentIncomeStatementTest {

    @Test
    fun create() {
        val instrumentIncomeStatement =
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

        assertThat(instrumentIncomeStatement.acceptedDate())
            .isEqualTo(OffsetDateTime.parse("2025-05-02T14:30:00Z"))
        assertThat(instrumentIncomeStatement.filingDate()).isEqualTo(LocalDate.parse("2025-05-01"))
        assertThat(instrumentIncomeStatement.period()).isEqualTo("Q1")
        assertThat(instrumentIncomeStatement.periodType()).isEqualTo(FiscalPeriodType.QUARTERLY)
        assertThat(instrumentIncomeStatement.reportedCurrency()).isEqualTo("USD")
        assertThat(instrumentIncomeStatement.year()).isEqualTo(2025)
        assertThat(instrumentIncomeStatement.bottomLineNetIncome()).contains("22200000000")
        assertThat(instrumentIncomeStatement.costAndExpenses()).contains("68380000000")
        assertThat(instrumentIncomeStatement.costOfRevenue()).contains("52080000000")
        assertThat(instrumentIncomeStatement.depreciationAndAmortization()).contains("2800000000")
        assertThat(instrumentIncomeStatement.ebit()).contains("26550000000")
        assertThat(instrumentIncomeStatement.ebitda()).contains("29350000000")
        assertThat(instrumentIncomeStatement.eps()).contains("1.40")
        assertThat(instrumentIncomeStatement.epsDiluted()).contains("1.38")
        assertThat(instrumentIncomeStatement.generalAndAdministrativeExpenses())
            .contains("2500000000")
        assertThat(instrumentIncomeStatement.grossProfit()).contains("42850000000")
        assertThat(instrumentIncomeStatement.incomeBeforeTax()).contains("26400000000")
        assertThat(instrumentIncomeStatement.incomeTaxExpense()).contains("4200000000")
        assertThat(instrumentIncomeStatement.interestExpense()).contains("1450000000")
        assertThat(instrumentIncomeStatement.interestIncome()).contains("1200000000")
        assertThat(instrumentIncomeStatement.netIncome()).contains("22200000000")
        assertThat(instrumentIncomeStatement.netIncomeDeductions()).isEmpty
        assertThat(instrumentIncomeStatement.netIncomeFromContinuingOperations())
            .contains("22200000000")
        assertThat(instrumentIncomeStatement.netIncomeFromDiscontinuedOperations()).isEmpty
        assertThat(instrumentIncomeStatement.netInterestIncome()).contains("-250000000")
        assertThat(instrumentIncomeStatement.nonOperatingIncomeExcludingInterest())
            .contains("100000000")
        assertThat(instrumentIncomeStatement.operatingExpenses()).contains("16300000000")
        assertThat(instrumentIncomeStatement.operatingIncome()).contains("26550000000")
        assertThat(instrumentIncomeStatement.otherAdjustmentsToNetIncome()).isEmpty
        assertThat(instrumentIncomeStatement.otherExpenses()).contains("0")
        assertThat(instrumentIncomeStatement.researchAndDevelopmentExpenses())
            .contains("7700000000")
        assertThat(instrumentIncomeStatement.revenue()).contains("94930000000")
        assertThat(instrumentIncomeStatement.sellingAndMarketingExpenses()).contains("6100000000")
        assertThat(instrumentIncomeStatement.sellingGeneralAndAdministrativeExpenses())
            .contains("8600000000")
        assertThat(instrumentIncomeStatement.totalOtherIncomeExpensesNet()).contains("-150000000")
        assertThat(instrumentIncomeStatement.weightedAverageShsOut()).contains("15800000000")
        assertThat(instrumentIncomeStatement.weightedAverageShsOutDil()).contains("16000000000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val instrumentIncomeStatement =
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

        val roundtrippedInstrumentIncomeStatement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(instrumentIncomeStatement),
                jacksonTypeRef<InstrumentIncomeStatement>(),
            )

        assertThat(roundtrippedInstrumentIncomeStatement).isEqualTo(instrumentIncomeStatement)
    }
}
