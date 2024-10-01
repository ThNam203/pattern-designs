package Examples.Bridge;

public class ManualControl implements ControlSystem {
    @Override
    public void control(IrrigationSystem irrigationSystem) {
        System.out.println("Controlling the irrigation system manually.");
        irrigationSystem.waterPlants();
    }
}
