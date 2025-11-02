public class CharacterWrapperClass {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        char aChar = 'a';
        Character aCharacter = Character.valueOf(aChar);
        Character autoBoxedCharacter = aChar;

        boolean isDigit = Character.isDigit(aChar);
        System.out.println("isDigit(char) result: " + isDigit);


        char upperAChar = Character.toUpperCase(aChar);
        Character.toLowerCase(upperAChar);
        System.out.println("toUpperCase(char) result: " + upperAChar);
        System.out.println("Original char after toUpperCase(char): " + aChar);

    }
}
