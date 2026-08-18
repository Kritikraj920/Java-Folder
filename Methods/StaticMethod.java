public class StaticMethod {

    // Instance Variable (belongs to an object)
    int instanceCounter = 0;

    // Static Variable (shared across all instances)
    static int staticCounter = 0;

    // 1. Static Method
    public static void printMessage() {
        System.out.println("Static method called!");
        
        // System.out.println(instanceCounter); // COMPILE ERROR: Cannot access non-static variables directly
        // Static methods execute without an object context. At this point, no instance 
        // exists in Heap memory, so Java has no object reference from which to read 'instanceCounter'.

        // ✅ REASON THIS WORKS:
        // 'staticCounter' exists globally at the class level, so the static method can access it directly.
        System.out.println("Static variable value: " + staticCounter); // OK
    }

    // 2. Instance Method
    public void incrementCounters() {
        instanceCounter++; // OK: Instance methods can access instance variables
        staticCounter++;   // OK: Instance methods can also access static variables
    }

    public static void main(String[] args) {
        // CALLING A STATIC METHOD:
        // No need to create an object using 'new'! Call directly using the Class Name.
        StaticMethod.printMessage();

        // Standard Utility Example:
        // Math.max(10, 20) is a built-in static method from Java's Math class
        int max = Math.max(10, 20);
        System.out.println("Max value: " + max);
    }
}