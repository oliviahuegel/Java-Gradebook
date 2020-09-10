//I pledge my Honor that I have not cheated, and will not cheat, on this test. Olivia Huegel

//THIS DRIVER DISPLAYS THE POSITIONS OF THE BEST AND WORST GRADES, RATHER THAN
//THE GRADES THEMSELVES

import java.util.Scanner;
public class LabExamDriver
{
   public static void main (String[] args)
   {
      //Local Array (accepts three scores for each student)
      double[] ReadScores1 = new double[3];
      double[] ReadScores2 = new double[3];
      double[] ReadScores3 = new double[3];
      
      //Three objects that correspond to the three students
      LabExam Allen = new LabExam(ReadScores1);
      LabExam Bob = new LabExam(ReadScores2);
      LabExam Nicole = new LabExam(ReadScores3);
      
      Scanner scan = new Scanner (System.in);  
      
      System.out.print("\nPlease enter exam scores for Allen: ");
      //Scan the Array
      for (int i = 0; i < 3; i++)
         {
            ReadScores1[i] = scan.nextDouble();
         }

      
      
      System.out.print("Please enter exam scores for Bob: ");
      //Scan the array
      for (int i = 0; i < 3; i++){
            ReadScores2[i] = scan.nextDouble();
         }

      
      System.out.print("Please enter exam scores for Nicole: ");
      //Scan the array
      for (int i = 0; i < 3; i++){
            ReadScores3[i] = scan.nextDouble();
         }

      //Test the accessor (from LabExam Class)
      System.out.print("\nHere are the values entered for all three students: " +
                          "\nAllen: ");                     
      Allen.getScores(ReadScores1);                                       
      System.out.print("\nBob: ");
      Bob.getScores(ReadScores2);
      System.out.print("\nNicole: ");
      Nicole.getScores(ReadScores3);
      
      //Test the average (from LabExam Class)
      System.out.print("\n\nHere are the averages for each student: ");
      System.out.print("\nAllen: "); 
      Allen.avgScores(ReadScores1);
      System.out.print("Bob: ");
      Bob.avgScores(ReadScores2);
      System.out.print("Nicole: ");
      Nicole.avgScores(ReadScores3);
                                  
      /*
      //Test the highest (from LabExam Class)
      System.out.println("Here are the best scores for each student: " +
                         "\nAllen: " + Allen.getHighestValue() + "\nBob: " + Bob.getHighestValue +
                         "\nNicole: " + Nicole.getHighestValue());
      
      //Test the lowest (from LabExam Class)
      System.out.println("Here are the worst scores for each student: " +
                         "\nAllen: " + Allen.getLowestValue() + "\nBob: " + Bob.getLowestValue() +
                         "\nNicole: " + Nicole.getLowestValue() );*/
                         
                         //Get highest positions
                         System.out.print("\nHere are the positions of the best scores for each student: ");
                         System.out.print("\nAllen: ");
                         Allen.highestPosition(ReadScores1);
                         System.out.print("\nBob: ");
                         Bob.highestPosition(ReadScores2);
                         System.out.print("\nNicole: ");
                         Nicole.highestPosition(ReadScores3);
                         
                         //Get lowest positions
                         System.out.print("\n\nHere are the positions of the worst scores for each student: ");
                         System.out.print("\nAllen: ");
                         Allen.lowestPosition(ReadScores1);
                         System.out.print("\nBob: ");
                         Bob.lowestPosition(ReadScores2);
                         System.out.print("\nNicole: ");
                         Nicole.lowestPosition(ReadScores3);              
   }
}