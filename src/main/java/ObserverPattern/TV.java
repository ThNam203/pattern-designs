package ObserverPattern;

public class TV implements DisplayElement, WeatherObserver {
    int temperature;
    int humidity;
    int pressure;

    public TV() {
        this.temperature = -1;
        this.humidity = -1;
        this.pressure = -1;
    }

    void updateInformation(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public String display() {
        return "The temperature is " + this.temperature + ", the humidity is " + this.humidity + " and the pressure is " + this.pressure;
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        updateInformation(temperature, humidity, pressure);
    }
}
