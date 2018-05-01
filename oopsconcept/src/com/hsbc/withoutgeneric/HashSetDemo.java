package com.hsbc.withoutgeneric;
import java.util.HashSet;


public class HashSetDemo {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(10);
	h.add("B");
	h.add("B");
	h.add("C");
	h.add("Z");
	h.add("R");
	h.add("null");
h.add(null);
h.add(null);
System.out.println(h.add(new Integer(10)));

System.out.println(h);
}

}
