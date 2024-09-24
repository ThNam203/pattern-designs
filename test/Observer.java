import Observer.TV;
import Observer.WeatherData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Observer {
    String displayString(int temperature, int humidity, int pressure) {
        return "The temperature is " + temperature + ", the humidity is " + humidity + " and the pressure is " + pressure;
    }
    @Test
    public void test() {
        WeatherData weatherData = new WeatherData();
        TV tv1 = new TV();
        TV tv2 = new TV();

        weatherData.subscribe(tv1);
        weatherData.subscribe(tv2);

        Assertions.assertEquals(tv1.display(), displayString(-1, -1, -1));
        Assertions.assertEquals(tv2.display(), displayString(-1, -1, -1));

        weatherData.measurementsChanged(30, 70, 1);
        Assertions.assertEquals(tv1.display(), displayString(30, 70, 1));
        Assertions.assertEquals(tv2.display(), displayString(30, 70, 1));

        weatherData.measurementsChanged(31, 72, 2);
        Assertions.assertEquals(tv1.display(), displayString(31, 72, 2));
        Assertions.assertEquals(tv2.display(), displayString(31, 72, 2));

    }
}
