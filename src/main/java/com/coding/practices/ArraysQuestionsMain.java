package com.coding.practices;

import com.coding.practices.arrays.ArraysQuestions;

public class ArraysQuestionsMain {

	public static void main(String[] args) {
		// Arrange a greater to right and smaller in left of the given number k
		int[] result = ArraysQuestions.arrange(new int[] { 12, 2, 3, 1, 8, 123, 7, 11, 5, 4, 40, 100 }, 7);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

		// replace-elements-with-greatest-element-on-right
		int[] replacedElement = ArraysQuestions.replaceElementsAtRight(new int[] { 17, 18, 5, 4, 6, 1 });
		System.out.println();
		for (int i = 0; i < replacedElement.length; i++) {

			System.out.print(replacedElement[i] + " ");
		}

		// replace-elements-with-greatest-element-on-left
		int[] replacedLeftElement = ArraysQuestions.replaceElementsAtLeft(new int[] { 2, 6, 1, 3, 5, 4 });
		System.out.println();
		for (int i = 0; i < replacedLeftElement.length; i++) {

			System.out.print(replacedLeftElement[i] + " ");
		}

		// replace-elements-with-greatest-element-on-right-including-current-index
		int[] replacedRightCurrentElement = ArraysQuestions
				.replaceElementsAtRightWithCurrentIndexAsWell(new int[] { 2, 6, 1, 3, 5, 4 });
		System.out.println();
		for (int i = 0; i < replacedRightCurrentElement.length; i++) {

			System.out.print(replacedRightCurrentElement[i] + " ");
		}

		// replace-elements-with-greatest-element-on-left-including-current-index
		int[] replacedLeftCurrentElement = ArraysQuestions
				.replaceElementsAtLeftWithCurrentIndexAsWell(new int[] { 2, 6, 1, 3, 5, 4 });
		System.out.println();
		for (int i = 0; i < replacedLeftCurrentElement.length; i++) {

			System.out.print(replacedLeftCurrentElement[i] + " ");
		}

		// Arrange the elements in zigzag manner like < > < > or > < > <
		int[] result1 = ArraysQuestions.zigzag1(new int[] { 1, 2, 3, 4, 5, 6, 7 });
		System.out.println();
		for (int i = 0; i < result1.length; i++) {

			System.out.print(result1[i] + " ");
		}
		// Arrange the elements in zigzag manner like < > < > or > < > <
		int[] result2 = ArraysQuestions.zigzag2(new int[] { 1, 2, 3, 4, 5, 6, 7 });
		System.out.println();
		for (int i = 0; i < result2.length; i++) {

			System.out.print(result2[i] + " ");
		}
		// Arrange the elements in zigzag manner like < > < > or > < > <
		int[] result3 = ArraysQuestions.zigzag3(new int[] { 1, 2, 3, 4, 5, 6, 7 });
		System.out.println();
		for (int i = 0; i < result3.length; i++) {

			System.out.print(result3[i] + " ");
		}

		// Arrange one first and the zero
		int[] result4 = ArraysQuestions.arrageOneZero1(new int[] { 1, 0, 1, 1, 0, 0, 1, 0, 1 });
		System.out.println();
		for (int i = 0; i < result4.length; i++) {

			System.out.print(result4[i] + " ");
		}
		// Arrange one first and the zero
		int[] result5 = ArraysQuestions.arrageOneZero2(new int[] { 1, 0, 1, 1, 0, 0, 1, 0, 1 });
		System.out.println();
		for (int i = 0; i < result5.length; i++) {

			System.out.print(result5[i] + " ");
		}
		// Arrange one first and the zero
		int[] result6 = ArraysQuestions.arrageOneZero3(new int[] { 1, 0, 1, 1, 0, 0, 1, 0, 1 });
		System.out.println();
		for (int i = 0; i < result6.length; i++) {

			System.out.print(result6[i] + " ");
		}

		System.out.println();
		// Arrange one first and the zero
		System.out.println(ArraysQuestions.findMissingNumber1(new int[] { 3, 1, 2, 5 }));
		// Arrange one first and the zero
		System.out.println(ArraysQuestions.findMissingNumber2(new int[] { 3, 1, 2, 5 }));
		// Arrange one first and the zero
		System.out.println(ArraysQuestions.findMissingNumber3(new int[] { 3, 1, 2, 5 }));
		// Arrange one first and the zero
		System.out.println(ArraysQuestions.findMissingNumber4(new int[] { 3, 1, 2, 5 }));

	}

}
