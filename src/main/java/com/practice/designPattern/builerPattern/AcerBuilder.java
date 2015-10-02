package com.practice.designPattern.builerPattern;

public class AcerBuilder implements Builder {
    private Product product = new Acer();

    public void buildCpu(){
        product.add("CPU: Intel i5");
    }

    public void buildMemory(){
        product.add("Memory: 4GB");
    }

    public void buildDisplayCard(){
        product.add("DisplayCard: NVIDIA 520M");
    }

    public Product getFinalResult(){
        return product;
    }
}
