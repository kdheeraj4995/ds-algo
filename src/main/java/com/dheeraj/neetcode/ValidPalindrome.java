package com.dheeraj.neetcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        while (leftPointer < rightPointer){
            while (leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(leftPointer))){
                leftPointer++;
            }
            while (leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(rightPointer))){
                rightPointer--;
            }
            if (Character.toLowerCase(s.charAt(leftPointer)) != Character.toLowerCase(s.charAt(rightPointer))){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "Was it a car or a cat I saw?";
        System.out.println(validPalindrome.isPalindrome(s));
    }
}
