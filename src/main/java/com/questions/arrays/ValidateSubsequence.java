package com.questions.arrays;

import java.util.List;

public class ValidateSubsequence {
    public static boolean usingForloop(List<Integer> array, List<Integer> sequence) { // time: O(n); space: O(1)
        int checked = 0;

        for (int num : array) {
            if (num == sequence.get(checked))
                checked++;
            if (checked == sequence.size())
                return true;
        }

        return false;
    }
}
