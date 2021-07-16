package com.epam.training.task_6;

import java.util.Scanner;

//Form a square matrix of order n according to a given
//pattern (N is even)
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;

		boolean ag = true;
		System.out.println("Type N (N is even)");
		while (ag) {

			while (!sc.hasNextInt()) {
				System.out.println(sc.next() + " is not INT");
			}
			n = sc.nextInt();
			if (n >= 0 && (n % 2 == 0)) {
				ag = false;
			} else {
				System.out.println(n + " is not even or not positive");
			}
		}

		int[][] ar = new int[n][n];
		boolean k = true;
		for (int i = 0; i < n; i++) {
			for (int ii = 0; ii < n; ii++) {
				if (i < n / 2) {
					ar[i][ii] = (i <= ii) && (i < (n - ii)) ? 1 : 0;
				} else {
					ar[i][ii] = (i >= ii) && ((i + 2) > (n - ii)) ? 1 : 0;
				}
			}

		}
		print.out(ar);
		System.out.println("ok");
	}
}
