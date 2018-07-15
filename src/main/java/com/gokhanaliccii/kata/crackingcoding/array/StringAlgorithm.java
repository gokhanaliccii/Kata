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
}
