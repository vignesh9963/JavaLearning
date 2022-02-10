package com.dxc.javaconcepts.loops;

import java.util.Scanner;
//To display even numbers
public class WhileLoopDemo {
    public static void main(String[] args)
    {
        int number, i,countEven=0,countOdd=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the limit: ");
        number = sc.nextInt();
        i=2;
        System.out.print("List of even numbers: ");
        while(i<=number)
        {
            if(number%2==0) {
                System.out.print(i + " ");
                i = i + 2;
                countEven+=1;
            }
        }
        System.out.println("\n Total No. of even Numbers : "+countEven);
    }
}
