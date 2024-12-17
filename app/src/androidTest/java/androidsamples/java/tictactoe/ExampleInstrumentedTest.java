package androidsamples.java.tictactoe;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;

import android.view.View;


import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.NoMatchingViewException;
import androidx.test.espresso.ViewAssertion;
import androidx.test.espresso.accessibility.AccessibilityChecks;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Objects;


@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);


    @BeforeClass
    public static void enableAccessibilityChecks() {
        AccessibilityChecks.enable();
    }
    @Test
    public void testlogin() {
        //before logging in
        onView(withId(R.id.edit_email)).perform(clearText()).perform(typeText("compleksamvs@gmail.com"));
        onView(withId(R.id.edit_password)).perform(clearText()).perform(typeText("Master@27"));
        onView(withId(R.id.btn_log_in)).perform(click());
    }
    @Test
    public void testfloatingactionbutton() {
        //after logging in
        onView(withId(R.id.fab_new_game)).perform(click());
        onView(withText("TWO-PLAYER")).perform(click());
        Espresso.pressBack();
        onView(withText("YES")).perform(click());
        onView(withId(R.id.list)).check(new RecyclerViewItemCountAssertion(0));
    }
    public static class RecyclerViewItemCountAssertion implements ViewAssertion {
        private final int expectedCount;

        public RecyclerViewItemCountAssertion(int expectedCount) {
            this.expectedCount = expectedCount;
        }

        @Override
        public void check(View view, NoMatchingViewException noViewFoundException) {
            if (noViewFoundException != null) {
                throw noViewFoundException;
            }

            RecyclerView recyclerView = (RecyclerView) view;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            assert adapter != null;
            assertThat(adapter.getItemCount(), is(expectedCount));
        }
    }

}