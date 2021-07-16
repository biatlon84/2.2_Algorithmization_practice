package com.epam.training.task_8;

//In a numeric matrix, swap any two columns, that is, 
//put all the elements of one column
//to the corresponding positions of the other,
//and move its elements of the second to the first.
//Column numbers are entered by the user from the keyboard.
public class Main {
	public static void main(String args[]) {
		int l = 4;
		Matrix m = new Matrix(l);
		int[][] ar = m.mat;
		int x = 0;
		int y = 0;
		int bu = 0;

		print.out(ar);

		scann dy = new scann();

		System.out.print("first column\n>>");
		x = dy.s(l) - 1;

		System.out.print("second column\n>>");
		y = dy.s(l) - 1;

		for (int i = 0; i < ar.length; i++) {
			bu = ar[i][y];
			ar[i][y] = ar[i][x];
			ar[i][x] = bu;

		}

		print.out(m.mat);

	}
}
