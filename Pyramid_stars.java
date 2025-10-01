public class Pyramid_stars {

//            *
//           ***
//          *****
//         *******
//        *********

    public static void main(String[] args) {
        // printing rows
        for(int i = 1; i <= 5; i++) {

            // printing spaces
            for(int k = 1; k <= (2*5-i); k++){
                System.out.print(" ");
            }


            // printing stars
            for (int j = 1; j <= (2*i - 1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
