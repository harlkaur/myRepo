package practise;

import java.util.Arrays;

public class QuickSortEffcient {

	static int a[] = { 2, 4, 1, 9, 0, 10, 5, 6, 3, 0, 0 };

	public static void main(String[] args) {

		System.out.println("arrays before sorting" + " " + Arrays.toString(a));
		quickSort(0, a.length - 1);
		System.out.println("arrays after sorting" + " " + Arrays.toString(a));
	}

	private static void quickSort(int low, int high) {

		int i = low;
		int j = high;
		int pivot = a[(low + high) / 2];

		while (i < j) {
			while (a[i] < pivot) {
				i++;
			}
			while (a[j] > pivot) {
				j--;
			}

			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(low, j);
		}
		if (i < high) {
			quickSort(i, high);
		}
	}

	private static void swap(int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;

	}
}
