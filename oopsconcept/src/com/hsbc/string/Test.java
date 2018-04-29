package com.hsbc.string;

public class Test {

	public static void main(String[] args) {
		String s = "Java Concept Of The Day";
		String dataTest = "";

		System.out.println(s.charAt(5)); // Output : C

		System.out.println(s.charAt(10)); // Output : p

		// System.out.println(s.charAt(25));
		if (dataTest.contentEquals("")) {
			System.out.println("Dont Proceed");
		} else {
			System.out.println(dataTest.concat("Proceed"));
		}
		int i = 0;
		System.out.println("Value od i =  " + i++);
		System.out.println("Value od i =  " + ++i);
		
		String s1="Bhagabata";
		System.out.println(s1);
		System.out.println(s1.intern());

	}

}
