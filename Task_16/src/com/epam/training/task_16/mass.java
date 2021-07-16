package com.epam.training.task_16;

public class mass {

	public static int[][] cr(int n, long indx) {
		int[][] ar = new int[n][n];
		int[] ar1 = new int[n * n];
		int[] ar2 = new int[n * n];
		for (int i = 0; i < n * n; i++) {
			ar1[i] = i + 1;
		}
		int r = 0; // Creating a replacement pattern
		while (indx > 0) {
			r = 1;
			ar2[r]++;
			while (ar2[r] > r) {
				ar2[r] = 0;
				r++;
				ar2[r]++;
			}
			indx--;
		}
		/*
		 * for (int m = 0; m < n * n; m++) { System.out.print(ar2[m] + " "); }
		 * System.out.print("\n");
		 */
		// Confusion according to the pattern
		int bu = 0;
		for (int m = n * n - 1; m >= 0; m--) {
			bu = ar1[ar2[m]];
			ar1[ar2[m]] = ar1[m];
			ar1[m] = bu;
		}
		// Decomposing the array into a matrix
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int ii = 0; ii < n; ii++) {
				ar[i][ii] = ar1[k];
				k++;
			}
		}
		return ar;
	}
}
