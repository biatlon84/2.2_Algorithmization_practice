package com.epam.training.task_9;

public class print {
	public static int max = 0;

	public static void out(int[][] array) {
		int y = 0;

		for (int jj = 0; jj < array.length; jj++) {
			for (int x : array[jj]) {
				y = 0;
				while (x != 0) {
					x /= 10;
					y++;
				}
				max = max < y ? y : max;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int ii = 0; ii < array[i].length; ii++) {
				System.out.printf("%" + max + "d ", array[i][ii]);
			}
			System.out.print("\n");
		}
	}

	public static void pointing(int n, int r) {
		for (int ii = 0; ii < n; ii++) {
			if (ii == r) {
				System.out.printf("%" + max + "s ", "^");
			} else {
				System.out.printf("%" + max + "s ", " ");
			}
		}
		System.out.print("\n");
		for (int ii = 0; ii < n; ii++) {
			if (ii == r) {
				System.out.printf("%" + max + "d ", r + 1);
			} else {
				System.out.printf("%" + max + "s ", " ");
			}
		}
	}

}
