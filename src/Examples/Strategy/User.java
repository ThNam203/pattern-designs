package Examples.Strategy;

import java.util.List;

public class User {
    private String location;
    private List<String> preferredTypes;
    private int timeRangeDays;

    public User(String location, List<String> preferredTypes, int timeRangeDays) {
        this.location = location;
        this.preferredTypes = preferredTypes;
        this.timeRangeDays = timeRangeDays;
    }

    public String getLocation() {
        return location;
    }

    public List<String> getPreferredTypes() {
        return preferredTypes;
    }

    public int getTimeRangeDays() {
        return timeRangeDays;
    }
}
