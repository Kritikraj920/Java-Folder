class Java8Feature{
    public interface smartDevice{
        void turnOn();

        default void printDiagnostics(){
            System.out.println("Diagnostics: Running default diagnostics.");
        }
        static boolean isSupportedBrand(String brand){
            return brand.equalsIgnoreCase("samsung") || brand.equalsIgnoreCase("nokia");

        }
    }  
    public static class samsungPhone implements smartDevice{
        @Override
        public void turnOn() {
            System.out.println("Samsung phone is turning on.");
        }
    }  
    public static void main(String[] args) {
        smartDevice device = new samsungPhone();
        device.turnOn();
        // device.printDiagnostics();

        // String brand = "Samsung";
        // if (smartDevice.isSupportedBrand(brand)) {
        //     System.out.println(brand + " is a supported brand.");
        // } else {
        //     System.out.println(brand + " is not a supported brand.");
        // }
    }
}