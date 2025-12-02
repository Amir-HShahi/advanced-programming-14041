public class Calculator {
    private int value;

    public Calculator add(int n) {
        this.value += n;
        return this;
    }

    public Calculator multiply(int n) {
        this.value *= n;
        return this;
    }

    public Calculator subtract(int n) {
        this.value -= n;
        return this;
    }

    public Calculator getResult() {
        System.out.println("Calculator result: " + this.value);
        return this;
    }

    public static void main(String[] args) {
        Calculator foo = new Calculator()
            .add(3)
            .subtract(5);

        
    }
}
