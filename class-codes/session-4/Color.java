public class Color {
    private String hexCode;

    public Color(String hexCode) {
        this.hexCode = hexCode;
    }

    public static Color red() {
        return new Color("#FF0000");
    }

    public static Color green() {
        return new Color("#00FF00");
    }

    public static Color blue() {
        return new Color("#0000FF");
    }

    public static Color white() {
        return new Color("#FFFFFF");
    }

    public static void main(String[] args) {
        Color white = Color.white();
        Color someColor = new Color("#FF111111");
        Color red = Color.red();
    }
}
