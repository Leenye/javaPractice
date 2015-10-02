package com.practice.designPattern.builerPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    protected List<String> parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        System.out.println("product parts information: ");
        for (String part: parts){
            System.out.println(part+"\t");
        }
    }
}
