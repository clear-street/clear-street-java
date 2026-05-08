// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instrumentdata

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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** A quarterly cash flow statement for an instrument. */
class InstrumentCashFlowStatement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptedDate: JsonField<OffsetDateTime>,
    private val filingDate: JsonField<LocalDate>,
    private val period: JsonField<String>,
    private val periodType: JsonField<FiscalPeriodType>,
    private val reportedCurrency: JsonField<String>,
    private val year: JsonField<Int>,
    private val accountsPayables: JsonField<String>,
    private val accountsReceivables: JsonField<String>,
    private val acquisitionsNet: JsonField<String>,
    private val capitalExpenditure: JsonField<String>,
    private val cashAtBeginningOfPeriod: JsonField<String>,
    private val cashAtEndOfPeriod: JsonField<String>,
    private val changeInWorkingCapital: JsonField<String>,
    private val commonDividendsPaid: JsonField<String>,
    private val commonStockIssuance: JsonField<String>,
    private val commonStockRepurchased: JsonField<String>,
    private val deferredIncomeTax: JsonField<String>,
    private val depreciationAndAmortization: JsonField<String>,
    private val effectOfForexChangesOnCash: JsonField<String>,
    private val freeCashFlow: JsonField<String>,
    private val incomeTaxesPaid: JsonField<String>,
    private val interestPaid: JsonField<String>,
    private val inventory: JsonField<String>,
    private val investmentsInPropertyPlantAndEquipment: JsonField<String>,
    private val longTermNetDebtIssuance: JsonField<String>,
    private val netCashProvidedByFinancingActivities: JsonField<String>,
    private val netCashProvidedByInvestingActivities: JsonField<String>,
    private val netCashProvidedByOperatingActivities: JsonField<String>,
    private val netChangeInCash: JsonField<String>,
    private val netCommonStockIssuance: JsonField<String>,
    private val netDebtIssuance: JsonField<String>,
    private val netDividendsPaid: JsonField<String>,
    private val netIncome: JsonField<String>,
    private val netPreferredStockIssuance: JsonField<String>,
    private val netStockIssuance: JsonField<String>,
    private val operatingCashFlow: JsonField<String>,
    private val otherFinancingActivities: JsonField<String>,
    private val otherInvestingActivities: JsonField<String>,
    private val otherNonCashItems: JsonField<String>,
    private val otherWorkingCapital: JsonField<String>,
    private val preferredDividendsPaid: JsonField<String>,
    private val purchasesOfInvestments: JsonField<String>,
    private val salesMaturitiesOfInvestments: JsonField<String>,
    private val shortTermNetDebtIssuance: JsonField<String>,
    private val stockBasedCompensation: JsonField<String>,
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
        @JsonProperty("accounts_payables")
        @ExcludeMissing
        accountsPayables: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accounts_receivables")
        @ExcludeMissing
        accountsReceivables: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acquisitions_net")
        @ExcludeMissing
        acquisitionsNet: JsonField<String> = JsonMissing.of(),
        @JsonProperty("capital_expenditure")
        @ExcludeMissing
        capitalExpenditure: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cash_at_beginning_of_period")
        @ExcludeMissing
        cashAtBeginningOfPeriod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cash_at_end_of_period")
        @ExcludeMissing
        cashAtEndOfPeriod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("change_in_working_capital")
        @ExcludeMissing
        changeInWorkingCapital: JsonField<String> = JsonMissing.of(),
        @JsonProperty("common_dividends_paid")
        @ExcludeMissing
        commonDividendsPaid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("common_stock_issuance")
        @ExcludeMissing
        commonStockIssuance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("common_stock_repurchased")
        @ExcludeMissing
        commonStockRepurchased: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deferred_income_tax")
        @ExcludeMissing
        deferredIncomeTax: JsonField<String> = JsonMissing.of(),
        @JsonProperty("depreciation_and_amortization")
        @ExcludeMissing
        depreciationAndAmortization: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effect_of_forex_changes_on_cash")
        @ExcludeMissing
        effectOfForexChangesOnCash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("free_cash_flow")
        @ExcludeMissing
        freeCashFlow: JsonField<String> = JsonMissing.of(),
        @JsonProperty("income_taxes_paid")
        @ExcludeMissing
        incomeTaxesPaid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("interest_paid")
        @ExcludeMissing
        interestPaid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inventory") @ExcludeMissing inventory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("investments_in_property_plant_and_equipment")
        @ExcludeMissing
        investmentsInPropertyPlantAndEquipment: JsonField<String> = JsonMissing.of(),
        @JsonProperty("long_term_net_debt_issuance")
        @ExcludeMissing
        longTermNetDebtIssuance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_cash_provided_by_financing_activities")
        @ExcludeMissing
        netCashProvidedByFinancingActivities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_cash_provided_by_investing_activities")
        @ExcludeMissing
        netCashProvidedByInvestingActivities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_cash_provided_by_operating_activities")
        @ExcludeMissing
        netCashProvidedByOperatingActivities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_change_in_cash")
        @ExcludeMissing
        netChangeInCash: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_common_stock_issuance")
        @ExcludeMissing
        netCommonStockIssuance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_debt_issuance")
        @ExcludeMissing
        netDebtIssuance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_dividends_paid")
        @ExcludeMissing
        netDividendsPaid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_income") @ExcludeMissing netIncome: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_preferred_stock_issuance")
        @ExcludeMissing
        netPreferredStockIssuance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_stock_issuance")
        @ExcludeMissing
        netStockIssuance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("operating_cash_flow")
        @ExcludeMissing
        operatingCashFlow: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_financing_activities")
        @ExcludeMissing
        otherFinancingActivities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_investing_activities")
        @ExcludeMissing
        otherInvestingActivities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_non_cash_items")
        @ExcludeMissing
        otherNonCashItems: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_working_capital")
        @ExcludeMissing
        otherWorkingCapital: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preferred_dividends_paid")
        @ExcludeMissing
        preferredDividendsPaid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purchases_of_investments")
        @ExcludeMissing
        purchasesOfInvestments: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sales_maturities_of_investments")
        @ExcludeMissing
        salesMaturitiesOfInvestments: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_term_net_debt_issuance")
        @ExcludeMissing
        shortTermNetDebtIssuance: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stock_based_compensation")
        @ExcludeMissing
        stockBasedCompensation: JsonField<String> = JsonMissing.of(),
    ) : this(
        acceptedDate,
        filingDate,
        period,
        periodType,
        reportedCurrency,
        year,
        accountsPayables,
        accountsReceivables,
        acquisitionsNet,
        capitalExpenditure,
        cashAtBeginningOfPeriod,
        cashAtEndOfPeriod,
        changeInWorkingCapital,
        commonDividendsPaid,
        commonStockIssuance,
        commonStockRepurchased,
        deferredIncomeTax,
        depreciationAndAmortization,
        effectOfForexChangesOnCash,
        freeCashFlow,
        incomeTaxesPaid,
        interestPaid,
        inventory,
        investmentsInPropertyPlantAndEquipment,
        longTermNetDebtIssuance,
        netCashProvidedByFinancingActivities,
        netCashProvidedByInvestingActivities,
        netCashProvidedByOperatingActivities,
        netChangeInCash,
        netCommonStockIssuance,
        netDebtIssuance,
        netDividendsPaid,
        netIncome,
        netPreferredStockIssuance,
        netStockIssuance,
        operatingCashFlow,
        otherFinancingActivities,
        otherInvestingActivities,
        otherNonCashItems,
        otherWorkingCapital,
        preferredDividendsPaid,
        purchasesOfInvestments,
        salesMaturitiesOfInvestments,
        shortTermNetDebtIssuance,
        stockBasedCompensation,
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
     * Change in accounts payables
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountsPayables(): Optional<String> = accountsPayables.getOptional("accounts_payables")

    /**
     * Change in accounts receivables
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountsReceivables(): Optional<String> =
        accountsReceivables.getOptional("accounts_receivables")

    /**
     * Net acquisitions
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acquisitionsNet(): Optional<String> = acquisitionsNet.getOptional("acquisitions_net")

    /**
     * Capital expenditure
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun capitalExpenditure(): Optional<String> =
        capitalExpenditure.getOptional("capital_expenditure")

    /**
     * Cash and cash equivalents at beginning of period
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cashAtBeginningOfPeriod(): Optional<String> =
        cashAtBeginningOfPeriod.getOptional("cash_at_beginning_of_period")

    /**
     * Cash and cash equivalents at end of period
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cashAtEndOfPeriod(): Optional<String> =
        cashAtEndOfPeriod.getOptional("cash_at_end_of_period")

    /**
     * Change in working capital
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun changeInWorkingCapital(): Optional<String> =
        changeInWorkingCapital.getOptional("change_in_working_capital")

    /**
     * Common dividends paid
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commonDividendsPaid(): Optional<String> =
        commonDividendsPaid.getOptional("common_dividends_paid")

    /**
     * Common stock issuance
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commonStockIssuance(): Optional<String> =
        commonStockIssuance.getOptional("common_stock_issuance")

    /**
     * Common stock repurchased (buybacks)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commonStockRepurchased(): Optional<String> =
        commonStockRepurchased.getOptional("common_stock_repurchased")

    /**
     * Deferred income tax expense
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deferredIncomeTax(): Optional<String> = deferredIncomeTax.getOptional("deferred_income_tax")

    /**
     * Depreciation and amortization expense
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun depreciationAndAmortization(): Optional<String> =
        depreciationAndAmortization.getOptional("depreciation_and_amortization")

    /**
     * Effect of foreign exchange changes on cash
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun effectOfForexChangesOnCash(): Optional<String> =
        effectOfForexChangesOnCash.getOptional("effect_of_forex_changes_on_cash")

    /**
     * Free cash flow (operating cash flow minus capital expenditure)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun freeCashFlow(): Optional<String> = freeCashFlow.getOptional("free_cash_flow")

    /**
     * Income taxes paid
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun incomeTaxesPaid(): Optional<String> = incomeTaxesPaid.getOptional("income_taxes_paid")

    /**
     * Interest paid
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun interestPaid(): Optional<String> = interestPaid.getOptional("interest_paid")

    /**
     * Change in inventory
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inventory(): Optional<String> = inventory.getOptional("inventory")

    /**
     * Investments in property, plant, and equipment
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun investmentsInPropertyPlantAndEquipment(): Optional<String> =
        investmentsInPropertyPlantAndEquipment.getOptional(
            "investments_in_property_plant_and_equipment"
        )

    /**
     * Long-term net debt issuance
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun longTermNetDebtIssuance(): Optional<String> =
        longTermNetDebtIssuance.getOptional("long_term_net_debt_issuance")

    /**
     * Net cash provided by financing activities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netCashProvidedByFinancingActivities(): Optional<String> =
        netCashProvidedByFinancingActivities.getOptional(
            "net_cash_provided_by_financing_activities"
        )

    /**
     * Net cash provided by investing activities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netCashProvidedByInvestingActivities(): Optional<String> =
        netCashProvidedByInvestingActivities.getOptional(
            "net_cash_provided_by_investing_activities"
        )

    /**
     * Net cash provided by operating activities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netCashProvidedByOperatingActivities(): Optional<String> =
        netCashProvidedByOperatingActivities.getOptional(
            "net_cash_provided_by_operating_activities"
        )

    /**
     * Net change in cash during the period
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netChangeInCash(): Optional<String> = netChangeInCash.getOptional("net_change_in_cash")

    /**
     * Net common stock issuance
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netCommonStockIssuance(): Optional<String> =
        netCommonStockIssuance.getOptional("net_common_stock_issuance")

    /**
     * Net debt issuance (long-term + short-term)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netDebtIssuance(): Optional<String> = netDebtIssuance.getOptional("net_debt_issuance")

    /**
     * Net dividends paid (common + preferred)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netDividendsPaid(): Optional<String> = netDividendsPaid.getOptional("net_dividends_paid")

    /**
     * Net income for the period
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netIncome(): Optional<String> = netIncome.getOptional("net_income")

    /**
     * Net preferred stock issuance
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netPreferredStockIssuance(): Optional<String> =
        netPreferredStockIssuance.getOptional("net_preferred_stock_issuance")

    /**
     * Net stock issuance (common + preferred)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netStockIssuance(): Optional<String> = netStockIssuance.getOptional("net_stock_issuance")

    /**
     * Operating cash flow (alternative calculation)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun operatingCashFlow(): Optional<String> = operatingCashFlow.getOptional("operating_cash_flow")

    /**
     * Other financing activities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherFinancingActivities(): Optional<String> =
        otherFinancingActivities.getOptional("other_financing_activities")

    /**
     * Other investing activities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherInvestingActivities(): Optional<String> =
        otherInvestingActivities.getOptional("other_investing_activities")

    /**
     * Other non-cash items
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherNonCashItems(): Optional<String> =
        otherNonCashItems.getOptional("other_non_cash_items")

    /**
     * Change in other working capital
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherWorkingCapital(): Optional<String> =
        otherWorkingCapital.getOptional("other_working_capital")

    /**
     * Preferred dividends paid
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferredDividendsPaid(): Optional<String> =
        preferredDividendsPaid.getOptional("preferred_dividends_paid")

    /**
     * Purchases of investments
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun purchasesOfInvestments(): Optional<String> =
        purchasesOfInvestments.getOptional("purchases_of_investments")

    /**
     * Sales and maturities of investments
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun salesMaturitiesOfInvestments(): Optional<String> =
        salesMaturitiesOfInvestments.getOptional("sales_maturities_of_investments")

    /**
     * Short-term net debt issuance
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shortTermNetDebtIssuance(): Optional<String> =
        shortTermNetDebtIssuance.getOptional("short_term_net_debt_issuance")

    /**
     * Stock-based compensation expense
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stockBasedCompensation(): Optional<String> =
        stockBasedCompensation.getOptional("stock_based_compensation")

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
     * Returns the raw JSON value of [accountsPayables].
     *
     * Unlike [accountsPayables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accounts_payables")
    @ExcludeMissing
    fun _accountsPayables(): JsonField<String> = accountsPayables

    /**
     * Returns the raw JSON value of [accountsReceivables].
     *
     * Unlike [accountsReceivables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accounts_receivables")
    @ExcludeMissing
    fun _accountsReceivables(): JsonField<String> = accountsReceivables

    /**
     * Returns the raw JSON value of [acquisitionsNet].
     *
     * Unlike [acquisitionsNet], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acquisitions_net")
    @ExcludeMissing
    fun _acquisitionsNet(): JsonField<String> = acquisitionsNet

    /**
     * Returns the raw JSON value of [capitalExpenditure].
     *
     * Unlike [capitalExpenditure], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("capital_expenditure")
    @ExcludeMissing
    fun _capitalExpenditure(): JsonField<String> = capitalExpenditure

    /**
     * Returns the raw JSON value of [cashAtBeginningOfPeriod].
     *
     * Unlike [cashAtBeginningOfPeriod], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cash_at_beginning_of_period")
    @ExcludeMissing
    fun _cashAtBeginningOfPeriod(): JsonField<String> = cashAtBeginningOfPeriod

    /**
     * Returns the raw JSON value of [cashAtEndOfPeriod].
     *
     * Unlike [cashAtEndOfPeriod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cash_at_end_of_period")
    @ExcludeMissing
    fun _cashAtEndOfPeriod(): JsonField<String> = cashAtEndOfPeriod

    /**
     * Returns the raw JSON value of [changeInWorkingCapital].
     *
     * Unlike [changeInWorkingCapital], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("change_in_working_capital")
    @ExcludeMissing
    fun _changeInWorkingCapital(): JsonField<String> = changeInWorkingCapital

    /**
     * Returns the raw JSON value of [commonDividendsPaid].
     *
     * Unlike [commonDividendsPaid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("common_dividends_paid")
    @ExcludeMissing
    fun _commonDividendsPaid(): JsonField<String> = commonDividendsPaid

    /**
     * Returns the raw JSON value of [commonStockIssuance].
     *
     * Unlike [commonStockIssuance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("common_stock_issuance")
    @ExcludeMissing
    fun _commonStockIssuance(): JsonField<String> = commonStockIssuance

    /**
     * Returns the raw JSON value of [commonStockRepurchased].
     *
     * Unlike [commonStockRepurchased], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("common_stock_repurchased")
    @ExcludeMissing
    fun _commonStockRepurchased(): JsonField<String> = commonStockRepurchased

    /**
     * Returns the raw JSON value of [deferredIncomeTax].
     *
     * Unlike [deferredIncomeTax], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("deferred_income_tax")
    @ExcludeMissing
    fun _deferredIncomeTax(): JsonField<String> = deferredIncomeTax

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
     * Returns the raw JSON value of [effectOfForexChangesOnCash].
     *
     * Unlike [effectOfForexChangesOnCash], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("effect_of_forex_changes_on_cash")
    @ExcludeMissing
    fun _effectOfForexChangesOnCash(): JsonField<String> = effectOfForexChangesOnCash

    /**
     * Returns the raw JSON value of [freeCashFlow].
     *
     * Unlike [freeCashFlow], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("free_cash_flow")
    @ExcludeMissing
    fun _freeCashFlow(): JsonField<String> = freeCashFlow

    /**
     * Returns the raw JSON value of [incomeTaxesPaid].
     *
     * Unlike [incomeTaxesPaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("income_taxes_paid")
    @ExcludeMissing
    fun _incomeTaxesPaid(): JsonField<String> = incomeTaxesPaid

    /**
     * Returns the raw JSON value of [interestPaid].
     *
     * Unlike [interestPaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("interest_paid")
    @ExcludeMissing
    fun _interestPaid(): JsonField<String> = interestPaid

    /**
     * Returns the raw JSON value of [inventory].
     *
     * Unlike [inventory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inventory") @ExcludeMissing fun _inventory(): JsonField<String> = inventory

    /**
     * Returns the raw JSON value of [investmentsInPropertyPlantAndEquipment].
     *
     * Unlike [investmentsInPropertyPlantAndEquipment], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("investments_in_property_plant_and_equipment")
    @ExcludeMissing
    fun _investmentsInPropertyPlantAndEquipment(): JsonField<String> =
        investmentsInPropertyPlantAndEquipment

    /**
     * Returns the raw JSON value of [longTermNetDebtIssuance].
     *
     * Unlike [longTermNetDebtIssuance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("long_term_net_debt_issuance")
    @ExcludeMissing
    fun _longTermNetDebtIssuance(): JsonField<String> = longTermNetDebtIssuance

    /**
     * Returns the raw JSON value of [netCashProvidedByFinancingActivities].
     *
     * Unlike [netCashProvidedByFinancingActivities], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("net_cash_provided_by_financing_activities")
    @ExcludeMissing
    fun _netCashProvidedByFinancingActivities(): JsonField<String> =
        netCashProvidedByFinancingActivities

    /**
     * Returns the raw JSON value of [netCashProvidedByInvestingActivities].
     *
     * Unlike [netCashProvidedByInvestingActivities], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("net_cash_provided_by_investing_activities")
    @ExcludeMissing
    fun _netCashProvidedByInvestingActivities(): JsonField<String> =
        netCashProvidedByInvestingActivities

    /**
     * Returns the raw JSON value of [netCashProvidedByOperatingActivities].
     *
     * Unlike [netCashProvidedByOperatingActivities], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("net_cash_provided_by_operating_activities")
    @ExcludeMissing
    fun _netCashProvidedByOperatingActivities(): JsonField<String> =
        netCashProvidedByOperatingActivities

    /**
     * Returns the raw JSON value of [netChangeInCash].
     *
     * Unlike [netChangeInCash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_change_in_cash")
    @ExcludeMissing
    fun _netChangeInCash(): JsonField<String> = netChangeInCash

    /**
     * Returns the raw JSON value of [netCommonStockIssuance].
     *
     * Unlike [netCommonStockIssuance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("net_common_stock_issuance")
    @ExcludeMissing
    fun _netCommonStockIssuance(): JsonField<String> = netCommonStockIssuance

    /**
     * Returns the raw JSON value of [netDebtIssuance].
     *
     * Unlike [netDebtIssuance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_debt_issuance")
    @ExcludeMissing
    fun _netDebtIssuance(): JsonField<String> = netDebtIssuance

    /**
     * Returns the raw JSON value of [netDividendsPaid].
     *
     * Unlike [netDividendsPaid], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("net_dividends_paid")
    @ExcludeMissing
    fun _netDividendsPaid(): JsonField<String> = netDividendsPaid

    /**
     * Returns the raw JSON value of [netIncome].
     *
     * Unlike [netIncome], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_income") @ExcludeMissing fun _netIncome(): JsonField<String> = netIncome

    /**
     * Returns the raw JSON value of [netPreferredStockIssuance].
     *
     * Unlike [netPreferredStockIssuance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("net_preferred_stock_issuance")
    @ExcludeMissing
    fun _netPreferredStockIssuance(): JsonField<String> = netPreferredStockIssuance

    /**
     * Returns the raw JSON value of [netStockIssuance].
     *
     * Unlike [netStockIssuance], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("net_stock_issuance")
    @ExcludeMissing
    fun _netStockIssuance(): JsonField<String> = netStockIssuance

    /**
     * Returns the raw JSON value of [operatingCashFlow].
     *
     * Unlike [operatingCashFlow], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("operating_cash_flow")
    @ExcludeMissing
    fun _operatingCashFlow(): JsonField<String> = operatingCashFlow

    /**
     * Returns the raw JSON value of [otherFinancingActivities].
     *
     * Unlike [otherFinancingActivities], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("other_financing_activities")
    @ExcludeMissing
    fun _otherFinancingActivities(): JsonField<String> = otherFinancingActivities

    /**
     * Returns the raw JSON value of [otherInvestingActivities].
     *
     * Unlike [otherInvestingActivities], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("other_investing_activities")
    @ExcludeMissing
    fun _otherInvestingActivities(): JsonField<String> = otherInvestingActivities

    /**
     * Returns the raw JSON value of [otherNonCashItems].
     *
     * Unlike [otherNonCashItems], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("other_non_cash_items")
    @ExcludeMissing
    fun _otherNonCashItems(): JsonField<String> = otherNonCashItems

    /**
     * Returns the raw JSON value of [otherWorkingCapital].
     *
     * Unlike [otherWorkingCapital], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("other_working_capital")
    @ExcludeMissing
    fun _otherWorkingCapital(): JsonField<String> = otherWorkingCapital

    /**
     * Returns the raw JSON value of [preferredDividendsPaid].
     *
     * Unlike [preferredDividendsPaid], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("preferred_dividends_paid")
    @ExcludeMissing
    fun _preferredDividendsPaid(): JsonField<String> = preferredDividendsPaid

    /**
     * Returns the raw JSON value of [purchasesOfInvestments].
     *
     * Unlike [purchasesOfInvestments], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("purchases_of_investments")
    @ExcludeMissing
    fun _purchasesOfInvestments(): JsonField<String> = purchasesOfInvestments

    /**
     * Returns the raw JSON value of [salesMaturitiesOfInvestments].
     *
     * Unlike [salesMaturitiesOfInvestments], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("sales_maturities_of_investments")
    @ExcludeMissing
    fun _salesMaturitiesOfInvestments(): JsonField<String> = salesMaturitiesOfInvestments

    /**
     * Returns the raw JSON value of [shortTermNetDebtIssuance].
     *
     * Unlike [shortTermNetDebtIssuance], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("short_term_net_debt_issuance")
    @ExcludeMissing
    fun _shortTermNetDebtIssuance(): JsonField<String> = shortTermNetDebtIssuance

    /**
     * Returns the raw JSON value of [stockBasedCompensation].
     *
     * Unlike [stockBasedCompensation], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("stock_based_compensation")
    @ExcludeMissing
    fun _stockBasedCompensation(): JsonField<String> = stockBasedCompensation

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
         * Returns a mutable builder for constructing an instance of [InstrumentCashFlowStatement].
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

    /** A builder for [InstrumentCashFlowStatement]. */
    class Builder internal constructor() {

        private var acceptedDate: JsonField<OffsetDateTime>? = null
        private var filingDate: JsonField<LocalDate>? = null
        private var period: JsonField<String>? = null
        private var periodType: JsonField<FiscalPeriodType>? = null
        private var reportedCurrency: JsonField<String>? = null
        private var year: JsonField<Int>? = null
        private var accountsPayables: JsonField<String> = JsonMissing.of()
        private var accountsReceivables: JsonField<String> = JsonMissing.of()
        private var acquisitionsNet: JsonField<String> = JsonMissing.of()
        private var capitalExpenditure: JsonField<String> = JsonMissing.of()
        private var cashAtBeginningOfPeriod: JsonField<String> = JsonMissing.of()
        private var cashAtEndOfPeriod: JsonField<String> = JsonMissing.of()
        private var changeInWorkingCapital: JsonField<String> = JsonMissing.of()
        private var commonDividendsPaid: JsonField<String> = JsonMissing.of()
        private var commonStockIssuance: JsonField<String> = JsonMissing.of()
        private var commonStockRepurchased: JsonField<String> = JsonMissing.of()
        private var deferredIncomeTax: JsonField<String> = JsonMissing.of()
        private var depreciationAndAmortization: JsonField<String> = JsonMissing.of()
        private var effectOfForexChangesOnCash: JsonField<String> = JsonMissing.of()
        private var freeCashFlow: JsonField<String> = JsonMissing.of()
        private var incomeTaxesPaid: JsonField<String> = JsonMissing.of()
        private var interestPaid: JsonField<String> = JsonMissing.of()
        private var inventory: JsonField<String> = JsonMissing.of()
        private var investmentsInPropertyPlantAndEquipment: JsonField<String> = JsonMissing.of()
        private var longTermNetDebtIssuance: JsonField<String> = JsonMissing.of()
        private var netCashProvidedByFinancingActivities: JsonField<String> = JsonMissing.of()
        private var netCashProvidedByInvestingActivities: JsonField<String> = JsonMissing.of()
        private var netCashProvidedByOperatingActivities: JsonField<String> = JsonMissing.of()
        private var netChangeInCash: JsonField<String> = JsonMissing.of()
        private var netCommonStockIssuance: JsonField<String> = JsonMissing.of()
        private var netDebtIssuance: JsonField<String> = JsonMissing.of()
        private var netDividendsPaid: JsonField<String> = JsonMissing.of()
        private var netIncome: JsonField<String> = JsonMissing.of()
        private var netPreferredStockIssuance: JsonField<String> = JsonMissing.of()
        private var netStockIssuance: JsonField<String> = JsonMissing.of()
        private var operatingCashFlow: JsonField<String> = JsonMissing.of()
        private var otherFinancingActivities: JsonField<String> = JsonMissing.of()
        private var otherInvestingActivities: JsonField<String> = JsonMissing.of()
        private var otherNonCashItems: JsonField<String> = JsonMissing.of()
        private var otherWorkingCapital: JsonField<String> = JsonMissing.of()
        private var preferredDividendsPaid: JsonField<String> = JsonMissing.of()
        private var purchasesOfInvestments: JsonField<String> = JsonMissing.of()
        private var salesMaturitiesOfInvestments: JsonField<String> = JsonMissing.of()
        private var shortTermNetDebtIssuance: JsonField<String> = JsonMissing.of()
        private var stockBasedCompensation: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentCashFlowStatement: InstrumentCashFlowStatement) = apply {
            acceptedDate = instrumentCashFlowStatement.acceptedDate
            filingDate = instrumentCashFlowStatement.filingDate
            period = instrumentCashFlowStatement.period
            periodType = instrumentCashFlowStatement.periodType
            reportedCurrency = instrumentCashFlowStatement.reportedCurrency
            year = instrumentCashFlowStatement.year
            accountsPayables = instrumentCashFlowStatement.accountsPayables
            accountsReceivables = instrumentCashFlowStatement.accountsReceivables
            acquisitionsNet = instrumentCashFlowStatement.acquisitionsNet
            capitalExpenditure = instrumentCashFlowStatement.capitalExpenditure
            cashAtBeginningOfPeriod = instrumentCashFlowStatement.cashAtBeginningOfPeriod
            cashAtEndOfPeriod = instrumentCashFlowStatement.cashAtEndOfPeriod
            changeInWorkingCapital = instrumentCashFlowStatement.changeInWorkingCapital
            commonDividendsPaid = instrumentCashFlowStatement.commonDividendsPaid
            commonStockIssuance = instrumentCashFlowStatement.commonStockIssuance
            commonStockRepurchased = instrumentCashFlowStatement.commonStockRepurchased
            deferredIncomeTax = instrumentCashFlowStatement.deferredIncomeTax
            depreciationAndAmortization = instrumentCashFlowStatement.depreciationAndAmortization
            effectOfForexChangesOnCash = instrumentCashFlowStatement.effectOfForexChangesOnCash
            freeCashFlow = instrumentCashFlowStatement.freeCashFlow
            incomeTaxesPaid = instrumentCashFlowStatement.incomeTaxesPaid
            interestPaid = instrumentCashFlowStatement.interestPaid
            inventory = instrumentCashFlowStatement.inventory
            investmentsInPropertyPlantAndEquipment =
                instrumentCashFlowStatement.investmentsInPropertyPlantAndEquipment
            longTermNetDebtIssuance = instrumentCashFlowStatement.longTermNetDebtIssuance
            netCashProvidedByFinancingActivities =
                instrumentCashFlowStatement.netCashProvidedByFinancingActivities
            netCashProvidedByInvestingActivities =
                instrumentCashFlowStatement.netCashProvidedByInvestingActivities
            netCashProvidedByOperatingActivities =
                instrumentCashFlowStatement.netCashProvidedByOperatingActivities
            netChangeInCash = instrumentCashFlowStatement.netChangeInCash
            netCommonStockIssuance = instrumentCashFlowStatement.netCommonStockIssuance
            netDebtIssuance = instrumentCashFlowStatement.netDebtIssuance
            netDividendsPaid = instrumentCashFlowStatement.netDividendsPaid
            netIncome = instrumentCashFlowStatement.netIncome
            netPreferredStockIssuance = instrumentCashFlowStatement.netPreferredStockIssuance
            netStockIssuance = instrumentCashFlowStatement.netStockIssuance
            operatingCashFlow = instrumentCashFlowStatement.operatingCashFlow
            otherFinancingActivities = instrumentCashFlowStatement.otherFinancingActivities
            otherInvestingActivities = instrumentCashFlowStatement.otherInvestingActivities
            otherNonCashItems = instrumentCashFlowStatement.otherNonCashItems
            otherWorkingCapital = instrumentCashFlowStatement.otherWorkingCapital
            preferredDividendsPaid = instrumentCashFlowStatement.preferredDividendsPaid
            purchasesOfInvestments = instrumentCashFlowStatement.purchasesOfInvestments
            salesMaturitiesOfInvestments = instrumentCashFlowStatement.salesMaturitiesOfInvestments
            shortTermNetDebtIssuance = instrumentCashFlowStatement.shortTermNetDebtIssuance
            stockBasedCompensation = instrumentCashFlowStatement.stockBasedCompensation
            additionalProperties = instrumentCashFlowStatement.additionalProperties.toMutableMap()
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

        /** Change in accounts payables */
        fun accountsPayables(accountsPayables: String?) =
            accountsPayables(JsonField.ofNullable(accountsPayables))

        /** Alias for calling [Builder.accountsPayables] with `accountsPayables.orElse(null)`. */
        fun accountsPayables(accountsPayables: Optional<String>) =
            accountsPayables(accountsPayables.getOrNull())

        /**
         * Sets [Builder.accountsPayables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountsPayables] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountsPayables(accountsPayables: JsonField<String>) = apply {
            this.accountsPayables = accountsPayables
        }

        /** Change in accounts receivables */
        fun accountsReceivables(accountsReceivables: String?) =
            accountsReceivables(JsonField.ofNullable(accountsReceivables))

        /**
         * Alias for calling [Builder.accountsReceivables] with `accountsReceivables.orElse(null)`.
         */
        fun accountsReceivables(accountsReceivables: Optional<String>) =
            accountsReceivables(accountsReceivables.getOrNull())

        /**
         * Sets [Builder.accountsReceivables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountsReceivables] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountsReceivables(accountsReceivables: JsonField<String>) = apply {
            this.accountsReceivables = accountsReceivables
        }

        /** Net acquisitions */
        fun acquisitionsNet(acquisitionsNet: String?) =
            acquisitionsNet(JsonField.ofNullable(acquisitionsNet))

        /** Alias for calling [Builder.acquisitionsNet] with `acquisitionsNet.orElse(null)`. */
        fun acquisitionsNet(acquisitionsNet: Optional<String>) =
            acquisitionsNet(acquisitionsNet.getOrNull())

        /**
         * Sets [Builder.acquisitionsNet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acquisitionsNet] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acquisitionsNet(acquisitionsNet: JsonField<String>) = apply {
            this.acquisitionsNet = acquisitionsNet
        }

        /** Capital expenditure */
        fun capitalExpenditure(capitalExpenditure: String?) =
            capitalExpenditure(JsonField.ofNullable(capitalExpenditure))

        /**
         * Alias for calling [Builder.capitalExpenditure] with `capitalExpenditure.orElse(null)`.
         */
        fun capitalExpenditure(capitalExpenditure: Optional<String>) =
            capitalExpenditure(capitalExpenditure.getOrNull())

        /**
         * Sets [Builder.capitalExpenditure] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capitalExpenditure] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun capitalExpenditure(capitalExpenditure: JsonField<String>) = apply {
            this.capitalExpenditure = capitalExpenditure
        }

        /** Cash and cash equivalents at beginning of period */
        fun cashAtBeginningOfPeriod(cashAtBeginningOfPeriod: String?) =
            cashAtBeginningOfPeriod(JsonField.ofNullable(cashAtBeginningOfPeriod))

        /**
         * Alias for calling [Builder.cashAtBeginningOfPeriod] with
         * `cashAtBeginningOfPeriod.orElse(null)`.
         */
        fun cashAtBeginningOfPeriod(cashAtBeginningOfPeriod: Optional<String>) =
            cashAtBeginningOfPeriod(cashAtBeginningOfPeriod.getOrNull())

        /**
         * Sets [Builder.cashAtBeginningOfPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cashAtBeginningOfPeriod] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cashAtBeginningOfPeriod(cashAtBeginningOfPeriod: JsonField<String>) = apply {
            this.cashAtBeginningOfPeriod = cashAtBeginningOfPeriod
        }

        /** Cash and cash equivalents at end of period */
        fun cashAtEndOfPeriod(cashAtEndOfPeriod: String?) =
            cashAtEndOfPeriod(JsonField.ofNullable(cashAtEndOfPeriod))

        /** Alias for calling [Builder.cashAtEndOfPeriod] with `cashAtEndOfPeriod.orElse(null)`. */
        fun cashAtEndOfPeriod(cashAtEndOfPeriod: Optional<String>) =
            cashAtEndOfPeriod(cashAtEndOfPeriod.getOrNull())

        /**
         * Sets [Builder.cashAtEndOfPeriod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cashAtEndOfPeriod] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cashAtEndOfPeriod(cashAtEndOfPeriod: JsonField<String>) = apply {
            this.cashAtEndOfPeriod = cashAtEndOfPeriod
        }

        /** Change in working capital */
        fun changeInWorkingCapital(changeInWorkingCapital: String?) =
            changeInWorkingCapital(JsonField.ofNullable(changeInWorkingCapital))

        /**
         * Alias for calling [Builder.changeInWorkingCapital] with
         * `changeInWorkingCapital.orElse(null)`.
         */
        fun changeInWorkingCapital(changeInWorkingCapital: Optional<String>) =
            changeInWorkingCapital(changeInWorkingCapital.getOrNull())

        /**
         * Sets [Builder.changeInWorkingCapital] to an arbitrary JSON value.
         *
         * You should usually call [Builder.changeInWorkingCapital] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun changeInWorkingCapital(changeInWorkingCapital: JsonField<String>) = apply {
            this.changeInWorkingCapital = changeInWorkingCapital
        }

        /** Common dividends paid */
        fun commonDividendsPaid(commonDividendsPaid: String?) =
            commonDividendsPaid(JsonField.ofNullable(commonDividendsPaid))

        /**
         * Alias for calling [Builder.commonDividendsPaid] with `commonDividendsPaid.orElse(null)`.
         */
        fun commonDividendsPaid(commonDividendsPaid: Optional<String>) =
            commonDividendsPaid(commonDividendsPaid.getOrNull())

        /**
         * Sets [Builder.commonDividendsPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commonDividendsPaid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commonDividendsPaid(commonDividendsPaid: JsonField<String>) = apply {
            this.commonDividendsPaid = commonDividendsPaid
        }

        /** Common stock issuance */
        fun commonStockIssuance(commonStockIssuance: String?) =
            commonStockIssuance(JsonField.ofNullable(commonStockIssuance))

        /**
         * Alias for calling [Builder.commonStockIssuance] with `commonStockIssuance.orElse(null)`.
         */
        fun commonStockIssuance(commonStockIssuance: Optional<String>) =
            commonStockIssuance(commonStockIssuance.getOrNull())

        /**
         * Sets [Builder.commonStockIssuance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commonStockIssuance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commonStockIssuance(commonStockIssuance: JsonField<String>) = apply {
            this.commonStockIssuance = commonStockIssuance
        }

        /** Common stock repurchased (buybacks) */
        fun commonStockRepurchased(commonStockRepurchased: String?) =
            commonStockRepurchased(JsonField.ofNullable(commonStockRepurchased))

        /**
         * Alias for calling [Builder.commonStockRepurchased] with
         * `commonStockRepurchased.orElse(null)`.
         */
        fun commonStockRepurchased(commonStockRepurchased: Optional<String>) =
            commonStockRepurchased(commonStockRepurchased.getOrNull())

        /**
         * Sets [Builder.commonStockRepurchased] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commonStockRepurchased] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commonStockRepurchased(commonStockRepurchased: JsonField<String>) = apply {
            this.commonStockRepurchased = commonStockRepurchased
        }

        /** Deferred income tax expense */
        fun deferredIncomeTax(deferredIncomeTax: String?) =
            deferredIncomeTax(JsonField.ofNullable(deferredIncomeTax))

        /** Alias for calling [Builder.deferredIncomeTax] with `deferredIncomeTax.orElse(null)`. */
        fun deferredIncomeTax(deferredIncomeTax: Optional<String>) =
            deferredIncomeTax(deferredIncomeTax.getOrNull())

        /**
         * Sets [Builder.deferredIncomeTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deferredIncomeTax] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deferredIncomeTax(deferredIncomeTax: JsonField<String>) = apply {
            this.deferredIncomeTax = deferredIncomeTax
        }

        /** Depreciation and amortization expense */
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

        /** Effect of foreign exchange changes on cash */
        fun effectOfForexChangesOnCash(effectOfForexChangesOnCash: String?) =
            effectOfForexChangesOnCash(JsonField.ofNullable(effectOfForexChangesOnCash))

        /**
         * Alias for calling [Builder.effectOfForexChangesOnCash] with
         * `effectOfForexChangesOnCash.orElse(null)`.
         */
        fun effectOfForexChangesOnCash(effectOfForexChangesOnCash: Optional<String>) =
            effectOfForexChangesOnCash(effectOfForexChangesOnCash.getOrNull())

        /**
         * Sets [Builder.effectOfForexChangesOnCash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectOfForexChangesOnCash] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun effectOfForexChangesOnCash(effectOfForexChangesOnCash: JsonField<String>) = apply {
            this.effectOfForexChangesOnCash = effectOfForexChangesOnCash
        }

        /** Free cash flow (operating cash flow minus capital expenditure) */
        fun freeCashFlow(freeCashFlow: String?) = freeCashFlow(JsonField.ofNullable(freeCashFlow))

        /** Alias for calling [Builder.freeCashFlow] with `freeCashFlow.orElse(null)`. */
        fun freeCashFlow(freeCashFlow: Optional<String>) = freeCashFlow(freeCashFlow.getOrNull())

        /**
         * Sets [Builder.freeCashFlow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.freeCashFlow] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun freeCashFlow(freeCashFlow: JsonField<String>) = apply {
            this.freeCashFlow = freeCashFlow
        }

        /** Income taxes paid */
        fun incomeTaxesPaid(incomeTaxesPaid: String?) =
            incomeTaxesPaid(JsonField.ofNullable(incomeTaxesPaid))

        /** Alias for calling [Builder.incomeTaxesPaid] with `incomeTaxesPaid.orElse(null)`. */
        fun incomeTaxesPaid(incomeTaxesPaid: Optional<String>) =
            incomeTaxesPaid(incomeTaxesPaid.getOrNull())

        /**
         * Sets [Builder.incomeTaxesPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incomeTaxesPaid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun incomeTaxesPaid(incomeTaxesPaid: JsonField<String>) = apply {
            this.incomeTaxesPaid = incomeTaxesPaid
        }

        /** Interest paid */
        fun interestPaid(interestPaid: String?) = interestPaid(JsonField.ofNullable(interestPaid))

        /** Alias for calling [Builder.interestPaid] with `interestPaid.orElse(null)`. */
        fun interestPaid(interestPaid: Optional<String>) = interestPaid(interestPaid.getOrNull())

        /**
         * Sets [Builder.interestPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.interestPaid] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun interestPaid(interestPaid: JsonField<String>) = apply {
            this.interestPaid = interestPaid
        }

        /** Change in inventory */
        fun inventory(inventory: String?) = inventory(JsonField.ofNullable(inventory))

        /** Alias for calling [Builder.inventory] with `inventory.orElse(null)`. */
        fun inventory(inventory: Optional<String>) = inventory(inventory.getOrNull())

        /**
         * Sets [Builder.inventory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inventory] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inventory(inventory: JsonField<String>) = apply { this.inventory = inventory }

        /** Investments in property, plant, and equipment */
        fun investmentsInPropertyPlantAndEquipment(
            investmentsInPropertyPlantAndEquipment: String?
        ) =
            investmentsInPropertyPlantAndEquipment(
                JsonField.ofNullable(investmentsInPropertyPlantAndEquipment)
            )

        /**
         * Alias for calling [Builder.investmentsInPropertyPlantAndEquipment] with
         * `investmentsInPropertyPlantAndEquipment.orElse(null)`.
         */
        fun investmentsInPropertyPlantAndEquipment(
            investmentsInPropertyPlantAndEquipment: Optional<String>
        ) =
            investmentsInPropertyPlantAndEquipment(
                investmentsInPropertyPlantAndEquipment.getOrNull()
            )

        /**
         * Sets [Builder.investmentsInPropertyPlantAndEquipment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.investmentsInPropertyPlantAndEquipment] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun investmentsInPropertyPlantAndEquipment(
            investmentsInPropertyPlantAndEquipment: JsonField<String>
        ) = apply {
            this.investmentsInPropertyPlantAndEquipment = investmentsInPropertyPlantAndEquipment
        }

        /** Long-term net debt issuance */
        fun longTermNetDebtIssuance(longTermNetDebtIssuance: String?) =
            longTermNetDebtIssuance(JsonField.ofNullable(longTermNetDebtIssuance))

        /**
         * Alias for calling [Builder.longTermNetDebtIssuance] with
         * `longTermNetDebtIssuance.orElse(null)`.
         */
        fun longTermNetDebtIssuance(longTermNetDebtIssuance: Optional<String>) =
            longTermNetDebtIssuance(longTermNetDebtIssuance.getOrNull())

        /**
         * Sets [Builder.longTermNetDebtIssuance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longTermNetDebtIssuance] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun longTermNetDebtIssuance(longTermNetDebtIssuance: JsonField<String>) = apply {
            this.longTermNetDebtIssuance = longTermNetDebtIssuance
        }

        /** Net cash provided by financing activities */
        fun netCashProvidedByFinancingActivities(netCashProvidedByFinancingActivities: String?) =
            netCashProvidedByFinancingActivities(
                JsonField.ofNullable(netCashProvidedByFinancingActivities)
            )

        /**
         * Alias for calling [Builder.netCashProvidedByFinancingActivities] with
         * `netCashProvidedByFinancingActivities.orElse(null)`.
         */
        fun netCashProvidedByFinancingActivities(
            netCashProvidedByFinancingActivities: Optional<String>
        ) = netCashProvidedByFinancingActivities(netCashProvidedByFinancingActivities.getOrNull())

        /**
         * Sets [Builder.netCashProvidedByFinancingActivities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netCashProvidedByFinancingActivities] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun netCashProvidedByFinancingActivities(
            netCashProvidedByFinancingActivities: JsonField<String>
        ) = apply {
            this.netCashProvidedByFinancingActivities = netCashProvidedByFinancingActivities
        }

        /** Net cash provided by investing activities */
        fun netCashProvidedByInvestingActivities(netCashProvidedByInvestingActivities: String?) =
            netCashProvidedByInvestingActivities(
                JsonField.ofNullable(netCashProvidedByInvestingActivities)
            )

        /**
         * Alias for calling [Builder.netCashProvidedByInvestingActivities] with
         * `netCashProvidedByInvestingActivities.orElse(null)`.
         */
        fun netCashProvidedByInvestingActivities(
            netCashProvidedByInvestingActivities: Optional<String>
        ) = netCashProvidedByInvestingActivities(netCashProvidedByInvestingActivities.getOrNull())

        /**
         * Sets [Builder.netCashProvidedByInvestingActivities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netCashProvidedByInvestingActivities] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun netCashProvidedByInvestingActivities(
            netCashProvidedByInvestingActivities: JsonField<String>
        ) = apply {
            this.netCashProvidedByInvestingActivities = netCashProvidedByInvestingActivities
        }

        /** Net cash provided by operating activities */
        fun netCashProvidedByOperatingActivities(netCashProvidedByOperatingActivities: String?) =
            netCashProvidedByOperatingActivities(
                JsonField.ofNullable(netCashProvidedByOperatingActivities)
            )

        /**
         * Alias for calling [Builder.netCashProvidedByOperatingActivities] with
         * `netCashProvidedByOperatingActivities.orElse(null)`.
         */
        fun netCashProvidedByOperatingActivities(
            netCashProvidedByOperatingActivities: Optional<String>
        ) = netCashProvidedByOperatingActivities(netCashProvidedByOperatingActivities.getOrNull())

        /**
         * Sets [Builder.netCashProvidedByOperatingActivities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netCashProvidedByOperatingActivities] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun netCashProvidedByOperatingActivities(
            netCashProvidedByOperatingActivities: JsonField<String>
        ) = apply {
            this.netCashProvidedByOperatingActivities = netCashProvidedByOperatingActivities
        }

        /** Net change in cash during the period */
        fun netChangeInCash(netChangeInCash: String?) =
            netChangeInCash(JsonField.ofNullable(netChangeInCash))

        /** Alias for calling [Builder.netChangeInCash] with `netChangeInCash.orElse(null)`. */
        fun netChangeInCash(netChangeInCash: Optional<String>) =
            netChangeInCash(netChangeInCash.getOrNull())

        /**
         * Sets [Builder.netChangeInCash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netChangeInCash] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netChangeInCash(netChangeInCash: JsonField<String>) = apply {
            this.netChangeInCash = netChangeInCash
        }

        /** Net common stock issuance */
        fun netCommonStockIssuance(netCommonStockIssuance: String?) =
            netCommonStockIssuance(JsonField.ofNullable(netCommonStockIssuance))

        /**
         * Alias for calling [Builder.netCommonStockIssuance] with
         * `netCommonStockIssuance.orElse(null)`.
         */
        fun netCommonStockIssuance(netCommonStockIssuance: Optional<String>) =
            netCommonStockIssuance(netCommonStockIssuance.getOrNull())

        /**
         * Sets [Builder.netCommonStockIssuance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netCommonStockIssuance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netCommonStockIssuance(netCommonStockIssuance: JsonField<String>) = apply {
            this.netCommonStockIssuance = netCommonStockIssuance
        }

        /** Net debt issuance (long-term + short-term) */
        fun netDebtIssuance(netDebtIssuance: String?) =
            netDebtIssuance(JsonField.ofNullable(netDebtIssuance))

        /** Alias for calling [Builder.netDebtIssuance] with `netDebtIssuance.orElse(null)`. */
        fun netDebtIssuance(netDebtIssuance: Optional<String>) =
            netDebtIssuance(netDebtIssuance.getOrNull())

        /**
         * Sets [Builder.netDebtIssuance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netDebtIssuance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netDebtIssuance(netDebtIssuance: JsonField<String>) = apply {
            this.netDebtIssuance = netDebtIssuance
        }

        /** Net dividends paid (common + preferred) */
        fun netDividendsPaid(netDividendsPaid: String?) =
            netDividendsPaid(JsonField.ofNullable(netDividendsPaid))

        /** Alias for calling [Builder.netDividendsPaid] with `netDividendsPaid.orElse(null)`. */
        fun netDividendsPaid(netDividendsPaid: Optional<String>) =
            netDividendsPaid(netDividendsPaid.getOrNull())

        /**
         * Sets [Builder.netDividendsPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netDividendsPaid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netDividendsPaid(netDividendsPaid: JsonField<String>) = apply {
            this.netDividendsPaid = netDividendsPaid
        }

        /** Net income for the period */
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

        /** Net preferred stock issuance */
        fun netPreferredStockIssuance(netPreferredStockIssuance: String?) =
            netPreferredStockIssuance(JsonField.ofNullable(netPreferredStockIssuance))

        /**
         * Alias for calling [Builder.netPreferredStockIssuance] with
         * `netPreferredStockIssuance.orElse(null)`.
         */
        fun netPreferredStockIssuance(netPreferredStockIssuance: Optional<String>) =
            netPreferredStockIssuance(netPreferredStockIssuance.getOrNull())

        /**
         * Sets [Builder.netPreferredStockIssuance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netPreferredStockIssuance] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun netPreferredStockIssuance(netPreferredStockIssuance: JsonField<String>) = apply {
            this.netPreferredStockIssuance = netPreferredStockIssuance
        }

        /** Net stock issuance (common + preferred) */
        fun netStockIssuance(netStockIssuance: String?) =
            netStockIssuance(JsonField.ofNullable(netStockIssuance))

        /** Alias for calling [Builder.netStockIssuance] with `netStockIssuance.orElse(null)`. */
        fun netStockIssuance(netStockIssuance: Optional<String>) =
            netStockIssuance(netStockIssuance.getOrNull())

        /**
         * Sets [Builder.netStockIssuance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netStockIssuance] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netStockIssuance(netStockIssuance: JsonField<String>) = apply {
            this.netStockIssuance = netStockIssuance
        }

        /** Operating cash flow (alternative calculation) */
        fun operatingCashFlow(operatingCashFlow: String?) =
            operatingCashFlow(JsonField.ofNullable(operatingCashFlow))

        /** Alias for calling [Builder.operatingCashFlow] with `operatingCashFlow.orElse(null)`. */
        fun operatingCashFlow(operatingCashFlow: Optional<String>) =
            operatingCashFlow(operatingCashFlow.getOrNull())

        /**
         * Sets [Builder.operatingCashFlow] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operatingCashFlow] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun operatingCashFlow(operatingCashFlow: JsonField<String>) = apply {
            this.operatingCashFlow = operatingCashFlow
        }

        /** Other financing activities */
        fun otherFinancingActivities(otherFinancingActivities: String?) =
            otherFinancingActivities(JsonField.ofNullable(otherFinancingActivities))

        /**
         * Alias for calling [Builder.otherFinancingActivities] with
         * `otherFinancingActivities.orElse(null)`.
         */
        fun otherFinancingActivities(otherFinancingActivities: Optional<String>) =
            otherFinancingActivities(otherFinancingActivities.getOrNull())

        /**
         * Sets [Builder.otherFinancingActivities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherFinancingActivities] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun otherFinancingActivities(otherFinancingActivities: JsonField<String>) = apply {
            this.otherFinancingActivities = otherFinancingActivities
        }

        /** Other investing activities */
        fun otherInvestingActivities(otherInvestingActivities: String?) =
            otherInvestingActivities(JsonField.ofNullable(otherInvestingActivities))

        /**
         * Alias for calling [Builder.otherInvestingActivities] with
         * `otherInvestingActivities.orElse(null)`.
         */
        fun otherInvestingActivities(otherInvestingActivities: Optional<String>) =
            otherInvestingActivities(otherInvestingActivities.getOrNull())

        /**
         * Sets [Builder.otherInvestingActivities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherInvestingActivities] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun otherInvestingActivities(otherInvestingActivities: JsonField<String>) = apply {
            this.otherInvestingActivities = otherInvestingActivities
        }

        /** Other non-cash items */
        fun otherNonCashItems(otherNonCashItems: String?) =
            otherNonCashItems(JsonField.ofNullable(otherNonCashItems))

        /** Alias for calling [Builder.otherNonCashItems] with `otherNonCashItems.orElse(null)`. */
        fun otherNonCashItems(otherNonCashItems: Optional<String>) =
            otherNonCashItems(otherNonCashItems.getOrNull())

        /**
         * Sets [Builder.otherNonCashItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherNonCashItems] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun otherNonCashItems(otherNonCashItems: JsonField<String>) = apply {
            this.otherNonCashItems = otherNonCashItems
        }

        /** Change in other working capital */
        fun otherWorkingCapital(otherWorkingCapital: String?) =
            otherWorkingCapital(JsonField.ofNullable(otherWorkingCapital))

        /**
         * Alias for calling [Builder.otherWorkingCapital] with `otherWorkingCapital.orElse(null)`.
         */
        fun otherWorkingCapital(otherWorkingCapital: Optional<String>) =
            otherWorkingCapital(otherWorkingCapital.getOrNull())

        /**
         * Sets [Builder.otherWorkingCapital] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherWorkingCapital] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun otherWorkingCapital(otherWorkingCapital: JsonField<String>) = apply {
            this.otherWorkingCapital = otherWorkingCapital
        }

        /** Preferred dividends paid */
        fun preferredDividendsPaid(preferredDividendsPaid: String?) =
            preferredDividendsPaid(JsonField.ofNullable(preferredDividendsPaid))

        /**
         * Alias for calling [Builder.preferredDividendsPaid] with
         * `preferredDividendsPaid.orElse(null)`.
         */
        fun preferredDividendsPaid(preferredDividendsPaid: Optional<String>) =
            preferredDividendsPaid(preferredDividendsPaid.getOrNull())

        /**
         * Sets [Builder.preferredDividendsPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferredDividendsPaid] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preferredDividendsPaid(preferredDividendsPaid: JsonField<String>) = apply {
            this.preferredDividendsPaid = preferredDividendsPaid
        }

        /** Purchases of investments */
        fun purchasesOfInvestments(purchasesOfInvestments: String?) =
            purchasesOfInvestments(JsonField.ofNullable(purchasesOfInvestments))

        /**
         * Alias for calling [Builder.purchasesOfInvestments] with
         * `purchasesOfInvestments.orElse(null)`.
         */
        fun purchasesOfInvestments(purchasesOfInvestments: Optional<String>) =
            purchasesOfInvestments(purchasesOfInvestments.getOrNull())

        /**
         * Sets [Builder.purchasesOfInvestments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purchasesOfInvestments] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun purchasesOfInvestments(purchasesOfInvestments: JsonField<String>) = apply {
            this.purchasesOfInvestments = purchasesOfInvestments
        }

        /** Sales and maturities of investments */
        fun salesMaturitiesOfInvestments(salesMaturitiesOfInvestments: String?) =
            salesMaturitiesOfInvestments(JsonField.ofNullable(salesMaturitiesOfInvestments))

        /**
         * Alias for calling [Builder.salesMaturitiesOfInvestments] with
         * `salesMaturitiesOfInvestments.orElse(null)`.
         */
        fun salesMaturitiesOfInvestments(salesMaturitiesOfInvestments: Optional<String>) =
            salesMaturitiesOfInvestments(salesMaturitiesOfInvestments.getOrNull())

        /**
         * Sets [Builder.salesMaturitiesOfInvestments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.salesMaturitiesOfInvestments] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun salesMaturitiesOfInvestments(salesMaturitiesOfInvestments: JsonField<String>) = apply {
            this.salesMaturitiesOfInvestments = salesMaturitiesOfInvestments
        }

        /** Short-term net debt issuance */
        fun shortTermNetDebtIssuance(shortTermNetDebtIssuance: String?) =
            shortTermNetDebtIssuance(JsonField.ofNullable(shortTermNetDebtIssuance))

        /**
         * Alias for calling [Builder.shortTermNetDebtIssuance] with
         * `shortTermNetDebtIssuance.orElse(null)`.
         */
        fun shortTermNetDebtIssuance(shortTermNetDebtIssuance: Optional<String>) =
            shortTermNetDebtIssuance(shortTermNetDebtIssuance.getOrNull())

        /**
         * Sets [Builder.shortTermNetDebtIssuance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortTermNetDebtIssuance] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun shortTermNetDebtIssuance(shortTermNetDebtIssuance: JsonField<String>) = apply {
            this.shortTermNetDebtIssuance = shortTermNetDebtIssuance
        }

        /** Stock-based compensation expense */
        fun stockBasedCompensation(stockBasedCompensation: String?) =
            stockBasedCompensation(JsonField.ofNullable(stockBasedCompensation))

        /**
         * Alias for calling [Builder.stockBasedCompensation] with
         * `stockBasedCompensation.orElse(null)`.
         */
        fun stockBasedCompensation(stockBasedCompensation: Optional<String>) =
            stockBasedCompensation(stockBasedCompensation.getOrNull())

        /**
         * Sets [Builder.stockBasedCompensation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stockBasedCompensation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stockBasedCompensation(stockBasedCompensation: JsonField<String>) = apply {
            this.stockBasedCompensation = stockBasedCompensation
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
         * Returns an immutable instance of [InstrumentCashFlowStatement].
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
        fun build(): InstrumentCashFlowStatement =
            InstrumentCashFlowStatement(
                checkRequired("acceptedDate", acceptedDate),
                checkRequired("filingDate", filingDate),
                checkRequired("period", period),
                checkRequired("periodType", periodType),
                checkRequired("reportedCurrency", reportedCurrency),
                checkRequired("year", year),
                accountsPayables,
                accountsReceivables,
                acquisitionsNet,
                capitalExpenditure,
                cashAtBeginningOfPeriod,
                cashAtEndOfPeriod,
                changeInWorkingCapital,
                commonDividendsPaid,
                commonStockIssuance,
                commonStockRepurchased,
                deferredIncomeTax,
                depreciationAndAmortization,
                effectOfForexChangesOnCash,
                freeCashFlow,
                incomeTaxesPaid,
                interestPaid,
                inventory,
                investmentsInPropertyPlantAndEquipment,
                longTermNetDebtIssuance,
                netCashProvidedByFinancingActivities,
                netCashProvidedByInvestingActivities,
                netCashProvidedByOperatingActivities,
                netChangeInCash,
                netCommonStockIssuance,
                netDebtIssuance,
                netDividendsPaid,
                netIncome,
                netPreferredStockIssuance,
                netStockIssuance,
                operatingCashFlow,
                otherFinancingActivities,
                otherInvestingActivities,
                otherNonCashItems,
                otherWorkingCapital,
                preferredDividendsPaid,
                purchasesOfInvestments,
                salesMaturitiesOfInvestments,
                shortTermNetDebtIssuance,
                stockBasedCompensation,
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
    fun validate(): InstrumentCashFlowStatement = apply {
        if (validated) {
            return@apply
        }

        acceptedDate()
        filingDate()
        period()
        periodType().validate()
        reportedCurrency()
        year()
        accountsPayables()
        accountsReceivables()
        acquisitionsNet()
        capitalExpenditure()
        cashAtBeginningOfPeriod()
        cashAtEndOfPeriod()
        changeInWorkingCapital()
        commonDividendsPaid()
        commonStockIssuance()
        commonStockRepurchased()
        deferredIncomeTax()
        depreciationAndAmortization()
        effectOfForexChangesOnCash()
        freeCashFlow()
        incomeTaxesPaid()
        interestPaid()
        inventory()
        investmentsInPropertyPlantAndEquipment()
        longTermNetDebtIssuance()
        netCashProvidedByFinancingActivities()
        netCashProvidedByInvestingActivities()
        netCashProvidedByOperatingActivities()
        netChangeInCash()
        netCommonStockIssuance()
        netDebtIssuance()
        netDividendsPaid()
        netIncome()
        netPreferredStockIssuance()
        netStockIssuance()
        operatingCashFlow()
        otherFinancingActivities()
        otherInvestingActivities()
        otherNonCashItems()
        otherWorkingCapital()
        preferredDividendsPaid()
        purchasesOfInvestments()
        salesMaturitiesOfInvestments()
        shortTermNetDebtIssuance()
        stockBasedCompensation()
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
            (if (accountsPayables.asKnown().isPresent) 1 else 0) +
            (if (accountsReceivables.asKnown().isPresent) 1 else 0) +
            (if (acquisitionsNet.asKnown().isPresent) 1 else 0) +
            (if (capitalExpenditure.asKnown().isPresent) 1 else 0) +
            (if (cashAtBeginningOfPeriod.asKnown().isPresent) 1 else 0) +
            (if (cashAtEndOfPeriod.asKnown().isPresent) 1 else 0) +
            (if (changeInWorkingCapital.asKnown().isPresent) 1 else 0) +
            (if (commonDividendsPaid.asKnown().isPresent) 1 else 0) +
            (if (commonStockIssuance.asKnown().isPresent) 1 else 0) +
            (if (commonStockRepurchased.asKnown().isPresent) 1 else 0) +
            (if (deferredIncomeTax.asKnown().isPresent) 1 else 0) +
            (if (depreciationAndAmortization.asKnown().isPresent) 1 else 0) +
            (if (effectOfForexChangesOnCash.asKnown().isPresent) 1 else 0) +
            (if (freeCashFlow.asKnown().isPresent) 1 else 0) +
            (if (incomeTaxesPaid.asKnown().isPresent) 1 else 0) +
            (if (interestPaid.asKnown().isPresent) 1 else 0) +
            (if (inventory.asKnown().isPresent) 1 else 0) +
            (if (investmentsInPropertyPlantAndEquipment.asKnown().isPresent) 1 else 0) +
            (if (longTermNetDebtIssuance.asKnown().isPresent) 1 else 0) +
            (if (netCashProvidedByFinancingActivities.asKnown().isPresent) 1 else 0) +
            (if (netCashProvidedByInvestingActivities.asKnown().isPresent) 1 else 0) +
            (if (netCashProvidedByOperatingActivities.asKnown().isPresent) 1 else 0) +
            (if (netChangeInCash.asKnown().isPresent) 1 else 0) +
            (if (netCommonStockIssuance.asKnown().isPresent) 1 else 0) +
            (if (netDebtIssuance.asKnown().isPresent) 1 else 0) +
            (if (netDividendsPaid.asKnown().isPresent) 1 else 0) +
            (if (netIncome.asKnown().isPresent) 1 else 0) +
            (if (netPreferredStockIssuance.asKnown().isPresent) 1 else 0) +
            (if (netStockIssuance.asKnown().isPresent) 1 else 0) +
            (if (operatingCashFlow.asKnown().isPresent) 1 else 0) +
            (if (otherFinancingActivities.asKnown().isPresent) 1 else 0) +
            (if (otherInvestingActivities.asKnown().isPresent) 1 else 0) +
            (if (otherNonCashItems.asKnown().isPresent) 1 else 0) +
            (if (otherWorkingCapital.asKnown().isPresent) 1 else 0) +
            (if (preferredDividendsPaid.asKnown().isPresent) 1 else 0) +
            (if (purchasesOfInvestments.asKnown().isPresent) 1 else 0) +
            (if (salesMaturitiesOfInvestments.asKnown().isPresent) 1 else 0) +
            (if (shortTermNetDebtIssuance.asKnown().isPresent) 1 else 0) +
            (if (stockBasedCompensation.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentCashFlowStatement &&
            acceptedDate == other.acceptedDate &&
            filingDate == other.filingDate &&
            period == other.period &&
            periodType == other.periodType &&
            reportedCurrency == other.reportedCurrency &&
            year == other.year &&
            accountsPayables == other.accountsPayables &&
            accountsReceivables == other.accountsReceivables &&
            acquisitionsNet == other.acquisitionsNet &&
            capitalExpenditure == other.capitalExpenditure &&
            cashAtBeginningOfPeriod == other.cashAtBeginningOfPeriod &&
            cashAtEndOfPeriod == other.cashAtEndOfPeriod &&
            changeInWorkingCapital == other.changeInWorkingCapital &&
            commonDividendsPaid == other.commonDividendsPaid &&
            commonStockIssuance == other.commonStockIssuance &&
            commonStockRepurchased == other.commonStockRepurchased &&
            deferredIncomeTax == other.deferredIncomeTax &&
            depreciationAndAmortization == other.depreciationAndAmortization &&
            effectOfForexChangesOnCash == other.effectOfForexChangesOnCash &&
            freeCashFlow == other.freeCashFlow &&
            incomeTaxesPaid == other.incomeTaxesPaid &&
            interestPaid == other.interestPaid &&
            inventory == other.inventory &&
            investmentsInPropertyPlantAndEquipment ==
                other.investmentsInPropertyPlantAndEquipment &&
            longTermNetDebtIssuance == other.longTermNetDebtIssuance &&
            netCashProvidedByFinancingActivities == other.netCashProvidedByFinancingActivities &&
            netCashProvidedByInvestingActivities == other.netCashProvidedByInvestingActivities &&
            netCashProvidedByOperatingActivities == other.netCashProvidedByOperatingActivities &&
            netChangeInCash == other.netChangeInCash &&
            netCommonStockIssuance == other.netCommonStockIssuance &&
            netDebtIssuance == other.netDebtIssuance &&
            netDividendsPaid == other.netDividendsPaid &&
            netIncome == other.netIncome &&
            netPreferredStockIssuance == other.netPreferredStockIssuance &&
            netStockIssuance == other.netStockIssuance &&
            operatingCashFlow == other.operatingCashFlow &&
            otherFinancingActivities == other.otherFinancingActivities &&
            otherInvestingActivities == other.otherInvestingActivities &&
            otherNonCashItems == other.otherNonCashItems &&
            otherWorkingCapital == other.otherWorkingCapital &&
            preferredDividendsPaid == other.preferredDividendsPaid &&
            purchasesOfInvestments == other.purchasesOfInvestments &&
            salesMaturitiesOfInvestments == other.salesMaturitiesOfInvestments &&
            shortTermNetDebtIssuance == other.shortTermNetDebtIssuance &&
            stockBasedCompensation == other.stockBasedCompensation &&
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
            accountsPayables,
            accountsReceivables,
            acquisitionsNet,
            capitalExpenditure,
            cashAtBeginningOfPeriod,
            cashAtEndOfPeriod,
            changeInWorkingCapital,
            commonDividendsPaid,
            commonStockIssuance,
            commonStockRepurchased,
            deferredIncomeTax,
            depreciationAndAmortization,
            effectOfForexChangesOnCash,
            freeCashFlow,
            incomeTaxesPaid,
            interestPaid,
            inventory,
            investmentsInPropertyPlantAndEquipment,
            longTermNetDebtIssuance,
            netCashProvidedByFinancingActivities,
            netCashProvidedByInvestingActivities,
            netCashProvidedByOperatingActivities,
            netChangeInCash,
            netCommonStockIssuance,
            netDebtIssuance,
            netDividendsPaid,
            netIncome,
            netPreferredStockIssuance,
            netStockIssuance,
            operatingCashFlow,
            otherFinancingActivities,
            otherInvestingActivities,
            otherNonCashItems,
            otherWorkingCapital,
            preferredDividendsPaid,
            purchasesOfInvestments,
            salesMaturitiesOfInvestments,
            shortTermNetDebtIssuance,
            stockBasedCompensation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentCashFlowStatement{acceptedDate=$acceptedDate, filingDate=$filingDate, period=$period, periodType=$periodType, reportedCurrency=$reportedCurrency, year=$year, accountsPayables=$accountsPayables, accountsReceivables=$accountsReceivables, acquisitionsNet=$acquisitionsNet, capitalExpenditure=$capitalExpenditure, cashAtBeginningOfPeriod=$cashAtBeginningOfPeriod, cashAtEndOfPeriod=$cashAtEndOfPeriod, changeInWorkingCapital=$changeInWorkingCapital, commonDividendsPaid=$commonDividendsPaid, commonStockIssuance=$commonStockIssuance, commonStockRepurchased=$commonStockRepurchased, deferredIncomeTax=$deferredIncomeTax, depreciationAndAmortization=$depreciationAndAmortization, effectOfForexChangesOnCash=$effectOfForexChangesOnCash, freeCashFlow=$freeCashFlow, incomeTaxesPaid=$incomeTaxesPaid, interestPaid=$interestPaid, inventory=$inventory, investmentsInPropertyPlantAndEquipment=$investmentsInPropertyPlantAndEquipment, longTermNetDebtIssuance=$longTermNetDebtIssuance, netCashProvidedByFinancingActivities=$netCashProvidedByFinancingActivities, netCashProvidedByInvestingActivities=$netCashProvidedByInvestingActivities, netCashProvidedByOperatingActivities=$netCashProvidedByOperatingActivities, netChangeInCash=$netChangeInCash, netCommonStockIssuance=$netCommonStockIssuance, netDebtIssuance=$netDebtIssuance, netDividendsPaid=$netDividendsPaid, netIncome=$netIncome, netPreferredStockIssuance=$netPreferredStockIssuance, netStockIssuance=$netStockIssuance, operatingCashFlow=$operatingCashFlow, otherFinancingActivities=$otherFinancingActivities, otherInvestingActivities=$otherInvestingActivities, otherNonCashItems=$otherNonCashItems, otherWorkingCapital=$otherWorkingCapital, preferredDividendsPaid=$preferredDividendsPaid, purchasesOfInvestments=$purchasesOfInvestments, salesMaturitiesOfInvestments=$salesMaturitiesOfInvestments, shortTermNetDebtIssuance=$shortTermNetDebtIssuance, stockBasedCompensation=$stockBasedCompensation, additionalProperties=$additionalProperties}"
}
