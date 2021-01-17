package com.coding.practices.warmups;

public class Warmups {

	// [2, 1, 3, 6, 4, 8]
	public static int minNumber(int[] arr) {
		int min = 0;
		if (arr != null) {
			min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
				}
			}
		}
		return min;
	}

	// [2, 1, 3, 6, 4, 8]
	public static int maxNumber(int[] arr) {
		int max = 0;
		if (arr != null) {
			max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}
			}
		}
		return max;
	}

	// [2, 1, 3, 6, 4, 8]
	public static String minMaxNumber(int[] arr) {
		int min = 0;
		int max = 0;
		if (arr != null) {
			min = arr[0];
			max = arr[1];
			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				} else if (min > arr[i]) {
					min = arr[i];
				}
			}
		}
		return "[Min: " + min + ", " + "Max: " + max + "]";
	}
}
