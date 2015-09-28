package com.practice;

public class StringPropertyPractice {

    public static void main(String[] args){
        String s = "hello kitty 123miao\\";
        String sUp = s.toUpperCase();
        String replacedString = s.replace("kitty", "tiger");
        String replaceAllString = s.replaceAll("\\d", "*");
        String replaceFirstString = s.replaceFirst("\\d", "*");

        System.out.println(s);
        System.out.println(sUp);
        System.out.println(replacedString);
        System.out.println(replaceAllString);
        System.out.println(replaceFirstString);
    }


}
