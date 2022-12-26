package com.java.practiceCollections;

import java.util.ArrayList;
import java.util.List;

public class SortList2 {
    public static void main(String[] args) {
        List<Integer> listOfData = new ArrayList<>();

        listOfData.add(10);
        listOfData.add(50);
        listOfData.add(20);
        listOfData.add(45);


        int minNumber=listOfData.get(0);
        int minIndex=0;
        for (int i = 0; i < listOfData.size()-1; i++) {
            minNumber=listOfData.get(i);
            for (int j=i; j<listOfData.size();j++){
                if (listOfData.get(j)<minNumber){
                    minNumber=listOfData.get(j);
                    minIndex=j;

                }
            }

        }

    }
    }
