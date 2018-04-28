package com.hsbc.designpattern;

public class TestDesinPattern {
	public static void main(String[] args) {

		
		

		Singletone singletone2=Singletone.getInstance();
		Singletone singletone3=Singletone.getInstance();
		Singletone singletone4=Singletone.getInstance();
		Singletone singletone5=Singletone.getInstance();
		System.out.println(singletone2);
		System.out.println(singletone3);
		System.out.println(singletone4);
		System.out.println(singletone5);
		
	}

}
