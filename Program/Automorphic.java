 class Automorphic {
     public static void main(String[] args) {
        System.out.println("NUMBER TO CHECK AUTOMORPHIC NUMBER");
        int n = 25 , sqr;
        int  temp = n;
        sqr = n  * n ;
        System.out.println(sqr);
        System.out.println();
      int rem  = sqr % 100 ;
      System.out.println(rem);
    if(rem  ==temp)
     {
        System.out.println("AUTOMORPHIC NUMBER");
     }
     else
     {
        System.out.println("NOT A AUTOMORPHIC NUMBER");
     }
     }   
}
