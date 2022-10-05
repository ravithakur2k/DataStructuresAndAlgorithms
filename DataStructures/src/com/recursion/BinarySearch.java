package com.recursion;

import java.util.Arrays;

public class BinarySearch {

    public static Integer binarySearch(int[] arr, int searchNum) {
        return binarySearchFromArr(arr, searchNum, 0, arr.length-1);
    }

    private static Integer binarySearchFromArr(int[] nums, int target, int low, int high) {
        if(low < high){
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) return binarySearchFromArr(nums, target, mid+1, high);
            else if(nums[mid] > target )return binarySearchFromArr(nums, target, low, mid-1);
        }
        return -1;
    }

    public static void main(String arg[]) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(new int[]{-1,0,3,5,9,12}, 9));
    }
}
