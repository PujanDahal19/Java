import java.util.*;
public class Array5 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of the matrix: ");
        int a = ob.nextInt();
        int b = ob.nextInt();
        int num[][] = new int[a][b];
        System.out.println("Enter numbers in matrix:");
        for(int i = 0; i < a; i ++){
            for(int j = 0; j < b; j++){
                num[i][j] = ob.nextInt();
            }
        }
        if(a==b){
            System.out.println("Diagonal Elements are:");
            for(int i=0;i< a;i++){
                for(int j=0;j< b;j++){
                    if(i==j)
                        System.out.println(num[i][j]);
                  
                }
            }
        }
        else
        {
            System.out.println("Matrix is not a Square Matrix.");
        }
    }
    
    
}
