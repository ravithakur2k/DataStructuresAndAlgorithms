package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Solution {

    public static void main(String[] args) {
        intersect(new int[]{2, 2, 1, 1}, new int[]{2, 2});

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> listA = new CopyOnWriteArrayList<>();
        List<Integer> result = new ArrayList<>();
        if (nums1.length < nums2.length) {
            result = extracted(nums1, nums2, listA, result);
        }else {
            result = extracted(nums2, nums1, listA, result);
        }
        int[] finalResult = new int[result.size()];
        for (int i = 0; i < finalResult.length; i++) {
            finalResult[i] = result.get(i);
        }
        return finalResult;
    }

    private static List<Integer> extracted(int[] nums1, int[] nums2, List<Integer> listA, List<Integer> result) {
        for (int num : nums2) {
            listA.add(num);
        }
        for (int num : nums1) {
            if (listA.contains(num)) {
                result.add(num);
                listA.remove(Integer.valueOf(num));
            }
        }
        return result;
    }

    public static boolean isPowerOfThree(int n) {
        return (n > 0) && 1162261467 % 3 == 0;
    }

    public static void moveZerosTwoPointers(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        while (p1 < nums.length) {
            if (nums[p1] != 0) {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
                p2++;
            } else {
                p1++;
            }
        }
    }

    public static void swap(int num1, int num2) {

    }

    public static void moveZeros(int[] nums) {
        int countOfZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countOfZero++;
            } else if (countOfZero > 0) {
                int t = nums[i];
                nums[i] = 0;
                nums[i - countOfZero] = t;
            }
        }
    }

    public static int missingNumberSorted(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return i;
    }

    public static int missingNumberUsingSum(int[] nums) {
        int sum = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            sum = sum + i - nums[i];
        }
        return sum + i;
    }

    public static int missingNumber(int[] nums) {
        int xor = 0;
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
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
