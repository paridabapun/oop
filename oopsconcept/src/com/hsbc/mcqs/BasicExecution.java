package com.hsbc.mcqs;

public class BasicExecution {

	BasicExecution() {

		System.out.println("o arg constructor executed.......");
	}

	public int x = 7;
	static int y = 5;

	static {
		int y = 7;
		String name = "Bapunu";
		System.out.println("Static block executed..");

	}
	{
		int y = 7;
		String name = "Bapunu";
		System.out.println("instance  block executed..");
	}

	public static void main(String[] args) {
		BasicExecution bex = new BasicExecution();
		System.out.println();

	}
}
