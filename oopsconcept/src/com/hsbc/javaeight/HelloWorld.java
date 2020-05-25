package com.hsbc.javaeight;

import com.hsbc.serialization.S;

public class HelloWorld {

    public void m1(){
        System.out.println("Inside m1()");
    }

    public static void main(String[] args) {

//        WITHOUT JAVA 8
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Default Draw");
            }
        };
        drawable.draw();
//        WITH JAVA 8
        Drawable drawable1 = () -> {
            System.out.println("In lamda drawable");
        };
        drawable1.draw();

        HelloInteface  helloInteface = () -> {
            System.out.println("Hello");
        };
        helloInteface.hellow();

        HelloInteface  helloInteface1 = () -> { System.out.println("Hello helloInteface1"); };
        helloInteface1.hellow();
        HelloInteface  helloInteface2 = () ->  System.out.println("Hello helloInteface2");;
        helloInteface2.hellow();

        Operation operation = (a, b) -> {
            System.out.println("Sum of a+b is "+""+a+b);
        };
        operation.add(3,6);

    }


}