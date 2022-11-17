package com.array;

import java.util.Map;

public class Solution {

    public static void main(String args[]) {
//        rearrange(new int[]{1, -1, 3, 2, -7, -5, 11, 6 }, 8);
        romanToInt("III");
    }

    public static void rearrange(int[] arr, int n) {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> map = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        char[] charArr = s.toCharArray();
        int result = map.get(charArr[s.length()-1]);
        for(int i = s.length()-2; i >=0 ; i--){
            if(map.get(charArr[i]) >= map.get(charArr[i+1])){
                result += map.get(charArr[i]);
            }else{
                result -= map.get(charArr[i]);
            }
        }

        return result;

    }
}
