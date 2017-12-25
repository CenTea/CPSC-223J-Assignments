import java.util.Random;
import java.util.Scanner;

public class GuessingGame{
  private int secretNum;
  private int numTries;
  private int maxTries;
  
  public GuessingGame(){
    Random generator = new Random();
    secretNum=generator.nextInt(101);
  }
  
  public GuessingGame(int max)
  {
	Random generator = new Random();
	secretNum=generator.nextInt(101);
	this.maxTries=max;
  }

  public void resetter()
	{
	Random generator = new Random();
	secretNum=generator.nextInt(101);
	numTries=0;
	System.out.println("Game Reset");
	}

  public int getNumTries(){
    return numTries;
  }
  
  public String check(int guess){
    String result = guess == secretNum ? "Got it!" : guess < secretNum ? "Higher" : "Lower";
	this.numTries++;
    return result;
  }
  
  public boolean tfcheck(int guess){
    return (guess == secretNum) ? true : false;
  }
  
  public boolean numcheck(String val){
    for (int i = 0; i<val.length(); i++)
	{
		if (!Character.isDigit(val.charAt(i)))
		return false;
	}
	return true;
  }

  public int parse(boolean input, String input2){
    if (input)
    return Integer.parseInt(input2);
    else
    return -1;
  }
	
  public void play()
  {
	  String guess = "";
	  Scanner input = new Scanner(System.in);
	  boolean exit = false;
	do
	{
	System.out.print("Enter a Guess: ");

    guess = input.next();
	
	if (guess.equals("-1") || (guess.toLowerCase()).equals("quit") || numTries == maxTries)
		{
		System.out.println("Exiting...");
		exit = true;
		}
	else if ((guess.toLowerCase()).equals("reset"))
		{
		resetter();
		}
	else
		{
		System.out.println(this.check(parse(numcheck(guess),guess)));
		System.out.println("Number of Tries: " + this.getNumTries());
		}
	}while(this.tfcheck(parse(numcheck(guess),guess))==false && exit!=true);
  }
}


