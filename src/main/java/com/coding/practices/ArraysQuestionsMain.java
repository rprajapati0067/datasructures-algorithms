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
	}

}
