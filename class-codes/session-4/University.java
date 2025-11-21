public class University {
    public static void main(String[] args) {
        Course algorithms = new Course("algorithms");

        /// instance access to static variable
        System.out.println(algorithms.MIN_STUDENT);
        System.out.println(algorithms.name);

        /// static access to static variable
        System.out.println(Course.MIN_STUDENT);

        /// instance access to static method
        System.out.println(algorithms.getMinStudents());

        /// static access to static method
        System.out.println(Course.getMinStudents());
    }
}
