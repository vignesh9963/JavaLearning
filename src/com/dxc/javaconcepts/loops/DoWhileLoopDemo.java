package com.dxc.javaconcepts.loops;

import java.util.Scanner;

public class DoWhileLoopDemo {

    public static void main(String[] args)
    {
        int number, i,countEven=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        number = sc.nextInt();
        i=2;
        System.out.print("List of even numbers: ");
        do
        {
            if(number%2==0)
            {
                System.out.print(i + " ");
                i = i + 2;
                countEven+=1;
            }

        }

        while(i<=number);
        System.out.println("\n Total No. of even Numbers : "+countEven);
    }


}
