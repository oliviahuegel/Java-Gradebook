//I pledge my Honor that I have not cheated, and will not cheat, on this test. Olivia Huegel
public class LabExam
{
   //Array
   private double[] scores;
   
   //Constructor
   public LabExam (double [] ReadScores)
   {
      scores = new double[ReadScores.length];
      for(int i = 0; i < scores.length; i++)
      System.out.print(" ");  
   }
   
   //Accessor
   public void getScores(double[] scores)
   {
      for(int i = 0; i < scores.length; i++)
      System.out.print(scores[i] + " ");
   }
   
   //Calculations
   //Average
   public void avgScores(double[] scores)
   {
      double total = 0.0;
      
      for(int i = 0; i < scores.length; i++)
      {
         total += scores[i];
      }
      System.out.println(total/3);
   }
 
   /*
   //Returns highest score position (start to use j)
   public double getHighestPosition()
   {
      int highest = 0;
      for(int j = 1; j < scores.length; j++)
      {
         if (scores[j] > scores[highest])
         highest = j;
      }
      return highest;
   }
   
   //Returns highest score value
   public void gethighestValue(double[] scores)
   {
      double highest;
      highest = getHighestPosition();
      System.out.print(scores[highest]);
   }
   
   
   //Returns lowest score position
   public double getLowestPosition()
   {
      double lowest = 0.0;
      for(int j = 0; j < scores.length; j++)
      {
         if (scores[j] < scores[lowest])
         lowest = j;
      }
      return lowest;
   } 
   
   //Returns lowest score value
   public void getLowestValue(double[] scores)
   {
      double lowest;
      lowest = getLowestPosition();
      System.out.print(scores[lowest]); 
   }*/



//Get highest position

public void highestPosition(double[] scores)
{
   int high = 0;
   for(int i = 1; i < scores.length; i++)
   {
      if (scores[i] > scores[high])
         high = i;
   }
   System.out.print(high);
}

   
/*
//gets highest value
public void highestValue(double[] scores)
   { 
      System.out.print(scores[highestPosition()]);
   }*/

//gets lowest position
public void lowestPosition(double[] scores)
{
   int low = 0;
   for(int i = 1; i < scores.length; i++)
   {
      if (scores[i] < scores[low])
         low = i;
   }
   System.out.print(low);
}

/*
//gets lowest value
public void LowestValue()
   {
      System.out.print(scores[lowestPosition()])
   }*/
}

