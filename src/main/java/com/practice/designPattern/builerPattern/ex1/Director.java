package com.practice.designPattern.builerPattern.ex1;

public class Director {
    private Builder builder;
    public Director (Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.buildCpu();
        builder.buildDisplayCard();
        builder.buildMemory();
    }

}
