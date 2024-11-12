package Examples.Strategy;

import java.util.List;

public class EventRecommendation {
    private RecommendationStrategy strategy;

    public void setStrategy(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Event> recommendEvents(User user, List<Event> events) {
        return strategy.recommend(user, events);
    }
}
