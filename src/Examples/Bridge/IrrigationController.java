package Examples.Bridge;

class IrrigationController {
    private IrrigationSystem irrigationSystem;
    private ControlSystem controlSystem;
    
    public IrrigationController(IrrigationSystem irrigationSystem, ControlSystem controlSystem) {
        this.irrigationSystem = irrigationSystem;
        this.controlSystem = controlSystem;
    }
    
    public void executeWatering() {
        controlSystem.control(irrigationSystem);
    }
}