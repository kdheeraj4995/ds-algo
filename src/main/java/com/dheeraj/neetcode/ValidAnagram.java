package com.dheeraj.neetcode;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        Map<Character, Long> sCharCount = getCharCount(s);
        Map<Character, Long> tCharCount = getCharCount(t);
        return sCharCount.equals(tCharCount);
    }

    Map<Character, Long> getCharCount(String s){
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "nagaram"));
    }
}
