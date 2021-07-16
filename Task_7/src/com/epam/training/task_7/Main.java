package com.epam.training.task_7;

import java.util.Scanner;

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
				System.out.println(n + " is not even or positive");
			}
		}

		double[][] ar = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int ii = 0; ii < n; ii++) {
				ar[i][ii] = Math.sin(((double) i * i - (double) ii * ii) / (double) n);
			}
		}

		print.out(ar);
		System.out.println("There are " + cou_pos.pos(ar) + " positive elements");
		System.out.println("Total number of elements " + cou_pos.whole);
	}
}
