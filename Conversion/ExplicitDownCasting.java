package Conversion;

public class ExplicitDownCasting {
public static void main(String args[]){
    int integervalue= 10;
    byte bytevalue = (byte)integervalue;
    System.out.println("Value of int integervalue is "+integervalue+" and after explicit downcasting to byte bytevalue is "+bytevalue); 
    System.out.println("Now Comming to the case where ExplictDownCasting is not possible");
    int integervalue1= 128;
    System.out.println("Here range of byte is -128 to 127 and the value of int integervalue1 is "+integervalue1+" and after explicit downcasting to byte bytevalue1 is "+(byte)integervalue1);
}    
}
