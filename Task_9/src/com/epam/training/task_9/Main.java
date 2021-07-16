package com.epam.training.task_9;

//Searching for the column with biggest sum
public class Main {
	public static void main(String args[]) {
		int n = 6;
		Matrix M = new Matrix(n);
		int[][] ar = M.mat;
		int adr = 0;
		int max = 0;
		int bu = 0;

		print.out(ar);

		for (int v = 0; v < ar[0].length; v++) {
			bu = 0;
			for (int i = 0; i < ar.length; i++) {
				bu += ar[i][v];

			}
			if (max < bu) {
				max = bu;
				adr = v;
			}
		}
		print.pointing(n, adr);
	}
}
