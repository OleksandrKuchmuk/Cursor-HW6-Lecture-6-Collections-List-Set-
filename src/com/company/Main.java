package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Task #1
        System.out.println("Task 1:");
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));
        System.out.println(listOfIntegers);
        for (int i = 0; i < listOfIntegers.size(); i++) {
            if (listOfIntegers.get(i) % 3 == 0) {
                listOfIntegers.remove(i);
                i--;
            }
        }
        System.out.println(listOfIntegers);

        // Task #2
        System.out.println("\nTask 2:");
        List<String> listOfFruits = new ArrayList<>() {
            {
                add("apple");
                add("apricot");
                add("avocado");
                add("banana");
                add("Blackberry");
                add("lemon");
                add("mandarin");
                add("mango");
                add("pineapple");
            }
        };
        System.out.println(listOfFruits);

        int countOfIntegers = 0;
        for (int i = 0; i < listOfFruits.size(); i++) {
            if (listOfFruits.get(i).equals("orange")) {
                listOfFruits.set(i, "Grapefruit");
                i--;
                countOfIntegers++;
            }
        }

        if (countOfIntegers == 0) {
            System.out.println("In this list value 'orange' not present");
        }

        listOfFruits.add("orange");
        System.out.println("\nOrange added to the list\n" + listOfFruits);

        int countOfFruits = 0;
        for (int i = 0; i < listOfFruits.size(); i++) {
            if (listOfFruits.get(i).equals("orange")) {
                listOfFruits.set(i, "Grapefruit");
                i--;
                countOfFruits++;
                System.out.println("\nOrange was changed to Grapefruit\n" + listOfFruits);
            }
        }

        if (countOfFruits == 0) {
            System.out.println("In this list value 'orange' not present");
        }

        //Task #3
        System.out.println("\nTask 3:");
        List<Integer> listOfIntegers1 = new ArrayList<>(Arrays.asList(2, 12, 25, 36, 49, 75, 26, 33, 26, 71, 96));
        List<Integer> listOfIntegers2 = new ArrayList<>(Arrays.asList(2, 25, 75, 33, 23, 17, 39, 13, 65, 120, 37));
        System.out.println(listOfIntegers1);
        System.out.println(listOfIntegers2);

        int countOfSimilarElements = 0;
        for (int j : listOfIntegers1) {
            for (int k : listOfIntegers2) {
                if (j == k) {
                    countOfSimilarElements++;
                }
            }
        }

        if (countOfSimilarElements != 0) {
            System.out.println("ArrayLists have " + countOfSimilarElements + " similar elements");
        } else {
            System.out.println("ArrayLists don't have similar elements");
        }
    }
}