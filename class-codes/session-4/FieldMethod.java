public class FieldMethod {
    static int staticField = 10;
    int instanceField = 20;

    static void staticMethod() {
        // Can access static field in static method
        System.out.println("Static field: " + staticField);

        // Cannot access instance field in static method
        // System.out.println("Instance field: " + instanceField); // Compilation error
    }

    void instanceMethod() {
        // Can access both static and instance fields in instance method
        System.out.println("Static field: " + staticField);
        System.out.println("Instance field: " + instanceField);
    }
}
