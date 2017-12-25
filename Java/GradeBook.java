// Gradebook Class
// Class that holds the amount of students enrolled in class. It also holds the amount of quizzes
// and the grades recieved for the quizzes.
// currently the quiz amount is hard coded at 5 in qAmt.

import java.util.Arrays;

public class GradeBook{
	public enum state {FULL, AVAILABLE}
	private state status;
	private int occupiedSeats;
	private int maxSeats;
	private String[] enrolledStudents;
	private int[][] qGrades;
	private int qAmt = 5;
	GradeBook(int maxslots)
	{
		maxSeats = maxslots;
		occupiedSeats = 0;
		status = state.AVAILABLE;
		enrolledStudents = new String[maxslots];
		qGrades = new int[maxslots][qAmt];
	}
	public double getStudentAverage(int studentID)
	{
		double sum = 0;
		for (int quiz : qGrades[studentID])
		{
			sum+= quiz;
		}
		return sum/qAmt;
	}
	public void assignGrade(int studentID, int quizNum, int quizScore)
	{
		qGrades[studentID][quizNum] = quizScore;
	}
	public void printGrades()
	{
		for (int i = 0; i < occupiedSeats; i++)
		{
			System.out.println("Name: " + enrolledStudents[i]);
			System.out.println("ID: " + i);
			for (int o = 0; o<qAmt; o++)
			{
			System.out.println("Q[" + (o+1) + "]: " + qGrades[i][o]);
			}
			System.out.println("Avg: " + getStudentAverage(i) + "\n");
		}
	}

	public boolean enrollStudent(String name)
	{
		for (int i = occupiedSeats; i<maxSeats; i++)
		{
			if (enrolledStudents[i] == null)
			{
				enrolledStudents[i] = name;
				occupiedSeats++;
				return true;
			}
		}
		status = state.FULL;
		return false;
	}

	public void sortStudents()
	{
	Arrays.sort(enrolledStudents, String.CASE_INSENSITIVE_ORDER);
	}	

	public int getStudentID(String name) // using iterations
	{
		for (int i = 0; i<occupiedSeats; i++)
		{
			if (enrolledStudents[i].equals(name))
			{
				return i;
			}
		}
		return -1;
	}
	
	public int getStudentID2(String name) // using binary search
	{
		return Arrays.binarySearch(enrolledStudents, name);
	}
	
	public int getMaxSeats()
	{
		return maxSeats;
	}
	public int getUnoccupiedSeats()
	{
		return maxSeats-occupiedSeats;
	}
}