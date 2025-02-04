package com.dheeraj.neetcode;

import java.util.HashMap;
import java.util.Map;

// https://neetcode.io/problems/duplicate-integer
public class DuplicateInteger {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        boolean hasDuplicate = false;
        for (final int num : nums) {
            if (map.containsKey(num)) {
                hasDuplicate = true;
                break;
            } else {
                map.put(num, 1);
            }
        }
        return hasDuplicate;
    }

    public static void main(String[] args) {
        DuplicateInteger duplicateInteger = new DuplicateInteger();
        int[] nums = {1, 2, 1, 4, 5, 6, 7, 8, 9};
        System.out.println(duplicateInteger.hasDuplicate(nums));
    }
}

