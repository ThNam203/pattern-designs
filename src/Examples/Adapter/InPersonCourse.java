package Examples.Adapter;

public class InPersonCourse implements Course {
    public void attendClass() {
        System.out.println("Attending in-person class.");
    }

    public String getSchedule() {
        return "In-person course schedule.";
    }

    @Override
    public void start() {
        attendClass();
    }

    @Override
    public String getDetails() {
        return getSchedule();
    }
}