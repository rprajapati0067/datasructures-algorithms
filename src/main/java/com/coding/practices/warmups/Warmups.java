package com.coding.practices.warmups;

import java.util.HashMap;
import java.util.Map;

public class Warmups {

	/*
	 * Minimum number in array, input: [2, 1, 3, 6, 4, 8]
	 */
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

	/*
	 * Maximum number in array, input: [2, 1, 3, 6, 4, 8]
	 */
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

	/*
	 * Minimum and Maximum number in array(Single Iteration), input: [2, 1, 3, 6, 4,
	 * 8]
	 */
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

	/*
	 * Sum of two number equal to k, input: [2, 1, 3, 6, 4, 8]
	 */
	public static Map<Integer, Integer> sumOfTwoNum(int[] arr, int k) {
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		if (arr != null) {

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] + arr[j] == k) {
						pairs.put(arr[i], arr[j]);
					}
				}

			}
		}
		return pairs;
	}

	/*
	 * Arrange Zero One Two, input: [2, 0, 2, 1, 0, 1, 0]
	 */
	public static int[] arrangeZeroOneTwo(int[] arr) {
		int start = 0, mid = 0;
		int last = arr.length - 1;

		while (mid <= last) {
			if (arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[start];
				arr[start] = temp;
				start++;
				mid++;
			} else if (arr[mid] == 1) {
				mid++;
			} else if (arr[mid] == 2) {
				int temp = arr[mid];
				arr[mid] = arr[last];
				arr[last] = temp;
				last--;
			}
		}
		return arr;

	}
}
