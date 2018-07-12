package com.gokhanaliccii.kata.algorithm;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.*;

public class SequentialNumberFinderTest {

    @Test
    public void should_NotFindSequentialNumbersWhenInputEmpty() {
        int[] items = new int[0];

        SequentialNumberFinder finder = new SequentialNumberFinder();
        assertThat(finder.findSequentialNumbers(items, 3), Is.is(new IsArraySize(0)));
    }


    class IsArraySize extends TypeSafeMatcher<int[][]> {

        private int expectedItemCount;

        public IsArraySize(int expectedItems) {
            this.expectedItemCount = expectedItems;
        }

        @Override
        protected boolean matchesSafely(int[][] item) {
            return item.length == expectedItemCount;
        }

        @Override
        public void describeTo(Description description) {
            description.appendText("Expected count :");
            description.appendValue(expectedItemCount);
        }
    }
}