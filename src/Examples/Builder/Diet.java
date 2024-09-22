package Examples.Builder;

public class Diet {
    private String protein;
    private String carbonHydrate;
    private String fruitAndVegetables;
    private String drink;

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getCarbonHydrate() {
        return carbonHydrate;
    }

    public void setCarbonHydrate(String carbonHydrate) {
        this.carbonHydrate = carbonHydrate;
    }

    public String getFruitAndVegetables() {
        return fruitAndVegetables;
    }

    public void setFruitAndVegetables(String fruitAndVegetables) {
        this.fruitAndVegetables = fruitAndVegetables;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getDietDetail() {
        return "This diet includes:\nProtein: " + this.protein +
                "\nCarbon Hydrate: " + this.carbonHydrate +
                "\nFruit And Vegetables: " + this.fruitAndVegetables +
                "\nDrink: " + this.drink;
    }
}
