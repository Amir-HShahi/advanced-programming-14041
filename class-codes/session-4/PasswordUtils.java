public class PasswordUtils {

    // prevent instantiation
    private PasswordUtils() {
    }

    // Check if password contains at least one uppercase letter
    public static boolean hasUppercase(String password) {
        
        if (password == null)
            return false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c))
                return true;
        }
        return false;
    }

    // Check if password contains at least one digit
    public static boolean hasDigit(String password) {
        if (password == null)
            return false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c))
                return true;
        }
        return false;
    }

    // Check if password length >= 8
    public static boolean hasValidLength(String password) {
        return password != null && password.length() >= 8;
    }

    // Check if password is strong (uses methods above)
    public static boolean isStrong(String password) {
        return hasUppercase(password)
                && hasDigit(password)
                && hasValidLength(password);
    }

    public static void main(String[] args) {
        System.out.println(PasswordUtils.isStrong("Ancd12344"));
    }
}