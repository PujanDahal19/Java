/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.*;

public class Arth
{
	public static void main(String[] args) {
	    Scanner ob = new Scanner(System.in);
		System.out.println("Enter two number:");
		int a = ob.nextInt();
		int b = ob.nextInt();
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
	    System.out.println("Sum =" + c);
	    System.out.println("Sub =" + d);
	    System.out.println("Mul =" + e);
	    System.out.println("Div =" + f);
	}
}
