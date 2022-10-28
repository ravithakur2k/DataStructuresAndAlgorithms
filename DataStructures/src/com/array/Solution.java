package com.array;

public class Solution {

    public static void main(String args[]) {
        rearrange(new int[]{1, -1, 3, 2, -7, -5, 11, 6 }, 8);
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
}
