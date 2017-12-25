// Class that holds a factorial function in recursive format.
// recurse(val) calculates the factorial starting from "val" downwards.
	// recurse acccepts the upper threshold of a value and returns an int.
	// eg. recurse(5) would produce 5!

// combination() uses recurse(), returns a final int.
	// combination takes in a total set first and then the amount needed to be chosen second.
	// eg. combination(totalset, subset);
	//     combination(15, 5);

// permutation() uses recurse(), returns a final int.
	// permutation takes in the same parameters as the combination method but uses the values differently.
	// eg. permutation(totalset, subset);
	//     permutation(20, 10);

// run() function is used by the driver to run the functions for example.
	// run does not take any parameters and only prints hard coded values.
	// can be modified with a scanner if input is needed.

public class Factorial
{
	public int init = 1;
	int recurse(int currval)
	{
		if (currval == 1)
		{
			return 1;
		}
		else
		{
			return recurse(currval-1)*currval;
		}

	}
	
	int combination(int set, int choose)
	{
		int top = recurse(set);
		int bot = recurse(choose);
		int botsecond = recurse(set-choose);
		return ((top/botsecond)/bot);	
	}
	
	int permutation(int set, int choose)
	{
		int top = recurse(set);
		int bot = recurse(set-choose);
		return (top/bot);
	}

	void run()
	{
		System.out.println("5! = " + recurse(5));
		System.out.println("Permutation:P(n,r)\n7 permute 3 = " + permutation(7, 3));
		System.out.println("Combination:C(n,r)\n8 choose 2 = " + combination(8,2));
	}
}