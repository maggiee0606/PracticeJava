package com.java.practice01;

import java.util.Scanner;

public class TotalAmountAfterDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is you total bill in $: ");
        double billAmount = scanner.nextDouble();
        System.out.println("What is you discount in %: ");
        double discount = scanner.nextDouble() / 100;
        double discountFinal = (1-discount);
        System.out.println("Your final bill is: " + billAmount*discountFinal);

    }
}
