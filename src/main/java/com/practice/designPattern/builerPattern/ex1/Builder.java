package com.practice.designPattern.builerPattern.ex1;

public interface Builder {
    public void buildCpu();
    public void buildMemory();
    public void buildDisplayCard();
    public Product getFinalResult();
}
