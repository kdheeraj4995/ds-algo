package com.dheeraj.neetcode;

import java.util.Map;

public class TopKElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }

    public static void main(String[] args) {
        TopKElements topKElements = new TopKElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 3;
        int[] result = topKElements.topKFrequent(nums, k);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
