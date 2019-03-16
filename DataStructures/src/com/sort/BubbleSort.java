package com.sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {25,23,-12,-5,0,4,5};
		
		for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for(int i = 0; i < lastUnsortedIndex; i++) {
				if( arr[i] > arr[i+1]) {
					swap(arr,i,i+1);
				}
				
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

	public static void swap(int[] arr, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
