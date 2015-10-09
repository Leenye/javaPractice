package com.practice.observerPattern;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherDate;

    public CurrentConditionDisplay(Subject weatherDate) {
        super();
        this.weatherDate = weatherDate;
        this.weatherDate.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Current comditions : " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
