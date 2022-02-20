package com.dxc.javaconcepts.polymorphism;

public class MethodOverloading {

    public static void main(String[] args)
    {
        String add1,add2,add3;
        add1= String.valueOf(Addition.add(100,500975));
        add2= String.valueOf(Addition.add(235178187,235,23987));
        add3=String.valueOf(Addition.add(10025985,39875012));
        System.out.println("Addition of two integers parameters- "+add1);
        System.out.println("Addition of three integers parameters- "+add2);
        System.out.println("Addition of two double parameters- "+add3);



    }
}
