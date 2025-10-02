import java.util.Scanner;

public class ArrayWithWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of array: ");
        int num = sc.nextInt();

        int [] arr = new int[num];
        System.out.println("Enter "+num+" elements: ");

        for(int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The array is :");
        for(int i = 0; i < num; i++){

            System.out.print(arr[i]+" ");
        }




    }
}
