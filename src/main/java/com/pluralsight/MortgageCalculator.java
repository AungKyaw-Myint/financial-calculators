package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        //get principal amount from user
        System.out.print("What is your principal? :");
        double principal = scanner.nextDouble();

        //get interest rate from user
        System.out.print("What is your interest % rate? :");
        double interest = scanner.nextDouble();

        //get loan length of years from user
        System.out.print("What is your loan length in year? :");
        int length = scanner.nextInt();

        //interest rate in decimal format
        double interestRate = interest / 100;
        double monthlyInterest = interestRate / 12;
        int totalMonth = length * 12;

        //calculate monthly payment
        double monthlyPayment = principal * ( monthlyInterest * Math.pow(1+monthlyInterest, totalMonth))
                / (Math.pow(1+monthlyInterest, totalMonth)-1);

        //calculate total interest
        double totalInterest = (totalMonth * monthlyPayment) - principal;

        System.out.printf("\nMonthly Payment: $%,.2f\n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%,.2f\n", totalInterest);

        scanner.close();


    }
}