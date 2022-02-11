package com.dxc.javaconcepts.strings;

import java.util.Scanner;


//Displaying the total number of characters present in the string
public class StringDemo {

    public static void main(String[] args) {
        String string;
        System.out.println("Enter string");
        Scanner sc=new Scanner(System.in);
        string=sc.nextLine();
        int count = 0;

        for(int i = 0; i < string.length(); i++) {
            if(string.charAt(i) != ' ')
                count++;
        }

        System.out.println("Total number of characters in a string: " + count);
    }
}
