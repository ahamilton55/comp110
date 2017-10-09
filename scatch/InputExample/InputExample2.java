import java.util.Scanner;

public class InputExample2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String answer = "yes";


        while(answer.equals("yes")) {
            System.out.print("Enter a value: ");
            answer = in.next();

            if (answer.equals("yes") || answer.equals("no")) {
                System.out.println("Hello");
            } else {
                System.out.println("You entered an invalid answer!");
                System.exit(1);
            }

        }
    }
}