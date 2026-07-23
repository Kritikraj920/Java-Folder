package Encapulation;
class Students{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    } 
    public void setAge(int age){
        this.age = age;
    }
}
public class JavaEncapsulation {
    public static void main(String args[]){
        Students obj = new Students();
        obj.setName("Kritik Raj");
        obj.setAge(20);
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
