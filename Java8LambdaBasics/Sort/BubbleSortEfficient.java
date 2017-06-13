package practise;

import java.util.Arrays;

public class BubbleSortEfficient {

	public static void main(String[] args) {

		int a[] = { 1, 2, 0, 2, 1, 0, 0, 3, 1, 3, 0, 0, 1, 2, 3 };
		System.out.println("before sorting" + Arrays.toString(a));
		bubbleSortImpl(a);
		System.out.println("after sorting" + Arrays.toString(a));
	}

	private static void bubbleSortImpl(int[] arr) {
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if(arr[i]>arr[i+1]){
					swap(arr,i,i+1);
					swapped = true;
				}
			}
		}
	}
	
	private static void swap(int arr[],int i,int j){
		int temp = arr[i];
		arr[i] = arr[i+1];
		arr[i+1] = temp;
	}
}
