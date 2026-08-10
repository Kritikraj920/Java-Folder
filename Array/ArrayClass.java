public class ArrayClass {
public  static void main(String args[]){
    int []array = new int[5];
    int array2[]={1,2,3,4,5,6,7};
    System.out.println("Array Length is "+array.length);
    for(int i = 1; i < array.length ; i++){
        array[i]=i*2;
        System.out.println("Valuse of Array 1 at index "+i+" is "+array[i]);
    }
    for(int i = 0; i < array2.length ; i++){
        System.out.println("Valuse of Array 1 at index "+i+" is "+array2[i]);
    }
}    
}
