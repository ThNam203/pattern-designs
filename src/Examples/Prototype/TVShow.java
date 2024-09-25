package Examples.Prototype;

public class TVShow extends EntertainmentProgram {
    public TVShow(String name, int duration) {
        super(name, duration, "TV Show");
    }

    public TVShow(EntertainmentProgram prototype) {
        super(prototype);
    }

    @Override
    public EntertainmentProgram clone() {
        return new TVShow(this);
    }
}
