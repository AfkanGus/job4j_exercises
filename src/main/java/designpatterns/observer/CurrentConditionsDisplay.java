package designpatterns.observer;

/*
Элемент реализует Observer,
чтобы получать данные от
объекта WeatherData.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Текушая температруа " + temperature + "F degrees and" + humidity + "% humiity");
    }
}
