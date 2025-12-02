public class Person {
    private String name;
    private String city;
    private int age;

    public Person setName(String name) {
        this.name = name;
        return this;
    }
    
    public static void main(String[] args) {
        Person foo = new Person();
        foo.setName("amir").setName("ali");
        System.out.println(foo.name);
    }
}