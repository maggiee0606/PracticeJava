package com.java.practice01;

import java.util.Scanner;

//Write a program to get principle, rate of interest and number of years from the user
//        and calculate simple interest
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter principle in $: ");
        double principle = scanner.nextDouble();
        System.out.println("What is rate of interest? " );
        double interestRate= scanner.nextDouble()/100;
        System.out.println("Enter number of years of your mortgage? ");
        double numberOfYears= scanner.nextDouble();

        double simpleInterest = principle*interestRate*numberOfYears;
        System.out.println("Simple interest for your loan is: "+ simpleInterest);
    }
}
