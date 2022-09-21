package com.example.week7.Espresso

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.week7.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class AnotherActivityTest{

    @get:Rule
    var activityScenarioRule = activityScenarioRule<AnotherActivity>()

    @Test
    fun checkActivityVisibility() {
        Espresso.onView(ViewMatchers.withId(R.id.layout_anotherActivity))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun checkingTexttVisibility() {
        Espresso.onView(ViewMatchers.withId(R.id.tvAnotherActivity))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        //checking if our button is visible
        Espresso.onView(ViewMatchers.withId(R.id.btnAnotherActivity))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun testTextIsEspressoActivity() {
        Espresso.onView(ViewMatchers.withId(R.id.tvAnotherActivity))
            .check(
                ViewAssertions.matches(
                    ViewMatchers.withText(
                        R.string.another_activity
                    )
                )
            )
    }

}