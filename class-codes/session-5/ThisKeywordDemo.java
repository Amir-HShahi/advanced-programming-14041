public class ThisKeywordDemo {
    public static void main(String[] args) {
        System.out.println("\n--- PART 1: 'this' Keyword Examples ---\n");

        // Example 1: Basic usage
        Student s1 = new Student("Alice", 20);
        s1.display();

        // Example 2: Constructor chaining
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5.0);
        Rectangle r3 = new Rectangle(4.0, 6.0);

        // Example 3: Method chaining
        Calculator calc = new Calculator()
            .add(10)
            .multiply(2)
            .subtract(5)
            .getResult();
    }
}
