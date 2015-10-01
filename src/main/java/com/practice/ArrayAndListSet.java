package com.practice;

import java.util.*;
/*Collection是java中最基本的集合接口，Set和List都实现了这个接口。
* set集合中元素无特定顺序，且没有重复元素。list以线性方式存储数据，集合中可以有重复对象。
* 集合中存放的数据类型都必须是引用类型，不能为基本数据类型*/

public class ArrayAndListSet {

    public static void main(String[] args){
        Collection<String> strings = new HashSet<String>();
        Set<Integer> integers = new TreeSet<Integer>();
        Set<String> stringLinkedHashSet = new LinkedHashSet<String>();

        List<String> stringList = new LinkedList<String>();
        List<String> stringArrayList = new ArrayList<String>();
        List<String> stringHash = new Vector<String>();
        Collection<String> stringsww = new Vector<String>();

        integers.add(1);
        integers.add(16);

        strings.add("hello");
        strings.add("kitty");

        int[] numbers = {1,2,3};
        String[] balalala = {"dabai","balalala"};

        System.out.println(integers);
        System.out.println(strings);
        System.out.println(numbers[2]);
    }

}
