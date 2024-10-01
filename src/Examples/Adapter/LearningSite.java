package Examples.Adapter;

public class LearningSite {
    public static void main(String[] args) {
        Course inPersonCourse = new InPersonCourse();
        System.out.println("In-Person Course:");
        inPersonCourse.start();
        System.out.println(inPersonCourse.getDetails());

        Course onlineCourse = new OnlineCourseAdapter(new OnlineCourse());
        System.out.println("\nOnline Course:");
        onlineCourse.start();
        System.out.println(onlineCourse.getDetails());

        Course selfStudyCourse = new SelfStudyCourseAdapter(new SelfStudyCourse());
        System.out.println("\nSelf-Study Course:");
        selfStudyCourse.start();
        System.out.println(selfStudyCourse.getDetails());
    }
}
