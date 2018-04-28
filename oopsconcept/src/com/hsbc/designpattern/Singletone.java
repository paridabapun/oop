package com.hsbc.designpattern;

import java.io.Serializable;

public class Singletone implements Serializable {

	// Using Approach-1

	private static Singletone single_instance = null;

	private Singletone() {
		System.out.println("New Object Created ");
	}

	public static Singletone getInstance() throws Exception {
		if (null == single_instance) {
			single_instance = new Singletone();
		}

		return single_instance;
	}

	/*
	 * // Using Approach-2 using public constructor
	 * 
	 * public Singletone() throws Exception { if (null != single_instance) { throw
	 * new Exception("Object Already Exist"); }
	 * 
	 * }
	 */
	// Using Approach-2 using public constructor

	// public Singletone() throws Exception {
	// if (null != single_instance) {
	// throw new Exception("Object Already Exist");
	// }

	// }

}
