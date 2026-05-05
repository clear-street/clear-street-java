// File generated from our OpenAPI spec by Stainless.

package com.clear_street.api.proguard

import com.clear_street.api.client.okhttp.ClearStreetOkHttpClient
import com.clear_street.api.core.jsonMapper
import com.clear_street.api.models.v1.accounts.Account
import com.clear_street.api.models.v1.accounts.AccountKind
import com.clear_street.api.models.v1.accounts.AccountStatus
import com.clear_street.api.models.v1.accounts.AccountSubkind
import com.clear_street.api.models.v1.omniai.MessageContentPart
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
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
                .kind(AccountKind.CUSTOMER)
                .openDate(LocalDate.parse("2023-01-15"))
                .optionsLevel(1L)
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
    fun messageContentPartRoundtrip() {
        val jsonMapper = jsonMapper()
        val messageContentPart =
            MessageContentPart.ofUnionMember0(
                MessageContentPart.UnionMember0.builder()
                    .text("text")
                    .type(MessageContentPart.UnionMember0.Type.TEXT)
                    .build()
            )

        val roundtrippedMessageContentPart =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(messageContentPart),
                jacksonTypeRef<MessageContentPart>(),
            )

        assertThat(roundtrippedMessageContentPart).isEqualTo(messageContentPart)
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
