package BasicProgram;
class Fibonacci {
  public static void main(String[] args) {
    System.out.println("ENTER THE NUMBER");
    int n = 10;
    int n1 = 0 , n2 = 1 , n3;
    System.out.print(n1 + " " + n2 + " ");
    for( int i = 0 ; i <= n ; i++)
    {
      n3 = n1 + n2 ;
      System.out.print(n3 +" ");
      n1 = n2 ;
      n2 = n3 ;
    }
   }    
}
