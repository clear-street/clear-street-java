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

/** A quarterly balance sheet statement for an instrument. */
class InstrumentBalanceSheetStatement
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptedDate: JsonField<OffsetDateTime>,
    private val filingDate: JsonField<LocalDate>,
    private val period: JsonField<String>,
    private val periodType: JsonField<FiscalPeriodType>,
    private val reportedCurrency: JsonField<String>,
    private val year: JsonField<Int>,
    private val accountPayables: JsonField<String>,
    private val accountsReceivables: JsonField<String>,
    private val accruedExpenses: JsonField<String>,
    private val accumulatedOtherComprehensiveIncomeLoss: JsonField<String>,
    private val additionalPaidInCapital: JsonField<String>,
    private val capitalLeaseObligations: JsonField<String>,
    private val capitalLeaseObligationsCurrent: JsonField<String>,
    private val cashAndCashEquivalents: JsonField<String>,
    private val cashAndShortTermInvestments: JsonField<String>,
    private val commonStock: JsonField<String>,
    private val deferredRevenue: JsonField<String>,
    private val deferredRevenueNonCurrent: JsonField<String>,
    private val deferredTaxLiabilitiesNonCurrent: JsonField<String>,
    private val goodwill: JsonField<String>,
    private val goodwillAndIntangibleAssets: JsonField<String>,
    private val intangibleAssets: JsonField<String>,
    private val inventory: JsonField<String>,
    private val longTermDebt: JsonField<String>,
    private val longTermInvestments: JsonField<String>,
    private val minorityInterest: JsonField<String>,
    private val netDebt: JsonField<String>,
    private val netReceivables: JsonField<String>,
    private val otherAssets: JsonField<String>,
    private val otherCurrentAssets: JsonField<String>,
    private val otherCurrentLiabilities: JsonField<String>,
    private val otherLiabilities: JsonField<String>,
    private val otherNonCurrentAssets: JsonField<String>,
    private val otherNonCurrentLiabilities: JsonField<String>,
    private val otherPayables: JsonField<String>,
    private val otherReceivables: JsonField<String>,
    private val otherTotalStockholdersEquity: JsonField<String>,
    private val preferredStock: JsonField<String>,
    private val prepaids: JsonField<String>,
    private val propertyPlantAndEquipmentNet: JsonField<String>,
    private val retainedEarnings: JsonField<String>,
    private val shortTermDebt: JsonField<String>,
    private val shortTermInvestments: JsonField<String>,
    private val taxAssets: JsonField<String>,
    private val taxPayables: JsonField<String>,
    private val totalAssets: JsonField<String>,
    private val totalCurrentAssets: JsonField<String>,
    private val totalCurrentLiabilities: JsonField<String>,
    private val totalDebt: JsonField<String>,
    private val totalEquity: JsonField<String>,
    private val totalInvestments: JsonField<String>,
    private val totalLiabilities: JsonField<String>,
    private val totalLiabilitiesAndTotalEquity: JsonField<String>,
    private val totalNonCurrentAssets: JsonField<String>,
    private val totalNonCurrentLiabilities: JsonField<String>,
    private val totalPayables: JsonField<String>,
    private val totalStockholdersEquity: JsonField<String>,
    private val treasuryStock: JsonField<String>,
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
        @JsonProperty("account_payables")
        @ExcludeMissing
        accountPayables: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accounts_receivables")
        @ExcludeMissing
        accountsReceivables: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accrued_expenses")
        @ExcludeMissing
        accruedExpenses: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accumulated_other_comprehensive_income_loss")
        @ExcludeMissing
        accumulatedOtherComprehensiveIncomeLoss: JsonField<String> = JsonMissing.of(),
        @JsonProperty("additional_paid_in_capital")
        @ExcludeMissing
        additionalPaidInCapital: JsonField<String> = JsonMissing.of(),
        @JsonProperty("capital_lease_obligations")
        @ExcludeMissing
        capitalLeaseObligations: JsonField<String> = JsonMissing.of(),
        @JsonProperty("capital_lease_obligations_current")
        @ExcludeMissing
        capitalLeaseObligationsCurrent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cash_and_cash_equivalents")
        @ExcludeMissing
        cashAndCashEquivalents: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cash_and_short_term_investments")
        @ExcludeMissing
        cashAndShortTermInvestments: JsonField<String> = JsonMissing.of(),
        @JsonProperty("common_stock")
        @ExcludeMissing
        commonStock: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deferred_revenue")
        @ExcludeMissing
        deferredRevenue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deferred_revenue_non_current")
        @ExcludeMissing
        deferredRevenueNonCurrent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("deferred_tax_liabilities_non_current")
        @ExcludeMissing
        deferredTaxLiabilitiesNonCurrent: JsonField<String> = JsonMissing.of(),
        @JsonProperty("goodwill") @ExcludeMissing goodwill: JsonField<String> = JsonMissing.of(),
        @JsonProperty("goodwill_and_intangible_assets")
        @ExcludeMissing
        goodwillAndIntangibleAssets: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intangible_assets")
        @ExcludeMissing
        intangibleAssets: JsonField<String> = JsonMissing.of(),
        @JsonProperty("inventory") @ExcludeMissing inventory: JsonField<String> = JsonMissing.of(),
        @JsonProperty("long_term_debt")
        @ExcludeMissing
        longTermDebt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("long_term_investments")
        @ExcludeMissing
        longTermInvestments: JsonField<String> = JsonMissing.of(),
        @JsonProperty("minority_interest")
        @ExcludeMissing
        minorityInterest: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_debt") @ExcludeMissing netDebt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("net_receivables")
        @ExcludeMissing
        netReceivables: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_assets")
        @ExcludeMissing
        otherAssets: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_current_assets")
        @ExcludeMissing
        otherCurrentAssets: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_current_liabilities")
        @ExcludeMissing
        otherCurrentLiabilities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_liabilities")
        @ExcludeMissing
        otherLiabilities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_non_current_assets")
        @ExcludeMissing
        otherNonCurrentAssets: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_non_current_liabilities")
        @ExcludeMissing
        otherNonCurrentLiabilities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_payables")
        @ExcludeMissing
        otherPayables: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_receivables")
        @ExcludeMissing
        otherReceivables: JsonField<String> = JsonMissing.of(),
        @JsonProperty("other_total_stockholders_equity")
        @ExcludeMissing
        otherTotalStockholdersEquity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preferred_stock")
        @ExcludeMissing
        preferredStock: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prepaids") @ExcludeMissing prepaids: JsonField<String> = JsonMissing.of(),
        @JsonProperty("property_plant_and_equipment_net")
        @ExcludeMissing
        propertyPlantAndEquipmentNet: JsonField<String> = JsonMissing.of(),
        @JsonProperty("retained_earnings")
        @ExcludeMissing
        retainedEarnings: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_term_debt")
        @ExcludeMissing
        shortTermDebt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("short_term_investments")
        @ExcludeMissing
        shortTermInvestments: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_assets") @ExcludeMissing taxAssets: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_payables")
        @ExcludeMissing
        taxPayables: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_assets")
        @ExcludeMissing
        totalAssets: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_current_assets")
        @ExcludeMissing
        totalCurrentAssets: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_current_liabilities")
        @ExcludeMissing
        totalCurrentLiabilities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_debt") @ExcludeMissing totalDebt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_equity")
        @ExcludeMissing
        totalEquity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_investments")
        @ExcludeMissing
        totalInvestments: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_liabilities")
        @ExcludeMissing
        totalLiabilities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_liabilities_and_total_equity")
        @ExcludeMissing
        totalLiabilitiesAndTotalEquity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_non_current_assets")
        @ExcludeMissing
        totalNonCurrentAssets: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_non_current_liabilities")
        @ExcludeMissing
        totalNonCurrentLiabilities: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_payables")
        @ExcludeMissing
        totalPayables: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_stockholders_equity")
        @ExcludeMissing
        totalStockholdersEquity: JsonField<String> = JsonMissing.of(),
        @JsonProperty("treasury_stock")
        @ExcludeMissing
        treasuryStock: JsonField<String> = JsonMissing.of(),
    ) : this(
        acceptedDate,
        filingDate,
        period,
        periodType,
        reportedCurrency,
        year,
        accountPayables,
        accountsReceivables,
        accruedExpenses,
        accumulatedOtherComprehensiveIncomeLoss,
        additionalPaidInCapital,
        capitalLeaseObligations,
        capitalLeaseObligationsCurrent,
        cashAndCashEquivalents,
        cashAndShortTermInvestments,
        commonStock,
        deferredRevenue,
        deferredRevenueNonCurrent,
        deferredTaxLiabilitiesNonCurrent,
        goodwill,
        goodwillAndIntangibleAssets,
        intangibleAssets,
        inventory,
        longTermDebt,
        longTermInvestments,
        minorityInterest,
        netDebt,
        netReceivables,
        otherAssets,
        otherCurrentAssets,
        otherCurrentLiabilities,
        otherLiabilities,
        otherNonCurrentAssets,
        otherNonCurrentLiabilities,
        otherPayables,
        otherReceivables,
        otherTotalStockholdersEquity,
        preferredStock,
        prepaids,
        propertyPlantAndEquipmentNet,
        retainedEarnings,
        shortTermDebt,
        shortTermInvestments,
        taxAssets,
        taxPayables,
        totalAssets,
        totalCurrentAssets,
        totalCurrentLiabilities,
        totalDebt,
        totalEquity,
        totalInvestments,
        totalLiabilities,
        totalLiabilitiesAndTotalEquity,
        totalNonCurrentAssets,
        totalNonCurrentLiabilities,
        totalPayables,
        totalStockholdersEquity,
        treasuryStock,
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
     * Account payables
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountPayables(): Optional<String> = accountPayables.getOptional("account_payables")

    /**
     * Accounts receivables
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountsReceivables(): Optional<String> =
        accountsReceivables.getOptional("accounts_receivables")

    /**
     * Accrued expenses
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accruedExpenses(): Optional<String> = accruedExpenses.getOptional("accrued_expenses")

    /**
     * Accumulated other comprehensive income/loss
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accumulatedOtherComprehensiveIncomeLoss(): Optional<String> =
        accumulatedOtherComprehensiveIncomeLoss.getOptional(
            "accumulated_other_comprehensive_income_loss"
        )

    /**
     * Additional paid-in capital
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun additionalPaidInCapital(): Optional<String> =
        additionalPaidInCapital.getOptional("additional_paid_in_capital")

    /**
     * Capital lease obligations (total)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun capitalLeaseObligations(): Optional<String> =
        capitalLeaseObligations.getOptional("capital_lease_obligations")

    /**
     * Capital lease obligations (current portion)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun capitalLeaseObligationsCurrent(): Optional<String> =
        capitalLeaseObligationsCurrent.getOptional("capital_lease_obligations_current")

    /**
     * Cash and cash equivalents
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cashAndCashEquivalents(): Optional<String> =
        cashAndCashEquivalents.getOptional("cash_and_cash_equivalents")

    /**
     * Cash and short-term investments combined
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cashAndShortTermInvestments(): Optional<String> =
        cashAndShortTermInvestments.getOptional("cash_and_short_term_investments")

    /**
     * Common stock
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commonStock(): Optional<String> = commonStock.getOptional("common_stock")

    /**
     * Deferred revenue
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deferredRevenue(): Optional<String> = deferredRevenue.getOptional("deferred_revenue")

    /**
     * Deferred revenue (non-current)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deferredRevenueNonCurrent(): Optional<String> =
        deferredRevenueNonCurrent.getOptional("deferred_revenue_non_current")

    /**
     * Deferred tax liabilities (non-current)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deferredTaxLiabilitiesNonCurrent(): Optional<String> =
        deferredTaxLiabilitiesNonCurrent.getOptional("deferred_tax_liabilities_non_current")

    /**
     * Goodwill
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun goodwill(): Optional<String> = goodwill.getOptional("goodwill")

    /**
     * Goodwill and intangible assets combined
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun goodwillAndIntangibleAssets(): Optional<String> =
        goodwillAndIntangibleAssets.getOptional("goodwill_and_intangible_assets")

    /**
     * Intangible assets
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun intangibleAssets(): Optional<String> = intangibleAssets.getOptional("intangible_assets")

    /**
     * Inventory
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun inventory(): Optional<String> = inventory.getOptional("inventory")

    /**
     * Long-term debt
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun longTermDebt(): Optional<String> = longTermDebt.getOptional("long_term_debt")

    /**
     * Long-term investments
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun longTermInvestments(): Optional<String> =
        longTermInvestments.getOptional("long_term_investments")

    /**
     * Minority interest
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun minorityInterest(): Optional<String> = minorityInterest.getOptional("minority_interest")

    /**
     * Net debt (total debt minus cash)
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netDebt(): Optional<String> = netDebt.getOptional("net_debt")

    /**
     * Net receivables
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netReceivables(): Optional<String> = netReceivables.getOptional("net_receivables")

    /**
     * Other assets
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherAssets(): Optional<String> = otherAssets.getOptional("other_assets")

    /**
     * Other current assets
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherCurrentAssets(): Optional<String> =
        otherCurrentAssets.getOptional("other_current_assets")

    /**
     * Other current liabilities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherCurrentLiabilities(): Optional<String> =
        otherCurrentLiabilities.getOptional("other_current_liabilities")

    /**
     * Other liabilities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherLiabilities(): Optional<String> = otherLiabilities.getOptional("other_liabilities")

    /**
     * Other non-current assets
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherNonCurrentAssets(): Optional<String> =
        otherNonCurrentAssets.getOptional("other_non_current_assets")

    /**
     * Other non-current liabilities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherNonCurrentLiabilities(): Optional<String> =
        otherNonCurrentLiabilities.getOptional("other_non_current_liabilities")

    /**
     * Other payables
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherPayables(): Optional<String> = otherPayables.getOptional("other_payables")

    /**
     * Other receivables
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherReceivables(): Optional<String> = otherReceivables.getOptional("other_receivables")

    /**
     * Other total stockholders equity
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun otherTotalStockholdersEquity(): Optional<String> =
        otherTotalStockholdersEquity.getOptional("other_total_stockholders_equity")

    /**
     * Preferred stock
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun preferredStock(): Optional<String> = preferredStock.getOptional("preferred_stock")

    /**
     * Prepaids
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun prepaids(): Optional<String> = prepaids.getOptional("prepaids")

    /**
     * Property, plant and equipment net of depreciation
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun propertyPlantAndEquipmentNet(): Optional<String> =
        propertyPlantAndEquipmentNet.getOptional("property_plant_and_equipment_net")

    /**
     * Retained earnings
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun retainedEarnings(): Optional<String> = retainedEarnings.getOptional("retained_earnings")

    /**
     * Short-term debt
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shortTermDebt(): Optional<String> = shortTermDebt.getOptional("short_term_debt")

    /**
     * Short-term investments
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun shortTermInvestments(): Optional<String> =
        shortTermInvestments.getOptional("short_term_investments")

    /**
     * Tax assets
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxAssets(): Optional<String> = taxAssets.getOptional("tax_assets")

    /**
     * Tax payables
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun taxPayables(): Optional<String> = taxPayables.getOptional("tax_payables")

    /**
     * Total assets
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalAssets(): Optional<String> = totalAssets.getOptional("total_assets")

    /**
     * Total current assets
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCurrentAssets(): Optional<String> =
        totalCurrentAssets.getOptional("total_current_assets")

    /**
     * Total current liabilities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalCurrentLiabilities(): Optional<String> =
        totalCurrentLiabilities.getOptional("total_current_liabilities")

    /**
     * Total debt
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalDebt(): Optional<String> = totalDebt.getOptional("total_debt")

    /**
     * Total equity
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalEquity(): Optional<String> = totalEquity.getOptional("total_equity")

    /**
     * Total investments
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalInvestments(): Optional<String> = totalInvestments.getOptional("total_investments")

    /**
     * Total liabilities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalLiabilities(): Optional<String> = totalLiabilities.getOptional("total_liabilities")

    /**
     * Total liabilities and total equity
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalLiabilitiesAndTotalEquity(): Optional<String> =
        totalLiabilitiesAndTotalEquity.getOptional("total_liabilities_and_total_equity")

    /**
     * Total non-current assets
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalNonCurrentAssets(): Optional<String> =
        totalNonCurrentAssets.getOptional("total_non_current_assets")

    /**
     * Total non-current liabilities
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalNonCurrentLiabilities(): Optional<String> =
        totalNonCurrentLiabilities.getOptional("total_non_current_liabilities")

    /**
     * Total payables
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalPayables(): Optional<String> = totalPayables.getOptional("total_payables")

    /**
     * Total stockholders equity
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalStockholdersEquity(): Optional<String> =
        totalStockholdersEquity.getOptional("total_stockholders_equity")

    /**
     * Treasury stock
     *
     * @throws ClearStreetInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun treasuryStock(): Optional<String> = treasuryStock.getOptional("treasury_stock")

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
     * Returns the raw JSON value of [accountPayables].
     *
     * Unlike [accountPayables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_payables")
    @ExcludeMissing
    fun _accountPayables(): JsonField<String> = accountPayables

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
     * Returns the raw JSON value of [accruedExpenses].
     *
     * Unlike [accruedExpenses], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accrued_expenses")
    @ExcludeMissing
    fun _accruedExpenses(): JsonField<String> = accruedExpenses

    /**
     * Returns the raw JSON value of [accumulatedOtherComprehensiveIncomeLoss].
     *
     * Unlike [accumulatedOtherComprehensiveIncomeLoss], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    @JsonProperty("accumulated_other_comprehensive_income_loss")
    @ExcludeMissing
    fun _accumulatedOtherComprehensiveIncomeLoss(): JsonField<String> =
        accumulatedOtherComprehensiveIncomeLoss

    /**
     * Returns the raw JSON value of [additionalPaidInCapital].
     *
     * Unlike [additionalPaidInCapital], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("additional_paid_in_capital")
    @ExcludeMissing
    fun _additionalPaidInCapital(): JsonField<String> = additionalPaidInCapital

    /**
     * Returns the raw JSON value of [capitalLeaseObligations].
     *
     * Unlike [capitalLeaseObligations], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("capital_lease_obligations")
    @ExcludeMissing
    fun _capitalLeaseObligations(): JsonField<String> = capitalLeaseObligations

    /**
     * Returns the raw JSON value of [capitalLeaseObligationsCurrent].
     *
     * Unlike [capitalLeaseObligationsCurrent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("capital_lease_obligations_current")
    @ExcludeMissing
    fun _capitalLeaseObligationsCurrent(): JsonField<String> = capitalLeaseObligationsCurrent

    /**
     * Returns the raw JSON value of [cashAndCashEquivalents].
     *
     * Unlike [cashAndCashEquivalents], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cash_and_cash_equivalents")
    @ExcludeMissing
    fun _cashAndCashEquivalents(): JsonField<String> = cashAndCashEquivalents

    /**
     * Returns the raw JSON value of [cashAndShortTermInvestments].
     *
     * Unlike [cashAndShortTermInvestments], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cash_and_short_term_investments")
    @ExcludeMissing
    fun _cashAndShortTermInvestments(): JsonField<String> = cashAndShortTermInvestments

    /**
     * Returns the raw JSON value of [commonStock].
     *
     * Unlike [commonStock], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("common_stock")
    @ExcludeMissing
    fun _commonStock(): JsonField<String> = commonStock

    /**
     * Returns the raw JSON value of [deferredRevenue].
     *
     * Unlike [deferredRevenue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("deferred_revenue")
    @ExcludeMissing
    fun _deferredRevenue(): JsonField<String> = deferredRevenue

    /**
     * Returns the raw JSON value of [deferredRevenueNonCurrent].
     *
     * Unlike [deferredRevenueNonCurrent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("deferred_revenue_non_current")
    @ExcludeMissing
    fun _deferredRevenueNonCurrent(): JsonField<String> = deferredRevenueNonCurrent

    /**
     * Returns the raw JSON value of [deferredTaxLiabilitiesNonCurrent].
     *
     * Unlike [deferredTaxLiabilitiesNonCurrent], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("deferred_tax_liabilities_non_current")
    @ExcludeMissing
    fun _deferredTaxLiabilitiesNonCurrent(): JsonField<String> = deferredTaxLiabilitiesNonCurrent

    /**
     * Returns the raw JSON value of [goodwill].
     *
     * Unlike [goodwill], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("goodwill") @ExcludeMissing fun _goodwill(): JsonField<String> = goodwill

    /**
     * Returns the raw JSON value of [goodwillAndIntangibleAssets].
     *
     * Unlike [goodwillAndIntangibleAssets], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("goodwill_and_intangible_assets")
    @ExcludeMissing
    fun _goodwillAndIntangibleAssets(): JsonField<String> = goodwillAndIntangibleAssets

    /**
     * Returns the raw JSON value of [intangibleAssets].
     *
     * Unlike [intangibleAssets], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("intangible_assets")
    @ExcludeMissing
    fun _intangibleAssets(): JsonField<String> = intangibleAssets

    /**
     * Returns the raw JSON value of [inventory].
     *
     * Unlike [inventory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inventory") @ExcludeMissing fun _inventory(): JsonField<String> = inventory

    /**
     * Returns the raw JSON value of [longTermDebt].
     *
     * Unlike [longTermDebt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("long_term_debt")
    @ExcludeMissing
    fun _longTermDebt(): JsonField<String> = longTermDebt

    /**
     * Returns the raw JSON value of [longTermInvestments].
     *
     * Unlike [longTermInvestments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("long_term_investments")
    @ExcludeMissing
    fun _longTermInvestments(): JsonField<String> = longTermInvestments

    /**
     * Returns the raw JSON value of [minorityInterest].
     *
     * Unlike [minorityInterest], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("minority_interest")
    @ExcludeMissing
    fun _minorityInterest(): JsonField<String> = minorityInterest

    /**
     * Returns the raw JSON value of [netDebt].
     *
     * Unlike [netDebt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_debt") @ExcludeMissing fun _netDebt(): JsonField<String> = netDebt

    /**
     * Returns the raw JSON value of [netReceivables].
     *
     * Unlike [netReceivables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("net_receivables")
    @ExcludeMissing
    fun _netReceivables(): JsonField<String> = netReceivables

    /**
     * Returns the raw JSON value of [otherAssets].
     *
     * Unlike [otherAssets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("other_assets")
    @ExcludeMissing
    fun _otherAssets(): JsonField<String> = otherAssets

    /**
     * Returns the raw JSON value of [otherCurrentAssets].
     *
     * Unlike [otherCurrentAssets], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("other_current_assets")
    @ExcludeMissing
    fun _otherCurrentAssets(): JsonField<String> = otherCurrentAssets

    /**
     * Returns the raw JSON value of [otherCurrentLiabilities].
     *
     * Unlike [otherCurrentLiabilities], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("other_current_liabilities")
    @ExcludeMissing
    fun _otherCurrentLiabilities(): JsonField<String> = otherCurrentLiabilities

    /**
     * Returns the raw JSON value of [otherLiabilities].
     *
     * Unlike [otherLiabilities], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("other_liabilities")
    @ExcludeMissing
    fun _otherLiabilities(): JsonField<String> = otherLiabilities

    /**
     * Returns the raw JSON value of [otherNonCurrentAssets].
     *
     * Unlike [otherNonCurrentAssets], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("other_non_current_assets")
    @ExcludeMissing
    fun _otherNonCurrentAssets(): JsonField<String> = otherNonCurrentAssets

    /**
     * Returns the raw JSON value of [otherNonCurrentLiabilities].
     *
     * Unlike [otherNonCurrentLiabilities], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("other_non_current_liabilities")
    @ExcludeMissing
    fun _otherNonCurrentLiabilities(): JsonField<String> = otherNonCurrentLiabilities

    /**
     * Returns the raw JSON value of [otherPayables].
     *
     * Unlike [otherPayables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("other_payables")
    @ExcludeMissing
    fun _otherPayables(): JsonField<String> = otherPayables

    /**
     * Returns the raw JSON value of [otherReceivables].
     *
     * Unlike [otherReceivables], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("other_receivables")
    @ExcludeMissing
    fun _otherReceivables(): JsonField<String> = otherReceivables

    /**
     * Returns the raw JSON value of [otherTotalStockholdersEquity].
     *
     * Unlike [otherTotalStockholdersEquity], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("other_total_stockholders_equity")
    @ExcludeMissing
    fun _otherTotalStockholdersEquity(): JsonField<String> = otherTotalStockholdersEquity

    /**
     * Returns the raw JSON value of [preferredStock].
     *
     * Unlike [preferredStock], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("preferred_stock")
    @ExcludeMissing
    fun _preferredStock(): JsonField<String> = preferredStock

    /**
     * Returns the raw JSON value of [prepaids].
     *
     * Unlike [prepaids], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prepaids") @ExcludeMissing fun _prepaids(): JsonField<String> = prepaids

    /**
     * Returns the raw JSON value of [propertyPlantAndEquipmentNet].
     *
     * Unlike [propertyPlantAndEquipmentNet], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("property_plant_and_equipment_net")
    @ExcludeMissing
    fun _propertyPlantAndEquipmentNet(): JsonField<String> = propertyPlantAndEquipmentNet

    /**
     * Returns the raw JSON value of [retainedEarnings].
     *
     * Unlike [retainedEarnings], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("retained_earnings")
    @ExcludeMissing
    fun _retainedEarnings(): JsonField<String> = retainedEarnings

    /**
     * Returns the raw JSON value of [shortTermDebt].
     *
     * Unlike [shortTermDebt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("short_term_debt")
    @ExcludeMissing
    fun _shortTermDebt(): JsonField<String> = shortTermDebt

    /**
     * Returns the raw JSON value of [shortTermInvestments].
     *
     * Unlike [shortTermInvestments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("short_term_investments")
    @ExcludeMissing
    fun _shortTermInvestments(): JsonField<String> = shortTermInvestments

    /**
     * Returns the raw JSON value of [taxAssets].
     *
     * Unlike [taxAssets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_assets") @ExcludeMissing fun _taxAssets(): JsonField<String> = taxAssets

    /**
     * Returns the raw JSON value of [taxPayables].
     *
     * Unlike [taxPayables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_payables")
    @ExcludeMissing
    fun _taxPayables(): JsonField<String> = taxPayables

    /**
     * Returns the raw JSON value of [totalAssets].
     *
     * Unlike [totalAssets], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_assets")
    @ExcludeMissing
    fun _totalAssets(): JsonField<String> = totalAssets

    /**
     * Returns the raw JSON value of [totalCurrentAssets].
     *
     * Unlike [totalCurrentAssets], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("total_current_assets")
    @ExcludeMissing
    fun _totalCurrentAssets(): JsonField<String> = totalCurrentAssets

    /**
     * Returns the raw JSON value of [totalCurrentLiabilities].
     *
     * Unlike [totalCurrentLiabilities], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("total_current_liabilities")
    @ExcludeMissing
    fun _totalCurrentLiabilities(): JsonField<String> = totalCurrentLiabilities

    /**
     * Returns the raw JSON value of [totalDebt].
     *
     * Unlike [totalDebt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_debt") @ExcludeMissing fun _totalDebt(): JsonField<String> = totalDebt

    /**
     * Returns the raw JSON value of [totalEquity].
     *
     * Unlike [totalEquity], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_equity")
    @ExcludeMissing
    fun _totalEquity(): JsonField<String> = totalEquity

    /**
     * Returns the raw JSON value of [totalInvestments].
     *
     * Unlike [totalInvestments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("total_investments")
    @ExcludeMissing
    fun _totalInvestments(): JsonField<String> = totalInvestments

    /**
     * Returns the raw JSON value of [totalLiabilities].
     *
     * Unlike [totalLiabilities], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("total_liabilities")
    @ExcludeMissing
    fun _totalLiabilities(): JsonField<String> = totalLiabilities

    /**
     * Returns the raw JSON value of [totalLiabilitiesAndTotalEquity].
     *
     * Unlike [totalLiabilitiesAndTotalEquity], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("total_liabilities_and_total_equity")
    @ExcludeMissing
    fun _totalLiabilitiesAndTotalEquity(): JsonField<String> = totalLiabilitiesAndTotalEquity

    /**
     * Returns the raw JSON value of [totalNonCurrentAssets].
     *
     * Unlike [totalNonCurrentAssets], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("total_non_current_assets")
    @ExcludeMissing
    fun _totalNonCurrentAssets(): JsonField<String> = totalNonCurrentAssets

    /**
     * Returns the raw JSON value of [totalNonCurrentLiabilities].
     *
     * Unlike [totalNonCurrentLiabilities], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("total_non_current_liabilities")
    @ExcludeMissing
    fun _totalNonCurrentLiabilities(): JsonField<String> = totalNonCurrentLiabilities

    /**
     * Returns the raw JSON value of [totalPayables].
     *
     * Unlike [totalPayables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_payables")
    @ExcludeMissing
    fun _totalPayables(): JsonField<String> = totalPayables

    /**
     * Returns the raw JSON value of [totalStockholdersEquity].
     *
     * Unlike [totalStockholdersEquity], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("total_stockholders_equity")
    @ExcludeMissing
    fun _totalStockholdersEquity(): JsonField<String> = totalStockholdersEquity

    /**
     * Returns the raw JSON value of [treasuryStock].
     *
     * Unlike [treasuryStock], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("treasury_stock")
    @ExcludeMissing
    fun _treasuryStock(): JsonField<String> = treasuryStock

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
         * Returns a mutable builder for constructing an instance of
         * [InstrumentBalanceSheetStatement].
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

    /** A builder for [InstrumentBalanceSheetStatement]. */
    class Builder internal constructor() {

        private var acceptedDate: JsonField<OffsetDateTime>? = null
        private var filingDate: JsonField<LocalDate>? = null
        private var period: JsonField<String>? = null
        private var periodType: JsonField<FiscalPeriodType>? = null
        private var reportedCurrency: JsonField<String>? = null
        private var year: JsonField<Int>? = null
        private var accountPayables: JsonField<String> = JsonMissing.of()
        private var accountsReceivables: JsonField<String> = JsonMissing.of()
        private var accruedExpenses: JsonField<String> = JsonMissing.of()
        private var accumulatedOtherComprehensiveIncomeLoss: JsonField<String> = JsonMissing.of()
        private var additionalPaidInCapital: JsonField<String> = JsonMissing.of()
        private var capitalLeaseObligations: JsonField<String> = JsonMissing.of()
        private var capitalLeaseObligationsCurrent: JsonField<String> = JsonMissing.of()
        private var cashAndCashEquivalents: JsonField<String> = JsonMissing.of()
        private var cashAndShortTermInvestments: JsonField<String> = JsonMissing.of()
        private var commonStock: JsonField<String> = JsonMissing.of()
        private var deferredRevenue: JsonField<String> = JsonMissing.of()
        private var deferredRevenueNonCurrent: JsonField<String> = JsonMissing.of()
        private var deferredTaxLiabilitiesNonCurrent: JsonField<String> = JsonMissing.of()
        private var goodwill: JsonField<String> = JsonMissing.of()
        private var goodwillAndIntangibleAssets: JsonField<String> = JsonMissing.of()
        private var intangibleAssets: JsonField<String> = JsonMissing.of()
        private var inventory: JsonField<String> = JsonMissing.of()
        private var longTermDebt: JsonField<String> = JsonMissing.of()
        private var longTermInvestments: JsonField<String> = JsonMissing.of()
        private var minorityInterest: JsonField<String> = JsonMissing.of()
        private var netDebt: JsonField<String> = JsonMissing.of()
        private var netReceivables: JsonField<String> = JsonMissing.of()
        private var otherAssets: JsonField<String> = JsonMissing.of()
        private var otherCurrentAssets: JsonField<String> = JsonMissing.of()
        private var otherCurrentLiabilities: JsonField<String> = JsonMissing.of()
        private var otherLiabilities: JsonField<String> = JsonMissing.of()
        private var otherNonCurrentAssets: JsonField<String> = JsonMissing.of()
        private var otherNonCurrentLiabilities: JsonField<String> = JsonMissing.of()
        private var otherPayables: JsonField<String> = JsonMissing.of()
        private var otherReceivables: JsonField<String> = JsonMissing.of()
        private var otherTotalStockholdersEquity: JsonField<String> = JsonMissing.of()
        private var preferredStock: JsonField<String> = JsonMissing.of()
        private var prepaids: JsonField<String> = JsonMissing.of()
        private var propertyPlantAndEquipmentNet: JsonField<String> = JsonMissing.of()
        private var retainedEarnings: JsonField<String> = JsonMissing.of()
        private var shortTermDebt: JsonField<String> = JsonMissing.of()
        private var shortTermInvestments: JsonField<String> = JsonMissing.of()
        private var taxAssets: JsonField<String> = JsonMissing.of()
        private var taxPayables: JsonField<String> = JsonMissing.of()
        private var totalAssets: JsonField<String> = JsonMissing.of()
        private var totalCurrentAssets: JsonField<String> = JsonMissing.of()
        private var totalCurrentLiabilities: JsonField<String> = JsonMissing.of()
        private var totalDebt: JsonField<String> = JsonMissing.of()
        private var totalEquity: JsonField<String> = JsonMissing.of()
        private var totalInvestments: JsonField<String> = JsonMissing.of()
        private var totalLiabilities: JsonField<String> = JsonMissing.of()
        private var totalLiabilitiesAndTotalEquity: JsonField<String> = JsonMissing.of()
        private var totalNonCurrentAssets: JsonField<String> = JsonMissing.of()
        private var totalNonCurrentLiabilities: JsonField<String> = JsonMissing.of()
        private var totalPayables: JsonField<String> = JsonMissing.of()
        private var totalStockholdersEquity: JsonField<String> = JsonMissing.of()
        private var treasuryStock: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(instrumentBalanceSheetStatement: InstrumentBalanceSheetStatement) =
            apply {
                acceptedDate = instrumentBalanceSheetStatement.acceptedDate
                filingDate = instrumentBalanceSheetStatement.filingDate
                period = instrumentBalanceSheetStatement.period
                periodType = instrumentBalanceSheetStatement.periodType
                reportedCurrency = instrumentBalanceSheetStatement.reportedCurrency
                year = instrumentBalanceSheetStatement.year
                accountPayables = instrumentBalanceSheetStatement.accountPayables
                accountsReceivables = instrumentBalanceSheetStatement.accountsReceivables
                accruedExpenses = instrumentBalanceSheetStatement.accruedExpenses
                accumulatedOtherComprehensiveIncomeLoss =
                    instrumentBalanceSheetStatement.accumulatedOtherComprehensiveIncomeLoss
                additionalPaidInCapital = instrumentBalanceSheetStatement.additionalPaidInCapital
                capitalLeaseObligations = instrumentBalanceSheetStatement.capitalLeaseObligations
                capitalLeaseObligationsCurrent =
                    instrumentBalanceSheetStatement.capitalLeaseObligationsCurrent
                cashAndCashEquivalents = instrumentBalanceSheetStatement.cashAndCashEquivalents
                cashAndShortTermInvestments =
                    instrumentBalanceSheetStatement.cashAndShortTermInvestments
                commonStock = instrumentBalanceSheetStatement.commonStock
                deferredRevenue = instrumentBalanceSheetStatement.deferredRevenue
                deferredRevenueNonCurrent =
                    instrumentBalanceSheetStatement.deferredRevenueNonCurrent
                deferredTaxLiabilitiesNonCurrent =
                    instrumentBalanceSheetStatement.deferredTaxLiabilitiesNonCurrent
                goodwill = instrumentBalanceSheetStatement.goodwill
                goodwillAndIntangibleAssets =
                    instrumentBalanceSheetStatement.goodwillAndIntangibleAssets
                intangibleAssets = instrumentBalanceSheetStatement.intangibleAssets
                inventory = instrumentBalanceSheetStatement.inventory
                longTermDebt = instrumentBalanceSheetStatement.longTermDebt
                longTermInvestments = instrumentBalanceSheetStatement.longTermInvestments
                minorityInterest = instrumentBalanceSheetStatement.minorityInterest
                netDebt = instrumentBalanceSheetStatement.netDebt
                netReceivables = instrumentBalanceSheetStatement.netReceivables
                otherAssets = instrumentBalanceSheetStatement.otherAssets
                otherCurrentAssets = instrumentBalanceSheetStatement.otherCurrentAssets
                otherCurrentLiabilities = instrumentBalanceSheetStatement.otherCurrentLiabilities
                otherLiabilities = instrumentBalanceSheetStatement.otherLiabilities
                otherNonCurrentAssets = instrumentBalanceSheetStatement.otherNonCurrentAssets
                otherNonCurrentLiabilities =
                    instrumentBalanceSheetStatement.otherNonCurrentLiabilities
                otherPayables = instrumentBalanceSheetStatement.otherPayables
                otherReceivables = instrumentBalanceSheetStatement.otherReceivables
                otherTotalStockholdersEquity =
                    instrumentBalanceSheetStatement.otherTotalStockholdersEquity
                preferredStock = instrumentBalanceSheetStatement.preferredStock
                prepaids = instrumentBalanceSheetStatement.prepaids
                propertyPlantAndEquipmentNet =
                    instrumentBalanceSheetStatement.propertyPlantAndEquipmentNet
                retainedEarnings = instrumentBalanceSheetStatement.retainedEarnings
                shortTermDebt = instrumentBalanceSheetStatement.shortTermDebt
                shortTermInvestments = instrumentBalanceSheetStatement.shortTermInvestments
                taxAssets = instrumentBalanceSheetStatement.taxAssets
                taxPayables = instrumentBalanceSheetStatement.taxPayables
                totalAssets = instrumentBalanceSheetStatement.totalAssets
                totalCurrentAssets = instrumentBalanceSheetStatement.totalCurrentAssets
                totalCurrentLiabilities = instrumentBalanceSheetStatement.totalCurrentLiabilities
                totalDebt = instrumentBalanceSheetStatement.totalDebt
                totalEquity = instrumentBalanceSheetStatement.totalEquity
                totalInvestments = instrumentBalanceSheetStatement.totalInvestments
                totalLiabilities = instrumentBalanceSheetStatement.totalLiabilities
                totalLiabilitiesAndTotalEquity =
                    instrumentBalanceSheetStatement.totalLiabilitiesAndTotalEquity
                totalNonCurrentAssets = instrumentBalanceSheetStatement.totalNonCurrentAssets
                totalNonCurrentLiabilities =
                    instrumentBalanceSheetStatement.totalNonCurrentLiabilities
                totalPayables = instrumentBalanceSheetStatement.totalPayables
                totalStockholdersEquity = instrumentBalanceSheetStatement.totalStockholdersEquity
                treasuryStock = instrumentBalanceSheetStatement.treasuryStock
                additionalProperties =
                    instrumentBalanceSheetStatement.additionalProperties.toMutableMap()
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

        /** Account payables */
        fun accountPayables(accountPayables: String?) =
            accountPayables(JsonField.ofNullable(accountPayables))

        /** Alias for calling [Builder.accountPayables] with `accountPayables.orElse(null)`. */
        fun accountPayables(accountPayables: Optional<String>) =
            accountPayables(accountPayables.getOrNull())

        /**
         * Sets [Builder.accountPayables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountPayables] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountPayables(accountPayables: JsonField<String>) = apply {
            this.accountPayables = accountPayables
        }

        /** Accounts receivables */
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

        /** Accrued expenses */
        fun accruedExpenses(accruedExpenses: String?) =
            accruedExpenses(JsonField.ofNullable(accruedExpenses))

        /** Alias for calling [Builder.accruedExpenses] with `accruedExpenses.orElse(null)`. */
        fun accruedExpenses(accruedExpenses: Optional<String>) =
            accruedExpenses(accruedExpenses.getOrNull())

        /**
         * Sets [Builder.accruedExpenses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accruedExpenses] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accruedExpenses(accruedExpenses: JsonField<String>) = apply {
            this.accruedExpenses = accruedExpenses
        }

        /** Accumulated other comprehensive income/loss */
        fun accumulatedOtherComprehensiveIncomeLoss(
            accumulatedOtherComprehensiveIncomeLoss: String?
        ) =
            accumulatedOtherComprehensiveIncomeLoss(
                JsonField.ofNullable(accumulatedOtherComprehensiveIncomeLoss)
            )

        /**
         * Alias for calling [Builder.accumulatedOtherComprehensiveIncomeLoss] with
         * `accumulatedOtherComprehensiveIncomeLoss.orElse(null)`.
         */
        fun accumulatedOtherComprehensiveIncomeLoss(
            accumulatedOtherComprehensiveIncomeLoss: Optional<String>
        ) =
            accumulatedOtherComprehensiveIncomeLoss(
                accumulatedOtherComprehensiveIncomeLoss.getOrNull()
            )

        /**
         * Sets [Builder.accumulatedOtherComprehensiveIncomeLoss] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accumulatedOtherComprehensiveIncomeLoss] with a
         * well-typed [String] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun accumulatedOtherComprehensiveIncomeLoss(
            accumulatedOtherComprehensiveIncomeLoss: JsonField<String>
        ) = apply {
            this.accumulatedOtherComprehensiveIncomeLoss = accumulatedOtherComprehensiveIncomeLoss
        }

        /** Additional paid-in capital */
        fun additionalPaidInCapital(additionalPaidInCapital: String?) =
            additionalPaidInCapital(JsonField.ofNullable(additionalPaidInCapital))

        /**
         * Alias for calling [Builder.additionalPaidInCapital] with
         * `additionalPaidInCapital.orElse(null)`.
         */
        fun additionalPaidInCapital(additionalPaidInCapital: Optional<String>) =
            additionalPaidInCapital(additionalPaidInCapital.getOrNull())

        /**
         * Sets [Builder.additionalPaidInCapital] to an arbitrary JSON value.
         *
         * You should usually call [Builder.additionalPaidInCapital] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun additionalPaidInCapital(additionalPaidInCapital: JsonField<String>) = apply {
            this.additionalPaidInCapital = additionalPaidInCapital
        }

        /** Capital lease obligations (total) */
        fun capitalLeaseObligations(capitalLeaseObligations: String?) =
            capitalLeaseObligations(JsonField.ofNullable(capitalLeaseObligations))

        /**
         * Alias for calling [Builder.capitalLeaseObligations] with
         * `capitalLeaseObligations.orElse(null)`.
         */
        fun capitalLeaseObligations(capitalLeaseObligations: Optional<String>) =
            capitalLeaseObligations(capitalLeaseObligations.getOrNull())

        /**
         * Sets [Builder.capitalLeaseObligations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capitalLeaseObligations] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun capitalLeaseObligations(capitalLeaseObligations: JsonField<String>) = apply {
            this.capitalLeaseObligations = capitalLeaseObligations
        }

        /** Capital lease obligations (current portion) */
        fun capitalLeaseObligationsCurrent(capitalLeaseObligationsCurrent: String?) =
            capitalLeaseObligationsCurrent(JsonField.ofNullable(capitalLeaseObligationsCurrent))

        /**
         * Alias for calling [Builder.capitalLeaseObligationsCurrent] with
         * `capitalLeaseObligationsCurrent.orElse(null)`.
         */
        fun capitalLeaseObligationsCurrent(capitalLeaseObligationsCurrent: Optional<String>) =
            capitalLeaseObligationsCurrent(capitalLeaseObligationsCurrent.getOrNull())

        /**
         * Sets [Builder.capitalLeaseObligationsCurrent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.capitalLeaseObligationsCurrent] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun capitalLeaseObligationsCurrent(capitalLeaseObligationsCurrent: JsonField<String>) =
            apply {
                this.capitalLeaseObligationsCurrent = capitalLeaseObligationsCurrent
            }

        /** Cash and cash equivalents */
        fun cashAndCashEquivalents(cashAndCashEquivalents: String?) =
            cashAndCashEquivalents(JsonField.ofNullable(cashAndCashEquivalents))

        /**
         * Alias for calling [Builder.cashAndCashEquivalents] with
         * `cashAndCashEquivalents.orElse(null)`.
         */
        fun cashAndCashEquivalents(cashAndCashEquivalents: Optional<String>) =
            cashAndCashEquivalents(cashAndCashEquivalents.getOrNull())

        /**
         * Sets [Builder.cashAndCashEquivalents] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cashAndCashEquivalents] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cashAndCashEquivalents(cashAndCashEquivalents: JsonField<String>) = apply {
            this.cashAndCashEquivalents = cashAndCashEquivalents
        }

        /** Cash and short-term investments combined */
        fun cashAndShortTermInvestments(cashAndShortTermInvestments: String?) =
            cashAndShortTermInvestments(JsonField.ofNullable(cashAndShortTermInvestments))

        /**
         * Alias for calling [Builder.cashAndShortTermInvestments] with
         * `cashAndShortTermInvestments.orElse(null)`.
         */
        fun cashAndShortTermInvestments(cashAndShortTermInvestments: Optional<String>) =
            cashAndShortTermInvestments(cashAndShortTermInvestments.getOrNull())

        /**
         * Sets [Builder.cashAndShortTermInvestments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cashAndShortTermInvestments] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cashAndShortTermInvestments(cashAndShortTermInvestments: JsonField<String>) = apply {
            this.cashAndShortTermInvestments = cashAndShortTermInvestments
        }

        /** Common stock */
        fun commonStock(commonStock: String?) = commonStock(JsonField.ofNullable(commonStock))

        /** Alias for calling [Builder.commonStock] with `commonStock.orElse(null)`. */
        fun commonStock(commonStock: Optional<String>) = commonStock(commonStock.getOrNull())

        /**
         * Sets [Builder.commonStock] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commonStock] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commonStock(commonStock: JsonField<String>) = apply { this.commonStock = commonStock }

        /** Deferred revenue */
        fun deferredRevenue(deferredRevenue: String?) =
            deferredRevenue(JsonField.ofNullable(deferredRevenue))

        /** Alias for calling [Builder.deferredRevenue] with `deferredRevenue.orElse(null)`. */
        fun deferredRevenue(deferredRevenue: Optional<String>) =
            deferredRevenue(deferredRevenue.getOrNull())

        /**
         * Sets [Builder.deferredRevenue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deferredRevenue] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun deferredRevenue(deferredRevenue: JsonField<String>) = apply {
            this.deferredRevenue = deferredRevenue
        }

        /** Deferred revenue (non-current) */
        fun deferredRevenueNonCurrent(deferredRevenueNonCurrent: String?) =
            deferredRevenueNonCurrent(JsonField.ofNullable(deferredRevenueNonCurrent))

        /**
         * Alias for calling [Builder.deferredRevenueNonCurrent] with
         * `deferredRevenueNonCurrent.orElse(null)`.
         */
        fun deferredRevenueNonCurrent(deferredRevenueNonCurrent: Optional<String>) =
            deferredRevenueNonCurrent(deferredRevenueNonCurrent.getOrNull())

        /**
         * Sets [Builder.deferredRevenueNonCurrent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deferredRevenueNonCurrent] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun deferredRevenueNonCurrent(deferredRevenueNonCurrent: JsonField<String>) = apply {
            this.deferredRevenueNonCurrent = deferredRevenueNonCurrent
        }

        /** Deferred tax liabilities (non-current) */
        fun deferredTaxLiabilitiesNonCurrent(deferredTaxLiabilitiesNonCurrent: String?) =
            deferredTaxLiabilitiesNonCurrent(JsonField.ofNullable(deferredTaxLiabilitiesNonCurrent))

        /**
         * Alias for calling [Builder.deferredTaxLiabilitiesNonCurrent] with
         * `deferredTaxLiabilitiesNonCurrent.orElse(null)`.
         */
        fun deferredTaxLiabilitiesNonCurrent(deferredTaxLiabilitiesNonCurrent: Optional<String>) =
            deferredTaxLiabilitiesNonCurrent(deferredTaxLiabilitiesNonCurrent.getOrNull())

        /**
         * Sets [Builder.deferredTaxLiabilitiesNonCurrent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deferredTaxLiabilitiesNonCurrent] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun deferredTaxLiabilitiesNonCurrent(deferredTaxLiabilitiesNonCurrent: JsonField<String>) =
            apply {
                this.deferredTaxLiabilitiesNonCurrent = deferredTaxLiabilitiesNonCurrent
            }

        /** Goodwill */
        fun goodwill(goodwill: String?) = goodwill(JsonField.ofNullable(goodwill))

        /** Alias for calling [Builder.goodwill] with `goodwill.orElse(null)`. */
        fun goodwill(goodwill: Optional<String>) = goodwill(goodwill.getOrNull())

        /**
         * Sets [Builder.goodwill] to an arbitrary JSON value.
         *
         * You should usually call [Builder.goodwill] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun goodwill(goodwill: JsonField<String>) = apply { this.goodwill = goodwill }

        /** Goodwill and intangible assets combined */
        fun goodwillAndIntangibleAssets(goodwillAndIntangibleAssets: String?) =
            goodwillAndIntangibleAssets(JsonField.ofNullable(goodwillAndIntangibleAssets))

        /**
         * Alias for calling [Builder.goodwillAndIntangibleAssets] with
         * `goodwillAndIntangibleAssets.orElse(null)`.
         */
        fun goodwillAndIntangibleAssets(goodwillAndIntangibleAssets: Optional<String>) =
            goodwillAndIntangibleAssets(goodwillAndIntangibleAssets.getOrNull())

        /**
         * Sets [Builder.goodwillAndIntangibleAssets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.goodwillAndIntangibleAssets] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun goodwillAndIntangibleAssets(goodwillAndIntangibleAssets: JsonField<String>) = apply {
            this.goodwillAndIntangibleAssets = goodwillAndIntangibleAssets
        }

        /** Intangible assets */
        fun intangibleAssets(intangibleAssets: String?) =
            intangibleAssets(JsonField.ofNullable(intangibleAssets))

        /** Alias for calling [Builder.intangibleAssets] with `intangibleAssets.orElse(null)`. */
        fun intangibleAssets(intangibleAssets: Optional<String>) =
            intangibleAssets(intangibleAssets.getOrNull())

        /**
         * Sets [Builder.intangibleAssets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intangibleAssets] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intangibleAssets(intangibleAssets: JsonField<String>) = apply {
            this.intangibleAssets = intangibleAssets
        }

        /** Inventory */
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

        /** Long-term debt */
        fun longTermDebt(longTermDebt: String?) = longTermDebt(JsonField.ofNullable(longTermDebt))

        /** Alias for calling [Builder.longTermDebt] with `longTermDebt.orElse(null)`. */
        fun longTermDebt(longTermDebt: Optional<String>) = longTermDebt(longTermDebt.getOrNull())

        /**
         * Sets [Builder.longTermDebt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longTermDebt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun longTermDebt(longTermDebt: JsonField<String>) = apply {
            this.longTermDebt = longTermDebt
        }

        /** Long-term investments */
        fun longTermInvestments(longTermInvestments: String?) =
            longTermInvestments(JsonField.ofNullable(longTermInvestments))

        /**
         * Alias for calling [Builder.longTermInvestments] with `longTermInvestments.orElse(null)`.
         */
        fun longTermInvestments(longTermInvestments: Optional<String>) =
            longTermInvestments(longTermInvestments.getOrNull())

        /**
         * Sets [Builder.longTermInvestments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.longTermInvestments] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun longTermInvestments(longTermInvestments: JsonField<String>) = apply {
            this.longTermInvestments = longTermInvestments
        }

        /** Minority interest */
        fun minorityInterest(minorityInterest: String?) =
            minorityInterest(JsonField.ofNullable(minorityInterest))

        /** Alias for calling [Builder.minorityInterest] with `minorityInterest.orElse(null)`. */
        fun minorityInterest(minorityInterest: Optional<String>) =
            minorityInterest(minorityInterest.getOrNull())

        /**
         * Sets [Builder.minorityInterest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minorityInterest] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun minorityInterest(minorityInterest: JsonField<String>) = apply {
            this.minorityInterest = minorityInterest
        }

        /** Net debt (total debt minus cash) */
        fun netDebt(netDebt: String?) = netDebt(JsonField.ofNullable(netDebt))

        /** Alias for calling [Builder.netDebt] with `netDebt.orElse(null)`. */
        fun netDebt(netDebt: Optional<String>) = netDebt(netDebt.getOrNull())

        /**
         * Sets [Builder.netDebt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netDebt] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netDebt(netDebt: JsonField<String>) = apply { this.netDebt = netDebt }

        /** Net receivables */
        fun netReceivables(netReceivables: String?) =
            netReceivables(JsonField.ofNullable(netReceivables))

        /** Alias for calling [Builder.netReceivables] with `netReceivables.orElse(null)`. */
        fun netReceivables(netReceivables: Optional<String>) =
            netReceivables(netReceivables.getOrNull())

        /**
         * Sets [Builder.netReceivables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netReceivables] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netReceivables(netReceivables: JsonField<String>) = apply {
            this.netReceivables = netReceivables
        }

        /** Other assets */
        fun otherAssets(otherAssets: String?) = otherAssets(JsonField.ofNullable(otherAssets))

        /** Alias for calling [Builder.otherAssets] with `otherAssets.orElse(null)`. */
        fun otherAssets(otherAssets: Optional<String>) = otherAssets(otherAssets.getOrNull())

        /**
         * Sets [Builder.otherAssets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherAssets] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun otherAssets(otherAssets: JsonField<String>) = apply { this.otherAssets = otherAssets }

        /** Other current assets */
        fun otherCurrentAssets(otherCurrentAssets: String?) =
            otherCurrentAssets(JsonField.ofNullable(otherCurrentAssets))

        /**
         * Alias for calling [Builder.otherCurrentAssets] with `otherCurrentAssets.orElse(null)`.
         */
        fun otherCurrentAssets(otherCurrentAssets: Optional<String>) =
            otherCurrentAssets(otherCurrentAssets.getOrNull())

        /**
         * Sets [Builder.otherCurrentAssets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherCurrentAssets] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun otherCurrentAssets(otherCurrentAssets: JsonField<String>) = apply {
            this.otherCurrentAssets = otherCurrentAssets
        }

        /** Other current liabilities */
        fun otherCurrentLiabilities(otherCurrentLiabilities: String?) =
            otherCurrentLiabilities(JsonField.ofNullable(otherCurrentLiabilities))

        /**
         * Alias for calling [Builder.otherCurrentLiabilities] with
         * `otherCurrentLiabilities.orElse(null)`.
         */
        fun otherCurrentLiabilities(otherCurrentLiabilities: Optional<String>) =
            otherCurrentLiabilities(otherCurrentLiabilities.getOrNull())

        /**
         * Sets [Builder.otherCurrentLiabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherCurrentLiabilities] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun otherCurrentLiabilities(otherCurrentLiabilities: JsonField<String>) = apply {
            this.otherCurrentLiabilities = otherCurrentLiabilities
        }

        /** Other liabilities */
        fun otherLiabilities(otherLiabilities: String?) =
            otherLiabilities(JsonField.ofNullable(otherLiabilities))

        /** Alias for calling [Builder.otherLiabilities] with `otherLiabilities.orElse(null)`. */
        fun otherLiabilities(otherLiabilities: Optional<String>) =
            otherLiabilities(otherLiabilities.getOrNull())

        /**
         * Sets [Builder.otherLiabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherLiabilities] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun otherLiabilities(otherLiabilities: JsonField<String>) = apply {
            this.otherLiabilities = otherLiabilities
        }

        /** Other non-current assets */
        fun otherNonCurrentAssets(otherNonCurrentAssets: String?) =
            otherNonCurrentAssets(JsonField.ofNullable(otherNonCurrentAssets))

        /**
         * Alias for calling [Builder.otherNonCurrentAssets] with
         * `otherNonCurrentAssets.orElse(null)`.
         */
        fun otherNonCurrentAssets(otherNonCurrentAssets: Optional<String>) =
            otherNonCurrentAssets(otherNonCurrentAssets.getOrNull())

        /**
         * Sets [Builder.otherNonCurrentAssets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherNonCurrentAssets] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun otherNonCurrentAssets(otherNonCurrentAssets: JsonField<String>) = apply {
            this.otherNonCurrentAssets = otherNonCurrentAssets
        }

        /** Other non-current liabilities */
        fun otherNonCurrentLiabilities(otherNonCurrentLiabilities: String?) =
            otherNonCurrentLiabilities(JsonField.ofNullable(otherNonCurrentLiabilities))

        /**
         * Alias for calling [Builder.otherNonCurrentLiabilities] with
         * `otherNonCurrentLiabilities.orElse(null)`.
         */
        fun otherNonCurrentLiabilities(otherNonCurrentLiabilities: Optional<String>) =
            otherNonCurrentLiabilities(otherNonCurrentLiabilities.getOrNull())

        /**
         * Sets [Builder.otherNonCurrentLiabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherNonCurrentLiabilities] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun otherNonCurrentLiabilities(otherNonCurrentLiabilities: JsonField<String>) = apply {
            this.otherNonCurrentLiabilities = otherNonCurrentLiabilities
        }

        /** Other payables */
        fun otherPayables(otherPayables: String?) =
            otherPayables(JsonField.ofNullable(otherPayables))

        /** Alias for calling [Builder.otherPayables] with `otherPayables.orElse(null)`. */
        fun otherPayables(otherPayables: Optional<String>) =
            otherPayables(otherPayables.getOrNull())

        /**
         * Sets [Builder.otherPayables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherPayables] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun otherPayables(otherPayables: JsonField<String>) = apply {
            this.otherPayables = otherPayables
        }

        /** Other receivables */
        fun otherReceivables(otherReceivables: String?) =
            otherReceivables(JsonField.ofNullable(otherReceivables))

        /** Alias for calling [Builder.otherReceivables] with `otherReceivables.orElse(null)`. */
        fun otherReceivables(otherReceivables: Optional<String>) =
            otherReceivables(otherReceivables.getOrNull())

        /**
         * Sets [Builder.otherReceivables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherReceivables] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun otherReceivables(otherReceivables: JsonField<String>) = apply {
            this.otherReceivables = otherReceivables
        }

        /** Other total stockholders equity */
        fun otherTotalStockholdersEquity(otherTotalStockholdersEquity: String?) =
            otherTotalStockholdersEquity(JsonField.ofNullable(otherTotalStockholdersEquity))

        /**
         * Alias for calling [Builder.otherTotalStockholdersEquity] with
         * `otherTotalStockholdersEquity.orElse(null)`.
         */
        fun otherTotalStockholdersEquity(otherTotalStockholdersEquity: Optional<String>) =
            otherTotalStockholdersEquity(otherTotalStockholdersEquity.getOrNull())

        /**
         * Sets [Builder.otherTotalStockholdersEquity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otherTotalStockholdersEquity] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun otherTotalStockholdersEquity(otherTotalStockholdersEquity: JsonField<String>) = apply {
            this.otherTotalStockholdersEquity = otherTotalStockholdersEquity
        }

        /** Preferred stock */
        fun preferredStock(preferredStock: String?) =
            preferredStock(JsonField.ofNullable(preferredStock))

        /** Alias for calling [Builder.preferredStock] with `preferredStock.orElse(null)`. */
        fun preferredStock(preferredStock: Optional<String>) =
            preferredStock(preferredStock.getOrNull())

        /**
         * Sets [Builder.preferredStock] to an arbitrary JSON value.
         *
         * You should usually call [Builder.preferredStock] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun preferredStock(preferredStock: JsonField<String>) = apply {
            this.preferredStock = preferredStock
        }

        /** Prepaids */
        fun prepaids(prepaids: String?) = prepaids(JsonField.ofNullable(prepaids))

        /** Alias for calling [Builder.prepaids] with `prepaids.orElse(null)`. */
        fun prepaids(prepaids: Optional<String>) = prepaids(prepaids.getOrNull())

        /**
         * Sets [Builder.prepaids] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prepaids] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun prepaids(prepaids: JsonField<String>) = apply { this.prepaids = prepaids }

        /** Property, plant and equipment net of depreciation */
        fun propertyPlantAndEquipmentNet(propertyPlantAndEquipmentNet: String?) =
            propertyPlantAndEquipmentNet(JsonField.ofNullable(propertyPlantAndEquipmentNet))

        /**
         * Alias for calling [Builder.propertyPlantAndEquipmentNet] with
         * `propertyPlantAndEquipmentNet.orElse(null)`.
         */
        fun propertyPlantAndEquipmentNet(propertyPlantAndEquipmentNet: Optional<String>) =
            propertyPlantAndEquipmentNet(propertyPlantAndEquipmentNet.getOrNull())

        /**
         * Sets [Builder.propertyPlantAndEquipmentNet] to an arbitrary JSON value.
         *
         * You should usually call [Builder.propertyPlantAndEquipmentNet] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun propertyPlantAndEquipmentNet(propertyPlantAndEquipmentNet: JsonField<String>) = apply {
            this.propertyPlantAndEquipmentNet = propertyPlantAndEquipmentNet
        }

        /** Retained earnings */
        fun retainedEarnings(retainedEarnings: String?) =
            retainedEarnings(JsonField.ofNullable(retainedEarnings))

        /** Alias for calling [Builder.retainedEarnings] with `retainedEarnings.orElse(null)`. */
        fun retainedEarnings(retainedEarnings: Optional<String>) =
            retainedEarnings(retainedEarnings.getOrNull())

        /**
         * Sets [Builder.retainedEarnings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.retainedEarnings] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun retainedEarnings(retainedEarnings: JsonField<String>) = apply {
            this.retainedEarnings = retainedEarnings
        }

        /** Short-term debt */
        fun shortTermDebt(shortTermDebt: String?) =
            shortTermDebt(JsonField.ofNullable(shortTermDebt))

        /** Alias for calling [Builder.shortTermDebt] with `shortTermDebt.orElse(null)`. */
        fun shortTermDebt(shortTermDebt: Optional<String>) =
            shortTermDebt(shortTermDebt.getOrNull())

        /**
         * Sets [Builder.shortTermDebt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortTermDebt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun shortTermDebt(shortTermDebt: JsonField<String>) = apply {
            this.shortTermDebt = shortTermDebt
        }

        /** Short-term investments */
        fun shortTermInvestments(shortTermInvestments: String?) =
            shortTermInvestments(JsonField.ofNullable(shortTermInvestments))

        /**
         * Alias for calling [Builder.shortTermInvestments] with
         * `shortTermInvestments.orElse(null)`.
         */
        fun shortTermInvestments(shortTermInvestments: Optional<String>) =
            shortTermInvestments(shortTermInvestments.getOrNull())

        /**
         * Sets [Builder.shortTermInvestments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shortTermInvestments] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shortTermInvestments(shortTermInvestments: JsonField<String>) = apply {
            this.shortTermInvestments = shortTermInvestments
        }

        /** Tax assets */
        fun taxAssets(taxAssets: String?) = taxAssets(JsonField.ofNullable(taxAssets))

        /** Alias for calling [Builder.taxAssets] with `taxAssets.orElse(null)`. */
        fun taxAssets(taxAssets: Optional<String>) = taxAssets(taxAssets.getOrNull())

        /**
         * Sets [Builder.taxAssets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxAssets] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxAssets(taxAssets: JsonField<String>) = apply { this.taxAssets = taxAssets }

        /** Tax payables */
        fun taxPayables(taxPayables: String?) = taxPayables(JsonField.ofNullable(taxPayables))

        /** Alias for calling [Builder.taxPayables] with `taxPayables.orElse(null)`. */
        fun taxPayables(taxPayables: Optional<String>) = taxPayables(taxPayables.getOrNull())

        /**
         * Sets [Builder.taxPayables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxPayables] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxPayables(taxPayables: JsonField<String>) = apply { this.taxPayables = taxPayables }

        /** Total assets */
        fun totalAssets(totalAssets: String?) = totalAssets(JsonField.ofNullable(totalAssets))

        /** Alias for calling [Builder.totalAssets] with `totalAssets.orElse(null)`. */
        fun totalAssets(totalAssets: Optional<String>) = totalAssets(totalAssets.getOrNull())

        /**
         * Sets [Builder.totalAssets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalAssets] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalAssets(totalAssets: JsonField<String>) = apply { this.totalAssets = totalAssets }

        /** Total current assets */
        fun totalCurrentAssets(totalCurrentAssets: String?) =
            totalCurrentAssets(JsonField.ofNullable(totalCurrentAssets))

        /**
         * Alias for calling [Builder.totalCurrentAssets] with `totalCurrentAssets.orElse(null)`.
         */
        fun totalCurrentAssets(totalCurrentAssets: Optional<String>) =
            totalCurrentAssets(totalCurrentAssets.getOrNull())

        /**
         * Sets [Builder.totalCurrentAssets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCurrentAssets] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalCurrentAssets(totalCurrentAssets: JsonField<String>) = apply {
            this.totalCurrentAssets = totalCurrentAssets
        }

        /** Total current liabilities */
        fun totalCurrentLiabilities(totalCurrentLiabilities: String?) =
            totalCurrentLiabilities(JsonField.ofNullable(totalCurrentLiabilities))

        /**
         * Alias for calling [Builder.totalCurrentLiabilities] with
         * `totalCurrentLiabilities.orElse(null)`.
         */
        fun totalCurrentLiabilities(totalCurrentLiabilities: Optional<String>) =
            totalCurrentLiabilities(totalCurrentLiabilities.getOrNull())

        /**
         * Sets [Builder.totalCurrentLiabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalCurrentLiabilities] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun totalCurrentLiabilities(totalCurrentLiabilities: JsonField<String>) = apply {
            this.totalCurrentLiabilities = totalCurrentLiabilities
        }

        /** Total debt */
        fun totalDebt(totalDebt: String?) = totalDebt(JsonField.ofNullable(totalDebt))

        /** Alias for calling [Builder.totalDebt] with `totalDebt.orElse(null)`. */
        fun totalDebt(totalDebt: Optional<String>) = totalDebt(totalDebt.getOrNull())

        /**
         * Sets [Builder.totalDebt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalDebt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalDebt(totalDebt: JsonField<String>) = apply { this.totalDebt = totalDebt }

        /** Total equity */
        fun totalEquity(totalEquity: String?) = totalEquity(JsonField.ofNullable(totalEquity))

        /** Alias for calling [Builder.totalEquity] with `totalEquity.orElse(null)`. */
        fun totalEquity(totalEquity: Optional<String>) = totalEquity(totalEquity.getOrNull())

        /**
         * Sets [Builder.totalEquity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalEquity] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalEquity(totalEquity: JsonField<String>) = apply { this.totalEquity = totalEquity }

        /** Total investments */
        fun totalInvestments(totalInvestments: String?) =
            totalInvestments(JsonField.ofNullable(totalInvestments))

        /** Alias for calling [Builder.totalInvestments] with `totalInvestments.orElse(null)`. */
        fun totalInvestments(totalInvestments: Optional<String>) =
            totalInvestments(totalInvestments.getOrNull())

        /**
         * Sets [Builder.totalInvestments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalInvestments] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalInvestments(totalInvestments: JsonField<String>) = apply {
            this.totalInvestments = totalInvestments
        }

        /** Total liabilities */
        fun totalLiabilities(totalLiabilities: String?) =
            totalLiabilities(JsonField.ofNullable(totalLiabilities))

        /** Alias for calling [Builder.totalLiabilities] with `totalLiabilities.orElse(null)`. */
        fun totalLiabilities(totalLiabilities: Optional<String>) =
            totalLiabilities(totalLiabilities.getOrNull())

        /**
         * Sets [Builder.totalLiabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalLiabilities] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalLiabilities(totalLiabilities: JsonField<String>) = apply {
            this.totalLiabilities = totalLiabilities
        }

        /** Total liabilities and total equity */
        fun totalLiabilitiesAndTotalEquity(totalLiabilitiesAndTotalEquity: String?) =
            totalLiabilitiesAndTotalEquity(JsonField.ofNullable(totalLiabilitiesAndTotalEquity))

        /**
         * Alias for calling [Builder.totalLiabilitiesAndTotalEquity] with
         * `totalLiabilitiesAndTotalEquity.orElse(null)`.
         */
        fun totalLiabilitiesAndTotalEquity(totalLiabilitiesAndTotalEquity: Optional<String>) =
            totalLiabilitiesAndTotalEquity(totalLiabilitiesAndTotalEquity.getOrNull())

        /**
         * Sets [Builder.totalLiabilitiesAndTotalEquity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalLiabilitiesAndTotalEquity] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun totalLiabilitiesAndTotalEquity(totalLiabilitiesAndTotalEquity: JsonField<String>) =
            apply {
                this.totalLiabilitiesAndTotalEquity = totalLiabilitiesAndTotalEquity
            }

        /** Total non-current assets */
        fun totalNonCurrentAssets(totalNonCurrentAssets: String?) =
            totalNonCurrentAssets(JsonField.ofNullable(totalNonCurrentAssets))

        /**
         * Alias for calling [Builder.totalNonCurrentAssets] with
         * `totalNonCurrentAssets.orElse(null)`.
         */
        fun totalNonCurrentAssets(totalNonCurrentAssets: Optional<String>) =
            totalNonCurrentAssets(totalNonCurrentAssets.getOrNull())

        /**
         * Sets [Builder.totalNonCurrentAssets] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalNonCurrentAssets] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalNonCurrentAssets(totalNonCurrentAssets: JsonField<String>) = apply {
            this.totalNonCurrentAssets = totalNonCurrentAssets
        }

        /** Total non-current liabilities */
        fun totalNonCurrentLiabilities(totalNonCurrentLiabilities: String?) =
            totalNonCurrentLiabilities(JsonField.ofNullable(totalNonCurrentLiabilities))

        /**
         * Alias for calling [Builder.totalNonCurrentLiabilities] with
         * `totalNonCurrentLiabilities.orElse(null)`.
         */
        fun totalNonCurrentLiabilities(totalNonCurrentLiabilities: Optional<String>) =
            totalNonCurrentLiabilities(totalNonCurrentLiabilities.getOrNull())

        /**
         * Sets [Builder.totalNonCurrentLiabilities] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalNonCurrentLiabilities] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun totalNonCurrentLiabilities(totalNonCurrentLiabilities: JsonField<String>) = apply {
            this.totalNonCurrentLiabilities = totalNonCurrentLiabilities
        }

        /** Total payables */
        fun totalPayables(totalPayables: String?) =
            totalPayables(JsonField.ofNullable(totalPayables))

        /** Alias for calling [Builder.totalPayables] with `totalPayables.orElse(null)`. */
        fun totalPayables(totalPayables: Optional<String>) =
            totalPayables(totalPayables.getOrNull())

        /**
         * Sets [Builder.totalPayables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalPayables] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalPayables(totalPayables: JsonField<String>) = apply {
            this.totalPayables = totalPayables
        }

        /** Total stockholders equity */
        fun totalStockholdersEquity(totalStockholdersEquity: String?) =
            totalStockholdersEquity(JsonField.ofNullable(totalStockholdersEquity))

        /**
         * Alias for calling [Builder.totalStockholdersEquity] with
         * `totalStockholdersEquity.orElse(null)`.
         */
        fun totalStockholdersEquity(totalStockholdersEquity: Optional<String>) =
            totalStockholdersEquity(totalStockholdersEquity.getOrNull())

        /**
         * Sets [Builder.totalStockholdersEquity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalStockholdersEquity] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun totalStockholdersEquity(totalStockholdersEquity: JsonField<String>) = apply {
            this.totalStockholdersEquity = totalStockholdersEquity
        }

        /** Treasury stock */
        fun treasuryStock(treasuryStock: String?) =
            treasuryStock(JsonField.ofNullable(treasuryStock))

        /** Alias for calling [Builder.treasuryStock] with `treasuryStock.orElse(null)`. */
        fun treasuryStock(treasuryStock: Optional<String>) =
            treasuryStock(treasuryStock.getOrNull())

        /**
         * Sets [Builder.treasuryStock] to an arbitrary JSON value.
         *
         * You should usually call [Builder.treasuryStock] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun treasuryStock(treasuryStock: JsonField<String>) = apply {
            this.treasuryStock = treasuryStock
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
         * Returns an immutable instance of [InstrumentBalanceSheetStatement].
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
        fun build(): InstrumentBalanceSheetStatement =
            InstrumentBalanceSheetStatement(
                checkRequired("acceptedDate", acceptedDate),
                checkRequired("filingDate", filingDate),
                checkRequired("period", period),
                checkRequired("periodType", periodType),
                checkRequired("reportedCurrency", reportedCurrency),
                checkRequired("year", year),
                accountPayables,
                accountsReceivables,
                accruedExpenses,
                accumulatedOtherComprehensiveIncomeLoss,
                additionalPaidInCapital,
                capitalLeaseObligations,
                capitalLeaseObligationsCurrent,
                cashAndCashEquivalents,
                cashAndShortTermInvestments,
                commonStock,
                deferredRevenue,
                deferredRevenueNonCurrent,
                deferredTaxLiabilitiesNonCurrent,
                goodwill,
                goodwillAndIntangibleAssets,
                intangibleAssets,
                inventory,
                longTermDebt,
                longTermInvestments,
                minorityInterest,
                netDebt,
                netReceivables,
                otherAssets,
                otherCurrentAssets,
                otherCurrentLiabilities,
                otherLiabilities,
                otherNonCurrentAssets,
                otherNonCurrentLiabilities,
                otherPayables,
                otherReceivables,
                otherTotalStockholdersEquity,
                preferredStock,
                prepaids,
                propertyPlantAndEquipmentNet,
                retainedEarnings,
                shortTermDebt,
                shortTermInvestments,
                taxAssets,
                taxPayables,
                totalAssets,
                totalCurrentAssets,
                totalCurrentLiabilities,
                totalDebt,
                totalEquity,
                totalInvestments,
                totalLiabilities,
                totalLiabilitiesAndTotalEquity,
                totalNonCurrentAssets,
                totalNonCurrentLiabilities,
                totalPayables,
                totalStockholdersEquity,
                treasuryStock,
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
    fun validate(): InstrumentBalanceSheetStatement = apply {
        if (validated) {
            return@apply
        }

        acceptedDate()
        filingDate()
        period()
        periodType().validate()
        reportedCurrency()
        year()
        accountPayables()
        accountsReceivables()
        accruedExpenses()
        accumulatedOtherComprehensiveIncomeLoss()
        additionalPaidInCapital()
        capitalLeaseObligations()
        capitalLeaseObligationsCurrent()
        cashAndCashEquivalents()
        cashAndShortTermInvestments()
        commonStock()
        deferredRevenue()
        deferredRevenueNonCurrent()
        deferredTaxLiabilitiesNonCurrent()
        goodwill()
        goodwillAndIntangibleAssets()
        intangibleAssets()
        inventory()
        longTermDebt()
        longTermInvestments()
        minorityInterest()
        netDebt()
        netReceivables()
        otherAssets()
        otherCurrentAssets()
        otherCurrentLiabilities()
        otherLiabilities()
        otherNonCurrentAssets()
        otherNonCurrentLiabilities()
        otherPayables()
        otherReceivables()
        otherTotalStockholdersEquity()
        preferredStock()
        prepaids()
        propertyPlantAndEquipmentNet()
        retainedEarnings()
        shortTermDebt()
        shortTermInvestments()
        taxAssets()
        taxPayables()
        totalAssets()
        totalCurrentAssets()
        totalCurrentLiabilities()
        totalDebt()
        totalEquity()
        totalInvestments()
        totalLiabilities()
        totalLiabilitiesAndTotalEquity()
        totalNonCurrentAssets()
        totalNonCurrentLiabilities()
        totalPayables()
        totalStockholdersEquity()
        treasuryStock()
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
            (if (accountPayables.asKnown().isPresent) 1 else 0) +
            (if (accountsReceivables.asKnown().isPresent) 1 else 0) +
            (if (accruedExpenses.asKnown().isPresent) 1 else 0) +
            (if (accumulatedOtherComprehensiveIncomeLoss.asKnown().isPresent) 1 else 0) +
            (if (additionalPaidInCapital.asKnown().isPresent) 1 else 0) +
            (if (capitalLeaseObligations.asKnown().isPresent) 1 else 0) +
            (if (capitalLeaseObligationsCurrent.asKnown().isPresent) 1 else 0) +
            (if (cashAndCashEquivalents.asKnown().isPresent) 1 else 0) +
            (if (cashAndShortTermInvestments.asKnown().isPresent) 1 else 0) +
            (if (commonStock.asKnown().isPresent) 1 else 0) +
            (if (deferredRevenue.asKnown().isPresent) 1 else 0) +
            (if (deferredRevenueNonCurrent.asKnown().isPresent) 1 else 0) +
            (if (deferredTaxLiabilitiesNonCurrent.asKnown().isPresent) 1 else 0) +
            (if (goodwill.asKnown().isPresent) 1 else 0) +
            (if (goodwillAndIntangibleAssets.asKnown().isPresent) 1 else 0) +
            (if (intangibleAssets.asKnown().isPresent) 1 else 0) +
            (if (inventory.asKnown().isPresent) 1 else 0) +
            (if (longTermDebt.asKnown().isPresent) 1 else 0) +
            (if (longTermInvestments.asKnown().isPresent) 1 else 0) +
            (if (minorityInterest.asKnown().isPresent) 1 else 0) +
            (if (netDebt.asKnown().isPresent) 1 else 0) +
            (if (netReceivables.asKnown().isPresent) 1 else 0) +
            (if (otherAssets.asKnown().isPresent) 1 else 0) +
            (if (otherCurrentAssets.asKnown().isPresent) 1 else 0) +
            (if (otherCurrentLiabilities.asKnown().isPresent) 1 else 0) +
            (if (otherLiabilities.asKnown().isPresent) 1 else 0) +
            (if (otherNonCurrentAssets.asKnown().isPresent) 1 else 0) +
            (if (otherNonCurrentLiabilities.asKnown().isPresent) 1 else 0) +
            (if (otherPayables.asKnown().isPresent) 1 else 0) +
            (if (otherReceivables.asKnown().isPresent) 1 else 0) +
            (if (otherTotalStockholdersEquity.asKnown().isPresent) 1 else 0) +
            (if (preferredStock.asKnown().isPresent) 1 else 0) +
            (if (prepaids.asKnown().isPresent) 1 else 0) +
            (if (propertyPlantAndEquipmentNet.asKnown().isPresent) 1 else 0) +
            (if (retainedEarnings.asKnown().isPresent) 1 else 0) +
            (if (shortTermDebt.asKnown().isPresent) 1 else 0) +
            (if (shortTermInvestments.asKnown().isPresent) 1 else 0) +
            (if (taxAssets.asKnown().isPresent) 1 else 0) +
            (if (taxPayables.asKnown().isPresent) 1 else 0) +
            (if (totalAssets.asKnown().isPresent) 1 else 0) +
            (if (totalCurrentAssets.asKnown().isPresent) 1 else 0) +
            (if (totalCurrentLiabilities.asKnown().isPresent) 1 else 0) +
            (if (totalDebt.asKnown().isPresent) 1 else 0) +
            (if (totalEquity.asKnown().isPresent) 1 else 0) +
            (if (totalInvestments.asKnown().isPresent) 1 else 0) +
            (if (totalLiabilities.asKnown().isPresent) 1 else 0) +
            (if (totalLiabilitiesAndTotalEquity.asKnown().isPresent) 1 else 0) +
            (if (totalNonCurrentAssets.asKnown().isPresent) 1 else 0) +
            (if (totalNonCurrentLiabilities.asKnown().isPresent) 1 else 0) +
            (if (totalPayables.asKnown().isPresent) 1 else 0) +
            (if (totalStockholdersEquity.asKnown().isPresent) 1 else 0) +
            (if (treasuryStock.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InstrumentBalanceSheetStatement &&
            acceptedDate == other.acceptedDate &&
            filingDate == other.filingDate &&
            period == other.period &&
            periodType == other.periodType &&
            reportedCurrency == other.reportedCurrency &&
            year == other.year &&
            accountPayables == other.accountPayables &&
            accountsReceivables == other.accountsReceivables &&
            accruedExpenses == other.accruedExpenses &&
            accumulatedOtherComprehensiveIncomeLoss ==
                other.accumulatedOtherComprehensiveIncomeLoss &&
            additionalPaidInCapital == other.additionalPaidInCapital &&
            capitalLeaseObligations == other.capitalLeaseObligations &&
            capitalLeaseObligationsCurrent == other.capitalLeaseObligationsCurrent &&
            cashAndCashEquivalents == other.cashAndCashEquivalents &&
            cashAndShortTermInvestments == other.cashAndShortTermInvestments &&
            commonStock == other.commonStock &&
            deferredRevenue == other.deferredRevenue &&
            deferredRevenueNonCurrent == other.deferredRevenueNonCurrent &&
            deferredTaxLiabilitiesNonCurrent == other.deferredTaxLiabilitiesNonCurrent &&
            goodwill == other.goodwill &&
            goodwillAndIntangibleAssets == other.goodwillAndIntangibleAssets &&
            intangibleAssets == other.intangibleAssets &&
            inventory == other.inventory &&
            longTermDebt == other.longTermDebt &&
            longTermInvestments == other.longTermInvestments &&
            minorityInterest == other.minorityInterest &&
            netDebt == other.netDebt &&
            netReceivables == other.netReceivables &&
            otherAssets == other.otherAssets &&
            otherCurrentAssets == other.otherCurrentAssets &&
            otherCurrentLiabilities == other.otherCurrentLiabilities &&
            otherLiabilities == other.otherLiabilities &&
            otherNonCurrentAssets == other.otherNonCurrentAssets &&
            otherNonCurrentLiabilities == other.otherNonCurrentLiabilities &&
            otherPayables == other.otherPayables &&
            otherReceivables == other.otherReceivables &&
            otherTotalStockholdersEquity == other.otherTotalStockholdersEquity &&
            preferredStock == other.preferredStock &&
            prepaids == other.prepaids &&
            propertyPlantAndEquipmentNet == other.propertyPlantAndEquipmentNet &&
            retainedEarnings == other.retainedEarnings &&
            shortTermDebt == other.shortTermDebt &&
            shortTermInvestments == other.shortTermInvestments &&
            taxAssets == other.taxAssets &&
            taxPayables == other.taxPayables &&
            totalAssets == other.totalAssets &&
            totalCurrentAssets == other.totalCurrentAssets &&
            totalCurrentLiabilities == other.totalCurrentLiabilities &&
            totalDebt == other.totalDebt &&
            totalEquity == other.totalEquity &&
            totalInvestments == other.totalInvestments &&
            totalLiabilities == other.totalLiabilities &&
            totalLiabilitiesAndTotalEquity == other.totalLiabilitiesAndTotalEquity &&
            totalNonCurrentAssets == other.totalNonCurrentAssets &&
            totalNonCurrentLiabilities == other.totalNonCurrentLiabilities &&
            totalPayables == other.totalPayables &&
            totalStockholdersEquity == other.totalStockholdersEquity &&
            treasuryStock == other.treasuryStock &&
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
            accountPayables,
            accountsReceivables,
            accruedExpenses,
            accumulatedOtherComprehensiveIncomeLoss,
            additionalPaidInCapital,
            capitalLeaseObligations,
            capitalLeaseObligationsCurrent,
            cashAndCashEquivalents,
            cashAndShortTermInvestments,
            commonStock,
            deferredRevenue,
            deferredRevenueNonCurrent,
            deferredTaxLiabilitiesNonCurrent,
            goodwill,
            goodwillAndIntangibleAssets,
            intangibleAssets,
            inventory,
            longTermDebt,
            longTermInvestments,
            minorityInterest,
            netDebt,
            netReceivables,
            otherAssets,
            otherCurrentAssets,
            otherCurrentLiabilities,
            otherLiabilities,
            otherNonCurrentAssets,
            otherNonCurrentLiabilities,
            otherPayables,
            otherReceivables,
            otherTotalStockholdersEquity,
            preferredStock,
            prepaids,
            propertyPlantAndEquipmentNet,
            retainedEarnings,
            shortTermDebt,
            shortTermInvestments,
            taxAssets,
            taxPayables,
            totalAssets,
            totalCurrentAssets,
            totalCurrentLiabilities,
            totalDebt,
            totalEquity,
            totalInvestments,
            totalLiabilities,
            totalLiabilitiesAndTotalEquity,
            totalNonCurrentAssets,
            totalNonCurrentLiabilities,
            totalPayables,
            totalStockholdersEquity,
            treasuryStock,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InstrumentBalanceSheetStatement{acceptedDate=$acceptedDate, filingDate=$filingDate, period=$period, periodType=$periodType, reportedCurrency=$reportedCurrency, year=$year, accountPayables=$accountPayables, accountsReceivables=$accountsReceivables, accruedExpenses=$accruedExpenses, accumulatedOtherComprehensiveIncomeLoss=$accumulatedOtherComprehensiveIncomeLoss, additionalPaidInCapital=$additionalPaidInCapital, capitalLeaseObligations=$capitalLeaseObligations, capitalLeaseObligationsCurrent=$capitalLeaseObligationsCurrent, cashAndCashEquivalents=$cashAndCashEquivalents, cashAndShortTermInvestments=$cashAndShortTermInvestments, commonStock=$commonStock, deferredRevenue=$deferredRevenue, deferredRevenueNonCurrent=$deferredRevenueNonCurrent, deferredTaxLiabilitiesNonCurrent=$deferredTaxLiabilitiesNonCurrent, goodwill=$goodwill, goodwillAndIntangibleAssets=$goodwillAndIntangibleAssets, intangibleAssets=$intangibleAssets, inventory=$inventory, longTermDebt=$longTermDebt, longTermInvestments=$longTermInvestments, minorityInterest=$minorityInterest, netDebt=$netDebt, netReceivables=$netReceivables, otherAssets=$otherAssets, otherCurrentAssets=$otherCurrentAssets, otherCurrentLiabilities=$otherCurrentLiabilities, otherLiabilities=$otherLiabilities, otherNonCurrentAssets=$otherNonCurrentAssets, otherNonCurrentLiabilities=$otherNonCurrentLiabilities, otherPayables=$otherPayables, otherReceivables=$otherReceivables, otherTotalStockholdersEquity=$otherTotalStockholdersEquity, preferredStock=$preferredStock, prepaids=$prepaids, propertyPlantAndEquipmentNet=$propertyPlantAndEquipmentNet, retainedEarnings=$retainedEarnings, shortTermDebt=$shortTermDebt, shortTermInvestments=$shortTermInvestments, taxAssets=$taxAssets, taxPayables=$taxPayables, totalAssets=$totalAssets, totalCurrentAssets=$totalCurrentAssets, totalCurrentLiabilities=$totalCurrentLiabilities, totalDebt=$totalDebt, totalEquity=$totalEquity, totalInvestments=$totalInvestments, totalLiabilities=$totalLiabilities, totalLiabilitiesAndTotalEquity=$totalLiabilitiesAndTotalEquity, totalNonCurrentAssets=$totalNonCurrentAssets, totalNonCurrentLiabilities=$totalNonCurrentLiabilities, totalPayables=$totalPayables, totalStockholdersEquity=$totalStockholdersEquity, treasuryStock=$treasuryStock, additionalProperties=$additionalProperties}"
}
