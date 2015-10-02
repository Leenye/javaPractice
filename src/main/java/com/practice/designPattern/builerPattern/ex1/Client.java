package com.practice.designPattern.builerPattern.ex1;

public class Client {

    private static Builder acerBuilder = new AcerBuilder(),
                           dellBuilder = new DellBuilder();

    public static void main(String[] args){

        System.out.println("Acer");
        Director director = new Director(acerBuilder);
        director.construct();
        Product product = acerBuilder.getFinalResult();
        product.show();

        System.out.println("Dell");
        director = new Director(dellBuilder);
        director.construct();
        product = dellBuilder.getFinalResult();
        product.show();
    }
}
