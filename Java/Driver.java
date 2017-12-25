// Driver
//Implement a Driver class that (1) creates a String array of possible answers,
//(2) creates a MultipleChoiceQuestion object using the array of possible answers, 
//(3) display the multiple choice question on screen, 
//(4) ask the user to input their answer, and 
//(5) informs the user whether their answer is correct or incorrect. 
//Remember that we also need to clone the possibleAnswer array in Driver to avoid memory referencing issues. 

import java.util.Scanner;

public class Driver{

	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		String question = "Q : Answer is a2";
		String question2 = "Q : Answer is a2[2]";
		String answer = "2) a2";
		String answer2 = "a2";
		String[] possibleAnswers = {"1) a1", "2) a2", "3) a3", "4) a4"};
		
		MultipleChoiceQuestion value = new MultipleChoiceQuestion(question2,answer,possibleAnswers.clone());
		MultipleChoiceQuestion value3 = new MultipleChoiceQuestion(question2,answer,possibleAnswers.clone());
		Question value2 = new Question(question, answer2);

		Quiz iQuiz = new Quiz(value,"quiz.txt");
		iQuiz.addQuestion(value2);
		iQuiz.addQuestion(value3);

		System.out.println(iQuiz.toString());

		iQuiz.quizStart();
	}

}