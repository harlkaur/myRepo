package com.shc.hackerrank;

import java.util.Scanner;

public class MinNumbertoUpdateArraySum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int min = 0;
		int sum = 0;
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		for (int i = 0; i < size; i++) {
			if ((arr[i] * size) > sum) {
				min = arr[i];
				System.out.println(min);
				break;
			}
		}
	}
}
