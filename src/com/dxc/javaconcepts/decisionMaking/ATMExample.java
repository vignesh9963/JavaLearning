package com.dxc.javaconcepts.decisionMaking;

import java.util.Scanner;

public class ATMExample {

    public static void main(String[] args) {
        int balance = 30000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("       \"Automated Teller Machine\"       ");
            System.out.println("Choose any one of the operations to perform");
            System.out.println("1. \"Withdraw\" 2.  \"Deposit\" 3. \"Check Balance\" 4. \"Exit\" ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Money to be Withdrawn");
                    withdraw = sc.nextInt();

                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please Collect your Cash " + withdraw);
                    } else {
                        System.out.println("Insufficient Funds");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter Money to Deposit");
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been deposited Successfully");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
