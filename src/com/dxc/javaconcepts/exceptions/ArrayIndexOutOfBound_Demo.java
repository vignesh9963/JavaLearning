package com.dxc.javaconcepts.exceptions;

import java.util.Scanner;

public class ArrayIndexOutOfBound_Demo {

    public static void main(String args[])
    {
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a array index to store a value");
            int i=sc.nextInt();
            int a[] = new int[5];
            a[i] = 9;
            System.out.println("The stored value is "+a[i]+" at the index "+i);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
}
