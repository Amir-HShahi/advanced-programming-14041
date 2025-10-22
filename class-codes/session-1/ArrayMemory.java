public class ArrayMemory {
    Student[] students = new Student[10];

    void init() {
        for (Student student : students) {
            student = new Student();
        }
    }

    public static void main(String[] args) {
        ArrayMemory foo = new ArrayMemory();
        foo.init();
        // consider memory allocation
    }
}
