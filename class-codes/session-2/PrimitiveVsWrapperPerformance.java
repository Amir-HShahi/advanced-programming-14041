public class PrimitiveVsWrapperPerformance {

    private static final int ITERATIONS = 100_000_000;

    public static void main(String[] args) {
        System.out.println("Performance Comparison: Primitives vs Wrapper Classes");
        System.out.println("Iterations: " + ITERATIONS);
        System.out.println("=".repeat(60));

        testIntVsInteger();
    }

    private static void testIntVsInteger() {
        System.out.println("\n1. Int vs Integer (Addition Operations)");

        long startTime = System.nanoTime();
        int primitiveSum = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            primitiveSum += i;
        }
        long primitiveTime = System.nanoTime() - startTime;

        // Wrapper Integer
        startTime = System.nanoTime();
        Integer wrapperSum = 0;
        for (int i = 0; i < ITERATIONS; i++) {
            wrapperSum += i; // Auto-boxing/unboxing occurs here
        }
        long wrapperTime = System.nanoTime() - startTime;

        printResults("int", primitiveTime, "Integer", wrapperTime);
    }

    private static void printResults(String primitiveName, long primitiveTime,
            String wrapperName, long wrapperTime) {
        double primitiveMs = primitiveTime / 1_000_000.0;
        double wrapperMs = wrapperTime / 1_000_000.0;

        System.out.printf("  %-10s: %8.2f ms%n", primitiveName, primitiveMs);
        System.out.printf("  %-10s: %8.2f ms%n", wrapperName, wrapperMs);
    }
}