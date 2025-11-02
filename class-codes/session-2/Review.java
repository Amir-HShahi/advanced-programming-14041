import java.util.Scanner;

public class Review {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int primitive = 1;
        Integer wrapperClass = 12;

        String numString = "123";
        int parsedInt = Integer.parseInt(numString);
        Integer parsedWrapperClass = Integer.valueOf(parsedInt);
        
        Integer newInteger = new Integer(1234);
        // new Integer(1) is deprecated, use valueOf(1) method
        Integer solution =  Integer.valueOf(1234);

        // or use java auto boxing 
        Integer autoBoxing = 1234;

        // if you want to convert WrapperClass to primitive
        int convertToPrimitive = solution.intValue();

        // you can use auto unboxing as well
        int autoUnboxing = autoBoxing;

        String sample = "Hello World!";
        int lengthOfSample = sample.length();
        char lastChar = sample.charAt(lengthOfSample - 1);

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();
    }
}
