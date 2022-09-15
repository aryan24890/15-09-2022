package com.array.test;
import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String [] Name = {"aryan","babu","viraj","komal","raj"};
		int size = Name.length;
		
		for(int i=0; i<size-1;i++) {
			for(int j=i+1; j<Name.length; j++) {
				if(Name[i].compareTo(Name[j])>0) {
					
					String container = Name[i];
					Name[i]=Name[j];
					Name[j]=container;
				}
			}
		}
		
		System.out.println(Arrays.toString(Name));
	}
}
