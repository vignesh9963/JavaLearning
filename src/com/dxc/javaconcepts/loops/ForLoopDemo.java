package com.dxc.javaconcepts.loops;

import java.util.Scanner;

import static com.dxc.javaconcepts.loops.Factorial.factorial;

class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}




public class ForLoopDemo {

        public static void main(String[] args){
            int fact;
            int number;

            Scanner sc=new Scanner(System.in);
            while (true) {
                System.out.println("\nEnter Your Choice to Perform : 1.Factorial  2.Fibonacci  3.Exit" );
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter  Number");
                        number = sc.nextInt();
                        fact = factorial(number);
                        System.out.println("Factorial of " + number + " is: " + fact);
                    case 2:
                        int n1=0,n2=1,n3,i;
                        System.out.println("Enter  Number");
                        number = sc.nextInt();
                        System.out.print("Fibonacci series of "+number+ " is "+n1+" "+n2);

                        for(i=2;i<number;++i)
                        {
                            n3=n1+n2;
                            System.out.print(" "+n3);
                            n1=n2;
                            n2=n3;
                        }

                    case 3:
                        System.exit(0);


                }
            }
        }
    }
