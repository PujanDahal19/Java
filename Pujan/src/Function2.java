import java.util.*;
public class Function2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = ob.nextInt();
        int a[] = new int[n];
        System.out.println("Enter numbers:");
        
        for(int i =0; i <n; i++){
            a[i]= ob.nextInt();
        }
        System.out.println("Largest value is:"+ max(a));
    }
    static int max(int []a){
        int large = a[0];
        for(int i =0; i < a.length; i++){
            if(a[i]>large){
                large = a[i];
            }
        }
        return large;
        
    }
            
}
