package com.recursion;

import java.util.Arrays;

public class BinarySearch {

    public static Integer binarySearch(int[] arr, int searchNum) {
        return binarySearchFromArr(arr, searchNum, 0, arr.length);
    }

    private static Integer binarySearchFromArr(int[] arr, int searchNum, int low, int high) {
        if (low >= 1) {
            int mid = (low + high) / 2;
            if (arr[mid] == searchNum) return mid;
            else if (arr[mid] < searchNum) return binarySearchFromArr(arr, searchNum, mid + 1, high);
            else return binarySearchFromArr(arr, searchNum, low, mid - 1);
        }
        return -1;
    }

    public static void main(String arg[]) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(new int[]{10, 20, 30, 50, 60, 80, 110, 130, 140, 170}, 112));
    }
}
