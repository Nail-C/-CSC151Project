public class Policy
{
   /*
      Declared variables
   */
   private int pnum;
   private String provider;
   private String Fname;
   private String Lname;
   private int age;
   private String Status;
   private double Height;
   private double Weight;
   
   public Policy()///No arg constructor for Policy
   {
      pnum = 0;
      provider = "";
      Fname = "";
      Lname = "";
      age = 0;
      Status = "";
      Height = 0;
      Weight = 0;
   }
   
   //Arg accepting constructor
   public Policy(int num, String P, String F, String L, int A, String S, double H, double W)
   {
      pnum = num;
      provider = P;
      Fname = F;
      Lname = L;
      age = A;
      Status = S;
      Height = H;
      Weight = W;
   }
   
    ////Set methods //
    //sets Policy number 
   public void setPnum(int num)
   {
      pnum = num;
   }
   //sets Provider
   public void setProvider(String P)
   {
      provider = P;
   }
   //sets First name
   public void setFname(String F)
   {
      Fname = F;
   }
   //set Last name
   public void setLname(String L)
   {
      Lname = L;
   }
   //sets Age
   public void setAge(int A)
   {
      age = A;
   }
   //sets Smoking Status
   public void setStatus(String S)
   {
      Status = S;
   }
   //sets Height
   public void setHeight(double H)
   {
      Height = H;
   }
   //sets Weight
   public void setWeight(double W)
   {
      Weight = W;
   }

   
   ////////Getter methods
   //gets Policy number
   public int getPnum()
   {
      return pnum;
   }
   //gets Provider
   public String getProvider()
   {
      return provider;
   }
   //get First Name
   public String getFname()
   {
      return Fname;
   }
   //get Last name
   public String getLname()
   {
      return Lname;
   }
   //get Age
   public int getAge()
   {
      return age;
   }
   //get Smoking status
   public String getStatus()
   {
      return Status;
   }
   //get Height
   public double getHeight()
   {
      return Height;
   }
   //get Weight
   public double getWeight()
   {
      return Weight;
   }

     ///calc methods
   
   public double getBMI()////GetBMI method calculates BMI from user input and returns it
   {
      final int BMICALC = 703; //this constant unit is used in calculating BMI
       
      /*
      Formula for BMI
      (Policyholder’s Weight * 703 ) / (Policyholder’s Height2 )
      */
      
      return (Weight * BMICALC) / (Height * Height); //returns BMI
   }
   
   public double getPrice()//GetPrice() method calculates price from user input and returns it
   {
      
      final int BASE_FEE = 600;//base fee for all insurance policy constant
      final int MAX_AGE = 50;//unit used to compare ages and determine fees
      final int SMOKER_FEE = 100;///if user is a smoker there is a 100 dollar fee
      final int BMI_LIMIT = 35;
      
      double endprice = BASE_FEE;
      
      if(age > MAX_AGE)
         endprice += 75;
      if(Status.equals("smoker"))
         endprice += SMOKER_FEE;
      if(getBMI() > BMI_LIMIT)
         endprice += ((getBMI() - BMI_LIMIT) * 20); 
      
      return endprice;
      
   }
   
   ///Display method outputs user data
   public void display()
   {
      System.out.println("\nPolicy Number: " + getPnum() +
                         "\nProvider Name: " + getProvider() +
                         "\nPolicyholder's First Name: " + getFname() +
                         "\nPolicyholder's Last Name: " + getLname() +
                         "\nPolicyholder's Smoking Status (smoker/non-smoker): " + getStatus());
      System.out.printf("Policyholder's Height: %,.1f inches\n", getHeight());
      System.out.printf("Policyholder's Weight: %,.1f pounds\n", getWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n", getBMI());
      System.out.printf("Policy Price: $%,.2f\n", getPrice());
   }
   
   

}