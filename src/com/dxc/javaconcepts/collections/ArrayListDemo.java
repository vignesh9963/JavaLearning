package com.dxc.javaconcepts.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);


        //list using ListIterator
        System.out.println("list using List iterator:");
        ListIterator<Integer> listIterator=arrayList.listIterator();
        System.out.println("ArrayList in Forward order");
        while (listIterator.hasNext())
        {
            Integer integer= listIterator.next();
            System.out.print(integer+" ");

        }
        System.out.println(" ");
        System.out.println("ArrayList in Reverse order");
        while(listIterator.hasPrevious())
        {
            Integer integer=listIterator.previous();
            System.out.print(integer+" ");
        }


        //List using For loop
        System.out.println(" ");
        System.out.println("List using For loop:");
        for (int i=0;i< arrayList.size();i++)
        {
            System.out.print(arrayList.get(i)+" ");
        }

        //List using Enhanced For loop
        System.out.println(" ");
        System.out.println("List using Enhanced For loop:");
       for(Integer i:arrayList)
       {
           System.out.print(i+" ");
       }


        //List using forEach Method
        System.out.println(" ");
        System.out.println("List using forEach Method:");
        arrayList.forEach(a->
                System.out.print(a+" "));



    }

}