package com.hsbc.mcqs;
public class MCQ3 {
//Tricky really ..
    public static void main(String[] args) {
        try {
            String s1 = null;
            System.out.println("Try ......");
        }
             finally {
            System.out.println("Finally Executed first later exception raise ");
        }
    }
}
