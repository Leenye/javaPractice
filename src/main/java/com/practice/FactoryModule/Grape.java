package com.practice.factoryModule;

public class Grape implements Fruit{

    private boolean seedless;
    public void plant(){
        System.out.println("grape trees are planted");
    }

    public void grow(){
        System.out.println("grapes are growing");
    }

    public boolean getSeedless(){
        return seedless;
    }
    public void setSeedless(boolean seedless){
        this.seedless = seedless;
    }
}
