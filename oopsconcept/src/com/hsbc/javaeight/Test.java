package com.hsbc.javaeight;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Object o = new Double(3);
        Number number = (Number)o;
        System.out.println(number);
    }
}
