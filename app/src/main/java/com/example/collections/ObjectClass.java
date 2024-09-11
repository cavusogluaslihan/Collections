package com.example.collections;

import androidx.annotation.Nullable;

public class ObjectClass implements Comparable<ObjectClass> {
    private String productName;
    private int productId;

    public ObjectClass() {
    }

    public ObjectClass(String productName, int productId) {
        this.productName = productName;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Override
    public int compareTo(ObjectClass objectClass) {
        return new String(this.productName).compareTo(objectClass.getProductName());
    }

    @Override
    public int hashCode() {
        return this.productId;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (this.productId == ((ObjectClass)obj).getProductId()){
            return true;
        } else {
            return false;
        }
    }
}
