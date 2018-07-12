package com.gokhanaliccii.kata.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SequentialNumberFinder {


    public List<List<Integer>> findSequentialNumbers(int[] items, int limit) {
        if (items.length == 0)
            return new ArrayList<>();

        List<List<Integer>> consecutive = new LinkedList<>();
        List<Integer> tempList = new LinkedList<>();

        for (int currentIndex = 0, nextIndex = currentIndex + 1;
             nextIndex < items.length;
             currentIndex++, nextIndex++) {

            if (isConsecutive(items[currentIndex], items[nextIndex])) {
                tempList.add(items[currentIndex]);

                if (isLastIndex(nextIndex, items.length)) {
                    tempList.add(items[nextIndex]);
                }
            } else {

                if (tempList.size() > 0)
                    tempList.add(items[currentIndex]);

                if (tempList.size() >= limit) {
                    consecutive.add(tempList);
                }

                tempList = new LinkedList<>();
            }
        }

        if (tempList.size() >= limit) {
            consecutive.add(tempList);
        }

        return consecutive;
    }

    private boolean isConsecutive(int num1, int num2) {
        return num1 - (num2 - 1) == 0;
    }

    private boolean isLastIndex(int index, int size) {
        return index + 1 == size;
    }

    private int[][] emptyArray() {
        return new int[0][0];
    }
}
