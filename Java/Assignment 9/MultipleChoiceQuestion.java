import java.util.Arrays; 
import java.util.ArrayList;

public class MultipleChoiceQuestion extends Question{
  private ArrayList<String> possibleAnswers = new ArrayList<>();
  public MultipleChoiceQuestion(String question, String answer, ArrayList<String> possibleAnswers){
    super(question, answer);
    this.possibleAnswers = possibleAnswers;
  }
  @Override
  public String askQuestion(){
    String result = super.askQuestion() + "\n";
    for(int i=0; i<possibleAnswers.size(); i++){
      result += ((i+1) + ". " + possibleAnswers.get(i) + "\n");
    }
    return result;
  }
  public void setPossibleAnswers(ArrayList<String> possibleAnswers){
    this.possibleAnswers = possibleAnswers;
  }
  public ArrayList<String> getPossibleAnswers(){
    return possibleAnswers;
  }
  @Override
  public MultipleChoiceQuestion clone(){
    MultipleChoiceQuestion temp = new MultipleChoiceQuestion(super.askQuestion(), getAnswer(), cloneList());
   return temp;
  }
  @Override
  public String toString(){
    return askQuestion();
  }

  public ArrayList<String> cloneList() {
    ArrayList<String> y = new ArrayList<String>();
    for (String x : possibleAnswers) y.add(x);
    return y;
  }
}