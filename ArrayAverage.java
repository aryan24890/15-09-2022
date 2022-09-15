package com.array.test;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayAverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int nums[] = new int[5];
		
		System.out.println("*************");
		System.out.println("Enter " + nums.length + " values: ");
		System.out.println("*************");
		for(int i=0; i<nums.length; i++) 
			nums[i] = sc.nextInt();
		System.out.println("*************");
		System.out.println("Array elements are : ");
		System.out.println("*************");
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("*************");
		
		System.out.println("Original Array: "+Arrays.toString(nums));
		System.out.println("*************");
		int max = nums[0];
		int min = nums[0];
		float sum = nums[0];
		for(int i = 1; i < nums.length; i++)
		{
			sum  += nums[i];
			if(nums[i] > max)
				max = nums[i];
			else if(nums[i] < min)
				min = nums[i];
		}
		System.out.println("bigest value in array is :"+max);
		System.out.println("smallest value of array is :"+min);
		int avg = (min+max)/2;
		System.out.println("Average: "+ avg);
	
		sc.close();
	}

}
