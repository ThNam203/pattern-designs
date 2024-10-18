package Command;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private List<Command> commandHistory = new ArrayList<>();
    
    // Execute a command (experiment) on the guinea pig
    public void performExperiment(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    // Undo the last performed experiment
    public void undoLastExperiment() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.remove(commandHistory.size() - 1);
            command.undo();
        }
    }
}
