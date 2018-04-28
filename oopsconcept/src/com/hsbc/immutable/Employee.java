package com.hsbc.immutable;

import com.hsbc.cloneexample.Address;

public class Employee {

	private String employee_id;
	private String employee_name;
	private Address addresss;

	public Employee(String employee_id, String employee_name, Address addresss) {
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.addresss = addresss;

	}

	public String getEmployee_id() {
		return employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public Address getAddresss() {
		return addresss;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", employee_name=" + employee_name + ", addresss=" + addresss
				+ "]";
	}

}
