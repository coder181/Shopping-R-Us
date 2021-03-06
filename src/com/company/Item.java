package com.company;

public class Item {
    private String sku;
    private String name;
    private double price;

    public Item(String sku, String name, double price){
        this.sku = sku;
        this.name = name;
        this.price = price;
    }

    public String getSku(){
        return sku;
    }
    public void setSku(String newSku){
        this.sku = newSku;
    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
}
