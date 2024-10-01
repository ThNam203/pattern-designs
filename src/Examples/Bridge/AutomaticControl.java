package Examples.Bridge;

class AutomaticControl implements ControlSystem {
    @Override
    public void control(IrrigationSystem irrigationSystem) {
        System.out.println("Controlling the irrigation system automatically.");
        irrigationSystem.waterPlants();
    }
}