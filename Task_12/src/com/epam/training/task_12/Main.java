package com.epam.training.task_12;

//Sort matrix rows in ascending and descending order of element values.
public class Main {
	public static void main(String args[]) {
		Sorting srg;
		int[][] arrray = cr_arr.cr(12, 12);

		pri.p(arrray);

		System.out.println("Enter 1 for descending, 2 for ascending");
		srg = userInput.intInp(2) == 1 ? Sorting.WANING : Sorting.INCREASING;

		sortLogic.row(arrray, srg, Typ.QUICK);

		pri.p(arrray);
	}
}
