package Command;

public class Client {
    public static void main(String[] args) {
        // Create a guinea pig
        GuineaPig guineaPig = new GuineaPig();
        
        // Create the doctor (invoker)
        Doctor doctor = new Doctor();
        
        // Create experiments (commands)
        Command shrinkCommand = new ShrinkCommand(guineaPig);
        Command invisibleCommand = new MakeInvisibleCommand(guineaPig);
        
        // Perform experiments
        doctor.performExperiment(shrinkCommand);
        doctor.performExperiment(invisibleCommand);
        
        // Undo the experiments one by one
        doctor.undoLastExperiment();  // Guinea pig becomes visible
        doctor.undoLastExperiment();  // Guinea pig restores size
    }
}
