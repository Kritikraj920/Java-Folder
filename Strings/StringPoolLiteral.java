public class StringPoolLiteral {
    public static void main(String[] args) {
        // Creates a new string literal "Hello" in the String Constant Pool inside Heap Memory
        String s1 = "Hello";
        System.out.println("String s1 created: " + s1);

        // String s2 points to the existing "Hello" object in the pool rather than creating a new one
        String s2 = "Hello";
        System.out.println("String s2 initialized with value: " + s2);

        // Explanation of JVM behavior regarding String Pool memory allocation
        System.out.println("JVM checks the String Constant Pool in the Heap Memory for existing literal value.");
        System.out.println("Since 'Hello' exists, JVM reuses the reference for s2 instead of allocating new memory.");
        
        // Demonstrating that both variables point to the exact same memory reference
        System.out.println("s1 and s2 refer to the same object: " + (s1 == s2));

        String s3 = new String("Hello");

        System.out.println("\n--- Case 2: String Created with 'new' Keyword ---");
        System.out.println("Using 'new' forces creation of a new Object directly in Heap Memory.");
        System.out.println("s1 == s3 : " + (s1 == s3)); // false (Different memory locations)
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); // true (Same content value)
    }
}