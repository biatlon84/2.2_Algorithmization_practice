package com.epam.training.task_16;

public class MagicSearcher {

	public static void search(int zz, int n) {
		long fk = 0;
		int b = 0;
		int k = n * n - 1;
		int[] ar1 = new int[n * n];
		for (int i = 0; i < n * n; i++) {
			ar1[i] = i;
		}
		while (k > 0) {
			b = ar1[0];
			for (int jj = 0; jj < k; jj++) {
				ar1[jj] = ar1[jj + 1];
			}
			ar1[k] = b;
			if (k != ar1[k]) {
				fk++;
				if ((fk % 100000000) == 0) {
					System.out.print((fk / 100000000) + " ");
				}
				check(ar1, zz, n, fk);
				k = n * n - 1;
			} else {
				k--;
			}
		}
	}

	private static void check(int[] ar1, int zz, int n, long fk) {
		int sum = 0;
		for (int j = 0; j < n; j++) {
			for (int jj = 0; jj < n; jj++) {
				sum += ar1[jj + n * j] + 1;
			}
			if (sum != zz) {
				return;
			}
			sum = 0;
		}
		for (int j = 0; j < n; j++) {
			for (int jj = 0; jj < n; jj++) {
				sum += ar1[j + n * jj] + 1;
			}
			if (sum != zz) {
				return;
			}
			sum = 0;
		}
		for (int jj = 0; jj < n; jj++) {
			sum += ar1[jj * (n + 1)] + 1;
		}
		if (sum != zz) {
			return;
		}
		sum = 0;
		for (int jj = 0; jj < n; jj++) {
			sum += ar1[(jj * (n - 1)) + n - 1] + 1;
		}
		if (sum != zz) {
			return;
		}
		UserOut.printArrayLikeMatrix(ar1, n, fk);
	}

}
