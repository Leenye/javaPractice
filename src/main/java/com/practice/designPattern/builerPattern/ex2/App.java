package com.practice.designPattern.builerPattern.ex2;

public class App {
    public static void main(String[] args){
        Robert robert = new Robert.Builder("BigMax").id("001").build();
        System.out.println("name is "+ robert.getName()+" id is "+robert.getId()+" detail is "+robert.getDetailInfo());
    }
}
