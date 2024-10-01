package Examples.Bridge;

public class IrrigationSystemTest {
    public static void main(String[] args) {
        // Create various irrigation systems
        IrrigationSystem dripIrrigation = new DripIrrigation();
        IrrigationSystem sprinklerIrrigation = new SprinklerIrrigation();
        IrrigationSystem manualIrrigation = new ManualIrrigation();
        
        // Create control systems
        ControlSystem manualControl = new ManualControl();
        ControlSystem automaticControl = new AutomaticControl();
        
        // Test different combinations
        IrrigationController dripManualControl = new IrrigationController(dripIrrigation, manualControl);
        dripManualControl.executeWatering();
        
        IrrigationController sprinklerAutoControl = new IrrigationController(sprinklerIrrigation, automaticControl);
        sprinklerAutoControl.executeWatering();
        
        IrrigationController manualAutoControl = new IrrigationController(manualIrrigation, automaticControl);
        manualAutoControl.executeWatering();
    }
}