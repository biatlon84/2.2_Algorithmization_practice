package com.epam.training.task_7;

public class print {

	public static void out(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int ii = 0; ii < array[i].length; ii++) {
				System.out.print(array[i][ii] + " ");
			}
			System.out.print("\n");
		}
	}

	public static void out(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int ii = 0; ii < array[i].length; ii++) {
				System.out.print((int) ((array[i][ii]) * 100) + " ");
			}
			System.out.print("\n");
		}
	}

}
