package com.java.practiceCollections;

import java.util.ArrayList;
import java.util.List;

public class ListFindMaxNumber {
    public static void main(String[] args) {
        List<Integer>numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(6);
        numbers.add(77);

        int max = numbers.get(0); // assume our first num is max num

        for(int num: numbers){   // compare each number from list with our max num and if any num is greater update value of max num
            if (num>max){
                max=num;
            }
        }
        System.out.println(max); // print out max number
    }
}
