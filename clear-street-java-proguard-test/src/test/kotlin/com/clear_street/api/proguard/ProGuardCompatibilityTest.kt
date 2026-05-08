// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.proguard

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.SecurityType
import com.clear_street.api.models.v1.accounts.Account
import com.clear_street.api.models.v1.accounts.AccountStatus
import com.clear_street.api.models.v1.accounts.AccountSubtype
import com.clear_street.api.models.v1.accounts.AccountType
import com.clear_street.api.models.v1.omniai.PrefillOrderAction
import com.clear_street.api.models.v1.orders.NewOrderRequest
import com.clear_street.api.models.v1.orders.PositionEffect
import com.clear_street.api.models.v1.orders.RequestOrderType
import com.clear_street.api.models.v1.orders.RequestTimeInForce
import com.clear_street.api.models.v1.orders.Side
import com.clear_street.api.models.v1.orders.TrailingOffsetType
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream(
                "META-INF/proguard/clear-street-java-core.pro"
            )

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = ClearStreetOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.v1()).isNotNull()
    }

    @Test
    fun accountRoundtrip() {
        val jsonMapper = jsonMapper()
        val account =
            Account.builder()
                .id(19816L)
                .accountHolderEntityId(987654321L)
                .fullName("Test Trading Account")
                .openDate(LocalDate.parse("2023-01-15"))
                .optionsLevel(1L)
                .shortName("TST-ACCOUNT-01")
                .status(AccountStatus.ACTIVE)
                .subtype(AccountSubtype.MARGIN)
                .type(AccountType.CUSTOMER)
                .closeDate(null)
                .build()

        val roundtrippedAccount =
            jsonMapper.readValue(jsonMapper.writeValueAsString(account), jacksonTypeRef<Account>())

        assertThat(roundtrippedAccount).isEqualTo(account)
    }

    @Test
    fun prefillOrderActionRoundtrip() {
        val jsonMapper = jsonMapper()
        val prefillOrderAction =
            PrefillOrderAction.ofPrefillNewOrderAction(
                PrefillOrderAction.PrefillNewOrderAction.builder()
                    .addOrder(
                        NewOrderRequest.builder()
                            .instrumentType(SecurityType.COMMON_STOCK)
                            .orderType(RequestOrderType.LIMIT)
                            .quantity("100")
                            .side(Side.BUY)
                            .timeInForce(RequestTimeInForce.DAY)
                            .id("my-ref-id-20251001-002")
                            .expiresAt(OffsetDateTime.parse("2025-10-15T16:00:00.000000000Z"))
                            .extendedHours(true)
                            .instrumentId("f47ac10b-58cc-4372-a567-0e02b2c3d479")
                            .limitOffset("0.10")
                            .limitPrice("150.00")
                            .positionEffect(PositionEffect.OPEN)
                            .stopPrice("135.00")
                            .symbol("AAPL")
                            .trailingOffset("1.25")
                            .trailingOffsetType(TrailingOffsetType.PRICE)
                            .build()
                    )
                    .actionType(PrefillOrderAction.PrefillNewOrderAction.ActionType.NEW)
                    .build()
            )

        val roundtrippedPrefillOrderAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(prefillOrderAction),
                jacksonTypeRef<PrefillOrderAction>(),
            )

        assertThat(roundtrippedPrefillOrderAction).isEqualTo(prefillOrderAction)
    }

    @Test
    fun accountStatusRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountStatus = AccountStatus.ACTIVE

        val roundtrippedAccountStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountStatus),
                jacksonTypeRef<AccountStatus>(),
            )

        assertThat(roundtrippedAccountStatus).isEqualTo(accountStatus)
    }
}
