import java.util.*;

public class Project_Nail_Claros
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String PName, PF, PL, Status = "";
      int pnum, age = 0;
      double Height, Weight = 0;
      
      System.out.print("Please enter the Policy Number: ");
      pnum = keyboard.nextInt();
      System.out.print("Please enter the Provider Name: ");
      keyboard.nextLine();
      PName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
      PF = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
      PL = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      keyboard.nextLine();
      Status = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      Height = keyboard.nextDouble();
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      Weight = keyboard.nextDouble();
      
      Policy pol = new Policy(pnum, PName, PF, PL, age, Status, Height, Weight);
      pol.display();
      
   }
}