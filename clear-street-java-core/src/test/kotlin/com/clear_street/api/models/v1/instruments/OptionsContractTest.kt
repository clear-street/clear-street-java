// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.models.v1.instruments

import com.clear_street.api.core.jsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OptionsContractTest {

    @Test
    fun create() {
        val optionsContract =
            OptionsContract.builder()
                .id("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
                .contractType(ContractType.CALL)
                .currency("USD")
                .exchange("BATO")
                .exerciseStyle(ExerciseStyle.AMERICAN)
                .expiry(LocalDate.parse("2026-03-18"))
                .isLiquidationOnly(true)
                .isMarginable(true)
                .isRestricted(true)
                .listingType(ListingType.STANDARD)
                .multiplier("100")
                .strikePrice("150.00")
                .symbol("AAPL  251219C00150000")
                .openInterest(0L)
                .underlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(optionsContract.id()).isEqualTo("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
        assertThat(optionsContract.contractType()).isEqualTo(ContractType.CALL)
        assertThat(optionsContract.currency()).isEqualTo("USD")
        assertThat(optionsContract.exchange()).isEqualTo("BATO")
        assertThat(optionsContract.exerciseStyle()).isEqualTo(ExerciseStyle.AMERICAN)
        assertThat(optionsContract.expiry()).isEqualTo(LocalDate.parse("2026-03-18"))
        assertThat(optionsContract.isLiquidationOnly()).isEqualTo(true)
        assertThat(optionsContract.isMarginable()).isEqualTo(true)
        assertThat(optionsContract.isRestricted()).isEqualTo(true)
        assertThat(optionsContract.listingType()).isEqualTo(ListingType.STANDARD)
        assertThat(optionsContract.multiplier()).isEqualTo("100")
        assertThat(optionsContract.strikePrice()).isEqualTo("150.00")
        assertThat(optionsContract.symbol()).isEqualTo("AAPL  251219C00150000")
        assertThat(optionsContract.openInterest()).contains(0L)
        assertThat(optionsContract.underlyingInstrumentId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val optionsContract =
            OptionsContract.builder()
                .id("b6f4b5e2-94a8-4fe4-9a85-2b4a81d30cc5")
                .contractType(ContractType.CALL)
                .currency("USD")
                .exchange("BATO")
                .exerciseStyle(ExerciseStyle.AMERICAN)
                .expiry(LocalDate.parse("2026-03-18"))
                .isLiquidationOnly(true)
                .isMarginable(true)
                .isRestricted(true)
                .listingType(ListingType.STANDARD)
                .multiplier("100")
                .strikePrice("150.00")
                .symbol("AAPL  251219C00150000")
                .openInterest(0L)
                .underlyingInstrumentId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val roundtrippedOptionsContract =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(optionsContract),
                jacksonTypeRef<OptionsContract>(),
            )

        assertThat(roundtrippedOptionsContract).isEqualTo(optionsContract)
    }
}
