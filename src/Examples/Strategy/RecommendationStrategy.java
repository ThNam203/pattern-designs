package Examples.Strategy;

import java.util.List;

public interface RecommendationStrategy {
    List<Event> recommend(User user, List<Event> events);
}
