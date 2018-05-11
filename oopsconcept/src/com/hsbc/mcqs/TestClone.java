package com.hsbc.mcqs;

public class TestClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address=new Address();
		address.setAddress1("Pune");
		Employee employee = new Employee(1, "Bapun",address);
		System.out.println("Origan Employee  "+employee.getEid() + "  " + employee.getEname()+" "+employee.getAddress());
		Employee employee2 = (Employee) employee.clone();
//		employee2.address.address1="Delhi";
		employee2.address.setAddress1("Mumbai");
	
		System.out.println("Origan Employee  "+employee.getEid() + "  " + employee.getEname()+" "+employee.getAddress());
		System.out.println("Clone Employee  "+employee2.getEid() + "  " + employee2.getEname()+" "+employee2.getAddress());
		System.out.println(employee.hashCode());
		System.out.println(employee2.hashCode());
	
		if (employee.hashCode() == employee2.hashCode()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}