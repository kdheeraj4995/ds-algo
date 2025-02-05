package com.dheeraj.neetcode;

import java.util.Map;

public class TwoIntegerSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff) && map.get(diff) != i) {
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoIntegerSum twoIntegerSum = new TwoIntegerSum();
        int[] nums = {5, 5};
        int target = 10;
        int[] result = twoIntegerSum.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
