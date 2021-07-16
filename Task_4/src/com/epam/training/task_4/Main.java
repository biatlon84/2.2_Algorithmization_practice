package com.epam.training.task_4;

import java.util.Scanner;

//Form a square matrix of order n according 
//to a given pattern (N is even)
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
				System.out.println("Invalid value, try agen (N is even)");
			}
		}

		int[][] ar = new int[n][n];
		for (int i = 0; i < n; i++) {
			int[] buf = new int[n];
			if (i % 2 == 0) {
				for (int ii = 0; ii < n; ii++) {
					buf[ii] = ii + 1;
				}
			} else {

				for (int ii = 0; ii < n; ii++) {

					buf[ii] = n - ii;
				}
			}
			ar[i] = buf.clone();

		}
		print.out(ar);
		System.out.println("ok");
	}
}
