package com.example.collections;

import java.util.HashSet;

public class HashSetMain {
    public static void main(String args[]){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("melon");

        fruits.remove("banana");


        int size = fruits.size();
        System.out.println(size);
        for (String f:fruits) {
            System.out.print(f +" ");
        }
        System.out.println();
        System.out.println(fruits);


    }
}
