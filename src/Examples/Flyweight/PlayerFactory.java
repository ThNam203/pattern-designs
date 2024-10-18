package Examples.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {
    private static final Map<String, Team> teams = new HashMap<>();

    public static Team getTeam(String name, String logo, String color) {
        if (!teams.containsKey(name)) {
            teams.put(name, new Team(name, logo, color));
        }
        return teams.get(name);
    }
}
