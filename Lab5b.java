import java.util.*;
public class Lab5b {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int array[] = {1,2,3,4,5};
        System.out.println("Enter the index of an array: ");
        int index = ob.nextInt();
        try{
            System.out.println("Value at index is" + array[index]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
    }
}
