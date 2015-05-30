package com.machinary.listviewtest;

/**
 * Created by Administrator on 2015/5/28.
 */
public class Fruit {
    private String name;
    private int imageId;
    private double price;

    public Fruit(String name,int imageId,double price){
        this.name = name;
        this.imageId = imageId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public double getPrice() {
        return price;
    }
}

