public class PolicyHolder
{
   /*
      This class is an aggregate class to Policy
      
      @param Fname first name
      @param Lname last name
      @param age Age of policy holder
      @param Status Smoking status of policy holder
      @param Height Height of policy holder
   */
   
   private String Fname;
   private String Lname;
   private int age;
   private String Status;
   private double Height;
   private double Weight;
   
   public PolicyHolder()///No arg constructor for Policy Holder
   {
      Fname = "";
      Lname = "";
      age = 0;
      Status = "";
      Height = 0;
      Weight = 0;
   }
   
   //Arg accepting constructor
   public PolicyHolder(String F, String L, int A, String S, double H, double W)
   {
      Fname = F;
      Lname = L;
      age = A;
      Status = S;
      Height = H;
      Weight = W;
   }
   
   //to avoid security holes we make a copy constructor called clone
   //Clone will behave as a unique deep copy and not a shallow copy
    
   public PolicyHolder(PolicyHolder copy)
   {
      Fname = copy.Fname;
      Lname = copy.Lname;
      age = copy.age;
      Status = copy.Status;
      Height = copy.Height;
      Weight = copy.Weight;
   }
   
   ////////////////////////////setter methods vvv
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

   ////////////////////////////////Getter methods vvvv
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
   
   //The to Stirng method outputs all info
   public String toString()
   {
             return String.format("\nPolicyholder's First Name: " + Fname +
             "\nPolicyholder's Last Name: " + Lname +
             "\nPolicyholder's Age: " + age +
             "\nPolicyholder's Smoking Status (Y/N): " + Status +
             "\nPolicyholder's Height: %,.1f inches\n" +  
             "Policyholder's Weight: %,.1f pounds\n" + 
             "Policyholder's BMI: %,.2f\n" +
             "Policy Price: $%,.2f\n\n", Height, Weight, getBMI(), getPrice());
                         
   }
   
   
}