package com.hsbc.withgeneric;
//Sort the elements of  the List based on Natural Sorting order
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<String>();
		l1.add("B");
		l1.add("Z");
		l1.add("A");
		l1.add("BA");
		l1.add("ZP");
		l1.add("AA");
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println("natural sorting order" + l1);
	}
}
