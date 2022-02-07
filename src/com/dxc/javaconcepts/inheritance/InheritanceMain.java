package com.dxc.javaconcepts.inheritance;

public class InheritanceMain {

    public static void main(String args[])
    {
        PersonA personA=new PersonA(23,"VIGNESH");
        System.out.println(personA);


        Student student=new Student(23,"VIGNESH",2021,"JAVA","Virat","A_grade");
        System.out.println(student);

        Employee employee=new Employee(23,"VIGNESH",2021,"JAVA","Virat","A_grade",99,50000,"SAP Hybris");
        System.out.println(employee);

    }
}

