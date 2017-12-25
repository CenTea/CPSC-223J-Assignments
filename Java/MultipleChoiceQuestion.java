//Create a MultipleChoiceQuestion class that inherits from the Question class. 
//This class should additionally contain an array of Strings that represent possible answers to the question.
//Override the askQuestion method so that it returns the question String and all the options


public class MultipleChoiceQuestion extends Question
{
	private String[] possibleAnswers;

	public MultipleChoiceQuestion(String question, String answer, String[] possibleAnswers){
		super(question,answer);
		this.setPossibleAnswers(possibleAnswers);
	}

	public void setPossibleAnswers(String[] pA)
	{
		int i=0;
		possibleAnswers = new String[pA.length];
		for (String y : pA)
		{
			possibleAnswers[i++] = y;
		}
	}
	public String[] getPossibleAnswers()
	{
		return this.possibleAnswers;
	}
	public String getPossibleAnswers(String value)
	{
		if (Integer.parseInt(value)-1>=this.possibleAnswers.length || Integer.parseInt(value)-1<=0)
		{
			System.out.println("Please enter a Viable answer!");
			return "ERROR";
		}
		else
			return this.possibleAnswers[Integer.parseInt(value)-1];
	}
	@Override
	public boolean check(String userAnswer)
	{
		return this.getAnswer().equals(this.getPossibleAnswers(userAnswer));
	}
	@Override
	public String askQuestion()
	{
	String temp = super.clone().askQuestion();
	for (String x : this.possibleAnswers)
	{
		temp+= "\n " + x;
	}
	return temp;
	}

	@Override
	public MultipleChoiceQuestion clone()
	{
		return new MultipleChoiceQuestion(this.askQuestion(), this.getAnswer(), possibleAnswers.clone());
	}

	@Override
	public String toString()
	{
		return this.askQuestion();
	}
}