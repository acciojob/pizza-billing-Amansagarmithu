package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean isCheesadded = false;
    boolean isToppingadded = false;
    boolean isbilljenerated = false;
    boolean isbagadded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }

    public int getPrice(){
        return price;

    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheesadded) return;
        this.price+=80;
        isCheesadded = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingadded) return;
        if(isVeg){
            this.price+=70;
        }
        else{
            this.price+=120;
        }
        isToppingadded = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(isbagadded) return;
        this.price+=20;
        isbagadded = true;
    }

    public String getBill(){
        // your code goes here
        if(isbilljenerated==false)this.bill = String.valueOf(price);
        isbilljenerated = true;
        return this.bill;

    }
}
