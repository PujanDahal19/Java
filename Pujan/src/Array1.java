/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter the size of an array:");
        int sum = 0;
        int n = ob.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the numbers:");
       for(int i=0; i<n; i++){
           a[i] = ob.nextInt();
           
       }
       for(int i=0; i<n; i++){
           sum = sum + a[i];
           
       }
       System.out.println("The sum is:" + sum);
            
    }
}
