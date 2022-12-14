package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        addExtraCheese();
        addExtraToppings();
    }
    @Override
    public void addExtraToppings(){
        super.addExtraToppings();
    }

    @Override
    public void addTakeaway() {
        super.addTakeaway();
    }
    @Override
    public String getBill(){
        return super.getBill();
    }
}
