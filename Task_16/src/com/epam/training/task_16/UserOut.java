package com.epam.training.task_16;

public class UserOut {
	public static void printArrayLikeMatrix(int[] ar1, int n, long fk) {
		System.out.println("\n" + fk + "th matrix is a magic square :");
		int y = 0;
		for (int i = 0; i < n; i++) {
			for (int ii = 0; ii < n; ii++) {
				System.out.printf(" %2d", ar1[y] + 1);
				y++;
			}
			System.out.print("\n");
		}
	}
}
