package com.example.collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapMain {
    public static void main(String args[]){

        HashMap<Integer,String> plakalar = new HashMap<>();
        plakalar.put(16,"Bursa");
        plakalar.put(34,"İstanbul");
        plakalar.put(6,"Ankara");

        System.out.println(plakalar.get(34));
        Set<Integer> keys = plakalar.keySet();
        for (Integer i:keys) {
            System.out.print(plakalar.get(i) + " ");
        }

        HashMap<Integer,ObjectClass> objects = new HashMap<>();
        ObjectClass o1 = new ObjectClass("plank bed",111);
        ObjectClass o2 = new ObjectClass("wardrobe",112);
        ObjectClass o3 = new ObjectClass("bookcase",115);
        ObjectClass o4 = new ObjectClass("dresser",120);

        objects.put(o1.getProductId(),o1);
        objects.put(o2.getProductId(),o2);
        objects.put(o3.getProductId(),o3);
        objects.put(o4.getProductId(),o4);

        Set<Integer> productIds = objects.keySet();

        for (int i: productIds){
            System.out.println("********");
            System.out.println("Product id : "+objects.get(i).getProductId());
            System.out.println("Product : "+objects.get(i).getProductName());
            System.out.println("********");
        }
    }
}
