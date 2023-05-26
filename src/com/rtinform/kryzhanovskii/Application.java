package com.rtinform.kryzhanovskii;

import java.util.HashMap;

/**
 * This is a test example for RtInform Company
 */
public class Application {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 1, 5, 4};
        System.out.println(countElement(arr));
        int[] arr2 = {1, 1, 1, 1, 1};
        System.out.println(countElement(arr2));
        int[] arr3 = {};
        System.out.println(countElement(arr3));
        int[] arr4 = {5};
        System.out.println(countElement(arr4));
    }

    public static HashMap<Integer, Integer> countElement(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (map.containsKey(key)) {
                int value = map.get(key);
                map.put(key, value + 1);
            } else {
                map.put(key, 1);
            }
        }
        return map;
    }
}