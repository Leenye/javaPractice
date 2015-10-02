package com.practice.factoryModule;

public class App {

    public static void main(String[] args) throws Exception {
        Fruit fruit = FruitFactory.getFruitInstance("apple");
        fruit.grow();
    }
}
