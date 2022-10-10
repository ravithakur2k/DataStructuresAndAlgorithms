package com.recursion;

import java.util.Arrays;

public class BinarySearch {

    public static Integer binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = right - left / 2;

        return binarySearchFromArr( left, right, middle, nums, target);
    }

    private static Integer binarySearchFromArr(int left, int right, int middle, int[] nums, int target) {

        if (left > right) return -1;
        if (nums[middle] == target) return middle;
        else{
            if(target < nums[middle]) {
                return binarySearchFromArr(left, middle-1, (middle-1)-left/2, nums, target);
            }
            else {
                return binarySearchFromArr(middle+1, right, right-(middle+1)/2, nums, target);
            }
        }
    }

    public static void main(String arg[]) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(new int[]{2,5}, 5));
    }
}
