package com.example.week7.Espresso

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.example.week7.R

//@RunWith(AndroidJUnit4::class)
class EspressoActivityTest {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<EspressoActivity>()


    //Lets test if Espresso Activity is displayed or visible to user

    @Test
    fun checkActivityVisibility() {
        onView(withId(R.id.layout_espressoActivity))
            .check(matches(isDisplayed()))
    }

    //checking if "Espresso Activity" is visible as we want
    @Test
    fun checkingTexttVisibility() {
        onView(withId(R.id.tvEspressoActivity))
            .check(matches(isDisplayed()))
        //checking if our button is visible
        onView(withId(R.id.btnEspressoActivity))
            .check(matches(isDisplayed()))
    }

    //checking if text in our View is the right one

    @Test
    fun testTextIsEspressoActivity() {
        onView(withId(R.id.tvEspressoActivity))
            .check(
                matches(
                    withText(
                        R.string.espresso_activity
                    )
                )
            )
    }

    //testing click in button(Espresso Activity) if after a click we will navigate to Another Activity
    //and test if our view(Another Activity will be displayed)

    @Test
    fun navigateToAnotherActivity(){

        onView(withId(R.id.btnEspressoActivity))
            .perform(click())

        //with click everything is alright
            //now we will check if our second activity is visible to user

        onView(withId(R.id.layout_anotherActivity))
            .check(matches(isDisplayed()))
    }

    //testing backpress to Espresso Activity

    @Test
    fun backPressToEspressoActivity(){
        onView(withId(R.id.btnEspressoActivity))
            .perform(click())
        onView(withId(R.id.layout_anotherActivity))
            .check(matches(isDisplayed()))


        //here we will check onBAckPRess
        //when the user is on the another Activity

        Espresso.pressBack()

        //after clicking on button to back
        //espresso activity must be visible
        //we will check it
        onView(withId(R.id.layout_espressoActivity))
            .check(matches(isDisplayed()))
    }



}