package com.coding.practices.arrays;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysQuestions {

	/*
	 * Arrange a greater to right and smaller in left of the given number k,input: [
	 * 12, 2, 3, 1, 8, 123, 7, 11, 5, 4, 40, 100 ]
	 * 
	 */
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

	/*
	 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right
	 * -side/,input: [ 17,18,5,4,6,1 ]
	 * 
	 */
	public static int[] replaceElementsAtRight(int[] arr) {
		int max = arr[arr.length - 1];

		int[] arr1 = new int[arr.length];
		arr1[arr.length - 1] = -1;
		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] > arr1[i]) {
				max = arr[i];
				arr1[i - 1] = max;
			} else {
				max = arr1[i];
				arr1[i - 1] = max;
			}
		}
		return arr1;
	}
	/*
	 * replace-elements-with-greatest-element-on-left, input: [ 17,18,5,4,6,1 ]
	 * 
	 */

	public static int[] replaceElementsAtLeft(int[] arr) {
		int max = arr[0];

		int[] arr1 = new int[arr.length];
		arr1[0] = -1;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr1[i]) {
				max = arr[i];
				arr1[i + 1] = max;
			} else {
				max = arr1[i];
				arr1[i + 1] = max;
			}
		}
		return arr1;
	}

	/*
	 * 
	 * replace-elements-with-greatest-element-on-right-including-current-index,
	 * input: [ 17,18,5,4,6,1 ], output: [6, 6, 5, 5, 5, 4]
	 * 
	 */

	public static int[] replaceElementsAtRightWithCurrentIndexAsWell(int[] arr) {
		int max = arr[arr.length - 1];

		int[] arr1 = new int[arr.length];
		arr1[arr1.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {

			if (arr[i] > arr1[i + 1]) {
				max = arr[i];
				arr1[i] = max;
			} else {
				max = arr1[i + 1];
				arr1[i] = max;
			}
		}
		return arr1;
	}

	/*
	 * 
	 * replace-elements-with-greatest-element-on-left-including-current-index,
	 * input: [ 2 6 1 3 5 4 ], output: [2 6 6 6 6 6]
	 * 
	 */

	public static int[] replaceElementsAtLeftWithCurrentIndexAsWell(int[] arr) {
		int max = arr[0];

		int[] arr1 = new int[arr.length];
		arr1[0] = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (i < arr.length - 1) {

				if (arr[i + 1] > arr1[i]) {
					max = arr[i + 1];
					arr1[i + 1] = max;
				} else {
					max = arr1[i];
					arr1[i + 1] = max;
				}
			}
		}
		return arr1;
	}

	/*
	 * 
	 * Arrange the elements in zigzag manner like < > < > or > < > < input: [ 4, 3,
	 * 2, 1, 6, 7 ], output: [1 < 3 > 2 < 6 > 4 < 7]
	 * 
	 */
	public static int[] zigzag1(int[] arr) {
		Arrays.sort(arr);
		for (int i = 1; i < arr.length - 1; i++) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;

			i++;
		}

		return arr;
	}

	/*
	 * 
	 * Arrange the elements in zigzag manner like > < > < input: [ 4, 3, 2, 1, 6, 7
	 * ], output: [2 > 1 < 4 > 3 < 7 >6]
	 * 
	 */
	public static int[] zigzag2(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
			i++;
		}

		return arr;
	}

	/*
	 * 
	 * Arrange the elements in zigzag manner like > < > < input: [ 4, 3, 2, 1, 6, 7
	 * ], output: [2 > 1 < 4 > 3 < 7 >6]
	 * 
	 */
	public static int[] zigzag3(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (i % 2 == 0) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				} else {
					if (arr[i] < arr[i + 1]) {

						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}
				}

			}
		}

		return arr;
	}

	/*
	 * 
	 * Arrange the arrage One first and then Zero input: [1, 0, 1, 1, 0, 0, 1, 0, 1]
	 * output:[1, 1, 1, 1, 1, 0, 0, 0, 0]
	 * 
	 */
	public static int[] arrageOneZero1(int[] arr) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (count > 0) {
				arr[i] = 1;
				count--;
			} else {
				arr[i] = 0;
			}
		}

		return arr;
	}

	public static int[] arrageOneZero2(int[] arr) {

		int i = 0, j = 0;

		while (j < arr.length) {
			if (arr[j] == 1) {
				arr[i] = 1;
				i++;
				j++;
			} else {
				j++;
			}
		}
		while (i < arr.length) {
			arr[i] = 0;
			i++;
		}

		return arr;
	}

	public static int[] arrageOneZero3(int[] arr) {

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {
			if (arr[i] == 0 && arr[j] == 0) {
				j--;
			} else if (arr[i] == 1 && arr[j] == 1) {
				i++;
			} else if (arr[i] == 0 && arr[j] == 1) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			} else {
				i++;
			}

		}

		return arr;
	}

	/*
	 * 
	 * Find missing number in the series input: [1, 0, 1, 1, 0, 0, 1, 0, 1]
	 * output:[1, 1, 1, 1, 1, 0, 0, 0, 0]
	 * 
	 */
	public static int findMissingNumber1(int[] arr) {
		int n = arr.length + 1;
		int idealSum = (n * (n + 1)) / 2;
		int actualSum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualSum += arr[i];
		}
		return idealSum - actualSum;

	}

	public static int findMissingNumber2(int[] arr) {
		int xor = 0;
		for (int i : arr) {
			xor = xor ^ i;
		}
		for (int i = 1; i <= arr.length + 1; i++) {
			xor = xor ^ i;
		}
		return xor;
	}

	public static int findMissingNumber3(int[] arr) {
		int x = 0;
		int y = 0;
		for (int i : arr) {
			x = x ^ i;
		}
		for (int i = 1; i <= arr.length + 1; i++) {
			y = y ^ i;
		}
		return x ^ y;
	}

	public static int findMissingNumber4(int[] arr) {
		int result = -1;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}

		for (int i = 1; i < arr.length + 1; i++) {
			if (!map.containsKey(i)) {
				result = i;
				return result;
			}
		}
		return result;
	}

}
