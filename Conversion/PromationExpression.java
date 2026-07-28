package Conversion;

public class PromationExpression {
    public static void main(String args[]){
        byte a = 127;
        byte b = 1;
        byte c = (byte)(a + b);
        System.out.println("Sum of byte a and b is "+c);
        System.out.println("Now Comming to the case where PromationExpression is not possible");
        System.out.println("Here i am doing promation of the sum of bytes where sum is 128 and range of byte is -128 to 127 and the value of sum of bytes after promation into shortis "+(short)(a + b));

    }
}
