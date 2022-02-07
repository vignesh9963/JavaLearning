package com.dxc.javaconcepts.inter.impl;


import com.dxc.javaconcepts.inter.Vehicle;

import java.util.Scanner;

class DistanceTravelled implements Vehicle {


    @Override
    public void getValues(float speed, float time) {
        float distance;
        distance=speed*time;
        System.out.println("Distance travelled in km = "+distance+"km");
        System.out.println("Distance in meters = "+distance*1000+"m");
    }
}


public class Interface_demo {

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter \"speed\" in kmph ");
        float s=sc.nextInt();
        System.out.println("Enter \"time\" in hours");
        float d= sc.nextInt();
        DistanceTravelled distanceTravelled=new DistanceTravelled();
        distanceTravelled.getValues(s,d);

    }
}
