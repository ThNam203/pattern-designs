package Command;

// Concrete Command to make the guinea pig invisible
public class MakeInvisibleCommand implements Command {
    private GuineaPig guineaPig;

    public MakeInvisibleCommand(GuineaPig guineaPig) {
        this.guineaPig = guineaPig;
    }

    @Override
    public void execute() {
        guineaPig.makeInvisible();
    }

    @Override
    public void undo() {
        guineaPig.makeVisible();
    }
}
