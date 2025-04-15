package BasicProgram;
 class Prime_Num {
   public static void main(String[] args) {
    System.out.println("Checking for the prime number");
    int n = 18,  count = 0;
  /*   if(n == 0 && n ==1)
    {
       System.out.println("NOT A PRIME NUMBER");
    }*/
    for( int i = 1 ; i <= n ; i++)
    {
      if(n % i == 0)
      {
        count++;
      }
        
    }
    if(count == 2)
    {
     
      System.out.println("THIS S A PRIME NUMBER");
    }
    else
    {
      System.out.println("THIS IS NOT A PRIME NUMBER");
    }
      
   }    
}
