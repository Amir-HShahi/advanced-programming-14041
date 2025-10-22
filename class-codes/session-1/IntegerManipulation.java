public class IntegerManipulation {
    public static void main(String[] args) {
        String numString = "123";
        Integer numInt = Integer.parseInt(numString);

        int integerPrimitive = 10;
        Integer integerObjectDeprecated = new Integer(5);
        /// instead use this according to documentation
        Integer integerObject = Integer.valueOf(integerPrimitive);
        int convertObjectToPrimitive = integerObject.intValue();
    }
}
