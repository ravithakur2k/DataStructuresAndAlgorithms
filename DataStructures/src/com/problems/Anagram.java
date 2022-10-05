package com.problems;

import java.util.HashSet;

public class Anagram {

    public static void main(String args[]) {

        System.out.println(isAnagram("rat", "car"));

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] char_counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char_counts[s.charAt(i) - 'a']++;
            char_counts[t.charAt(i) - 'a']--;
        }
       for(int ch: char_counts){
           if(ch != 0){
               return false;
           }
       }
        return true;
    }
}
