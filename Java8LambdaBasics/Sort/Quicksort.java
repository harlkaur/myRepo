package practise;

import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {

		int a[] = { 2, 4, 1, 3, 0, 0 };
		System.out.println("arrays before sorting" + " " + Arrays.toString(a));
		quickSort(a);
		System.out.println("arrays after sorting" + " " + Arrays.toString(a));
	}

	private static void quickSort(int arr[]) {

		int low = 0;
		int high = arr.length - 1;
		if (low <= high) {
			recursion(arr, low, high);
			low++;
		}
		if (low <= high) {
			recursion(arr, low, high);
			high--;
		}
		

	}

	private static void recursion(int arr[], int low, int high) {

		while (low < high) {
			int pivot = (low + high) / 2;
			if (arr[low] > arr[pivot]) {
				swap(arr, low, pivot);
			}
			low++;
			if (arr[high] < arr[pivot]) {
				swap(arr, high, pivot);
			}
			high--;
		}
	}

	private static void swap(int arr[], int low, int pivot) {
		int temp = arr[low];
		arr[low] = arr[pivot];
		arr[pivot] = temp;
	}
}
