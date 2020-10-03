package com.hsbc.javaeight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Tester {

    public static void main(String[] args) {
        List<String> names1 = new ArrayList<String>();
        names1.add("Bhagabata ");
        names1.add("Liza ");
        names1.add("Babuli ");
        names1.add("Sulekha ");
        names1.add("Meera ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Bhagabata ");
        names2.add("Liza ");
        names2.add("Babuli ");
        names2.add("Sulekha ");
        names2.add("Meera ");

        Java8Tester tester = new Java8Tester();
        System.out.println("Before Sorting using Java7 \n" + names1);
        tester.sortUsingJava7(names1);
        System.out.println("After Sorting using Java7 \n" + names1);


        System.out.println("USING JAVA 8 ----------");
        System.out.println("Before Sorting using Java8 \n" + names2);
    }

    //Using java 7
    private void sortUsingJava7(List<String> strings) {

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    //Using java 8
    private void sortUsingJava8(List<String> strings) {

        Collections.sort(strings, (o1, o2) -> o1.compareTo(o2));
    }
}