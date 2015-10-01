package com.practice;

/*字符串是个不可变对象，即一旦赋值，不可改变。
带来的优点是字符串处理速度提升和安全性能的提高*/

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
