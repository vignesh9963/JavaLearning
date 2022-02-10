package com.dxc.javaconcepts.loops;

import java.util.ArrayList;


public class EnhancedForLoop {

    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Virat");
        arr.add("Rohit");
        arr.add("Shikar");
        arr.add("Jayawardane");


        for (String x:arr)
        {
            System.out.println(x);
        }

    }
}
