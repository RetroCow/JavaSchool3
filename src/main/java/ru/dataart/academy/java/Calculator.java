package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        return reverseList(firstNumber) + reverseList(secondNumber);
    }

    private Integer reverseList (List<Integer> list) {
        Collections.reverse(list);
        StringBuilder result = new StringBuilder();
        for (Integer item : list) {
            result.append(item);
        }
        return Integer.valueOf(result.toString());
    }
    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            result.add(list.get(i));
        }
        return result;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        if (list.size() <= 1) {
            return list;
        }
        return new ArrayList<>(Arrays.asList(list.get(0), list.get(list.size() - 1)));
    }
}
