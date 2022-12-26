package com.java.practice01;

import java.util.Scanner;

//Write a program to get a number from user and print square of given number
public class SquareOfGivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();

        int result = num*num;
        System.out.println(result);
    }
}
