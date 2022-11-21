package com.array;

public class Duplicates {

    public static void main(String[] args) {
        removeDups(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }

    public static int removeDups(int[] nums) {
        int dups = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                dups++;
            }
            nums[i - dups] = nums[i];
        }
        return nums.length - dups;
    }
}
