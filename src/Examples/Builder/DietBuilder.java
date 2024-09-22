package Examples.Builder;

public class DietBuilder implements IDietBuilder {
    private Diet diet = null;

    @Override
    public void reset() {
        this.diet = new Diet();
    }

    @Override
    public void buildProtein(String protein) {
        this.diet.setProtein(protein);
    }

    @Override
    public void buildCarbonHydrate(String carbonHydrate) {
        this.diet.setCarbonHydrate(carbonHydrate);
    }

    @Override
    public void buildFruitAndVegetables(String fruitAndVegetables) {
        this.diet.setFruitAndVegetables(fruitAndVegetables);
    }

    @Override
    public void buildDrink(String drink) {
        this.diet.setDrink(drink);
    }

    @Override
    public Diet build() throws Error {
        if (this.diet.getProtein() == null && this.diet.getCarbonHydrate() == null && this.diet.getFruitAndVegetables() == null) {
            throw new Error("Diet is missing information!");
        }

        return this.diet;
    }
}
