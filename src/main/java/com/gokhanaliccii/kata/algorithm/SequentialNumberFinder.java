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

        for (int i = 0, j = i + 1; j < items.length; i++, j++) {

            if (items[i] == items[j] - 1) {
                tempList.add(items[i]);

                if (j == items.length - 1) {
                    tempList.add(items[j]);
                }

            } else {

                if (tempList.size() > 0)
                    tempList.add(items[i]);

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

    private int[][] emptyArray() {
        return new int[0][0];
    }
}
