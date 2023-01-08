import java.util.*;
public class Lab5a {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = ob.nextInt();
        int b = ob.nextInt();
        try{
            int c = a/b;
            System.out.println("The result is " + c);
        }catch(ArithmeticException ex){
            System.out.println("Divide by 0");
        }
        System.out.println("Yo!!");
    }
}
