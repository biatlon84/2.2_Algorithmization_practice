package com.epam.training.task_8;

public class Matrix {
	public int[][] mat;

	public Matrix(int n) {
		int[][] mat = new int[n][n];
		for (int i = 0; i < mat.length; i++) {
			for (int ii = 0; ii < mat[1].length; ii++) {
				mat[i][ii] = (int) (Math.random() * 300);
			}
		}
		this.mat = mat;
	}
}
