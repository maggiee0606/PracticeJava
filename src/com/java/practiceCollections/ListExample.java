package com.java.practiceCollections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        List<String> listOfItems = new ArrayList<String>();

        listOfItems.add("Banana");
        listOfItems.add("Apple");
        listOfItems.add("Cucumber");

//        for (int i = 0; i < listOfItems.size(); i++) {
//            System.out.println(listOfItems.get(i));

//        for (String item:listOfItems) {
//            System.out.println(item);
//           }
        Iterator<String> itr = listOfItems.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        }
    }

