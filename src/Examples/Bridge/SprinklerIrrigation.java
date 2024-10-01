package Examples.Bridge;

public class SprinklerIrrigation implements IrrigationSystem {
    @Override
    public void waterPlants() {
        System.out.println("Watering plants with sprinkler irrigation.");
    }
}
