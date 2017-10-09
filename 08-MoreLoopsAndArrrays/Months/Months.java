import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.*;
import java.time.format.*;
import java.util.Locale;

public class Months {
    public static void main(String[] args) {
        int n = -1;
        Scanner in = new Scanner(System.in);

        String[] months = new String[12];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";

        System.out.print("Please enter a month number: ");
        try {
            n = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer");
            System.exit(2);
        }

        if (n < 1 || n > months.length) {
            System.out.println("Please enter a month number between 1 and 12");
            System.exit(1);
        }

        System.out.println("The month is " + months[n-1]);
        YearMonth date = YearMonth.of(2017, n);
        System.out.println(date.getMonth().getDisplayName(TextStyle.FULL, Locale.US));
    }
}