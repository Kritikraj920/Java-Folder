import java.util.ArrayList;

public class WrapperClassDemo {
    public static void main(String[] args) {

        // 1. Primitive vs. Wrapper Class Declaration
        int primitiveInt = 25;
        Integer wrapperInt = 25; // Autoboxing (Primitive -> Object)

        System.out.println("--- 1. Autoboxing & Unboxing ---");
        System.out.println("Wrapper Integer: " + wrapperInt);

        // Explicit conversion (Legacy way, unneccessary since Java 5)
        // Integer explicitWrapper = Integer.valueOf(50);

        int unboxedInt = wrapperInt; // Auto-unboxing (Object -> Primitive)
        System.out.println("Unboxed Primitive: " + unboxedInt);


        // 2. Useful Utility Methods provided by Wrapper Classes
        System.out.println("\n--- 2. Parsing & Conversion Methods ---");
        
        // String to Primitive / Wrapper
        String numStr = "123";
        int parsedInt = Integer.parseInt(numStr);
        System.out.println("Parsed String '123' to int: " + (parsedInt + 10)); // 133

        // Binary, Hex, and Octal Representation
        System.out.println("25 in Binary: " + Integer.toBinaryString(25));
        System.out.println("25 in Hexadecimal: " + Integer.toHexString(25));

        // Finding Range Limits
        System.out.println("Integer Max Value: " + Integer.MAX_VALUE);
        System.out.println("Integer Min Value: " + Integer.MIN_VALUE);


        // 3. Collections (Generics ONLY support Wrapper Classes, not Primitives)
        System.out.println("\n--- 3. Usage with Collections ---");
        
        // ArrayList<int> list = new ArrayList<>(); // Compile error!
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10); // Autoboxed from int to Integer
        numberList.add(20);
        
        System.out.println("ArrayList of Integers: " + numberList);


        // 4. Important Gotcha: Integer Caching (-128 to 127)
        System.out.println("\n--- 4. Integer Cache Traps ---");
        
        Integer a = 100;
        Integer b = 100;
        System.out.println("a == b (Values within -128 to 127): " + (a == b)); // true (cached)

        Integer c = 200;
        Integer d = 200;
        System.out.println("c == d (Values outside cache range): " + (c == d)); // false (different objects)
        System.out.println("c.equals(d) (Correct comparison): " + c.equals(d)); // true
    }
}