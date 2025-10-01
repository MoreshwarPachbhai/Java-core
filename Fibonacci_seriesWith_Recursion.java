import java.util.Scanner;

public class Fibonacci_seriesWith_Recursion {

     public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }

        else if(n == 1){
            return 1;
        }

        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find fibonacci series: ");
        int num = sc.nextInt();

        System.out.print("The series is: ");
        for(int i=0; i <= num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
