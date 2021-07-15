package com.epam.train.Task_1;

//A matrix is given. 
//Display all odd columns with the first item greater 
//than the last.
public class Main {
	public static void main(String[] args) {

		int[][] mat = new int[4][4];
		for (int i = 0; i < mat.length; i++) {
			for (int ii = 0; ii < mat[1].length; ii++) {
				mat[i][ii] = (int) (Math.random() * 300);
				System.out.printf(" %3d", mat[i][ii]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		for (int i = 0; i < mat.length; i++) {
			for (int ii = 0; ii < mat[1].length; ii++) {
				if (((ii % 2) == 0) && (mat[0][ii] > mat[mat.length - 1][ii])) {
					System.out.printf(" %3d", mat[i][ii]);
				} else {
					System.out.print("    ");
				}
			}
			System.out.print("\n");
		}
	}
}
