package com.questions.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static int[] usingBruteForce(int[] array, int targetSum) { // time: O(n2); space: O(1)
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[i] + array[j] == targetSum)
                    return new int[] { array[i], array[j] };
            }
        }

        return new int[0];
    }

    public static int[] usingSpace(int[] array, int targetSum) { // time: O(n); space: O(n)
        Set<Integer> set = new HashSet<>();

        for (int num : array) {
            if (set.contains(targetSum - num))
                return new int[] { num, targetSum - num };
            else
                set.add(num);
        }

        return new int[0];
    }

    public static int[] usingTwoPointer(int[] array, int targetSum) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int sum = array[left] + array[right];
            if (sum < targetSum)
                left++;
            else if (sum > targetSum)
                right--;
            else
                return new int[] { array[left], array[right] };
        }

        return new int[0];
    }

}
