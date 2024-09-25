package Examples.Prototype;

public class MusicEvent extends EntertainmentProgram {
    public MusicEvent(String name, int duration) {
        super(name, duration, "Music Event");
    }

    public MusicEvent(EntertainmentProgram prototype) {
        super(prototype);
    }

    @Override
    public EntertainmentProgram clone() {
        return new MusicEvent(this);
    }
}
