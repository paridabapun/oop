package com.hsbc.withgeneric;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		
		List<Employee> employeeList=new  ArrayList<Employee>();
		employeeList.add(new Employee(1, "Bhagabata"));
		
		for(int i=0;i<10;i++) {
			Employee e=new Employee();
			e.setEid(i);
			e.setEname("Bhagabata"+i);
			employeeList.add(e);
		}
		System.out.println(employeeList);
		
		
	}

}
