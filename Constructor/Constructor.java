public class Constructor{
    int a;
    public Constructor(){
        System.out.println("Constructor is called");
        a =10;
        System.out.println("Value of a: " + a);
    }
    public static void main(String[] args){
        Constructor obj = new Constructor();
    }
}