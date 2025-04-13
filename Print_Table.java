import java.util.Scanner;

public class Print_Table{
    public static void main(String[] args) {
        System.out.println("ENTER NUM TO DISPLAY ITS TBLE");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Tab = n ;
        for(int i = 1 ; i <= 10 ; i++){
        Tab = n * i; 
        System.out.print(Tab +" ");  
        }
        
    }
}