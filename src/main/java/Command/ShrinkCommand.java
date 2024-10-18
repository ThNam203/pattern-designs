package Command;

// Concrete Command to shrink the guinea pig
public class ShrinkCommand implements Command {
    private GuineaPig guineaPig;

    public ShrinkCommand(GuineaPig guineaPig) {
        this.guineaPig = guineaPig;
    }

    @Override
    public void execute() {
        guineaPig.shrink();
    }

    @Override
    public void undo() {
        guineaPig.restoreSize();
    }
}
