// Parent Class
class SecuritySystem {
    // FINAL METHOD: Implements core logic that MUST NOT be modified by child classes
    public final void authenticateUser() {
        System.out.println("Executing core security protocol...");
    }

    // REGULAR METHOD: Can be overridden by child classes if needed
    public void displayLogs() {
        System.out.println("Displaying standard security logs...");
    }
}

// Child Class extending Parent Class
class CustomSecurity extends SecuritySystem {

    // ❌ COMPILE ERROR: Uncommenting the code below will fail compilation
    // Reason: 'authenticateUser()' in SecuritySystem is final and cannot be overridden.
    /*
    @Override
    public void authenticateUser() {
        System.out.println("Custom security override attempt");
    }
    */

    // ✅ VALID: Overriding a non-final method is fully permitted
    @Override
    public void displayLogs() {
        System.out.println("Displaying ENHANCED custom security logs...");
    }
}

// Main Driver Class
public class FinalMethod {
    public static void main(String[] args) {
        // Create an instance of the child class
        CustomSecurity security = new CustomSecurity();

        System.out.println("--- Calling Final Method ---");
        // Inherited directly from SecuritySystem without modification
        security.authenticateUser();

        System.out.println("\n--- Calling Overridden Method ---");
        // Calls CustomSecurity's updated implementation
        security.displayLogs();
    }
}