public class Policy
{
   /*
      Declared variables
      @param pnum policy number
      @param provider policy provider
      @param Fname first name
      @param Lname last name
      @param age Age of policy holder
      @param Status Smoking status of policy holder
      @param Height Height of policy holder
      
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
    //@param num sets the pnum variable 
   public void setPnum(int num)
   {
      pnum = num;
   }
   //sets Provider
   //@param P sets provider
   public void setProvider(String P)
   {
      provider = P;
   }
   //sets First name
   //@param F sets Fname
   public void setFname(String F)
   {
      Fname = F;
   }
   //set Last name
   //@param L sets Lname
   public void setLname(String L)
   {
      Lname = L;
   }
   //sets Age
   //@param A sets age
   public void setAge(int A)
   {
      age = A;
   }
   //sets Smoking Status
   //@param S sets Smoking Status
   public void setStatus(String S)
   {
      Status = S;
   }
   //sets Height
   //@param H sets Height
   public void setHeight(double H)
   {
      Height = H;
   }
   //sets Weight
   //@param W sets Weight
   public void setWeight(double W)
   {
      Weight = W;
   }

   
   ////////Getter methods
   //gets Policy number
   //@return pnum returns Policy number 
   public int getPnum()
   {
      return pnum;
   }
   //gets Provider
   //@return provider returns policy provider
   public String getProvider()
   {
      return provider;
   }
   //get First Name
   //@return Fname returns Fname
   public String getFname()
   {
      return Fname;
   }
   //get Last name
   //@return Lname returns Lname
   public String getLname()
   {
      return Lname;
   }
   //get Age
   //@return age returns age of policy holder
   public int getAge()
   {
      return age;
   }
   //get Smoking status
   //@return Status returns the policy holders smoking status (smoker or non-smoker)
   public String getStatus()
   {
      return Status;
   }
   //get Height
   //@return Height returns policy holders height
   public double getHeight()
   {
      return Height;
   }
   //get Weight
   //@return Weight returns Weight of the policy holder
   public double getWeight()
   {
      return Weight;
   }

     ///calc methods
   //@return BMI, returns the BMI of the policy holder useing the equation below
   public double getBMI()////GetBMI method calculates BMI from user input and returns it
   {
      final int BMICALC = 703; //this constant unit is used in calculating BMI
       
      /*
      Formula for BMI
      (Policyholder’s Weight * 703 ) / (Policyholder’s Height2 )
      */
      
      return (Weight * BMICALC) / (Height * Height); //returns BMI
   }
   
   //@return endprice a double that is the price for the policy
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
   
   //@return
   ///Display method outputs user data
   public void display()
   {
      System.out.println("\nPolicy Number: " + pnum +
                         "\nProvider Name: " + provider +
                         "\nPolicyholder's First Name: " + Fname +
                         "\nPolicyholder's Last Name: " + Lname +
                         "\nPolicyholder's Age: " + age +
                         "\nPolicyholder's Smoking Status (smoker/non-smoker): " + Status);
      System.out.printf("Policyholder's Height: %,.1f inches\n", Height);
      System.out.printf("Policyholder's Weight: %,.1f pounds\n", Weight);
      System.out.printf("Policyholder's BMI: %,.2f\n", getBMI());
      System.out.printf("Policy Price: $%,.2f\n", getPrice());
   }
   
   

}