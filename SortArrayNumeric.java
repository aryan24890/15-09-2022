package com.array.test;
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayNumeric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 positive Integer");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Assending order: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();

	}
}
