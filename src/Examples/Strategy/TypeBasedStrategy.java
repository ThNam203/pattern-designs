package Examples.Strategy;

import java.util.List;
import java.util.stream.Collectors;

public class TypeBasedStrategy implements RecommendationStrategy {

    @Override
    public List<Event> recommend(User user, List<Event> events) {
        return events.stream()
                     .filter(event -> user.getPreferredTypes().contains(event.getType()))
                     .collect(Collectors.toList());
    }
}
