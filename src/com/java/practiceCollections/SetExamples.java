package com.java.practiceCollections;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        String str = "mama ma kota a kot ma ale, ale mama chce kota ktorego ma ala.";
        String sentence=str.toLowerCase(Locale.ROOT);
        String[] words = sentence.split(" ");


        Set<String> setOfWords = new HashSet<String>();
        Set<String> duplicateWords = new HashSet<>();


        //Try to add words into set and if it is duplicate add() method of set will return false
        for(String word:words){
            if (setOfWords.add(word)==false){
                duplicateWords.add(word);
            }
        }
        System.out.println("Duplicate words: "+duplicateWords);
    }
}
