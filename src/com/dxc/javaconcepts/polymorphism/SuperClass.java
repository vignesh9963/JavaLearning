package com.dxc.javaconcepts.polymorphism;

public class SuperClass {

    void Print()
    {
        System.out.println("Super class");
    }
}

 class Subclass1 extends SuperClass
{
    void Print()
    {
        System.out.println("Subclass1");
    }

}

class Subclass2 extends SuperClass
{
    void Print()
    {
        System.out.println("Subclass2");
    }
}



