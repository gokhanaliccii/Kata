package com.gokhanaliccii.kata.algorithm;

import com.gokhanaliccii.kata.util.IsNestedListSize;
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class SequentialNumberFinderTest {

    private SequentialNumberFinder finder;

    @Before
    public void setUp() {
        finder = new SequentialNumberFinder();
    }

    @Test
    public void should_NotFindSequentialNumbersWhenInputEmpty() {
        int[] items = new int[0];

        assertThat(finder.findSequentialNumbers(items, 3), Is.is(new IsNestedListSize(0)));
    }

    @Test
    public void should_SequentialNumbersReturnEmptyListWhenNotFoundEnoughSequential() {
        int[] items = new int[]{1, 2, 6, 7, 9};

        assertThat(finder.findSequentialNumbers(items, 3), Is.is(new IsNestedListSize(0)));
    }

    @Test
    public void should_FindSequentialNumbersListItemCountCorrectly() {
        int[] items = new int[]{1, 2, 6, 7, 9};

        assertThat(finder.findSequentialNumbers(items, 2), Is.is(new IsNestedListSize(2)));
    }

    @Test
    public void should_FindSequentialPartsFromInputCorrectly() {
        int[] items = new int[]{1, 2, 6, 7, 8, 9, 11, 14, 17, 19, 20, 21};
        List<List<Integer>> expectedItem = Arrays.asList(
                Arrays.asList(6, 7, 8, 9),
                Arrays.asList(19, 20, 21));

        assertEquals(expectedItem, finder.findSequentialNumbers(items, 3));
    }

    @Test
    public void should_FindSequentialPartsFromInputCorrectly2() {
        int[] items = new int[]{1, 2, 6, 7, 8, 9, 11, 14, 17, 19, 20};
        List<List<Integer>> expectedItem = Arrays.asList(
                Arrays.asList(6, 7, 8, 9));

        assertEquals(expectedItem, finder.findSequentialNumbers(items, 3));
    }

    @Test
    public void should_FindSequentialPartsWhenInputSequentialCorrectly3() {
        int[] items = new int[]{1, 2, 3};
        List<List<Integer>> expectedItem = Arrays.asList(
                Arrays.asList(1, 2, 3));

        assertEquals(expectedItem, finder.findSequentialNumbers(items, 1));
    }

}