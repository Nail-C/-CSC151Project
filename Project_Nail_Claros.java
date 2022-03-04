import java.util.*;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Project_Nail_Claros
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("PolicyInformation.txt");//File is being called to be read
      Scanner inputFile = new Scanner(file);//declare inputFile for user input from the file above
      String PName, PF, PL, Status = "";// policy number, first name, lastname and smoking status
      int pnum, age = 0;//ploicy number and age
      double Height, Weight = 0;//Height and weight
      int smokerC = 0, nonsmoker = 0;
      
      ArrayList<Policy> List = new ArrayList<Policy>();//ArrayList has the policy class type and holds all info
      
      while(inputFile.hasNext())
      {
      //user inputs policy number from file
      pnum = inputFile.nextInt();
      ///user inputs their provider from file
      inputFile.nextLine();
      PName = inputFile.nextLine();
      //user's 1st name from file
      PF = inputFile.nextLine();
      //user's last name from file
      PL = inputFile.nextLine();
      //user age from file
      age = inputFile.nextInt();
      //user's smoking status from file
      inputFile.nextLine();
      Status = inputFile.nextLine();
      ///user height from file
      Height = inputFile.nextDouble();
      //user weightfrom file
      Weight = inputFile.nextDouble();
      //calls the policy class, pol is the instance
      //and inputs user input 
      Policy pol = new Policy(pnum, PName, PF, PL, age, Status, Height, Weight);
      List.add(pol);// the pol instnace is then added to the ArrayList
      //displays all user inputs and calculations
      
      //determines if the amount of smokers or non smokers increases
      if(Status.equals("smoker"))
         smokerC += 1;//if a smoker is identified, the smokerC varaible will go up by one
      else
         nonsmoker += 1;//if a non-smoker is identified, the nonsmoker varaible will go up by one
         
       if(inputFile.hasNext())//skips a line
         inputFile.nextLine();
       if(inputFile.hasNext())//skips a line
         inputFile.nextLine();  
      
      }//end of while loop
      inputFile.close();//closes the file
      
      ///displays all info from the txt file.
      for(int i = 0; i < List.size(); i++)
      {
         List.get(i).display();
      }
      
      
      //Smoker and nonsmoker count
      System.out.println("\nThe number of policies with a smoker is: " + smokerC);//prints quantity of smokers
      System.out.println("The number of policies with a non-smoker is: " + nonsmoker);//prints quantity of non-smokers

      
   }
}