package com.epam.training.task_14;

//Generate a random matrix of 0 or 1. And in each column
//quantity of 1 is equal to the column number.
public class Main {
	public static void main(String args[]) {
		int[][] ar;
		int y = (int) ((Math.random() * 40) + 1);
		int x = (int) ((Math.random() * y) + 1);
		ar = Creator.mx(y, x);
		pri.p(ar);
		pri.xy(y, x);
	}

}
