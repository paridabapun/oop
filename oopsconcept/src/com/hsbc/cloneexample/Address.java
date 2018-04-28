package com.hsbc.cloneexample;

public class Address implements Cloneable {
	private int aid;
	private String address;

	public Address(int aid, String address) {
		super();
		this.aid = aid;
		this.address = address;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Address [aid=" + aid + ", address=" + address + "]";
	}

	public int getAid() {
		return aid;
	}


	public String getAddress() {
		return address;
	}

	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
