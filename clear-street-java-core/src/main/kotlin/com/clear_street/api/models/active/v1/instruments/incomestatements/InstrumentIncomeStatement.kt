// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.active.v1.instruments.incomestatements

import com.clear_street.api.core.ExcludeMissing
import com.clear_street.api.core.JsonField
import com.clear_street.api.core.JsonMissing
import com.clear_street.api.core.JsonValue
import com.clear_street.api.core.checkRequired
import com.clear_street.api.errors.ClearStreetInvalidDataException
import com.clear_street.api.models.active.v1.instruments.FiscalPeriodType
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A quarterly income statement for an instrument. */
class InstrumentIncomeStatement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptedDate: JsonField<OffsetDateTime>,
    private val filingDate: JsonField<LocalDate>,
    private val period: JsonField<String>,
    private val periodType: JsonField<FiscalPeriodType>,
    private val reportedCurrency: JsonField<String>,
    private val year: JsonField<Int>,
    private val bottomLineNetIncome: JsonField<String>,
    private val costAndExpenses: JsonField<String>,
    private val costOfRevenue: JsonField<String>,
    private val depreciationAndAmortization: JsonField<String>,
    private val ebit: JsonField<String>,
    private val ebitda: JsonField<String>,
    private val eps: JsonField<String>,
    private val epsDiluted: JsonField<String>,
    private val generalAndAdministrativeExpenses: JsonField<String>,
    private val grossProfit: JsonField<String>,
    private val incomeBeforeTax: JsonField<String>,
    private val incomeTaxExpense: JsonField<String>,
    private val interestExpense: JsonField<String>,
    private val interestIncome: JsonField<String>,
    private val netIncome: JsonField<String>,
    private val netIncomeDeductions: JsonField<String>,
    private val netIncomeFromContinuingOperations: JsonField<String>,
    private val netIncomeFromDiscontinuedOperations: JsonField<String>,
    private val netInterestIncome: JsonField<String>,
    private val nonOperatingIncomeExcludingInterest: JsonField<String>,
    private val operatingExpenses: JsonField<String>,
    private val operatingIncome: JsonField<String>,
    private val otherAdjustmentsToNetIncome: JsonField<String>,
    private val otherExpenses: JsonField<String>,
    private val researchAndDevelopmentExpenses: JsonField<String>,
    private val revenue: JsonField<String>,
    private val sellingAndMarketingExpenses: JsonField<String>,
    private val sellingGeneralAndAdministrativeExpenses: JsonField<String>,
    private val totalOtherIncomeExpensesNet: JsonField<String>,
    private val weightedAverageShsOut: JsonField<String>,
    private val weightedAverageShsOutDil: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accepted_date")
        @ExcludeMissing
        acceptedDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("filing_date")
        @ExcludeMissing
        filingDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("period") @ExcludeMissing period: JsonField<String> = JsonMissing.of(),
        @JsonProperty("period_type")
        @ExcludeMissing
        periodType: JsonField<FiscalPeriodType> = JsonMissing.of(),
        @JsonProperty("reported_currency")
        @ExcludeMissing
        reportedCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("year") @ExcludeMissing year: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("bottom_line_net_income")
        @ExcludeMissing
        bottomLineNetIncome: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cost_and_expenses")
        @ExcludeMissing
        costAndExpenses: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cost_of_revenue")
        @ExcludeMissing
        costOfRevenue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("depreciation_and_amortization")
        @ExcludeMissing
        depreciationAndAmortization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ebit") @ExcludeMissing ebit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ebitda") @ExcludeMissing ebitda: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eps") @ExcludeMissing eps: JsonField<String> = JsonMissing.of(),
        @JsonProperty("eps_diluted")
        @ExcludeMissing
        epsDiluted: JsonField<String> = JsonMissing.of(),
        @JsonProperty("general_and_administrative_expenses")
        @ExcludeMissing
        generalAndAdministrativeExpenses: JsonField<String> = JsonMissing.of(),
        @JsonProperty("gross_profit")
        @ExcludeMissing
        grossProfit: JsonField<String> = JsonMissing.of(),
        @JsonProperty("income_before_tax")
        @ExcludeMissing
        incomeBeforeTax: JsonField<String> = JsonMissing.of(),
        @JsonProperty("income_tax_expense")
        @ExcludeMissing
        incomeTaxExpense: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interest_expense")
        @ExcludeMissing
        interestExpense: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interest_income")
        @ExcludeMissing
        interestIncome: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_income") @ExcludeMissing netIncome: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_income_deductions")
        @ExcludeMissing
        netIncomeDeductions: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_income_from_continuing_operations")
        @ExcludeMissing
        netIncomeFromContinuingOperations: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_income_from_discontinued_operations")
        @ExcludeMissing
        netIncomeFromDiscontinuedOperations: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_interest_income")
        @ExcludeMissing
        netInterestIncome: JsonField<String> = JsonMissing.of(),
        @JsonProperty("non_operating_income_excluding_interest")
        @ExcludeMissing
        nonOperatingIncomeExcludingInterest: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operating_expenses")
        @ExcludeMissing
        operatingExpenses: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operating_income")
        @ExcludeMissing
        operatingIncome: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_adjustments_to_net_income")
        @ExcludeMissing
        otherAdjustmentsToNetIncome: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_expenses")
        @ExcludeMissing
        otherExpenses: JsonField<String> = JsonMissing.of(),
        @JsonProperty("research_and_development_expenses")
        @ExcludeMissing
        researchAndDevelopmentExpenses: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revenue") @ExcludeMissing revenue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("selling_and_marketing_expenses")
        @ExcludeMissing
        sellingAndMarketingExpenses: JsonField<String> = JsonMissing.of(),
        @JsonProperty("selling_general_and_administrative_expenses")
        @ExcludeMissing
        sellingGeneralAndAdministrativeExpenses: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_other_income_expenses_net")
        @ExcludeMissing
        totalOtherIncomeExpensesNet: JsonField<String> = JsonMissing.of(),
        @JsonProperty("weighted_average_shs_out")
        @ExcludeMissing
        weightedAverageShsOut: JsonField<String> = JsonMissing.of(),
        @JsonProperty("weighted_average_shs_out_dil")
        @ExcludeMissing
        weightedAverageShsOutDil: JsonField<String> = JsonMissing.of(),
    ) : this(
        acceptedDate,
        filingDate,
        period,
        periodType,
        reportedCurrency,
        year,
        bottomLineNetIncome,
        costAndExpenses,
        costOfRevenue,
        depreciationAndAmortization,
        ebit,
        ebitda,
        eps,
        epsDiluted,
        generalAndAdministrativeExpenses,
        grossProfit,
        incomeBeforeTax,
        incomeTaxExpense,
        interestExpense,
        interestIncome,
        netIncome,
        netIncomeDeductions,
        netIncomeFromContinuingOperations,
        netIncomeFromDiscontinuedOperations,
        netInterestIncome,
        nonOperatingIncomeExcludingInterest,
        operatingExpenses,
        operatingIncome,
        otherAdjustmentsToNetIncome,
        otherExpenses,
        researchAndDevelopmentExpenses,
        revenue,
        sellingAndMarketingExpenses,
        sellingGeneralAndAdministrativeExpenses,
        totalOtherIncomeExpensesNet,
        weightedAverageShsOut,
        weightedAverageShsOutDil,
        mutableMapOf(),
    )

    /**
     * The date and time when the filing was accepted by the SEC
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptedDate(): OffsetDateTime = acceptedDate.getRequired("accepted_date")

    /**
     * The date the financial statement was filed
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun filingDate(): LocalDate = filingDate.getRequired("filing_date")

    /**
     * The fiscal period identifier (e.g., "Q1", "Q2", "Q3", "Q4")
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun period(): String = period.getRequired("period")

    /**
     * The type of fiscal period
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun periodType(): FiscalPeriodType = periodType.getRequired("period_type")

    /**
     * The currency in which the statement is reported (ISO 4217)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reportedCurrency(): String = reportedCurrency.getRequired("reported_currency")

    /**
     * The fiscal year of the statement
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun year(): Int = year.getRequired("year")

    /**
     * Bottom line net income after all adjustments
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bottomLineNetIncome(): Optional<String> =
        bottomLineNetIncome.getOptional("bottom_line_net_income")

    /**
     * Total costs and expenses
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun costAndExpenses(): Optional<String> = costAndExpenses.getOptional("cost_and_expenses")

    /**
     * Direct costs attributable to producing goods sold
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun costOfRevenue(): Optional<String> = costOfRevenue.getOptional("cost_of_revenue")

    /**
     * Depreciation and amortization expenses
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun depreciationAndAmortization(): Optional<String> =
        depreciationAndAmortization.getOptional("depreciation_and_amortization")

    /**
     * Earnings before interest and taxes
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ebit(): Optional<String> = ebit.getOptional("ebit")

    /**
     * Earnings before interest, taxes, depreciation, and amortization
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ebitda(): Optional<String> = ebitda.getOptional("ebitda")

    /**
     * Basic earnings per share
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun eps(): Optional<String> = eps.getOptional("eps")

    /**
     * Diluted earnings per share
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun epsDiluted(): Optional<String> = epsDiluted.getOptional("eps_diluted")

    /**
     * General administrative overhead expenses
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun generalAndAdministrativeExpenses(): Optional<String> =
        generalAndAdministrativeExpenses.getOptional("general_and_administrative_expenses")

    /**
     * Revenue minus cost of revenue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun grossProfit(): Optional<String> = grossProfit.getOptional("gross_profit")

    /**
     * Income before income tax expense
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun incomeBeforeTax(): Optional<String> = incomeBeforeTax.getOptional("income_before_tax")

    /**
     * Income tax expense for the period
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun incomeTaxExpense(): Optional<String> = incomeTaxExpense.getOptional("income_tax_expense")

    /**
     * Interest paid on debt
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interestExpense(): Optional<String> = interestExpense.getOptional("interest_expense")

    /**
     * Interest earned on investments and cash
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interestIncome(): Optional<String> = interestIncome.getOptional("interest_income")

    /**
     * Total net income for the period
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netIncome(): Optional<String> = netIncome.getOptional("net_income")

    /**
     * Deductions from net income
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netIncomeDeductions(): Optional<String> =
        netIncomeDeductions.getOptional("net_income_deductions")

    /**
     * Net income from continuing operations
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netIncomeFromContinuingOperations(): Optional<String> =
        netIncomeFromContinuingOperations.getOptional("net_income_from_continuing_operations")

    /**
     * Net income from discontinued operations
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netIncomeFromDiscontinuedOperations(): Optional<String> =
        netIncomeFromDiscontinuedOperations.getOptional("net_income_from_discontinued_operations")

    /**
     * Net interest income (interest income minus interest expense)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netInterestIncome(): Optional<String> = netInterestIncome.getOptional("net_interest_income")

    /**
     * Non-operating income excluding interest
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nonOperatingIncomeExcludingInterest(): Optional<String> =
        nonOperatingIncomeExcludingInterest.getOptional("non_operating_income_excluding_interest")

    /**
     * Total operating expenses
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun operatingExpenses(): Optional<String> = operatingExpenses.getOptional("operating_expenses")

    /**
     * Income from core business operations
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun operatingIncome(): Optional<String> = operatingIncome.getOptional("operating_income")

    /**
     * Other adjustments to net income
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherAdjustmentsToNetIncome(): Optional<String> =
        otherAdjustmentsToNetIncome.getOptional("other_adjustments_to_net_income")

    /**
     * Other miscellaneous expenses
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherExpenses(): Optional<String> = otherExpenses.getOptional("other_expenses")

    /**
     * Expenditure on research and development activities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun researchAndDevelopmentExpenses(): Optional<String> =
        researchAndDevelopmentExpenses.getOptional("research_and_development_expenses")

    /**
     * Total revenue from sales of goods and services
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revenue(): Optional<String> = revenue.getOptional("revenue")

    /**
     * Expenditure on marketing and sales activities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sellingAndMarketingExpenses(): Optional<String> =
        sellingAndMarketingExpenses.getOptional("selling_and_marketing_expenses")

    /**
     * Combined selling, general, and administrative expenses
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sellingGeneralAndAdministrativeExpenses(): Optional<String> =
        sellingGeneralAndAdministrativeExpenses.getOptional(
            "selling_general_and_administrative_expenses"
        )

    /**
     * Net of other income and expenses
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalOtherIncomeExpensesNet(): Optional<String> =
        totalOtherIncomeExpensesNet.getOptional("total_other_income_expenses_net")

    /**
     * Weighted average shares outstanding (basic)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weightedAverageShsOut(): Optional<String> =
        weightedAverageShsOut.getOptional("weighted_average_shs_out")

    /**
     * Weighted average shares outstanding (diluted)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun weightedAverageShsOutDil(): Optional<String> =
        weightedAverageShsOutDil.getOptional("weighted_average_shs_out_dil")

    /**
     * Returns the raw JSON value of [acceptedDate].
     *
     * Unlike [acceptedDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accepted_date")
    @ExcludeMissing
    fun _acceptedDate(): JsonField<OffsetDateTime> = acceptedDate

    /**
     * Returns the raw JSON value of [filingDate].
     *
     * Unlike [filingDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("filing_date")
    @ExcludeMissing
    fun _filingDate(): JsonField<LocalDate> = filingDate

    /**
     * Returns the raw JSON value of [period].
     *
     * Unlike [period], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period") @ExcludeMissing fun _period(): JsonField<String> = period

    /**
     * Returns the raw JSON value of [periodType].
     *
     * Unlike [periodType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("period_type")
    @ExcludeMissing
    fun _periodType(): JsonField<FiscalPeriodType> = periodType

    /**
     * Returns the raw JSON value of [reportedCurrency].
     *
     * Unlike [reportedCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reported_currency")
    @ExcludeMissing
    fun _reportedCurrency(): JsonField<String> = reportedCurrency

    /**
     * Returns the raw JSON value of [year].
     *
     * Unlike [year], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("year") @ExcludeMissing fun _year(): JsonField<Int> = year

    /**
     * Returns the raw JSON value of [bottomLineNetIncome].
     *
     * Unlike [bottomLineNetIncome], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("bottom_line_net_income")
    @ExcludeMissing
    fun _bottomLineNetIncome(): JsonField<String> = bottomLineNetIncome

    /**
     * Returns the raw JSON value of [costAndExpenses].
     *
     * Unlike [costAndExpenses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost_and_expenses")
    @ExcludeMissing
    fun _costAndExpenses(): JsonField<String> = costAndExpenses

    /**
     * Returns the raw JSON value of [costOfRevenue].
     *
     * Unlike [costOfRevenue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cost_of_revenue")
    @ExcludeMissing
    fun _costOfRevenue(): JsonField<String> = costOfRevenue

    /**
     * Returns the raw JSON value of [depreciationAndAmortization].
     *
     * Unlike [depreciationAndAmortization], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("depreciation_and_amortization")
    @ExcludeMissing
    fun _depreciationAndAmortization(): JsonField<String> = depreciationAndAmortization

    /**
     * Returns the raw JSON value of [ebit].
     *
     * Unlike [ebit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ebit") @ExcludeMissing fun _ebit(): JsonField<String> = ebit

    /**
     * Returns the raw JSON value of [ebitda].
     *
     * Unlike [ebitda], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ebitda") @ExcludeMissing fun _ebitda(): JsonField<String> = ebitda

    /**
     * Returns the raw JSON value of [eps].
     *
     * Unlike [eps], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eps") @ExcludeMissing fun _eps(): JsonField<String> = eps

    /**
     * Returns the raw JSON value of [epsDiluted].
     *
     * Unlike [epsDiluted], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("eps_diluted") @ExcludeMissing fun _epsDiluted(): JsonField<String> = epsDiluted

    /**
     * Returns the raw JSON value of [generalAndAdministrativeExpenses].
     *
     * Unlike [generalAndAdministrativeExpenses], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("general_and_administrative_expenses")
    @ExcludeMissing
    fun _generalAndAdministrativeExpenses(): JsonField<String> = generalAndAdministrativeExpenses

    /**
     * Returns the raw JSON value of [grossProfit].
     *
     * Unlike [grossProfit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("gross_profit")
    @ExcludeMissing
    fun _grossProfit(): JsonField<String> = grossProfit

    /**
     * Returns the raw JSON value of [incomeBeforeTax].
     *
     * Unlike [incomeBeforeTax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("income_before_tax")
    @ExcludeMissing
    fun _incomeBeforeTax(): JsonField<String> = incomeBeforeTax

    /**
     * Returns the raw JSON value of [incomeTaxExpense].
     *
     * Unlike [incomeTaxExpense], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("income_tax_expense")
    @ExcludeMissing
    fun _incomeTaxExpense(): JsonField<String> = incomeTaxExpense

    /**
     * Returns the raw JSON value of [interestExpense].
     *
     * Unlike [interestExpense], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interest_expense")
    @ExcludeMissing
    fun _interestExpense(): JsonField<String> = interestExpense

    /**
     * Returns the raw JSON value of [interestIncome].
     *
     * Unlike [interestIncome], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interest_income")
    @ExcludeMissing
    fun _interestIncome(): JsonField<String> = interestIncome

    /**
     * Returns the raw JSON value of [netIncome].
     *
     * Unlike [netIncome], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_income") @ExcludeMissing fun _netIncome(): JsonField<String> = netIncome

    /**
     * Returns the raw JSON value of [netIncomeDeductions].
     *
     * Unlike [netIncomeDeductions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("net_income_deductions")
    @ExcludeMissing
    fun _netIncomeDeductions(): JsonField<String> = netIncomeDeductions

    /**
     * Returns the raw JSON value of [netIncomeFromContinuingOperations].
     *
     * Unlike [netIncomeFromContinuingOperations], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("net_income_from_continuing_operations")
    @ExcludeMissing
    fun _netIncomeFromContinuingOperations(): JsonField<String> = netIncomeFromContinuingOperations

    /**
     * Returns the raw JSON value of [netIncomeFromDiscontinuedOperations].
     *
     * Unlike [netIncomeFromDiscontinuedOperations], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("net_income_from_discontinued_operations")
    @ExcludeMissing
    fun _netIncomeFromDiscontinuedOperations(): JsonField<String> =
        netIncomeFromDiscontinuedOperations

    /**
     * Returns the raw JSON value of [netInterestIncome].
     *
     * Unlike [netInterestIncome], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("net_interest_income")
    @ExcludeMissing
    fun _netInterestIncome(): JsonField<String> = netInterestIncome

    /**
     * Returns the raw JSON value of [nonOperatingIncomeExcludingInterest].
     *
     * Unlike [nonOperatingIncomeExcludingInterest], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("non_operating_income_excluding_interest")
    @ExcludeMissing
    fun _nonOperatingIncomeExcludingInterest(): JsonField<String> =
        nonOperatingIncomeExcludingInterest

    /**
     * Returns the raw JSON value of [operatingExpenses].
     *
     * Unlike [operatingExpenses], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("operating_expenses")
    @ExcludeMissing
    fun _operatingExpenses(): JsonField<String> = operatingExpenses

    /**
     * Returns the raw JSON value of [operatingIncome].
     *
     * Unlike [operatingIncome], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operating_income")
    @ExcludeMissing
    fun _operatingIncome(): JsonField<String> = operatingIncome

    /**
     * Returns the raw JSON value of [otherAdjustmentsToNetIncome].
     *
     * Unlike [otherAdjustmentsToNetIncome], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("other_adjustments_to_net_income")
    @ExcludeMissing
    fun _otherAdjustmentsToNetIncome(): JsonField<String> = otherAdjustmentsToNetIncome

    /**
     * Returns the raw JSON value of [otherExpenses].
     *
     * Unlike [otherExpenses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("other_expenses")
    @ExcludeMissing
    fun _otherExpenses(): JsonField<String> = otherExpenses

    /**
     * Returns the raw JSON value of [researchAndDevelopmentExpenses].
     *
     * Unlike [researchAndDevelopmentExpenses], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("research_and_development_expenses")
    @ExcludeMissing
    fun _researchAndDevelopmentExpenses(): JsonField<String> = researchAndDevelopmentExpenses

    /**
     * Returns the raw JSON value of [revenue].
     *
     * Unlike [revenue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("revenue") @ExcludeMissing fun _revenue(): JsonField<String> = revenue

    /**
     * Returns the raw JSON value of [sellingAndMarketingExpenses].
     *
     * Unlike [sellingAndMarketingExpenses], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("selling_and_marketing_expenses")
    @ExcludeMissing
    fun _sellingAndMarketingExpenses(): JsonField<String> = sellingAndMarketingExpenses

    /**
     * Returns the raw JSON value of [sellingGeneralAndAdministrativeExpenses].
     *
     * Unlike [sellingGeneralAndAdministrativeExpenses], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("selling_general_and_administrative_expenses")
    @ExcludeMissing
    fun _sellingGeneralAndAdministrativeExpenses(): JsonField<String> =
        sellingGeneralAndAdministrativeExpenses

    /**
     * Returns the raw JSON value of [totalOtherIncomeExpensesNet].
     *
     * Unlike [totalOtherIncomeExpensesNet], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("total_other_income_expenses_net")
    @ExcludeMissing
    fun _totalOtherIncomeExpensesNet(): JsonField<String> = totalOtherIncomeExpensesNet

    /**
     * Returns the raw JSON value of [weightedAverageShsOut].
     *
     * Unlike [weightedAverageShsOut], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("weighted_average_shs_out")
    @ExcludeMissing
    fun _weightedAverageShsOut(): JsonField<String> = weightedAverageShsOut

    /**
     * Returns the raw JSON value of [weightedAverageShsOutDil].
     *
     * Unlike [weightedAverageShsOutDil], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("weighted_average_shs_out_dil")
    @ExcludeMissing
    fun _weightedAverageShsOutDil(): JsonField<String> = weightedAverageShsOutDil

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
         * Returns a mutable builder for constructing an instance of [InstrumentIncomeStatement].
         *
         * The following fields are required:
         * ```java
         * .acceptedDate()
         * .filingDate()
         * .period()
         * .periodType()
         * .reportedCurrency()
         * .year()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InstrumentIncomeStatement]. */
    class Builder internal constructor() {

        private var acceptedDate: JsonField<OffsetDateTime>? = null
        private var filingDate: JsonField<LocalDate>? = null
        private var period: JsonField<String>? = null
        private var periodType: JsonField<FiscalPeriodType>? = null
        private var reportedCurrency: JsonField<String>? = null
        private var year: JsonField<Int>? = null
        private var bottomLineNetIncome: JsonField<String> = JsonMissing.of()
        private var costAndExpenses: JsonField<String> = JsonMissing.of()
        private var costOfRevenue: JsonField<String> = JsonMissing.of()
        private var depreciationAndAmortization: JsonField<String> = JsonMissing.of()
        private var ebit: JsonField<String> = JsonMissing.of()
        private var ebitda: JsonField<String> = JsonMissing.of()
        private var eps: JsonField<String> = JsonMissing.of()
        private var epsDiluted: JsonField<String> = JsonMissing.of()
        private var generalAndAdministrativeExpenses: JsonField<String> = JsonMissing.of()
        private var grossProfit: JsonField<String> = JsonMissing.of()
        private var incomeBeforeTax: JsonField<String> = JsonMissing.of()
        private var incomeTaxExpense: JsonField<String> = JsonMissing.of()
        private var interestExpense: JsonField<String> = JsonMissing.of()
        private var interestIncome: JsonField<String> = JsonMissing.of()
        private var netIncome: JsonField<String> = JsonMissing.of()
        private var netIncomeDeductions: JsonField<String> = JsonMissing.of()
        private var netIncomeFromContinuingOperations: JsonField<String> = JsonMissing.of()
        private var netIncomeFromDiscontinuedOperations: JsonField<String> = JsonMissing.of()
        private var netInterestIncome: JsonField<String> = JsonMissing.of()
        private var nonOperatingIncomeExcludingInterest: JsonField<String> = JsonMissing.of()
        private var operatingExpenses: JsonField<String> = JsonMissing.of()
        private var operatingIncome: JsonField<String> = JsonMissing.of()
        private var otherAdjustmentsToNetIncome: JsonField<String> = JsonMissing.of()
        private var otherExpenses: JsonField<String> = JsonMissing.of()
        private var researchAndDevelopmentExpenses: JsonField<String> = JsonMissing.of()
        private var revenue: JsonField<String> = JsonMissing.of()
        private var sellingAndMarketingExpenses: JsonField<String> = JsonMissing.of()
        private var sellingGeneralAndAdministrativeExpenses: JsonField<String> = JsonMissing.of()
        private var totalOtherIncomeExpensesNet: JsonField<String> = JsonMissing.of()
        private var weightedAverageShsOut: JsonField<String> = JsonMissing.of()
        private var weightedAverageShsOutDil: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentIncomeStatement: InstrumentIncomeStatement) = apply {
            acceptedDate = instrumentIncomeStatement.acceptedDate
            filingDate = instrumentIncomeStatement.filingDate
            period = instrumentIncomeStatement.period
            periodType = instrumentIncomeStatement.periodType
            reportedCurrency = instrumentIncomeStatement.reportedCurrency
            year = instrumentIncomeStatement.year
            bottomLineNetIncome = instrumentIncomeStatement.bottomLineNetIncome
            costAndExpenses = instrumentIncomeStatement.costAndExpenses
            costOfRevenue = instrumentIncomeStatement.costOfRevenue
            depreciationAndAmortization = instrumentIncomeStatement.depreciationAndAmortization
            ebit = instrumentIncomeStatement.ebit
            ebitda = instrumentIncomeStatement.ebitda
            eps = instrumentIncomeStatement.eps
            epsDiluted = instrumentIncomeStatement.epsDiluted
            generalAndAdministrativeExpenses =
                instrumentIncomeStatement.generalAndAdministrativeExpenses
            grossProfit = instrumentIncomeStatement.grossProfit
            incomeBeforeTax = instrumentIncomeStatement.incomeBeforeTax
            incomeTaxExpense = instrumentIncomeStatement.incomeTaxExpense
            interestExpense = instrumentIncomeStatement.interestExpense
            interestIncome = instrumentIncomeStatement.interestIncome
            netIncome = instrumentIncomeStatement.netIncome
            netIncomeDeductions = instrumentIncomeStatement.netIncomeDeductions
            netIncomeFromContinuingOperations =
                instrumentIncomeStatement.netIncomeFromContinuingOperations
            netIncomeFromDiscontinuedOperations =
                instrumentIncomeStatement.netIncomeFromDiscontinuedOperations
            netInterestIncome = instrumentIncomeStatement.netInterestIncome
            nonOperatingIncomeExcludingInterest =
                instrumentIncomeStatement.nonOperatingIncomeExcludingInterest
            operatingExpenses = instrumentIncomeStatement.operatingExpenses
            operatingIncome = instrumentIncomeStatement.operatingIncome
            otherAdjustmentsToNetIncome = instrumentIncomeStatement.otherAdjustmentsToNetIncome
            otherExpenses = instrumentIncomeStatement.otherExpenses
            researchAndDevelopmentExpenses =
                instrumentIncomeStatement.researchAndDevelopmentExpenses
            revenue = instrumentIncomeStatement.revenue
            sellingAndMarketingExpenses = instrumentIncomeStatement.sellingAndMarketingExpenses
            sellingGeneralAndAdministrativeExpenses =
                instrumentIncomeStatement.sellingGeneralAndAdministrativeExpenses
            totalOtherIncomeExpensesNet = instrumentIncomeStatement.totalOtherIncomeExpensesNet
            weightedAverageShsOut = instrumentIncomeStatement.weightedAverageShsOut
            weightedAverageShsOutDil = instrumentIncomeStatement.weightedAverageShsOutDil
            additionalProperties = instrumentIncomeStatement.additionalProperties.toMutableMap()
        }

        /** The date and time when the filing was accepted by the SEC */
        fun acceptedDate(acceptedDate: OffsetDateTime) = acceptedDate(JsonField.of(acceptedDate))

        /**
         * Sets [Builder.acceptedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptedDate(acceptedDate: JsonField<OffsetDateTime>) = apply {
            this.acceptedDate = acceptedDate
        }

        /** The date the financial statement was filed */
        fun filingDate(filingDate: LocalDate) = filingDate(JsonField.of(filingDate))

        /**
         * Sets [Builder.filingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.filingDate] with a well-typed [LocalDate] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun filingDate(filingDate: JsonField<LocalDate>) = apply { this.filingDate = filingDate }

        /** The fiscal period identifier (e.g., "Q1", "Q2", "Q3", "Q4") */
        fun period(period: String) = period(JsonField.of(period))

        /**
         * Sets [Builder.period] to an arbitrary JSON value.
         *
         * You should usually call [Builder.period] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun period(period: JsonField<String>) = apply { this.period = period }

        /** The type of fiscal period */
        fun periodType(periodType: FiscalPeriodType) = periodType(JsonField.of(periodType))

        /**
         * Sets [Builder.periodType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.periodType] with a well-typed [FiscalPeriodType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun periodType(periodType: JsonField<FiscalPeriodType>) = apply {
            this.periodType = periodType
        }

        /** The currency in which the statement is reported (ISO 4217) */
        fun reportedCurrency(reportedCurrency: String) =
            reportedCurrency(JsonField.of(reportedCurrency))

        /**
         * Sets [Builder.reportedCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reportedCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun reportedCurrency(reportedCurrency: JsonField<String>) = apply {
            this.reportedCurrency = reportedCurrency
        }

        /** The fiscal year of the statement */
        fun year(year: Int) = year(JsonField.of(year))

        /**
         * Sets [Builder.year] to an arbitrary JSON value.
         *
         * You should usually call [Builder.year] with a well-typed [Int] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun year(year: JsonField<Int>) = apply { this.year = year }

        /** Bottom line net income after all adjustments */
        fun bottomLineNetIncome(bottomLineNetIncome: String?) =
            bottomLineNetIncome(JsonField.ofNullable(bottomLineNetIncome))

        /**
         * Alias for calling [Builder.bottomLineNetIncome] with `bottomLineNetIncome.orElse(null)`.
         */
        fun bottomLineNetIncome(bottomLineNetIncome: Optional<String>) =
            bottomLineNetIncome(bottomLineNetIncome.getOrNull())

        /**
         * Sets [Builder.bottomLineNetIncome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bottomLineNetIncome] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun bottomLineNetIncome(bottomLineNetIncome: JsonField<String>) = apply {
            this.bottomLineNetIncome = bottomLineNetIncome
        }

        /** Total costs and expenses */
        fun costAndExpenses(costAndExpenses: String?) =
            costAndExpenses(JsonField.ofNullable(costAndExpenses))

        /** Alias for calling [Builder.costAndExpenses] with `costAndExpenses.orElse(null)`. */
        fun costAndExpenses(costAndExpenses: Optional<String>) =
            costAndExpenses(costAndExpenses.getOrNull())

        /**
         * Sets [Builder.costAndExpenses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costAndExpenses] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun costAndExpenses(costAndExpenses: JsonField<String>) = apply {
            this.costAndExpenses = costAndExpenses
        }

        /** Direct costs attributable to producing goods sold */
        fun costOfRevenue(costOfRevenue: String?) =
            costOfRevenue(JsonField.ofNullable(costOfRevenue))

        /** Alias for calling [Builder.costOfRevenue] with `costOfRevenue.orElse(null)`. */
        fun costOfRevenue(costOfRevenue: Optional<String>) =
            costOfRevenue(costOfRevenue.getOrNull())

        /**
         * Sets [Builder.costOfRevenue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.costOfRevenue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun costOfRevenue(costOfRevenue: JsonField<String>) = apply {
            this.costOfRevenue = costOfRevenue
        }

        /** Depreciation and amortization expenses */
        fun depreciationAndAmortization(depreciationAndAmortization: String?) =
            depreciationAndAmortization(JsonField.ofNullable(depreciationAndAmortization))

        /**
         * Alias for calling [Builder.depreciationAndAmortization] with
         * `depreciationAndAmortization.orElse(null)`.
         */
        fun depreciationAndAmortization(depreciationAndAmortization: Optional<String>) =
            depreciationAndAmortization(depreciationAndAmortization.getOrNull())

        /**
         * Sets [Builder.depreciationAndAmortization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.depreciationAndAmortization] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun depreciationAndAmortization(depreciationAndAmortization: JsonField<String>) = apply {
            this.depreciationAndAmortization = depreciationAndAmortization
        }

        /** Earnings before interest and taxes */
        fun ebit(ebit: String?) = ebit(JsonField.ofNullable(ebit))

        /** Alias for calling [Builder.ebit] with `ebit.orElse(null)`. */
        fun ebit(ebit: Optional<String>) = ebit(ebit.getOrNull())

        /**
         * Sets [Builder.ebit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ebit] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ebit(ebit: JsonField<String>) = apply { this.ebit = ebit }

        /** Earnings before interest, taxes, depreciation, and amortization */
        fun ebitda(ebitda: String?) = ebitda(JsonField.ofNullable(ebitda))

        /** Alias for calling [Builder.ebitda] with `ebitda.orElse(null)`. */
        fun ebitda(ebitda: Optional<String>) = ebitda(ebitda.getOrNull())

        /**
         * Sets [Builder.ebitda] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ebitda] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ebitda(ebitda: JsonField<String>) = apply { this.ebitda = ebitda }

        /** Basic earnings per share */
        fun eps(eps: String?) = eps(JsonField.ofNullable(eps))

        /** Alias for calling [Builder.eps] with `eps.orElse(null)`. */
        fun eps(eps: Optional<String>) = eps(eps.getOrNull())

        /**
         * Sets [Builder.eps] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eps] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun eps(eps: JsonField<String>) = apply { this.eps = eps }

        /** Diluted earnings per share */
        fun epsDiluted(epsDiluted: String?) = epsDiluted(JsonField.ofNullable(epsDiluted))

        /** Alias for calling [Builder.epsDiluted] with `epsDiluted.orElse(null)`. */
        fun epsDiluted(epsDiluted: Optional<String>) = epsDiluted(epsDiluted.getOrNull())

        /**
         * Sets [Builder.epsDiluted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.epsDiluted] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun epsDiluted(epsDiluted: JsonField<String>) = apply { this.epsDiluted = epsDiluted }

        /** General administrative overhead expenses */
        fun generalAndAdministrativeExpenses(generalAndAdministrativeExpenses: String?) =
            generalAndAdministrativeExpenses(JsonField.ofNullable(generalAndAdministrativeExpenses))

        /**
         * Alias for calling [Builder.generalAndAdministrativeExpenses] with
         * `generalAndAdministrativeExpenses.orElse(null)`.
         */
        fun generalAndAdministrativeExpenses(generalAndAdministrativeExpenses: Optional<String>) =
            generalAndAdministrativeExpenses(generalAndAdministrativeExpenses.getOrNull())

        /**
         * Sets [Builder.generalAndAdministrativeExpenses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.generalAndAdministrativeExpenses] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun generalAndAdministrativeExpenses(generalAndAdministrativeExpenses: JsonField<String>) =
            apply {
                this.generalAndAdministrativeExpenses = generalAndAdministrativeExpenses
            }

        /** Revenue minus cost of revenue */
        fun grossProfit(grossProfit: String?) = grossProfit(JsonField.ofNullable(grossProfit))

        /** Alias for calling [Builder.grossProfit] with `grossProfit.orElse(null)`. */
        fun grossProfit(grossProfit: Optional<String>) = grossProfit(grossProfit.getOrNull())

        /**
         * Sets [Builder.grossProfit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grossProfit] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun grossProfit(grossProfit: JsonField<String>) = apply { this.grossProfit = grossProfit }

        /** Income before income tax expense */
        fun incomeBeforeTax(incomeBeforeTax: String?) =
            incomeBeforeTax(JsonField.ofNullable(incomeBeforeTax))

        /** Alias for calling [Builder.incomeBeforeTax] with `incomeBeforeTax.orElse(null)`. */
        fun incomeBeforeTax(incomeBeforeTax: Optional<String>) =
            incomeBeforeTax(incomeBeforeTax.getOrNull())

        /**
         * Sets [Builder.incomeBeforeTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incomeBeforeTax] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun incomeBeforeTax(incomeBeforeTax: JsonField<String>) = apply {
            this.incomeBeforeTax = incomeBeforeTax
        }

        /** Income tax expense for the period */
        fun incomeTaxExpense(incomeTaxExpense: String?) =
            incomeTaxExpense(JsonField.ofNullable(incomeTaxExpense))

        /** Alias for calling [Builder.incomeTaxExpense] with `incomeTaxExpense.orElse(null)`. */
        fun incomeTaxExpense(incomeTaxExpense: Optional<String>) =
            incomeTaxExpense(incomeTaxExpense.getOrNull())

        /**
         * Sets [Builder.incomeTaxExpense] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incomeTaxExpense] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun incomeTaxExpense(incomeTaxExpense: JsonField<String>) = apply {
            this.incomeTaxExpense = incomeTaxExpense
        }

        /** Interest paid on debt */
        fun interestExpense(interestExpense: String?) =
            interestExpense(JsonField.ofNullable(interestExpense))

        /** Alias for calling [Builder.interestExpense] with `interestExpense.orElse(null)`. */
        fun interestExpense(interestExpense: Optional<String>) =
            interestExpense(interestExpense.getOrNull())

        /**
         * Sets [Builder.interestExpense] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interestExpense] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interestExpense(interestExpense: JsonField<String>) = apply {
            this.interestExpense = interestExpense
        }

        /** Interest earned on investments and cash */
        fun interestIncome(interestIncome: String?) =
            interestIncome(JsonField.ofNullable(interestIncome))

        /** Alias for calling [Builder.interestIncome] with `interestIncome.orElse(null)`. */
        fun interestIncome(interestIncome: Optional<String>) =
            interestIncome(interestIncome.getOrNull())

        /**
         * Sets [Builder.interestIncome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interestIncome] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun interestIncome(interestIncome: JsonField<String>) = apply {
            this.interestIncome = interestIncome
        }

        /** Total net income for the period */
        fun netIncome(netIncome: String?) = netIncome(JsonField.ofNullable(netIncome))

        /** Alias for calling [Builder.netIncome] with `netIncome.orElse(null)`. */
        fun netIncome(netIncome: Optional<String>) = netIncome(netIncome.getOrNull())

        /**
         * Sets [Builder.netIncome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netIncome] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun netIncome(netIncome: JsonField<String>) = apply { this.netIncome = netIncome }

        /** Deductions from net income */
        fun netIncomeDeductions(netIncomeDeductions: String?) =
            netIncomeDeductions(JsonField.ofNullable(netIncomeDeductions))

        /**
         * Alias for calling [Builder.netIncomeDeductions] with `netIncomeDeductions.orElse(null)`.
         */
        fun netIncomeDeductions(netIncomeDeductions: Optional<String>) =
            netIncomeDeductions(netIncomeDeductions.getOrNull())

        /**
         * Sets [Builder.netIncomeDeductions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netIncomeDeductions] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netIncomeDeductions(netIncomeDeductions: JsonField<String>) = apply {
            this.netIncomeDeductions = netIncomeDeductions
        }

        /** Net income from continuing operations */
        fun netIncomeFromContinuingOperations(netIncomeFromContinuingOperations: String?) =
            netIncomeFromContinuingOperations(
                JsonField.ofNullable(netIncomeFromContinuingOperations)
            )

        /**
         * Alias for calling [Builder.netIncomeFromContinuingOperations] with
         * `netIncomeFromContinuingOperations.orElse(null)`.
         */
        fun netIncomeFromContinuingOperations(netIncomeFromContinuingOperations: Optional<String>) =
            netIncomeFromContinuingOperations(netIncomeFromContinuingOperations.getOrNull())

        /**
         * Sets [Builder.netIncomeFromContinuingOperations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netIncomeFromContinuingOperations] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun netIncomeFromContinuingOperations(
            netIncomeFromContinuingOperations: JsonField<String>
        ) = apply { this.netIncomeFromContinuingOperations = netIncomeFromContinuingOperations }

        /** Net income from discontinued operations */
        fun netIncomeFromDiscontinuedOperations(netIncomeFromDiscontinuedOperations: String?) =
            netIncomeFromDiscontinuedOperations(
                JsonField.ofNullable(netIncomeFromDiscontinuedOperations)
            )

        /**
         * Alias for calling [Builder.netIncomeFromDiscontinuedOperations] with
         * `netIncomeFromDiscontinuedOperations.orElse(null)`.
         */
        fun netIncomeFromDiscontinuedOperations(
            netIncomeFromDiscontinuedOperations: Optional<String>
        ) = netIncomeFromDiscontinuedOperations(netIncomeFromDiscontinuedOperations.getOrNull())

        /**
         * Sets [Builder.netIncomeFromDiscontinuedOperations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netIncomeFromDiscontinuedOperations] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun netIncomeFromDiscontinuedOperations(
            netIncomeFromDiscontinuedOperations: JsonField<String>
        ) = apply { this.netIncomeFromDiscontinuedOperations = netIncomeFromDiscontinuedOperations }

        /** Net interest income (interest income minus interest expense) */
        fun netInterestIncome(netInterestIncome: String?) =
            netInterestIncome(JsonField.ofNullable(netInterestIncome))

        /** Alias for calling [Builder.netInterestIncome] with `netInterestIncome.orElse(null)`. */
        fun netInterestIncome(netInterestIncome: Optional<String>) =
            netInterestIncome(netInterestIncome.getOrNull())

        /**
         * Sets [Builder.netInterestIncome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netInterestIncome] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netInterestIncome(netInterestIncome: JsonField<String>) = apply {
            this.netInterestIncome = netInterestIncome
        }

        /** Non-operating income excluding interest */
        fun nonOperatingIncomeExcludingInterest(nonOperatingIncomeExcludingInterest: String?) =
            nonOperatingIncomeExcludingInterest(
                JsonField.ofNullable(nonOperatingIncomeExcludingInterest)
            )

        /**
         * Alias for calling [Builder.nonOperatingIncomeExcludingInterest] with
         * `nonOperatingIncomeExcludingInterest.orElse(null)`.
         */
        fun nonOperatingIncomeExcludingInterest(
            nonOperatingIncomeExcludingInterest: Optional<String>
        ) = nonOperatingIncomeExcludingInterest(nonOperatingIncomeExcludingInterest.getOrNull())

        /**
         * Sets [Builder.nonOperatingIncomeExcludingInterest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nonOperatingIncomeExcludingInterest] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun nonOperatingIncomeExcludingInterest(
            nonOperatingIncomeExcludingInterest: JsonField<String>
        ) = apply { this.nonOperatingIncomeExcludingInterest = nonOperatingIncomeExcludingInterest }

        /** Total operating expenses */
        fun operatingExpenses(operatingExpenses: String?) =
            operatingExpenses(JsonField.ofNullable(operatingExpenses))

        /** Alias for calling [Builder.operatingExpenses] with `operatingExpenses.orElse(null)`. */
        fun operatingExpenses(operatingExpenses: Optional<String>) =
            operatingExpenses(operatingExpenses.getOrNull())

        /**
         * Sets [Builder.operatingExpenses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatingExpenses] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operatingExpenses(operatingExpenses: JsonField<String>) = apply {
            this.operatingExpenses = operatingExpenses
        }

        /** Income from core business operations */
        fun operatingIncome(operatingIncome: String?) =
            operatingIncome(JsonField.ofNullable(operatingIncome))

        /** Alias for calling [Builder.operatingIncome] with `operatingIncome.orElse(null)`. */
        fun operatingIncome(operatingIncome: Optional<String>) =
            operatingIncome(operatingIncome.getOrNull())

        /**
         * Sets [Builder.operatingIncome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatingIncome] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operatingIncome(operatingIncome: JsonField<String>) = apply {
            this.operatingIncome = operatingIncome
        }

        /** Other adjustments to net income */
        fun otherAdjustmentsToNetIncome(otherAdjustmentsToNetIncome: String?) =
            otherAdjustmentsToNetIncome(JsonField.ofNullable(otherAdjustmentsToNetIncome))

        /**
         * Alias for calling [Builder.otherAdjustmentsToNetIncome] with
         * `otherAdjustmentsToNetIncome.orElse(null)`.
         */
        fun otherAdjustmentsToNetIncome(otherAdjustmentsToNetIncome: Optional<String>) =
            otherAdjustmentsToNetIncome(otherAdjustmentsToNetIncome.getOrNull())

        /**
         * Sets [Builder.otherAdjustmentsToNetIncome] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherAdjustmentsToNetIncome] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun otherAdjustmentsToNetIncome(otherAdjustmentsToNetIncome: JsonField<String>) = apply {
            this.otherAdjustmentsToNetIncome = otherAdjustmentsToNetIncome
        }

        /** Other miscellaneous expenses */
        fun otherExpenses(otherExpenses: String?) =
            otherExpenses(JsonField.ofNullable(otherExpenses))

        /** Alias for calling [Builder.otherExpenses] with `otherExpenses.orElse(null)`. */
        fun otherExpenses(otherExpenses: Optional<String>) =
            otherExpenses(otherExpenses.getOrNull())

        /**
         * Sets [Builder.otherExpenses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherExpenses] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun otherExpenses(otherExpenses: JsonField<String>) = apply {
            this.otherExpenses = otherExpenses
        }

        /** Expenditure on research and development activities */
        fun researchAndDevelopmentExpenses(researchAndDevelopmentExpenses: String?) =
            researchAndDevelopmentExpenses(JsonField.ofNullable(researchAndDevelopmentExpenses))

        /**
         * Alias for calling [Builder.researchAndDevelopmentExpenses] with
         * `researchAndDevelopmentExpenses.orElse(null)`.
         */
        fun researchAndDevelopmentExpenses(researchAndDevelopmentExpenses: Optional<String>) =
            researchAndDevelopmentExpenses(researchAndDevelopmentExpenses.getOrNull())

        /**
         * Sets [Builder.researchAndDevelopmentExpenses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.researchAndDevelopmentExpenses] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun researchAndDevelopmentExpenses(researchAndDevelopmentExpenses: JsonField<String>) =
            apply {
                this.researchAndDevelopmentExpenses = researchAndDevelopmentExpenses
            }

        /** Total revenue from sales of goods and services */
        fun revenue(revenue: String?) = revenue(JsonField.ofNullable(revenue))

        /** Alias for calling [Builder.revenue] with `revenue.orElse(null)`. */
        fun revenue(revenue: Optional<String>) = revenue(revenue.getOrNull())

        /**
         * Sets [Builder.revenue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenue] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun revenue(revenue: JsonField<String>) = apply { this.revenue = revenue }

        /** Expenditure on marketing and sales activities */
        fun sellingAndMarketingExpenses(sellingAndMarketingExpenses: String?) =
            sellingAndMarketingExpenses(JsonField.ofNullable(sellingAndMarketingExpenses))

        /**
         * Alias for calling [Builder.sellingAndMarketingExpenses] with
         * `sellingAndMarketingExpenses.orElse(null)`.
         */
        fun sellingAndMarketingExpenses(sellingAndMarketingExpenses: Optional<String>) =
            sellingAndMarketingExpenses(sellingAndMarketingExpenses.getOrNull())

        /**
         * Sets [Builder.sellingAndMarketingExpenses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sellingAndMarketingExpenses] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun sellingAndMarketingExpenses(sellingAndMarketingExpenses: JsonField<String>) = apply {
            this.sellingAndMarketingExpenses = sellingAndMarketingExpenses
        }

        /** Combined selling, general, and administrative expenses */
        fun sellingGeneralAndAdministrativeExpenses(
            sellingGeneralAndAdministrativeExpenses: String?
        ) =
            sellingGeneralAndAdministrativeExpenses(
                JsonField.ofNullable(sellingGeneralAndAdministrativeExpenses)
            )

        /**
         * Alias for calling [Builder.sellingGeneralAndAdministrativeExpenses] with
         * `sellingGeneralAndAdministrativeExpenses.orElse(null)`.
         */
        fun sellingGeneralAndAdministrativeExpenses(
            sellingGeneralAndAdministrativeExpenses: Optional<String>
        ) =
            sellingGeneralAndAdministrativeExpenses(
                sellingGeneralAndAdministrativeExpenses.getOrNull()
            )

        /**
         * Sets [Builder.sellingGeneralAndAdministrativeExpenses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sellingGeneralAndAdministrativeExpenses] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun sellingGeneralAndAdministrativeExpenses(
            sellingGeneralAndAdministrativeExpenses: JsonField<String>
        ) = apply {
            this.sellingGeneralAndAdministrativeExpenses = sellingGeneralAndAdministrativeExpenses
        }

        /** Net of other income and expenses */
        fun totalOtherIncomeExpensesNet(totalOtherIncomeExpensesNet: String?) =
            totalOtherIncomeExpensesNet(JsonField.ofNullable(totalOtherIncomeExpensesNet))

        /**
         * Alias for calling [Builder.totalOtherIncomeExpensesNet] with
         * `totalOtherIncomeExpensesNet.orElse(null)`.
         */
        fun totalOtherIncomeExpensesNet(totalOtherIncomeExpensesNet: Optional<String>) =
            totalOtherIncomeExpensesNet(totalOtherIncomeExpensesNet.getOrNull())

        /**
         * Sets [Builder.totalOtherIncomeExpensesNet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalOtherIncomeExpensesNet] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun totalOtherIncomeExpensesNet(totalOtherIncomeExpensesNet: JsonField<String>) = apply {
            this.totalOtherIncomeExpensesNet = totalOtherIncomeExpensesNet
        }

        /** Weighted average shares outstanding (basic) */
        fun weightedAverageShsOut(weightedAverageShsOut: String?) =
            weightedAverageShsOut(JsonField.ofNullable(weightedAverageShsOut))

        /**
         * Alias for calling [Builder.weightedAverageShsOut] with
         * `weightedAverageShsOut.orElse(null)`.
         */
        fun weightedAverageShsOut(weightedAverageShsOut: Optional<String>) =
            weightedAverageShsOut(weightedAverageShsOut.getOrNull())

        /**
         * Sets [Builder.weightedAverageShsOut] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weightedAverageShsOut] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun weightedAverageShsOut(weightedAverageShsOut: JsonField<String>) = apply {
            this.weightedAverageShsOut = weightedAverageShsOut
        }

        /** Weighted average shares outstanding (diluted) */
        fun weightedAverageShsOutDil(weightedAverageShsOutDil: String?) =
            weightedAverageShsOutDil(JsonField.ofNullable(weightedAverageShsOutDil))

        /**
         * Alias for calling [Builder.weightedAverageShsOutDil] with
         * `weightedAverageShsOutDil.orElse(null)`.
         */
        fun weightedAverageShsOutDil(weightedAverageShsOutDil: Optional<String>) =
            weightedAverageShsOutDil(weightedAverageShsOutDil.getOrNull())

        /**
         * Sets [Builder.weightedAverageShsOutDil] to an arbitrary JSON value.
         *
         * You should usually call [Builder.weightedAverageShsOutDil] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun weightedAverageShsOutDil(weightedAverageShsOutDil: JsonField<String>) = apply {
            this.weightedAverageShsOutDil = weightedAverageShsOutDil
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
         * Returns an immutable instance of [InstrumentIncomeStatement].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .acceptedDate()
         * .filingDate()
         * .period()
         * .periodType()
         * .reportedCurrency()
         * .year()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InstrumentIncomeStatement =
            InstrumentIncomeStatement(
                checkRequired("acceptedDate", acceptedDate),
                checkRequired("filingDate", filingDate),
                checkRequired("period", period),
                checkRequired("periodType", periodType),
                checkRequired("reportedCurrency", reportedCurrency),
                checkRequired("year", year),
                bottomLineNetIncome,
                costAndExpenses,
                costOfRevenue,
                depreciationAndAmortization,
                ebit,
                ebitda,
                eps,
                epsDiluted,
                generalAndAdministrativeExpenses,
                grossProfit,
                incomeBeforeTax,
                incomeTaxExpense,
                interestExpense,
                interestIncome,
                netIncome,
                netIncomeDeductions,
                netIncomeFromContinuingOperations,
                netIncomeFromDiscontinuedOperations,
                netInterestIncome,
                nonOperatingIncomeExcludingInterest,
                operatingExpenses,
                operatingIncome,
                otherAdjustmentsToNetIncome,
                otherExpenses,
                researchAndDevelopmentExpenses,
                revenue,
                sellingAndMarketingExpenses,
                sellingGeneralAndAdministrativeExpenses,
                totalOtherIncomeExpensesNet,
                weightedAverageShsOut,
                weightedAverageShsOutDil,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InstrumentIncomeStatement = apply {
        if (validated) {
            return@apply
        }

        acceptedDate()
        filingDate()
        period()
        periodType().validate()
        reportedCurrency()
        year()
        bottomLineNetIncome()
        costAndExpenses()
        costOfRevenue()
        depreciationAndAmortization()
        ebit()
        ebitda()
        eps()
        epsDiluted()
        generalAndAdministrativeExpenses()
        grossProfit()
        incomeBeforeTax()
        incomeTaxExpense()
        interestExpense()
        interestIncome()
        netIncome()
        netIncomeDeductions()
        netIncomeFromContinuingOperations()
        netIncomeFromDiscontinuedOperations()
        netInterestIncome()
        nonOperatingIncomeExcludingInterest()
        operatingExpenses()
        operatingIncome()
        otherAdjustmentsToNetIncome()
        otherExpenses()
        researchAndDevelopmentExpenses()
        revenue()
        sellingAndMarketingExpenses()
        sellingGeneralAndAdministrativeExpenses()
        totalOtherIncomeExpensesNet()
        weightedAverageShsOut()
        weightedAverageShsOutDil()
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
        (if (acceptedDate.asKnown().isPresent) 1 else 0) +
            (if (filingDate.asKnown().isPresent) 1 else 0) +
            (if (period.asKnown().isPresent) 1 else 0) +
            (periodType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (reportedCurrency.asKnown().isPresent) 1 else 0) +
            (if (year.asKnown().isPresent) 1 else 0) +
            (if (bottomLineNetIncome.asKnown().isPresent) 1 else 0) +
            (if (costAndExpenses.asKnown().isPresent) 1 else 0) +
            (if (costOfRevenue.asKnown().isPresent) 1 else 0) +
            (if (depreciationAndAmortization.asKnown().isPresent) 1 else 0) +
            (if (ebit.asKnown().isPresent) 1 else 0) +
            (if (ebitda.asKnown().isPresent) 1 else 0) +
            (if (eps.asKnown().isPresent) 1 else 0) +
            (if (epsDiluted.asKnown().isPresent) 1 else 0) +
            (if (generalAndAdministrativeExpenses.asKnown().isPresent) 1 else 0) +
            (if (grossProfit.asKnown().isPresent) 1 else 0) +
            (if (incomeBeforeTax.asKnown().isPresent) 1 else 0) +
            (if (incomeTaxExpense.asKnown().isPresent) 1 else 0) +
            (if (interestExpense.asKnown().isPresent) 1 else 0) +
            (if (interestIncome.asKnown().isPresent) 1 else 0) +
            (if (netIncome.asKnown().isPresent) 1 else 0) +
            (if (netIncomeDeductions.asKnown().isPresent) 1 else 0) +
            (if (netIncomeFromContinuingOperations.asKnown().isPresent) 1 else 0) +
            (if (netIncomeFromDiscontinuedOperations.asKnown().isPresent) 1 else 0) +
            (if (netInterestIncome.asKnown().isPresent) 1 else 0) +
            (if (nonOperatingIncomeExcludingInterest.asKnown().isPresent) 1 else 0) +
            (if (operatingExpenses.asKnown().isPresent) 1 else 0) +
            (if (operatingIncome.asKnown().isPresent) 1 else 0) +
            (if (otherAdjustmentsToNetIncome.asKnown().isPresent) 1 else 0) +
            (if (otherExpenses.asKnown().isPresent) 1 else 0) +
            (if (researchAndDevelopmentExpenses.asKnown().isPresent) 1 else 0) +
            (if (revenue.asKnown().isPresent) 1 else 0) +
            (if (sellingAndMarketingExpenses.asKnown().isPresent) 1 else 0) +
            (if (sellingGeneralAndAdministrativeExpenses.asKnown().isPresent) 1 else 0) +
            (if (totalOtherIncomeExpensesNet.asKnown().isPresent) 1 else 0) +
            (if (weightedAverageShsOut.asKnown().isPresent) 1 else 0) +
            (if (weightedAverageShsOutDil.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentIncomeStatement &&
            acceptedDate == other.acceptedDate &&
            filingDate == other.filingDate &&
            period == other.period &&
            periodType == other.periodType &&
            reportedCurrency == other.reportedCurrency &&
            year == other.year &&
            bottomLineNetIncome == other.bottomLineNetIncome &&
            costAndExpenses == other.costAndExpenses &&
            costOfRevenue == other.costOfRevenue &&
            depreciationAndAmortization == other.depreciationAndAmortization &&
            ebit == other.ebit &&
            ebitda == other.ebitda &&
            eps == other.eps &&
            epsDiluted == other.epsDiluted &&
            generalAndAdministrativeExpenses == other.generalAndAdministrativeExpenses &&
            grossProfit == other.grossProfit &&
            incomeBeforeTax == other.incomeBeforeTax &&
            incomeTaxExpense == other.incomeTaxExpense &&
            interestExpense == other.interestExpense &&
            interestIncome == other.interestIncome &&
            netIncome == other.netIncome &&
            netIncomeDeductions == other.netIncomeDeductions &&
            netIncomeFromContinuingOperations == other.netIncomeFromContinuingOperations &&
            netIncomeFromDiscontinuedOperations == other.netIncomeFromDiscontinuedOperations &&
            netInterestIncome == other.netInterestIncome &&
            nonOperatingIncomeExcludingInterest == other.nonOperatingIncomeExcludingInterest &&
            operatingExpenses == other.operatingExpenses &&
            operatingIncome == other.operatingIncome &&
            otherAdjustmentsToNetIncome == other.otherAdjustmentsToNetIncome &&
            otherExpenses == other.otherExpenses &&
            researchAndDevelopmentExpenses == other.researchAndDevelopmentExpenses &&
            revenue == other.revenue &&
            sellingAndMarketingExpenses == other.sellingAndMarketingExpenses &&
            sellingGeneralAndAdministrativeExpenses ==
                other.sellingGeneralAndAdministrativeExpenses &&
            totalOtherIncomeExpensesNet == other.totalOtherIncomeExpensesNet &&
            weightedAverageShsOut == other.weightedAverageShsOut &&
            weightedAverageShsOutDil == other.weightedAverageShsOutDil &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            acceptedDate,
            filingDate,
            period,
            periodType,
            reportedCurrency,
            year,
            bottomLineNetIncome,
            costAndExpenses,
            costOfRevenue,
            depreciationAndAmortization,
            ebit,
            ebitda,
            eps,
            epsDiluted,
            generalAndAdministrativeExpenses,
            grossProfit,
            incomeBeforeTax,
            incomeTaxExpense,
            interestExpense,
            interestIncome,
            netIncome,
            netIncomeDeductions,
            netIncomeFromContinuingOperations,
            netIncomeFromDiscontinuedOperations,
            netInterestIncome,
            nonOperatingIncomeExcludingInterest,
            operatingExpenses,
            operatingIncome,
            otherAdjustmentsToNetIncome,
            otherExpenses,
            researchAndDevelopmentExpenses,
            revenue,
            sellingAndMarketingExpenses,
            sellingGeneralAndAdministrativeExpenses,
            totalOtherIncomeExpensesNet,
            weightedAverageShsOut,
            weightedAverageShsOutDil,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentIncomeStatement{acceptedDate=$acceptedDate, filingDate=$filingDate, period=$period, periodType=$periodType, reportedCurrency=$reportedCurrency, year=$year, bottomLineNetIncome=$bottomLineNetIncome, costAndExpenses=$costAndExpenses, costOfRevenue=$costOfRevenue, depreciationAndAmortization=$depreciationAndAmortization, ebit=$ebit, ebitda=$ebitda, eps=$eps, epsDiluted=$epsDiluted, generalAndAdministrativeExpenses=$generalAndAdministrativeExpenses, grossProfit=$grossProfit, incomeBeforeTax=$incomeBeforeTax, incomeTaxExpense=$incomeTaxExpense, interestExpense=$interestExpense, interestIncome=$interestIncome, netIncome=$netIncome, netIncomeDeductions=$netIncomeDeductions, netIncomeFromContinuingOperations=$netIncomeFromContinuingOperations, netIncomeFromDiscontinuedOperations=$netIncomeFromDiscontinuedOperations, netInterestIncome=$netInterestIncome, nonOperatingIncomeExcludingInterest=$nonOperatingIncomeExcludingInterest, operatingExpenses=$operatingExpenses, operatingIncome=$operatingIncome, otherAdjustmentsToNetIncome=$otherAdjustmentsToNetIncome, otherExpenses=$otherExpenses, researchAndDevelopmentExpenses=$researchAndDevelopmentExpenses, revenue=$revenue, sellingAndMarketingExpenses=$sellingAndMarketingExpenses, sellingGeneralAndAdministrativeExpenses=$sellingGeneralAndAdministrativeExpenses, totalOtherIncomeExpensesNet=$totalOtherIncomeExpensesNet, weightedAverageShsOut=$weightedAverageShsOut, weightedAverageShsOutDil=$weightedAverageShsOutDil, additionalProperties=$additionalProperties}"
}
