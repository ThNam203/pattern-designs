package Examples.Builder;

public interface IDietBuilder {
    void reset();
    void buildProtein(String protein);
    void buildCarbonHydrate(String carbonHydrate);
    void buildFruitAndVegetables(String fruitAndVegetables);
    void buildDrink(String drink);
    Diet build();
}
