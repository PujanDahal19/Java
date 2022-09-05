/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;
public class OddEven {
    public static void main(String[] args){
        Scanner check = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = check.nextInt();
        if(a % 2 == 0){
            System.out.println("It is an even number.");
        }else{
            System.out.println("It is an odd number");
        }
    }
}
