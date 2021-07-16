package com.epam.training.task_7;

public class print {

	public static void out(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%6.2f", (array[i][j]));
			}
			System.out.print("\n");
		}
	}

}
