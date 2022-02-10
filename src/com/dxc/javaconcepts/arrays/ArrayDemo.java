package com.dxc.javaconcepts.arrays;

import java.util.ArrayList;

class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class ArrayDemo
{
    public static void main (String[] args)
    {


        Student[] arr1,arr2;
        arr1 = new Student[5];
        arr2 = new Student[arr1.length];
        arr1[0] = new Student(1,"Rohit");
        arr1[1] = new Student(2,"Virat");
        arr1[2] = new Student(3,"Mayank");
        arr1[3] = new Student(4,"KL Rahul");
        arr1[4] = new Student(5,"Shubham");
        for ( int i = 0; i < arr1.length; i++)
            System.out.println("Element at " + i + " : " +
                    arr1[i].roll_no +" "+ arr1[i].name);
//Copying arr1 to arr2

        for (int i = 0; i < arr1.length; i++)
        {
            arr2[i] = arr1[i];
        }

        System.out.println("\"Elements of new array:\" ");
        for (int i = 0; i < arr2.length; i++)
        {
            System.out.println("Element at " + i + " : " +
                    arr1[i].roll_no +" "+ arr1[i].name);
        }
    }
}
