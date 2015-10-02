package com.practice.factoryModule;

import java.util.HashMap;
import java.util.Map;

/*
* 工厂模式有三种：简单工厂模式，工厂方法和抽象工厂模式*/

public class FactoryModulePractice {
    public interface Service{

    }

    public interface Provider{
        Service
        newService();
    }

    public class Services{
        private Services(){};
    }

    private static final Map<String,Provider> providers = new HashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaltProvider (Provider p){
        registerProvider(DEFAULT_PROVIDER_NAME,p);
    }

    public static void registerProvider(String name, Provider p){
        providers.put(name, p);
    }

    public static Service newInstance(){
       return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name){
        Provider p = providers.get(name);
        if (p == null){
            throw new IllegalArgumentException("No provider register with name: "+name);
        }
        return p.newService();
    }

    public static void main(String[] args){
        FactoryModulePractice.newInstance();

    }





}
