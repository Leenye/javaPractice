package com.practice.designPattern.builerPattern;

public class DellBuilder implements Builder{
    private Product product = new Product() {
    };

    public void buildCpu(){
        product.add("CPU: Intel i7");
    }

    public void buildMemory(){
        product.add("Memory: 8GB");
    }

    public void buildDisplayCard(){
        product.add("DisplayCard: NBIDIA 1600MHz");
    }

    public Product getFinalResult(){
        return product;
    }
}
