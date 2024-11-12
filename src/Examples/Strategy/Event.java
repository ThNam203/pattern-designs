package Examples.Strategy;

import java.time.LocalDateTime;

public class Event {
    private String type;
    private String location;
    private LocalDateTime dateTime;

    public Event(String type, String location, LocalDateTime dateTime) {
        this.type = type;
        this.location = location;
        this.dateTime = dateTime;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
