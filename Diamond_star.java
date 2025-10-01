public class Diamond_star {


//                *
//               ***
//              *****
//               ***
//                *


    public static void main(String[] args) {
        // printing rows
        for(int i = 1; i <= 3; i++){

            // printing upper spaces
            for(int k = 1; k <= 3-i ; k++){
                System.out.print(" ");
            }

            // printing upper stars
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // printing lower half
        for(int i = 2; i >= 1; i--){

            // printing lower spaces
            for(int k = 1; k <= 3-i ; k++){
                System.out.print(" ");
            }

            // printing lower stars
            for(int j = 1; j <= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
