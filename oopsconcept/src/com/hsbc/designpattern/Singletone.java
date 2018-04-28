package com.hsbc.designpattern;

import java.io.Serializable;

public class Singletone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Singletone single_object = null;

	private Singletone() {
		System.out.println("New instance");
	}

	public static Singletone getInstance() {
		if (null == single_object) {
			single_object = new Singletone();
		}

		return single_object;
	}

}
