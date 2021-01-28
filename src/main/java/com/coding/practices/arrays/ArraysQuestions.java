package com.coding.practices.arrays;

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

}
