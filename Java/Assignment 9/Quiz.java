import java.util.Arrays; 
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Quiz {

  private ArrayList<Question> questions = new ArrayList<>();
  private String filename;

  public Quiz(int maxQuestions, String filename){
    this.filename = filename;
  }
  public void addQuestion(Question q){
    questions.add(q);
  }
  @Override
  public String toString(){
    String result = "";
    for(int i=0; i<questions.size(); i++){
      result+=(questions.get(i) + "\n");
    }
    return result;
  }
  public void save(){
    try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
    	for(int i=0; i<questions.size(); i++){
		writer.write((i+1) + ") ");
		writer.write(questions.get(i).toString());
		writer.write("\n\n");
	}		
    }catch(IOException ioe){
      ioe.printStackTrace();
    }
  }
}