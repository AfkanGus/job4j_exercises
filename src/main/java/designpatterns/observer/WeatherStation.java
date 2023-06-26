package designpatterns.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay curentDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 34, 12);
        weatherData.setMeasurements(83, 32, 12);
        weatherData.setMeasurements(81, 33, 13);
    }
}
