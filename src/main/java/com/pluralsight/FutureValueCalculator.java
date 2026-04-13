package com.pluralsight;

import java.util.Scanner;

public class FutureValueCalculator {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        // get deposit from user
        System.out.print("What is your deposit amount? :");
        double deposit = scanner.nextDouble();

        //get interest rate from user
        System.out.print("What is your interest % rate? :");
        double interest = scanner.nextDouble();

        //get total length of year
        System.out.print("What is your total in year? :");
        int length = scanner.nextInt();

        //interest rate in decimal format
        double interestRate = interest / 100;

        //calculate future value
        double futureValue = deposit * Math.pow((1+ (interestRate / 365)), (365*length));

        System.out.printf("\nTotal balance: $%,.2f\n", futureValue);
        System.out.printf("Total Interest: $%,.2f\n", futureValue-deposit);

        scanner.close();



    }
}
