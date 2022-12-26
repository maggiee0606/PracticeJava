package com.java.practice01;

import java.util.Scanner;

public class FindAverageOfTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number" );
        int a = sc.nextInt();
        System.out.println("Please enter first number" );
        int b = sc.nextInt();
        System.out.println("Please enter first number" );
        int c = sc.nextInt();

        double result = (a+b+c)/3;
        System.out.println(result);
    }
}
