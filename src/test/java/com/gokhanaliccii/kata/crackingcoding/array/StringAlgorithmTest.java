package com.gokhanaliccii.kata.crackingcoding.array;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class StringAlgorithmTest {

    @Test
    public void should_DetermineCharactersUniqueCorrectly() {
        StringAlgorithm algorithm = new StringAlgorithm();
        assertTrue(algorithm.isAllCharactersUnique("abcd"));
    }

    @Test
    public void should_DetermineToNotUniqueCorrectly() {
        StringAlgorithm algorithm = new StringAlgorithm();
        assertFalse(algorithm.isAllCharactersUnique("aa"));
    }

    @Test
    public void should_DetermineToUniqueWhenInputSingleCharacterCorrectly() {
        StringAlgorithm algorithm = new StringAlgorithm();
        assertTrue(algorithm.isAllCharactersUnique("a"));
    }

    @Test
    public void should_ChangeToReverseOrderCorrectly() {
        final String input = "abcd";
        final String expected = "dcba";

        StringAlgorithm algorithm = new StringAlgorithm();
        assertThat(algorithm.reverseIt(input), equalTo(expected));
    }
}