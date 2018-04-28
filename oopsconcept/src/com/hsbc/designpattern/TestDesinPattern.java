package com.hsbc.designpattern;

public class TestDesinPattern {
	public static void main(String[] args) throws Exception {

		Singletone singletone2 = Singletone.getInstance();
		Singletone singletone3 = Singletone.getInstance();
		Singletone singletone4 = Singletone.getInstance();
		Singletone singletone5 = Singletone.getInstance();
		Singletone singletone6=new Singletone();
		
		
		System.out.println(singletone2);
		System.out.println(singletone3);
		System.out.println(singletone4);
		System.out.println(singletone5);
		System.out.println(singletone6);

	}

}
