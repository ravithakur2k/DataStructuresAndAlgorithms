package com.array;

public class BoyerMooreAlgo {

    public static void main(String[] args) {
        majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
    }

    public static int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (count == 0) {
                majorityElement = nums[i];
            }
            if (majorityElement == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return majorityElement;
    }

}
