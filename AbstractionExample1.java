abstract class Animal{
    abstract void sound();
    void sleep(){
        System.out.println("Zzz");
    }
}
public class AbstractionExample1  extends Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
    public static void main(String args[]){
        AbstractionExample1 obj = new AbstractionExample1();
        obj.sound();
        obj.sleep();
    }
    
}
