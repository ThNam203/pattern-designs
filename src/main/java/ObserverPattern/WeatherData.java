package ObserverPattern;

import java.util.List;

public class WeatherData implements Subject {
    private List<WeatherObserver> observers;
    int temperature;
    int humidity;
    int pressure;

    public WeatherData() {}

    public WeatherData(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public void subscribe(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(WeatherObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    public void measurementsChanged(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifySubscribers();
    }
}
