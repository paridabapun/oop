package com.hsbc.immutable;

import com.hsbc.cloneexample.Address;

public class TestImmutability {
	public static void main(String[] args) {
		Address address = new Address(2, "Rajalok");
		Employee em = new Employee("1", "Bhagabta", address);
	
	}
}
