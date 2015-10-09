package com.practice.observerPattern;

public class Client {

    public static void main(String[] args){
        WeatherDate subject = new WeatherDate();
        CurrentConditionDisplay ccd = new CurrentConditionDisplay(subject);
        subject.setMeasurements(19, 40, 20);
    }
}
