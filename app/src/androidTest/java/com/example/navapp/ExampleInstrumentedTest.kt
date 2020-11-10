package com.example.navapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(FragmentActivity::class.java)

    @Test
    fun firstFragmentTest() {
        onView(withId(R.id.buttonAct1toAct2f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct1toAct3f)).check(matches(isDisplayed()))
        onView(withId(R.id.navigation_about)).check(matches(isDisplayed()))

        //1f - 2f - 1f
        onView(withId(R.id.buttonAct1toAct2f)).perform(click())

        onView(withId(R.id.buttonAct2toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct2toAct3f)).check(matches(isDisplayed()))

        pressBack()

        onView(withId(R.id.buttonAct1toAct2f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct1toAct3f)).check(matches(isDisplayed()))

        //1f - 3f - 1f
        onView(withId(R.id.buttonAct1toAct3f)).perform(click())

        onView(withId(R.id.buttonAct3toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct3toAct2f)).check(matches(isDisplayed()))

        pressBack()
        onView(withId(R.id.buttonAct1toAct2f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct1toAct3f)).check(matches(isDisplayed()))

        //1f - about - 1f
        onView(withId(R.id.navigation_about)).perform(click())
        onView(withId(R.id.about_text)).check(matches(isDisplayed()))
        pressBack()
        onView(withId(R.id.buttonAct1toAct2f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct1toAct3f)).check(matches(isDisplayed()))
    }

    @Test
    fun secondFragmentTest() {
        //imitating user activity: getting to the 2nd fragment
        onView(withId(R.id.buttonAct1toAct2f)).perform(click())

        onView(withId(R.id.buttonAct2toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct2toAct3f)).check(matches(isDisplayed()))
        onView(withId(R.id.navigation_about)).check(matches(isDisplayed()))

        //2f - 1f - 2f
        onView(withId(R.id.buttonAct2toAct1f)).perform(click())

        onView(withId(R.id.buttonAct1toAct2f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct1toAct3f)).check(matches(isDisplayed()))

        pressBack()

        onView(withId(R.id.buttonAct2toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct2toAct3f)).check(matches(isDisplayed()))

        //2f - 3f - 2f
        onView(withId(R.id.buttonAct2toAct3f)).perform(click())

        onView(withId(R.id.buttonAct3toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct3toAct2f)).check(matches(isDisplayed()))

        pressBack()

        onView(withId(R.id.buttonAct2toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct2toAct3f)).check(matches(isDisplayed()))

        //2f - about - 2f
        onView(withId(R.id.navigation_about)).perform(click())
        onView(withId(R.id.about_text)).check(matches(isDisplayed()))
        pressBack()
        onView(withId(R.id.buttonAct2toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct2toAct3f)).check(matches(isDisplayed()))
    }

    @Test
    fun thirdFragmentTest() {
        //imitating user activity: getting to the 3rd fragment
        onView(withId(R.id.buttonAct1toAct3f)).perform(click())

        onView(withId(R.id.buttonAct3toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct3toAct2f)).check(matches(isDisplayed()))
        onView(withId(R.id.navigation_about)).check(matches(isDisplayed()))

        //3f - 1f - 3f
        onView(withId(R.id.buttonAct3toAct1f)).perform(click())

        onView(withId(R.id.buttonAct1toAct2f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct1toAct3f)).check(matches(isDisplayed()))

        pressBack()

        onView(withId(R.id.buttonAct3toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct3toAct2f)).check(matches(isDisplayed()))

        //3f - 2f - 3f
        onView(withId(R.id.buttonAct3toAct2f)).perform(click())

        onView(withId(R.id.buttonAct2toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct2toAct3f)).check(matches(isDisplayed()))

        pressBack()

        onView(withId(R.id.buttonAct3toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct3toAct2f)).check(matches(isDisplayed()))

        //3f - about - 3f
        onView(withId(R.id.navigation_about)).perform(click())

        onView(withId(R.id.about_text)).check(matches(isDisplayed()))

        pressBack()

        onView(withId(R.id.buttonAct3toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct3toAct2f)).check(matches(isDisplayed()))
    }

    @Test
    fun backStackTest() {
        //1f - 3f - 2f - about and back
        onView(withId(R.id.buttonAct1toAct3f)).perform(click())
        onView(withId(R.id.buttonAct3toAct2f)).perform(click())
        onView(withId(R.id.navigation_about)).perform(click())

        onView(withId(R.id.about_text)).check(matches(isDisplayed()))

        pressBack()

        onView(withId(R.id.buttonAct2toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct2toAct3f)).check(matches(isDisplayed()))

        pressBack()


        onView(withId(R.id.buttonAct3toAct1f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct3toAct2f)).check(matches(isDisplayed()))

        pressBack()

        onView(withId(R.id.buttonAct1toAct2f)).check(matches(isDisplayed()))
        onView(withId(R.id.buttonAct1toAct3f)).check(matches(isDisplayed()))
    }
}