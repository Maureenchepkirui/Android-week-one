package com.maureenbett.bookhub;


import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityInstrumentationTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);
    @Test
    public void validateEditText() {
        onView(withId(R.id.novelEditText)).perform(typeText("Portland"))
                .check(matches(withText("Love Pie")));
    }
    @Test
    public void locationIsSentToRestaurantsActivity(){
        String location = "Love Pie";
        onView(withId(R.id.novelEditText)).perform(typeText(location)).perform(closeSoftKeyboard());
        try {                             // the sleep method requires to be checked and handled so we use try block
            Thread.sleep(250);
        } catch (InterruptedException e){
            System.out.println("got interrupted!");
        }
        onView(withId(R.id.readingListButton)).perform(click());
        onView(withId(R.id.novelTextView)).check(matches
                (withText(location +" has been added to your custom reading list")));
    }

}