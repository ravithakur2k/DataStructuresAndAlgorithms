package com.array;

public class MergeSortedArray {

    public static void main(String args[]) {
        mergeWithoutExtraSpace(new int[]{2, 5, 6, 0, 0, 0}, 3, new int[]{1, 2, 3}, 3);
    }

    public static void mergeWithoutExtraSpace(int[] nums1, int m, int[] nums2, int n){
        int p1 = m - 1;
        int p2 = n - 1;
        int i = nums1.length - 1;

        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] > nums2[p2]){
                nums1[i--] = nums1[p1--];
            } else {
                nums1[i--] = nums2[p2--];
            }
        }
        while(p2 >= 0){
            nums1[i--] = nums2[p2--];
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] resultArr = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                resultArr[k] = nums1[i];
                i++;
                k++;
            } else {
                resultArr[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < m) {
            resultArr[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            resultArr[k] = nums2[j];
            j++;
            k++;
        }

        for (int l = 0; l < resultArr.length; l++) {
            nums1[l] = resultArr[l];
        }

    }
}
