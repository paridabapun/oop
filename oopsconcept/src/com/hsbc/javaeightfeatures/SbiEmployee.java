package com.hsbc.javaeightfeatures;

import java.util.ArrayList;
import java.util.function.Predicate;

public class SbiEmployee {

    private String name;
    private double salary;
    private String designation;
    private String location;

    public SbiEmployee(String name, double salary, String designation, String location) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.location = location;
    }

    @Override
    public String toString() {

        return String.format("(%s,%.2f ,%s,%s)\n", name, salary, designation, location);

    }


    public static void main(String[] args) {

        ArrayList<SbiEmployee> sbiEmployees = new ArrayList<>();

        SbiEmployee sbiEmployee = new SbiEmployee("Bhagabata", 10000, "SSE", "Pune");
        SbiEmployee sbiEmployee1 = new SbiEmployee("Bapun", 40000, "Software Engineer", "Hyderabad");
        SbiEmployee sbiEmployee2 = new SbiEmployee("Sipun", 47000, "Associates", "Pune");
        SbiEmployee sbiEmployee3 = new SbiEmployee("Liza", 16000, "SSE", "Mumbai");
        SbiEmployee sbiEmployee4 = new SbiEmployee("Tutun", 17000, "Manager", "Hyderabad");
        SbiEmployee sbiEmployee5 = new SbiEmployee("Dasree", 19000, "Manager", "Mumbai");
        SbiEmployee sbiEmployee6 = new SbiEmployee("Nirakar", 20000, "Software Engineer", "Pune");
        SbiEmployee sbiEmployee7 = new SbiEmployee("KArtik", 90000, "SSE", "Mumbai");
        sbiEmployees.add(sbiEmployee);
        sbiEmployees.add(sbiEmployee1);
        sbiEmployees.add(sbiEmployee2);
        sbiEmployees.add(sbiEmployee3);
        sbiEmployees.add(sbiEmployee4);
        sbiEmployees.add(sbiEmployee5);
        sbiEmployees.add(sbiEmployee6);
        sbiEmployees.add(sbiEmployee7);
        System.out.println(sbiEmployees);


        Predicate<SbiEmployee> sbiEmployeePredicate = employee -> employee.salary >= 10000;


    }
}
