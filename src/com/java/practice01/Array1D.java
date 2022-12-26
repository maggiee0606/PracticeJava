package com.java.practice01;

public class Array1D {
    public static void main(String[] args) {
        int data [] = {1,2,3,4,5};
        //or
        int data1 [] = new int [5]; // 0

        System.out.println(data.length);

        for (int i=0; i<data.length; i++){  // for loop way to find number from array
            System.out.println(data[i]);

            for ( int numbers : data){
                System.out.println(numbers); // for each loop way
            }
        }
    }
}
