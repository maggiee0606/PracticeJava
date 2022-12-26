package com.java.practiceCollections;


import java.util.ArrayList;
import java.util.List;

class Box<T>{
    T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }
}
public class PracticeCollection {
    public static void main(String[] args) {
        Box <Integer> box1 = new Box<Integer>();
        Box <String> boxName = new Box<String>();

        box1.setNum(20);
        System.out.println(box1.getNum());

        boxName.setNum("BoxName");
        System.out.println(boxName.getNum());


        List<Integer> list1 = new ArrayList<>();
        list1.add(7);
        System.out.println(list1.get(0));

        //Convert List to Array
        Object[]array= list1.toArray();
        for (Object numbers:array) {
            System.out.println(numbers.toString());

        }
    }

}
