package com.hsbc.withoutgeneric;
import java.util.LinkedList;


public class LinkedListDemo {
	public static void main(String[] args) {
	
LinkedList l=new LinkedList();
l.add(null);
l.add("Bapun");
l.add(123);
l.addLast("Last");
l.addFirst("First");
l.add("Bhagabata");
System.out.println(l.size());
//l.addAll(l);
//System.out.println("After modification"+"\n"+l);
//System.out.println(l.get(8));
l.remove(1);
System.out.println(l);
System.out.println(l.get(1));

}
}
