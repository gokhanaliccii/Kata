package com.gokhanaliccii.kata.crackingcoding.array;

/**
 * Chapter1 Solutions
 */
public class StringAlgorithm {

    /**
     * 1.1
     * Implement an algorithm to determine
     * if a string has all unique characters
     * What if you can not use additional data structures
     */
    public boolean isAllCharactersUnique(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length() - 1; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * 1.2
     * Write code to reverse a C-Style String
     * (C-String means that “abcd” is represented as  ve characters,
     * including the null character )
     */
    public String reverseIt(String input) {
        char[] reversed = new char[input.length()];
        int lastIndex = input.length() - 1;

        for (int i = 0; i <= lastIndex; i++) {
            reversed[i] = input.charAt(lastIndex - i);
        }

        return new String(reversed);
    }
}
