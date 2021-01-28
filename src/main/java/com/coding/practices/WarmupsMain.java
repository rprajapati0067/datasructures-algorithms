package com.coding.practices;

import com.coding.practices.warmups.Warmups;

/**
 * Hello world!
 *
 */
public class WarmupsMain {
	public static void main(String[] args) {
		// Minimum number in array
		System.out.println(Warmups.minNumber(new int[] { 2, 1, 3, 6, 4, 8 }));

		// Maximum number in array
		System.out.println(Warmups.maxNumber(new int[] { 2, 1, 3, 6, 4, 8 }));

		// Minimum and Maximum number in array
		System.out.println(Warmups.minMaxNumber(new int[] { 2, 1, 3, 6, 4, 8 }));

		// Sum of two number equal to k
		System.out.println(Warmups.sumOfTwoNum(new int[] { 2, 1, 3, 6, 4, 8 }, 9));

		// Arrange Zero One Two
		int[] result = Warmups.arrangeZeroOneTwo(new int[] { 2, 0, 2, 1, 0, 1, 0 });

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

		int[][] arr = { { 1, 1, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 1 } };

		int res = Warmups.maxCoin(arr, 4, 4);
		System.out.println(res);

	}

}
