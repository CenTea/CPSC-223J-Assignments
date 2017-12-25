//Takes in the taxable income through Scanner object.
//Based on income, the main 3 values of min, flatrate, and rate will be modified
//min is the minimum value used to calculate the excess.
//flatrate is used as a static addition to the cost.
//rate is the percent tax based on the income.

import java.util.Scanner;

public class Taxes
{
	public static void main(String[] args)
	{
	double finalval=0;
    	Scanner num1 = new Scanner(System.in); 	
    	System.out.print("Enter your taxable income: "); 
    	double inc = num1.nextInt(); 

	double min = 0;
	double flatrate = 0;
	double rate = 0;

	if (inc>0 && inc <=9325)
	{
	rate = .1;
	}
	else if (inc>9325 && inc <=37950)
	{
	min = 9325;
	rate = .15;
	flatrate = 932.50;
	}
	else if (inc>37950 && inc <=91900)
	{
	min = 37950;
	rate = .25;
	flatrate = 5226.25;
	}
	else if (inc>91900 && inc <=191650)
	{
	min = 91900;
	rate = .28;
	flatrate = 18713.75;
	}
	else if (inc>191650 && inc <=416700)
	{
	min = 191650;
	rate = .33;
	flatrate = 46643.75;
	}
	else if (inc>416700 && inc <=418400)
	{
	min = 416700;
	rate = .35;
	flatrate = 120910.25;
	}
	else if (inc>418400)
	{
	min = 418400;
	rate = .396;
	flatrate = 121505.25;
	}

		finalval = flatrate+(rate*(inc-min));
		System.out.print("Your federal income tax is: "+ finalval); 
	}
}