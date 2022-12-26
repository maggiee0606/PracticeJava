package com.java.practice01;

import java.util.Scanner;

////Write a program to print a given number that is positive, negative or zero

public class MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int customerNum = sc.nextInt();

        isNumberPositiveNegativeOrZero(customerNum);

    }
    public static void isNumberPositiveNegativeOrZero (int customerNum) {

        if (customerNum == 0){
            System.out.println("Your number "+customerNum+" is zero");
        } else if (customerNum>0){
            System.out.println("Your number "+customerNum+" is a positive number");
        } else{
            System.out.println("Your number "+customerNum+" is negative");
        }
    }
}
