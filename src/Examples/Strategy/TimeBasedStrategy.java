package Examples.Strategy;

import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDateTime;

public class TimeBasedStrategy implements RecommendationStrategy {
    @Override
    public List<Event> recommend(User user, List<Event> events) {
        LocalDateTime now = LocalDateTime.now();
        return events.stream()
                     .filter(event -> event.getDateTime().isAfter(now) && event.getDateTime().isBefore(now.plusDays(user.getTimeRangeDays())))
                     .collect(Collectors.toList());
    }
}
