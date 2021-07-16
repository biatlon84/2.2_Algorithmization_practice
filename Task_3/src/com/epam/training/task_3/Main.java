package com.epam.training.task_3;

import java.util.Scanner;

//There is matrix. To print K-line, and P-column.
public class Main {

	public static void main(String[] args) {

		int n = 0, t = 0;
		int m = 0;
		boolean err = true;

		int[][] mat = new int[6][5];
		for (int i = 0; i < mat.length; i++) {
			for (int ii = 0; ii < mat[1].length; ii++) {
				mat[i][ii] = (int) (Math.random() * 300);
				System.out.printf(" %3d", mat[i][ii]);
			}
			System.out.print("\n");
		}

		System.out.println("type column and then line\n>>");
		Scanner sc = new Scanner(System.in);
		System.out.println("Type P-column of " + mat[0].length + " available ");
		err = true;
		while (err) {
			while (!sc.hasNextInt()) {
				System.out.println(sc.next() + " is not namber integer");
				System.out.print(">>");
			}
			err = false;
			n = sc.nextInt();
			if (n > mat[0].length) {
				n = 0;
				err = true;
				System.out.println("There are fewer columns");
			}
		}
		System.out.println("Type K-line of " + mat.length + " available");
		err = true;
		while (err) {
			while (!sc.hasNextInt()) {
				System.out.println(sc.next() + " is not namber integer");
				System.out.print(">>");
			}
			err = false;
			m = sc.nextInt();
			if (m > mat.length) {
				m = 0;
				err = true;
				System.out.println("There are fewer lines ");
			}
		}
		n--;
		m--;

		for (int i = 0; i < mat.length; i++) {
			for (int ii = 0; ii < mat[1].length; ii++) {
				if ((n == ii) || (i == m)) {
					System.out.printf(" %3d", mat[i][ii]);
				} else {
					System.out.print("    ");
				}
			}
			System.out.print("\n");
		}
		System.out.println("\nColumn: " + (n + 1));
		System.out.println("Line  : " + (m + 1));
	}

}
