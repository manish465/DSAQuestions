package com.questions.arrays;

import java.util.Arrays;

public class SortedSquaredArray {
    public static int[] usingBruteForce(int[] array) { // time: O(nlogn) ; space: O(1)
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
        Arrays.sort(array);
        return array;
    }

    public static int[] usingTwoPointer(int[] array) { // time: O(n) ; space: O(1)
        int left = 0;
        int right = array.length - 1;

        int[] output = new int[array.length];
        int idx = array.length - 1;
        while (left <= right) {
            if (Math.abs(array[left]) > Math.abs(array[right])) {
                output[idx] = array[left] * array[left];
                left++;
            } else {
                output[idx] = array[right] * array[right];
                right--;
            }
            idx--;
        }

        return output;
    }
}