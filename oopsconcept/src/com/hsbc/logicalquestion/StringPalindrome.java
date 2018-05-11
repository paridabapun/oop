package com.hsbc.logicalquestion;

public class StringPalindrome {

    public static  void  checkPalindrome (String s){
        StringBuffer stringBuffer=new StringBuffer(s);
        String s1=stringBuffer.reverse().toString();
        if (s1.equalsIgnoreCase(s)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("not Palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindrome("aba");
    }

}
