package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ArrayListMainObject {
    public static void main(String args[]){

        List<ObjectClass> objects = new ArrayList<>();
        ObjectClass o1 = new ObjectClass("table", 1221);
        ObjectClass o2 = new ObjectClass("chair", 1211);
        ObjectClass o3 = new ObjectClass("office chair", 1212);
        ObjectClass o4 = new ObjectClass("office table", 1222);


        objects.add(o1);
        objects.add(o2);
        objects.add(o3);
        objects.add(o4);

        Collections.sort(objects);

        for (ObjectClass o:objects) {
            System.out.println("**********");
            System.out.println("Product : " +o.getProductName());
            System.out.println("Product : " +o.getProductId());
            System.out.println("**********");

        }



    }
}
