package com.pluralsight;

import java.util.Scanner;

public class PresentValueCalculator {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        //get monthly payout from user
        System.out.print("What is your monthly payout? :");
        double payOut = scanner.nextDouble();

        //get interest rate from user
        System.out.print("What is your expected interest % rate? :");
        double interest = scanner.nextDouble();

        //get payout of years from user
        System.out.print("What is your year to pay out? :");
        int length = scanner.nextInt();

        //interest rate in decimal format
        double interestRate = interest / 100;
        double monthlyRate = interestRate/12;
        int totalMonth =length*12;

        //calculate present value
        double presentValue=payOut * (1- Math.pow((1+monthlyRate), -totalMonth))/monthlyRate;

        System.out.printf("\nPresent Value of Annuity: $%,.2f\n", presentValue);

        scanner.close();
    }
}
