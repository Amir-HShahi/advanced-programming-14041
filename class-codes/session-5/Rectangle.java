public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1);
        System.out.println("Default rectangle created: 1x1");
    }

    public Rectangle(double side) {
        this(side, side);
        System.out.println("Square created: " + side + "x" + side);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.println("Rectangle created: " + width + "x" + height);
    }
}
