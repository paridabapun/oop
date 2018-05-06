package com.hsbc.string;

import java.util.HashSet;
import java.util.Set;

public class StringHelper {
	public static Set<String> permutationFinder(String str) {
		Set<String> perm = new HashSet<String>();

		char initial = str.charAt(0); // first character
		String rem = str.substring(1); // Full string without first character
		Set<String> words = permutationFinder(rem);
		for (String strNew : words) {
			for (int i = 0; i <= strNew.length(); i++) {
				perm.add(charInsert(strNew, initial, i));
			}
		}
		return perm;
	}

	public static String charInsert(String str, char c, int j) {
		String begin = str.substring(0, j);
		String end = str.substring(j);
		return begin + c + end;
	}

	public static void main(String[] args) {
		String s = "AAC";
		String s1 = "ABC";
		String s2 = "ABCD";
		String s5="123";
		System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
		System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
		System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
	}
}