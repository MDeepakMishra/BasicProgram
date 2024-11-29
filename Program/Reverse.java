 class Reverse {
   public static void main(String[] args) {
    System.out.println("BEFORE REVERSE");
    int n = 1234 , rem , rev = 0 ;
    System.out.println(n);

    while(n >= 0)
    {
        rem = n % 10 ;
        rev = rev * 10 + rem ;
        n = n / 10 ;
    }
   }   
  System.out.println("After REVERSE");
  // System.out.println(rev);
}
