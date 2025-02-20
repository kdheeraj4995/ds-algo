package com.dheeraj.neetcode;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = low + high / 2;
        while (low <= high ){
            System.out.println("low: " + low + " high: " + high + " mid: " + mid);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
                mid = (low + high) / 2;
            } else {
                high = mid - 1;
                mid = (low + high) / 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] nums = {-1,0,2,4,6,8};
        System.out.println(search.search(nums, 4));
    }
}
