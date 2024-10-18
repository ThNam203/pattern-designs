package Examples.Flyweight;

public class Player {
    private String name;
    private int playerNumber;
    private String position;
    private Team team;

    public Player(String name, int playerNumber, String position, Team team) {
        this.name = name;
        this.playerNumber = playerNumber;
        this.position = position;
        this.team = team;
    }

    public void showInfo() {
        System.out.println("Player{" +
                "name='" + name + '\'' +
                ", player number=" + playerNumber +
                ", position='" + position + '\'' +
                ", team=" + "Team{" +
                "name='" + team.getName() + '\'' +
                ", logo='" + team.getLogo() + '\'' +
                ", clothesColor='" + team.getClothesColor() + '\'' +
                '}' +
                '}');
    }
}
