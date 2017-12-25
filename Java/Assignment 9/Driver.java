import java.util.Arrays; 
import java.util.ArrayList;

public class Driver {
  public static void main(String[] args){
    Quiz quiz1 = new Quiz(10, "quiz.txt");
    Question q = new Question("How many days are there in a week?", "7");
    quiz1.addQuestion(q.clone());
    ArrayList<String> possibleAnswers = new ArrayList<>(Arrays.asList("March", "Autumn", "Monday", "2017"));
    q = new MultipleChoiceQuestion("Which among the following is the name of a day in a week?", "3", possibleAnswers);
    quiz1.addQuestion(q.clone());
    System.out.println(quiz1);
    quiz1.save();
  }
}