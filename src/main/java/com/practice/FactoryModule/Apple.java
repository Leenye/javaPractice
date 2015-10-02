package com.practice.factoryModule;

public class Apple implements Fruit{

    private int treeAge;
    public void plant(){
        System.out.println("we're planting apple trees !");
    }

    public void grow(){
        System.out.println("the apple trees are growing");
    }

    public int getTreeAge() {
        return treeAge;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }
}
