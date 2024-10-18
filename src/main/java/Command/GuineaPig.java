package Command;

// The receiver class that performs actions.
public class GuineaPig {
    private boolean invisible = false;
    private int size = 100;
    
    public void shrink() {
        size -= 20;
        System.out.println("Guinea pig shrunk to size: " + size + "%");
    }

    public void restoreSize() {
        size += 20;
        System.out.println("Guinea pig restored to size: " + size + "%");
    }

    public void makeInvisible() {
        invisible = true;
        System.out.println("Guinea pig is now invisible!");
    }

    public void makeVisible() {
        invisible = false;
        System.out.println("Guinea pig is now visible!");
    }
}
