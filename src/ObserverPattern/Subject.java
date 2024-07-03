package ObserverPattern;

public interface Subject {
    void subscribe(WeatherObserver observer);
    void unsubscribe(WeatherObserver observer);
    void notifySubscribers();
}
