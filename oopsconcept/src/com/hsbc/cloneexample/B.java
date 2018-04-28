package com.hsbc.cloneexample;

public class B extends A implements Cloneable {
	public B(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "B [x=" + x + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		B b1 = new B(123);
		B clone = (B) b1.clone();
		System.out.println(clone);
		System.out.println(b1);
		// System.out.println(b1.x);
	}
}
