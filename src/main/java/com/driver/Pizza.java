package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int takeAwayPrice;
    boolean isCheesAdded;
    boolean isToppingAdded;
    boolean isbillGenerated;
    boolean isTakeAwayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;
        if(isVeg){
            this.price = 300;
            this.toppingsPrice = 70;
        }
        else{
            this.price = 400;
            this.toppingsPrice = 120;
        }
        isCheesAdded = false;
        isToppingAdded = false;
        isTakeAwayAdded = false;
        isbillGenerated = false;
        this.bill = "Base Price of the Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return price;

    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheesAdded==false){
            this.price+=this.cheesePrice;
            isCheesAdded = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            this.price+=this.toppingsPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price+=this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isbillGenerated==false){
            if(isCheesAdded){
                this.bill += "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingAdded){
                this.bill += "Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isTakeAwayAdded){
                this.bill += "Paperbag Added: "+this.takeAwayPrice+"\n";
            }
            this.bill += "Total Price: "+this.price+"\n";
            isbillGenerated = true;
        }
        return this.bill;

    }
}
