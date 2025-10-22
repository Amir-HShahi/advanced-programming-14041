public class ArrayMemory {
    Student[] students = new Student[10];

    void init() {
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }
    }

    public static void main(String[] args) {
        ArrayMemory foo = new ArrayMemory();
        foo.init();
        // consider memory allocation
    }
}
