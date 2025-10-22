import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner foo = new Scanner(System.in);
        String line = foo.nextLine();
        System.out.println(line);

        String word = foo.next();
        System.out.println(word);

        int integer = foo.nextInt();
        System.out.println(integer);

        foo.close(); // always close scanner when there is no need of it
    }
}
