package com.epam.training.task_12;

public class QuickSort {
	public static int coun = 0;

	public static void quickSort(int[] array, int low, int high) {
		if (array.length == 0)
			return;

		if (low >= high)
			return;
		int opora;

		int middle = low + (high - low) / 2;
		opora = array[middle];

		int i = low, j = high;
		while (i <= j) {
			while (array[i] < opora) {
				i++;
			}

			while (array[j] > opora) {
				j--;
			}

			if ((i <= j)) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				coun++;
				i++;
				j--;
			}

		}

		if (low <= j)
			quickSort(array, low, j);

		if (high >= i)
			quickSort(array, i, high);

	}

	public static void quickSortB(int[] array, int low, int high) {
		if (array.length == 0)
			return;

		if (low >= high)
			return;
		int opora;

		int middle = low + (high - low) / 2;
		opora = array[middle];

		int i = low, j = high;
		while (i <= j) {
			while (array[i] > opora) {
				i++;
			}

			while (array[j] < opora) {
				j--;
			}

			if ((i <= j)) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				coun++;
				i++;
				j--;

			}

		}

		if (high >= i)
			quickSortB(array, i, high);
		if (low <= j)
			quickSortB(array, low, j);

	}

}
