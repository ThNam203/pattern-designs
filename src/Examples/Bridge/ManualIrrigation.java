package Examples.Bridge;

public class ManualIrrigation implements IrrigationSystem {
    @Override
    public void waterPlants() {
        System.out.println("Watering plants manually.");
    }
}
