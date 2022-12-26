package com.java.practiceEnum;

public class EnumExercise {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY();
        if ( day == DaysOfTheWeek.THURSDAY){
            System.out.println("Yey it is almost Friday");
        }
        for (DaysOfTheWeek myDay:DaysOfTheWeek.values()){
            System.out.println(myDay);
        }
    }
}
