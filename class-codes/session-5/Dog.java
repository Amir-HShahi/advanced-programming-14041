public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks!");
    }

    public void fetch() {
        System.out.println(name + " fetches the ball!");
    }
}
