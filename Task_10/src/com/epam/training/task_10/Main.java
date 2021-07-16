package com.epam.training.task_10;

//Finding positive elements in the main diagonal
public class Main {

	public static void main(String[] args) {

		int[][] mat = new int[9][9];
		for (int i = 0; i < mat.length; i++) {
			for (int ii = 0; ii < mat[1].length; ii++) {
				mat[i][ii] = (int) (Math.random() * 600 - 300);
				System.out.printf(" %4d", mat[i][ii]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		for (int i = 0; i < mat.length; i++) {
			for (int ii = 0; ii < mat[1].length; ii++) {
				if ((i == ii) && (mat[i][ii] > 0)) {
					System.out.printf(" %4d", mat[i][ii]);
				} else {
					System.out.print("     ");
				}
			}
			System.out.print("\n");
		}
	}
}
