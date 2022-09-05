import java.util.*;
public class Function {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = ob.nextInt();
        print(n);
    }
    static void print(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
