package com.array.pll;

import com.array.test.ApartmentInfo;

public class TestApartmentInfo {

	public static void main(String[] args) {
		ApartmentInfo Ai = new ApartmentInfo("Aryan Raj");
		Ai.setApartment("Ram Enclave,101", 0);
		Ai.setApartment("Raj Mension,112", 1);
		Ai.setApartment("Arjun Tower,154", 2);
		Ai.setApartment("Somya Enclave,189", 3);
		Ai.setApartment("Nandan Height,167", 4);
		
		System.out.println(Ai);
		System.out.println("********************************");
		
		System.out.println(Ai.getOwner()+" has "+Ai.countApartments()+" apartments");
		System.out.println("Apartment 5:"+ Ai.getApartment(4));
		
		System.out.println("********************************");
		Ai.reorganizeApartments();
		System.out.println(Ai);
	}

}
