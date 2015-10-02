package com.practice.factoryModule;

public class FruitFactory {
    public static Fruit getFruitInstance(String fruit) throws Exception{
        if (fruit.equalsIgnoreCase("apple")){
            return new Apple();
        }else if (fruit.equalsIgnoreCase("grape")){
            return new Grape();
        }else{
            throw new IllegalArgumentException("no such fruit");
        }
    }
}
