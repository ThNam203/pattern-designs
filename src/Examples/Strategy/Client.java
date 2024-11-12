package Examples.Strategy;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Event> events = Arrays.asList(
                new Event("Music", "Hanoi", LocalDateTime.now().plusDays(1)),
                new Event("Art", "Hanoi", LocalDateTime.now().plusDays(2)),
                new Event("Film", "HCMC", LocalDateTime.now().plusDays(3)),
                new Event("Music", "HCMC", LocalDateTime.now().plusWeeks(2))
        );

        User user = new User("Hanoi", Arrays.asList("Music", "Art"), 7);

        // Context
        EventRecommendation recommendation = new EventRecommendation();

        // LocationBasedStrategy
        System.out.println("Location-Based Recommendations:");
        recommendation.setStrategy(new LocationBasedStrategy());
        recommendation.recommendEvents(user, events).forEach(event ->
                System.out.println("Event: " + event.getType() + " at " + event.getLocation())
        );

        // TypeBasedStrategy
        System.out.println("\nType-Based Recommendations:");
        recommendation.setStrategy(new TypeBasedStrategy());
        recommendation.recommendEvents(user, events).forEach(event ->
                System.out.println("Event: " + event.getType() + " at " + event.getLocation())
        );

        // TimeBasedStrategy
        System.out.println("\nTime-Based Recommendations:");
        recommendation.setStrategy(new TimeBasedStrategy());
        recommendation.recommendEvents(user, events).forEach(event ->
                System.out.println("Event: " + event.getType() + " at " + event.getLocation())
        );
    }
}
