//Create a Quiz class that contains an array that should be able to hold either Question or MultipleChoiceQuestion objects.
//Create a constructor for the Quiz class that receives the total number of questions in the quiz.
//Create an addQuestion method that should be able to receive either a Question or MultipleChoiceQuestion object and it will add it to the array of questions in the quiz.
//Override the toString method in both Question and MultipleChoiceQuestion so that it will return a String containing the question text (and possible answers in the case of MultipleChoiceQuestion).
//Override the toString method in Quiz so that it returns a String containing the text from all questions in the quiz.

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Quiz
{
	private Question[] qArray;
	private int qAmt = 0;
	private String qName;

	public Quiz(MultipleChoiceQuestion first)
	{
		this.qArray = new Question[1];
		this.qArray[this.qAmt++] = first.clone();
	}

	public Quiz(Question first)
	{
		this.qArray = new Question[1];
		this.qArray[this.qAmt++] = first.clone();
	}
	
	public Quiz(MultipleChoiceQuestion first, String filename)
	{
		this(first);
		qName = filename;
	}
	
	public Quiz(Question first, String filename)
	{
		this(first);
		qName = filename;
	}

	public void addQuestion(Question userQuestion)
	{
		qArray = Arrays.copyOf(qArray, ++this.qAmt);
		qArray[this.qAmt-1] = userQuestion.clone();
	}

	public void addQuestion(MultipleChoiceQuestion userQuestion)
	{
		qArray = Arrays.copyOf(qArray, ++this.qAmt);
		qArray[this.qAmt-1] = userQuestion.clone();
	}	

	@Override
	public String toString()
	{
		String sRet = "";
		for (Object x : qArray)
		{
			sRet += x.toString()+"\n";
		}
		return sRet;
	}

	public void save()
	{
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(qName)))
	{
		int y = 1;
      		for (Question x : qArray)
		{
		bw.write(y+") "+x.askQuestion()+"\n");
		}
	}
	catch (IOException ioe)
	{
     	ioe.printStackTrace();
	}
	}
	
	public void quizStart()
	{
		System.out.println("Quiz Start:");
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < this.qAmt; i++)
		{
			System.out.println("Question: " + qArray[i].toString());
			System.out.print("Answer: ");
			if (qArray[i].check(input.nextLine()))
			{
				System.out.println(qArray[i].getAnswer());
				System.out.println("Correct!");
			}
			else
			{
				System.out.println(qArray[i].getAnswer());
				System.out.println("Wrong!");
			}
		}
		this.save();
	}
}