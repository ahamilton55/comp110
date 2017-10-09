import java.util.Scanner;
import java.util.InputMismatchException;

public class OddIntegers {
    public static void main(String[] args) {
        int n = -1;

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of odd integers to print: ");
        try {
            n = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer");
            System.exit(1);
        }

        if (n <= 0) {
            System.out.println("Please enter a number greater than 0");
            System.exit(1);
        }

        for(int i = 1; i <= n; i++) {
            System.out.println((2*i)-1);
        }
    }
}