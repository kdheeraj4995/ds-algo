package com.dheeraj.neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeIntegerSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int target = 0;
        HashSet<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int twoSumTarget = target - nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == twoSumTarget) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (nums[left] + nums[right] < twoSumTarget) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        ThreeIntegerSum threeIntegerSum = new ThreeIntegerSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeIntegerSum.threeSum(nums);
        System.out.println(result);
    }
}
