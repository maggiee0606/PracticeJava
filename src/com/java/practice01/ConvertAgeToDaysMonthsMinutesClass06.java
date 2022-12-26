package com.java.practice01;

import java.util.Scanner;

public class ConvertAgeToDaysMonthsMinutesClass06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();

        System.out.println("Months "+age*12);
        System.out.println("days " + age*365);
        System.out.println("minutes "+ age * 12*365*24*60);
    }
}
