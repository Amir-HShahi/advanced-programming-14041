public class StringManipulation {
    public static void main(String[] args) {
        // consider how they are saved in string pool and memory
        // checkout string immutably
        String firstNew = new String("same!");
        String secondNew = new String("same!");
        System.out.println(firstNew == secondNew);
        System.out.println(firstNew.equals(secondNew));
        System.out.println(firstNew.intern() == secondNew.intern());

        String firstSugar = "same!";
        String secondSugar = "same!";
        System.out.println(firstSugar == secondSugar);

        String sample = "hold the door!";
        System.out.println(sample.length());
        System.out.println(sample.charAt(1));
        byte[] sampleInBytes = sample.getBytes(); /// used for encrypting

        String trim = "   This string intentionally has whitespace        ";
        System.out.println(trim.trim());

        String blank = "            "; // contains whitespace but length is zero
        System.out.println(blank.isBlank());
        System.out.println(blank.isEmpty());
    }
}
