package com.practice;

import java.util.*;

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
