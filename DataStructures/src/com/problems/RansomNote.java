package com.problems;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static void main(String args[]){
        canConstruct("a", "b");
    }

    public static boolean canConstruct(String ransomNote, String magazine) {


        Map<Character, Integer> map = new HashMap<>();

        for(char c: magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
        }
        for (char c : ransomNote.toCharArray()) {
                map.put(c, map.getOrDefault(c,0) - 1);

            if(map.get(c) < 0){
                return false;
            }
        }

        return true;
    }
}
