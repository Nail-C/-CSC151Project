public class Policy
{
   /*
      Declared variables
      @param PoliciesMade - this is a static integer that keeps track of policies made. 
      @param pnum policy number
      @param provider policy provider
      @param holder is a PolicyHolder object      
   */
   private static int PoliciesMade = 0;
   private int pnum;
   private String provider;
   private PolicyHolder holder;
   
   public Policy()///No arg constructor for Policy
   {
      pnum = 0;
      provider = "";
      PolicyHolder holder;
   }
   
   
   //Arg accepting constructor
   public Policy(int num, String P, PolicyHolder person)
   {
      pnum = num;
      provider = P;
      holder = new PolicyHolder(person);
      PoliciesMade++;
   }
   
    ////Set methods /////////////////////////////////////
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
   
   ////////Getter methods vvvvvvvvvv ////////////////////////
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
   
   //gets the Amount of Policies made
   //@return PoliciesMade returns the policies made
   public int getPM()
   {
      return PoliciesMade;
   }
   
   //gets a deep copy of a PolicyHolder ad returns it 
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(holder);
   }
   
   //@return
   ///Display method outputs user data
   public String toString()
   {
             return String.format("Policy Number: " + pnum +
             "\nProvider Name: " + provider + holder);            
   }
   
}