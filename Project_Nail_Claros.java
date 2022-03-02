import java.util.*;

public class Project_Nail_Claros
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);//declare keyboard for user input
      String PName, PF, PL, Status = "";// policy number, first name, lastname and smoking status
      int pnum, age = 0;//ploicy number and age
      double Height, Weight = 0;//Height and weight
      
      System.out.print("Please enter the Policy Number: ");//user inputs policy number
      pnum = keyboard.nextInt();
      System.out.print("Please enter the Provider Name: ");///use inputs their provider
      keyboard.nextLine();
      PName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");//user's 1st name
      PF = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");//user's last name
      PL = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Age: ");//user age
      age = keyboard.nextInt();
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");//user's smoking status
      keyboard.nextLine();
      Status = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Height (in inches): ");//use height
      Height = keyboard.nextDouble();
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");//user weight
      Weight = keyboard.nextDouble();
      //calls the policy class, pol is the instance
      //and inputs user innput 
      Policy pol = new Policy(pnum, PName, PF, PL, age, Status, Height, Weight);
      //displays all user inputs and calculations
      pol.display();
      
   }
}