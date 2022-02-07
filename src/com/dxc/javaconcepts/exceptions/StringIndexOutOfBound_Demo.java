package com.dxc.javaconcepts.exceptions;

public class StringIndexOutOfBound_Demo {

    public static void main(String args[])
    {
        try {
            String a = "This is like a demo page"; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
