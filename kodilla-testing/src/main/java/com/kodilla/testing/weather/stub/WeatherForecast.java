package com.kodilla.testing.weather.stub;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperature() {
        Map<String, Double> resultMap = new HashMap<>();
        double i =0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

             i = i + temperature.getValue(); // [1]
        }
        return i/temperatures.getTemperatures().size();
    }

    public double medianTemperature(){
        Map<String, Double> resultMap = new HashMap<>();
        Collection <Double> values = temperatures.getTemperatures().values();
        Double[] arrayTemperature = values.toArray(new Double[temperatures.getTemperatures().size()]);
        for (int i = 1; i<temperatures.getTemperatures().size(); i++) {
            for(int j = i; j<temperatures.getTemperatures().size(); j++) {
                if (arrayTemperature[j] < arrayTemperature[j - 1]) {
                    double temp = arrayTemperature[j];
                    arrayTemperature[j] = arrayTemperature[j - 1];
                    arrayTemperature[j - 1] = temp;

                }
            }
        }
        return arrayTemperature[temperatures.getTemperatures().size()/2];
    }
}