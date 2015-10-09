package com.practice.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherDate implements Subject{

    private List<Observer> observers = new ArrayList<Observer>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        int index = observers.indexOf(observer);
        if (index >= 0){
            observers.remove(observer);
        }
    }

    public void notifyObserver(){
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature,
                                float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyObserver();
    }

}
