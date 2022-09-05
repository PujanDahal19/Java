
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter the size of an array:");
        int n = ob.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the numbers:");
       for(int i=0; i<n; i++){
           a[i] = ob.nextInt();
           
       }
       int large = a[0];
       for(int i=0; i<n; i++){ 
           if(a[i]>large){
               large = a[i];
           }
           
       }
       System.out.println("The largest number is:" + large);
            
    }
}
