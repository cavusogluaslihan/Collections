package com.example.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetMainObject {
    public static void main(String args[]){

        HashSet<ObjectClass> object = new HashSet<>();
        ObjectClass o1 = new ObjectClass("plank bed",111);
        ObjectClass o2 = new ObjectClass("wardrobe",112);
        ObjectClass o3 = new ObjectClass("bookcase",115);
        ObjectClass o4 = new ObjectClass("dresser",120);

        object.add(o1);
        object.add(o2);
        object.add(o3);
        object.add(o4);

        ObjectClass o5 = new ObjectClass("sideboard",121);

        object.add(o5);


        for (ObjectClass s:object) {
            System.out.println("********");
            System.out.println("Product : "+s.getProductName());
            System.out.println("Product : "+s.getProductId());
            System.out.println("********");
        }




    }
}
