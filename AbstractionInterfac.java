interface AbstractionInterface {
    void showMessage();
}
class Abstraction implements AbstractionInterface{
 public void showMessage(){
        System.out.println("Hello from AbstractionInterface");
    }
}
public class AbstractionInterfac  {
    public void showMessage(){
        System.out.println("Hello from Kritik raj");
    }
    public static void main(String args[]){
        AbstractionInterfac obj2 = new AbstractionInterfac();
        obj2.showMessage();
        Abstraction obj = new Abstraction();
        obj.showMessage();
    }
}
