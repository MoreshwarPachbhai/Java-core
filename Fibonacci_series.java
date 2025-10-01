import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find fibonacci series : ");
        int num = sc.nextInt();

        int firstnum = 0;
        int secondnum = 1;

        System.out.print("The series is: "+firstnum + " " + secondnum + " ");

        // Starting the loop from 2 because the first and second number is already printed
        for(int i=2; i < num; i++) {
            int result = firstnum + secondnum;
            System.out.print(result+" ");
                firstnum  = secondnum;
                secondnum = result;
            }
        }
    }

