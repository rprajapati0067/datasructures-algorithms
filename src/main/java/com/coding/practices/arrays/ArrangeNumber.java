package com.coding.practices.arrays;

public class ArrangeNumber {

//input	[ 12, 2, 3, 1, 8, 123, 7, 11, 5, 4, 40, 100 ];
	public static int[] arrange(int[] arr, int k) {

		int first = 0;
		int last = arr.length - 2;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k) {
				int temp = arr[arr.length - 1];
				arr[arr.length - 1] = k;
				arr[i] = temp;
			}

		}
		while (first < last) {
			if (arr[first] > k) {
				int current = arr[first];
				arr[first] = arr[last];
				arr[last] = current;
				last--;
			} else {
				first++;
			}

		}
		int temp = arr[first];
		arr[first] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		return arr;
	}

}