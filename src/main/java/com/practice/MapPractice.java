package com.practice;

import java.util.*;

/*map是java中的一种集合，存放的数据是键值对的形式。
内部实现了一个Map.Entry的接口，接口的方法主要有getKey()和getValue()
map的遍历，也可以用Iterator来实现*/

public class MapPractice {

    public static void main(String[] args){
        Map<String,String> hashMap = new HashMap<String, String>();
        hashMap.put("00","cats");
        hashMap.put("01","dogs");
        hashMap.put("10", "fish");

        if (hashMap.containsKey("00")){
            System.out.println(hashMap.get("00"));
            hashMap.replace("00", "little cats");
            hashMap.put("11", "sheep");
            hashMap.remove("01");
        }

        if (hashMap.containsValue("fish")){
            Collection values = hashMap.values();
            Set keySet = hashMap.keySet();
            Set entrySet = hashMap.entrySet();

            System.out.println(hashMap.size());
            System.out.println("map’s entryset: " + entrySet);
            System.out.println("map's keyset: "+ keySet);
            System.out.println("map's values: "+ values);
        }

        for (String key: hashMap.keySet()){
            System.out.println("遍历key: "+ key + ", " + hashMap.get(key));
        }

        for (Map.Entry<String,String> entry : hashMap.entrySet()){
            System.out.println("遍历entryset："+entry.getKey()+", "+entry.getValue());
        }

        Iterator iterator1 = hashMap.entrySet().iterator();
        while(iterator1.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator1.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("通过iterator遍历entryset："+ key +", " +value);
        }

        Iterator iterator2 = hashMap.keySet().iterator();
        while(iterator2.hasNext()) {
            Object key = iterator2.next();
            Object value = hashMap.get(key);
            System.out.println("遍历keyset："+ key + value);
        }

    }

}
