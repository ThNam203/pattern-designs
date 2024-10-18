package Examples.Flyweight;

public class Team {
    private final String name;
    private final String logo;
    private final String clothesColor;

    public Team(String name, String logo, String clothesColor) {
        this.name = name;
        this.logo = logo;
        this.clothesColor = clothesColor;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public String getClothesColor() {
        return clothesColor;
    }
}
