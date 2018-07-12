package com.gokhanaliccii.kata.util;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import java.util.List;

public class IsNestedListSize extends TypeSafeMatcher<List<List<Integer>>> {

    private int expectedItemCount;

    public IsNestedListSize(int expectedItems) {
        this.expectedItemCount = expectedItems;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("Expected count :");
        description.appendValue(expectedItemCount);
    }

    @Override
    protected boolean matchesSafely(List<List<Integer>> item) {
        return item.size() == expectedItemCount;
    }
}
