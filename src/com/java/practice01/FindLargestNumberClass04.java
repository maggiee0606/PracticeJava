package com.java.practice01;

import java.util.Scanner;

public class FindLargestNumberClass04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 2 numbers: ");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if (num1==num2) {
                System.out.println("Numbers are equal");
            }else if (num1>num2){
                System.out.println("The greatest number is " + num1);
            }else{
                System.out.println("The greatest number is "+ num2);
            }

    }
}
