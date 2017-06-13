package practise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 2, 7, 9, 0, 1, 3, 4, 5 };
		Scanner sc = new Scanner(System.in);
		int find = sc.nextInt();
		int low = 0;
		int high = a.length - 1;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		while (low < high) {
			int mid = (low + high) / 2;
			if (find == a[mid]) {
				System.out.println("Found at index" + " " + a[mid]);
			} else if (a[find] > mid) {
				low = mid + 1;
				if(find == a[low]){
					System.out.println("Found at index" + " " + a[low]);
				}
			} else if (a[find] < mid) {
				high = mid - 1;
				if(find == a[high]){
					System.out.println("Found at index" + " " + a[high]);
				}
			}
		}
	}
}
