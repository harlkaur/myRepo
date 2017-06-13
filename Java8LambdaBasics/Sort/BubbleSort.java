import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 0, 0, 0, 0, 3, 3, 3, 3, 33, 1, 1, 1, 2, 2, 2, 0, 0, 0, 0 };
		System.out.println("before sorting" + " " + a.toString() + " " + Arrays.toString(a));
		BubbleSortImproved(a);
		System.out.println("after sorting" + " " + a.toString() + " " + Arrays.toString(a));
	}

	public static void BubbleSortImproved(int[] a) {
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
					swapped = true;
				}
			}
		}
	}

	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[i + 1];
		a[i + 1] = temp;
	}

}
