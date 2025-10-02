import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor_Game {

    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    String [] choices = {"Rock","Paper","Scissor"};

    public static void main(String[] args) {

        Rock_paper_scissor_Game gm = new Rock_paper_scissor_Game();
        gm.game();
    }

    // Game logic
    public  void game(){

        while(true) {

            System.out.println("Choose: 0 for Rock, 1 for Paper, 2 for Scissor");
            int guess = sc.nextInt();
            System.out.println("You choose: "+choices[guess]);

            int computer = rand.nextInt(2);
            System.out.println("Computer choose: "+choices[computer]);

            if (guess == computer) {
                System.out.println("You wins!");
                break;
            } else {
                System.out.println("you lose!");
            }
        }

    }
}
