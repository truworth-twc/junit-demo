package com.junittest

import org.junit.Test
import com.google.common.truth.Truth.assertThat

class RegistrationUtilTest{
    @Test
    fun emptyUsernameReturnFalse(){
        // Pass the value to the function of RegistrationUtil class
        // since RegistrationUtil is an object/ singleton we do not need to create its object
        val result = RegistrationUtil.validRegistrationInput(
            "",
            "123",
            "123"
        )
        // assertThat() comes from the truth library that we added earlier
        // put result in it and assign the boolean that it should return
        assertThat(result).isFalse()
    }
    @Test
    fun usernameAlreadyTakenReturnFalse() {
        val result = RegistrationUtil.validRegistrationInput(
            "Rohan",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun incorrectConfirmPasswordReturnFalse() {
        val result = RegistrationUtil.validRegistrationInput(
            "Rahul",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }
    @Test
    fun lessThanTwoDigitPasswordReturnFalse() {
        val result = RegistrationUtil.validRegistrationInput(
            "Rahul",
            "abcd1",
            "abcd1"
        )
        assertThat(result).isFalse()
    }
}