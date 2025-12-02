public class TypeCastingDemo {
    public static void main(String[] args) {
        primitiveCasting();
        // objectCasting();
    }

    static void primitiveCasting() {
        System.out.println("** Primitive Type Casting **");

        int i = 100;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("Widening: int(100) -> double = " + d);

        double d2 = 123.456;
        int i2 = (int) d2;
        System.out.println("Narrowing: double(123.456) -> int = " + i2);

        int bigInt = 130;
        byte b = (byte) bigInt;
        System.out.println("Overflow: int(130) -> byte = " + b);
    }

    static void objectCasting() {
        System.out.println("** Object Type Casting **");

        Dog dog = new Dog("Buddy");
        Animal animal = dog; // upcasting
        animal.makeSound();

        Animal animal2 = new Dog("Max");
        animal2.makeSound();
        Dog dog2 = (Dog) animal2; // downcasting
        dog2.makeSound();

        if (animal2 instanceof Dog) {
            System.out.println("animal2 is a Dog");
        }
    }
}
