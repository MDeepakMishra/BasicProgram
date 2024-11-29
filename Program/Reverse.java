class Reverse {
  public static void main(String[] args) {
      System.out.println("BEFORE REVERSE");
      int n = 1234, rem, rev = 0;
      System.out.println(n);

      // Reverse logic
      while (n > 0) {
          rem = n % 10;
          rev = rev * 10 + rem;
          n = n / 10;
      }

      // Output after reversing
      System.out.println("AFTER REVERSE");
      System.out.println(rev);
  }
}
