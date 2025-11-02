import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
        int length = line.length();
        for (int i = 0; i < length; i++) {
            char charAt = line.charAt(i);
            if (Character.isDigit(charAt)) {
                System.out.println("Found digit: " + charAt);
            }
        }

        System.out.println("For-each:");
        for (char charAt : line.toCharArray()) {
            if (Character.isDigit(charAt)) {
                System.out.println("Found digit: " + charAt);
            }
        }
    }
}
