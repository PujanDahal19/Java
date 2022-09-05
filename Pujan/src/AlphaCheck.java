/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;
public class AlphaCheck {
    public static void main(String[] args){
        Scanner check = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char ch = check.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("It is vowel");
        }else{
            System.out.println("It is consonant");
        }
    
            
    }
}
