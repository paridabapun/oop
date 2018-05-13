package com.hsbc.cloneexample;

public class Address {
    private int address_id;
    private String address_details;

    public Address(int address_id, String address_details) {
        this.address_id = address_id;
        this.address_details = address_details;
    }

    @Override

    public String toString() {
        return "Address ID " + address_id + " " + "Address Details " + address_details;
    }
}

