
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.lang.*;
import java.util.*;

public class SquareRoot {
    public static void main(String[] args){
        Scanner sqr = new Scanner(System.in);
                System.out.println("Enter a number:");
                int a = sqr.nextInt();
                double b = Math.sqrt(a);
                System.out.println("The Square root is " + b);

    }
}
