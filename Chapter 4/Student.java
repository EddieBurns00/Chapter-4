// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    private String name;
    private double score1;
    private double score2;
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String nm)
    {
        this.name = nm;

    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Enter " + name + "'s score for test 1");
        this.score1 = scan.nextDouble();
        System.out.println("Enter " + name + "'s score for test 2");
        this.score2 = scan2.nextDouble();
    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    public double getAverage() 
    {
        return (this.score1 + this.score2)/2;
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    public String getName()
    {
        return this.name;
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    public void printName()
    {
        System.out.println(this.name);
    }
}
