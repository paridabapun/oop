package com.hsbc.mcqs;
//Deutche Bank
public class MCQ11 {

    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("DBOI");
        StringBuilder b=new StringBuilder("Bangalore");
        a.delete(1,3);
        a.append(b);
        System.out.println(a);
    }
}
