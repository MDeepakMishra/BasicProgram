class Armstrong {
    public static void main(String[] args) {
        System.out.println("BEFORE LOGIC");
        int n = 153, rem, Arm = 0;
        int temp = n ;
        System.out.println(n);
  
        // Reverse logic
        while (n > 0) {
            rem = n % 10;
            Arm = Arm + rem * rem * rem ;
            n = n / 10;
        }
  
        // Output after reversing
        System.out.println("AFTER LOGIC");
        System.out.println(Arm);
        if(Arm == temp)
        {
            System.out.println("THIS IS A ARMSTRONG NUMBER");
        }
        else{
            System.out.println("THIS IS NOT A ARMSTRONG NUMBER");
        }
    }
  }
  