package com.hsbc.designpattern;

public class TestDesinPattern {
	public static void main(String[] args) throws Exception {

		Singletone singletone2 = Singletone.getInstance();
		Singletone singletone3 = Singletone.getInstance();
		Singletone singletone4 = Singletone.getInstance();
		Singletone singletone5 = Singletone.getInstance();
		Singletone singletone6=new Singletone();
		Singletone singletone7=new Singletone();
		
		Singletone singletone8=new Singletone();
		
		
		
		System.out.println(singletone2);
		System.out.println(singletone3);
		System.out.println(singletone4);
		System.out.println(singletone5);
		System.out.println(singletone6);
		System.out.println(singletone7);
		System.out.println(singletone8);

	}

}
