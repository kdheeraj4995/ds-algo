package com.dheeraj.neetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestSequenceLength {
    public int longestConsecutive(int[] nums) {
        Set<Integer> data = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longestSequenceLength = 0;
        for (final int num : data) {
            Set<Integer> tempSet = new HashSet<>();
            int currentNumber = num;
            int previousNumber = num - 1;
            if (!data.contains(previousNumber)) {
                do {
                    tempSet.add(currentNumber);
                    currentNumber++;
                } while (data.contains(currentNumber));
                longestSequenceLength = Math.max(longestSequenceLength, tempSet.size());
            }
        }
        return longestSequenceLength;
    }

    public static void main(String[] args) {
        LongestSequenceLength longestSequenceLength = new LongestSequenceLength();
        int[] nums = {100, 4, 200, 1, 3, 2, 6, 5};
        System.out.println(longestSequenceLength.longestConsecutive(nums));
    }
}
