// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.proguard

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.active.v1.accounts.Account
import com.clear_street.api.models.active.v1.accounts.AccountKind
import com.clear_street.api.models.active.v1.accounts.AccountStatus
import com.clear_street.api.models.active.v1.accounts.AccountSubkind
import com.clear_street.api.models.active.v1.accounts.orders.OrderStrategy
import com.clear_street.api.models.active.v1.accounts.orders.Urgency
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
        assertThat(client.active()).isNotNull()
    }

    @Test
    fun accountRoundtrip() {
        val jsonMapper = jsonMapper()
        val account =
            Account.builder()
                .id(19816L)
                .accountHolderEntityId(987654321L)
                .fullName("Test Trading Account")
                .kind(AccountKind.CUSTOMER)
                .openDate(LocalDate.parse("2023-01-15"))
                .shortName("TST-ACCOUNT-01")
                .status(AccountStatus.ACTIVE)
                .subkind(AccountSubkind.MARGIN)
                .closeDate(null)
                .build()

        val roundtrippedAccount =
            jsonMapper.readValue(jsonMapper.writeValueAsString(account), jacksonTypeRef<Account>())

        assertThat(roundtrippedAccount).isEqualTo(account)
    }

    @Test
    fun orderStrategyRoundtrip() {
        val jsonMapper = jsonMapper()
        val orderStrategy =
            OrderStrategy.ofSor(
                OrderStrategy.Sor.builder()
                    .endAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .urgency(Urgency.SUPER_PASSIVE)
                    .type(OrderStrategy.Sor.Type.SOR)
                    .build()
            )

        val roundtrippedOrderStrategy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(orderStrategy),
                jacksonTypeRef<OrderStrategy>(),
            )

        assertThat(roundtrippedOrderStrategy).isEqualTo(orderStrategy)
    }

    @Test
    fun accountKindRoundtrip() {
        val jsonMapper = jsonMapper()
        val accountKind = AccountKind.HOUSE

        val roundtrippedAccountKind =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountKind),
                jacksonTypeRef<AccountKind>(),
            )

        assertThat(roundtrippedAccountKind).isEqualTo(accountKind)
    }
}
