import java.util.*;
public class Lab2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String answer1, answer2; // to store the string about continuing program
        double x; // to store the value of x
        double result; // to store the result
        double coefficient[]; // array of coefficients. first index have higher power of coefficient and so on,
        do{
            int degree; // to store the degree of polynomial expression
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Degree of Polynomial: ");
            degree = input.nextInt();
            coefficient = new double[degree+1];
            /* * This loop takes the input of coefficient. * */
            for(int i = 0 ; i < coefficient.length ; i++){
                System.out.println("Enter coefficient "+(coefficient.length-(i+1))+":");
                coefficient[i] = input.nextDouble();
            }
            do{
                System.out.println("Enter x : ");
                x = input.nextDouble();
                result=0; // initializing result to zero
                /* * This loop evaluates the result. * */
                for(int i = 0; i < coefficient.length ; i++){
                    result+=(coefficient[i]*Math.pow(x,(coefficient.length-(i+1)) ));
                }
                System.out.println("Value is "+result);
                System.out.println("Another x?(yes/no)");
                answer1 = input.next();
            } while(answer1.matches("yes"));
            System.out.print("Another Polynomial?(yes/no)");
            answer2 = input.next();
        } while(answer2.matches("yes"));
        System.out.println("Thank you!");
    }
}