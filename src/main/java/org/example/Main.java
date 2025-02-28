package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {-1, 0, 7, 7, 3, 1, 3, 4, 5, 1, 5, 4};

        System.out.println(countElements(array));
    }

    public static HashMap<Integer, Integer> countElements(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array can't be null");
        }

        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        for (int element : array) {
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }

        return elementCountMap;
    }
}