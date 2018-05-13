package com.hsbc.cloneexample;


public class Employee implements Cloneable {

    private int employee_id;
    private String employee_name;
    private Address address;

    public Employee(int employee_id, String employee_name, Address address) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.address = address;
    }

    public Employee() {
        System.out.println("Default constructor executed of employee");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "employee_id =" + employee_id + " employee_name =" + employee_name + " address =" + address;
    }
}



