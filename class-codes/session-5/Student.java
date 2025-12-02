public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public void variableShadowingDemo() {
    //     String name = "Scope 1";
    //     {
    //         String name = "Scope 2"; // This will cause a compile-time error due to variable shadowing
    //         System.out.println("Inner scope name: " + name);
    //     }
    // }

    public void display() {
        String name = "Local Name";
        System.out.println("Student: " + this.name + ", Age: " + this.age + ", Local Name: " + name);
    }

    public Student getThis() {
        return this;
    }
}
