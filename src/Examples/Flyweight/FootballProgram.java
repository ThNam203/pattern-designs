package Examples.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class FootballProgram {
    public static List<Player> players = new ArrayList<>();

    public static void main(String[] args) {
        // create teams
        Team team1 = PlayerFactory.getTeam("Manchester United", "MU Logo", "Red");
        Team team2 = PlayerFactory.getTeam("Chelsea", "Chelsea Logo", "Blue");
        Team team3 = PlayerFactory.getTeam("Liverpool", "Liverpool Logo", "Red");

        // create players
        Player player1 = new Player("Marcus Rashford", 10, "Forward", team1);
        Player player2 = new Player("Bruno Fernandes", 8, "Midfielder", team1);

        Player player3 = new Player("Mason Mount", 19, "Midfielder", team2);
        Player player4 = new Player("Reece James", 24, "Defender", team2);

        Player player5 = new Player("Mohamed Salah", 11, "Forward", team3);

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);

        players.forEach(Player::showInfo);
    }
}
