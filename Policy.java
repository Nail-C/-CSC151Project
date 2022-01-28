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
   public void setPnum(int num)
   {
      pnum = num;
   }
   public void setProvider(String P)
   {
      provider = P;
   }
   public void setFname(String F)
   {
      Fname = F;
   }
   public void set(String L)
   {
      Lname = L;
   }
   public void set(int A)
   {
      age = A;
   }
   public void setStatus(String S)
   {
      Status = S;
   }
   public void setHeight(double H)
   {
      Height = H;
   }
   public void setWeight(double W)
   {
      Weight = W;
   }

   
   ////////Getter methods
   
   public int getPnum()
   {
      return pnum;
   }
   
   public String getProvider()
   {
      return provider;
   }
   
   public String getFname()
   {
      return Fname;
   }
   
   public String getLname()
   {
      return Lname;
   }
   
   public int getAge()
   {
      return age;
   }
 
   public String getStatus()
   {
      return Status;
   }
   
   public double getHeight()
   {
      return Height;
   }
   
   public double getWeight()
   {
      return Weight;
   }

     ///calc methods
   
   public double getBMI()////GetBMI method calculates BMI from user input and returns it
   {
      final int BMICALC = 703; //this constant unit is used in calculating BMI
      double BMI = (getWeight() * BMICALC) / (getHeight() * getHeight());
      
      /*
      Formula for BMI
      (Policyholder’s Weight * 703 ) / (Policyholder’s Height2 )
      */
      
      return BMI; //returns BMI
   }
   
   public double getPrice()//GetPrice() method calculates price from user input and returns it
   {
      
      final int BASE_FEE = 600;//base fee for all insurance policy constant
      final int MAX_AGE = 50;//unit used to compare ages and determine fees
      final int SMOKER_FEE = 100;///if user is a smoker there is a 100 dollar fee
      final int BMI_LIMIT = 35;
      
      double endprice = BASE_FEE;
      
      if(getAge() > MAX_AGE)
      {
         endprice += 75;
      }
      if(getStatus().equals("smoker"))
      {
         endprice += SMOKER_FEE;
      }
      if(getBMI() > BMI_LIMIT)
      {
         endprice += ((getBMI() - BMI_LIMIT) * 20); 
      }
      
      return endprice;
      
   }
   
   ///Display method outputs user data
   public void display()
   {
      System.out.println("\nPolicy Number: " + getPnum() +
                         "\nProvider Name: " + getProvider() +
                         "\nPolicyholder's First Name: " + getFname() +
                         "\nPolicyholder's Last Name: " + getLname() +
                         "\nPolicyholder's Smoking Status: " + getStatus());
      System.out.printf("Policyholder's Height: %,.1f inches\n", getHeight());
      System.out.printf("Policyholder's Weight: %,.1f pounds\n", getWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n", getBMI());
      System.out.printf("Policy Price: $%,.2f\n", getPrice());
   }
   
   

}