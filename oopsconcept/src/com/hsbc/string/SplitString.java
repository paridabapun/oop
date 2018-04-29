package com.hsbc.string;

public class SplitString {
	public static void main(String[] args) {

		String s1 = "My name@Bhagbata @PArida";
		String arr[] = s1.split("@");
		for (String s : arr) {
			System.out.print(s);
		}

	}
}
