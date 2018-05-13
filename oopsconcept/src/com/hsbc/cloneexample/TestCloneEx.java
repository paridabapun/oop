package com.hsbc.cloneexample;

public class TestCloneEx {

    public static void main(String[] args) {

        Address address = new Address(1, "Rajaloka");

        Employee employee = new Employee(1, "Bhagabata", address);
        System.out.println(employee);
//        Employee cloneEmployee = (Employee) employee.clone();
//        System.out.println(cloneEmployee);
    }
}
