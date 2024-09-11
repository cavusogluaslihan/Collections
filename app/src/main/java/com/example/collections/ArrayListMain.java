package com.example.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMain {
    public static void main (String args[]){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("peach");
        fruits.add("melon");
        System.out.println("Size : " +fruits.size());

        System.out.println(fruits.get(2));
        fruits.add("strawberry");
        System.out.println("Size : " +fruits.size());

        fruits.remove(3);
        fruits.remove("apple");


        fruits.add(1,"peach");

        fruits.set(3,"grape");

        Collections.sort(fruits);

        for (String a:fruits) {
            System.out.print(a+" ");


        }
    }
}

