package com.epam.training.task_16;

//Magic square 
public class Main {
	public static void main(String args[]) {
		int n = 0;
		scann sc = new scann();
		System.out.println("Please enter base of magic squares\n>>");
		n = sc.s(7);
		// -----------------
		long fact = 1;
		int zz = ((n * n + 1) * n) / 2;
		for (int i = 2; i <= n * n; i++) {
			fact = fact * i;
		}
		// --------------
		System.out.println("For magic squares with " + n * n + " numbers the magic constant is : " + zz + "");
		System.out.println("The search will be up to the " + fact + "th matrix");
		if (n > 3) {
			System.out.println("each number means 0.1 billion matrices");
		}
		MagicSearcher.search(zz, n);
		System.out.print("finish");
	}
}
