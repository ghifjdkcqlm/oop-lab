public class AutoboxingUnboxingExample {
    public static void main(String[] args) {
        // Autoboxing: converting primitive types to their corresponding wrapper classes
        Integer intObj = 10;               // int to Integer
        Double doubleObj = 20.5;           // double to Double
        Character charObj = 'A';            // char to Character
        Boolean boolObj = true;             // boolean to Boolean
        Float floatObj = 15.5f;             // float to Float
        Long longObj = 100000L;             // long to Long
        Short shortObj = 5;                  // short to Short
        Byte byteObj = 127;                  // byte to Byte

        // Display the autoboxed values
        System.out.println("Autoboxed values:");
        System.out.println("Integer: " + intObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Character: " + charObj);
        System.out.println("Boolean: " + boolObj);
        System.out.println("Float: " + floatObj);
        System.out.println("Long: " + longObj);
        System.out.println("Short: " + shortObj);
        System.out.println("Byte: " + byteObj);

        // Unboxing: converting wrapper classes back to their corresponding primitive types
        int intValue = intObj;               // Integer to int
        double doubleValue = doubleObj;      // Double to double
        char charValue = charObj;            // Character to char
        boolean boolValue = boolObj;         // Boolean to boolean
        float floatValue = floatObj;         // Float to float
        long longValue = longObj;            // Long to long
        short shortValue = shortObj;         // Short to short
        byte byteValue = byteObj;            // Byte to byte

        // Display the unboxed values
        System.out.println("\nUnboxed values:");
        System.out.println("int: " + intValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + boolValue);
        System.out.println("float: " + floatValue);
        System.out.println("long: " + longValue);
        System.out.println("short: " + shortValue);
        System.out.println("byte: " + byteValue);
    }
}
