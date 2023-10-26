package test;

import java.util.Scanner;

public class A4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arrays size");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the " + n + " elements of arrays");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int start = 0;
		int end = a.length - 1;
		while (start < end) {
			// Swap the elements at the start and end indices
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			// Move the start and end indices towards the center
			start++;
			end--;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
