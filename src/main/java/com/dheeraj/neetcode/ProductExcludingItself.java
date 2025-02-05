package com.dheeraj.neetcode;


public class ProductExcludingItself {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        for (int i = 0, k = nums.length - 1; i < nums.length; i++, k--) {
            if (i == 0) {
                leftProduct[i] = 1;
                rightProduct[k - i] = 1;
            } else {
                leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
                rightProduct[k] = rightProduct[k + 1] * nums[k + 1];
            }
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ProductExcludingItself productExcludingItself = new ProductExcludingItself();
        int[] nums = {1, 2, 0, 4};
        int[] result = productExcludingItself.productExceptSelf(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
