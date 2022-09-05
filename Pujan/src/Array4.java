import java.util.*;
public class Array4 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = ob.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the numbers:");
        
        for(int i=0; i<n; i++){
           num[i] = ob.nextInt();
       }
        int sum =0;
        for(int i=0; i<n; i++){
            if(num[i] % 10 == 0 || num[i] % 10 == 1){
                sum = sum + num[i];
            }
        }   
        System.out.println("Sum is = " + sum);
    }
}
