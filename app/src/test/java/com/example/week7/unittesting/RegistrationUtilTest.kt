package com.example.week7.unittesting

import com.google.common.truth.Truth.assertThat
import junit.framework.TestCase
import org.junit.Test


open class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123" ,
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123" ,
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Aditya",
            "" ,
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Aditya",
            "123" ,
            "abc"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digits in password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Aditya",
            "abc1" ,
            "abc1"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password  returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Neeraj",
            "123" ,
            "123"
        )
        assertThat(result).isTrue()
    }


}