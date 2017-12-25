//Program that takes 2 user inputs assuming that each value is either Value A or Value B of the Pythagorean Theorem.
//After it takes in the inputs, it will find the final Hypotenuse value through the Math.Sqrt function.

import java.util.Scanner;

public class Triangle
{
	public static void main(String[] args)
	{
	double finalval=0;
    	Scanner num1 = new Scanner(System.in); 	
    	System.out.println("Enter 2 numbers: "); 
	System.out.print("Value A: "); 	
    	double a = num1.nextInt(); 
	System.out.print("Value B: "); 			
    	double b = num1.nextInt();
	
	finalval = Math.sqrt(a*a + b*b);
	System.out.print("The Value of C(Hypotenuse) is: "+ finalval); 
	
	}
}