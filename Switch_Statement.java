import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        System.out.println("********** Restaurant menu list **********");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        if(choice == 0){
            System.out.println("Don't want to order");
        }
        else {
            switch (choice) {
                case 1:
                    System.out.println("Idli");
                    break;

                case 2:
                    System.out.println("Wada");
                    break;

                case 3:
                    System.out.println("Dosa");
                    break;

                default:
                    System.out.println("I want drinks");

            }

        }
    }
}
