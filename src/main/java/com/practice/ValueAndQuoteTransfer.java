package com.practice;

public class ValueAndQuoteTransfer {

    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("before change , sb = " +sb);
        changeData(sb);
        System.out.println("after change, sb = " +sb);
    }

    static void changeData(StringBuffer stringBuffer){
       StringBuffer sb2 = new StringBuffer("hi ");
        sb2.append("world");
        stringBuffer = sb2;
    }
}
