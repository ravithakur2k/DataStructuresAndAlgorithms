package com.array;

import java.util.Map;

public class Solution {

    public static void main(String[] args) {
//        rearrange(new int[]{1, -1, 3, 2, -7, -5, 11, 6 }, 8);
//        romanToInt("III");
        System.out.println(singleNum(new int[]{4, 1, 2, 1, 2}));
    }

    public static int singleNum(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        return xor;
    }

    public static int climbStairs(int n) {
        int n1 = 1, n2 = 2;
        int total = 0;
        for (int i = 3; i <= n; i++) {
            total = n2 + n1;
            n1 = n2;
            n2 = total;
        }

        return total;

    }

    public static int binarySearchSqrt(int x) {
        long start = 0;
        long end = x;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (end * end == x) {
            return (int) end;
        }
        return (int) start;
    }

    public static int mySqrt(int x) {
        for (long i = 46340; i <= 50000; i++) { //2147395600 - 46341 * 46341
            if (i * i == x) {
                return (int) i;
            } else if (x > (i * i) && x < ((i + 1) * (i + 1))) {
                return (int) i;
            }
        }
        return 0;
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
        int result = map.get(charArr[s.length() - 1]);
        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(charArr[i]) >= map.get(charArr[i + 1])) {
                result += map.get(charArr[i]);
            } else {
                result -= map.get(charArr[i]);
            }
        }

        return result;

    }
}
