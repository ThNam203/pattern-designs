package Examples.Strategy;

import java.util.List;
import java.util.stream.Collectors;

public class LocationBasedStrategy implements RecommendationStrategy {

    @Override
    public List<Event> recommend(User user, List<Event> events) {
        return events.stream()
                     .filter(event -> event.getLocation().equals(user.getLocation()))
                     .collect(Collectors.toList());
    }
}
