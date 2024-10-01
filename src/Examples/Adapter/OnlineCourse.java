package Examples.Adapter;

public class OnlineCourse {
    public void joinSession() {
        System.out.println("Joining an online session.");
    }

    public String viewTimetable() {
        return "Online course timetable.";
    }
}
