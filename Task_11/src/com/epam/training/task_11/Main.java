package com.epam.training.task_11;

public class Main {
	public static void main(String args[]) {
		int x, y;
		x = 20;
		y = 10;
		int[][] ar = new int[y][x];
		int[] max = new int[x];

		ar = cr_arr.cr(y, x);
		pri.p(ar);
		max = testar.af(ar);
		System.out.print("line numbers where \"5\" occurs >= 3 times \n");
		pri.pw(max);

	}
}
