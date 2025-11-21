public class Course {
    static final int MIN_STUDENT = 10;
    String name;

    public Course(String name) {
        this.name = name;
    }

    public static int getMinStudents() {
        return MIN_STUDENT;
    }
}