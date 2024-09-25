package Examples.Prototype;

public class Movie extends EntertainmentProgram {
    public Movie(String name, int duration) {
        super(name, duration, "Movie");
    }

    public Movie(EntertainmentProgram prototype) {
        super(prototype);
    }

    @Override
    public EntertainmentProgram clone() {
        return new Movie(this);
    }
}
