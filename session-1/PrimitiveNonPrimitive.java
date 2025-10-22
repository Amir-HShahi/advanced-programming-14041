public class PrimitiveNonPrimitive {

    public static void main(String[] args) {
        Student student = new Student();
        student.age = 20;
        modifyObject(student);
        System.out.println(student.age);

        int num = 20;
        modifyPrimitive(num);
        System.out.println(num);
    }

    static void modifyObject(Student student) {
        student.age = 10;
    }

    static void modifyPrimitive(int num) {
        num = 10;
    }
}