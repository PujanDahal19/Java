
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
public class Array3 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter the size of an array:");
        int n = ob.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the numbers:");
       
       for(int i=0; i<n; i++){
           num[i] = ob.nextInt();
       }
       for(int i = 0; i < n; i++){
           for(int j =i+1; j<n; j++){
               int temp = num[0];
               if (num[i] > num[j]){
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
           }
       }
       
       System.out.println("The numbers in ascending order are:");
       for(int i=0; i<n; i++){
           System.out.println(num[i]);
       }
            
    }
}
