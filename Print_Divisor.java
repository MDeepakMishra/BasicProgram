import java.util.Scanner;
class Print_Divisor {

    public static void main(String[] args) {
        System.out.println("Enter num to print its all divisor ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("all Divisors of number");
        for(int i = 1 ; i <=n ; i++){
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}