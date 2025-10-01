import java.util.Scanner;

public class If_Else {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if(age < 0){
            System.out.println("The human doesn't exist ");
        }

        else if(age < 18){
            System.out.println("You are a teenager");
        }

        else if(18 < age && age < 100){
            System.out.println("You are an adult");
        }

        else {
            System.out.println("You are Dead!");
        }
    }
}
