//Asks user for an input of an integer representing the year.
//Uses the Scanner object to take in the input.

import java.util.Scanner;

public class LYear
{
	public static void main(String[] args)
	{
    Scanner num1 = new Scanner(System.in); 	// scanner object creation.
    System.out.print("Enter a Year: "); 	// System output
    int year = num1.nextInt(); 			// Getting the number input and putting into year.
    if (year % 4 == 0) 				// If it is divisible by 4 then it is possibly a leap year.
    {
        if (year % 100 == 0) 			//If the Value is greater than 100, and dvisible by 4.
        {
            if (year % 400 == 0) 		// If within a 400 increment, It is a leap year.
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
        }
        else
		System.out.println(year + " is a leap year.");
    }
    else 					//It is not a leap year if it is not divisible by 4.
        System.out.println(year + " is not a leap year."); 
	}
}