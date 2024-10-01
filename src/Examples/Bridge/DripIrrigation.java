package Examples.Bridge;

public class DripIrrigation implements IrrigationSystem {
    @Override
    public void waterPlants() {
        System.out.println("Watering plants with drip irrigation.");
    }
}
